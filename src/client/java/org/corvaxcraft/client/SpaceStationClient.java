package org.corvaxcraft.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.corvaxcraft.spacestation.ModBlocks;

public class SpaceStationClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WALL_GIRDER, RenderLayer.getCutout());
    }
}