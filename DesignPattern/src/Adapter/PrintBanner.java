package Adapter;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
	}
	
	@Override
	public void printWeak() {
		showWithPatter();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
	
}
