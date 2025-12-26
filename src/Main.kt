fun main() {
    val warrior = Warrior("Warrior")
    val mage = Mage("Mage")
    val priest = Priest("Priest")
    val sword = Weapon("Меч Тысячи Истин", WeaponType.SWORD, 20)
    val staff = Weapon("Древний Посох", WeaponType.STAFF, 10)
    println("Персонаж:${warrior.informationOfPlayer()}" +
            "\nПерсонаж:${mage.informationOfPlayer()}" +
            "\nПерсонаж:${priest.informationOfPlayer()}" +
            "\nОружие:${sword}" +
            "\nОружие:${staff}")
    println()
    warrior.attack(mage)

    warrior.equip(sword)

    warrior.attack(mage)

    priest.heal(mage)
    priest.heal(mage)
    priest.heal(mage)
    priest.heal(mage)
}



