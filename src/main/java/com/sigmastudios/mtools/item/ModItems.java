package com.sigmastudios.mtools.item;

import com.sigmastudios.mtools.MoreTools;
import com.sigmastudios.mtools.item.armor.ruby.RubyBoots;
import com.sigmastudios.mtools.item.armor.ruby.RubyChestplate;
import com.sigmastudios.mtools.item.armor.ruby.RubyHelmet;
import com.sigmastudios.mtools.item.armor.ruby.RubyLeggings;
import com.sigmastudios.mtools.item.tools.RedstoneTools.RedstoneSword;
import com.sigmastudios.mtools.item.tools.RubyTools.RubyAxe;
import com.sigmastudios.mtools.item.tools.RubyTools.RubyShovel;
import com.sigmastudios.mtools.item.tools.RubyTools.RubySword;
import com.sigmastudios.mtools.item.ore.item.RubyIngot;
import com.sigmastudios.mtools.item.tools.RubyTools.RubyPickaxe;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    public static Item.ToolMaterial RUBYPICKAXE = EnumHelper.addToolMaterial("JEFFPICKAXE", 3, 1350, 8.0F, 2.5F, 5);
    public static Item.ToolMaterial RUBYSWORD = EnumHelper.addToolMaterial("RUBYSWORD", 3, 500, 8.0F, 7.5F, 4);
    public static Item.ToolMaterial RUBYAXE = EnumHelper.addToolMaterial("RUBYAXE", 3, 250, 8.0F, 3.75F, 2);
    public static Item.ToolMaterial RUBYSHOVEL = EnumHelper.addToolMaterial("RUBYSHOVEL", 3, 350, 8.0F, 1.0F, 1);

    public static Item.ToolMaterial REDSTONESWORD = EnumHelper.addToolMaterial("REDSTONESWORD", 1, 145, 5.0F, 1.5F, 18);

    public static RubyIngot rubyIngot = new RubyIngot("ruby_ingot");
    public static RubySword rubySword = new RubySword(RUBYSWORD, "ruby_sword");
    public static RubyPickaxe rubyPickaxe = new RubyPickaxe(RUBYPICKAXE, "ruby_pickaxe");
    public static RubyAxe rubyAxe = new RubyAxe(RUBYAXE, 3.75F, 1, "ruby_axe");
    public static RubyShovel rubyShovel = new RubyShovel(RUBYSHOVEL, "ruby_shovel");

    public static RubyHelmet rubyHelmet = new RubyHelmet(MoreTools.rubyArmorMaterial, EntityEquipmentSlot.HEAD, "ruby_helmet");
    public static RubyChestplate rubyChestplate = new RubyChestplate(MoreTools.rubyArmorMaterial, EntityEquipmentSlot.CHEST, "ruby_chestplate");
    public static RubyLeggings rubyLeggings = new RubyLeggings(MoreTools.rubyArmorMaterial, EntityEquipmentSlot.LEGS, "ruby_leggings");
    public static RubyBoots rubyBoots = new RubyBoots(MoreTools.rubyArmorMaterial, EntityEquipmentSlot.FEET, "ruby_boots");

    public static RedstoneSword redstoneSword = new RedstoneSword(REDSTONESWORD, "redstone_sword");

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(rubyIngot, rubySword, rubyPickaxe, rubyAxe, rubyShovel, rubyHelmet, rubyChestplate, rubyLeggings, rubyBoots, redstoneSword);
    }
    public static void registerModels ()
    {
        rubyIngot.registerItemModel("ruby_ingot");
        rubySword.registerItemModel("ruby_sword");
        rubyPickaxe.registerItemModel("ruby_pickaxe");
        rubyAxe.registerItemModel("ruby_axe");
        rubyShovel.registerItemModel("ruby_shovel");
        rubyHelmet.registerItemModel("ruby_helmet");
        rubyChestplate.registerItemModel("ruby_chestplate");
        rubyLeggings.registerItemModel("ruby_leggings");
        rubyBoots.registerItemModel("ruby_boots");
        redstoneSword.registerItemModel("redstone_sword");
    }
}