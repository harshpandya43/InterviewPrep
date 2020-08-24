package TopInterviewQustions;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArray m = new MergeSortedArray();
		int nums1[] = {1,2,3,0,0,0};
		int o = 3;
		int nums2[] = {2,5,6};
		int n =3;
		
		m.merge(nums1, o, nums2, n);
		for(int nu : nums1) {
			System.out.print(nu+" ");
		}
	}
	
	public void merge(int[]nums1, int m, int nums2[], int n) {
		if(m+n > nums1.length) {
			throw new IllegalArgumentException();
		}
		
		int num1Index = m-1;
		int num2Index = n-1;
		int mergeIndex = m+n-1;
		
		while(num1Index>=0 && num2Index>=0) {
			if(nums1[num1Index] >= nums2[num2Index]) {
				nums1[mergeIndex] = nums1[num1Index];
				num1Index--;
			}else {
				nums1[mergeIndex] = nums2[num2Index];
				num2Index--;
			}
			mergeIndex--;
		}
		
		while(num2Index >= 0) {
			nums1[mergeIndex] = nums2[num2Index];
			num2Index--;
			mergeIndex--;
		}
	}

}
