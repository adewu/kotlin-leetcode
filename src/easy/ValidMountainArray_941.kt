package easy

class ValidMountainArray_941 {

    fun validMountainArray(A: IntArray): Boolean {
        val length = A.size
        if (length < 3){
            return false
        }

        var prev = A[0]
        var p = 0
        for (i in 1 until length){
            if (prev >= A[i]){
                break
            }else{
                prev = A[i]
                p = i
            }
        }

        if (p == length - 1){
            return false
        }

        var last = A[length - 1]
        var q = length - 1
        for ( j in length - 2 downTo p){
            if (last >= A[j]){
                break
            }else{
                last = A[j]
                q = j
            }
        }

        if (q == 0){
            return false
        }

        return  prev == last && p == q
    }

    fun exe(){
//        print(validMountainArray(intArrayOf(0,2,3,3,4,5,2,1,0)))
        print(validMountainArray(intArrayOf(0,1,2,3,4,5,6,7,8,9)))
    }
}