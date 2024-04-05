package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.squareup.moshi.v */
public final class C17411v extends C17412w {

    /* renamed from: k */
    public Object[] f38008k = new Object[32];

    /* renamed from: l */
    public String f38009l;

    public C17411v() {
        mo68555k(6);
    }

    /* renamed from: B */
    public final C17412w mo68516B(boolean z) throws IOException {
        if (!this.f38017i) {
            mo68548G(Boolean.valueOf(z));
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
    public final void mo68548G(Object obj) {
        String str;
        Object put;
        int j = mo68554j();
        int i = this.f38010b;
        if (i == 1) {
            if (j == 6) {
                this.f38011c[i - 1] = 7;
                this.f38008k[i - 1] = obj;
                return;
            }
            throw new IllegalStateException("JSON must have only one top-level value.");
        } else if (j != 3 || (str = this.f38009l) == null) {
            if (j == 1) {
                ((List) this.f38008k[i - 1]).add(obj);
            } else if (j == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if ((obj != null || this.f38016h) && (put = ((Map) this.f38008k[i - 1]).put(str, obj)) != null) {
            StringBuilder h = C0072d.m201h("Map key '");
            h.append(this.f38009l);
            h.append("' has multiple values at path ");
            h.append(getPath());
            h.append(": ");
            h.append(put);
            h.append(" and ");
            h.append(obj);
            throw new IllegalArgumentException(h.toString());
        } else {
            this.f38009l = null;
        }
    }

    /* renamed from: a */
    public final C17412w mo68521a() throws IOException {
        if (!this.f38017i) {
            int i = this.f38010b;
            int i2 = this.f38018j;
            if (i == i2 && this.f38011c[i - 1] == 1) {
                this.f38018j = ~i2;
                return this;
            }
            mo68551d();
            ArrayList arrayList = new ArrayList();
            mo68548G(arrayList);
            Object[] objArr = this.f38008k;
            int i3 = this.f38010b;
            objArr[i3] = arrayList;
            this.f38013e[i3] = 0;
            mo68555k(1);
            return this;
        }
        StringBuilder h = C0072d.m201h("Array cannot be used as a map key in JSON at path ");
        h.append(getPath());
        throw new IllegalStateException(h.toString());
    }

    /* renamed from: b */
    public final C17412w mo68522b() throws IOException {
        if (!this.f38017i) {
            int i = this.f38010b;
            int i2 = this.f38018j;
            if (i == i2 && this.f38011c[i - 1] == 3) {
                this.f38018j = ~i2;
                return this;
            }
            mo68551d();
            LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
            mo68548G(linkedHashTreeMap);
            this.f38008k[this.f38010b] = linkedHashTreeMap;
            mo68555k(3);
            return this;
        }
        StringBuilder h = C0072d.m201h("Object cannot be used as a map key in JSON at path ");
        h.append(getPath());
        throw new IllegalStateException(h.toString());
    }

    public final void close() throws IOException {
        int i = this.f38010b;
        if (i > 1 || (i == 1 && this.f38011c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f38010b = 0;
    }

    /* renamed from: e */
    public final C17412w mo68525e() throws IOException {
        if (mo68554j() == 1) {
            int i = this.f38010b;
            int i2 = this.f38018j;
            if (i == (~i2)) {
                this.f38018j = ~i2;
                return this;
            }
            int i3 = i - 1;
            this.f38010b = i3;
            this.f38008k[i3] = null;
            int[] iArr = this.f38013e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: f */
    public final C17412w mo68526f() throws IOException {
        if (mo68554j() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f38009l == null) {
            int i = this.f38010b;
            int i2 = this.f38018j;
            if (i == (~i2)) {
                this.f38018j = ~i2;
                return this;
            }
            this.f38017i = false;
            int i3 = i - 1;
            this.f38010b = i3;
            this.f38008k[i3] = null;
            this.f38012d[i3] = null;
            int[] iArr = this.f38013e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        } else {
            StringBuilder h = C0072d.m201h("Dangling name: ");
            h.append(this.f38009l);
            throw new IllegalStateException(h.toString());
        }
    }

    public final void flush() throws IOException {
        if (this.f38010b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: h */
    public final C17412w mo68529h(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f38010b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (mo68554j() == 3 && this.f38009l == null && !this.f38017i) {
            this.f38009l = str;
            this.f38012d[this.f38010b - 1] = str;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: i */
    public final C17412w mo68530i() throws IOException {
        if (!this.f38017i) {
            mo68548G((Object) null);
            int[] iArr = this.f38013e;
            int i = this.f38010b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder h = C0072d.m201h("null cannot be used as a map key in JSON at path ");
        h.append(getPath());
        throw new IllegalStateException(h.toString());
    }

    /* renamed from: r */
    public final C17412w mo68532r(double d) throws IOException {
        if (!this.f38015g && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f38017i) {
            this.f38017i = false;
            mo68529h(Double.toString(d));
            return this;
        } else {
            mo68548G(Double.valueOf(d));
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
        mo68548G(Long.valueOf(j));
        int[] iArr = this.f38013e;
        int i = this.f38010b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: u */
    public final C17412w mo68534u(Number number) throws IOException {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            mo68533t(number.longValue());
            return this;
        } else if ((number instanceof Float) || (number instanceof Double)) {
            mo68532r(number.doubleValue());
            return this;
        } else if (number == null) {
            mo68530i();
            return this;
        } else {
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
            if (this.f38017i) {
                this.f38017i = false;
                mo68529h(bigDecimal.toString());
                return this;
            }
            mo68548G(bigDecimal);
            int[] iArr = this.f38013e;
            int i = this.f38010b - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: x */
    public final C17412w mo68535x(String str) throws IOException {
        if (this.f38017i) {
            this.f38017i = false;
            mo68529h(str);
            return this;
        }
        mo68548G(str);
        int[] iArr = this.f38013e;
        int i = this.f38010b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
