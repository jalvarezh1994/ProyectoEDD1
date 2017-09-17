/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

import java.awt.Color;

/**
 *
 * @author jorge
 */
public class Nodo2D {

    private int x, y;
    private Color color;
    private boolean pressed;
    private int pos;

    public Nodo2D(int x, int y, Color color, int pos) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.pos = pos;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isPressed(int x, int y, int size) {
        if (x >= this.x && x <= this.x + size && y >= this.y && y <= this.y + size) {
            pressed = true;
            setColor(Color.red);
        } else {
            pressed = false;
            setColor(Color.black);
        }
        return pressed;
    }

    public boolean isPressed() {
        return pressed;
    }

    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

}
