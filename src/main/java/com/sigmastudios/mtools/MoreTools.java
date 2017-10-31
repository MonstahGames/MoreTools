package com.sigmastudios.mtools;

import com.sigmastudios.mtools.item.ModItems;
import com.sigmastudios.mtools.proxy.CommonProxy;
import com.sigmastudios.mtools.tab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = MoreTools.MODID, version = MoreTools.VERSION, name = MoreTools.NAME)
public class MoreTools
{
    public static final String MODID = "mtools";
    public static final String VERSION = "1.0";
    public static final String NAME = "More Tools";

    public static final String CLProxy = "com.sigmastudios.mtools.proxy.ClientProxy";
    public static final String CProxy = "com.sigmastudios.mtools.proxy.CommonProxy";

    @SidedProxy(clientSide = CLProxy, serverSide = CProxy)
    public static CommonProxy proxy;

    @Mod.Instance
    public static MoreTools instance;

    public static CreativeTab tab;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModItems.register(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerItem (ModelRegistryEvent event)
        {
            ModItems.registerModels();
        }
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        tab = new CreativeTab(CreativeTabs.getNextID(), "mtools_tab");
        proxy.preInit(event);
    }
    @EventHandler
    public void init (FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    @EventHandler
    public  void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
