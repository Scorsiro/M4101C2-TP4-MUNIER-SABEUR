package Vue;

import Controleur.Controleur;
import Modele.Carte;
import Modele.Porte;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class IHMappli extends JFrame {

	public IHMappli(Controleur controleur) {
            
            
            this.setTitle("Appli");
            this.setSize(800,500);
            // Centrage de la fenêtre
            this.setLocation(new Point(0,0));
            //this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel panelAppli = new JPanel(new BorderLayout());
            
            JPanel panelNorth = new JPanel(new GridLayout(1, 2));
            JPanel panelCentre = new JPanel(new GridLayout(1,2));
            JPanel panelSouth = new JPanel(new GridLayout(1, 2));
            
            panelNorth.add(new JLabel("Nom de l'employé"));
            panelNorth.add(new JLabel("Intitulé de la porte"));
            
            panelAppli.add(panelNorth, BorderLayout.NORTH);
            panelAppli.add(panelCentre, BorderLayout.CENTER);
            panelAppli.add(panelSouth, BorderLayout.SOUTH);

            JPanel panelNumCarte = new JPanel(new GridLayout(1,2));
            panelNumCarte.add(new JLabel("Numéro de carte : "));
            JLabel labelNumCarte = new JLabel();
            panelNumCarte.add(labelNumCarte);
            
            panelSouth.add(panelNumCarte);
            
            // Liste d'employés
            Vector<String> employes = new Vector();
            HashMap<String,Integer> mapIdEmployes = new HashMap<>();
            for (Map.Entry<Integer,Carte> e : controleur.cartes.entrySet()){
                employes.add(e.getKey()+" - "+e.getValue().getProprio().getPrenom()+" "+e.getValue().getProprio().getNom());
                mapIdEmployes.put(employes.lastElement(), e.getKey());
            }
            JList listEmployes = new JList(employes);
            listEmployes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            listEmployes.setSelectedIndex(0);
            labelNumCarte.setText(Integer.toString(mapIdEmployes.get(listEmployes.getSelectedValue().toString())));
            listEmployes.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    labelNumCarte.setText(Integer.toString(mapIdEmployes.get(listEmployes.getSelectedValue().toString())));
                }
            });
            
            // Liste de portes
            Vector<String> portes = new Vector();
            HashMap<String,Integer> mapIdPortes = new HashMap<>();
            for (Map.Entry<Integer,Porte> e : controleur.portes.entrySet()){
                portes.add(e.getValue().getIntitule());
                mapIdPortes.put(portes.lastElement(), e.getKey());
            }
            JList listPortes = new JList(portes);
            listPortes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            listPortes.setSelectedIndex(0);
            
            panelCentre.add(listEmployes);
            panelCentre.add(listPortes);
            
            JButton lancerLecteur = new JButton("Acceder au lecteur");
            lancerLecteur.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    controleur.addObserver(new IHMlecteur((mapIdPortes.get(listPortes.getSelectedValue().toString())), Integer.parseInt(labelNumCarte.getText()), controleur.cartes.get(Integer.parseInt(labelNumCarte.getText())).getCodeCarte(), controleur));
                }
            });
            panelSouth.add(lancerLecteur);
            
            this.setContentPane(panelAppli);
            this.setVisible(true);
	}

}