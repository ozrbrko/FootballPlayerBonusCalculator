package ise308.ozer.burak.footballplayerbonuscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playerCalculator()
    }
}

 fun playerCalculator(){
    val newplayer1 = newPlayer("Burak", 12 , "Turkey")
    newplayer1.contract=1
    newplayer1.calculate("Goal")
    newplayer1.getPlayer()


    val newplayer2 = oldPlayer("Ahmet", 28 , "Turkey")
    newplayer2.contract=2
    newplayer2.calculate("Goal")
    newplayer2.getPlayer()

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}