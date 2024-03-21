package com.dephoegon.delbase.mixin;

import com.dephoegon.delbase.aid.block.stock.modSandBlock;
import com.dephoegon.delbase.aid.util.blockArrayList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.block.Blocks.RED_SAND;
import static net.minecraft.block.Blocks.SAND;
import static net.minecraft.block.FallingBlock.canFallThrough;

@Mixin(FallingBlock.class)
public class FallingBlockMixin extends Block {
    public FallingBlockMixin(Settings settings) { super(settings); }
    /**
     * @author
     * DePhoegon
     * @reason
     * Moves Falling Control into FallingBlocks with Targeted Controls & passing through other gravity blocks as normal.
     * Unable to achieve total bypass by injection & Redirection is not suited as it would be falling by that point already.
     */
    @SuppressWarnings({"deprecation", "JavadocDeclaration"})
    @Overwrite
    public void scheduledTick(@NotNull BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!FallingBlock.canFallThrough(world.getBlockState(pos.down())) || pos.getY() < world.getBottomY()) { return; }
        if (targetedGravityBlock(state.getBlock())) {
            boolean falls = !(state.getBlock() instanceof modSandBlock mod) || mod.getFall();
            if (falls) {
                if (gravity(world, pos) && pos.getY() > world.getBottomY()) {
                    FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
                    this.configureFallingBlockEntity(fallingBlockEntity, null);
                }
            }
            return;
        }
        if (canFallThrough(world.getBlockState(pos.down())) && pos.getY() >= world.getBottomY()) {
            FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
            this.configureFallingBlockEntity(fallingBlockEntity, null);
        }
    }
    @Unique
    private boolean targetedGravityBlock(Block block) {
        return block instanceof SandBlock;
    }
    @Inject(method = "configureFallingBlockEntity", at = @At("HEAD"))
    protected void configureFallingBlockEntity(FallingBlockEntity entity, CallbackInfo ci) {
    }
    @Unique
    private boolean gravity(ServerWorld worldIn, @NotNull BlockPos pos) {
        boolean t_fall;
        boolean airOrFallthrough;
        boolean hld;
            hld = spider(pos.up(), worldIn, 0);
            airOrFallthrough = worldIn.getBlockState(pos.down()).isAir() || canFallThrough(worldIn.getBlockState(pos.down()));
            if (hld) { t_fall = false; } else { t_fall = airOrFallthrough; }
        return t_fall;
    }
    @Unique
    private boolean spider(BlockPos pos, @NotNull ServerWorld worldIn, int count) {
        boolean last;
        int l_count = count+1;
        Block bob = worldIn.getBlockState(pos).getBlock();
        if (blockArrayList.checkFallLock(bob)) { last = true; }
        else if (gravMatch(bob) && l_count < 7) { last = spider(pos.up(), worldIn, l_count); }
        else { last = false; }
        return last;
    }
    @Unique
    private boolean gravMatch(@NotNull Block block) { return block.getDefaultState() == SAND.getDefaultState() || block.getDefaultState() == RED_SAND.getDefaultState() || block instanceof modSandBlock; }
}
