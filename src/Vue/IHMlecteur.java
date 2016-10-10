package Vue;


import Controleur.Controleur;
import Modele.Porte;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
     public int id;
     public JPanel lecteur = new JPanel();
     public JTextField cardNum = new JTextField();
     public JTextField cardCode = new JTextField();
     public JLabel numLabel = new JLabel("Numéro de Carte : ");
     public JLabel codeLabel = new JLabel("Code de Carte : ");
     public MyCanvas canvas = new MyCanvas();
    
    
     
	public IHMlecteur(int id, int numCarte, String codeCarte, Controleur controleur) {
	
        this.id = id;
        
        this.setTitle("Controle de porte");
        this.setSize(700,550);
        Toolkit t = this.getToolkit();
        Dimension d = t.getScreenSize();
        this.setLocation(d.width/2,0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lecteur.setLayout(new BorderLayout());
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

        lecteur.add(insererCarte, BorderLayout.SOUTH);
        lecteur.add(lecteurCarte, BorderLayout.NORTH);

        this.setContentPane(lecteur);
        this.setVisible(true);
        
	}

        
    @Override
    public void update(Observable o, Object arg) {
    Porte porte = (Porte)((HashMap)arg).get("porte");
    if (porte.getId()==this.id){
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
}

