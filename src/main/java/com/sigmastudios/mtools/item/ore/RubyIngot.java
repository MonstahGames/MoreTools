package com.sigmastudios.mtools.item.ore;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RubyIngot extends Item
{
    public RubyIngot (String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(MoreTools.tab);
    }
    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.RARE;
    }
    public void registerItemModel(String name)
    {
        MoreTools.proxy.registerItemRenderer(this, 0, name);
    }
}
