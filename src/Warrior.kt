class Warrior (name: String,
               maxHealth: Int = 100,
               maxPower: Int = 25):Character(name, maxHealth){

    val power: Int = maxPower
    override fun  calculateDamage():Int{
        val weaponDamage = weapon?.damage ?: 0
        return power + weaponDamage
    }
    override fun informationOfPlayer(): String{
        return super.informationOfPlayer() + "Максимально сили: $power"
    }
}