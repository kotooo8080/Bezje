package models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;

public class Bezje {
    private int x1, x2, x3, x4, y1, y2, y3, y4;
    public Bezje (int  x1, int x2, int x3, int x4, int  y1, int y2, int y3, int y4)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }
    public Bezje(Line first, Line third)
    {
        this.x1 = first.getX1();
        this.x2 = first.getX2();
        this.x3 = third.getX1();
        this.x4 = third.getX2();
        this.y1 = first.getY1();
        this.y2 = first.getY2();
        this.y3 = third.getY1();
        this.y4 = third.getY2();
    }
    public void Draw (GraphicsContext gr)
    {

        gr.setLineWidth(1.0);
        gr.setStroke(Color.RED);
        gr.beginPath();
        gr.moveTo(x1,y1);
        for(double t = 0; t < 1; t+=0.01) {
            double currentX = (1-t)*(1-t)*(1-t)*x1 + 3*(1-t)*(1-t)*t*x2 + 3*(1-t)*t*t*x3 + t*t*t*x4;
            double currentY = (1-t)*(1-t)*(1-t)*y1 + 3*(1-t)*(1-t)*t*y2 + 3*(1-t)*t*t*y3 + t*t*t*y4;
            gr.lineTo(currentX,currentY);

        }
        gr.stroke();
        gr.closePath();
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
    public int getX3() {
        return x3;
    }

    public void setX3(int x) {
        x3 = x;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y) {
        y3 = y;
    }
    public int getX4() {
        return x4;
    }

    public void setX4(int x) {
        x4 = x;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y) {
        y4 = y;
    }
}
