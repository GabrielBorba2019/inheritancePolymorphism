package entities;

//Subclasse que extende a classe TaxPayer, utilizarei o polimorfismo nos seu construtor/metodo
public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double total = 0.0;
		if (super.getAnualIncome() < 20000.00) {
			total = super.getAnualIncome() * 0.15;

		} else {
			if (healthExpenditures > 0.0) {
				total = (super.getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
			} else {
				total = super.getAnualIncome() * 0.25;
			}

		}
		return total;
	}
}
