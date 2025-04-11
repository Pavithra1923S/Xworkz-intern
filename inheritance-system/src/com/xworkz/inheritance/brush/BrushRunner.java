package com.xworkz.inheritance.brush;

public class BrushRunner {
    public static void main(String[] args) {
        Brush brush = new Brush();
        brush.dipInPaint();
        brush.applyColor();

        PaintBrush paint = new PaintBrush();
        paint.dipInPaint();
        paint.applyColor();
    }
}
