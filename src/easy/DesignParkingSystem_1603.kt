package easy

class DesignParkingSystem_1603(var big: Int,var medium: Int,var small: Int) {

    val bigArr = mutableListOf<Int>()
    val mediumArr = mutableListOf<Int>()
    val smallArr = mutableListOf<Int>()

    fun addCar(carType: Int): Boolean {
        if (carType == 1){
            if (bigArr.size == big){
                return false
            }else{
                bigArr.add(carType)
            }
        }else if (carType == 2){
            if (mediumArr.size == medium){
                return false
            }else{
                mediumArr.add(carType)
            }
        }else if (carType == 3){
            if (smallArr.size == small){
                return false
            }else {
                smallArr.add(carType)
            }
        }
        return true
    }

}