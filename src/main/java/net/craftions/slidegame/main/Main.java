/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.slidegame.main;

import net.craftions.slidegame.block.Block;
import net.craftions.slidegame.block.BlockBuilder;
import net.craftions.slidegame.block.Blocks;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Block block = new BlockBuilder().setValue(1).setColor(Color.BLACK).build();
        Block block2 = new BlockBuilder().setValue(1).setColor(Color.BLUE).build();
        if(Blocks.canMergeBlocks(block, block2)){
            Block fBlock = Blocks.mergeBlocks(block, block2);
            System.out.println("V: " + fBlock.getValue());
        }else {
            System.out.println("Could not merge!");
        }
    }
}
