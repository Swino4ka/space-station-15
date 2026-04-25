package org.corvaxcraft.spacestation;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModItems {
    public static final Item BANANIUM = Registry.register(
            Registries.ITEM,
            Identifier.of(SpaceStation.MOD_ID, "bananium"),
            new Item(new Item.Settings().food(
                    new FoodComponent.Builder()
                            .nutrition(2) // сколько восстанавливает голода
                            .saturationModifier(0.3f) // насыщение
                            .statusEffect(
                                    new StatusEffectInstance(StatusEffects.POISON, 30, 4), // 10 секунд
                                    1.0f // шанс (1.0 = 100%)
                            )
                            .build()
            ))
    );
    public static final Item TELECRYSTAL = register("telecrystal");
    public static final Item STEEL_ORE = register("steel_ore");
    public static final Item URANIUM_ORE = register("uranium_ore");
    public static final Item STEEL = register("steel");
    public static final Item ROD = register("rod");
    public static final Item PLASTIC = register("plastic");
    public static final Item ID_CARD = register("id_card");

    private ModItems() {}

    private static Item register(String name) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(SpaceStation.MOD_ID, name),
                new Item(new Item.Settings())
        );
    }

    public static void register() {
    }
}