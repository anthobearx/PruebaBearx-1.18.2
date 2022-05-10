package net.anthobearx.pruebabearx.blockbearx;

import net.anthobearx.pruebabearx.PruebaBearx;
import net.anthobearx.pruebabearx.itembearx.ItemGroupBearx;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class BlockBearx {

    public static final Block USELESS_BLOCK = registerBlock("useless_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroupBearx.BEARXBLOCK);

    public static final Block TRASH_BLOCK = registerBlock("trash_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(6f).requiresTool()), ItemGroupBearx.BEARXBLOCK);

    public static final Block PLASTIC_BLOCK = registerBlock("plastic_block",
            new Block(FabricBlockSettings.of(Material.SPONGE).strength(6f).requiresTool()), ItemGroupBearx.BEARXBLOCK);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(PruebaBearx.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(PruebaBearx.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks(){
        PruebaBearx.LOGGER.info("Registering MOD blocks for " + PruebaBearx.MOD_ID);
    }
}
