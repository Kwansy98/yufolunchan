package utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
public class Base64Tools {
    private final static Base64.Decoder decoder = Base64.getDecoder();
    private final static Base64.Encoder encoder = Base64.getEncoder();

    public static byte[] encode(byte[] content) throws UnsupportedEncodingException {
        return encoder.encode(content);
    }

    public static byte[] decode(byte[] content) throws UnsupportedEncodingException {
        return decoder.decode(content);
    }
}
