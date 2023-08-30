package com.dephoegon.delbase.aid.world;

import com.dephoegon.delbase.Delbase;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;

import static com.dephoegon.delbase.aid.world.defaultVariables.*;

@Config(id = Delbase.Delbase_ID+"-config")
public class config {
    @Configurable
    @Configurable.Comment("The number of seconds it takes to craft a station")
    @Configurable.Range(min = 10, max = 100)
    public int stationCraftTime = dSTATION_CRAFT_TIME.getDefault();

    @Configurable
    @Configurable.Comment("The number of rolls for wood salvage")
    @Configurable.Range(min = 1, max = 4)
    public int woodSalvageRolls = dWOOD_SALVAGE_ROLLS.getDefault();

    @Configurable
    @Configurable.Comment("The number of rolls for stone salvage")
    @Configurable.Range(min = 1, max = 4)
    public int stoneSalvageRolls = dSTONE_SALVAGE_ROLLS.getDefault();

    @Configurable
    @Configurable.Comment("The number of rolls for netherite salvage")
    @Configurable.Range(min = 1, max = 4)
    public int netherriteBonusRolls = dNETHERITE_BONUS_ROLLS.getDefault();

    @Configurable
    @Configurable.Comment("The number of bonus diamonds for netherite chestplate")
    @Configurable.Range(min = 1, max = 5)
    public int netherriteChestDiamondBonus = dNETHERITE_CHEST_DIAMOND_BONUS.getDefault();

    @Configurable
    @Configurable.Comment("The number of bonus diamonds for netherite helmet")
    @Configurable.Range(min = 1, max = 4)
    public int netherriteHelmetDiamondBonus = dNETHERITE_HELMET_DIAMOND_BONUS.getDefault();

    @Configurable
    @Configurable.Comment("The number of bonus diamonds for netherite leggings")
    @Configurable.Range(min = 1, max = 5)
    public int netherriteLeggingsDiamondBonus = dNETHERITE_LEGGINGS_DIAMOND_BONUS.getDefault();

    @Configurable
    @Configurable.Comment("The number of bonus diamonds for netherite boots")
    @Configurable.Range(min = 1, max = 3)
    public int netherriteBootsDiamondBonus = dNETHERITE_BOOTS_DIAMOND_BONUS.getDefault();

    @Configurable
    @Configurable.Comment("The number of bonus diamonds for netherite sword")
    @Configurable.Range(min = 1, max = 3)
    public int netherriteSwordDiamondBonus = dNETHERITE_SWORD_DIAMOND_BONUS.getDefault();

    @Configurable
    @Configurable.Comment("The number of bonus diamonds for netherite axe")
    @Configurable.Range(min = 1, max = 3)
    public int netherriteAxeDiamondBonus = dNETHERITE_AXE_DIAMOND_BONUS.getDefault();

    @Configurable
    @Configurable.Comment("The number of bonus diamonds for netherite pickaxe")
    @Configurable.Range(min = 1, max = 3)
    public int netherritePickAxeDiamondBonus = dNETHERITE_PICKAXE_DIAMOND_BONUS.getDefault();
}