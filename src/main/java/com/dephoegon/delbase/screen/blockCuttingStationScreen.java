package com.dephoegon.delbase.screen;

public class blockCuttingStationScreen  {
    // extends HandledScreen<blockCuttingStationScreenHandler>
    /*
    private static final Identifier EMPTY_TEXTURE = Identifier.of(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_empty.png");
    private static final Identifier COMPOUND_TEXTURE = Identifier.of(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_compound.png");
    private static final Identifier PLANS_WALL_TEXTURE = Identifier.of(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_wall.png");
    private static final Identifier PLANS_SLAB_TEXTURE = Identifier.of(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_slab.png");
    private static final Identifier PLANS_STAIR_TEXTURE = Identifier.of(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_stair.png");
    private static final Identifier PLANS_FENCE_TEXTURE = Identifier.of(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_fence.png");
    private static final Identifier PLANS_FENCE_GATE_TEXTURE = Identifier.of(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_fence_gate.png");
    public blockCuttingStationScreen(blockCuttingStationScreenHandler handler, PlayerInventory inventory, Text title) { super(handler, inventory, title); }

    protected void  init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title))/2;
    }
    @Override
    protected void drawBackground(@NotNull DrawContext context, float delta, int mouseX, int mouseY) {
        Item item = handler.getSlot(blockCuttingStationEntity.planSlot).getStack().getItem();
        Identifier HOLD = getIdentifier(item);

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F,1.0F,1.0F,1.0F);
        RenderSystem.setShaderTexture(0, HOLD);

        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) /2;
        context.drawTexture(HOLD, x, y, 0, 0, backgroundWidth, backgroundHeight);
        drawProgress(context, x, y, HOLD);
    }
    private void drawProgress(DrawContext context, int x, int y, Identifier texture) {
        if (handler.isCrafting()) { context.drawTexture(texture, x+102, y+41, 176, 0,8, handler.getScaledProgress()); }
    }
    @NotNull
    private static Identifier getIdentifier(@NotNull Item item) {
        Identifier HOLD;
        if (item.equals(WALL_PLANS)) { HOLD = PLANS_WALL_TEXTURE; }
        else if (item.equals(FENCE_PLANS)) { HOLD = PLANS_FENCE_TEXTURE; }
        else if (item.equals(FENCE_GATE_PLANS)) { HOLD = PLANS_FENCE_GATE_TEXTURE; }
        else if (item.equals(SLAB_PLANS)) { HOLD = PLANS_SLAB_TEXTURE; }
        else if (item.equals(STAIR_PLANS)) { HOLD = PLANS_STAIR_TEXTURE; }
        else if (item.equals(ARMOR_COMPOUND)) { HOLD = COMPOUND_TEXTURE; }
        else { HOLD = EMPTY_TEXTURE; }
        return HOLD;
    }

    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
    */
}