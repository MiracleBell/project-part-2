package tasks.block7;

import java.io.*;

public class BinReader {


    public static byte[] readArrayFromBinStream(byte[] array) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream(array.length)) {
            baos.write(array);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            byte[] supportArray = bais.readAllBytes();
            bais.close();
            return supportArray;
        }
    }


    public static void readArrayFromSymbolStream(int[] array) {
//        BufferedOutputStream bos=new BufferedOutputStream(new DataOutputStream());

    }

    public static void readArrayFromPosition(int[] array, int position) {

    }
}
