import java.util.ArrayList;

public class Mittelhaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> liste = new ArrayList<Double>();
		
		liste.add(6.0);
		liste.add(4.0);
		liste.add(1.0);
		liste.add(9.0);
		liste.add(7.0);
		liste.add(12.0);
		liste.add(10.0);
		liste.add(14.0);
		liste.add(22.0);
		liste.add(0.0);
		
		System.out.println(Methoden.mittelwert(liste));
	}

}
