package co1;


public class Management implements Connection {
	 @Override
	 public void open() {
	     System.out.println("Management Connection opened\n");
	 }

	 @Override
	 public void close() {
	     System.out.println("Management Connection closed\n");
	 }

	 @Override
	 public void log() {
	     System.out.println("Logging Management Connection\n");
	 }
	}