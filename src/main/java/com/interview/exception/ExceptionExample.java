package com.interview.exception;
import java.io.IOException;
public class ExceptionExample {
    // This method declares that it can throw an IOException
    public void readFile(String filePath) throws IOException {
        if (filePath == null) {
            // This line throws a NullPointerException explicitly
            throw new NullPointerException("File path cannot be null");
        }
        // Code to read the file
        // If an IOException occurs, it will be thrown to the caller
    }

    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        try {
            example.readFile(null);
        } catch (IOException e) {
            // Handle the IOException
            System.out.println("IOException occurred: " + e.getMessage());
        } catch (NullPointerException e) {
            // Handle the NullPointerException
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }

}
