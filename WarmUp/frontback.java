public class frontback {
    public String kelimeMakinasi(String kelime) {
        String back = kelime.substring(0, 1);
        String end = kelime.substring(kelime.length() - 1, kelime.length());
        String mit= kelime.substring(1, kelime.length()-1);

        return end + mit + back;

    }
}
