package com.sigmastudios.mtools.item.tools.RubyTools;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword
{
    public RubySword(ToolMaterial material, String name)
    {
        super(material);
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
