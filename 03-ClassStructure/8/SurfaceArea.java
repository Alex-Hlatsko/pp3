class SurfaceArea{
    //Attributes
    double pi = 3.14;
    int r;
    int a;
    int bRec;
    int bTri;
    int h;
    
    //Methods
    public void calCir(){
        double s = pi*(r*r);
        System.out.println("Surface area for circle: " + s);
    }
    public void calRec(){
        double s = a * bRec;
        System.out.println("Surface area for rectangle: " + s);
    }
    public void calTri(){
        double s = bTri * h;
        System.out.println("Surface area for triangle: " + s);
    }
    
    
    public static void main(String[] args){
        //Circle
        SurfaceArea c = new SurfaceArea();
        c.r = 5;
        c.calCir();
        
        //Rictangle
        SurfaceArea r = new SurfaceArea();
        r.a = 5;
        r.bRec = 7;
        r.calRec();
        
        //Rictangle
        SurfaceArea t = new SurfaceArea();
        t.h = 4;
        t.bTri = 12;
        t.calTri();
    }
}