package nki.matvortex.blocks;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.Vec3i;
import nki.matvortex.MatVortex;

public class BlockBreakerTileEntity extends TileEntity implements ITickable{

	private int timeToBreak = 40;
	
	protected BlockBreakerTileEntity(TileEntityType<?> type) {
		super(type);
	}
	
	public BlockBreakerTileEntity() {
		this(MatVortex.BLOCK_BREAKER_ENTITY);
	}
	
	@Override
	public void update() {
		timeToBreak--;
		if (timeToBreak <= 0) {
			world.destroyBlock(pos.add(new Vec3i(0, 1, 0)), true);
			timeToBreak = 40;
		}
	}

	@Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        return compound;
    }
	
}
