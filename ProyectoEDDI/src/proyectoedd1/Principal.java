/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd1;

import TDAs.ArbolBinario;
import E4Bicoloreable.GrafoBicoloreable;
import E5Floyd.GrafoFloyd;
import E7Kruskal.AristaKruskal;
import E7Kruskal.GrafoKruskal;
import E8Prim.GrafoPrim;
import TDAs.Archivos;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Rectangle;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import Huffman.Huffman;
import Huffman.HuffmanTree;
import javax.swing.JFileChooser;

/**
 *
 * @author jorge
 */
public class Principal extends javax.swing.JFrame {

    Lienzo lienzo1 = new Lienzo();

    /**
     * Creates new form principal
     */
    public Principal() {

        initComponents();
        lienzo1.setBounds(PanelCanvas.getX() - 100, PanelCanvas.getY() - 100, PanelCanvas.getWidth(), PanelCanvas.getHeight());
        lienzo1.setBackground(Color.lightGray);
        lienzo1.setVisible(true);
        PanelCanvas.add(lienzo1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grafos = new javax.swing.ButtonGroup();
        Advertencia = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelCanvas = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextExpresion = new javax.swing.JTextField();
        jTextResultado = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton7 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToggleButton8 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        Advertencia.setTitle("DEBE ESCRIBIR UNA EXPRESION");
        Advertencia.setIconImage(null);
        Advertencia.setType(java.awt.Window.Type.POPUP);
        Advertencia.getContentPane().setLayout(new javax.swing.BoxLayout(Advertencia.getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        Advertencia.getAccessibleContext().setAccessibleDescription("El campo no debe estar vacio");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("Opciones");

        javax.swing.GroupLayout PanelCanvasLayout = new javax.swing.GroupLayout(PanelCanvas);
        PanelCanvas.setLayout(PanelCanvasLayout);
        PanelCanvasLayout.setHorizontalGroup(
            PanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        PanelCanvasLayout.setVerticalGroup(
            PanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        Grafos.add(jToggleButton1);
        jToggleButton1.setText("Bicoloreable");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Grafos.add(jToggleButton2);
        jToggleButton2.setText("Dijkstra");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        Grafos.add(jToggleButton3);
        jToggleButton3.setText("Floyd");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        Grafos.add(jToggleButton4);
        jToggleButton4.setText("Kruskal");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        Grafos.add(jToggleButton5);
        jToggleButton5.setText("Prim");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Resultado");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar grafo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(PanelCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(55, 55, 55))))
        );

        jTabbedPane1.addTab("Grafos", jPanel1);

        jButton2.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        jButton2.setText("Calcular Expresiones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextExpresion.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N

        jTextResultado.setEditable(false);
        jTextResultado.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextExpresion)
                    .addComponent(jTextResultado))
                .addContainerGap(759, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Árbol de Expresiones", jPanel2);

        jToggleButton7.setText("Huffman");
        jToggleButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton7MouseClicked(evt);
            }
        });

        jLabel2.setText("Opciones");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jToggleButton8.setText("Instrucciones");
        jToggleButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton7)
                            .addComponent(jToggleButton8))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jToggleButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Huffman", jPanel3);

        jMenu1.setText("File");

