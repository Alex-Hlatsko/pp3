class Counter {
    int count = 0;
    
    public void plus1(){
        System.out.println(count +=1);
    }
    public void plus10(){
        System.out.println(count +=10);
        
    }
    public void minus1(){
        System.out.println(count -=1);
        
    }
    public void minus10(){
        System.out.println(count -=10);
        
    }
    
    public void start(){
        System.out.println(count = 0);
        
    }
}