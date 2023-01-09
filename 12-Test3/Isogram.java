public class Isogram {
    static boolean isogram(String str){
        int b = 0;
        char[] a = str.toCharArray();
        for (int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(i==j){
                    continue;
                } else {
                    if(a[i] == a[j]){
                        b+=1;
                    }
                }
            }
        }

        return b==0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isogram("my blue water"));
    }
}