        jMenuItem1.setText("Floyd");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Prim");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void jToggleButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton8MouseClicked
        JOptionPane.showMessageDialog(this, "1. Para el compresor de Huffman, seleccione el botón correspondiente.\n"
                + "2. Acto seguido, ingrese el texto que desea codificar y decodificar.\n"
                + "3. Para ingresar otro texto nuevamente, repita los pasos anteriores.\n");
    }//GEN-LAST:event_jToggleButton8MouseClicked

    private void jToggleButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton7MouseClicked
        jTextArea1.setText("");

        String text, finalText = "";
        StringBuffer stringBuffer = new StringBuffer();
        Huffman huffman = new Huffman();

        do {
            text = JOptionPane.showInputDialog("Ingrese texto: ");
        } while (text.isEmpty());

        int[] charFrequency = new int[256];

        for (char character : text.toCharArray()) {
            charFrequency[character]++;
        }

        HuffmanTree tree = huffman.getTree(charFrequency); // Creo mi árbol

        finalText += "TABLA DE CÓDIGOS\nSÍMBOLO\tCANTIDADES\tCÓDIGO DE HUFFMAN\n";
        finalText += huffman.printCodes(tree, stringBuffer);

        String code = huffman.encode(tree, text);

        finalText += "\nTEXTO COMPRIMIDO\n" + code + "\n";
        finalText += "\nTEXTO DECODIFICADO\n" + huffman.decode(tree, code) + "\n";

        jTextArea1.append(finalText);
    }//GEN-LAST:event_jToggleButton7MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String texto = jTextExpresion.getText();
        ArbolBinario arbol = new ArbolBinario(100);
        boolean valido = true;
        int numero;

        for (int i = 0; i < texto.length(); i++) {
            numero = (int) texto.charAt(i);

            if (numero < 40 || numero > 58 || numero == 44 || numero == 46) {
                valido = false;
                break;
            }
        }

        if (!valido) {
            JOptionPane.showMessageDialog(this, "Ingrese valores correctos, por favor");
        } else {
            arbol.crearArbolExpresiones(arbol.convertirInfija_Postfija(texto));
            arbol.postOrden(0);
            jTextResultado.setText(arbol.nodoRaiz().getElemento().toString());
            jTextExpresion.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lienzo1.clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int opc = lienzo1.getOpcion();
        switch (opc) {
            case 1:
                bicoloreable();
                break;
            case 4:
                kruskal();
                break;
            case 3:
                System.out.println(lienzo1.getAristas2D());
                // floyd();
                break;
            case 5:
                prim();
                break;
            default:
                JOptionPane.showMessageDialog(this, "Seleccione una opción.");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        lienzo1.setOpcion(5);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        lienzo1.setOpcion(4);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        lienzo1.setOpcion(3);
    }//GEN-LAST:event_jToggleButton3ActionPerformed


    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        lienzo1.setOpcion(1);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        floydArchivo();
        lienzo1.setOpcion(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        primArchivo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public final int INF = (int) Double.POSITIVE_INFINITY;

    public void floyd() {
        ArrayList<Nodo2D> nodos2D = lienzo1.getNodos2D();
        ArrayList<Arista2D> aristas2D = lienzo1.getAristas2D();
        GrafoFloyd gr = new GrafoFloyd(lienzo1.getTamanoAdyacencia());
        for (int i = 0; i < nodos2D.size(); i++) {
            gr.agregarNodo();
        }
        int[][] m = lienzo1.getAdyacencia();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != INF) {
                    gr.agregarArista(i, j, m[i][j]);
                }
            }
        }
        gr.floyd();
    }

    public void floydArchivo() {
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(jPanel1);
        ArrayList<Nodo2D> nodos2D = new ArrayList<>();
        ArrayList<Arista2D> aristas2D = new ArrayList<>();
        Archivos archivo = new Archivos();
        int[][] m = archivo.leerArchivoGrafo(file.getSelectedFile(), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Nodos del grafo")));
        GrafoFloyd gr = new GrafoFloyd(m.length);
        gr.setAdyacencia(m);
        gr.setSize(m.length);

        for (int i = 0; i < m.length; i++) {
            nodos2D.add(new Nodo2D((int) (Math.random() * 500) + 200, 200, Color.black, i));
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != INF) {
                    aristas2D.add(new Arista2D(nodos2D.get(i), nodos2D.get(i), Color.black, m[i][j]));
                }
            }
        }
        //System.out.println(aristas2D + "negro");
        lienzo1.setNodos2D(nodos2D);
        lienzo1.setAristas2D(aristas2D);

        lienzo1.repaint();
        gr.floyd();
    }

    public void primArchivo() {
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(jPanel1);
        ArrayList<Nodo2D> nodos2D = new ArrayList<>();
        ArrayList<Arista2D> aristas2D = new ArrayList<>();
        Archivos archivo = new Archivos();
        int[][] m = archivo.leerArchivoGrafo(file.getSelectedFile(), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Nodos del grafo")));
        GrafoPrim gr = new GrafoPrim(m.length);
        gr.setAdyacencia(m);
        gr.setSize(m.length);
       
        for (int i = 0; i < m.length; i++) {
            nodos2D.add(new Nodo2D((int) (Math.random() * 500) + 200, 200, Color.black, i));
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != INF) {
                    aristas2D.add(new Arista2D(nodos2D.get(i), nodos2D.get(i), Color.black, m[i][j]));
                }
            }
        }
        //System.out.println(aristas2D + "negro");
        lienzo1.setNodos2D(nodos2D);
        lienzo1.setAristas2D(aristas2D);

        gr.prim();

        for (int i = 0; i < nodos2D.size(); i++) {
            nodos2D.get(i).setColor(Color.YELLOW);
        }
        int[] salida = gr.getSalida();
        for (int i = 0; i < aristas2D.size(); i++) {
            Arista2D a = aristas2D.get(i);
            for (int j = 0; j < nodos2D.size(); j++) {
                if (a.contieneNodo(j) && a.contieneNodo(salida[j])) {
                    a.setColor(Color.YELLOW);
                }
            }
        }
        int peso = 0;
        for (int i = 0; i < aristas2D.size(); i++) {
            if (aristas2D.get(i).getColor().equals(Color.YELLOW)) {
                peso += aristas2D.get(i).getPeso();
            }
        }
        lienzo1.repaint();
        JOptionPane.showMessageDialog(this, "Total: " + peso);
    }

    public void prim() {
        ArrayList<Nodo2D> nodos2D = lienzo1.getNodos2D();
        ArrayList<Arista2D> aristas2D = lienzo1.getAristas2D();
        GrafoPrim gr = new GrafoPrim(lienzo1.getTamanoAdyacencia());
        gr.setAdyacencia(lienzo1.getAdyacencia());
        gr.setSize(lienzo1.getAdyacenciaSize());
        gr.prim();
        for (int i = 0; i < nodos2D.size(); i++) {
            nodos2D.get(i).setColor(Color.YELLOW);
        }
        int[] salida = gr.getSalida();
        for (int i = 0; i < aristas2D.size(); i++) {
            Arista2D a = aristas2D.get(i);
            for (int j = 0; j < nodos2D.size(); j++) {
                if (a.contieneNodo(j) && a.contieneNodo(salida[j])) {
                    a.setColor(Color.YELLOW);
                }
            }
        }
        int peso = 0;
        for (int i = 0; i < aristas2D.size(); i++) {
            if (aristas2D.get(i).getColor().equals(Color.YELLOW)) {
                peso += aristas2D.get(i).getPeso();
            }
        }
        lienzo1.repaint();
        JOptionPane.showMessageDialog(this, "Total: " + peso);
    }

    public void kruskal() {
        ArrayList<Nodo2D> nodos2D = lienzo1.getNodos2D();
        ArrayList<Arista2D> aristas2D = lienzo1.getAristas2D();
        GrafoKruskal gr = new GrafoKruskal();
        for (int i = 0; i < nodos2D.size(); i++) {
            gr.agregarNodo();
            nodos2D.get(i).setColor(Color.YELLOW);
        }
        for (int i = 0; i < aristas2D.size(); i++) {
            Arista2D a = aristas2D.get(i);
            a.setColor(Color.BLACK);
            gr.agregarArista(a.getNodo1().getPos(), a.getNodo2().getPos(), a.getPeso());
        }
        gr.arbolMinimo();
        int total = 0;
        for (int i = 0; i < aristas2D.size(); i++) {
            AristaKruskal a = (AristaKruskal) gr.getArista(i);
            if (a.isRespuesta()) {
                aristas2D.get(a.getPos()).setColor(Color.YELLOW);
                total += a.getPeso();
            }
        }
        lienzo1.repaint();
        JOptionPane.showMessageDialog(this, "Total: " + total);
    }

    public void bicoloreable() {
        ArrayList<Nodo2D> nodos2D = lienzo1.getNodos2D();
        ArrayList<Arista2D> aristas2D = lienzo1.getAristas2D();
        GrafoBicoloreable gr = new GrafoBicoloreable();
        for (int i = 0; i < nodos2D.size(); i++) {
            gr.agregarNodo();
        }
        for (int i = 0; i < aristas2D.size(); i++) {
            Arista2D a = aristas2D.get(i);
            gr.agregarArista(a.getNodo1().getPos(), a.getNodo2().getPos());
        }
        boolean bicoloreable = gr.bicoloreable();
        for (int i = 0; i < gr.getNodos().size(); i++) {
            if (gr.getNodos().get(i).getColor() == 1) {
                nodos2D.get(i).setColor(Color.WHITE);
            } else {
                nodos2D.get(i).setColor(Color.YELLOW);
            }
        }
        lienzo1.repaint();
        if (bicoloreable) {
            JOptionPane.showMessageDialog(this, "¡Es bicoloreable :D!");
        } else {
            JOptionPane.showMessageDialog(this, "NO es bicoloreable :(");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Advertencia;
    private javax.swing.ButtonGroup Grafos;
    private javax.swing.JPanel PanelCanvas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextExpresion;
    private javax.swing.JTextField jTextResultado;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    // End of variables declaration//GEN-END:variables
}
