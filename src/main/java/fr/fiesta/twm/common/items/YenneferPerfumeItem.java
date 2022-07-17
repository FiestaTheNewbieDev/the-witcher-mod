package fr.fiesta.twm.common.items;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import java.util.List;

public class YenneferPerfumeItem extends Item {
    public YenneferPerfumeItem(Item.Properties builder) {
        super(builder);
    }

    @Override
    public void appendHoverText(ItemStack item, Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(new TranslatableComponent("tooltip.twm.yennefer_perfume.desc"));
        super.appendHoverText(item, level, tooltip, flag);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        player.getCooldowns().addCooldown(this, 200);
        player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100));
        return super.use(level, player, hand);
    }
}
