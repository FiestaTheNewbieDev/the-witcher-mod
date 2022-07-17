package fr.fiesta.twm.init;

import fr.fiesta.twm.TWM;
import fr.fiesta.twm.common.items.SilverSwordItem;
import fr.fiesta.twm.common.items.SteelSwordItem;
import fr.fiesta.twm.common.items.YenneferPerfumeItem;
import fr.fiesta.twm.utils.CustomTiers;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TWM.MODID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ()-> new Item(new Item.Properties().tab(ItemGroupInit.TWM_TAB)));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", ()-> new Item(new Item.Properties().tab(ItemGroupInit.TWM_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ()-> new Item(new Item.Properties().tab(ItemGroupInit.TWM_TAB)));

    public static final RegistryObject<Item> RAW_METEORITE = ITEMS.register("raw_meteorite", ()-> new Item(new Item.Properties().tab(ItemGroupInit.TWM_TAB)));
    public static final RegistryObject<Item> METEORITE_INGOT = ITEMS.register("meteorite_ingot", ()-> new Item(new Item.Properties().tab(ItemGroupInit.TWM_TAB)));

    public static final RegistryObject<Item> METEORITE_SILVER_INGOT = ITEMS.register("meteorite_silver_ingot", ()-> new Item(new Item.Properties().tab(ItemGroupInit.TWM_TAB)));

    public static final RegistryObject<Item> HANDLE = ITEMS.register("handle", ()-> new Item(new Item.Properties().tab(ItemGroupInit.TWM_TAB)));

    public static final RegistryObject<Item> PERFUME_BOTTLE = ITEMS.register("perfume_bottle", ()-> new Item(new Item.Properties().tab(ItemGroupInit.TWM_TAB).stacksTo(1)));
    public static final RegistryObject<YenneferPerfumeItem> YENNEFER_PERFUME = ITEMS.register("yennefer_perfume", ()-> new YenneferPerfumeItem(new Item.Properties().tab(ItemGroupInit.TWM_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GOOSEBERRIES = ITEMS.register("gooseberries", ()-> new Item(new Item.Properties().tab(ItemGroupInit.TWM_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build())));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", ()-> new SteelSwordItem(CustomTiers.STEEL, 3, -2.4F, new Item.Properties().stacksTo(1).tab(ItemGroupInit.TWM_TAB)));
    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", ()-> new SilverSwordItem(CustomTiers.SILVER, 3, -2.4F, new Item.Properties().stacksTo(1).tab(ItemGroupInit.TWM_TAB)));
}
