class Priest(name: String, maxHealth: Int = 60,
             maxPower: Int = 10,
             val maxHeal: Int = 20):Character(name, maxHealth),Healer{

    override fun heal(target: Character) {
        println("Священник $name исцелил ${target.name} на $maxHeal HP")
        target.restoreHealth(maxHeal)
    }
    val power: Int = maxPower
    override fun  calculateDamage():Int{
        val weaponDamage = weapon?.damage ?: 0
        return power + weaponDamage
    }
    override fun informationOfPlayer(): String{
        return super.informationOfPlayer() + "Максимально сили: $power" + " Лечит на $maxHeal HP"
    }
}