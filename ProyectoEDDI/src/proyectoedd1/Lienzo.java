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
import javafx.scene.shape.Line;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Lienzo extends Canvas implements MouseListener, MouseMotionListener, KeyListener {

    private ArrayList<Nodo2D> nodos2D;
    private ArrayList<Arista2D> aristas2D;
    private int totalAdyacencia = 100;
    private int adyacencia[][] = new int[totalAdyacencia][totalAdyacencia];
    private int size = 0;
    private int opcion;
    private int tamanoNodo = 30;
    private boolean arrastrar = false;
    private int seleccion = -1;
    private final int INF = (int) Double.POSITIVE_INFINITY;

    public Lienzo() {
        setBackground(Color.lightGray);
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        nodos2D = new ArrayList();
        aristas2D = new ArrayList();
        for (int i = 0; i < totalAdyacencia; i++) {
            for (int j = 0; j < totalAdyacencia; j++) {
                adyacencia[i][j] = INF;
            }
        }
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
<<<<<<< HEAD
            double posTextoX = (0.50) * ((double) (a.getNodo1().getX()
                    + a.getNodo2().getX() + 20));
            double posTextoY = (0.50) * ((double) (a.getNodo1().getY()
                    + a.getNodo2().getY() + 20));
=======
            double posTextoX = (0.5) * ((double) (a.getNodo1().getX() + 10 + a.getNodo2().getX() + 10));
            double posTextoY = (0.5) * ((double) (a.getNodo1().getY() + 10 + a.getNodo2().getY() + 10));

>>>>>>> 84e675f93a90949b7b431909aca6bb69bc46fa88
            g2.setColor(Color.BLUE);
            g2.drawString(a.getTexto(), (int) posTextoX, (int) posTextoY);
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
        switch (opcion) {
            case 1:
                for (int i = 0; i < aristas2D.size(); i++) {
                    aristas2D.get(i).setColor(Color.BLACK);
                }
                bicoloreable(e);
                break;
            case 2:
                for (int i = 0; i < aristas2D.size(); i++) {
                    aristas2D.get(i).setColor(Color.BLACK);
                }
                dijkstra(e);
                break;
            case 3:
                break;
            case 4:
                for (int i = 0; i < aristas2D.size(); i++) {
                    aristas2D.get(i).setColor(Color.BLACK);
                }
                kruskal(e);
                break;
            case 5:
                for (int i = 0; i < aristas2D.size(); i++) {
                    aristas2D.get(i).setColor(Color.BLACK);
                }
                kruskal(e);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Seleccione una opción");
        }
    }

    private void dijkstra(MouseEvent e) {

    }

    private void kruskal(MouseEvent e) {
        boolean presionado = false;
        for (int i = 0; i < nodos2D.size(); i++) {
            Nodo2D n = nodos2D.get(i);
            Nodo2D n2 = null;
            if (seleccion != -1) {
                n2 = nodos2D.get(seleccion);
            }
            if (n.isPressed(e.getX(), e.getY(), tamanoNodo)) {
                presionado = true;
                arrastrar = true;
                try {
                    if (presionado && e.isControlDown() && seleccion != i && seleccion != -1
                            && adyacencia[n2.getPos()][n.getPos()]
                            == INF && adyacencia[n.getPos()][n2.getPos()] == INF) {
                        boolean error;
                        int pesoEntero = 0;
                        do {
                            error = false;
                            String peso = JOptionPane.showInputDialog("Ingrese el peso de la arista");
                            try {
                                pesoEntero = Integer.parseInt(peso);
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(this, "No es un número válido");
                                error = true;
                            }
                        } while (error);
                        aristas2D.add(new Arista2D(n2, n, Color.black, pesoEntero));
                        adyacencia[n2.getPos()][n.getPos()] = pesoEntero;
                        adyacencia[n.getPos()][n2.getPos()] = pesoEntero;
                    }
                } catch (Exception ex) {
                }
                seleccion = i;
            }
        }
        if (!presionado) {
            seleccion = -1;
            if (e.isMetaDown()) {
                nodos2D.add(new Nodo2D(e.getX() - 15, e.getY() - 15,
                        Color.BLACK, nodos2D.size()));
                size++;
            }
        }
        repaint();
    }

    private void bicoloreable(MouseEvent e) {
        boolean presionado = false;
        for (int i = 0; i < nodos2D.size(); i++) {
            Nodo2D n = nodos2D.get(i);
            Nodo2D n2 = null;
            if (seleccion != -1) {
                n2 = nodos2D.get(seleccion);
            }
            if (n.isPressed(e.getX(), e.getY(), tamanoNodo)) {
                presionado = true;
                arrastrar = true;
                try {
                    if (presionado && e.isControlDown() && seleccion != -1 && seleccion != i
                            && adyacencia[n2.getPos()][n.getPos()] == INF
                            && adyacencia[n.getPos()][n2.getPos()] == INF) {
                        aristas2D.add(new Arista2D(n2, n, Color.black));
                        adyacencia[n2.getPos()][n.getPos()] = 1;
                        adyacencia[n.getPos()][n2.getPos()] = 1;
                    }
                } catch (Exception ex) {
                }
                seleccion = i;
            }
        }
        if (!presionado) {
            seleccion = -1;
            if (e.isMetaDown()) {
                nodos2D.add(new Nodo2D(e.getX() - 15, e.getY() - 15,
                        Color.BLACK, nodos2D.size()));
                size++;
            }
        }
        repaint();
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
    public void keyTyped(KeyEvent e) {
        if (seleccion != -1 && e.getKeyCode() == 0) {
            ArrayList<Arista2D> remover = new ArrayList();
            for (int i = 0; i < aristas2D.size(); i++) {
                Arista2D a = aristas2D.get(i);
                if (a.getNodo1().equals(nodos2D.get(seleccion))
                        || a.getNodo2().equals(nodos2D.get(seleccion))) {
                    remover.add(aristas2D.get(i));
                }
            }
            nodos2D.remove(seleccion);
            for (int i = 0; i < remover.size(); i++) {
                aristas2D.remove(remover.get(i));
            }
            for (int i = seleccion; i < nodos2D.size(); i++) {
                nodos2D.get(i).setPos(i);
            }
            eliminarNodoMatriz(adyacencia, seleccion);
            size--;
            seleccion = -1;
            repaint();
        }
    }

    public void eliminarNodoMatriz(int[][] m, int n) {
        n = n - 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                try {
                    if (i > n && j > n) {
                        m[i][j] = m[i + 1][j + 1];
                    } else if (i > n) {
                        m[i][j] = m[i + 1][j];
                    } else if (j > n) {
                        m[i][j] = m[i][j + 1];
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    public void clear() {
        this.getNodos2D().clear();
        this.getAristas2D().clear();
        for (int i = 0; i < totalAdyacencia; i++) {
            for (int j = 0; j < totalAdyacencia; j++) {
                adyacencia[i][j] = INF;
            }
        }
        size = 0;
        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        arrastrar = false;
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public ArrayList<Nodo2D> getNodos2D() {
        return nodos2D;
    }

    public void setNodos2D(ArrayList<Nodo2D> nodos2D) {
        this.nodos2D = nodos2D;
    }

    public ArrayList<Arista2D> getAristas2D() {
        return aristas2D;
    }

    public void setAristas2D(ArrayList<Arista2D> aristas2D) {
        this.aristas2D = aristas2D;
    }

    public int getTamanoNodo() {
        return tamanoNodo;
    }

    public void setTamanoNodo(int tamanoNodo) {
        this.tamanoNodo = tamanoNodo;
    }

    public boolean isArrastrar() {
        return arrastrar;
    }

    public void setArrastrar(boolean arrastrar) {
        this.arrastrar = arrastrar;
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getTotalAdyacencia() {
        return totalAdyacencia;
    }

    public void setTotalAdyacencia(int totalAdyacencia) {
        this.totalAdyacencia = totalAdyacencia;
    }

    public int[][] getAdyacencia() {
        return adyacencia;
    }

    public void setAdyacencia(int[][] adyacencia) {
        this.adyacencia = adyacencia;
    }

    public int getAdyacenciaSize() {
        return size;
    }

    public void setAdyacenciaSize(int size) {
        this.size = size;
    }
}
