sealed class Loot{
    data class Gold(val amount:Int):Loot()
    data class Item(val item:Weapon):Loot()
    object Empty:Loot()
}