package easy

class FibonacciNumber_509 {

    val map = HashMap<Int,Int>()

    fun fib(n: Int): Int {
        if (n <= 1){
            return n
        }

        var n1 = map[n - 1]

        if (n1 == null){
            n1 = fib(n -1 )
            map[n - 1] = n1
        }

        var n2 = map[n - 2]

        if (n2 == null){
            n2 = fib(n - 2 )
            map[n - 2] = n2
        }

        return n1 + n2
    }

    fun exe(){
        print(fib(5))
    }
}