package co1;


public class Accounting implements Connection {
	 @Override
	 public void open() {
	     System.out.println("Accounting Connection opened\n");
	 }

	 @Override
	 public void close() {
	     System.out.println("Accounting Connection closed\n");
	 }

	 @Override
	 public void log() {
	     System.out.println("Logging Accounting Connection\n");
	 }
	}
