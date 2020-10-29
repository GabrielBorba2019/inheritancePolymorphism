package entities;


//Classe abstrata de Pessoas, para garantir a herança total de metodos e atributos
//Utilizando do polimorfismo
public  abstract class TaxPayer {
	
	private String name;
	private Double anualIncome;
	
	public TaxPayer() {
	
	}
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getAnualIncome() {
		return anualIncome;
	}
	
	public abstract Double tax();
	
}
