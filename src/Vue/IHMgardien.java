package Vue;

import Controleur.Controleur;
import Modele.Carte;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import Modele.Porte;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.border.Border;

public class IHMgardien extends JFrame implements Observer {

    private JPanel container = new JPanel();
    private JPanel gardien = new JPanel();
    
    public IHMgardien(){
        
       this.setTitle("Controle Gardien");
       this.setSize(800,500);
       // Centrage de la fenêtre
       //this.setLocationRelativeTo(null);
       Toolkit t = this.getToolkit();
       Dimension d = t.getScreenSize(); 
       this.setLocation(0, d.height/2);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        gardien.setLayout(new BorderLayout());
        
        JLabel idPorte =new JLabel("Identifiant de porte");
        JLabel numCarte = new JLabel("Numéro de carte");
        JLabel date = new JLabel("Date et heure");
        
        idPorte.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        numCarte.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        
        JPanel entete = new JPanel(new GridLayout(1, 2));
        entete.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        entete.add(idPorte);
        entete.add(numCarte);
        entete.add(date);
        gardien.add(entete, BorderLayout.NORTH);
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        gardien.add(container, BorderLayout.CENTER);
  
        this.setContentPane(gardien);
        this.setVisible(true);
        
        
    
    }

    @Override
    public void update(Observable o, Object arg) {
        Carte carte = (Carte)((HashMap)arg).get("carte");
        Porte porte = (Porte)((HashMap)arg).get("porte");
        
        String format = "dd/MM/yy H:mm:ss";

        SimpleDateFormat formater = new SimpleDateFormat( format );
        Date date = new Date();

        JLabel currdate= new JLabel(formater.format(date)) ;
        currdate.setMaximumSize(new Dimension(Integer.MAX_VALUE, currdate.getMinimumSize().height));
        
        JLabel idPorte = new JLabel(Integer.toString(porte.getId()));
        idPorte.setMaximumSize(new Dimension(Integer.MAX_VALUE, idPorte.getMinimumSize().height));
        idPorte.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        
        JLabel numCarte = new JLabel(Integer.toString(carte.getNumCarte()));
        numCarte.setMaximumSize(new Dimension(Integer.MAX_VALUE, numCarte.getMinimumSize().height));
        numCarte.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        
        JPanel ligne = new JPanel(new GridLayout(1, 3));
        ligne.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
        
        if (porte.getEtatVoyantVert()){
            ligne.setBackground(Color.GREEN);
        } else {
            ligne.setBackground(Color.RED);
        }
        
        ligne.add(idPorte);
        ligne.add(numCarte);
        ligne.add(currdate);
        
        ligne.setMaximumSize(new Dimension(Integer.MAX_VALUE, ligne.getMinimumSize().height));
        container.add(ligne);
        
        
        this.setContentPane(gardien);
        this.setVisible(true);
           
    }
    
    
}