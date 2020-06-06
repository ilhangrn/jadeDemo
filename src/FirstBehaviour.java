
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.SimpleBehaviour;
import jade.util.leap.Collection;
public class FirstBehaviour extends SimpleBehaviour{
	private int i = 0;
	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("The " + i + "time loop is " + i);
		i++;
	}

	@Override
	public boolean done() {
		// TODO Auto-generated method stub
		if(i > 100)
			return true; // will be stoped 
		return false; // will keep going
	}
	
}
