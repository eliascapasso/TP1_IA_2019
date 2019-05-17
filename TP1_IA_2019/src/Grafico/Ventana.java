package Grafico;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


@SuppressWarnings("serial")
public class Ventana extends JFrame{
	
	TrazarMapa tm;
	
	
	public Ventana(){
		super();
		inicializacion();
		
		
	}

	private void inicializacion() {
		this.setSize(1200, 900);
		this.setTitle("TP IA");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		botones();
			
		Container contenedor= getContentPane();
		
		tm=new TrazarMapa();
		contenedor.add(tm);
		
		
	}
	
	
	
	public void botones(){
		setExtendedState( getExtendedState()|JFrame.MAXIMIZED_BOTH );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		JButton btnResultado = new JButton("Resultado");
		btnResultado.setBounds(1100, 100, 150, 30);
		btnResultado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tm.setOpcion(1);
				
				tm.repaint();
			}
		});
		add(btnResultado);
		
		JButton btnBoton = new JButton("Resultado");
		btnBoton.setBounds(1100, 150, 150, 30);
		btnBoton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//tm.setOpcion(1);
				
				tm.repaint();
			}
		});
		add(btnBoton);
		
		JButton btnBoton1 = new JButton("Resultado");
		btnBoton1.setBounds(1100, 200, 150, 30);
		btnBoton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//tm.setOpcion(1);
				
				tm.repaint();
			}
		});
		add(btnBoton1);
	}
	

	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Ventana principal = new Ventana();
                principal.setVisible(true);
             

            }
        });
        }
	


}
