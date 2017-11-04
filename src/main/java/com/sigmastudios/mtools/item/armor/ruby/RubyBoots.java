package com.sigmastudios.mtools.item.armor.ruby;

import com.sigmastudios.mtools.MoreTools;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class RubyBoots extends ItemArmor
{
    public RubyBoots(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, String name)
    {
        super(materialIn, 0, equipmentSlotIn);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(MoreTools.armorTab);
    }
    public void registerItemModel (String name)
    {
        MoreTools.proxy.registerItemRenderer(this, 0, name);
    }
}
