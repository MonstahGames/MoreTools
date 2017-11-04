package com.sigmastudios.mtools.tab;

import com.sigmastudios.mtools.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ArmorTab extends CreativeTabs
{
    public ArmorTab(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.rubyChestplate);
    }
}
