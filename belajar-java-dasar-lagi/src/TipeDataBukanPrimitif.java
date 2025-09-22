public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Boolean iniBoolean = true;

        Short iniShort; //null
        iniShort = 100;

        Byte iniByte = null;
        iniByte = 100;

        System.out.println(iniByte);

        Integer iniobject = iniInteger;

        short iniShort1 = iniobject.shortValue();
        long iniLong2 = iniobject.longValue();
        float iniFloat2 = iniobject.floatValue();
    }
}
