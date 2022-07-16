package fr.fiesta.twm.common.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.DamageSource;

public class SilverSwordItem extends SwordItem {
    public SilverSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties p_i48460_4_) {
        super(tier, attackDamageIn, attackSpeedIn, p_i48460_4_);
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target instanceof MonsterEntity) {
            target.attackEntityFrom(DamageSource.GENERIC, stack.getMaxDamage()/2);
        }
        return super.hitEntity(stack, target, attacker);
    }
}
