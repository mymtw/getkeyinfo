package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p003a2.C0023f;
import p514bk.C14088a;

/* renamed from: com.squareup.moshi.w */
public abstract class C17412w implements Closeable, Flushable {

    /* renamed from: b */
    public int f38010b = 0;

    /* renamed from: c */
    public int[] f38011c = new int[32];

    /* renamed from: d */
    public String[] f38012d = new String[32];

    /* renamed from: e */
    public int[] f38013e = new int[32];

    /* renamed from: f */
    public String f38014f;

    /* renamed from: g */
    public boolean f38015g;

    /* renamed from: h */
    public boolean f38016h;

    /* renamed from: i */
    public boolean f38017i;

    /* renamed from: j */
    public int f38018j = -1;

    /* renamed from: B */
    public abstract C17412w mo68516B(boolean z) throws IOException;

    /* renamed from: a */
    public abstract C17412w mo68521a() throws IOException;

    /* renamed from: b */
    public abstract C17412w mo68522b() throws IOException;

    /* renamed from: d */
    public final void mo68551d() {
        int i = this.f38010b;
        int[] iArr = this.f38011c;
        if (i == iArr.length) {
            if (i != 256) {
                this.f38011c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f38012d;
                this.f38012d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f38013e;
                this.f38013e = Arrays.copyOf(iArr2, iArr2.length * 2);
                if (this instanceof C17411v) {
                    C17411v vVar = (C17411v) this;
                    Object[] objArr = vVar.f38008k;
                    vVar.f38008k = Arrays.copyOf(objArr, objArr.length * 2);
                    return;
                }
                return;
            }
            StringBuilder h = C0072d.m201h("Nesting too deep at ");
            h.append(getPath());
            h.append(": circular reference?");
            throw new JsonDataException(h.toString());
        }
    }

    /* renamed from: e */
    public abstract C17412w mo68525e() throws IOException;

    /* renamed from: f */
    public abstract C17412w mo68526f() throws IOException;

    /* renamed from: g */
    public final void mo68552g(Object obj) throws IOException {
        if (obj instanceof Map) {
            mo68522b();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : C0023f.m108i(key, C0072d.m201h("Map keys must be of type String: ")));
                }
                mo68529h((String) key);
                mo68552g(entry.getValue());
            }
            mo68526f();
        } else if (obj instanceof List) {
            mo68521a();
            for (Object g : (List) obj) {
                mo68552g(g);
            }
            mo68525e();
        } else if (obj instanceof String) {
            mo68535x((String) obj);
        } else if (obj instanceof Boolean) {
            mo68516B(((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            mo68532r(((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            mo68533t(((Long) obj).longValue());
        } else if (obj instanceof Number) {
            mo68534u((Number) obj);
        } else if (obj == null) {
            mo68530i();
        } else {
            throw new IllegalArgumentException(C0023f.m108i(obj, C0072d.m201h("Unsupported type: ")));
        }
    }

    public final String getPath() {
        return C14088a.m21783j(this.f38010b, this.f38011c, this.f38012d, this.f38013e);
    }

    /* renamed from: h */
    public abstract C17412w mo68529h(String str) throws IOException;

    /* renamed from: i */
    public abstract C17412w mo68530i() throws IOException;

    /* renamed from: j */
    public final int mo68554j() {
        int i = this.f38010b;
        if (i != 0) {
            return this.f38011c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: k */
    public final void mo68555k(int i) {
        int[] iArr = this.f38011c;
        int i2 = this.f38010b;
        this.f38010b = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: n */
    public void mo68531n(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f38014f = str;
    }

    /* renamed from: r */
    public abstract C17412w mo68532r(double d) throws IOException;

    /* renamed from: t */
    public abstract C17412w mo68533t(long j) throws IOException;

    /* renamed from: u */
    public abstract C17412w mo68534u(Number number) throws IOException;

    /* renamed from: x */
    public abstract C17412w mo68535x(String str) throws IOException;
}
