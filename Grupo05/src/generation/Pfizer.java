package generation;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Pfizer{
	
	
	String pfizer = "\nO imunizante da farmac�utica Pfizer em parceria com o laborat�rio BioNTech "
			+ "\nse baseia na tecnologia de RNA mensageiro, ou mRNA. "
			+ "\nO RNA mensageiro sint�tico d� as instru��es ao organismo para a"
			+ "\nprodu��o de prote�nas encontradas na superf�cie do novo coronav�rus, "
			+ "\nque estimulam a resposta do sistema imune."
			+ "\nFonte: Butantan Oficial "; 
	
	
	Object option[] = {"Efeitos Adversos", "Fabricante", "Voltar"};
			
	ImageIcon image = new ImageIcon("src/Imagens/vaccine.png");
	
	public void intro() {
		
		int resposta = JOptionPane.showOptionDialog(null, 
				pfizer,                               //Mensagem
				"Pfizer - Biontech",                  //T�tulo
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				image,								  //Icone
				option,                               //Um vetor de op��es para cada bot�o
				null);								  //Op��o de bot�o default
		
		
		switch (resposta) {
			case 0:  JOptionPane.showMessageDialog(null, "Locais: Dor, Edema e Rubor no local da aplica��o."
					+ "\nSist�micos: Fadiga, Febre, Calafrios, Cefal�ia, N�usea, Artralgia, Mialgia, Diarreia."
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



