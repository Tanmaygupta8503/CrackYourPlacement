package GFG;
public class RabinKarp {
	// noOfCharacter is the number of characters in the input alphabet
	public final static int noOfCharacter = 256;
	/* pat -> pattern
		txt -> text
		q -> A prime number
	*/
	static void search(String pat, String txt, int q) {
		int M = pat.length();
		int N = txt.length();
		int i, j;
		int patternHash = 0; // hash value for pattern
		int textHash = 0; // hash value for txt
		int h = 1; // The value of h would be "pow(d, M-1)%q"

		for (i = 0; i < M - 1; i++)
			h = (h * noOfCharacter) % q;
            
		// Calculate the hash value of pattern and first window of text
		for (i = 0; i < M; i++) {
			patternHash = (noOfCharacter * patternHash + pat.charAt(i)) % q;
			textHash = (noOfCharacter * textHash + txt.charAt(i)) % q;
		}

		// Slide the pattern over text one by one
		for (i = 0; i <= N - M; i++) {

			// Check the hash values of current window of
			// text and pattern. If the hash values match
			// then only check for characters one by one
			if (patternHash == textHash) {
				/* Check for characters one by one */
				for (j = 0; j < M; j++) {
					if (txt.charAt(i + j) != pat.charAt(j))
						break;
				}

				// if patternHash == textHash and pat[0...M-1] = txt[i, i+1,...i+M-1]
				if (j == M)
					System.out.println("Pattern found at index " + i);
			}

			// Calculate hash value for next window of text:
			// Remove leading digit, add trailing digit
			if (i < N - M) {
				textHash = (noOfCharacter * (textHash - txt.charAt(i) * h)+ txt.charAt(i + M))% q;

				// We might get negative value of t,
				// converting it to positive
				if (textHash < 0) textHash = (textHash + q);
			}
		}
	}

	/* Driver Code */
	public static void main(String[] args)
	{
		String txt = "GEEKS FOR GEEKS";
		String pat = "GEEK";

		// A prime number
		int q = 101;

		// Function Call
		search(pat, txt, q);
	}
}

// This code is contributed by nuclode
