/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.slidegame.block;

import javax.swing.*;
import java.awt.*;

public class Block {

    public static Integer currentID = 0;

    private Integer value;
    private Color color;
    private JLabel comp = null;
    private Integer id;


    public Block(Integer value, Color color) {
        this.value = value;
        this.color = color;
        id=currentID;
        currentID++;
    }

    public void addToComponent(JComponent comp){
        comp.add(this.getComponent());
    }

    public JLabel getComponent(){
        return this.comp;
    }

    public void setComp(int x, int y){
        JLabel jl = new JLabel(this.getValue().toString());
        jl.setBackground(this.getColor());
        jl.setFont(new Font("X-Files", Font.PLAIN, 25));
        jl.setBounds(x, y, 200, 200);
        this.comp = jl;
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

    public Integer getId() {
        return id;
    }
}