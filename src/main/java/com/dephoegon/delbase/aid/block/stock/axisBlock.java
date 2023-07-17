package com.dephoegon.delbase.aid.block.stock;

import net.minecraft.block.PillarBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.dephoegon.delbase.aid.util.kb.HCtrl;
import static com.dephoegon.delbase.aid.util.kb.HShift;

public class axisBlock extends PillarBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    public axisBlock(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(settings);
        if(normToolTip.equals("")) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.equals("")) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.equals("")) { tip2 = null; } else { tip2 = ctrlToolTip; }
    }
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> toolTip, TooltipContext options) {
        super.appendTooltip(stack, world, toolTip, options);
        if(!(HShift()) && !(HCtrl()) && tip0 != null) { toolTip.add(new TranslatableText(tip0)); } //if neither pressed, show tip0 (if not empty)
        if(HCtrl() && tip2 != null) { toolTip.add(new TranslatableText(tip2)); }//if ctrl, show tip2 (if not empty), do first
        if(HShift() && tip1 != null) { toolTip.add(new TranslatableText(tip1)); } //if shift, show tip1 (if not empty)
    }
}
