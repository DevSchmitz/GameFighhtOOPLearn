sealed class Loot{
    data class Gold(val amount:Int):Loot()
    data class Item(val item:Weapon):Loot(){
        override fun toString(): String {
            return "${item.name}"
        }
    }
    object Empty:Loot()
}