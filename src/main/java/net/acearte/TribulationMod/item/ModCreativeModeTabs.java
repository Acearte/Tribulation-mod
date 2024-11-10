package net.acearte.TribulationMod.item;

import net.acearte.TribulationMod.TribulationMod;
import net.acearte.TribulationMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TribulationMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TRIBULATION_TAB = CREATIVE_MODE_TABS.register("tribulation_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RADIOACTIVE_CELL.get()))
                    .title(Component.translatable("creativetab.tribulation_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        //pOutput.accept(Items.DIAMOND);
                        //Technologies
                        pOutput.accept(ModItems.BOT_MODULE.get());
                        pOutput.accept(ModItems.CONTROLLER.get());
                        pOutput.accept(ModItems.CIRCUIT.get());
                        pOutput.accept(ModItems.RUBY_LED.get());
                        pOutput.accept(ModItems.WIRE.get());
                        pOutput.accept(ModItems.BATTERY.get());
                        pOutput.accept(ModItems.POWER_CELL.get());
                        pOutput.accept(ModItems.INFRADED_GLASSES.get());
                        pOutput.accept(ModItems.LENSE.get());
                        pOutput.accept(ModItems.RADIOACTIVE_CELL.get());
                        pOutput.accept(ModItems.CITRINE_LED.get());
                        pOutput.accept(ModItems.SAPPHIRE_LED.get());
                        pOutput.accept(ModItems.SAPPHIRE_HAMMER.get());
                        pOutput.accept(ModItems.CITRINE_ROD.get());
                        pOutput.accept(ModItems.RADIOACTIVE_MODULE.get());

                        //GEMS
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.CITRINE.get());
                        pOutput.accept(ModItems.MOONSTONE.get());
                        pOutput.accept(ModItems.ONYX.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
