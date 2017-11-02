package com.sigmastudios.mtools.item;

import com.sigmastudios.mtools.item.ore.block.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting
{
    public static void init ()
    {
        GameRegistry.addSmelting(ModBlocks.rubyOre, new ItemStack(ModItems.rubyIngot), 0.7f);
    }
}
