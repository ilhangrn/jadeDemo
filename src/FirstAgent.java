
import jade.core.Agent;

public class FirstAgent extends Agent{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello, my name is 1 ");
		// doDelete();
	}
	
	protected void setup() {
		this.addBehaviour(new FirstBehaviour());
	}

}
