package HomesiteInsuarance;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
		int[] nums = {1,2,3,4};
		int[] res = p.productOfArrays(nums);
		for(int r : res) {
			System.out.print(r+" ");
		}
	}
	
	public int[] productOfArrays(int[] nums) {
		int res[] = new int[nums.length];
		
		int[] t1 = new int[nums.length];
		int[] t2 = new int[nums.length];
		
		t1[0] = 1;
		t2[nums.length-1] = 1;
		
		for(int i=0;i<nums.length-1;i++) {
			t1[i+1] = t1[i] * nums[i];
		}
		
		for(int i=nums.length-1 ;i>0;i--) {
			t2[i-1] = t2[i]*nums[i];
		}
		
		for(int i=0;i<nums.length;i++) {
			res[i] = t1[i]*t2[i];
		}
		
		return res;
	}

}
