
//Ex4: create a maxN function such that it takes an array and returns its largest element.


fun maxN(numbers: IntArray): Int
{
    var max = numbers[0] // Initialize max with the first element of the array
    for (num in numbers)
    {
        if (num > max)
        {
            max = num // Update max if a larger element is found
        }
    }
    return max
}

fun main()
{
    val array = intArrayOf(10, 20, 5, 30, 15)
    val largest = maxN(array)
    println("The largest element in the array is: $largest")
}