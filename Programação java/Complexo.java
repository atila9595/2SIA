
public class Complexo {

	double real, imaginaria;
	
	//m�todo construtor 
	public Complexo(double real,double imaginaria){
		this.real = real;
		this.imaginaria = imaginaria;	
	}
	//m�todo construtor sobrecarregado
	
	public Complexo(double imaginaria){
		this(0,imaginaria);//chame o outro construtor
	}
	
	public String retornarDados() {
		String aux = "z = "+real+"+"+imaginaria+"i";
		return aux;
	}
}
