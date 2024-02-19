package com.xiaoyue.celestial_core.content.effects;

import dev.xkmc.l2damagetracker.init.L2DamageTracker;
import dev.xkmc.l2library.util.math.MathHelper;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class CritRate extends MobEffect {
	public CritRate() {
		super(MobEffectCategory.BENEFICIAL, 0xd9d44a);
		this.addAttributeModifier(L2DamageTracker.CRIT_RATE.get(),
				MathHelper.getUUIDFromString("celestial_core:crit_rate_effect").toString(),
				0.1f, AttributeModifier.Operation.ADDITION);
	}
}
