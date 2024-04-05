package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p756lr.C19893f;
import p756lr.C19897i;

/* renamed from: com.squareup.moshi.t */
public final class C17408t extends JsonReader {

    /* renamed from: i */
    public static final Object f37990i = new Object();

    /* renamed from: h */
    public Object[] f37991h;

    /* renamed from: com.squareup.moshi.t$a */
    public static final class C17409a implements Iterator<Object>, Cloneable {

        /* renamed from: b */
        public final JsonReader.Token f37992b;

        /* renamed from: c */
        public final Object[] f37993c;

        /* renamed from: d */
        public int f37994d;

        public C17409a(JsonReader.Token token, Object[] objArr, int i) {
            this.f37992b = token;
            this.f37993c = objArr;
            this.f37994d = i;
        }

        public final Object clone() throws CloneNotSupportedException {
            return new C17409a(this.f37992b, this.f37993c, this.f37994d);
        }

        public final boolean hasNext() {
            return this.f37994d < this.f37993c.length;
        }

        public final Object next() {
            Object[] objArr = this.f37993c;
            int i = this.f37994d;
            this.f37994d = i + 1;
            return objArr[i];
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C17408t(Object obj) {
        int[] iArr = this.f37892c;
        int i = this.f37891b;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        this.f37991h = objArr;
        this.f37891b = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: A0 */
    public final void mo68536A0() {
        int i = this.f37891b - 1;
        this.f37891b = i;
        Object[] objArr = this.f37991h;
        objArr[i] = null;
        this.f37892c[i] = 0;
        if (i > 0) {
            int[] iArr = this.f37894e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            Object obj = objArr[i - 1];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    mo68539x0(it.next());
                }
            }
        }
    }

    /* renamed from: B */
    public final void mo68403B() throws IOException {
        if (mo68414f()) {
            mo68539x0(mo68421k());
        }
    }

    /* renamed from: B0 */
    public final <T> T mo68537B0(Class<T> cls, JsonReader.Token token) throws IOException {
        int i = this.f37891b;
        Object obj = i != 0 ? this.f37991h[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && token == JsonReader.Token.NULL) {
            return null;
        }
        if (obj == f37990i) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw mo68422m0(obj, token);
    }

    /* renamed from: Q */
    public final int mo68406Q(JsonReader.C17362b bVar) throws IOException {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) mo68537B0(Map.Entry.class, token);
        Object key = entry.getKey();
        if (key instanceof String) {
            String str = (String) key;
            int length = bVar.f37898a.length;
            for (int i = 0; i < length; i++) {
                if (bVar.f37898a[i].equals(str)) {
                    this.f37991h[this.f37891b - 1] = entry.getValue();
                    this.f37893d[this.f37891b - 2] = str;
                    return i;
                }
            }
            return -1;
        }
        throw mo68422m0(key, token);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo68407R(com.squareup.moshi.JsonReader.C17362b r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f37891b
            if (r0 == 0) goto L_0x000b
            java.lang.Object[] r1 = r5.f37991h
            int r0 = r0 + -1
            r0 = r1[r0]
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            boolean r1 = r0 instanceof java.lang.String
            r2 = -1
            if (r1 != 0) goto L_0x001e
            java.lang.Object r6 = f37990i
            if (r0 == r6) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "JsonReader is closed"
            r6.<init>(r0)
            throw r6
        L_0x001e:
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            java.lang.String[] r3 = r6.f37898a
            int r3 = r3.length
        L_0x0024:
            if (r1 >= r3) goto L_0x0037
            java.lang.String[] r4 = r6.f37898a
            r4 = r4[r1]
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r5.mo68536A0()
            return r1
        L_0x0034:
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C17408t.mo68407R(com.squareup.moshi.JsonReader$b):int");
    }

    /* renamed from: S */
    public final void mo68408S() throws IOException {
        if (!this.f37896g) {
            this.f37991h[this.f37891b - 1] = ((Map.Entry) mo68537B0(Map.Entry.class, JsonReader.Token.NAME)).getValue();
            this.f37893d[this.f37891b - 2] = "null";
            return;
        }
        JsonReader.Token u = mo68426u();
        mo68421k();
        throw new JsonDataException("Cannot skip unexpected " + u + " at " + getPath());
    }

