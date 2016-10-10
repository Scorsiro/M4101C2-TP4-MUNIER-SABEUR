package Vue;


import Controleur.Controleur;
import Modele.Employé;
import Modele.Porte;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JComponent;



class MyCanvas extends JComponent{
  
  @Override
  
  public void paint(Graphics g) {
    g.drawRect (300, 125, 100, 100);  
  }
  
  
}

public class IHMlecteur extends JFrame implements Observer {

	/**
	 * 
	 * @param id
	 * @param numCarte
	 * @param codeCarte
	 */
     //private Controleur controleur;
    
     public JPanel lecteur = new JPanel();
     public JTextField cardNum = new JTextField();
     public JTextField cardCode = new JTextField();
     public JLabel numLabel = new JLabel("Numéro de Carte : ");
     public JLabel codeLabel = new JLabel("Code de Carte : ");
     public MyCanvas canvas = new MyCanvas();
     //Graphics g;
    
    
     
	public IHMlecteur(int id, int numCarte, String codeCarte, Controleur controleur) {
	
        //this.controleur = controleur;
        
        this.setTitle("Controle de porte");
        this.setSize(700,550);
        Toolkit t = this.getToolkit();
        Dimension d = t.getScreenSize();
        this.setLocation(d.width/2,0);
        //this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lecteur.setLayout(new BorderLayout());
        
        
        //lecteur.paint(g);
        lecteur.add(canvas);
        
        JPanel lecteurCarte=new JPanel();
     
        
        
        cardNum.setPreferredSize(new Dimension(150,30));
        cardNum.setText(Integer.toString(numCarte));
        cardCode.setPreferredSize(new Dimension(150,30));
        cardCode.setText(codeCarte);
        
        JButton insererCarte = new JButton("Inserer Carte");
        insererCarte.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controleur.lireCarte(id, Integer.parseInt(cardNum.getText()), cardCode.getText());
            }
        });
        
        lecteurCarte.add(numLabel);
        numLabel.setLabelFor(cardNum);
        lecteurCarte.add(cardNum);
      
        
        lecteurCarte.add(codeLabel);
        codeLabel.setLabelFor(cardCode);
        lecteurCarte.add(cardCode);
        
       // SpringUtilities.makeCompactGrid(lecteur,2, 6, 6, 6, 6);
        
        lecteur.add(insererCarte, BorderLayout.SOUTH);
          
        lecteur.add(lecteurCarte, BorderLayout.NORTH);
        
        
        this.setContentPane(lecteur);
        this.setVisible(true);
        
	}

        
    @Override
    public void update(Observable o, Object arg) {
        Graphics g = canvas.getGraphics();
     
     if (((Porte)((HashMap)arg).get("porte")).getEtatVoyantVert()){
        canvas.paint(g);
        g.setColor(Color.GREEN); 
        g.fillRect(300,125,100,100); 
     }
     else {
        canvas.paint(g);
        g.setColor(Color.RED);
        g.fillRect(300,125,100,100);
     }
    }
}

