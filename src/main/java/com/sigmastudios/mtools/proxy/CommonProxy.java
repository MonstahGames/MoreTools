package com.sigmastudios.mtools.proxy;

import com.sigmastudios.mtools.item.ore.WorldOreGen;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
    public void registerItemRenderer (Item item, int meta, String id)
    {

    }

    public void preInit(FMLPreInitializationEvent event)
    {

    }
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new WorldOreGen(), 0);
    }
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
