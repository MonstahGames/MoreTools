package com.sigmastudios.mtools.item.ore;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.item.Item;

public class RubyIngot extends Item
{
    public RubyIngot (String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(MoreTools.tab);
    }
    public void registerItemModel(String name)
    {
        MoreTools.proxy.registerItemRenderer(this, 0, name);
    }
}
