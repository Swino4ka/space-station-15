package org.corvaxcraft.spacestation;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public final class ModBlocks {
    public static final Block TELECRYSTAL_BLOCK = register(
            "telecrystal_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .strength(1.5f)
                    .requiresTool(),
            true
    );

    public static final Block WALL_GIRDER = register(
            "wall_girder",
            Block::new,
            AbstractBlock.Settings.create()
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHAIN)
                    .nonOpaque(),
            true

    );

    public static final Block STEEL_TILE = register(
            "steel_tile",
            Block::new,
            AbstractBlock.Settings.create()
                    .strength(1.5f, 6.0f)
                    .requiresTool(),
            true
    );

    public static final Block STEEL_WALL = register(
            "steel_wall",
            Block::new,
            AbstractBlock.Settings.create()
                    .strength(1.5f, 6.0f)
                    .requiresTool(),
            true
    );

    public static final Block URANIUM_ORE_BLOCK = register(
            "uranium_ore_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .strength(3.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE),
            true
    );

    private ModBlocks() {}

    public static void register() {
        // См. комментарий в ModItems
    }

    private static <T extends Block> T register(
            String name,
            Function<AbstractBlock.Settings, T> factory,
            AbstractBlock.Settings settings,
            boolean registerBlockItem
    ) {
        Identifier id = Identifier.of(SpaceStation.MOD_ID, name);
        T block = factory.apply(settings);
        Registry.register(Registries.BLOCK, id, block);

        if (registerBlockItem) {
            Registry.register(Registries.ITEM, id, new BlockItem(block, new Item.Settings()));
        }

        return block;
    }
}