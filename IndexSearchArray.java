//I have no idea why or how to get this into the Main without the program crashing
public class IndexSearchArray {

	// Linear-search function to find the index of an element
		public static int findIndex(int[] array, int favoriteNumber) {

			// Starting new array because I can't figure out how to access the first array I
			// made
			if (array == null) {
				return -1;
			}

			// get the length of array
			int len = array.length;
			int k = 0; //this is for reference to find the favorite number

			// this loop starts to read through the array
			while (k < len) {

				// if the k element is my favorite number
				// then return the index location
				if (array[k] == favoriteNumber) {
					return k;
				} else {
					k = k + 1;
				}
			}
			return -1;
		}

		// new array and print the results
		public static void main(String[] args) {

			int[] array = { 10, 20, 30, 40, 50 };

			System.out.println("Index position of 2 is: " + findIndex(array, 20));

			// find the index of 7
			System.out.println("Index position of 1 is: " + findIndex(array, 40));

		}
	
}
