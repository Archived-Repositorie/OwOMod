package com.github.justfoxxo.owomod
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

@Suppress("UNUSED")
object Owomod: ModInitializer {
    val owomod = "owomod"
    override fun onInitialize() {
        println("OwO what's this?")
        Registry.register(Registry.ITEM, Identifier("owomod", "owoitem"), OwOItem)
    }
    val OwOItem = Item(FabricItemSettings().group(ItemGroup.FOOD))

}