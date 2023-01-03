public class Sayilarke {
    public int sayioyunu(int a ,int b){
        int mutlaka= Math.abs(a);
        int mutlakb = Math.abs(b);

        if(mutlaka>mutlakb){
            return b;
        }
        if(mutlakb>mutlaka){
            return a;
        }
        return 0;
        
        
    }
}
