package ise308.ozer.burak.footballplayerbonuscalculator

import android.util.Log

class oldPlayer(Name: String, Point: Int, Region: String):Player(Name,Point,Region) {
    override fun getPlayer() {
        Log.i(TAG, "getPlayer: You are an old player. You can extend up to 1 more contract.")
    }
    companion object{
        const val TAG = "Old Football Player"
    }

}