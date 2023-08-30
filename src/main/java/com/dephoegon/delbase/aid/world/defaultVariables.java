package com.dephoegon.delbase.aid.world;

public enum defaultVariables {
    dSTATION_CRAFT_TIME(10, 50, 100),
    dWOOD_SALVAGE_ROLLS(1, 2, 4),
    dSTONE_SALVAGE_ROLLS(1, 2, 4),
    dNETHERITE_BONUS_ROLLS(1, 2, 4),
    dNETHERITE_CHEST_DIAMOND_BONUS(1, 3, 5),
    dNETHERITE_HELMET_DIAMOND_BONUS(1, 2, 4),
    dNETHERITE_LEGGINGS_DIAMOND_BONUS(1, 3, 5),
    dNETHERITE_BOOTS_DIAMOND_BONUS(1, 1, 3),
    dNETHERITE_SWORD_DIAMOND_BONUS(1, 1, 3),
    dNETHERITE_AXE_DIAMOND_BONUS(1, 1, 3),
    dNETHERITE_PICKAXE_DIAMOND_BONUS(1, 1, 3);
    private final int Min;
    private final int Default;
    private final int Max;
    defaultVariables(int Minimum, int Default, int Maximum) {
        this.Min = Minimum;
        this.Default = Default;
        this.Max = Maximum;
    }
    public int getMin() { return this.Min; }
    public int getDefault() { return this.Default; }
    public int getMax() { return this.Max; }
}