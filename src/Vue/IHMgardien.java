package Vue;

import Controleur.Controleur;
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

public class IHMgardien extends JFrame implements Observer {

    private JPanel gardienInfo;
    private JPanel gardienEmpl;
    private final JLabel nomEmployé = new JLabel("Nom de l'employé : ");
    //private final JLabel prenomEmployé = new JLabel("Prénom de l'employé : ");
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
      /*  autAcces.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controleur.lireCarte(id-1, Integer.parseInt(cardNum.getText())-1, cardCode.getText());
            }
        });*/
        gardienInfo = new JPanel();
        gardienEmpl = new JPanel();
        gardienInfo.add(nomEmployé);
        gardienEmpl.add(numeroCarte);
        gardienEmpl.add(codeCarte);
        gardienInfo.add(porteAccedee);
        gardien.add(gardienInfo, BorderLayout.PAGE_START);
        gardien.add(gardienEmpl, BorderLayout.WEST);
  
        this.setContentPane(gardien);
        this.setVisible(true);
        
        
    
    }

    @Override
    public void update(Observable o, Object arg) {
        String format = "dd/MM/yy H:mm:ss";

        SimpleDateFormat formater = new SimpleDateFormat( format );
        Date date = new Date();

        JLabel currdate= new JLabel(formater.format(date)) ;
        
        Porte p = (Porte) arg;
     
        
       JTextField nomPorte = new JTextField(p.getId());
      // JTextField prenomEmp = new JTextField(p.getPrenom());
       
           
       //gardienInfo.add();
       //gardien.add(prenomEmp);
       //gardien.setLayout(new BorderLayout());
       gardien.add(currdate, BorderLayout.PAGE_END);
           
    }
    
    
}