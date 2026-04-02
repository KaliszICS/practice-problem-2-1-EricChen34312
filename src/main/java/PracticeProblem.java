import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(findAll(new double[] { 3.3, 3.5, 3.3, 3.2 }, 3.3));
	}

	public static int find(int[] array, int number){
		//do the thing
		for(int i = 0; i < array.length;i++){
			if (array[i] == number){
				return i;
			}
		}

		return -1;
	}

	public static int findLast(String[] array, String string){
		//do the thing, but backwards
		for(int i = array.length-1; i >= 0; i--){
			if (array[i].equals(string)){
				return i;
			}
		}

		return -1;
	}

	public static int findSecond(char[] array, char character){
		//store index for thing
		int index = -1;

		for(int i = 0; i < array.length; i++){
			if(array[i] == character){

				//if character never found before, set index to i
				if(index == -1){
					index = i;
				} else {

					//else return current i, as this would be the second occurence
					return i;
				}
			}
		}

		//return index, would be -1 if value never found, or the first index if there isn't a second occurence
		return index;
	}

	public static int[] findAll(double[] array, double number){
		//make arraylist because i need dynamic
		ArrayList<Integer> out = new ArrayList<>();
		
		//add indexes for every instance of number
		for(int i = 0; i < array.length; i++){
			if(array[i] == number){
				out.add(i);
			}
		}

		//add the output array (as a double[] for some reason)
		int[] outArr = new int[out.size()];

		//convert
		for(int i = 0; i < out.size(); i++){
			int temp = out.get(i);
			outArr[i] = temp;
		}

		return outArr;
	}
}
