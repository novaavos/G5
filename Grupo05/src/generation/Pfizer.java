package generation;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Pfizer{
	
	
	String pfizer = "\nO imunizante da farmacêutica Pfizer em parceria com o laboratório BioNTech "
			+ "\nse baseia na tecnologia de RNA mensageiro, ou mRNA. "
			+ "\nO RNA mensageiro sintético dá as instruções ao organismo para a"
			+ "\nprodução de proteínas encontradas na superfície do novo coronavírus, "
			+ "\nque estimulam a resposta do sistema imune."
			+ "\nFonte: Butantan Oficial "; 
	
	
	Object option[] = {"Efeitos Adversos", "Fabricante", "Voltar"};
			
	ImageIcon image = new ImageIcon("src/Imagens/vaccine.png");
	
	public void intro() {
		
		int resposta = JOptionPane.showOptionDialog(null, 
				pfizer,                               //Mensagem
				"Pfizer - Biontech",                  //Título
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				image,								  //Icone
				option,                               //Um vetor de opções para cada botão
				null);								  //Opção de botão default
		
		
		switch (resposta) {
			case 0:  JOptionPane.showMessageDialog(null, "Locais: Dor, Edema e Rubor no local da aplicação."
					+ "\nSistêmicos: Fadiga, Febre, Calafrios, Cefaléia, Náusea, Artralgia, Mialgia, Diarreia."
					+ "\nFonte: TeleSaude Rio Grande do Sul - UFGRS");  // como colocar titulo em cada caixinha do OptionPane? 
			                                                            // Nao consigo incluir a imagem png.
				intro();
				break;
			
			case 1:  JOptionPane.showMessageDialog(null, "BioNTech, Fosun Pharma, Pfizer");
				intro();
				break;
			case 2: Introducao i = new Introducao();
					i.intro();
					break;
			
		
		
		}
	}
}



