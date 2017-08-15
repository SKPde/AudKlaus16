import java.util.*;

public class Methoden {
	
	
	public static double doubleValue(Object o) {
		return ((Double) o).doubleValue();
	}
	
	public static double mittelwert(Collection c) {
		  Iterator<Double> iter = c.iterator();
		  double summe = 0;
		  while(iter.hasNext()) {
			  summe += iter.next().doubleValue();
		  }
		return summe / ((double)c.size());
		
	}
}
