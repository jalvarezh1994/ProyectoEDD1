/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huffman;

/**
 *
 * @author Ilich (D'R)
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Ilich (D'R)
 */
public class HuffmanManagement implements Serializable {

    private File file = null;
    private HuffmanTree tree;

    public HuffmanManagement(String path) {
        file = new File(path);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public HuffmanTree getTree() {
        return tree;
    }

    public void setTree(HuffmanTree tree) {
        this.tree = tree;
    }

    public void loadFile() {
        try {
            if (file.exists()) {
                FileInputStream input = new FileInputStream(file);
                ObjectInputStream object = new ObjectInputStream(input);

                tree = (HuffmanTree) object.readObject();

                object.close();
                input.close();
            }
        } catch (Exception ex) {
        }
    }

    public void writeFile() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {
            fw = new FileOutputStream(file);
            bw = new ObjectOutputStream(fw);

            bw.writeObject(tree);
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
