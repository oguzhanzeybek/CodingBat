public class BackAraund {
    public String kelimeOyunu(String yazi){
        String sonKelime = yazi.substring(yazi.length()-1);
        return sonKelime + yazi + sonKelime;


    }
}
