fun main(){
    val numbers: IntArray = intArrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3)
    numbers.sort()

// println(Arrays.toString(numbers)) // старый способ
    println("Sorted array: ${numbers.contentToString()}")
}