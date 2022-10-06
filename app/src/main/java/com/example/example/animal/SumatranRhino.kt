package com.example.example.animal

import android.util.Log

class SumatranRhino : MyAnimals(animalOld = 5) {
    override fun animalActivity(name: String) {
        Log.d(name, "Status")
        super.animalActivity(name)
    }

    override fun eatSomething(name: String) {
        Log.d(name, "Sumatran rhino")
        super.eatSomething(name)
    }
}