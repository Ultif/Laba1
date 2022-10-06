package com.example.example

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.example.animal.SumatranRhino
import com.example.example.animal.AmurLeopard
import com.example.example.animal.Gorilla

class MainActivity : AppCompatActivity() {


    private lateinit var makakaArray: Array<Button>
    private lateinit var dogArray: Array<Button>
    private lateinit var elephant: Array<Button>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dogArray = arrayOf(findViewById<Button>(R.id.btn_0), findViewById<Button>(R.id.btn_1))
        elephant = arrayOf(findViewById(R.id.btn_2), findViewById(R.id.btn_3))
        makakaArray = arrayOf(findViewById<Button>(R.id.btn_4), findViewById<Button>(R.id.btn_5))

        click()
    }


    private fun click() {
        dogArray.first().setOnClickListener {
            val sumatranRhino = SumatranRhino()
            sumatranRhino.animalActivity("Sumatran rhino")
        }
        dogArray.last().setOnClickListener {
            val sumatranRhino = SumatranRhino()
            sumatranRhino.eatSomething("Sumatran rhino")
        }
        makakaArray.first().setOnClickListener {
            val gorilla = Gorilla()
            gorilla.animalActivity("Gorilla")
        }
        makakaArray.last().setOnClickListener {
            val gorilla = Gorilla()
            gorilla.eatSomething("Gorilla")
        }
        elephant.first().setOnClickListener {
            val amurLeopard = AmurLeopard()
            amurLeopard.animalActivity("Amur leopard")
        }
        elephant.last().setOnClickListener {
            val amurLeopard = AmurLeopard()
            amurLeopard.eatSomething("Amur leopard")
        }
    }
}