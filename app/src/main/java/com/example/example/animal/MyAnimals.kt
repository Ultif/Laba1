package com.example.example.animal

import android.util.Log

open class MyAnimals(private val animalOld: Int) : InterfaceAnimal {
    private var animalStatus: String = ""

    val arrayOfAnimal = arrayOf("Sumatran rhino", "Amur leopard", "Gorilla")

    override fun animalActivity(name: String) {
        animalStatus = "Playing"
        if (animalOld > 0) {
            for (i in arrayOfAnimal.indices) {
                if (arrayOfAnimal[i] == name) {
                    Log.d("Animal", "$name is $animalStatus")
                }
            }
        } else {
            animalStatus = "Sleeping"
            Log.d("Animal", animalStatus)
        }
    }

    override fun eatSomething(name: String) {
        var counter = 0
        while (counter < arrayOfAnimal.size) {
            if (arrayOfAnimal[counter] == name) {
                Log.d(name, "Плотно поїв")
            }
            ++counter
        }
    }
}