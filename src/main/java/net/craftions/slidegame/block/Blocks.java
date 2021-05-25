/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.slidegame.block;

public class Blocks {

    public static Block mergeBlocks(Block b0, Block b1){
        return new BlockBuilder().
                setColor(b0.getColor()).
                setValue(b0.getValue() + b1.getValue()).
                build();
    }

    public static boolean canMergeBlocks(Block b0, Block b1){
        return b0.getValue().equals(b1.getValue());
    }
}
