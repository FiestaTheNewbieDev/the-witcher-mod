package fr.fiesta.twm.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {

    public static final ItemGroup TWM_TAB = new ItemGroup("twm_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.SILVER_SWORD.get());
        }
    };

}
