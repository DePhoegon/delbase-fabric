package com.dephoegon.delbase.compat;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.recipe.cutterRecipe;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;

import static com.dephoegon.delbase.block.general.machineBlock.BLOCK_CUTTER_STATION;

public class cutterCategory implements DisplayCategory<BasicDisplay> {
    public static final Identifier TEXTURE = Identifier.of(Delbase.Delbase_ID, "textures/gui/block_cutting_station_gui_jei.png");
    public static final CategoryIdentifier<cutterDisplay> CUTTER_DISPLAY_CATEGORY_IDENTIFIER = CategoryIdentifier.of(Delbase.Delbase_ID, cutterRecipe.id_name);


    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return CUTTER_DISPLAY_CATEGORY_IDENTIFIER;
    }

    @Override
    public Text getTitle() {
        return Text.literal(cutterRecipe.id_name);
    }

    @Override
    public Renderer getIcon() { return EntryStacks.of(BLOCK_CUTTER_STATION.asItem().getDefaultStack()); }

    public int getDisplayHeight() {
        return 70; // 76x70
    }
    public List<Widget> setupDisplay(@NotNull BasicDisplay display, Rectangle bounds) {
        List<Widget> widgets = new LinkedList<>();

        // Texture is 76, 70 custom
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(76, 70)));
        widgets.add(Widgets.createSlot(new Point(8, 6)).entries(display.getInputEntries().getFirst()).markInput());
        widgets.add(Widgets.createSlot(new Point(53, 6)).entries(display.getInputEntries().get(1)).markInput());
        widgets.add(Widgets.createSlot(new Point(30, 46)).entries(display.getOutputEntries().getFirst()).markOutput());

        return widgets;
    }
}