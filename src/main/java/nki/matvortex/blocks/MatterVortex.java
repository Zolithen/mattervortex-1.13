package nki.matvortex.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import net.minecraft.block.ITileEntityProvider;

public class MatterVortex extends Block implements ITileEntityProvider {

	private Block block;

	public MatterVortex(Block block) {
		super(Block.Builder.create(Material.IRON, MapColor.IRON).hardnessAndResistance(50, 6000));
		this.block = block;
	}

	public Class<MatterTileEntity> getTileEntityClass() {
		return MatterTileEntity.class;
	}

	@Override
	public TileEntity createNewTileEntity(IBlockReader arg0) {
		return new MatterTileEntity(block);
	}
	
	@Override
	public void onPlayerDestroy(IWorld intWorld, BlockPos pos, IBlockState state) {
		World world = intWorld.getWorld();
		world.removeTileEntity(pos);
	}
}