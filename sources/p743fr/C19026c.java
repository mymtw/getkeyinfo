package p743fr;

import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okio.ByteString;
import p003a2.C0023f;
import p735br.C18980c;

/* renamed from: fr.c */
public final class C19026c {

    /* renamed from: a */
    public static final ByteString f42417a = ByteString.C20020a.m34295c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f42418b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f42419c = new String[64];

    /* renamed from: d */
    public static final String[] f42420d;

    /* renamed from: e */
    public static final C19026c f42421e = new C19026c();

    static {
        ByteString.Companion.getClass();
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C19383o.m32796f(binaryString, "Integer.toBinaryString(it)");
            String replace = C18980c.m32104h("%8s", binaryString).replace(' ', '0');
            C19383o.m32796f(replace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i] = replace;
        }
        f42420d = strArr;
        String[] strArr2 = f42419c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f42419c;
            strArr3[i3 | 8] = C19383o.m32802l("|PADDED", strArr3[i3]);
        }
        String[] strArr4 = f42419c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f42419c;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i7]);
                sb.append("|");
                strArr5[i8 | 8] = C0023f.m110k(sb, strArr5[i5], "|PADDED");
            }
        }
        int length = f42419c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = f42419c;
            if (strArr6[i9] == null) {
                strArr6[i9] = f42420d[i9];
            }
        }
    }

    /* renamed from: a */
    public static String m32198a(int i, int i2, int i3, int i4, boolean z) {
        String str;
        String str2;
        String[] strArr = f42418b;
        String h = i3 < strArr.length ? strArr[i3] : C18980c.m32104h("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            str = "";
        } else {
            if (!(i3 == 2 || i3 == 3)) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : f42420d[i4];
                } else if (!(i3 == 7 || i3 == 8)) {
                    String[] strArr2 = f42419c;
                    if (i4 < strArr2.length) {
                        str2 = strArr2[i4];
                        C19383o.m32794d(str2);
                    } else {
                        str2 = f42420d[i4];
                    }
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : C19457k.m33023a1(str2, "PRIORITY", "COMPRESSED", false) : C19457k.m33023a1(str2, "HEADERS", "PUSH_PROMISE", false);
                }
            }
            str = f42420d[i4];
        }
        return C18980c.m32104h("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), h, str);
    }
}
