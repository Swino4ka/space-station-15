package org.corvaxcraft.spacestation;

import net.fabricmc.api.ModInitializer;

public class SpaceStation implements ModInitializer {
    public static final String MOD_ID = "spacestation";

    @Override
    public void onInitialize() {
        ModItems.register();
        ModBlocks.register();
        ModItemGroups.register();
        ModWorldGeneration.init();
    }
}