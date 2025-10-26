package net.p01sen.tutorialmod.item;


import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SlownessBlob extends Item {
    public SlownessBlob(Properties properties){
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand){
        ItemStack stack = player.getItemInHand(hand);

        if(!level.isClientSide){
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,100,1));

            if(!player.isCreative()){
                stack.shrink(1);
            }
        }
        return InteractionResultHolder.sidedSuccess(stack,level.isClientSide());
    }
}
