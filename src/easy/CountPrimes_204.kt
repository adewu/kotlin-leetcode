package easy

class CountPrimes_204 {

    fun countPrimes(n: Int): Int {
        var count = 0
        for (i in 2 until n){
            count += isPrime(i)
        }

        return count
    }

    fun isPrime(x: Int): Int {
        var i = 2
        while (i * i <= x) {
            if (x % i == 0) {
                return 0
            }
            ++i
        }
        return 1
    }

    fun exe(){
        countPrimes(10)
    }
}