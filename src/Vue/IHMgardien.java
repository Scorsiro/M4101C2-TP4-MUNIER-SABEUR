package Vue;


import Modele.Employé;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;


public class IHMgardien extends JFrame implements Observer {

    
    private final JLabel nomEmployé = new JLabel("Nom de l'employé : ");
    private final JLabel prenomEmployé = new JLabel("Prénom de l'employé : ");
    private JLabel numeroCarte = new JLabel("Numero de Carte utilisée : ");
    private JLabel codeCarte = new JLabel("Code de la Carte : ");
    private JLabel porteAccedee = new JLabel("Tentative d'ouverture de la Porte : ");
    private JPanel gardien = new JPanel();
    private JButton autAcces = new JButton("Autoriser Acces");
    
    
    public IHMgardien(){
        
       this.setTitle("Controle Gardien");
       this.setSize(800,500);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        gardien.setLayout(new BorderLayout());
        gardien.add(autAcces, BorderLayout.SOUTH);
        
        
        gardien.add(nomEmployé);
        gardien.add(numeroCarte);
        gardien.add(codeCarte);
        gardien.add(porteAccedee);
        
        
        this.setContentPane(gardien);
        this.setVisible(true);
        
        
    
    }

    @Override
    public void update(Observable o, Object arg) {
        Employé e = (Employé) arg;
        Date d=new Date();
        
       JTextField nomEmp = new JTextField(e.getNom());
       JTextField prenomEmp = new JTextField(e.getPrenom());
       
           
       gardien.add(nomEmp);
       gardien.add(prenomEmp);
       
       JLabel date = new JLabel(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
           
    }
    
    
}