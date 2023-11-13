package ru.netology.graphics.image;

public class ColorSchema implements TextColorSchema {
    public static final char[] COLOR_SCHEME = {'#', '$', '@', '%', '*', '+', '-', '\''};

    @Override
    public char convert(int color) {
        return COLOR_SCHEME[color/32];
    }
}
