package designPatterns;

public class StringObserver extends Observer {
   public StringObserver(Subject subject) {
	   this.subject=subject;
	   this.subject.attach(this);
   }
   public void update() {
	   System.out.println("String value: "+Integer.toString(subject.getState()));
   }
}
