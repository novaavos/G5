package generation;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Controlador {
	
	public static void main(String[] args) {
		
		Introducao i = new Introducao();
		Pfizer p = new Pfizer();
		
		Scanner l = new Scanner(System.in);
		
		Object[] options = {"Pfizer","CoronaVac", "AstraZeneca"};
		
		i.intro();
		
		int resposta = 0; 
	
		 	resposta = JOptionPane.showOptionDialog(null, //frame
				"Sobre qual vacina voc� quer saber?", //Mensagem
				"Vamos falar sobre vacinas?",         //T�tulo
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null,								  //Icone
				options,                              //Um vetor de op��es para cada bot�o
				null);								  //Op��o de bot�o default
	//	JOptionPane.showMessageDialog(null, resposta);
		
	//	JOptionPane.showMessageDialog(null, "A mensagem selecionada foi: "+options[resposta]);
		
		 	
		 	
		switch (resposta) {
				case 0: p.intro();
				break; 	
		}
		
		

		
	}
}


