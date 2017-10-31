package com.sigmastudios.mtools.item;

import com.sigmastudios.mtools.item.Tools.RubyTools.RubySword;
import com.sigmastudios.mtools.item.ore.RubyIngot;
import com.sigmastudios.mtools.item.Tools.RubyTools.RubyPickaxe;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    public static Item.ToolMaterial RUBYPICKAXE = EnumHelper.addToolMaterial("JEFFPICKAXE", 3, 1350, 8.0F, 2.5F, 5);
    public static Item.ToolMaterial RUBYSWORD = EnumHelper.addToolMaterial("RUBYSWORD", 3, 500, 8.0F, 7.5F, 4);

    public static RubyPickaxe rubyPickaxe = new RubyPickaxe(RUBYPICKAXE, "ruby_pickaxe");
    public static RubySword rubySword = new RubySword(RUBYSWORD, "ruby_sword");
    public static RubyIngot rubyIngot = new RubyIngot("ruby_ingot");

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(rubyPickaxe, rubySword, rubyIngot);
    }
    public static void registerModels ()
    {
        rubyPickaxe.registerItemModel("ruby_pickaxe");
        rubySword.registerItemModel("ruby_sword");
        rubyIngot.registerItemModel("ruby_ingot");
    }
}