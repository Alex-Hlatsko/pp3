public class Arrays{
    static boolean arr(int[] arr1, int[] arr2){
        int countArr1 = 0;
        int countArr2 = 0;
        for(int i : arr1){
            if(i >=10 && i<=99){
                countArr1 +=1;
            }
        }
        for(int j : arr2){
            if(j >=10 && j<=99){
                countArr2 +=1;
            }
        }
        if(countArr1 == countArr2){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(arr(new int[] {15,8,2,37,49,117}, new int[] {9,6,7,12,48,4,6,90,5}));
    }
}