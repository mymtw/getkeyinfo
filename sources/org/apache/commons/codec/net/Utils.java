package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;
import p003a2.C0015b;

class Utils {
    public static int digit16(byte b) throws DecoderException {
        int digit = Character.digit((char) b, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException(C0015b.m88g("Invalid URL encoding: not a valid digit (radix 16): ", b));
    }
}
