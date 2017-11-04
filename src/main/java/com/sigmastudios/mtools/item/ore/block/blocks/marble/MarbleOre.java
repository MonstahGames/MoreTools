package com.sigmastudios.mtools.item.ore.block.blocks.marble;

import com.sigmastudios.mtools.MoreTools;
import com.sigmastudios.mtools.item.ore.block.BlockBase;
import net.minecraft.block.material.Material;

public class MarbleOre extends BlockBase
{
    public MarbleOre(String name)
    {
        super(Material.ROCK, name);
        setHardness(3F);
        setResistance(4.9F);
        this.setCreativeTab(MoreTools.blocksTab);
    }


}
