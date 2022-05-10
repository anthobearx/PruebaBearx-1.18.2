package net.anthobearx.pruebabearx.itembearx;

import net.anthobearx.pruebabearx.PruebaBearx;
import net.anthobearx.pruebabearx.blockbearx.BlockBearx;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroupBearx {
    public static final ItemGroup BEARXBLOCK = FabricItemGroupBuilder.build(new Identifier(PruebaBearx.MOD_ID,"bearxblock"),
            ()-> new ItemStack(BlockBearx.USELESS_BLOCK));
    public static final ItemGroup BEARXPLUSH = FabricItemGroupBuilder.build(new Identifier(PruebaBearx.MOD_ID,"bearxplush"),
            ()-> new ItemStack(ItemBearx.PLUSH_AKITA));
    public static final ItemGroup BEARXITEM = FabricItemGroupBuilder.build(new Identifier(PruebaBearx.MOD_ID,"bearxitem"),
            ()-> new ItemStack(ItemBearx.CAMARA));
}

