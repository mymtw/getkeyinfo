package com.bugsnag.android;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.conversation.MessageDraft;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.bugsnag.android.h1 */
public class C5754h1 implements Closeable, Flushable {

    /* renamed from: h */
    public static final String[] f12277h = new String[128];

    /* renamed from: b */
    public final Writer f12278b;

    /* renamed from: c */
    public int[] f12279c;

    /* renamed from: d */
    public int f12280d = 0;

    /* renamed from: e */
    public String f12281e;

    /* renamed from: f */
    public String f12282f;

    /* renamed from: g */
    public boolean f12283g;

    static {
        for (int i = 0; i <= 31; i++) {
            f12277h[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f12277h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C5754h1(Writer writer) {
        int[] iArr = new int[32];
        this.f12279c = iArr;
        if (iArr.length == 0) {
            int[] iArr2 = new int[(0 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, 0);
            this.f12279c = iArr2;
        }
        int[] iArr3 = this.f12279c;
        int i = this.f12280d;
        this.f12280d = i + 1;
        iArr3[i] = 6;
        this.f12281e = MessageDraft.IMAGE_DELIMITER;
        this.f12283g = true;
        if (writer != null) {
            this.f12278b = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    public final void mo16519a() throws IOException {
        int i = mo16528i();
        if (i == 1) {
            this.f12279c[this.f12280d - 1] = 2;
        } else if (i == 2) {
            this.f12278b.append(',');
        } else if (i == 4) {
            this.f12278b.append(this.f12281e);
            this.f12279c[this.f12280d - 1] = 5;
        } else if (i == 6) {
            this.f12279c[this.f12280d - 1] = 7;
        } else if (i == 7) {
            throw new IllegalStateException("JSON must have only one top-level value.");
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: b */
    public final void mo16520b() throws IOException {
        mo16535x();
        mo16519a();
        int i = this.f12280d;
        int[] iArr = this.f12279c;
        if (i == iArr.length) {
            int[] iArr2 = new int[(i * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f12279c = iArr2;
        }
        int[] iArr3 = this.f12279c;
        int i2 = this.f12280d;
        this.f12280d = i2 + 1;
        iArr3[i2] = 1;
        this.f12278b.write("[");
    }

    public final void close() throws IOException {
        this.f12278b.close();
        int i = this.f12280d;
        if (i > 1 || (i == 1 && this.f12279c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f12280d = 0;
    }

    /* renamed from: d */
    public final void mo16522d() throws IOException {
        mo16535x();
        mo16519a();
        int i = this.f12280d;
        int[] iArr = this.f12279c;
        if (i == iArr.length) {
            int[] iArr2 = new int[(i * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f12279c = iArr2;
        }
        int[] iArr3 = this.f12279c;
        int i2 = this.f12280d;
        this.f12280d = i2 + 1;
        iArr3[i2] = 3;
        this.f12278b.write("{");
    }

    /* renamed from: e */
    public final void mo16523e(int i, int i2, String str) throws IOException {
        int i3 = mo16528i();
        if (i3 != i2 && i3 != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f12282f == null) {
            this.f12280d--;
            this.f12278b.write(str);
        } else {
            StringBuilder h = C0072d.m201h("Dangling name: ");
            h.append(this.f12282f);
            throw new IllegalStateException(h.toString());
        }
    }

    /* renamed from: f */
    public final void mo16524f() throws IOException {
        mo16523e(1, 2, "]");
    }

    public final void flush() throws IOException {
        if (this.f12280d != 0) {
            this.f12278b.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final void mo16526g() throws IOException {
        mo16523e(3, 5, "}");
    }

    /* renamed from: h */
    public final void mo16527h() throws IOException {
        if (this.f12282f != null) {
            if (this.f12283g) {
                mo16535x();
            } else {
                this.f12282f = null;
                return;
            }
        }
        mo16519a();
        this.f12278b.write("null");
    }

    /* renamed from: i */
    public final int mo16528i() {
        int i = this.f12280d;
        if (i != 0) {
            return this.f12279c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: j */
    public final void mo16529j(String str) throws IOException {
        String str2;
        String[] strArr = f12277h;
        this.f12278b.write("\"");
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
                this.f12278b.write(str, i, i2 - i);
            }
            this.f12278b.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f12278b.write(str, i, length - i);
        }
        this.f12278b.write("\"");
    }

    /* renamed from: k */
    public final C5754h1 mo16530k(String str) throws IOException {
        if (str == null) {
            mo16527h();
            return this;
        }
        mo16535x();
        mo16519a();
        mo16529j(str);
        return this;
    }

    /* renamed from: n */
    public final void mo16531n(long j) throws IOException {
        mo16535x();
        mo16519a();
        this.f12278b.write(Long.toString(j));
    }

    /* renamed from: r */
    public final void mo16532r(Boolean bool) throws IOException {
        if (bool == null) {
            mo16527h();
            return;
        }
        mo16535x();
        mo16519a();
        this.f12278b.write(bool.booleanValue() ? "true" : "false");
    }

    /* renamed from: t */
    public final void mo16533t(Number number) throws IOException {
        if (number == null) {
            mo16527h();
            return;
        }
        mo16535x();
        String obj = number.toString();
        if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        mo16519a();
        this.f12278b.append(obj);
    }

    /* renamed from: u */
    public final void mo16534u(boolean z) throws IOException {
        mo16535x();
        mo16519a();
        this.f12278b.write(z ? "true" : "false");
    }

    /* renamed from: x */
    public final void mo16535x() throws IOException {
        if (this.f12282f != null) {
            int i = mo16528i();
            if (i == 5) {
                this.f12278b.write(44);
            } else if (i != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f12279c[this.f12280d - 1] = 4;
            mo16529j(this.f12282f);
            this.f12282f = null;
        }
    }
}
