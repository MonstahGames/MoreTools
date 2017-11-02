package com.sigmastudios.mtools.item.ore.block.blocks.ruby;

import com.sigmastudios.mtools.MoreTools;
import com.sigmastudios.mtools.item.ore.block.BlockBase;
import net.minecraft.block.material.Material;

public class RubyOre extends BlockBase
{
    public RubyOre(String name)
    {
        super(Material.ROCK, name);
        setHardness(3F);
        setResistance(4.9F);
        this.setCreativeTab(MoreTools.tab);
    }
}
