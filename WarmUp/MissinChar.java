public class MissinChar {
    public String missingChar(String kelime, int n) {
        String parca1= kelime.substring(0, n);
        String parca2 =kelime.substring(n+1,kelime.length());
        return parca1+parca2;


    }
}
