class Chest(var loot: MutableList<Loot>){
    fun takeLoot():Loot {
        return if (loot.isNotEmpty()) {
            loot.removeAt(0)
        } else {
            Loot.Empty
        }
    }
    fun takeAllTheLoot(): List<Loot>{
        val allLot = loot.toList()
        loot.clear()
        return allLot
    }
    fun isEmpty(): Boolean = loot.isEmpty()
}

