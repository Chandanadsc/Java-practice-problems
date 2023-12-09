package co3;



class Information{
	private int info;
	
	public void setInfo(int info) {
		this.info=info;
	}
	public int getInfo()
	{
		return 
				this.info;
	}
}
class ProducerP1 {
	private Information info;
	public ProducerP1(Information info)
	{
		this.info=info;
	}
	public void generate() {
		for(int i=0;i<50;i++)
		{
			info.setInfo(i);

	}
}
}

class ConsumerC1 {
	private Information info;
	public ConsumerC1(Information info)
	{
		this.info=info;
	}
	public void consume() {
		for(int i=0;i<50;i++)
		{
			info.getInfo();

	}
}
}

public class PAndC_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Information i=new Information();

ProducerP1 p1=new ProducerP1(i);
ConsumerC1 c1= new ConsumerC1(i);
p1.generate();
c1.consume();
	}
}


