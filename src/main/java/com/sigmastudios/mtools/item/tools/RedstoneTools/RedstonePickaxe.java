package com.sigmastudios.mtools.item.tools.RedstoneTools;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.item.ItemPickaxe;

public class RedstonePickaxe extends ItemPickaxe
{
    public RedstonePickaxe(ToolMaterial material, String name)
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

