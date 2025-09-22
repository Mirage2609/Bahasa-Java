public class KonversiNumber {
    public static void main(String[] args) {

//        Konversi yang dapat dilakukan secara otomatis

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

//        Konversi yang harus manual tidak bisa otomatis

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // Ini akan terjadi number overflow, ketika di konversi, angka akan kembali ke awal

    }
}
