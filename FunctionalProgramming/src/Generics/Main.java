package Generics;

public class Main {

	public static void main(String[] args) {
		//create a glass of juice
		//u can creace glasses of water as well
		Glass<Juice> glass=new Glass<>();
		 Juice juice=new Juice();
		 glass.liquid=juice;

	}

}
