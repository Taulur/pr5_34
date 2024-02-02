import  kotlin.math.pow
import  kotlin.math.round
fun main()
{
    var x = readln()!!.toDouble()
    when
    {
        (x > 3) -> x = (1.2 * x.pow(2) - 3 * x - 9)
        else -> x = (12.1 / 2 * x.pow(2) + 1)
    }
    println(x);
}