//Ex 3: reimplement Harmonic sequence ( please refer to page 65 of our textbook). The number of elements of the sequence should come from the user input.




fun main(args: Array<String>)
{
    print("Enter a  number ")
    val userInput= readlnOrNull()
    val  n = userInput?.toIntOrNull()


    if (n != null)
    {
        var sum = 0.0
        for (i in 1..n) {

            sum += 1.0 / i
        }
        println(sum)
    }
    else
        print("Enter a  valid number ")
    }
