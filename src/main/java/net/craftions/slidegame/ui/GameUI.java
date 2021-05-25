package net.craftions.slidegame.ui;

import net.craftions.slidegame.block.Block;
import net.craftions.slidegame.block.BlockBuilder;
import net.craftions.slidegame.block.Blocks;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameUI {
    public static JFrame jf = new JFrame("SlideGame");
    public static JLabel field = new JLabel();
    public static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    public static ArrayList<Block> blockArr = new ArrayList<>();

    public static void createUI() {
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);

        field.setLayout(null);
        field.setIcon(new ImageIcon("/Users/ben/Desktop/fuck.png"));
        field.setBounds((dim.width / 3), 0, (dim.width / 3), dim.height);

        Block block = new BlockBuilder()
                .setValue(10)
                .setColor(Color.RED)
                .build();

        jf.add(block.getComponent());

        // jf.add(field);
    }

    public static void moveBlocks(){

    }
}