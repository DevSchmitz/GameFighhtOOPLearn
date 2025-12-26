abstract class Character(
    val name: String,
    val maxHealth: Int,
) {
    var weapon: Weapon? = null
        private set

    var inventory = mutableListOf<Loot>()

    var health: Int = maxHealth
        private set

    val isAlive: Boolean
        get() = health > 0

    fun attack (target:Character){
        if(!isAlive){
            println("Персонаж $name мертв")
            return
        }
        val damage = calculateDamage()
        println("$name атакует ${target.name} на $damage")
        target.takeDamage(damage)
        println("У ${target.name} осталось ${target.health} ")
    }

    abstract fun calculateDamage():Int

    open fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0) {
            health = 0
            println("$name погиб...")
        }
    }

    fun restoreHealth(amount: Int) {
        if (!isAlive) return

        val result = health + amount

        if (result > maxHealth) {
            health = maxHealth
            println("Здоровье $name полностью восстановлено ($health)")
        } else {
            health = result
            println("Здоровье $name восстановлено на $amount. Стало: $health")
        }
    }

    fun pickUpLoot(loot:Loot){
        when(loot){
            is Loot.Gold -> {
               inventory.add(loot)
               println("$name нашел ${loot.amount} золота")
            }
            is Loot.Item -> {
                inventory.add(loot)
                println("$name нашел ${loot.item} ")
            }
            is Loot.Empty -> {
               println("Пусто")
            }
        }
    }

    open fun equip(weapon: Weapon){
        this.weapon = weapon
        println("Персонаж: $name взял оружие: ${this.weapon!!.name}")
    }

    open fun informationOfPlayer(): String{
        return "Имя персонажа:$name Здоровье персонажа:$health "
    }
}