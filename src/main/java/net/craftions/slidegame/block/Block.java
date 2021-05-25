/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.slidegame.block;

import javax.swing.*;
import java.awt.*;

public class Block {

    private Integer value;
    private Color color;


    public Block(Integer value, Color color) {
        this.value = value;
        this.color = color;
    }

    public void addToComponent(JComponent comp, int x, int y){
        comp.add(this.getComponent(x, y));
    }

    public JLabel getComponent(int x, int y){
        JLabel jl = new JLabel(String.valueOf(this.getValue()));
        jl.setBackground(this.getColor());
        jl.setFont(new Font("X-Files", Font.PLAIN, 25));
        jl.setBounds(x, y, 200, 200);
        return jl;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}