package calculatorPcg;
/*
 Task:
Test as thoroughly as you can the methods in class Calculator */
public class Calculator {
	private double value=0;
	
	public Calculator add(double value){
		this.value+=value;
		return this;
	}
	public Calculator div(double value) {
		if(value!=0) {
			this.value/=value;
		}
		return this;
	}
	public double getValue() {return value;}
	
	public Calculator setValue(double value) {
		this.value=value;
		return this;
	}
}
