package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.block.general.machineBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class blockEntities {
    public static final BlockEntityType<blockCuttingStationEntity> BLOCK_CUTTER_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Delbase.Delbase_ID, "block_cutting_station_entity"), FabricBlockEntityTypeBuilder.create(blockCuttingStationEntity::new, machineBlock.BLOCK_CUTTER_STATION).build());

    public static void registerAllBlockEntities() {
        Delbase.LOGGER.info("Registering BlockCutter");
    }
}