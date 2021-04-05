package easy

class Numberof1Bits_191 {

    fun hammingWeight(n:Int):Int {
        var res = 0
       for (i in 0 until 32){
           if ((n and (1 shl i) != 0)){
               res ++
           }
       }
        return res
    }

}