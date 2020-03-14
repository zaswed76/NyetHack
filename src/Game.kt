


fun main(args: Array<String>) {
   val name = "Madrigal"
   var healthPoints = 89
   val isBlessed = true
   val isImmortal = false

   val auraVisible = isBlessed && healthPoints > 50 || isImmortal
   if (auraVisible) {
      println("GREEN")
   } else {
      println("NONE")
   }

}


