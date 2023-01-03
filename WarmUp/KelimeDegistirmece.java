public class KelimeDegistirmece {
    public boolean kelimeoyunu(String kelime) {

        if (kelime.length() < 3) {
            return false;

        }

        String sabitKelimeler = kelime.substring(1, 3);

        if (sabitKelimeler.equals("ix")) {
            return true;

        } else {
            return false;
        }

    }
}
