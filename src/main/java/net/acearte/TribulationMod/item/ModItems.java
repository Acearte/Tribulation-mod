package net.acearte.TribulationMod.item;

import net.acearte.TribulationMod.TribulationMod;
import net.acearte.TribulationMod.item.custom.MetalDetectorItem;
import net.minecraft.util.profiling.metrics.profiling.InactiveMetricsRecorder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.plaf.PanelUI;
import java.util.Objects;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TribulationMod.MOD_ID);

       public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    
    // Technologies
    public static final RegistryObject<Item> BOT_MODULE = ITEMS.register("bot_module",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONTROLLER = ITEMS.register("controller",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CIRCUIT = ITEMS.register("circuit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIRE = ITEMS.register("wire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BATTERY = ITEMS.register("battery",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWER_CELL = ITEMS.register("power_cell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFRADED_GLASSES = ITEMS.register("infraded_glasses",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LENSE = ITEMS.register("lense",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIOACTIVE_CELL = ITEMS.register("radioactive_cell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIOACTIVE_MODULE = ITEMS.register("radioactive_module",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUSHROOM_MODULE = ITEMS.register("mushroom_module",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROZEN_CORE = ITEMS.register("frozen_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROZEN_MODULE = ITEMS.register("frozen_module",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRANSFER_NODE = ITEMS.register("transfer_node",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRILL_CASE = ITEMS.register("drill_case",
            () -> new Item(new Item.Properties()));
    
    //GEMS
    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx",
            () -> new Item((new Item.Properties())));
    
    //RUBY MISC
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> RUBY_LED = ITEMS.register("ruby_led",
            () -> new Item(new Item.Properties()));
    
    //R.TOOLS
    public static final RegistryObject<Item> RUBY_LIGHTSABER = ITEMS.register("ruby_lightsaber",
            () -> new SwordItem(ModTiers.RUBY, 1, 1f, 
                    new Item.Properties()));
    
    //CITRINE MISC
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> CITRINE_ROD = ITEMS.register("citrine_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_LED = ITEMS.register("citrine_led",
            () -> new Item(new Item.Properties()));
    
    //C.TOOLS
    public static final RegistryObject<Item> CITRINE_BORE = ITEMS.register("citrine_bore",
            () -> new PickaxeItem(ModTiers.CITRINE, 1, 1f, 
                    new Item.Properties()));
    
    //SAPHIRE MISC
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LED = ITEMS.register("sapphire_led",
            () -> new Item(new Item.Properties()));
    
    //S.TOOLS
    public static final RegistryObject<Item> SAPPHIRE_HAMMER = ITEMS.register("sapphire_hammer",
            () -> new PickaxeItem(ModTiers.SAPPHIRE, 1, 1f,
                    new Item.Properties()));
    
    
    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
