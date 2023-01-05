public class KelimeSacmalamasi {
    public String kelime(String kelime, int n) {
        String baslangic = "";
        for (int i = 0; i < kelime.length(); i = i + n) {
            baslangic = baslangic + kelime.charAt(i);

        }
        return baslangic;

    }
}
