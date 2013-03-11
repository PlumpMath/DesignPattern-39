package Adapter;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
		
		Print2 p1 = new PrintBanner2("Hello2");
		p1.printWeak();
		p1.printStong();
	}
}
