package AulaJanelaGrafica;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout()); /* Painel de componentes */
    
    private JLabel descicaoHora = new JLabel("Nome"); /* Componente */
    private JTextField mostraTempo = new JTextField();
    
    private JLabel descicaoHora2 = new JLabel("Email");
    private JTextField mostraTempo2 = new JTextField();
    
    private JButton jButton1 = new JButton("Add Lista");
    private JButton jButton2 = new JButton("Stop");
    
    private implementacaoFilaThread fila = new implementacaoFilaThread();
    
    private volatile boolean running = false;
    private Thread thread1Time;
    private Thread thread2Time;

    /* Thread */
   

    public TelaTimeThread() {
        setTitle("Minha tela de time com thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);
        
        /*jButton2.setEnabled(false);*/
        
        GridBagConstraints bagConstraints = new GridBagConstraints();
        bagConstraints.gridx = 0;
        bagConstraints.gridy = 0;
        bagConstraints.gridwidth = 2;
        bagConstraints.insets = new Insets(5, 10, 5, 5);
        bagConstraints.anchor = GridBagConstraints.WEST;

        descicaoHora.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descicaoHora, bagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        bagConstraints.gridy++;
        /*mostraTempo.setEditable(false);*/
        jPanel.add(mostraTempo, bagConstraints);

        descicaoHora2.setPreferredSize(new Dimension(200, 25));
        bagConstraints.gridy++;
        jPanel.add(descicaoHora2, bagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        bagConstraints.gridy++;
        /*mostraTempo2.setEditable(false);*/
        jPanel.add(mostraTempo2, bagConstraints);

        bagConstraints.gridwidth = 1;

        jButton1.setPreferredSize(new Dimension(95, 25));
        bagConstraints.gridy++;
        jPanel.add(jButton1, bagConstraints);

        jButton2.setPreferredSize(new Dimension(92, 25));
        bagConstraints.gridx++;
        jPanel.add(jButton2, bagConstraints);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*startThreads();
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);
                */
            	
            	ObjetoFilaThread filathread = new ObjetoFilaThread();
            	filathread.setNome(mostraTempo.getText());
            	filathread.setEmail(mostraTempo2.getText());
            	
            	fila.add(filathread);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*stopThreads();
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);*/
            	try{
            		
            		fila = null;
            		System.out.println("topou");
            		
            	}catch(Exception er) {
            		er.printStackTrace();
            	}
            }
        });

        add(jPanel, BorderLayout.WEST);
        
        
        fila.start();
        setVisible(true); /* Ultimo a ser executado */
    }

    /*
    private void startThreads() {
        if (!running) {
            running = true;
            thread1Time = new Thread(thread1);
            thread1Time.start();
            thread2Time = new Thread(thread2);
            thread2Time.start();
        }
    }

    private void stopThreads() {
        if (running) {
            running = false;
            try {
                thread1Time.join();
                thread2Time.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
*/
    
}
