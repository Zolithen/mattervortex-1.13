package nki.matvortex.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class BlockBreaker extends Block implements ITileEntityProvider{

	public BlockBreaker() {
		super(Block.Builder.create(Material.IRON, MapColor.IRON));
	}

	public Class<MatterTileEntity> getTileEntityClass() {
		return MatterTileEntity.class;
	}
	
	@Override
	public TileEntity createNewTileEntity(IBlockReader arg0) {
		return new BlockBreakerTileEntity();
	}
	
	@Override
	public void onPlayerDestroy(IWorld intWorld, BlockPos pos, IBlockState state) {
		World world = intWorld.getWorld();
		world.removeTileEntity(pos);
	}
	
	@Override
	public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		world.removeTileEntity(pos);
	}
	
}
