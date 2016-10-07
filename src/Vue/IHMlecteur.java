package Vue;


import Controleur.Controleur;
import Modele.Employé;
import Modele.Porte;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JComponent;

class MyCanvas extends JComponent {

  @Override
  public void paint(Graphics g) {
    g.drawRect (10, 160, 60, 60);  
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
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lecteur.setLayout(new BorderLayout());
        
        
        //lecteur.paintComponents(g);
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
                controleur.lireCarte(id-1, Integer.parseInt(cardNum.getText())-1, cardCode.getText());
            }
        });
        
        lecteurCarte.add(numLabel);
        lecteurCarte.add(cardNum);
        lecteurCarte.add(codeLabel);
        lecteurCarte.add(cardCode);
        
        lecteur.add(insererCarte, BorderLayout.SOUTH);
          
        lecteur.add(lecteurCarte, BorderLayout.NORTH);
        
        this.setContentPane(lecteur);
        this.setVisible(true);
        
	}
        
        // public void actionPerformed(ActionEvent e){
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

    //}
         // public void paintComponent(Graphics g){
         //super.paint(g);
         //Color c = g.getColor();
         
         //g.drawRect(10, 160, 60, 60);
    
	
	//}

    @Override
    public void update(Observable o, Object arg) {
        
     //Color x =  this.colorRect(ctroleur.getChange());
     //this.colorRect(x);
     if (((Porte)arg).getEtatVoyantVert()){
         canvas.setBackground(Color.green);
         lecteur.setBackground(Color.green);
     }
     else {
         canvas.setBackground(Color.red);
         lecteur.setBackground(Color.red);
         //lecteur.getGraphics().setBackground(Color.red);
     }
     //lecteur.add(canvas);
     //this.revalidate();
     //this.repaint();
    }
       
    
    /*public void colorRect(Color c){
        
        g.setColor(c);
        g.fillRect(10,160,60,60);
    }*/
}

