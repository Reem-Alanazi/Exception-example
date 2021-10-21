fun main() {

   // Examble ArithmeticException (1)

    /*
    var a = 5
    var b = 0
    println(a/b) */

    // To fix the exception , use try and catch

    var a = 5
    var b = 0


    try {
        val result = a / b
        println("inside try")
    } catch (e: Exception) {
        println(" Can not be division by zero becouse of exception"+e)
    }

/* Ans: Exception happened when we have division "a" on "b",
   which "b" equal zero, meaning that the value of an operation will give infinite number,
   this gives me an exception Type of  */

/* The try statement allows you to define a block of code to be tested for errors while it is being executed.
   The catch statement allows you to define a block of code to be executed,
    if an error occurs in the try block.try
*/
}
