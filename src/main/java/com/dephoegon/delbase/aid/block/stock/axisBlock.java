package com.dephoegon.delbase.aid.block.stock;

import net.minecraft.block.PillarBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.dephoegon.delbase.aid.util.kb.HCtrl;
import static com.dephoegon.delbase.aid.util.kb.HShift;

public class axisBlock extends PillarBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final boolean flame;
    public axisBlock(Settings settings, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames) {
        super(settings);

        if(normToolTip.equals("")) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.equals("")) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.equals("")) { tip2 = null; } else { tip2 = ctrlToolTip; }
        flame = flames;
    }
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> toolTip, TooltipContext context) {
        super.appendTooltip(stack, world, toolTip, context);
        if(!(HShift()) && !(HCtrl()) && tip0 != null) { toolTip.add(new TranslatableText(tip0)); } //if neither pressed, show tip0 (if not empty)
        if(HCtrl() && tip2 != null) { toolTip.add(new TranslatableText(tip2)); }//if ctrl, show tip2 (if not empty), do first
        if(HShift() && tip1 != null) { toolTip.add(new TranslatableText(tip1)); } //if shift, show tip1 (if not empty)
    }
}
