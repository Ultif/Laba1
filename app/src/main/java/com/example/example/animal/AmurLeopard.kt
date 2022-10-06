package com.example.example.animal

import android.util.Log

class AmurLeopard: MyAnimals(animalOld = 3) {
    override fun animalActivity(name: String) {
        Log.d(name, "Status")
        super.animalActivity(name)
    }

    override fun eatSomething(name: String) {
        Log.d(name, "Amur leopard")
        super.eatSomething(name)
    }
}