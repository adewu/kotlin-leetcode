package easy

class LemonadeChange_860 {


    fun lemonadeChange(bills: IntArray): Boolean {
        if (bills.isEmpty()){
            return false
        }

        val arr = intArrayOf(0, 0, 0)

        bills.forEachIndexed { index, i ->
            if (i == 5){
                arr[0] = arr[0] + 1
            }else if (i == 10){
                if (arr[0] != 0){
                    arr[0] = arr[0] - 1
                    arr[1] = arr[1] + 1
                }else{
                    return false
                }
            }else if (i == 20){
                if (arr[0] != 0 && arr[1] != 0){
                    arr[0] = arr[0] - 1
                    arr[1] = arr[1] - 1
                    arr[2] = arr[2] + 1
                }else if (arr[0] >= 3){
                    arr[0] = arr[0] - 3
                    arr[2] = arr[2] + 1
                }else{
                    return false
                }
            }
        }

        return true

    }

    fun exe(){
        print(lemonadeChange(intArrayOf(5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5)))
    }
}