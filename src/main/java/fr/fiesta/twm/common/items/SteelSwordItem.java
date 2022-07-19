package fr.fiesta.twm.common.items;

import fr.fiesta.twm.utils.CustomTags;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import java.util.List;

public class SteelSwordItem extends SwordItem {

    public SteelSwordItem(Tier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack item, Level level, List<Component> tooltip, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableComponent("tooltip.twm.steel_sword.desc"));
        } else {
            tooltip.add(new TranslatableComponent("tooltip.twm.press_shift"));
        }
        super.appendHoverText(item, level, tooltip, flag);
    }

    @Override
    public boolean hurtEnemy(ItemStack item, LivingEntity target, LivingEntity attacker) {
        boolean temp = Registry.ENTITY_TYPE.getHolderOrThrow(Registry.ENTITY_TYPE.getResourceKey(target.getType()).get()).is(CustomTags.EntityTypes.MONSTERS_TAG);
        if(!temp) {
            target.hurt(DamageSource.GENERIC, item.getMaxDamage()/2);
        }
        return super.hurtEnemy(item, target, attacker);
    }
}
