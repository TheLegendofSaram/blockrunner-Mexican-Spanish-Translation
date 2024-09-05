package fuzs.blockrunner.data;

import fuzs.blockrunner.init.ModRegistry;
import fuzs.puzzleslib.api.data.v2.core.DataProviderContext;
import fuzs.puzzleslib.api.data.v2.tags.AbstractTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

public class ModBlockTagsProvider extends AbstractTagProvider<Block> {

    public ModBlockTagsProvider(DataProviderContext context) {
        super(Registries.BLOCK, context);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {
        this.add(ModRegistry.VERY_SLOW_BLOCKS_BLOCK_TAG);
        this.add(ModRegistry.SLOW_BLOCKS_BLOCK_TAG);
        this.add(ModRegistry.SLIGHTLY_SLOW_BLOCKS_BLOCK_TAG);
        this.add(ModRegistry.SLIGHTLY_QUICK_BLOCKS_BLOCK_TAG);
        this.add(ModRegistry.QUICK_BLOCKS_BLOCK_TAG);
        this.add(ModRegistry.VERY_QUICK_BLOCKS_BLOCK_TAG);
    }
}
