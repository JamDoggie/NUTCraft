package net.nutcraft.init;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nutcraft.blockentity.ComputerBlockEntity;
import net.nutcraft.main.Resources;

public class ModEntities {

	public static BlockEntityType<ComputerBlockEntity> NUTEntity; 
	
	// This class registers Block Entities
	public static void init()
	{
		NUTEntity = BlockEntityType.Builder.create(() -> new ComputerBlockEntity(NUTEntity)).build(null);
		
		register(Resources.blockEntityComputer, NUTEntity);
	}
	
	private static void register(String name, BlockEntityType<?> type)
    {
        Registry.register(Registry.BLOCK_ENTITY, new Identifier(Resources.modid, name), type);
    }
	
}
