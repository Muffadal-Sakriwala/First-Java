public class Array {
        public static void main(String[] args) {
            
            // int nums[][] = {{5,7,5,7,8}, {8,1,7,4}, {4,3}} ; 

            int nums1[][] = new int[3][]; 
            nums1[0] = new int[4]; 
            nums1[1] = new int[3];
            nums1[2] = new int[2]; 
            nums1[0][3] = 5; 

            for (int i=0; i<nums1.length; i++) {
                for (int j=0; j<nums1[i].length; j++) {
                    System.out.print(nums1[i][j] + " ");
                }
            System.out.println(); 
            }
        }
}
