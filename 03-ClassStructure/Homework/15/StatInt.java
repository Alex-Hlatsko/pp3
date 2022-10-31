class StatInt{
    int a;
    int b;
    int countNumb;
    int sumNumb;
    int arithmNumb;
    
    public StatInt(int a, int b){
        this.a = a;
        this.b = b;
        countNumb = calculateNumb();
        sumNumb = calculateSumNumb();
        arithmNumb = sumNumb / countNumb;
    }
    
    public int calculateNumb(){
        for(int i = a+1; i<b; i++){
            countNumb+=1;
        }
        return countNumb;
    }
    
    public int calculateSumNumb(){
        for(int i = a+1; i<b; i++){
            sumNumb+=i;
        }
        return sumNumb;
    }
    
    public void displayInfo(){
        System.out.println(a + " and " + b);
        System.out.println("Number of items " + countNumb);
        System.out.println("Sum of numbers " + sumNumb);
        System.out.println("Arithmetic " + arithmNumb);
    }
    
    public static void main(String[] args){
        StatInt s1 = new StatInt(3,5);
        s1.displayInfo();
    }
}