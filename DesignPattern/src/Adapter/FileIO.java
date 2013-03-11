package Adapter;

import java.io.IOException;

public interface FileIO {
	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException;
}
