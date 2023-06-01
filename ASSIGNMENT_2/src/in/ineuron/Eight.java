package in.ineuron;
public class Eight {
    public int smallestRangeI(int[] arr, int k) {
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++) {
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        min =(max-k)-(min+k);
        return min<0?0:min;
    }
		public static void main(String[] args)
		{
			int arr[] = {1};
			int k = 0;
			Eight eight = new Eight();
			int smallestRangeI = eight.smallestRangeI(arr, k);
			System.out.println(smallestRangeI);
		}
	}


