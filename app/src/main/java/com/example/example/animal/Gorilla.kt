package com.example.example.animal

import android.util.Log

class Gorilla: MyAnimals(animalOld = 3) {
    override fun animalActivity(name: String) {
        Log.d(name, "Status")
        super.animalActivity(name)
    }

    override fun eatSomething(name: String) {
        Log.d(name, "Gorilla")
        super.eatSomething(name)
    }
}