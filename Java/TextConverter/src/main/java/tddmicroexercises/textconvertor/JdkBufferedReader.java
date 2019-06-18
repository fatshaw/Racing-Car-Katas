package tddmicroexercises.textconvertor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JdkBufferedReader implements IReader {

    BufferedReader reader;

    public JdkBufferedReader(String fullFilenameWithPath) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fullFilenameWithPath));
    }

    public String readLine() throws IOException {
        return reader.readLine();
    }
}
