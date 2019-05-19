package net.nutcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nutcraft.main.Resources;

public class BlockBase extends Block{

	public BlockBase(Settings settings, String registryName) {
		super(settings);
		
		// This auto registers any blocks extending BlockBase that are instantiated in ModBlocks
		Registry.register(Registry.BLOCK, new Identifier(Resources.modid, registryName), this);
		// Block Item Registry
		Registry.register(Registry.ITEM, new Identifier(Resources.modid, registryName), new BlockItem(this, new Item.Settings().itemGroup(ItemGroup.MISC)));
		
	}

}
