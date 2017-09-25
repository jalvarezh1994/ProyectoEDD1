/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7Kruskal;

import TDAs.Arista;
import TDAs.Nodo;
import TDAs.GrafoLista;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class GrafoKruskal extends GrafoLista {

    private final int INF = (int) Double.POSITIVE_INFINITY;

    @Override
    public boolean agregarNodo() {
        nodos.add(new NodoKruskal(nodos.size()));
        return true;
    }

    @Override
    public boolean agregarArista(int nodoInicial, int nodoFinal, int peso) {
        if (nodos.size() > 1 && nodoInicial != nodoFinal
                && nodoInicial >= 0 && nodoInicial < nodos.size()
                && nodoFinal >= 0 && nodoFinal < nodos.size()) {
            nodos.get(nodoInicial).agregarAdyacente(nodoFinal);
            nodos.get(nodoFinal).agregarAdyacente(nodoInicial);
            aristas.add(new AristaKruskal(nodoInicial, nodoFinal, peso, aristas.size()));
            return true;
        } else {
            return false;
        }
    }

    public void ordenarAristas() {
        AristaKruskal[] a = new AristaKruskal[aristas.size()];
        for (int i = 0; i < aristas.size(); i++) {
            a[i] = (AristaKruskal) aristas.get(i);
        }
        MergeSort m = new MergeSort();
        ArrayList<AristaKruskal> orden = new ArrayList();
        orden = m.ordenar(a);
        aristas.clear();
        for (int i = 0; i < orden.size(); i++) {
            System.out.println(orden.get(i));
            aristas.add(orden.get(i));
        }
    }

    public void kruskal() {
        ordenarAristas();
        ArrayList<Integer> grupos = new ArrayList();
        for (int i = 0; i < aristas.size(); i++) {
            AristaKruskal a = (AristaKruskal) aristas.get(i);
            NodoKruskal n1 = (NodoKruskal) nodos.get(a.getNodo1());
            NodoKruskal n2 = (NodoKruskal) nodos.get(a.getNodo2());
            if (n1.getGrupo() == INF && n2.getGrupo() == INF) {
                grupos.add(grupos.size());
                n1.setGrupo(grupos.size() - 1);
                n2.setGrupo(grupos.size() - 1);
                a.setGrupo(grupos.size() - 1);
            } else if (n1.getGrupo() == INF) {
                n1.setGrupo(n2.getGrupo());
                a.setGrupo(n2.getGrupo());
            } else if (n2.getGrupo() == INF) {
                n2.setGrupo(n1.getGrupo());
                a.setGrupo(n1.getGrupo());
            } else if (n1.getGrupo() > n2.getGrupo()) {
                for (int j = 0; j < grupos.size(); j++) {
                    try {
                        if (grupos.get(j) == n1.getGrupo()) {
                            grupos.set(j, n2.getGrupo());
                            a.setGrupo(n2.getGrupo());
                        }
                    } catch (Exception e) {
                    }
                }
            } else if (n1.getGrupo() < n2.getGrupo()) {
                for (int j = 0; j < grupos.size(); j++) {
                    try {
                        if (grupos.get(j) == n2.getGrupo()) {
                            grupos.set(j, n1.getGrupo());
                            a.setGrupo(n1.getGrupo());
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }
        for (int i = 0; i < aristas.size(); i++) {
            AristaKruskal a = (AristaKruskal) aristas.get(i);
            try {
                if (grupos.get(a.getGrupo()) == 0) {
                    a.setRespuesta(true);
                }
            } catch (Exception e) {
            }
            //System.out.println(a);
        }
        int total = 0;
        for (int i = 0; i < aristas.size(); i++) {
            AristaKruskal a = (AristaKruskal) aristas.get(i);
            System.out.print(a);
            if(a.isRespuesta()){
                total+=a.getPeso();
            }
//System.out.println(a.isRespuesta());
        }
        System.out.println("MENOR PESO DE RECORRIDO:"+total);
       
    }
//    public void ordenarAristas() {
//        int contador = 0;
//        int menor;
//        do {
//            menor = INF;
//            int pos = 0;
//            for (int i = contador; i < aristas.size(); i++) {
//                if (aristas.get(i).getPeso() <= menor) {
//                    pos = i;
//                    menor = aristas.get(i).getPeso();
//                }
//            }
//            Arista temporal = new Arista();
//            temporal = aristas.get(contador);
//            aristas.set(contador, aristas.get(pos));
//            aristas.set(pos, temporal);
//            contador++;
//        } while (contador < aristas.size());
//    }
//    public void kruskal() {
//        ordenarAristas();
//        ArrayList<Integer> grupos=new ArrayList();
//        int grupo = 0;
//        for (int i = 0; i < aristas.size(); i++) {
//            NodoKruskal Nodo1 = (NodoKruskal) nodos.get(aristas.get(i).getNodo1());
//            NodoKruskal Nodo2 = (NodoKruskal) nodos.get(aristas.get(i).getNodo2());
//            if (!Nodo1.isRespuesta() && !Nodo2.isRespuesta()) {
//                Nodo1.setRespuesta(true);
//                Nodo2.setRespuesta(true);
//                Nodo1.setGrupo(grupo);
//                Nodo2.setGrupo(grupo);
//                ((AristaKruskal) aristas.get(i)).setRespuesta(true);
//                ((AristaKruskal) aristas.get(i)).setGrupo(grupo);
//                grupo++;
//            } else if (Nodo1.getGrupo() != Nodo2.getGrupo()) {
//                int grupoTemporal;
//                if (Nodo1.getGrupo() < Nodo2.getGrupo()) {
//                    grupoTemporal = Nodo1.getGrupo();
//                } else {
//                    grupoTemporal = Nodo2.getGrupo();
//                }
//                Nodo1.setGrupo(grupoTemporal);
//                Nodo2.setGrupo(grupoTemporal);
//                Nodo1.setRespuesta(true);
//                Nodo2.setRespuesta(true);
//                ((AristaKruskal) aristas.get(i)).setGrupo(grupoTemporal);
//                ((AristaKruskal) aristas.get(i)).setRespuesta(true);
//            }
//        }
//        for (int i = 0; i < aristas.size(); i++) {
//            System.out.println(aristas.get(i));
//        }
//    }

}
