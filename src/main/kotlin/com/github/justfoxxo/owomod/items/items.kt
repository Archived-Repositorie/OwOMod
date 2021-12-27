package com.github.justfoxxo.owomod.items

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ItemClass() {
    private val OwOItem = ItemThing(FabricItemSettings().maxCount(8), "owoitem")

    init {
        ItemsGroup(OwOItem.item, "owothings", listOf(OwOItem.item))
    }
}

class ItemsGroup(icon: Item = ItemStack.EMPTY.item, path: String, items: List<Item> = listOf()) {
    val group = FabricItemGroupBuilder.create(
        Identifier("owomod",path))
        .icon { ItemStack(icon) }
        .appendItems { stacks -> for (item in items) stacks.add(ItemStack(item)) }
        .build()
}

class ItemThing(itemSettings: Item.Settings, path: String) {
    var item: Item
    init {
        item = Item(itemSettings)
        Registry.register(Registry.ITEM, Identifier("owomod", path), item)
    }
}
