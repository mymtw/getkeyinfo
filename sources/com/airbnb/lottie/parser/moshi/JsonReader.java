package com.airbnb.lottie.parser.moshi;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.appcompat.widget.C0326j;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import org.apache.commons.lang3.ClassUtils;
import p756lr.C19893f;
import p756lr.C19908t;

public abstract class JsonReader implements Closeable {

    /* renamed from: f */
    public static final String[] f11024f = new String[128];

    /* renamed from: b */
    public int f11025b;

    /* renamed from: c */
    public int[] f11026c = new int[32];

    /* renamed from: d */
    public String[] f11027d = new String[32];

    /* renamed from: e */
    public int[] f11028e = new int[32];

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.JsonReader$a */
    public static final class C4854a {

        /* renamed from: a */
        public final String[] f11029a;

        /* renamed from: b */
        public final C19908t f11030b;

        public C4854a(String[] strArr, C19908t tVar) {
            this.f11029a = strArr;
            this.f11030b = tVar;
        }

        /* renamed from: a */
        public static C4854a m10470a(String... strArr) {
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C19893f fVar = new C19893f();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = JsonReader.f11024f;
                    fVar.mo72771x0(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char charAt = str2.charAt(i3);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            if (str == null) {
                            }
                        } else if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            fVar.mo72714F0(i2, i3, str2);
                        }
                        fVar.mo72715G0(str);
                        i2 = i3 + 1;
                    }
                    if (i2 < length) {
                        fVar.mo72714F0(i2, length, str2);
                    }
                    fVar.mo72771x0(34);
                    fVar.readByte();
                    byteStringArr[i] = fVar.mo72759t();
                }
                C19908t.f43902d.getClass();
                return new C4854a((String[]) strArr.clone(), C19908t.C19909a.m34005b(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f11024f[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f11024f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: a */
    public abstract void mo14625a() throws IOException;

    /* renamed from: b */
    public abstract void mo14626b() throws IOException;

    /* renamed from: d */
    public abstract void mo14627d() throws IOException;

    /* renamed from: e */
    public abstract void mo14628e() throws IOException;

    /* renamed from: f */
    public abstract boolean mo14629f() throws IOException;

    /* renamed from: g */
    public abstract boolean mo14630g() throws IOException;

    public final String getPath() {
        int i = this.f11025b;
        int[] iArr = this.f11026c;
        String[] strArr = this.f11027d;
        int[] iArr2 = this.f11028e;
        StringBuilder k = C0326j.m866k('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                k.append('[');
                k.append(iArr2[i2]);
                k.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                k.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                String str = strArr[i2];
                if (str != null) {
                    k.append(str);
                }
            }
        }
        return k.toString();
    }

    /* renamed from: h */
    public abstract double mo14632h() throws IOException;

    /* renamed from: i */
    public abstract int mo14633i() throws IOException;

    /* renamed from: j */
    public abstract String mo14634j() throws IOException;

    /* renamed from: k */
    public abstract Token mo14635k() throws IOException;

    /* renamed from: n */
    public final void mo14636n(int i) {
        int i2 = this.f11025b;
        int[] iArr = this.f11026c;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f11026c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f11027d;
                this.f11027d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f11028e;
                this.f11028e = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder h = C0072d.m201h("Nesting too deep at ");
                h.append(getPath());
                throw new JsonDataException(h.toString());
            }
        }
        int[] iArr3 = this.f11026c;
        int i3 = this.f11025b;
        this.f11025b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: r */
    public abstract int mo14637r(C4854a aVar) throws IOException;

    /* renamed from: t */
    public abstract void mo14638t() throws IOException;

    /* renamed from: u */
    public abstract void mo14639u() throws IOException;

    /* renamed from: x */
    public final void mo14640x(String str) throws JsonEncodingException {
        StringBuilder k = C0073e.m211k(str, " at path ");
        k.append(getPath());
        throw new JsonEncodingException(k.toString());
    }
}
