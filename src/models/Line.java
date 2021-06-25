package models;

import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;

public class Line {
    private int x1, x2, y1, y2;
    public Line (int  x1, int y1, int x2, int y2)
    {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
    }

    public void Draw (PixelWriter pw)
    {
        int lX = x2-x1;
        int lY = y2-y1;
        for(double i = 0; i < 1; i+=0.001) {
            pw.setColor((int)(x1 + lX*i), (int) (y1+lY*i), Color.BLUE);
        }
    }
    public int getX1() {
        return x1;
    }

    public void setX1(int x) {
        x1 = x;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y) {
        y1 = y;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x) {
        x2 = x;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y) {
        y2 = y;
    }
}
