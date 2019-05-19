package net.nutcraft.init;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.nutcraft.blocks.BlockComputer;
import net.nutcraft.main.Resources;

public class ModBlocks {

	public static BlockComputer computerBlock;
	// This is where all block related stuff is registered.
	public static void init()
	{
		// This instantiates out block computer. This also goes to the constructor of BlockBase(which we are extending in BlockComputer)
		// Which automatically registers the block for us. Note: since the flattening, the game automatically looks for blockstates, models, textures etc.
		computerBlock = new BlockComputer(FabricBlockSettings.of(Material.METAL).build(), Resources.blockComputer);
	}
	
}
