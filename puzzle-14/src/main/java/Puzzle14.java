import sun.misc.Unsafe;

public class Puzzle14 {
    public static boolean isBigEndian() {

        boolean isBigEnd = false;

        Unsafe unsafe = UnsafeWrapper.getUnsafe();
        long address = unsafe.allocateMemory(2);
        short number = 1;

        unsafe.putShort(address, number);

        if (unsafe.getByte(address) == 0) {
            isBigEnd = true;
        } else {
            isBigEnd = false;
        }

        unsafe.freeMemory(address);

        return isBigEnd;

    }
}
