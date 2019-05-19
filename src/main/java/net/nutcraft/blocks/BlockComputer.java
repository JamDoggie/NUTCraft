package net.nutcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateFactory.Builder;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.nutcraft.blockentity.ComputerBlockEntity;
import net.nutcraft.init.ModEntities;

public class BlockComputer extends BlockBase implements BlockEntityProvider{

	// This variable stores what direction the block is facing(north, south, east or west)
	public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
	
	public BlockComputer(Settings settings, String registryName) {
		super(settings, registryName);
		
		// Sets the blockstate to fall back to if a blockstate isn't set when the block is placed.
		setDefaultState(this.stateFactory.getDefaultState().with(HorizontalFacingBlock.FACING, Direction.NORTH));
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext context) {
		return super.getPlacementState(context).with(HorizontalFacingBlock.FACING, context.getPlayer().getHorizontalFacing().getOpposite());
	}
	
	@Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
    	builder.add(FACING);
    }
	
	// This is for the Block Entity. This will let us do more advanced things with this block such as store items,
	// Interact with a GUI, Interact with stuff like squirrel etc.
	@Override
	public BlockEntity createBlockEntity(BlockView var1) {
		
		return new ComputerBlockEntity(ModEntities.NUTEntity);
	}

}
