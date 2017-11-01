package com.sigmastudios.mtools.item.ore.block;

import com.sigmastudios.mtools.item.ore.block.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks
{
    public static RubyOre rubyOre = new RubyOre("ruby_ore");

    public static void register(IForgeRegistry<Block> registry)
    {
        registry.register(rubyOre);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        registry.register(rubyOre.createItemBlock());
    }

    public static void registerModels()
    {
        rubyOre.registerItemModel(Item.getItemFromBlock(rubyOre));
    }
}
