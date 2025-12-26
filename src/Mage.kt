import kotlin.random.Random

class Mage(name: String,
           maxHealth: Int = 80,
           maxPower: Int = 15):Character(name, maxHealth){

    val power: Int = maxPower
    override fun calculateDamage(): Int {
        val isCrit:Int = Random.nextInt(100)
        return if( isCrit < 30){
            println("ФАЕРБОЛ!")
            val weaponDamage = weapon?.damage ?: 0
             power * 2 + weaponDamage
        }else{
            val weaponDamage = weapon?.damage ?: 0
             power + weaponDamage
        }
    }

    override fun informationOfPlayer(): String{
        return super.informationOfPlayer() + "Максимально сили: $power"
    }
}