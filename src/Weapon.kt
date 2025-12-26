data class Weapon(val name: String
                  ,val type: WeaponType
                  ,val damage:Int){
    override fun toString(): String {
        return "Имя оружия:$name, Тип оружия: $type, Урон от оружия: $damage"
    }
}
