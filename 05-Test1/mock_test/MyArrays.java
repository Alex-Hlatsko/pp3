public class MyArrays {
    static int even(int[] array){
        int evenNum = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                evenNum+=1;
            } 
        }
        return evenNum;
    }

    static int positiveOdd(int[] array){
        int posOddNum = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]>0 & array[i] % 2 != 0){
                posOddNum+=1;
            }
        }
        return posOddNum;
    }

    public static void main(String[] args){
        MyArrays.even(new int[]{2,-6,5,8}); // => 3 
        MyArrays.positiveOdd(new int[]{3,2,-5,4,1,-7}); // => 2
    }
}
