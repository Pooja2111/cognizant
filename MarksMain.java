package Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MarksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(new Marks(1, 23, 34,34, "HYD"));
		a1.add(new Marks(2, 45, 89, 78, "NZB"));
		a1.add(new Marks(3, 67,78, 78, "CHENNAI"));
		System.out.println("Sorting by name");
		Collections.sort(a1, new RegName());
		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			Marks st = (Marks) itr.next();
			System.out.println(st.num + "" + st.name);
		}
		System.out.println("Sorting by id");
		Collections.sort(a1, new RegNum());
		Iterator itr2 = a1.iterator();
		while (itr2.hasNext()) {
			Marks st = (Marks) itr2.next();
			System.out.println(st.num + " " + st.name);
}
	}

}
