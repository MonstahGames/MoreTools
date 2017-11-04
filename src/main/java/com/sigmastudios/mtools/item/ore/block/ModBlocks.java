package com.sigmastudios.mtools.item.ore.block;

import com.sigmastudios.mtools.item.ore.block.blocks.marble.MarbleOre;
import com.sigmastudios.mtools.item.ore.block.blocks.ruby.RubyBlock;
import com.sigmastudios.mtools.item.ore.block.blocks.ruby.RubyOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks
{
    public static RubyOre rubyOre = new RubyOre("ruby_ore");
    public static RubyBlock rubyBlock = new RubyBlock("ruby_block");
    public static MarbleOre marbleOre = new MarbleOre("marble_ore");

    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll(rubyOre, rubyBlock, marbleOre);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        registry.register(rubyOre.createItemBlock());
        registry.register(rubyBlock.createItemBlock());
        registry.register(marbleOre.createItemBlock());
    }

    public static void registerModels()
    {
        rubyOre.registerItemModel(Item.getItemFromBlock(rubyOre));
        rubyBlock.registerItemModel(Item.getItemFromBlock(rubyBlock));
        marbleOre.registerItemModel(Item.getItemFromBlock(marbleOre));
    }
}
