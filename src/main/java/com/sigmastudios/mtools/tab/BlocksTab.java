package com.sigmastudios.mtools.tab;

import com.sigmastudios.mtools.item.ModItems;
import com.sigmastudios.mtools.item.ore.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksTab extends CreativeTabs
{
    public BlocksTab(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModBlocks.marbleOre);
    }
}
