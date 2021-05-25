/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.slidegame.block;

import java.awt.*;

public class BlockBuilder {

    private int value;
    private Color color;

    public BlockBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public BlockBuilder setValue(int value) {
        this.value = value;
        return this;
    }

    public Block build(){
        return new Block(this.value, this.color);
    }
}
