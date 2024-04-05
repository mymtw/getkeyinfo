package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.conversation.MessageDraft;
import java.io.IOException;
import p756lr.C19896h;
import p756lr.C19906r;
import p756lr.C19912w;

/* renamed from: com.squareup.moshi.s */
public final class C17407s extends C17412w {

    /* renamed from: n */
    public static final String[] f37986n = new String[128];

    /* renamed from: k */
    public final C19896h f37987k;

    /* renamed from: l */
    public String f37988l = MessageDraft.IMAGE_DELIMITER;

    /* renamed from: m */
    public String f37989m;

    static {
        for (int i = 0; i <= 31; i++) {
            f37986n[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f37986n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C17407s(C19896h hVar) {
        if (hVar != null) {
            this.f37987k = hVar;
            mo68555k(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: S */
    public static void m29181S(C19896h hVar, String str) throws IOException {
        String str2;
        String[] strArr = f37986n;
        hVar.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                hVar.mo72748o0(i, i2, str);
            }
            hVar.mo72716H(str2);
            i = i2 + 1;
        }
        if (i < length) {
            hVar.mo72748o0(i, length, str);
        }
        hVar.writeByte(34);
    }

    /* renamed from: B */
    public final C17412w mo68516B(boolean z) throws IOException {
        if (!this.f38017i) {
            mo68527f0();
            mo68517G();
            this.f37987k.mo72716H(z ? "true" : "false");
            int[] iArr = this.f38013e;
            int i = this.f38010b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder h = C0072d.m201h("Boolean cannot be used as a map key in JSON at path ");
        h.append(getPath());
        throw new IllegalStateException(h.toString());
    }

    /* renamed from: G */
    public final void mo68517G() throws IOException {
        int j = mo68554j();
        int i = 7;
        if (j != 1) {
            if (j != 2) {
                if (j == 4) {
                    i = 5;
                    this.f37987k.mo72716H(this.f37988l);
                } else if (j == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else if (j != 6) {
                    if (j != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.f38015g) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                this.f38011c[this.f38010b - 1] = i;
            }
            this.f37987k.writeByte(44);
        }
        mo68519Q();
        i = 2;
        this.f38011c[this.f38010b - 1] = i;
    }

    /* renamed from: M */
    public final void mo68518M(int i, int i2, char c) throws IOException {
        int j = mo68554j();
        if (j != i2 && j != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f37989m == null) {
            int i3 = this.f38010b;
            int i4 = ~this.f38018j;
            if (i3 == i4) {
                this.f38018j = i4;
                return;
            }
            int i5 = i3 - 1;
            this.f38010b = i5;
            this.f38012d[i5] = null;
            int[] iArr = this.f38013e;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            if (j == i2) {
                mo68519Q();
            }
            this.f37987k.writeByte(c);
        } else {
            StringBuilder h = C0072d.m201h("Dangling name: ");
            h.append(this.f37989m);
            throw new IllegalStateException(h.toString());
        }
    }

    /* renamed from: Q */
    public final void mo68519Q() throws IOException {
        if (this.f38014f != null) {
            this.f37987k.writeByte(10);
            int i = this.f38010b;
            for (int i2 = 1; i2 < i; i2++) {
                this.f37987k.mo72716H(this.f38014f);
            }
        }
    }

    /* renamed from: R */
    public final void mo68520R(int i, int i2, char c) throws IOException {
        int i3;
        int i4 = this.f38010b;
        int i5 = this.f38018j;
        if (i4 == i5 && ((i3 = this.f38011c[i4 - 1]) == i || i3 == i2)) {
            this.f38018j = ~i5;
            return;
        }
        mo68517G();
        mo68551d();
        mo68555k(i);
        this.f38013e[this.f38010b - 1] = 0;
        this.f37987k.writeByte(c);
    }

    /* renamed from: a */
    public final C17412w mo68521a() throws IOException {
        if (!this.f38017i) {
            mo68527f0();
            mo68520R(1, 2, '[');
            return this;
        }
        StringBuilder h = C0072d.m201h("Array cannot be used as a map key in JSON at path ");
        h.append(getPath());
        throw new IllegalStateException(h.toString());
    }

    /* renamed from: b */
    public final C17412w mo68522b() throws IOException {
        if (!this.f38017i) {
            mo68527f0();
            mo68520R(3, 5, '{');
            return this;
        }
        StringBuilder h = C0072d.m201h("Object cannot be used as a map key in JSON at path ");
        h.append(getPath());
        throw new IllegalStateException(h.toString());
    }

    /* renamed from: c0 */
    public final C19912w mo68523c0() throws IOException {
        if (!this.f38017i) {
            mo68527f0();
            mo68517G();
            mo68555k(9);
            return C19906r.m33997a(new C17406r(this));
        }
        StringBuilder h = C0072d.m201h("BufferedSink cannot be used as a map key in JSON at path ");
        h.append(getPath());
        throw new IllegalStateException(h.toString());
    }

    public final void close() throws IOException {
        this.f37987k.close();
        int i = this.f38010b;
        if (i > 1 || (i == 1 && this.f38011c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f38010b = 0;
    }

    /* renamed from: e */
    public final C17412w mo68525e() throws IOException {
        mo68518M(1, 2, ']');
        return this;
    }

    /* renamed from: f */
    public final C17412w mo68526f() throws IOException {
        this.f38017i = false;
        mo68518M(3, 5, '}');
        return this;
    }

    /* renamed from: f0 */
    public final void mo68527f0() throws IOException {
        if (this.f37989m != null) {
            int j = mo68554j();
            if (j == 5) {
                this.f37987k.writeByte(44);
            } else if (j != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            mo68519Q();
            this.f38011c[this.f38010b - 1] = 4;
            m29181S(this.f37987k, this.f37989m);
            this.f37989m = null;
        }
    }

    public final void flush() throws IOException {
        if (this.f38010b != 0) {
            this.f37987k.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h */
    public final C17412w mo68529h(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f38010b != 0) {
            int j = mo68554j();
            if ((j == 3 || j == 5) && this.f37989m == null && !this.f38017i) {
                this.f37989m = str;
                this.f38012d[this.f38010b - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: i */
    public final C17412w mo68530i() throws IOException {
        if (!this.f38017i) {
            if (this.f37989m != null) {
                if (this.f38016h) {
                    mo68527f0();
                } else {
                    this.f37989m = null;
                    return this;
                }
            }
            mo68517G();
            this.f37987k.mo72716H("null");
            int[] iArr = this.f38013e;
            int i = this.f38010b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder h = C0072d.m201h("null cannot be used as a map key in JSON at path ");
        h.append(getPath());
        throw new IllegalStateException(h.toString());
    }

    /* renamed from: n */
    public final void mo68531n(String str) {
        super.mo68531n(str);
        this.f37988l = !str.isEmpty() ? ": " : MessageDraft.IMAGE_DELIMITER;
    }

    /* renamed from: r */
    public final C17412w mo68532r(double d) throws IOException {
        if (!this.f38015g && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f38017i) {
            this.f38017i = false;
            mo68529h(Double.toString(d));
            return this;
        } else {
            mo68527f0();
            mo68517G();
            this.f37987k.mo72716H(Double.toString(d));
            int[] iArr = this.f38013e;
            int i = this.f38010b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: t */
    public final C17412w mo68533t(long j) throws IOException {
        if (this.f38017i) {
            this.f38017i = false;
            mo68529h(Long.toString(j));
            return this;
        }
        mo68527f0();
        mo68517G();
        this.f37987k.mo72716H(Long.toString(j));
        int[] iArr = this.f38013e;
        int i = this.f38010b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: u */
    public final C17412w mo68534u(Number number) throws IOException {
        if (number == null) {
            mo68530i();
            return this;
        }
        String obj = number.toString();
        if (!this.f38015g && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f38017i) {
            this.f38017i = false;
            mo68529h(obj);
            return this;
        } else {
            mo68527f0();
            mo68517G();
            this.f37987k.mo72716H(obj);
            int[] iArr = this.f38013e;
            int i = this.f38010b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: x */
    public final C17412w mo68535x(String str) throws IOException {
        if (str == null) {
            mo68530i();
            return this;
        } else if (this.f38017i) {
            this.f38017i = false;
            mo68529h(str);
            return this;
        } else {
            mo68527f0();
            mo68517G();
            m29181S(this.f37987k, str);
            int[] iArr = this.f38013e;
            int i = this.f38010b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }
}
