package in.ineuron;

public class fourth {

	    public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int count = 0;
	        for (int i = 0; i < flowerbed.length; i++) {
	            
	            if (flowerbed[i] == 0) {
	                
	                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
	                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
	                
	                if (emptyLeftPlot && emptyRightPlot) {
	                    flowerbed[i] = 1;
	                    count++;
	                    if (count >= n) {
	                        return true;
	                    }
	                }
	            }
	        }
	        return count >= n;
	    }
	
	public static void main(String[] args) {
		int flowerbed[]= {1,0,0,0,1};
		int n=1;
		fourth fourth = new fourth();
		boolean status = fourth.canPlaceFlowers(flowerbed, n);
		System.out.println(status);
		

	}

}
