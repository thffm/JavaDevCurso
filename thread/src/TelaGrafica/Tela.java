package TelaGrafica;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela  extends JDialog{
	private JPanel painel = new JPanel(new GridBagLayout());
	private JLabel text1 = new JLabel("Vitoria");
	private JButton amar = new JButton("Amar");
	private JButton comer = new JButton("Transar forte");
	
	public Tela() {
		
		setTitle("Sobre Vitoria");
		setSize(new Dimension(320,240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridBag = new GridBagConstraints();
		gridBag.gridx = 0;
		gridBag.gridy = 0;
		gridBag.gridwidth = 2;
		gridBag.insets = new Insets(5, 10, 5, 10);
		gridBag.anchor = GridBagConstraints.WEST;
		
		text1.setPreferredSize(new Dimension(150,30));
		painel.add(text1,gridBag);
		
		
		gridBag.gridwidth = 1;
		amar.setPreferredSize(new Dimension(90,45));
		gridBag.gridy++;
		painel.add(amar,gridBag);
		
		comer.setPreferredSize(new Dimension(170,45));
		gridBag.gridx++;
		painel.add(comer,gridBag);
		
		add(painel,BorderLayout.WEST);
		setVisible(true);
	}

}