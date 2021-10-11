package generation;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Controlador {
	
	public static void main(String[] args) {
		
		Introducao i = new Introducao();
		
		Scanner l = new Scanner(System.in);
		
		Object[] options = {"Pfizer","CoronaVac", "AstraZeneca"};
		
		i.intro();
		
		int resposta = JOptionPane.showOptionDialog(null, 
				"Sobre qual vacina você quer saber?", //Mensagem
				"Vamos falar sobre vacinas?",		  //Título
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null,								  //Icone
				options,                              //Um vetor de opções para cada botão
				null);								  //Opção de botão default
		
		
		JOptionPane.showMessageDialog(null, "A mensagem selecionada foi: "+resposta);
	}

}
