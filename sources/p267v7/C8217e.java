package p267v7;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: v7.e */
public final class C8217e {

    /* renamed from: a */
    public static String f18044a;

    /* renamed from: v7.e$a */
    public static class C8218a implements PrivilegedAction<String> {
        public final Object run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            f18044a = (String) AccessController.doPrivileged(new C8218a());
        } catch (Exception unused) {
            try {
                f18044a = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                f18044a = "\n";
            }
        }
    }

    /* renamed from: a */
    public static String m16509a(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* renamed from: b */
    public static String m16510b(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* renamed from: c */
    public static String m16511c(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    /* renamed from: d */
    public static byte[] m16512d(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
