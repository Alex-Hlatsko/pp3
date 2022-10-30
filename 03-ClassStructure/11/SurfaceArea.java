class SurfaceArea{
    //Attributes
    double pi = 3.14;
    
    //Methods
    public void calCir(int r){
        double s = pi*(r*r);
        System.out.println("Surface area for circle with radius " + r + ":" + s);
    }
    public void calRec(int a, int bRec){
        double s = a * bRec;
        System.out.println("Surface area for rectangle with sides " + a + " " + bRec + ": " + s);
    }
    public void calTri(int bTri, int h){
        double s = bTri * h;
        System.out.println("Surface area for triangle with base " + bTri + " and height " + h + ": " + s);
    }
    
    
    public static void main(String[] args){
        //Circle
        SurfaceArea c = new SurfaceArea();
        c.calCir(5);
        
        //Rictangle
        SurfaceArea r = new SurfaceArea();
        r.calRec(5,7);
        
        //Rictangle
        SurfaceArea t = new SurfaceArea();
        t.calTri(4,12);
    }
}