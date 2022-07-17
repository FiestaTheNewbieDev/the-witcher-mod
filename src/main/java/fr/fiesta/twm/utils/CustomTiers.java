package fr.fiesta.twm.utils;

import fr.fiesta.twm.init.ItemInit;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum CustomTiers implements Tier {
    STEEL(2, 1561, 6.0F, 2.0F, 22, null, null),
    SILVER(2, 32, 6.0F, 2.0F, 22, null, null);

    private final int level;
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;
    @Nonnull
    private final TagKey<Block> tag;
    @Nonnull
    private final Supplier<Ingredient> repairIngredient;

    CustomTiers(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue,
                     @Nonnull TagKey<Block> tag, @Nonnull Supplier<Ingredient> repairIngredient)
    {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.tag = tag;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses()
    {
        return this.uses;
    }

    @Override
    public float getSpeed()
    {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus()
    {
        return this.attackDamageBonus;
    }

    @Override
    public int getLevel()
    {
        return this.level;
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantmentValue;
    }

    @Nonnull
    public TagKey<Block> getTag()
    {
        return this.tag;
    }

    @Nonnull
    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairIngredient.get();
    }

    @Override
    public String toString()
    {
        return "CustomTiers[" +
                "level=" + level + ", " +
                "uses=" + uses + ", " +
                "speed=" + speed + ", " +
                "attackDamageBonus=" + attackDamageBonus + ", " +
                "enchantmentValue=" + enchantmentValue + ", " +
                "tag=" + tag + ", " +
                "repairIngredient=" + repairIngredient + ']';
    }
}
