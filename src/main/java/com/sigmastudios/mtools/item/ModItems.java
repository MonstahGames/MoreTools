package com.sigmastudios.mtools.item;

import com.sigmastudios.mtools.item.tools.RubyPickaxe;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    public static Item.ToolMaterial RUBYPICKAXE = EnumHelper.addToolMaterial("JEFFPICKAXE", 3, 1750, 150, 1, 1);

    public static RubyPickaxe rubyPickaxe = new RubyPickaxe(RUBYPICKAXE, "ruby_pickaxe");

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.register(rubyPickaxe);
    }
    public static void registerModels ()
    {
        rubyPickaxe.registerItemModel();
    }
}