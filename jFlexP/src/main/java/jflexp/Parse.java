/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jflexp;

import java.io.*;

/**
 *
 * @author UTENTE
 */
public class Parse {

    private static PrintWriter file;
    private static String path = "output.txt";

    public Parse() {
        try {
            file = new PrintWriter(path);
            file.println("%\nO" + Frame.getnPr() + "\nN10 G92 S" + Frame.getVelMax() + "\nN20 G28 U0\nN30 G28 W0");
        } catch (FileNotFoundException ex) {
        }
    }

    public Parse(String pathname) {
        try {
            System.out.println(pathname);
            file = new PrintWriter(pathname);

        } catch (FileNotFoundException ex) {

        }

    }

    public static void setPath(String file) {
        path = file.toString();
    }

    public static void print(Object s) {
        file.print(s.toString());
    }

    public static void println(Object s) {
        if(s != null){
            file.println(s.toString());
        }        
    }

    public static void close() {
        file.close();
    }

    public static String getPath() {
        return path;
    }

    public static String extension(String filename) {
        int IndexFile = filename.lastIndexOf('.');
        if ((IndexFile > 0 && IndexFile < filename.length() - 1)) {
        } else {
            filename = filename + ".txt";
        }
        return filename;
    }

}
