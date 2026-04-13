package com.glektarssza.expanded_gamerules.mixins.minecraft.world.entity;

import net.minecraft.world.entity.Attackable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.waypoints.WaypointTransmitter;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity
    implements Attackable, WaypointTransmitter {
    protected LivingEntityMixin(EntityType<? extends LivingEntity> entityType,
        Level level) {
        super(entityType, level);
    }

    @Inject(method = "canBeSeenAsEnemy", at = @At("RETURN"), cancellable = true)
    public void canBeSeenAsEnemy$adjustReturnValueForPlayers(
        CallbackInfoReturnable<Boolean> cir) {
        if (!((Entity) this instanceof Player)) {
            return;
        }
        cir.setReturnValue(false);
    }
}
