import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Principal {

	public static void main(String[] args) {
		int opcao;
		double real,imaginaria;
		Complexo c1 = null,c2 = null;
		
		do {
			opcao = parseInt(showInputDialog(Menu()));
			if (opcao < 1 || opcao > 6) {
				showMessageDialog(null, "Opção invalida", "ERRO", ERROR_MESSAGE);
			}else {
				switch (opcao) {
				case 1:
					real = parseDouble(showInputDialog("parte real"));
					imaginaria = parseDouble(showInputDialog("parte imaginaria"));
					c1 = new Complexo(real,imaginaria);
					break;
				case 5:
					showMessageDialog(null,c1.retornarDados());

				default:
					break;
				}
			}
			
		}while(opcao != 6);
		
		
	}
	public static String Menu() {
		String aux = "Escolha uma opção\n";
		aux += "1. Gerar 1o número conplexo\n";
		aux += "2. Gerar 1o número conplexo\n";
		aux += "3. Somar\n";
		aux += "4. Subtrair\n";
		aux += "5. Imprimir\n";
		aux += "6. Finalizar\n";
		return aux;
	}

}
