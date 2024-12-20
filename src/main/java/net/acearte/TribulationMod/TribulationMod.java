package net.acearte.TribulationMod;

import com.mojang.logging.LogUtils;
import net.acearte.TribulationMod.block.ModBlocks;
import net.acearte.TribulationMod.item.ModCreativeModeTabs;
import net.acearte.TribulationMod.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TribulationMod.MOD_ID)
public class TribulationMod {
    public static final String MOD_ID = "tribulationmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TribulationMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.RAW_SAPPHIRE);

            event.accept(ModItems.BOT_MODULE);
            event.accept(ModItems.CONTROLLER);
            event.accept(ModItems.CIRCUIT);
            event.accept(ModItems.RUBY_LED);
            event.accept(ModItems.WIRE);
            event.accept(ModItems.BATTERY);
            event.accept(ModItems.POWER_CELL);
            event.accept(ModItems.INFRADED_GLASSES);
            event.accept(ModItems.LENSE);
            event.accept(ModItems.RADIOACTIVE_CELL);

            event.accept(ModItems.SAPPHIRE_LED);

            event.accept(ModItems.CITRINE_LED);
            event.accept(ModItems.CITRINE_ROD);
            event.accept(ModItems.RADIOACTIVE_MODULE);

            // GEMS
            event.accept(ModItems.RUBY);
            event.accept(ModItems.CITRINE);
            event.accept(ModItems.MOONSTONE);
            event.accept(ModItems.ONYX);

        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.SAPPHIRE_HAMMER);
            event.accept(ModItems.METAL_DETECTOR);

        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
