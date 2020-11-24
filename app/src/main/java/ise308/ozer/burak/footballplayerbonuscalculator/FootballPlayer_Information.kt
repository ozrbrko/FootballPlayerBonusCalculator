package ise308.ozer.burak.footballplayerbonuscalculator

const val INVALID_ARG = -1
class footballPlayer_Informations {

    val contracts: Array<Int> = arrayOf(1,2,3,4)
    val bonustype: Array<String> = arrayOf("Goal","Assist","SignatureBonus")

    val typeMatrix = arrayOf(
        arrayOf(3000, 2000, 1000),
        arrayOf(4000, 3000, 2000),
        arrayOf(5000, 4000, 3000),
        arrayOf(6000, 5000, 4000)
    )
    fun getType(contract: Int, value: String): Int {
        return if (contract in contracts || value in bonustype) {
            typeMatrix[contracts.indexOf(contract)][bonustype.indexOf(value)]
        } else
            INVALID_ARG

    }

}