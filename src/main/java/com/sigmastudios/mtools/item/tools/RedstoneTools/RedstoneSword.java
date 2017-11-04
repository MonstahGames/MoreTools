package com.sigmastudios.mtools.item.tools.RedstoneTools;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class RedstoneSword extends ItemSword
{
    public RedstoneSword(ToolMaterial material, String name)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(MoreTools.toolsTab);
    }
    public void registerItemModel(String name)
    {
        MoreTools.proxy.registerItemRenderer(this, 0, name);
    }
}
