public class Numbers implements Ok{
    private int[] numbers;

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean ok() {
        int a = 0;
        int b = 0;
        for(int i=1; i<numbers.length; i++){
            if(i % 2 == 0 && numbers[i] % 2 == 0){
                a+=1;
            } else if (i % 2 != 0 && numbers[i] % 2 != 0){
                b+=1;
            } else {
                return false;
            }
        }
        return a==b ? true : false;
    }

}
