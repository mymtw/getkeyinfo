package com.google.gson.internal.bind;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.gson.C16798l;
import com.google.gson.C16801o;
import com.google.gson.C16802p;
import com.google.gson.C16803q;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: com.google.gson.internal.bind.a */
public final class C16780a extends JsonReader {

    /* renamed from: f */
    public static final C16781a f37084f = new C16781a();

    /* renamed from: g */
    public static final Object f37085g = new Object();

    /* renamed from: b */
    public Object[] f37086b = new Object[32];

    /* renamed from: c */
    public int f37087c = 0;

    /* renamed from: d */
    public String[] f37088d = new String[32];

    /* renamed from: e */
    public int[] f37089e = new int[32];

    /* renamed from: com.google.gson.internal.bind.a$a */
    public class C16781a extends Reader {
        public final void close() throws IOException {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public C16780a(C16802p pVar) {
        super(f37084f);
        mo59589e(pVar);
    }

    private String locationString() {
        StringBuilder h = C0072d.m201h(" at path ");
        h.append(getPath());
        return h.toString();
    }

    /* renamed from: a */
    public final void mo59583a(JsonToken jsonToken) throws IOException {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
        }
    }

    /* renamed from: b */
    public final Object mo59584b() {
        return this.f37086b[this.f37087c - 1];
    }

    public final void beginArray() throws IOException {
        mo59583a(JsonToken.BEGIN_ARRAY);
        mo59589e(((C16798l) mo59584b()).iterator());
        this.f37089e[this.f37087c - 1] = 0;
    }

    public final void beginObject() throws IOException {
        mo59583a(JsonToken.BEGIN_OBJECT);
        mo59589e(((C16802p) mo59584b()).f37123b.entrySet().iterator());
    }

    public final void close() throws IOException {
        this.f37086b = new Object[]{f37085g};
        this.f37087c = 1;
    }

    /* renamed from: d */
    public final Object mo59588d() {
        Object[] objArr = this.f37086b;
        int i = this.f37087c - 1;
        this.f37087c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: e */
    public final void mo59589e(Object obj) {
        int i = this.f37087c;
        Object[] objArr = this.f37086b;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f37086b = Arrays.copyOf(objArr, i2);
            this.f37089e = Arrays.copyOf(this.f37089e, i2);
            this.f37088d = (String[]) Arrays.copyOf(this.f37088d, i2);
        }
        Object[] objArr2 = this.f37086b;
        int i3 = this.f37087c;
        this.f37087c = i3 + 1;
        objArr2[i3] = obj;
    }

    public final void endArray() throws IOException {
        mo59583a(JsonToken.END_ARRAY);
        mo59588d();
        mo59588d();
        int i = this.f37087c;
        if (i > 0) {
            int[] iArr = this.f37089e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void endObject() throws IOException {
        mo59583a(JsonToken.END_OBJECT);
        mo59588d();
        mo59588d();
        int i = this.f37087c;
        if (i > 0) {
            int[] iArr = this.f37089e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String getPath() {
        StringBuilder k = C0326j.m866k('$');
        int i = 0;
        while (i < this.f37087c) {
            Object[] objArr = this.f37086b;
            Object obj = objArr[i];
            if (obj instanceof C16798l) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    k.append('[');
                    k.append(this.f37089e[i]);
                    k.append(']');
                }
            } else if (obj instanceof C16802p) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    k.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                    String str = this.f37088d[i];
                    if (str != null) {
                        k.append(str);
                    }
                }
            }
            i++;
        }
        return k.toString();
    }

    public final boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    public final boolean nextBoolean() throws IOException {
        mo59583a(JsonToken.BOOLEAN);
        boolean g = ((C16803q) mo59588d()).mo59643g();
        int i = this.f37087c;
        if (i > 0) {
            int[] iArr = this.f37089e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return g;
    }

    public final double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            C16803q qVar = (C16803q) mo59584b();
            double doubleValue = qVar.f37124b instanceof Number ? qVar.mo59645l().doubleValue() : Double.parseDouble(qVar.mo59630e());
            if (isLenient() || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                mo59588d();
                int i = this.f37087c;
                if (i > 0) {
                    int[] iArr = this.f37089e;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public final int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            C16803q qVar = (C16803q) mo59584b();
            int intValue = qVar.f37124b instanceof Number ? qVar.mo59645l().intValue() : Integer.parseInt(qVar.mo59630e());
            mo59588d();
            int i = this.f37087c;
            if (i > 0) {
                int[] iArr = this.f37089e;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return intValue;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public final long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            C16803q qVar = (C16803q) mo59584b();
            long longValue = qVar.f37124b instanceof Number ? qVar.mo59645l().longValue() : Long.parseLong(qVar.mo59630e());
            mo59588d();
            int i = this.f37087c;
            if (i > 0) {
                int[] iArr = this.f37089e;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return longValue;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public final String nextName() throws IOException {
        mo59583a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) mo59584b()).next();
        String str = (String) entry.getKey();
        this.f37088d[this.f37087c - 1] = str;
        mo59589e(entry.getValue());
        return str;
    }

    public final void nextNull() throws IOException {
        mo59583a(JsonToken.NULL);
        mo59588d();
        int i = this.f37087c;
        if (i > 0) {
            int[] iArr = this.f37089e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek == jsonToken || peek == JsonToken.NUMBER) {
            String e = ((C16803q) mo59588d()).mo59630e();
            int i = this.f37087c;
            if (i > 0) {
                int[] iArr = this.f37089e;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return e;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public final JsonToken peek() throws IOException {
        if (this.f37087c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object b = mo59584b();
        if (b instanceof Iterator) {
            boolean z = this.f37086b[this.f37087c - 2] instanceof C16802p;
            Iterator it = (Iterator) b;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            mo59589e(it.next());
            return peek();
        } else if (b instanceof C16802p) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (b instanceof C16798l) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (b instanceof C16803q) {
                Serializable serializable = ((C16803q) b).f37124b;
                if (serializable instanceof String) {
                    return JsonToken.STRING;
                }
                if (serializable instanceof Boolean) {
                    return JsonToken.BOOLEAN;
                }
                if (serializable instanceof Number) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (b instanceof C16801o) {
                return JsonToken.NULL;
            } else {
                if (b == f37085g) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public final void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f37088d[this.f37087c - 2] = "null";
        } else {
            mo59588d();
            int i = this.f37087c;
            if (i > 0) {
                this.f37088d[i - 1] = "null";
            }
        }
        int i2 = this.f37087c;
        if (i2 > 0) {
            int[] iArr = this.f37089e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final String toString() {
        return C16780a.class.getSimpleName();
    }
}
