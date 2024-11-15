package net.acearte.TribulationMod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier SAPPHIRE = new ForgeTier(2,670,50f,
            2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.SAPPHIRE.get()));
    public static final ForgeTier CITRINE = new ForgeTier(2,1300,50f,
            2f, 22, BlockTags.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.CITRINE.get()));
}
