public class DogrumuDogru {
    public boolean main(int a, int b, Boolean truefalse) {
        if(truefalse){
            return (a < 0 && b<0);
            
        }else{
            return ((a<0 && b>0) || (a>0 && b<0));
        }

    }
}
