package com.sigmastudios.mtools;

import com.sigmastudios.mtools.item.ModItems;
import com.sigmastudios.mtools.item.ModSmelting;
import com.sigmastudios.mtools.item.ore.block.ModBlocks;
import com.sigmastudios.mtools.proxy.CommonProxy;
import com.sigmastudios.mtools.tab.ArmorTab;
import com.sigmastudios.mtools.tab.BlocksTab;
import com.sigmastudios.mtools.tab.ItemsTab;
import com.sigmastudios.mtools.tab.ToolsTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = MoreTools.MODID, version = MoreTools.VERSION, name = MoreTools.NAME)
public class MoreTools
{
    public static final String MODID = "mtools";
    public static final String VERSION = "1.0";
    public static final String NAME = "More tools";

    public static final String CLProxy = "com.sigmastudios.mtools.proxy.ClientProxy";
    public static final String CProxy = "com.sigmastudios.mtools.proxy.CommonProxy";

    public static final Logger LOGGER = LogManager.getLogger(MODID.toUpperCase());

    public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper.addArmorMaterial("RUBY", MODID + ":ruby", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);


    @SidedProxy(clientSide = CLProxy, serverSide = CProxy)
    public static CommonProxy proxy;

    @Mod.Instance
    public static MoreTools instance;

    public static ToolsTab toolsTab;
    public static ArmorTab armorTab;
    public static BlocksTab blocksTab;
    public static ItemsTab itemsTab;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event)
        {
            ModBlocks.register(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerItem (ModelRegistryEvent event)
        {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        toolsTab = new ToolsTab(CreativeTabs.getNextID(), "mtools_tab");
        armorTab = new ArmorTab(CreativeTabs.getNextID(), "mtools_armortab");
        blocksTab = new BlocksTab(CreativeTabs.getNextID(), "mtools_blockstab");
        itemsTab = new ItemsTab(CreativeTabs.getNextID(), "mtools_itemstab");

        proxy.preInit(event);
    }
    @EventHandler
    public void init (FMLInitializationEvent event)
    {
        ModSmelting.init();
        proxy.init(event);
    }
    @EventHandler
    public  void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
