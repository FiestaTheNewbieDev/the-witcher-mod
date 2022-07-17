package fr.fiesta.twm.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemGroupInit {

    public static final CreativeModeTab TWM_TAB = new CreativeModeTab("twm_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.SILVER_SWORD.get());
        }
    };

}
