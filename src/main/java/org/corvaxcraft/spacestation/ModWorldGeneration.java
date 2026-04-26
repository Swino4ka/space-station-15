package org.corvaxcraft.spacestation;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public final class ModWorldGeneration {

    public static final RegistryKey<PlacedFeature> PLASMA_ORE_BLOCK_PLACED_KEY =
            RegistryKey.of(RegistryKeys.PLACED_FEATURE,
                    Identifier.of(SpaceStation.MOD_ID, "plasma_ore_block"));

    public static final RegistryKey<PlacedFeature> BANANIUM_ORE_BLOCK_PLACED_KEY =
            RegistryKey.of(RegistryKeys.PLACED_FEATURE,
                    Identifier.of(SpaceStation.MOD_ID, "bananium_ore_block"));

    public static final RegistryKey<PlacedFeature> URANIUM_ORE_BLOCK_PLACED_KEY =
            RegistryKey.of(RegistryKeys.PLACED_FEATURE,
                    Identifier.of(SpaceStation.MOD_ID, "uranium_ore_block"));

    private ModWorldGeneration() {}

    public static void init() {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                URANIUM_ORE_BLOCK_PLACED_KEY
        );

        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PLASMA_ORE_BLOCK_PLACED_KEY
        );

        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                BANANIUM_ORE_BLOCK_PLACED_KEY
        );
    }
}