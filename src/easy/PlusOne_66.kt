package easy

class PlusOne_66 {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0){
            digits[i] ++
            digits[i] = digits[i] % 10
            if (digits[i] != 0){
                return digits
            }
        }

       val array = IntArray(digits.size + 1)

        array[0] = 1

        return array
    }

    fun exe(){
        val digits = IntArray(3)
        digits[0] = 1
        digits[1] = 2
        digits[2] = 3
        plusOne(digits)
    }
}