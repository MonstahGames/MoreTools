package com.sigmastudios.mtools.item.items;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class RubyPickaxe extends ItemPickaxe
{
    public RubyPickaxe(ToolMaterial material, String name)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(MoreTools.tab);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
    public void registerItemModel()
    {
        MoreTools.proxy.registerItemRenderer(this, 0, "ruby_pickaxe");
    }
    public static void register ()
    {

    }
}
