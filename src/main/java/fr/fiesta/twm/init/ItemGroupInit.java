package fr.fiesta.twm.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupInit {

    public static final ItemGroup TWM_TAB = new ItemGroup("twm_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.SILVER_SWORD.get());
        }
    };

}
