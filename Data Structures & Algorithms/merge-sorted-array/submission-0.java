class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int p1 = 0, p2 = 0, index = 0;
        while(p1 < m && p2 < n) {
            if(nums1[p1] <= nums2[p2]) {
                res[index++] = nums1[p1++];
                
            } else if(nums1[p1] > nums2[p2]){
                res[index++] = nums2[p2++];
                
            }
        }

        while(p1 < m) {
            res[index++] = nums1[p1++];
            
        }
        while(p2 < n) {
            res[index++] = nums2[p2++];
        }

        for(int i = 0; i < res.length; i++) nums1[i] = res[i];

    }
}