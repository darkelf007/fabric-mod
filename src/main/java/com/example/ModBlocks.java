package com.example;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // ✅ Используем MapColor и BlockSoundGroup вместо Material
    public static final Block RED_BLOCK = new Block(
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.STONE)
    );

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier("test_block", "Cube"), RED_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("test_block", "Cube"), new BlockItem(RED_BLOCK, new Item.Settings()));
    }
}