package Singleton;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start...");
//		=============================================
//		Singleton obj1 = Singleton.getInstance();
//		Singleton obj2 = Singleton.getInstance();
//		
//		if ( obj1 == obj2 ) {
//			System.out.println("같은 인스턴스~!");
//		} else {
//			System.out.println("다른 인스턴스~!");
//		}
//		=============================================
//		for ( int i = 0; i < 10; i++ ) {
//			System.out.println(i + " : " + TicketMaker.getInstance().getNextTicketNumber());
//		}
//		=============================================
		for( int i = 0; i < 9; i++ ) {
			Triple triple = Triple.getInstance(i % 3);
			System.out.println(i + " : " + triple);
		}
		
		System.out.println("End...");
	}
}
