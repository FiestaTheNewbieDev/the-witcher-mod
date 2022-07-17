package fr.fiesta.twm.init;

import fr.fiesta.twm.TWM;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TWM.MODID);



    public static final RegistryObject<Block> SILVER_ORE = createBlock("silver_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)), ItemGroupInit.TWM_TAB);
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = createBlock("deepslate_silver_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)), ItemGroupInit.TWM_TAB);

    public static final RegistryObject<Block> METEORITE_ORE = createBlock("meteorite_ore", ()-> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f, 3f).requiresCorrectToolForDrops()), ItemGroupInit.TWM_TAB);
    public static final RegistryObject<Block> DEEPSLATE_METEORITE_ORE = createBlock("deepslate_meteorite_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)), ItemGroupInit.TWM_TAB);
    private static <T extends Block> RegistryObject<T> createBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        createBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> createBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}
