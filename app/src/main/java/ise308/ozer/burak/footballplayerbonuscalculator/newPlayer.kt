package ise308.ozer.burak.footballplayerbonuscalculator

import android.util.Log

class newPlayer(Name: String, Point: Int, Region: String):Player(Name,Point,Region) {
    override fun getPlayer() {
        Log.i(TAG, "getPlayer: You are a new player. You need points to extend the contract.")
    }
    companion object{
        const val TAG = "New Football Player"
    }

}