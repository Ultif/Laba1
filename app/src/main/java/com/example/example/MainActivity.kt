package com.example.example

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.example.animal.SumatranRhino
import com.example.example.animal.AmurLeopard
import com.example.example.animal.Gorilla

class MainActivity : AppCompatActivity() {


    private lateinit var gorillaArr: Array<Button>
    private lateinit var leopardArr: Array<Button>
    private lateinit var rhinoArr: Array<Button>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        leopardArr = arrayOf(findViewById<Button>(R.id.btn_0), findViewById<Button>(R.id.btn_1))
        rhinoArr = arrayOf(findViewById(R.id.btn_2), findViewById(R.id.btn_3))
        gorillaArr = arrayOf(findViewById<Button>(R.id.btn_4), findViewById<Button>(R.id.btn_5))

        click()
    }


    private fun click() {
        leopardArr.first().setOnClickListener {
            val sumatranRhino = SumatranRhino()
            sumatranRhino.animalActivity("Sumatran rhino")
        }
        leopardArr.last().setOnClickListener {
            val sumatranRhino = SumatranRhino()
            sumatranRhino.eatSomething("Sumatran rhino")
        }
        gorillaArr.first().setOnClickListener {
            val gorilla = Gorilla()
            gorilla.animalActivity("Gorilla")
        }
        gorillaArr.last().setOnClickListener {
            val gorilla = Gorilla()
            gorilla.eatSomething("Gorilla")
        }
        rhinoArr.first().setOnClickListener {
            val amurLeopard = AmurLeopard()
            amurLeopard.animalActivity("Amur leopard")
        }
        rhinoArr.last().setOnClickListener {
            val amurLeopard = AmurLeopard()
            amurLeopard.eatSomething("Amur leopard")
        }
    }
}