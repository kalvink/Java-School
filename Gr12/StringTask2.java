
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* StringTask2
 * Kalvin Kao
 * ICS4U
 * September 17th 2012
 * 
 * A java program that will read a text file with a sentence
 *  and stores each word into an array. Then it will print it 
 *  and will have a parallel array with the length of the words
 *  and print that. Lastly it will print the largest word in the
 *  sentence.
 * 
 */
public class StringTask2 {

	public static void main(String[] args) throws IOException {
		String s;
		Scanner in = new Scanner(new FileReader("Gr12/sentence.txt"));
		s = in.nextLine();
		in.close();
		StringTokenizer st = new StringTokenizer(s);
		int count = st.countTokens();
		st.nextToken();
		String words[] = new String[count];
		int[] lengths = new int[count];

		StringTokenizer b = new StringTokenizer(s);
		while (b.hasMoreTokens()) {

			for (int i = 0; i < count; i++) {
				words[i] = b.nextToken();
				lengths[i] = (words[i].length());
			}
			for (int i = 0; i < count; i++) {
				System.out.print(words[i]);
				System.out.println(" - (characters: " + lengths[i] + ")");
			}
		}
		int largest = lengths[0];
		for (int i = 0; i < lengths.length; i++) {
			if (largest < lengths[i]) {
				largest = i;
			}
		}
		System.out
				.println("The largest word in the sentece: " + words[largest]);

	}

}
