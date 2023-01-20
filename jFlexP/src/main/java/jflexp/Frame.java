package jflexp;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import javax.swing.*;
import jflexp.generated_sources.lexer;
import jflexp.generated_sources.parser;
import java.io.*;
import static java.nio.file.Files.lines;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author INFORMATICA
 */
public class Frame extends javax.swing.JFrame {

    private File filename, filenameSave;
    private JFileChooser chooser = new JFileChooser("G:\\v19\\jFlexP");
    private File[] files;
    private String[] file = new String[5];
    private VelNP f2;
    private static int velMax, nPr;
    private String path, pathSave;
    private int n;
    private DefaultListModel mod;
    private Edit ff;
    private Guide guide;

    /**
     * Creates new form Frame
     */
    public Frame() {
        this.setTitle("PostProcessor");
        initComponents();
        this.setLocationRelativeTo(null);
        this.PanelVelocita.requestFocusInWindow();
        this.PanelVelocita.addKeyListener(new KeyAdapter() {
        });
        try {
            setIcona();
        } catch (IOException ex) {

        }
        mod = new DefaultListModel();
    }

    private void setIcona() throws IOException {

        this.setIconImage(ImageIO.read(new File(Frame.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../../Icons/Icona.png")));
        Image foto = ImageIO.read(new File(Frame.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../../Icons/file.png"));
        foto = foto.getScaledInstance(this.File.getWidth(), this.File.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon icona = new ImageIcon(foto);
        File.setIcon(icona);

        foto = foto.getScaledInstance(18, 18, Image.SCALE_DEFAULT);
        icona = new ImageIcon(foto);
        this.MenuFile.setIcon(icona);
        validate();
        foto = ImageIO.read(new File(Frame.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../../Icons/Run.png"));
        foto = foto.getScaledInstance(Run.getWidth(), Run.getHeight(), Image.SCALE_DEFAULT);
        icona = new ImageIcon(foto);
        Run.setIcon(icona);
        validate();
        foto = ImageIO.read(new File(Frame.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../../Icons/Anteprima.png"));
        foto = foto.getScaledInstance(this.Anteprima.getWidth(), this.Anteprima.getHeight(), Image.SCALE_DEFAULT);
        icona = new ImageIcon(foto);
        Anteprima.setIcon(icona);
        validate();
        foto = ImageIO.read(new File(Frame.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../../Icons/Config.png"));
        foto = foto.getScaledInstance(this.Save.getWidth(), this.Save.getHeight(), Image.SCALE_DEFAULT);
        icona = new ImageIcon(foto);
        Save.setIcon(icona);
        foto = foto.getScaledInstance(18, 18, Image.SCALE_DEFAULT);
        icona = new ImageIcon(foto);
        this.MenuSave.setIcon(icona);
        validate();
        foto = ImageIO.read(new File(Frame.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../../Icons/Vel.png"));
        foto = foto.getScaledInstance(this.Velocita.getWidth(), this.Velocita.getHeight(), Image.SCALE_DEFAULT);
        icona = new ImageIcon(foto);
        Velocita.setIcon(icona);
        foto = foto.getScaledInstance(18, 18, Image.SCALE_DEFAULT);
        icona = new ImageIcon(foto);
        this.MenuConfig.setIcon(icona);
        validate();
        foto = ImageIO.read(new File(Frame.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "../../Icons/guide.png"));
        foto = foto.getScaledInstance(this.Guide.getWidth(), this.Guide.getHeight(), Image.SCALE_DEFAULT);
        icona = new ImageIcon(foto);
        Guide.setIcon(icona);
        foto = foto.getScaledInstance(18, 18, Image.SCALE_DEFAULT);
        icona = new ImageIcon(foto);
        this.MenuHelp.setIcon(icona);
        validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNV = new javax.swing.JLabel();
        PanelVelocita = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Velocita = new javax.swing.JButton();
        PanelFile = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        File = new javax.swing.JButton();
        PanelConfig = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        PanelAnteprima = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Anteprima = new javax.swing.JButton();
        PanelRun = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Run = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Guide = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuFile = new javax.swing.JMenuItem();
        MenuSave = new javax.swing.JMenuItem();
        MenuConfig = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelNV.setBackground(new java.awt.Color(255, 255, 255));
        LabelNV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LabelNV.setText("<html>NP: "+getnPr()+"<br><br>VelM: "+getVelMax()+"</html>");
        LabelNV.setOpaque(true);
        getContentPane().add(LabelNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 50, 50));
        LabelNV.getAccessibleContext().setAccessibleName("");

        PanelVelocita.setBackground(new java.awt.Color(27, 29, 29));
        PanelVelocita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelVelocitaMouseClicked(evt);
            }
        });
        PanelVelocita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PanelVelocitaKeyTyped(evt);
            }
        });
        PanelVelocita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Config");
        jLabel2.setOpaque(true);
        PanelVelocita.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 200, 35));

        Velocita.setBackground(new java.awt.Color(27, 29, 29));
        Velocita.setForeground(new java.awt.Color(27, 29, 29));
        Velocita.setBorder(null);
        Velocita.setBorderPainted(false);
        Velocita.setContentAreaFilled(false);
        Velocita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VelocitaActionPerformed(evt);
            }
        });
        PanelVelocita.add(Velocita, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 40));

        getContentPane().add(PanelVelocita, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, 120));

        PanelFile.setBackground(new java.awt.Color(27, 29, 29));
        PanelFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelFileMouseClicked(evt);
            }
        });
        PanelFile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("File");
        jLabel3.setOpaque(true);
        PanelFile.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 200, 35));

        File.setBackground(new java.awt.Color(27, 29, 29));
        File.setForeground(new java.awt.Color(27, 29, 29));
        File.setBorder(null);
        File.setContentAreaFilled(false);
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });
        PanelFile.add(File, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 40));

        getContentPane().add(PanelFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 200, 120));

        PanelConfig.setBackground(new java.awt.Color(27, 29, 29));
        PanelConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelConfigMouseClicked(evt);
            }
        });
        PanelConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Save");
        jLabel5.setOpaque(true);
        PanelConfig.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 200, 35));

        Save.setBackground(new java.awt.Color(27, 29, 29));
        Save.setBorder(null);
        Save.setContentAreaFilled(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        PanelConfig.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 40));

        getContentPane().add(PanelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 30, 200, 120));

        PanelAnteprima.setBackground(new java.awt.Color(27, 29, 29));
        PanelAnteprima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelAnteprimaMouseClicked(evt);
            }
        });
        PanelAnteprima.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Preview");
        jLabel9.setOpaque(true);
        PanelAnteprima.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 200, 35));

        Anteprima.setBorder(null);
        Anteprima.setContentAreaFilled(false);
        Anteprima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteprimaActionPerformed(evt);
            }
        });
        PanelAnteprima.add(Anteprima, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 40));

        getContentPane().add(PanelAnteprima, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 200, 120));

        PanelRun.setBackground(new java.awt.Color(27, 29, 29));
        PanelRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelRunMouseClicked(evt);
            }
        });
        PanelRun.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Run");
        jLabel10.setOpaque(true);
        PanelRun.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 200, 35));

        Run.setBorder(null);
        Run.setContentAreaFilled(false);
        Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunActionPerformed(evt);
            }
        });
        PanelRun.add(Run, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 40));

        getContentPane().add(PanelRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 200, 120));

        jList1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jList1PropertyChange(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 410, 70));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Developed by: Vittorio Cortosi, Andrea Izzo, Gianni Yenque");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 760, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("APT Files: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 174, 140, 30));

        Guide.setBorder(null);
        Guide.setContentAreaFilled(false);
        Guide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuideActionPerformed(evt);
            }
        });
        getContentPane().add(Guide, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 22, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sfondo.png"))); // NOI18N
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel1KeyTyped(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 790, 470));

        jMenuBar1.setBorder(null);

        jMenu1.setText("File");

        MenuFile.setText("File       Q");
        MenuFile.setToolTipText("");
        MenuFile.setActionCommand("a");
        MenuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFileActionPerformed(evt);
            }
        });
        jMenu1.add(MenuFile);

        MenuSave.setText("Save     W");
        MenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSave);

        MenuConfig.setText("Config  E");
        MenuConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConfigActionPerformed(evt);
            }
        });
        jMenu1.add(MenuConfig);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("?");

        MenuHelp.setText("Help     P");
        MenuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHelpActionPerformed(evt);
            }
        });
        jMenu2.add(MenuHelp);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VelocitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VelocitaActionPerformed
        vel();        // TODO add your handling code here:
    }//GEN-LAST:event_VelocitaActionPerformed

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        caricaFile();
    }//GEN-LAST:event_FileActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        save();
    }//GEN-LAST:event_SaveActionPerformed

    private void AnteprimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteprimaActionPerformed
        anteprima();
    }//GEN-LAST:event_AnteprimaActionPerformed

    private void RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunActionPerformed
        run();
    }//GEN-LAST:event_RunActionPerformed

    private void PanelFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelFileMouseClicked
        caricaFile();
    }//GEN-LAST:event_PanelFileMouseClicked

    private void PanelConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelConfigMouseClicked
        save();
    }//GEN-LAST:event_PanelConfigMouseClicked

    private void PanelRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelRunMouseClicked
        run();
    }//GEN-LAST:event_PanelRunMouseClicked

    private void jList1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jList1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1PropertyChange

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        int i = jList1.getSelectedIndex();
        this.path = mod.getElementAt(i).toString();
    }//GEN-LAST:event_jList1ValueChanged

    private void PanelAnteprimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAnteprimaMouseClicked
        anteprima();
    }//GEN-LAST:event_PanelAnteprimaMouseClicked

    private void PanelVelocitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelVelocitaMouseClicked
        vel();
    }//GEN-LAST:event_PanelVelocitaMouseClicked

    private void GuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuideActionPerformed
        guide();
    }//GEN-LAST:event_GuideActionPerformed

    private void MenuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHelpActionPerformed
        guide();
    }//GEN-LAST:event_MenuHelpActionPerformed

    private void MenuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFileActionPerformed
        caricaFile();
    }//GEN-LAST:event_MenuFileActionPerformed

    private void MenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSaveActionPerformed
        save();
    }//GEN-LAST:event_MenuSaveActionPerformed

    private void MenuConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConfigActionPerformed
        vel();
    }//GEN-LAST:event_MenuConfigActionPerformed

    private void PanelVelocitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelVelocitaKeyTyped
        char c = evt.getKeyChar();
        c = Character.toUpperCase(c);
        System.out.println(c);
        switch (c) {
            case KeyEvent.VK_Q:
                caricaFile();
                break;
            case KeyEvent.VK_W:
                save();
                break;
            case KeyEvent.VK_E:
                vel();
                break;
            case KeyEvent.VK_P:
                guide();
                break;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_PanelVelocitaKeyTyped

    private void jLabel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyTyped

    }//GEN-LAST:event_jLabel1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anteprima;
    private javax.swing.JButton File;
    private javax.swing.JButton Guide;
    private javax.swing.JLabel LabelNV;
    private javax.swing.JMenuItem MenuConfig;
    private javax.swing.JMenuItem MenuFile;
    private javax.swing.JMenuItem MenuHelp;
    private javax.swing.JMenuItem MenuSave;
    private javax.swing.JPanel PanelAnteprima;
    private javax.swing.JPanel PanelConfig;
    private javax.swing.JPanel PanelFile;
    private javax.swing.JPanel PanelRun;
    private javax.swing.JPanel PanelVelocita;
    private javax.swing.JButton Run;
    private javax.swing.JButton Save;
    private javax.swing.JButton Velocita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 public void guide() {
        if (guide == null) {
            guide = new Guide(this);
            guide.setVisible(true);
        }
    }

    public void caricaFile() {
        try {
            chooser.setCurrentDirectory(filename);
            this.jList1.setModel(mod);
            chooser.setDialogTitle("Seleziona i file APT");
            chooser.setFileFilter(new FileFilterTA());
            chooser.setMultiSelectionEnabled(true);
            int result = chooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                files = chooser.getSelectedFiles();
                mod.clear();
                n = 0;
                for (int i = 0; i < files.length; i++) {
                    String[] parts;
                    String f = files[i].toString();
                    parts = f.split(Pattern.quote("\\"));
                    file[i] = parts[parts.length - 1].toString();
                    mod.addElement(file[i]);
                    n++;
                }
                filename = files[0];
                chooser.setCurrentDirectory(filename);
            }
        } catch (Exception ex) {

        }
        this.PanelVelocita.requestFocusInWindow();
        this.PanelVelocita.setFocusable(true);
    }

    public void save() {
        System.out.println(filenameSave);
        chooser.setFileFilter(null);
        chooser.setCurrentDirectory(filenameSave);
        chooser.setDialogTitle("Salva con nome");

        int sf = chooser.showSaveDialog(null);
        if (sf == JFileChooser.APPROVE_OPTION) {
            filenameSave = chooser.getSelectedFile();
            pathSave = filenameSave.getAbsolutePath();
            System.out.println(pathSave);
            try {
                if (!(pathSave.substring((pathSave.length() - 4), pathSave.length()).equals(".txt"))) {
                    pathSave += ".txt";
                }
            } catch (StringIndexOutOfBoundsException ex) {
                pathSave += ".txt";
            }
            Parse.setPath(pathSave);
        }
        this.PanelVelocita.requestFocusInWindow();
        this.PanelVelocita.setFocusable(true);
    }

    public void run() {
        int j = jList1.getSelectedIndex();
        if (j != -1 || n == 1) {
            try {
                if (j == -1) {
                    j = 0;
                }
                parser p = new parser(new lexer(new FileReader(files[j])));
                Object result = p.parse().value;
                Parse.println("N" + lexer.getM() + " G28 U0");
                lexer.nextM();
                Parse.println("N" + lexer.getM() + " G28 W0 M9");
                lexer.nextM();
                Parse.println("N" + lexer.getM() + " M30");
                Parse.println('%');
                lexer.setM(40);
                Parse.close();
                JOptionPane.showMessageDialog(this, "File creato");
            } catch (Throwable e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(this, "Errore, controllare il file.");
                Parse.close();
            }
        } else if (n == 0) {
            JOptionPane.showMessageDialog(this, "Nessun file caricato");
        } else {
            JOptionPane.showMessageDialog(this, "Selezionare il file");
        }
        this.PanelVelocita.requestFocusInWindow();
        this.PanelVelocita.setFocusable(true);
    }

    public static int getVelMax() {
        return velMax;
    }

    public static int getnPr() {
        return nPr;
    }

    public void initialize(int vel, int np) {
        this.velMax = vel;
        this.nPr = np;
        LabelNV.setText("<html>NP: " + getnPr() + "<br><br>VelM: " + getVelMax() + "</html>");
    }

    public void vel() {
        if (f2 == null) {
            f2 = new VelNP(this);
            f2.setVisible(true);
        }
    }

    public void setVel() {
        f2 = null;
        this.PanelVelocita.requestFocusInWindow();
        this.PanelVelocita.setFocusable(true);
    }

    public void anteprima() {
        if (ff == null) {
            int j = jList1.getSelectedIndex();
            if (j != -1 || n == 1) {

                if (n == 1) {
                    path = mod.getElementAt(0).toString();
                    j = 0;
                }

                ff = new Edit(this, files[j].getAbsolutePath(), ff);
                ff.setVisible(true);
            } else if (n == 0) {
                JOptionPane.showMessageDialog(this, "Nessun file caricato");
            } else {
                JOptionPane.showMessageDialog(this, "Selezionare il file");
            }
        }
        this.PanelVelocita.requestFocusInWindow();
    }

    public void setEdit() {
        ff = null;
        this.PanelVelocita.requestFocusInWindow();
        this.PanelVelocita.setFocusable(true);
    }

    public void setGuide() {
        guide = null;
        this.PanelVelocita.requestFocusInWindow();
        this.PanelVelocita.setFocusable(true);
    }
}
