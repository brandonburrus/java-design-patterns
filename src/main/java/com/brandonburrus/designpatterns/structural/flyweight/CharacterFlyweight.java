package com.brandonburrus.designpatterns.structural.flyweight;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.ArrayList;

public class CharacterFlyweight implements DrawableCharacter {

    private final char representation;

    public CharacterFlyweight(char representation) {
        this.representation = representation;
    }

    public List<String> draw() {
        final int WIDTH = 30;
        final int HEIGHT = 30;

        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString(String.valueOf(representation), 10, 20);

        final List<String> lines = new ArrayList<>();

        for (int y = 0; y < HEIGHT; y++) {
            StringBuilder line = new StringBuilder();
            for (int x = 0; x < WIDTH; x++) {

                line.append(image.getRGB(x, y) == -16777216 ? " " : "@");

            }

            if (line.toString().trim().isEmpty()) {
                continue;
            }
            lines.add(line.toString());
        }

        return lines;
    }

    @Override
    public char getChar() {
        return representation;
    }
}
