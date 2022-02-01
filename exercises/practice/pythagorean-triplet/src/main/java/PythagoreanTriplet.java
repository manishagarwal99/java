import java.util.*;
class PythagoreanTriplet{
    private int a,b,c;
    private static List<PythagoreanTriplet> tripletList;
    private static PythagoreanTriplet pythagoreanTriplet= new PythagoreanTriplet(0,0,0);
    
    PythagoreanTriplet(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public static PythagoreanTriplet makeTripletsList(){
        tripletList = new ArrayList<PythagoreanTriplet>();
        return pythagoreanTriplet;
    }
    
    PythagoreanTriplet withFactorsLessThanOrEqualTo(int n){
        return pythagoreanTriplet;
    }
    
    public static PythagoreanTriplet thatSumTo(int n){
        for(int a=0;a<n/3;a++){
            for(int b=a+1;b<n/2;b++){
                int c = (n-a-b);
                if(((a*a)+(b*b))==(c*c))
                    tripletList.add(new PythagoreanTriplet(a,b,c));
            }
        }       
        return pythagoreanTriplet;
    }
    
    public static List<PythagoreanTriplet> build(){
        return tripletList;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof PythagoreanTriplet))
            return false;
        PythagoreanTriplet t = (PythagoreanTriplet) obj;
        return (t.a == this.a && t.b == this.b && t.c == this.c);
    }
}
