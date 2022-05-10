package net.anthobearx.pruebabearx.itembearx;

import net.anthobearx.pruebabearx.PruebaBearx;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemBearx {
    //items
    public static final Item CAMARA = registerItem("camara",
            new Item(new FabricItemSettings().group(ItemGroupBearx.BEARXITEM)));

    public static final Item PLASTIC = registerItem("plastic",
            new Item(new FabricItemSettings().group(ItemGroupBearx.BEARXITEM)));

    public static final Item WET_PLASTIC = registerItem("wet_plastic",
            new Item(new FabricItemSettings().group(ItemGroupBearx.BEARXITEM)));

    //plush
    public static final Item PLUSH_SHARK = registerItem("plush_shark",
            new Item(new FabricItemSettings().group(ItemGroupBearx.BEARXPLUSH)));

    public static final Item PLUSH_AKITA = registerItem("plush_akita",
            new Item(new FabricItemSettings().group(ItemGroupBearx.BEARXPLUSH)));

    public static final Item PLUSH_DUCK = registerItem("plush_duck",
            new Item(new FabricItemSettings().group(ItemGroupBearx.BEARXPLUSH)));

    public static final Item PLUSH_JOSU = registerItem("plush_josu",
            new Item(new FabricItemSettings().group(ItemGroupBearx.BEARXPLUSH)));

    public static final Item PLUSH_RABBIT = registerItem("plush_rabbit",
            new Item(new FabricItemSettings().group(ItemGroupBearx.BEARXPLUSH)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(PruebaBearx.MOD_ID, name), item);
    }
    public static void registerModItems(){
        PruebaBearx.LOGGER.info("Registering Mod Items for " + PruebaBearx.MOD_ID);
    }
}
