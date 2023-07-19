package com.dephoegon.delbase.screen;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.inventory.listArrays;
import com.dephoegon.delbase.block.entity.blockCuttingStationEntity;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.dephoegon.delbase.item.BlockCutterItems.*;

public class blockCuttingStationScreen extends HandledScreen<blockCuttingStationScreenHandler> {
    private static final Identifier EMPTY_TEXTURE =
            new Identifier(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_empty.png");
    private static final Identifier COMPOUND_TEXTURE =
            new Identifier(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_compound.png");
    private static final Identifier PLANS_WALL_TEXTURE =
            new Identifier(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_wall.png");
    private static final Identifier PLANS_SLAB_TEXTURE =
            new Identifier(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_slab.png");
    private static final Identifier PLANS_STAIR_TEXTURE =
            new Identifier(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_stair.png");
    private static final Identifier PLANS_FENCE_TEXTURE =
            new Identifier(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_fence.png");
    private static final Identifier PLANS_FENCE_GATE_TEXTURE =
            new Identifier(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_fence_gate.png");
    public blockCuttingStationScreen(blockCuttingStationScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    protected void  init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) /2 ;

    }
    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionShader);
        RenderSystem.setShaderColor(1.0F,1.0F,1.0F,1.0F);
        Item item = handler.getSlot(blockCuttingStationEntity.planSlot).getStack().getItem();
        if (listArrays.getFullPlanSlotArray().contains(item)) {
            if (item == WALL_PLANS.asItem()) { RenderSystem.setShaderTexture(0, PLANS_WALL_TEXTURE); }
            if (item == FENCE_PLANS.asItem()) { RenderSystem.setShaderTexture(0, PLANS_FENCE_TEXTURE); }
            if (item == FENCE_GATE_PLANS.asItem()) { RenderSystem.setShaderTexture(0, PLANS_FENCE_GATE_TEXTURE); }
            if (item == SLAB_PLANS.asItem()) { RenderSystem.setShaderTexture(0, PLANS_SLAB_TEXTURE); }
            if (item == STAIR_PLANS.asItem()) { RenderSystem.setShaderTexture(0, PLANS_STAIR_TEXTURE); }
            if (item == ARMOR_COMPOUND.asItem()) { RenderSystem.setShaderTexture(0, COMPOUND_TEXTURE); }
        } else { RenderSystem.setShaderTexture(0, EMPTY_TEXTURE); }
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) /2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float delta) {
        renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrixStack, mouseX, mouseY);
    }
}
