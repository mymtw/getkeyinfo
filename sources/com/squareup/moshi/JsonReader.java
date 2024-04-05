package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okio.ByteString;
import p003a2.C0023f;
import p514bk.C14088a;
import p756lr.C19893f;
import p756lr.C19897i;
import p756lr.C19908t;

public abstract class JsonReader implements Closeable {

    /* renamed from: b */
    public int f37891b;

    /* renamed from: c */
    public int[] f37892c;

    /* renamed from: d */
    public String[] f37893d;

    /* renamed from: e */
    public int[] f37894e;

    /* renamed from: f */
    public boolean f37895f;

    /* renamed from: g */
    public boolean f37896g;

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

    /* renamed from: com.squareup.moshi.JsonReader$a */
    public static /* synthetic */ class C17361a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37897a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.moshi.JsonReader$Token[] r0 = com.squareup.moshi.JsonReader.Token.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37897a = r0
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37897a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37897a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37897a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37897a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f37897a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.JsonReader.C17361a.<clinit>():void");
        }
    }

    /* renamed from: com.squareup.moshi.JsonReader$b */
    public static final class C17362b {

        /* renamed from: a */
        public final String[] f37898a;

        /* renamed from: b */
        public final C19908t f37899b;

        public C17362b(String[] strArr, C19908t tVar) {
            this.f37898a = strArr;
            this.f37899b = tVar;
        }

        /* renamed from: a */
        public static C17362b m29110a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C19893f fVar = new C19893f();
                for (int i = 0; i < strArr.length; i++) {
                    C17407s.m29181S(fVar, strArr[i]);
                    fVar.readByte();
                    byteStringArr[i] = fVar.mo72759t();
                }
                C19908t.f43902d.getClass();
                return new C17362b((String[]) strArr.clone(), C19908t.C19909a.m34005b(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public JsonReader() {
        this.f37892c = new int[32];
        this.f37893d = new String[32];
        this.f37894e = new int[32];
    }

    /* renamed from: B */
    public abstract void mo68403B() throws IOException;

    /* renamed from: G */
    public final void mo68404G(int i) {
        int i2 = this.f37891b;
        int[] iArr = this.f37892c;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f37892c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f37893d;
                this.f37893d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f37894e;
                this.f37894e = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder h = C0072d.m201h("Nesting too deep at ");
                h.append(getPath());
                throw new JsonDataException(h.toString());
            }
        }
        int[] iArr3 = this.f37892c;
        int i3 = this.f37891b;
        this.f37891b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: M */
    public final Object mo68405M() throws IOException {
        switch (C17361a.f37897a[mo68426u().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                mo68409a();
                while (mo68414f()) {
                    arrayList.add(mo68405M());
                }
                mo68412d();
                return arrayList;
            case 2:
                LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
                mo68410b();
                while (mo68414f()) {
                    String k = mo68421k();
                    Object M = mo68405M();
                    Object put = linkedHashTreeMap.put(k, M);
                    if (put != null) {
                        StringBuilder l = C0023f.m111l("Map key '", k, "' has multiple values at path ");
                        l.append(getPath());
                        l.append(": ");
                        l.append(put);
                        l.append(" and ");
                        l.append(M);
                        throw new JsonDataException(l.toString());
                    }
                }
                mo68413e();
                return linkedHashTreeMap;
            case 3:
                return mo68425t();
            case 4:
                return Double.valueOf(mo68418h());
            case 5:
                return Boolean.valueOf(mo68416g());
            case 6:
                mo68423n();
                return null;
            default:
                StringBuilder h = C0072d.m201h("Expected a value but was ");
                h.append(mo68426u());
                h.append(" at path ");
                h.append(getPath());
                throw new IllegalStateException(h.toString());
        }
    }

    /* renamed from: Q */
    public abstract int mo68406Q(C17362b bVar) throws IOException;

    /* renamed from: R */
    public abstract int mo68407R(C17362b bVar) throws IOException;

    /* renamed from: S */
    public abstract void mo68408S() throws IOException;

    /* renamed from: a */
    public abstract void mo68409a() throws IOException;

    /* renamed from: b */
    public abstract void mo68410b() throws IOException;

    /* renamed from: c0 */
    public abstract void mo68411c0() throws IOException;

    /* renamed from: d */
    public abstract void mo68412d() throws IOException;

    /* renamed from: e */
    public abstract void mo68413e() throws IOException;

    /* renamed from: f */
    public abstract boolean mo68414f() throws IOException;

    /* renamed from: f0 */
    public final void mo68415f0(String str) throws JsonEncodingException {
        StringBuilder k = C0073e.m211k(str, " at path ");
        k.append(getPath());
        throw new JsonEncodingException(k.toString());
    }

    /* renamed from: g */
    public abstract boolean mo68416g() throws IOException;

    public final String getPath() {
        return C14088a.m21783j(this.f37891b, this.f37892c, this.f37893d, this.f37894e);
    }

    /* renamed from: h */
    public abstract double mo68418h() throws IOException;

    /* renamed from: i */
    public abstract int mo68419i() throws IOException;

    /* renamed from: j */
    public abstract long mo68420j() throws IOException;

    /* renamed from: k */
    public abstract String mo68421k() throws IOException;

    /* renamed from: m0 */
    public final JsonDataException mo68422m0(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    /* renamed from: n */
    public abstract void mo68423n() throws IOException;

    /* renamed from: r */
    public abstract C19897i mo68424r() throws IOException;

    /* renamed from: t */
    public abstract String mo68425t() throws IOException;

    /* renamed from: u */
    public abstract Token mo68426u() throws IOException;

    /* renamed from: x */
    public abstract JsonReader mo68427x();

    public JsonReader(JsonReader jsonReader) {
        this.f37891b = jsonReader.f37891b;
        this.f37892c = (int[]) jsonReader.f37892c.clone();
        this.f37893d = (String[]) jsonReader.f37893d.clone();
        this.f37894e = (int[]) jsonReader.f37894e.clone();
        this.f37895f = jsonReader.f37895f;
        this.f37896g = jsonReader.f37896g;
    }
}
