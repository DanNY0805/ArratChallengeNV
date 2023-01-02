class ArrayChallenge {

public static int ArrayChallenge(int[] arr) {
	
  // Iterate through the array
  for (int i = 0; i < arr.length; i++) {
    // If we find a 1, check the spaces to the left and right for a 2
    if (arr[i] == 1) {
      // Check the spaces to the left
      for (int j = i - 1; j >= 0; j--) {
        if (arr[j] == 2) {
          // Return the number of spaces to the left
          return i - j;
        }
      }
      // Check the spaces to the right
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] == 2) {
          // Return the number of spaces to the right
          return j - i;
        }
      }
      // If we didn't find a 2, return 0
      return 0;
    }
  }
  // If we didn't find a 1, return 0
  return 0;
}

public static void main(String []args){
	 int result = ArrayChallenge(new int[] {0,3,3,5,6,7,7,1,8,9,0});
    System.out.println(result);
}
}