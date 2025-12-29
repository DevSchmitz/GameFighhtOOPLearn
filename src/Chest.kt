class Chest(var loot: MutableList<Loot>){
    fun takeloot():Loot{
        return if(loot.isNotEmpty()){
            loot.removeAt(0)
        }
        else{
            Loot.Empty
        }
        fun takeAllloot(): List<Loot>{
            val allLot = loot.toList()
            loot.clear()
            return allLot
        }

        fun isEmpty(): Boolean = loot.isEmpty()
    }
}
