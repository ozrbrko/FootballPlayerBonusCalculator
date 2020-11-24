package ise308.ozer.burak.footballplayerbonuscalculator

import android.content.ContentValues.TAG
import android.util.Log

abstract class Player (val Name: String, val Point: Int, val Region: String) {
    var contract: Int = 0
    constructor(Name: String,Point: Int,Region: String, contract: Int):this(Name,Point,Region)
    {
        this.contract = contract
    }
    init {
        Log.i(TAG,"Your name is $Name, your point is $Point ")
    }
    fun calculate(type: String) //values
    {
        val footballPlayer_info: footballPlayer_Informations = footballPlayer_Informations()
        val money = footballPlayer_info.getType(contract,type)


        if(contract < 0)
        {
            Log.i(TAG,"calculate : You are not in a clup now")
        }
        else if (contract > 4)
        {
            Log.i(TAG,"calculate: Your contract with the team is over.")
        }
        else
        {
            var totalmoney = (money * Point).toInt()
            Log.i(TAG, "calculate: Your contract is $contract year/years and your point is $Point")
            Log.i(TAG, "calculate: Money you earned $totalmoney TL")
            Log.i(TAG, "calculate: ${extendContract(Point)}")

        }
    }
    fun extendContract(Point: Int) {
        if (Point == 30 || Point > 30) {
            Log.i(TAG, "extendContract: Your contract is extended!")
        }
        else
        {
            var extendcont = 30 - Point
            Log.i(TAG, "calculate: Remainin points for contract extension $extendcont . ")
        }



    }
    abstract fun getPlayer()

    companion object{
        const val TAG = "Football Player"
    }

}