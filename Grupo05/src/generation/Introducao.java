package generation;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class Introducao {
   
	String mensagem = "Ol�, vamos falar sobre vacinas?\n"
			+"As vacinas s�o o meio mais seguro e eficaz de nos protegermos contra certas doen�as infecciosas,"
			+ "\n"				
			+ "e s�o obtidas a partir de part�culas do pr�prio agente agressor, sempre na forma atenuada (enfraquecida) ou inativada (morta).\n"	
			+ "Quando nosso organismo � atacado por um v�rus ou bact�ria, nosso sistema imunol�gico � de defesa � dispara uma rea��o em cadeia"
			+ "\n"	
			+ "com o objetivo de frear a a��o desses agentes estranhos. Infelizmente, nem sempre essa �opera��o� � bem-sucedida e, quando isso ocorre, ficamos doentes.\r\n"
			+ "O que as vacinas fazem � se passarem por agentes infecciosos de forma a estimular a produ��o de nossas defesas, por meio de anticorpos espec�ficos contra o �inimigo�."
			+ "\nAssim, elas ensinam o nosso organismo a se defender de forma eficaz. A�, quando o ataque de verdade acontece, a defesa � reativada por meio da mem�ria do sistema imunol�gico. "
			+ "\n� isso que vai fazer com que a a��o inimiga seja muito limitada ou, como acontece na maioria das vezes, totalmente eliminada, antes que a doen�a se instale.";

	Object options[] = {"Pr�ximo>"};
	
	ImageIcon image = new ImageIcon("src/Imagens/vaccine.png");

	
	public void intro() {
		
		int resposta = JOptionPane.showOptionDialog(null, 
				mensagem, 							  //Mensagem
				"Vamos falar sobre vacinas?",		  //T�tulo
				JOptionPane.YES_NO_CANCEL_OPTION,	
				JOptionPane.PLAIN_MESSAGE,
				image,								  //Icone
				options,  							  //Um vetor de op��es para cada bot�o
				null);								  //Op��o de bot�o default
		
		
	
	}
}
