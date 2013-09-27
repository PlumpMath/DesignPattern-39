package Observer;

public class DigitObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver: " + generator.getNumger());
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
