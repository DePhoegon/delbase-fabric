package com.dephoegon.delbase.aid.block.alt;

public class craftingStationBlock {
    // extends BlockWithEntity implements BlockEntityProvider
    /*
    public static final MapCodec<craftingStationBlock> CODEC = craftingStationBlock.createCodec(craftingStationBlock::new);
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public craftingStationBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    private static final VoxelShape NORTH_SHAPE = Stream.of(
            Block.createCuboidShape(2, 0, 11, 14, 12, 14),
            Block.createCuboidShape(2, 0, 0.5, 14, 2, 10.5),
            Block.createCuboidShape(15, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 0, 15, 1, 16, 16),
            Block.createCuboidShape(0, 0, 0, 1, 16, 1),
            Block.createCuboidShape(15, 0, 0, 16, 16, 1),
            Block.createCuboidShape(1, 13, 15, 15, 14, 16),
            Block.createCuboidShape(1, 13, 0, 15, 14, 10),
            Block.createCuboidShape(1, 4, 0, 15, 4.5, 10),
            Block.createCuboidShape(15, 13, 1, 16, 14, 15),
            Block.createCuboidShape(0, 13, 1, 1, 14, 15),
            Block.createCuboidShape(15, 0, 9, 16, 6, 10),
            Block.createCuboidShape(0, 0, 9, 1, 6, 10)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SOUTH_SHAPE = Stream.of(
            Block.createCuboidShape(2, 0, 2, 14, 12, 5),
            Block.createCuboidShape(2, 0, 5.5, 14, 2, 15.5),
            Block.createCuboidShape(0, 0, 0, 1, 16, 1),
            Block.createCuboidShape(15, 0, 0, 16, 16, 1),
            Block.createCuboidShape(15, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 0, 15, 1, 16, 16),
            Block.createCuboidShape(1, 13, 0, 15, 14, 1),
            Block.createCuboidShape(1, 13, 6, 15, 14, 16),
            Block.createCuboidShape(1, 4, 6, 15, 4.5, 16),
            Block.createCuboidShape(0, 13, 1, 1, 14, 15),
            Block.createCuboidShape(15, 13, 1, 16, 14, 15),
            Block.createCuboidShape(0, 0, 6, 1, 6, 7),
            Block.createCuboidShape(15, 0, 6, 16, 6, 7)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape EAST_SHAPE = Stream.of(
            Block.createCuboidShape(2, 0, 2, 5, 12, 14),
            Block.createCuboidShape(5.5, 0, 2, 15.5, 2, 14),
            Block.createCuboidShape(0, 0, 15, 1, 16, 16),
            Block.createCuboidShape(0, 0, 0, 1, 16, 1),
            Block.createCuboidShape(15, 0, 0, 16, 16, 1),
            Block.createCuboidShape(15, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 13, 1, 1, 14, 15),
            Block.createCuboidShape(6, 13, 1, 16, 14, 15),
            Block.createCuboidShape(6, 4, 1, 16, 4.5, 15),
            Block.createCuboidShape(1, 13, 15, 15, 14, 16),
            Block.createCuboidShape(1, 13, 0, 15, 14, 1),
            Block.createCuboidShape(6, 0, 15, 7, 6, 16),
            Block.createCuboidShape(6, 0, 0, 7, 6, 1)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape WEST_SHAPE = Stream.of(
            Block.createCuboidShape(11, 0, 2, 14, 12, 14),
            Block.createCuboidShape(0.5, 0, 2, 10.5, 2, 14),
            Block.createCuboidShape(15, 0, 0, 16, 16, 1),
            Block.createCuboidShape(15, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 0, 15, 1, 16, 16),
            Block.createCuboidShape(0, 0, 0, 1, 16, 1),
            Block.createCuboidShape(15, 13, 1, 16, 14, 15),
            Block.createCuboidShape(0, 13, 1, 10, 14, 15),
            Block.createCuboidShape(0, 4, 1, 10, 4.5, 15),
            Block.createCuboidShape(1, 13, 0, 15, 14, 1),
            Block.createCuboidShape(1, 13, 15, 15, 14, 16),
            Block.createCuboidShape(9, 0, 0, 10, 6, 1),
            Block.createCuboidShape(9, 0, 15, 10, 6, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape FAIL_DEFAULT = Stream.of(
            Block.createCuboidShape(0,0,0,16,14,16),
            Block.createCuboidShape(0,14,0,1,16,1),
            Block.createCuboidShape(15,14,0,16,16,1),
            Block.createCuboidShape(0,14,15,1,16,16),
            Block.createCuboidShape(15, 14,15, 16,16,16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(@NotNull BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
            default -> FAIL_DEFAULT;
        };
    }
    public BlockState getPlacementState(@NotNull ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, Objects.requireNonNull(ctx.getPlayer()).getHorizontalFacing().getOpposite());
    }
    public BlockState rotate(@NotNull BlockState state, @NotNull BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }
    @Override
    public BlockState mirror(@NotNull BlockState state, @NotNull BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }
    protected void appendProperties(StateManager.@NotNull Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    // Block Entity

    public BlockRenderType getRenderType(BlockState state) { return BlockRenderType.MODEL; }
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) { return new blockCuttingStationEntity(pos, state); }
    public void onStateReplaced(@NotNull BlockState state, World world, BlockPos pos, @NotNull BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof blockCuttingStationEntity) {
                ItemScatterer.spawn(world, pos, (blockCuttingStationEntity)blockEntity);
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient()) {
            NamedScreenHandlerFactory screenHandlerFactory = ((blockCuttingStationEntity) world.getBlockEntity(pos));

            if (screenHandlerFactory != null) { player.openHandledScreen(screenHandlerFactory); }
        }
        return ActionResult.SUCCESS;
    }
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(type, blockEntities.BLOCK_CUTTER_ENTITY, blockCuttingStationEntity::tick);
    }
    */
}