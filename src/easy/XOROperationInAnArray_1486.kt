package easy

class XOROperationInAnArray_1486 {


    fun xorOperation(n: Int, start: Int): Int {
        val arr = IntArray(n) { 0 }
        for (i in arr.indices){
            arr[i] = start + 2 * i
        }

        var ret = arr[0]

        for (j in 1 until arr.size){
            ret = ret xor arr[j]
        }

        return ret
    }

    fun exe(){
        print(xorOperation(10,5))
    }

}