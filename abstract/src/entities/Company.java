package entities;

//Subclasse que extende a classe TaxPayer, utilizarei o polimorfismo nos seu construtor/metodo
public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	public void setNumberOfEmployees(Integer numberOfEmployee) {
		this.numberOfEmployees = numberOfEmployee;
	}
	
	@Override
	public Double tax() {
		Double total;
		if(numberOfEmployees > 10) {
			total = super.getAnualIncome() * 0.14;
		}
		else {
			total = super.getAnualIncome() * 0.16;
		}
		
		return total;
	}
}
