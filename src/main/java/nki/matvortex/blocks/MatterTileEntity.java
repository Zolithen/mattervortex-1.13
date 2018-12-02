package nki.matvortex.blocks;



import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.Vec3i;
import nki.matvortex.MatVortex;

public class MatterTileEntity extends TileEntity implements ITickable {

		private Block block;

		protected MatterTileEntity(TileEntityType<?> type, Block block) {
			super(type);
			this.block = block;
		}
		
		public MatterTileEntity(Block block) {
			this(MatVortex.MATTER_VORTEX_ENTITY, block);
		}
		
		public MatterTileEntity() {
			this(MatVortex.MATTER_VORTEX_ENTITY, Blocks.AIR);
		}
		
		@Override
		public void update() {
			world.setBlockState(pos.subtract(new Vec3i(0, 1, 0)), block.getDefaultState());
		}
		
	}
