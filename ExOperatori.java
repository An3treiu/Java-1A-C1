public class ExOperatori {
    public static void main (String [] args){
        boolean b1 = true;
        boolean b2 = false;
        
        int x = 4;
        int y = 3;
        
        boolean b3 = b2 && ((x=y)==x);// && este scurcircuitat => b2 e false deci nu evalueaza si expresia din dreapta
        boolean b4 = b2 || ((x=y)==x);// || este scurcircuitat => b2 e f false => e necesar sa evalueze si partea dreapta
        boolean b5 = 10>5 && b2;// 10>5 = true => trb sa se uite si in stanga
    }
}