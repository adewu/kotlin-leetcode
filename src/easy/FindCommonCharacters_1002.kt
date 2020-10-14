package easy

class FindCommonCharacters_1002 {

    fun commonChars(A: Array<String>): List<String> {
        //97 - 122
        if (A.isEmpty()) {
            return listOf()
        }

        val recordArray = Array(A.size){
            Array(26){
                0
            }
        }

        A.forEachIndexed { index, str ->
            str.forEach {
                recordArray[index][it.toInt() - 97] =  recordArray[index][it.toInt() - 97] + 1
            }
        }

        val result = mutableListOf<String>()

        for (i in 0 until 26){

            var preSize = recordArray[0][i]

            for (j in 1 until recordArray.size){
                val size = recordArray[j][i]

                preSize = Math.min(preSize, size)

                if (j == recordArray.size - 1){
                    for (k in 0 until preSize){
                        result.add((i + 97).toChar().toString())
                    }
                }
            }
        }
        return result
    }

    fun exe() {
        val commonChars = commonChars(arrayOf("bella","label","roller"))
    }
}