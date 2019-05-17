package Grafico;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class TrazarMapa extends JPanel{
	
	public Image imagen;
	public URL url;
	private Integer opcion;
	private Integer contador;
		
	public TrazarMapa(){
		url=this.getClass().getResource("/Datos/Zona costanera.jpg");
		imagen=new ImageIcon(url).getImage();
		
		
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();
		trazarMapa(g2d);
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			
	}
	
	public void trazarMapa(Graphics2D g2d){
		if (imagen != null) {
            g2d.drawImage(imagen, 0, 0,  getWidth(), getHeight(),this);
            
          //  1257, 698
            setOpaque(false);
		}
		//dibujarLineas(g2d);
		g2d.setColor(Color.BLACK);
		g2d.setFont(new Font("SansSerif", Font.BOLD, 16));
		g2d.drawString("Mapa Ciudad Santa Fe", 10, 20);
		g2d.setStroke(new BasicStroke(1));
		this.removeAll();
		
	}
	
	
	
	
	public void setOpcion(Integer opcion){
		this.opcion = opcion;
	}

	public Integer getOpcion() {
		return opcion;
	}

	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}
	

}
