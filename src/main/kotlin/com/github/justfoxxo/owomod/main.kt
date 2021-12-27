package com.github.justfoxxo.owomod

import com.github.justfoxxo.owomod.items.ItemClass
import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object Main : ModInitializer {
    val owomod = "owomod"
    override fun onInitialize() {
        println("OwO what's this?")
        ItemClass()
    }
}
