package com.sigmastudios.mtools.item.armor.ruby;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class RubyHelmet extends ItemArmor
{

    public RubyHelmet(ArmorMaterial material, EntityEquipmentSlot slot, String name)
    {
        super(material, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.setCreativeTab(MoreTools.tab);
    }
    public void registerItemModel(String name)
    {
        MoreTools.proxy.registerItemRenderer(this, 0, name);
    }
}
