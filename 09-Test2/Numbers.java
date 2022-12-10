public class Numbers{
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;

    private int[] numbers;

    Numbers(int num1, int num2, int num3, int num4, int num5){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public boolean different(){
        numbers = new int[] {num1,num2,num3,num4,num5};
        boolean a = false;
        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers.length; j++){
                if(i==j){
                    continue;
                } else if (numbers[i] == numbers[j]){
                    a = false;
                    break;
                } else {
                    a = true;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // Numbers n1 = new Numbers(3,4, 2, 1, 6);  //-> true
        Numbers n1 = new Numbers(9,7, 4, 3, 7);  //-> false
        System.out.println(n1.different());
    }
}