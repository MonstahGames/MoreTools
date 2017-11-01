package com.sigmastudios.mtools.item.ore;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldOreGen implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chuckGen, IChunkProvider chunkProvider)
    {
        int dimension = world.provider.getDimension();
        {
            if (dimension == 0) {
                //genSurfaceMoreTools(world, random, chunkX * 16, chunkZ * 16);
            } else {
            }
        }
    }
    //private void genSurfaceMoreTools(World world, Random random, int chunkX, int chunkZ) {
    //    addOreSpawn("en hier", world, random, chunkX, chunkZ, 16, 16, 10, 2, 0, 10,
    //            BlockMatcher.forBlock(Blocks.STONE));
    //    addOreSpawn("ZET BLOCK HIER".getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 10, 10, 0, 5,
    //            BlockMatcher.forBlock(Blocks.STONE));
    //}

    private void addOreSpawn(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX,
                             int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn) {
        int diffMinMaxY = maxY - minY;
        for (int x = 0; x < chance; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random,
                    new BlockPos(posX, posY, posZ));
        }
    }
}
