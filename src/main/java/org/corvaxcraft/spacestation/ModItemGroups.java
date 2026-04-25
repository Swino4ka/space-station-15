package org.corvaxcraft.spacestation;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public final class ModItemGroups {
    public static final ItemGroup CONTENT = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(SpaceStation.MOD_ID, "content"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.STEEL))
                    .displayName(Text.translatable("itemGroup.spacestation.content"))
                    .entries((context, entries) -> {
                        entries.add(ModItems.BANANIUM);
                        entries.add(ModItems.TELECRYSTAL);
                        entries.add(ModBlocks.TELECRYSTAL_BLOCK.asItem());
                        entries.add(ModBlocks.WALL_GIRDER.asItem());
                        entries.add(ModBlocks.STEEL_TILE.asItem());
                        entries.add(ModBlocks.STEEL_WALL.asItem());
                        entries.add(ModBlocks.URANIUM_ORE_BLOCK.asItem());
                        entries.add(ModItems.URANIUM_ORE);
                        entries.add(ModItems.STEEL_ORE);
                        entries.add(ModItems.STEEL);
                        entries.add(ModItems.ROD);
                        entries.add(ModItems.PLASTIC);
                        entries.add(ModItems.ID_CARD);
                    })
                    .build()
    );

    private ModItemGroups() {}

    public static void register() {
        // Ничего не нужно делать
    }
}