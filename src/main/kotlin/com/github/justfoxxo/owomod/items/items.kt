package com.github.justfoxxo.owomod.items

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ItemClass {
    private val OwOItem = OwOItem(FabricItemSettings().maxCount(8))
    private val OwOGroup = FabricItemGroupBuilder.create(
        Identifier("owomod", "owothings"))
        .icon { ItemStack(OwOItem) }
        .appendItems { stacks ->
            stacks.add(ItemStack(OwOItem))
        }
        .build()

    init {
        Registry.register(Registry.ITEM, Identifier("owomod", "owoitem"), OwOItem)
    }
}

