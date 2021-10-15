package generation;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Controlador {
	
	public static void main(String[] args) {
		
		Introducao i = new Introducao();
		Pfizer p = new Pfizer();
		Janssen j = new Janssen();
		Covid c = new Covid();
		
		Scanner l = new Scanner(System.in);
		//Ordem das coisas
		
		c.covidMensagem();
		i.intro();
		escolhaVacinas();
		
		int resposta = 0; 
								      	 												   	

		l.close();
	}
	
	public static void escolhaVacinas() {
		Object[] options = {"Pfizer","CoronaVac", "AstraZeneca", "Janssen"};
		Introducao i = new Introducao();
		Pfizer p = new Pfizer();
		Janssen j = new Janssen();
		
		ImageIcon image = new ImageIcon("src/Imagens/vaccine.png");
		ImageIcon qr = new ImageIcon("src/Imagens/qr-code.png");
		
	 	int resposta = JOptionPane.showOptionDialog(null,
			"Sobre qual vacina você quer saber?",     
			"Vamos falar sobre vacinas?",             
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.PLAIN_MESSAGE,
			image,								      
			options,                                  
			null);	
	 //	 JOptionPane.showMessageDialog(null, "Valor resposta: "+ resposta);
	 	 
			switch (resposta) {
			case 0: 
				p.intro();
				break; 	
			case 1: 
				break;
			case 2:
				break;
			case 3:
				j.intro();
				break;
			case -1:
				JOptionPane.showMessageDialog(null, "","Créditos", JOptionPane.PLAIN_MESSAGE, qr);
			}
	}
}


