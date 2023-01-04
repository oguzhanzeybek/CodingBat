public class Sayilar {
    public boolean stringE(String str) {
        int sayi = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                sayi++;

        }

        return (sayi <= 3 && sayi >= 1);
    }
}
