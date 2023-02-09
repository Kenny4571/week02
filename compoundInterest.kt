  import kotlin.math.*
fun main(args: Array<String>) {
    val P = 10000.0 // Principal amount
    val r = 0.10 // Annual interest rate
    val n = 2 // Number of times the interest is compounded per year
    val t = 4 // Number of years
    val e = 8 // Exponent

    // Calculate A
    val A = P * Math.pow(1 + (r / n), e.toDouble())
    println("The amount of money in the account after 4 years is $A")
}
