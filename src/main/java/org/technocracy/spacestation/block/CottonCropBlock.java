package org.technocracy.spacestation.block;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import org.technocracy.spacestation.registry.items.PlantItems;

public class CottonCropBlock extends CropBlock {
    public CottonCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return PlantItems.COTTON_SEEDS;
    }
}