    /* renamed from: a */
    public final void mo68409a() throws IOException {
        List list = (List) mo68537B0(List.class, JsonReader.Token.BEGIN_ARRAY);
        C17409a aVar = new C17409a(JsonReader.Token.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f37991h;
        int i = this.f37891b;
        objArr[i - 1] = aVar;
        this.f37892c[i - 1] = 1;
        this.f37894e[i - 1] = 0;
        if (aVar.hasNext()) {
            mo68539x0(aVar.next());
        }
    }

    /* renamed from: b */
    public final void mo68410b() throws IOException {
        Map map = (Map) mo68537B0(Map.class, JsonReader.Token.BEGIN_OBJECT);
        C17409a aVar = new C17409a(JsonReader.Token.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f37991h;
        int i = this.f37891b;
        objArr[i - 1] = aVar;
        this.f37892c[i - 1] = 3;
        if (aVar.hasNext()) {
            mo68539x0(aVar.next());
        }
    }

    /* renamed from: c0 */
    public final void mo68411c0() throws IOException {
        if (!this.f37896g) {
            int i = this.f37891b;
            if (i > 1) {
                this.f37893d[i - 2] = "null";
            }
            Object obj = i != 0 ? this.f37991h[i - 1] : null;
            if (obj instanceof C17409a) {
                StringBuilder h = C0072d.m201h("Expected a value but was ");
                h.append(mo68426u());
                h.append(" at path ");
                h.append(getPath());
                throw new JsonDataException(h.toString());
            } else if (obj instanceof Map.Entry) {
                Object[] objArr = this.f37991h;
                objArr[i - 1] = ((Map.Entry) objArr[i - 1]).getValue();
            } else if (i > 0) {
                mo68536A0();
            } else {
                StringBuilder h2 = C0072d.m201h("Expected a value but was ");
                h2.append(mo68426u());
                h2.append(" at path ");
                h2.append(getPath());
                throw new JsonDataException(h2.toString());
            }
        } else {
            StringBuilder h3 = C0072d.m201h("Cannot skip unexpected ");
            h3.append(mo68426u());
            h3.append(" at ");
            h3.append(getPath());
            throw new JsonDataException(h3.toString());
        }
    }

    public final void close() throws IOException {
        Arrays.fill(this.f37991h, 0, this.f37891b, (Object) null);
        this.f37991h[0] = f37990i;
        this.f37892c[0] = 8;
        this.f37891b = 1;
    }

    /* renamed from: d */
    public final void mo68412d() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_ARRAY;
        C17409a aVar = (C17409a) mo68537B0(C17409a.class, token);
        if (aVar.f37992b != token || aVar.hasNext()) {
            throw mo68422m0(aVar, token);
        }
        mo68536A0();
    }

    /* renamed from: e */
    public final void mo68413e() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_OBJECT;
        C17409a aVar = (C17409a) mo68537B0(C17409a.class, token);
        if (aVar.f37992b != token || aVar.hasNext()) {
            throw mo68422m0(aVar, token);
        }
        this.f37893d[this.f37891b - 1] = null;
        mo68536A0();
    }

    /* renamed from: f */
    public final boolean mo68414f() throws IOException {
        int i = this.f37891b;
        if (i == 0) {
            return false;
        }
        Object obj = this.f37991h[i - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    /* renamed from: g */
    public final boolean mo68416g() throws IOException {
        mo68536A0();
        return ((Boolean) mo68537B0(Boolean.class, JsonReader.Token.BOOLEAN)).booleanValue();
    }

    /* renamed from: h */
    public final double mo68418h() throws IOException {
        double d;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object B0 = mo68537B0(Object.class, token);
        if (B0 instanceof Number) {
            d = ((Number) B0).doubleValue();
        } else if (B0 instanceof String) {
            try {
                d = Double.parseDouble((String) B0);
            } catch (NumberFormatException unused) {
                throw mo68422m0(B0, JsonReader.Token.NUMBER);
            }
        } else {
            throw mo68422m0(B0, token);
        }
        if (this.f37895f || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            mo68536A0();
            return d;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + getPath());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw mo68422m0(r0, com.squareup.moshi.JsonReader.Token.NUMBER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.math.BigDecimal((java.lang.String) r0).intValueExact();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo68419i() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER
            java.lang.Object r0 = r3.mo68537B0(r0, r1)
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L_0x0013
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x002b
        L_0x0013:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L_0x0036
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x001f }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x002b
        L_0x001f:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x002f }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x002f }
            r1.<init>(r2)     // Catch:{ NumberFormatException -> 0x002f }
            int r0 = r1.intValueExact()     // Catch:{ NumberFormatException -> 0x002f }
        L_0x002b:
            r3.mo68536A0()
            return r0
        L_0x002f:
            com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER
            com.squareup.moshi.JsonDataException r0 = r3.mo68422m0(r0, r1)
            throw r0
        L_0x0036:
            com.squareup.moshi.JsonDataException r0 = r3.mo68422m0(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C17408t.mo68419i():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw mo68422m0(r0, com.squareup.moshi.JsonReader.Token.NUMBER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.math.BigDecimal((java.lang.String) r0).longValueExact();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo68420j() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER
            java.lang.Object r0 = r3.mo68537B0(r0, r1)
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L_0x0013
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            goto L_0x002b
        L_0x0013:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L_0x0036
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x001f }
            long r0 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x002b
        L_0x001f:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x002f }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x002f }
            r1.<init>(r2)     // Catch:{ NumberFormatException -> 0x002f }
            long r0 = r1.longValueExact()     // Catch:{ NumberFormatException -> 0x002f }
        L_0x002b:
            r3.mo68536A0()
            return r0
        L_0x002f:
            com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER
            com.squareup.moshi.JsonDataException r0 = r3.mo68422m0(r0, r1)
            throw r0
        L_0x0036:
            com.squareup.moshi.JsonDataException r0 = r3.mo68422m0(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C17408t.mo68420j():long");
    }

