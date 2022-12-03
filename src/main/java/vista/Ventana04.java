/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

/**
 *
 * @author pamel
 */
public class Ventana04 extends JFrame {

    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFileList;
    private List<JComboBox> jComboBoxList;
    private List<JCheckBox> jCheckBoxList;

    public Ventana04() throws HeadlessException {
        this.setTitle("Grid Layout");
        this.setSize(500, 700);
        this.setLocation(800, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarJlabels();
        this.iniciarJComboBox();
        this.iniciarJButtons();
        this.iniciarJTextfile();
        this.iniciarChecks();

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPaneles() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(1).setBackground(new Color(129, 143, 250));

        
        
        this.jPanelList.get(0).setLayout(new GridLayout(15, 1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(0).add(this.jPanelList.get(10));
        this.jPanelList.get(0).add(this.jPanelList.get(11));
        this.jPanelList.get(0).add(this.jPanelList.get(12));
        this.jPanelList.get(0).add(this.jPanelList.get(13));
        this.jPanelList.get(0).add(this.jPanelList.get(14));
        this.jPanelList.get(0).add(this.jPanelList.get(15));
        
    }

    public void iniciarJlabels() {
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("CREAR GRUPAL"));
        this.jLabelList.add(new JLabel("Periodo Académico:"));
        this.jLabelList.add(new JLabel("Sede:"));
        this.jLabelList.add(new JLabel("Campus/Extensión:"));
        this.jLabelList.add(new JLabel("Modalidad:"));
        this.jLabelList.add(new JLabel("Carrera:"));
        this.jLabelList.add(new JLabel("Codigo de Proyecto:"));
        this.jLabelList.add(new JLabel("Asignatura:"));
        this.jLabelList.add(new JLabel("Nombre de grupo:*"));
        this.jLabelList.add(new JLabel("Cupos por Grupo:*"));
        this.jLabelList.add(new JLabel("Autorización calificacion sobre 100:"));
        this.jLabelList.add(new JLabel("Seleccionar Jornada del Grupo:"));
        this.jLabelList.add(new JLabel("Oferta para estudiantes:"));
        this.jLabelList.add(new JLabel("Aplica Cambio de Grupo:"));
        this.jLabelList.get(0).setFont(new Font("Times New Roman",Font.PLAIN,20));
       
        this.jLabelList.add(new JLabel("2022-2022"));
        this.jLabelList.add(new JLabel("MATRIZ CUENCA"));
        this.jLabelList.add(new JLabel("EL VECINO"));
        this.jLabelList.add(new JLabel("PRESENCIAL"));
        this.jLabelList.add(new JLabel("AGROPECUARIA"));
        this.jLabelList.add(new JLabel("AGROPECUARIA[REDIEÑO]-NUEVA O REDISEÑO"));
        this.jLabelList.add(new JLabel("E-CV-IAG-003 BOTÁNICA"));
        
        this.jLabelList.add(new JLabel("91 caracteres restantes"));
        this.jLabelList.get(21).setFont(new Font("arial",Font.BOLD,6));
     
        this.jLabelList.get(19).setFont(new Font("arial",Font.BOLD,10));
        
        
        
        this.jPanelList.get(15).setBackground(Color.WHITE);
        this.jPanelList.get(17).setBackground(Color.WHITE);
        this.jPanelList.get(21).setBackground(Color.WHITE);
        this.jPanelList.get(25).setBackground(Color.WHITE);
        this.jPanelList.get(29).setBackground(Color.WHITE);
        this.jPanelList.get(33).setBackground(Color.WHITE);
        this.jPanelList.get(37).setBackground(Color.WHITE);
        this.jPanelList.get(41).setBackground(Color.WHITE);
        this.jPanelList.get(45).setBackground(Color.WHITE);
        this.jPanelList.get(47).setBackground(Color.WHITE);
        this.jPanelList.get(49).setBackground(Color.WHITE);
        this.jPanelList.get(51).setBackground(Color.WHITE);
        this.jPanelList.get(53).setBackground(Color.WHITE);
        this.jPanelList.get(55).setBackground(Color.WHITE);
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        
        this.jPanelList.get(2).setLayout(new GridLayout(1, 4));
        this.jPanelList.get(16).add(this.jLabelList.get(1));
        this.jPanelList.get(16).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(17).add(this.jLabelList.get(14));
        this.jPanelList.get(2).add(this.jPanelList.get(16));
        this.jPanelList.get(2).add(this.jPanelList.get(17));
        //this.jPanelList.get(2).add(this.jPanelList.get(18));
        //this.jPanelList.get(2).add(this.jPanelList.get(19));
        this.jPanelList.get(2).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        
        this.jPanelList.get(3).setLayout(new GridLayout(1, 4));
        this.jPanelList.get(20).add(this.jLabelList.get(2));
        this.jPanelList.get(20).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(21).add(this.jLabelList.get(15));
        this.jPanelList.get(3).add(this.jPanelList.get(20));
        this.jPanelList.get(3).add(this.jPanelList.get(21));
        //this.jPanelList.get(3).add(this.jPanelList.get(22));
        //this.jPanelList.get(3).add(this.jPanelList.get(23));
        
        this.jPanelList.get(3).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        this.jPanelList.get(4).setLayout(new GridLayout(1, 4));
        this.jPanelList.get(24).add(this.jLabelList.get(3));
        this.jPanelList.get(24).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(25).add(this.jLabelList.get(16));
        this.jPanelList.get(4).add(this.jPanelList.get(24));
        this.jPanelList.get(4).add(this.jPanelList.get(25));
        //this.jPanelList.get(4).add(this.jPanelList.get(26));
        //this.jPanelList.get(4).add(this.jPanelList.get(27));
        
        this.jPanelList.get(4).setBorder(new BevelBorder(BevelBorder.RAISED));
       
        this.jPanelList.get(5).setLayout(new GridLayout(1, 4));
        this.jPanelList.get(28).add(this.jLabelList.get(4));
        this.jPanelList.get(28).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(29).add(this.jLabelList.get(17));
        this.jPanelList.get(5).add(this.jPanelList.get(28));
        this.jPanelList.get(5).add(this.jPanelList.get(29));
        //this.jPanelList.get(5).add(this.jPanelList.get(30));
        //this.jPanelList.get(5).add(this.jPanelList.get(31));
        
        this.jPanelList.get(5).setBorder(new BevelBorder(BevelBorder.RAISED));
       
        this.jPanelList.get(6).setLayout(new GridLayout(1, 4));
        this.jPanelList.get(32).add(this.jLabelList.get(5));
        this.jPanelList.get(32).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(33).add(this.jLabelList.get(18));
        this.jPanelList.get(6).add(this.jPanelList.get(32));
        this.jPanelList.get(6).add(this.jPanelList.get(33));
        //this.jPanelList.get(6).add(this.jPanelList.get(34));
        //this.jPanelList.get(6).add(this.jPanelList.get(35));
        
        this.jPanelList.get(6).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        this.jPanelList.get(7).setLayout(new GridLayout(1, 4));
        this.jPanelList.get(36).add(this.jLabelList.get(6));
        this.jPanelList.get(36).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(37).add(this.jLabelList.get(19));
        this.jPanelList.get(7).add(this.jPanelList.get(36));
        this.jPanelList.get(7).add(this.jPanelList.get(37));
        //this.jPanelList.get(7).add(this.jPanelList.get(38));
        //this.jPanelList.get(7).add(this.jPanelList.get(39));
        
        this.jPanelList.get(7).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        
        
        
        this.jPanelList.get(8).setLayout(new GridLayout(1, 4));
        this.jPanelList.get(40).add(this.jLabelList.get(7));
        this.jPanelList.get(40).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(41).add(this.jLabelList.get(20));
        this.jPanelList.get(8).add(this.jPanelList.get(40));
        this.jPanelList.get(8).add(this.jPanelList.get(41));
        //this.jPanelList.get(8).add(this.jPanelList.get(42));
        //this.jPanelList.get(8).add(this.jPanelList.get(43));
        
        this.jPanelList.get(8).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        
        
        
        
        
        this.jPanelList.get(9).setLayout(new GridLayout(1, 2));
        this.jPanelList.get(44).add(this.jLabelList.get(8));
        this.jPanelList.get(9).add(this.jPanelList.get(44));
        this.jPanelList.get(9).add(this.jPanelList.get(45));
        this.jPanelList.get(44).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(45).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        
        this.jPanelList.get(10).setLayout(new GridLayout(1, 2));
        this.jPanelList.get(46).add(this.jLabelList.get(9));
        this.jPanelList.get(10).add(this.jPanelList.get(46));
        this.jPanelList.get(10).add(this.jPanelList.get(47));
        this.jPanelList.get(46).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(47).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        
        
        
        this.jPanelList.get(11).setLayout(new GridLayout(1, 2));
        this.jPanelList.get(48).add(this.jLabelList.get(10));
        this.jPanelList.get(11).add(this.jPanelList.get(48));
        this.jPanelList.get(11).add(this.jPanelList.get(49));
        this.jPanelList.get(48).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(49).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        
        this.jPanelList.get(12).setLayout(new GridLayout(1, 2));
        this.jPanelList.get(50).add(this.jLabelList.get(11));
        this.jPanelList.get(12).add(this.jPanelList.get(50));
        this.jPanelList.get(12).add(this.jPanelList.get(51));
        this.jPanelList.get(50).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(51).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        
        this.jPanelList.get(13).setLayout(new GridLayout(1, 2));
        this.jPanelList.get(52).add(this.jLabelList.get(12));
        this.jPanelList.get(13).add(this.jPanelList.get(52));
        this.jPanelList.get(13).add(this.jPanelList.get(53));
        this.jPanelList.get(52).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(53).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        
        
        this.jPanelList.get(14).setLayout(new GridLayout(1, 2));
        this.jPanelList.get(54).add(this.jLabelList.get(13));
        this.jPanelList.get(14).add(this.jPanelList.get(54));
        this.jPanelList.get(14).add(this.jPanelList.get(55));
        this.jPanelList.get(54).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(55).setBorder(new BevelBorder(BevelBorder.RAISED));
        
        

    }
    public void iniciarJComboBox(){
    this.jComboBoxList=new ArrayList<>();
    var sino= new String[2];
    sino[0]="NO";
    sino[1]="SI";
    this.jComboBoxList.add(new JComboBox(sino));
    
    var Jornadas=new String[3];
    Jornadas[0]="Jornadas disponibles";
    Jornadas[1]="Diurna";
    Jornadas[2]="Nocturna";
    this.jComboBoxList.add(new JComboBox(Jornadas));        

    this.jComboBoxList.add(new JComboBox(sino));
    
    
  this.jPanelList.get(49).add(this.jComboBoxList.get(0));
  this.jPanelList.get(51).add(this.jComboBoxList.get(1));  
  this.jPanelList.get(55).add(this.jComboBoxList.get(2));
    }
    
    public void iniciarJButtons(){
     this.jButtonList=new ArrayList<>();
     this.jButtonList.add(new JButton("Guardar"));
     this.jButtonList.add(new JButton("Cancelar"));
    this.jPanelList.get(15).add(this.jButtonList.get(0));
    this.jPanelList.get(15).add(this.jButtonList.get(1));
   }
    public void iniciarJTextfile(){
    this.jTextFileList=new ArrayList<>();
    this.jTextFileList.add(new JTextField("GRUPO-1",16));
    this.jPanelList.get(45).add(this.jTextFileList.get(0));
    this.jPanelList.get(45).add(this.jLabelList.get(21));
    this.jTextFileList.add(new JTextField("                           #",10));
    this.jPanelList.get(47).add(this.jTextFileList.get(1));
    
    }
    public void iniciarChecks(){
    this.jCheckBoxList= new ArrayList<>();
    this.jCheckBoxList.add(new JCheckBox("nuevo"));
    this.jPanelList.get(53).add(this.jCheckBoxList.get(0));
    
    }
    

}
