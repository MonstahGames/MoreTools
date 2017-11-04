package com.sigmastudios.mtools.item.tools.RubyTools;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class RubyAxe extends ItemAxe
{
    public RubyAxe(ToolMaterial material, float damage, float speed, String name)
    {
        super(material, damage, speed);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(MoreTools.toolsTab);
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
