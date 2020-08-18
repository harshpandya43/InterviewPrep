package HomesiteInsuarance;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		
		MergeSortedArrays m = new MergeSortedArrays();
		m.merge(nums1, 3, nums2, 3);
		for(int n : nums1) {
			System.out.print(n+ " ");
		}
	}
	
	public void merge(int[] nums1, int n, int nums2[], int m) {
		if(m+n > nums1.length) {
			throw new IllegalArgumentException();
		}
		
		int i = n-1;
		int j = m-1;
		int mergeIndex = m + n - 1;
		
		while(i>=0 && j>=0) {
			if(nums1[i] >= nums2[j]) {
				nums1[mergeIndex] = nums1[i];
				i--;
			}else {
				nums1[mergeIndex] = nums2[j];
				j--;
			}
			mergeIndex--;
		}
		
		while(j >= 0) {
			nums1[mergeIndex] = nums2[j];
			j--;
			mergeIndex--;
		}
	}

}
