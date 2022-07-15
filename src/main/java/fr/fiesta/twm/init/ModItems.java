package fr.fiesta.twm.init;

import fr.fiesta.twm.TWM;
import fr.fiesta.twm.utils.CustomItemTiers;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TWM.MODID);

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", ()-> new Item(new Item.Properties().group(ModItemGroups.TWM_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.TWM_TAB)));

    public static final RegistryObject<Item> HANDLE = ITEMS.register("handle", ()-> new Item(new Item.Properties().group(ModItemGroups.TWM_TAB)));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", ()-> new SwordItem(CustomItemTiers.SILVER, 3, -2.4F, new Item.Properties().maxStackSize(1).group(ModItemGroups.TWM_TAB)));

    public static final RegistryObject<BlockItem> SILVER_ORE = ITEMS.register("silver_ore_item", ()-> new BlockItem(ModBlocks.SILVER_ORE.get(), new Item.Properties().group(ModItemGroups.TWM_TAB)));
}
