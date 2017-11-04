package com.sigmastudios.mtools.item.ore.item;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.item.Item;

public class MarbleIngot extends Item
{
    public MarbleIngot(String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(MoreTools.tab);
    }
    public void registerItemModel (String name)
    {
        MoreTools.proxy.registerItemRenderer(this, 0, name);
    }
}
