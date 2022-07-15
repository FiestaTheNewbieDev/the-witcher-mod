package fr.fiesta.twm.init;

import fr.fiesta.twm.TWM;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TWM.MODID);

    public static final RegistryObject<Block> SILVER_ORE = createBlock("silver_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f, 3f).harvestTool(ToolType.PICKAXE).harvestLevel(2).func_235861_h_()));

    public static final RegistryObject<Block> METEORITE_ORE = createBlock("meteorite_ore", ()-> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f, 3f).harvestTool(ToolType.PICKAXE).harvestLevel(2).func_235861_h_()));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
