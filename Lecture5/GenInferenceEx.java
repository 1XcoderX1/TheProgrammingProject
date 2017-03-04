
import java.util.ArrayList;
import java.util.HashMap;

public class GenInferenceEx {
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();

		a.add("abcd");
		a.add("CDSC"); 
		

		System.out.println(a.get(0));

		HashMap<String, String> map = new HashMap<>();
		
		map.put("axs", "pass1");
		map.put("dfg", "pass3");
		map.put("dsa", "pass2");

		System.out.println(map.get("xxx"));
	}

}
