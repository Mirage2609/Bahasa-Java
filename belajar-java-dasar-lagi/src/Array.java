public class Array {
    public static void main(String[] args) {

//        Cara pertama
        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "Azka";
        stringArray[1] = "Putra";
        stringArray[2] = "Wirayudha";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

//        Cara kedua secara langsung
        String[] stringArray2 = new String[3];


//        Array Initializer, cara yang dapat langsung mengisikan datanya sehingga lebih cepat
        String[] namaNama = {
                "Azka", "Putra", "Wirayudha"
        };

        namaNama [1] = null;

        System.out.println(namaNama[1]);

        int[] iniInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        iniInt[3] = 50;

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong[0]);
        System.out.println(iniInt[3]);
        System.out.println(arrayLong.length);


        // Cara membuat Array didalam Array

        String [][] members = {
                {"Azka", "Putra"},
                {"Wirayudha", "Putra"},
                {"Putra", "Azka"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][1]);
    }
}
