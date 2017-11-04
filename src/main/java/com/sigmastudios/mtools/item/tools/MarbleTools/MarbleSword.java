package com.sigmastudios.mtools.item.tools.MarbleTools;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class MarbleSword extends ItemSword
{
    public MarbleSword(ToolMaterial material, String name)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(MoreTools.tab);
    }
    public void registerItemModel(String name)
    {
        MoreTools.proxy.registerItemRenderer(this, 0, name);
    }
}
