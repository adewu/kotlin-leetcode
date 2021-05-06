package easy

class DecodeXORedArray_1720 {

    fun decode(encoded: IntArray, first: Int): IntArray {
        val n = encoded.size + 1
        val arr = IntArray(n) { 0 }
        arr[0] = first
        for (i in 0 until n){
            arr[i] = arr[i - 1] xor encoded[i - 1]
        }
        return arr
    }

    fun exe(){

    }
}