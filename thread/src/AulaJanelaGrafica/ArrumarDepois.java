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

public class ArrumarDepois extends JDialog {
    
    private JPanel jPanel = new JPanel(new GridBagLayout()); /* Painel de componentes */
    
    private JLabel descicaoHora = new JLabel("Time Thread 1"); /* Componente */
    private JTextField mostraTempo = new JTextField();
    
    private JLabel descicaoHora2 = new JLabel("Time Thread 2");
    private JTextField mostraTempo2 = new JTextField();
    
    private JButton jButton1 = new JButton("Start");
    private JButton jButton2 = new JButton("Stop");
    
    private volatile boolean running = false;
    private Thread thread1Time;
    private Thread thread2Time;

    /* Thread */
    private Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            while (running) {
                try {
                    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                    Date data = Calendar.getInstance().getTime();
                    mostraTempo.setText(fmt.format(data));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    
    private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while (running) {
                try {
                    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                    Date data = Calendar.getInstance().getTime();
                    mostraTempo2.setText(fmt.format(data));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
			
		}
	};

    public ArrumarDepois() {
        setTitle("Minha tela de time com thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);
        
        jButton2.setEnabled(false);
        
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
        mostraTempo.setEditable(false);
        jPanel.add(mostraTempo, bagConstraints);

        descicaoHora2.setPreferredSize(new Dimension(200, 25));
        bagConstraints.gridy++;
        jPanel.add(descicaoHora2, bagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        bagConstraints.gridy++;
        mostraTempo2.setEditable(false);
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
                startThread1();
                startThread2();
                
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);
                
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopThread1();
                stopThread2();
                
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
            }
        });

        add(jPanel, BorderLayout.WEST);
        
        setVisible(true); /* Ultimo a ser executado */
    }

    private void startThread1() {
        if (thread1Time == null || !running) {
            running = true;
            thread1Time = new Thread(thread1);
            thread1Time.start();
        }
    }

    private void stopThread1() {
        if (thread1Time != null && running) {
            running = false;
            try {
                thread1Time.join(); // Ensure the thread finishes execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread1Time = null;
        }
    }
    
    private void startThread2() {
        if (thread2Time == null || !running) {
            thread2Time = new Thread(thread2);
            thread2Time.start();
        }
    }

    private void stopThread2() {
        if (thread2Time != null && running) {
           
            try {
                thread2Time.join(); // Ensure the thread finishes execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread2Time = null;
        }
    }
    

    
}
