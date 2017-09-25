/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huffman;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ilich (D'R)
 */
public class CodeManagement {

    private String code;
    private File file = null;

    public CodeManagement(String path) { // Manda de parámetro un String con la ruta del archivo.
        file = new File(path);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void writeFile() { // Pasa de RAM a ROM.
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file, false); // El false indica si se va a hacer append o no (mandarlo al final del archivo).
            bw = new BufferedWriter(fw);

            bw.write(code);
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
            } catch (Exception ex) {
            }
        }
    }

    public void loadFile() {
        Scanner sc = null;
        code = "";

        try {
            sc = new Scanner(file);

            code = sc.next();
        } catch (Exception ex) {
        } finally {
            sc.close();
        }
    }
}
