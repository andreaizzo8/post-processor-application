/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jflexp;

import java.io.*;
import javax.swing.filechooser.FileFilter;

public class FileFilterTA extends FileFilter{
    
    private String txtFormat="TXT";
    private String aptFormat="APTSOURCE";
    private char punto='.';
    
    public boolean accept(File F){
        
        if(F.isDirectory()){
            return true;
        }
        if(extension(F).equalsIgnoreCase(aptFormat)){
            return true;
        }else
            return false;
    }
    
    public String getDescription(){
        return "APT Format Only";
    }
    public String extension(File f){
        String FileName=f.getName();
        int IndexFile=FileName.lastIndexOf(punto);
        if(IndexFile>0 && IndexFile<FileName.length()-1){
            return FileName.substring(IndexFile+1);
        }else{
            return "";
        }
    }
    
}
