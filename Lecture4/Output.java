import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Output {

	public static void main(String[] args) throws IOException {

		String me = "axs1398";

		File x = new File("/Users/merlin11/workspace/Lecture4/src/axs1398/myfile.txt");

		FileReader in = new FileReader(x);

		FileWriter out = new FileWriter(x);
		out.write(me);
		out.write("x");
		
        in.close();
		out.close();

	}

}
