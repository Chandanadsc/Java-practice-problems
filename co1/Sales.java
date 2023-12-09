package co1;


public class Sales implements Connection {
	 @Override
	 public void open() {
	     System.out.println("Sales Connection opened\n");
	 }

	 @Override
	 public void close() {
	     System.out.println("Sales Connection closed\n");
	 }

	 @Override
	 public void log() {
	     System.out.println("Logging Sales Connection\n");
	 }

	 public void update() {
	     System.out.println("Updating Sales Connection\n");
	 }
	}
	 