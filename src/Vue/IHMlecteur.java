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
import java.util.Observable;
import java.util.Observer;



public class IHMlecteur extends JFrame implements Observer, ActionListener {

	/**
	 * 
	 * @param id
	 * @param numCarte
	 * @param codeCarte
	 */
    
     private JPanel lecteur = new JPanel();
     private JTextField cardNum = new JTextField();
     private JTextField cardCode = new JTextField();
     private JLabel numLabel = new JLabel("Numéro de Carte : ");
     private JLabel codeLabel = new JLabel("Code de Carte : ");     
     Graphics g;
    
    
     
	public IHMlecteur(int id, int numCarte, String codeCarte) {
		               
        JButton insererCarte = new JButton("Inserer Carte");
        insererCarte.addActionListener(this);
        
        this.setTitle("Controle de porte");
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lecteur.setLayout(new BorderLayout());
        lecteur.add(insererCarte, BorderLayout.SOUTH);
        
       lecteur.paintComponents(g);
        
        JPanel lecteurCarte=new JPanel();
        
        cardNum.setPreferredSize(new Dimension(150,30));
        cardCode.setPreferredSize(new Dimension(150,30));
        
        lecteurCarte.add(numLabel);
        lecteurCarte.add(cardNum);
        lecteurCarte.add(codeLabel);
        lecteurCarte.add(cardCode);
          
        lecteur.add(lecteurCarte, BorderLayout.NORTH);
        
        this.setContentPane(lecteur);
        this.setVisible(true);
        
	}
        
         public void actionPerformed(ActionEvent e){
       /*
        Controleur part 
        
        String checkNumero = cardNum.getText();
        String checkCode = cardCode.getText();
        
        if(checkCode != ){
            verrouiller(porte);
            voyant(false);
        }
        else{
            ouvrir(porte);
            voyant(true);
        }
  
      */
        
      // update();

    }
          public void paintComponent(Graphics g){
         //super.paint(g);
         //Color c = g.getColor();
         
         g.drawRect(10, 160, 60, 60);
    
	
	}

    @Override
    public void update(Observable o, Object arg) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }


}