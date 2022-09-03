public class FindEvenIndex {

  public static void main(String[] args) {
    System.out.println(findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
  }
  public static int findEvenIndex(int[] arr) {
    // your code
    int sum = 0, cSum = 0;
    for (int i = 0; i < arr.length; i++) sum += arr[i];
    for(int i = 0; i < arr.length; i++){
      if (cSum == sum - arr[i]) return i;
      cSum += arr[i];
      sum -= arr[i];
    }
    return -1;
  }
}