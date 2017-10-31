package com.sigmastudios.mtools.item;

import com.sigmastudios.mtools.item.Tools.RubyTools.RubyAxe;
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
    public static Item.ToolMaterial RUBYAXE = EnumHelper.addToolMaterial("RUBYAXE", 3, 250, 8.0F, 3.75F, 2);

    public static RubyPickaxe rubyPickaxe = new RubyPickaxe(RUBYPICKAXE, "ruby_pickaxe");
    public static RubySword rubySword = new RubySword(RUBYSWORD, "ruby_sword");
    public static RubyAxe rubyAxe = new RubyAxe(RUBYAXE, 3.75F, 1, "ruby_axe");
    public static RubyIngot rubyIngot = new RubyIngot("ruby_ingot");

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(rubyIngot, rubySword, rubyPickaxe, rubyAxe);
    }
    public static void registerModels ()
    {
        rubySword.registerItemModel("ruby_sword");
        rubyPickaxe.registerItemModel("ruby_pickaxe");
        rubyAxe.registerItemModel("ruby_axe");

        rubyIngot.registerItemModel("ruby_ingot");
    }
}