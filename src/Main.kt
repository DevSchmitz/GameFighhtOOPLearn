fun main() {
    val warrior = Warrior("Warrior")
    val mage = Mage("Mage")
    val priest = Priest("Priest")
    val sword = Weapon("Меч Тысячи Истин", WeaponType.SWORD, 20)
    val staff = Weapon("Древний Посох", WeaponType.STAFF, 10)
    val gold:Loot = Loot.Gold(45)
    val item:Loot = Loot.Item(sword)
    println("Персонаж:${warrior.informationOfPlayer()}" +
            "\nПерсонаж:${mage.informationOfPlayer()}" +
            "\nПерсонаж:${priest.informationOfPlayer()}" +
            "\nОружие:${sword}" +
            "\nОружие:${staff}")
    println()

    mage.pickUpLoot(gold)
    mage.pickUpLoot(item)



}



