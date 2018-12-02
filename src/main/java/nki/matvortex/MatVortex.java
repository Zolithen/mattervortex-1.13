package nki.matvortex;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;

import nki.matvortex.blocks.*;

import org.dimdev.rift.listener.*;

public class MatVortex implements BlockAdder, ItemAdder , TileEntityTypeAdder{

	public final static MatterVortex MATTER_VORTEX_IRON = new MatterVortex(Blocks.IRON_BLOCK);
	public final static MatterVortex MATTER_VORTEX_GOLD = new MatterVortex(Blocks.GOLD_BLOCK);
	public final static MatterVortex MATTER_VORTEX_QUARTZ = new MatterVortex(Blocks.QUARTZ_BLOCK);
	public final static MatterVortex MATTER_VORTEX_OBSIDIAN = new MatterVortex(Blocks.OBSIDIAN);
	public final static MatterVortex MATTER_VORTEX_DIAMOND = new MatterVortex(Blocks.DIAMOND_BLOCK);
	public final static BlockBreaker BLOCK_BREAKER = new BlockBreaker();
	
	public final static Item INFINITY_STAR = new Item(new Item.Builder().group(ItemGroup.MISC));
	public final static Item INFINITY_CASING = new Item(new Item.Builder().group(ItemGroup.MISC));
	
	public static TileEntityType<MatterTileEntity> MATTER_VORTEX_ENTITY;
	public static TileEntityType<BlockBreakerTileEntity> BLOCK_BREAKER_ENTITY;
	
	@Override
	public void registerBlocks() {
		Block.register(new ResourceLocation("matvortex:iron_vortex"), MATTER_VORTEX_IRON);
		Block.register(new ResourceLocation("matvortex:gold_vortex"), MATTER_VORTEX_GOLD);
		Block.register(new ResourceLocation("matvortex:quartz_vortex"), MATTER_VORTEX_QUARTZ);
		Block.register(new ResourceLocation("matvortex:obsidian_vortex"), MATTER_VORTEX_OBSIDIAN);
		Block.register(new ResourceLocation("matvortex:diamond_vortex"), MATTER_VORTEX_DIAMOND);
		Block.register(new ResourceLocation("matvortex:block_breaker"), BLOCK_BREAKER);
	}

	@Override
	public void registerItems() {
		Item.register(MATTER_VORTEX_IRON, ItemGroup.BUILDING_BLOCKS);
		Item.register(MATTER_VORTEX_GOLD, ItemGroup.BUILDING_BLOCKS);
		Item.register(MATTER_VORTEX_QUARTZ, ItemGroup.BUILDING_BLOCKS);
		Item.register(MATTER_VORTEX_OBSIDIAN, ItemGroup.BUILDING_BLOCKS);
		Item.register(MATTER_VORTEX_DIAMOND, ItemGroup.BUILDING_BLOCKS);
		Item.register(BLOCK_BREAKER, ItemGroup.BUILDING_BLOCKS);
		
		Item.register(new ResourceLocation("matvortex:infinity_star"), INFINITY_STAR);
		Item.register(new ResourceLocation("matvortex:infinity_casing"), INFINITY_CASING);
	}

	@Override
	public void registerTileEntityTypes() {
		MATTER_VORTEX_ENTITY = TileEntityType.registerTileEntityType("matvortex:matter_vortex", TileEntityType.Builder.create(MatterTileEntity::new));
		BLOCK_BREAKER_ENTITY = TileEntityType.registerTileEntityType("matvortex:block_breaker", TileEntityType.Builder.create(BlockBreakerTileEntity::new));
	}

}