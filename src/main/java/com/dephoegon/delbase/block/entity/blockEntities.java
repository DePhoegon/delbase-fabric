package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.block.general.machineBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class blockEntities {
    public static BlockEntityType<blockCuttingStationEntity> BLOCK_CUTTER_ENTITY;

    public static void registerAllBlockEntities() {
        BLOCK_CUTTER_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Delbase.Delbase_ID, "block_cutting_station_entity"),
                FabricBlockEntityTypeBuilder.create(blockCuttingStationEntity::new, machineBlock.BLOCK_CUTTER_BLOCK).build(null));
    }
}
