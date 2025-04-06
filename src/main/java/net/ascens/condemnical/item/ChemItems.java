package net.ascens.condemnical.item;

import net.ascens.condemnical.Condemnical;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ChemItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Condemnical.MOD_ID);

    //Vials
    public static final DeferredItem<Item> EMPTY_VIAL = ITEMS.register("empty_vial", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HYDROGEN_VIAL = ITEMS.register("hydrogen_gas_vial", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HELIUM_VIAL = ITEMS.register("helium_gas_vial", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_VIAL = ITEMS.register("lithium_solid_vial", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_VIAL = ITEMS.register("beryllium_solid_vial", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
