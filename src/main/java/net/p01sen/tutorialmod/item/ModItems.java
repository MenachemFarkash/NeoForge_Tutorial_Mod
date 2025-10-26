package net.p01sen.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.p01sen.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MODID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPEED_BLOB = ITEMS.register("speed_blob",
            ()-> new SpeedBlob(new Item.Properties()));
    public static final DeferredItem<Item> SLOWNESS_BLOB = ITEMS.register("slowness_blob",
            ()-> new SlownessBlob(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