    /* renamed from: k */
    public final String mo68421k() throws IOException {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) mo68537B0(Map.Entry.class, token);
        Object key = entry.getKey();
        if (key instanceof String) {
            String str = (String) key;
            this.f37991h[this.f37891b - 1] = entry.getValue();
            this.f37893d[this.f37891b - 2] = str;
            return str;
        }
        throw mo68422m0(key, token);
    }

    /* renamed from: n */
    public final void mo68423n() throws IOException {
        mo68537B0(Void.class, JsonReader.Token.NULL);
        mo68536A0();
    }

    /* renamed from: r */
    public final C19897i mo68424r() throws IOException {
        Object M = mo68405M();
        C19893f fVar = new C19893f();
        C17407s sVar = new C17407s(fVar);
        try {
            sVar.mo68552g(M);
            sVar.close();
            return fVar;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: t */
    public final String mo68425t() throws IOException {
        int i = this.f37891b;
        String str = i != 0 ? this.f37991h[i - 1] : null;
        if (str instanceof String) {
            mo68536A0();
            return str;
        } else if (str instanceof Number) {
            mo68536A0();
            return str.toString();
        } else if (str == f37990i) {
            throw new IllegalStateException("JsonReader is closed");
        } else {
            throw mo68422m0(str, JsonReader.Token.STRING);
        }
    }

    /* renamed from: u */
    public final JsonReader.Token mo68426u() throws IOException {
        int i = this.f37891b;
        if (i == 0) {
            return JsonReader.Token.END_DOCUMENT;
        }
        Object obj = this.f37991h[i - 1];
        if (obj instanceof C17409a) {
            return ((C17409a) obj).f37992b;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return JsonReader.Token.NAME;
        }
        if (obj instanceof String) {
            return JsonReader.Token.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj == f37990i) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw mo68422m0(obj, "a JSON value");
    }

    /* renamed from: x */
    public final JsonReader mo68427x() {
        return new C17408t(this);
    }

    /* renamed from: x0 */
    public final void mo68539x0(Object obj) {
        int i = this.f37891b;
        if (i == this.f37991h.length) {
            if (i != 256) {
                int[] iArr = this.f37892c;
                this.f37892c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f37893d;
                this.f37893d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f37894e;
                this.f37894e = Arrays.copyOf(iArr2, iArr2.length * 2);
                Object[] objArr = this.f37991h;
                this.f37991h = Arrays.copyOf(objArr, objArr.length * 2);
            } else {
                StringBuilder h = C0072d.m201h("Nesting too deep at ");
                h.append(getPath());
                throw new JsonDataException(h.toString());
            }
        }
        Object[] objArr2 = this.f37991h;
        int i2 = this.f37891b;
        this.f37891b = i2 + 1;
        objArr2[i2] = obj;
    }

    public C17408t(C17408t tVar) {
        super(tVar);
        this.f37991h = (Object[]) tVar.f37991h.clone();
        for (int i = 0; i < this.f37891b; i++) {
            Object[] objArr = this.f37991h;
            Object obj = objArr[i];
            if (obj instanceof C17409a) {
                C17409a aVar = (C17409a) obj;
                objArr[i] = new C17409a(aVar.f37992b, aVar.f37993c, aVar.f37994d);
            }
        }
    }
}
