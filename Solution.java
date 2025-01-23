import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] emp = new int[m + n]; 
        int p1 = 0;  
        int p2 = 0;  
        int i = 0;   
        while (p1 < m && p2 < n) {
            if (nums1[p1] <= nums2[p2]) {
                emp[i] = nums1[p1];
                p1++;
            } else {
                emp[i] = nums2[p2];
                p2++;
            }
            i++;
        }

        
        while (p1 < m) {
            emp[i] = nums1[p1];
            p1++;
            i++;
        }

        
        while (p2 < n) {
            emp[i] = nums2[p2];
            p2++;
            i++;
        }

        
        for (int j = 0; j < m + n; j++) {
            nums1[j] = emp[j];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        
        solution.merge(nums1, m, nums2, n);

        
        System.out.println(Arrays.toString(nums1));  // Output should be: [1, 2, 2, 3, 5, 6]
    }
}
