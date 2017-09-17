/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Lienzo extends Canvas implements MouseListener, MouseMotionListener, KeyListener {

    private ArrayList<Nodo2D> nodos2D = new ArrayList();
    private ArrayList<Arista2D> aristas2D = new ArrayList();
    int tamanoNodo = 30;
    boolean arrastrar = false;
    int seleccion = -1;

    public Lienzo() {
        setBackground(Color.lightGray);
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        for (int i = 0; i < aristas2D.size(); i++) {
            Arista2D a = aristas2D.get(i);
            g2.setColor(a.getColor());
            g2.drawLine(a.getNodo1().getX() + 15, a.getNodo1().getY() + 15,
                    a.getNodo2().getX() + 15, a.getNodo2().getY() + 15);
        }
        for (int i = 0; i < nodos2D.size(); i++) {
            Nodo2D n = nodos2D.get(i);
            g.setColor(n.getColor());
            g.fillOval(n.getX(), n.getY(), tamanoNodo, tamanoNodo);
            g.setColor(Color.blue);
            g.drawString(Integer.toString(i), n.getX() + 11, n.getY() + 19);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        boolean presionado = false;
        for (int i = 0; i < nodos2D.size(); i++) {
            Nodo2D n = nodos2D.get(i);
            if (n.isPressed(e.getX(), e.getY(), tamanoNodo)) {
                presionado = true;
                arrastrar = true;
                if (presionado && e.isControlDown() && seleccion != -1) {
                    aristas2D.add(new Arista2D(nodos2D.get(seleccion), n, Color.black));
                }
                seleccion = i;
            }
        }
        if (!presionado) {
            seleccion = -1;
            if (e.isMetaDown()) {
                nodos2D.add(new Nodo2D(e.getX() - 15, e.getY() - 15, Color.BLACK));
            }
        }

        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        arrastrar = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (arrastrar) {
            nodos2D.get(seleccion).setX(e.getX() - 15);
            nodos2D.get(seleccion).setY(e.getY() - 15);
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (seleccion != -1 && e.getKeyCode() == 0) {
            nodos2D.remove(seleccion);
            for (int i = 0; i < aristas2D.size(); i++) {
                Arista2D a=aristas2D.get(i);
                if (a.getNodo1().equals(nodos2D.get(i))
                        ||a.getNodo2().equals(nodos2D.get(i))) {
                    aristas2D.remove(i);
                }
            }
            seleccion = -1;
            repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
