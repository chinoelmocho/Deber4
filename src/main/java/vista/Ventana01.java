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
public class Ventana01 extends JFrame {
   private List<JPanel> jPanelList;
   private List<JButton> jButtonList;
   private List<JLabel> jLabelList;
   private List<JTextField> jTextFile;
   private List<JComboBox> jComboBox;
   
   
    public Ventana01() throws HeadlessException{
    this.setTitle("Grid Layout");
    this.setSize(500, 300);
    this.setLocation(200, 100);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.iniciarPaneles();
    this.iniciarJlabels(); 
    this.iniciarJComboBox();
    this.iniciarJButtons();
    this.iniciarJTextfile();
    
    this.setContentPane(this.jPanelList.get(0));
    this.setVisible(true);
            }
    public void iniciarPaneles(){
    this.jPanelList= new ArrayList<>();
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    
    this.jPanelList.get(5).setBackground(Color.WHITE);
    this.jPanelList.get(2).setBackground(Color.WHITE);
    this.jPanelList.get(3).setBackground(Color.WHITE);
    this.jPanelList.get(4).setBackground(Color.WHITE);
    this.jPanelList.get(1).setBackground(new Color(129, 143, 250 ));
    
    this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
    
    
    this.jPanelList.get(0).setLayout( new GridLayout(5, 1));
    this.jPanelList.get(0).add(this.jPanelList.get(1));
    this.jPanelList.get(0).add(this.jPanelList.get(2));
    this.jPanelList.get(0).add(this.jPanelList.get(3));
    this.jPanelList.get(0).add(this.jPanelList.get(4));
    this.jPanelList.get(0).add(this.jPanelList.get(5));
    }
    public void iniciarJlabels(){
    this.jLabelList=new ArrayList<>();
    this.jLabelList.add(new JLabel("INSCRÍBETE"));
    this.jLabelList.add(new JLabel("Seleccione una Sede: *"));
    this.jLabelList.add(new JLabel("Tipo de Documento:"));
    this.jLabelList.add(new JLabel("Ingrese su Identificacion: *"));
    
    this.jLabelList.get(0).setFont(new Font("Times New Roman",Font.PLAIN,20));
    this.jPanelList.get(1).add(this.jLabelList.get(0));
    
    this.jLabelList.get(1).setFont(new Font("Times New Roman",Font.PLAIN,14));
    this.jPanelList.get(2).add(this.jLabelList.get(1));
    
    this.jLabelList.get(2).setFont(new Font("Times New Roman",Font.PLAIN,14));
    this.jPanelList.get(3).add(this.jLabelList.get(2));
    
    this.jLabelList.get(3).setFont(new Font("Times New Roman",Font.PLAIN,14));
    this.jPanelList.get(4).add(this.jLabelList.get(3));
    
    }
    public void iniciarJButtons(){
    this.jButtonList=new ArrayList<>();
    
    this.jButtonList.add(new JButton("Ingresar"));
    this.jPanelList.get(5).add(this.jButtonList.get(0));
    
    
    }
    public void iniciarJComboBox(){
    this.jComboBox = new ArrayList<>();
    var sedes=new String[3];
    sedes[0]="MATRIZ CUENCA";
    sedes[1]="El Vecino";
    sedes[2]="El Concencionario";
    this.jComboBox.add(new JComboBox(sedes));
    var tipodocuemntos= new String[3];
    tipodocuemntos[0]="CÉDULA";
    tipodocuemntos[1]="PASAPORTE";
    tipodocuemntos[2]="VISA";
    this.jComboBox.add(new JComboBox(tipodocuemntos));
    
    
    
    
    this.jPanelList.get(2).add(this.jComboBox.get(0));
    this.jPanelList.get(3).add(this.jComboBox.get(1));
    
    
    }
    public void iniciarJTextfile(){
    this.jTextFile = new ArrayList<>();
    this.jTextFile.add(new JTextField(15));
    this.jPanelList.get(4).add(this.jTextFile.get(0));
    
    
    }

    }
    
    
    
    
    
    

