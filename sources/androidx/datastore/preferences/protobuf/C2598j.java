package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.j */
public final class C2598j implements C2640x0 {

    /* renamed from: a */
    public final C2592i f5913a;

    /* renamed from: b */
    public int f5914b;

    /* renamed from: c */
    public int f5915c;

    /* renamed from: d */
    public int f5916d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.j$a */
    public static /* synthetic */ class C2599a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5917a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5917a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f5917a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2598j.C2599a.<clinit>():void");
        }
    }

    public C2598j(C2592i iVar) {
        Charset charset = C2631w.f5973a;
        if (iVar != null) {
            this.f5913a = iVar;
            iVar.f5889d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    /* renamed from: A */
    public final void mo9748A(List<String> list) throws IOException {
        mo9764Q(list, false);
    }

    /* renamed from: B */
    public final void mo9749B(List<Float> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2625t) {
            C2625t tVar = (C2625t) list;
            int i = this.f5914b & 7;
            if (i == 2) {
                int y = this.f5913a.mo9721y();
                mo9767T(y);
                int d = this.f5913a.mo9701d() + y;
                do {
                    tVar.mo9888c(this.f5913a.mo9711o());
                } while (this.f5913a.mo9701d() < d);
            } else if (i == 5) {
                do {
                    tVar.mo9888c(this.f5913a.mo9711o());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 2) {
                int y2 = this.f5913a.mo9721y();
                mo9767T(y2);
                int d2 = this.f5913a.mo9701d() + y2;
                do {
                    list.add(Float.valueOf(this.f5913a.mo9711o()));
                } while (this.f5913a.mo9701d() < d2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f5913a.mo9711o()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: C */
    public final boolean mo9750C() throws IOException {
        int i;
        if (this.f5913a.mo9702e() || (i = this.f5914b) == this.f5915c) {
            return false;
        }
        return this.f5913a.mo9699A(i);
    }

    /* renamed from: D */
    public final int mo9751D() throws IOException {
        mo9766S(5);
        return this.f5913a.mo9714r();
    }

    /* renamed from: E */
    public final void mo9752E(List<ByteString> list) throws IOException {
        int x;
        if ((this.f5914b & 7) == 2) {
            do {
                list.add(mo9783n());
                if (!this.f5913a.mo9702e()) {
                    x = this.f5913a.mo9720x();
                } else {
                    return;
                }
            } while (x == this.f5914b);
            this.f5916d = x;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: F */
    public final void mo9753F(List<Double> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2604l) {
            C2604l lVar = (C2604l) list;
            int i = this.f5914b & 7;
            if (i == 1) {
                do {
                    lVar.mo9817c(this.f5913a.mo9707k());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int y = this.f5913a.mo9721y();
                mo9768U(y);
                int d = this.f5913a.mo9701d() + y;
                do {
                    lVar.mo9817c(this.f5913a.mo9707k());
                } while (this.f5913a.mo9701d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f5913a.mo9707k()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int y2 = this.f5913a.mo9721y();
                mo9768U(y2);
                int d2 = this.f5913a.mo9701d() + y2;
                do {
                    list.add(Double.valueOf(this.f5913a.mo9707k()));
                } while (this.f5913a.mo9701d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: G */
    public final long mo9754G() throws IOException {
        mo9766S(0);
        return this.f5913a.mo9713q();
    }

    /* renamed from: H */
    public final String mo9755H() throws IOException {
        mo9766S(2);
        return this.f5913a.mo9719w();
    }

    /* renamed from: I */
    public final <T> T mo9756I(C2642y0<T> y0Var, C2611o oVar) throws IOException {
        mo9766S(2);
        return mo9763P(y0Var, oVar);
    }

    /* renamed from: J */
    public final <T> void mo9757J(List<T> list, C2642y0<T> y0Var, C2611o oVar) throws IOException {
        int x;
        int i = this.f5914b;
        if ((i & 7) == 2) {
            do {
                list.add(mo9763P(y0Var, oVar));
                if (!this.f5913a.mo9702e() && this.f5916d == 0) {
                    x = this.f5913a.mo9720x();
                } else {
                    return;
                }
            } while (x == i);
            this.f5916d = x;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: K */
    public final <T> T mo9758K(C2642y0<T> y0Var, C2611o oVar) throws IOException {
        mo9766S(3);
        return mo9762O(y0Var, oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo9750C() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo9759L(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.C2573e0.C2574a<K, V> r9, androidx.datastore.preferences.protobuf.C2611o r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.mo9766S(r0)
            androidx.datastore.preferences.protobuf.i r1 = r7.f5913a
            int r1 = r1.mo9721y()
            androidx.datastore.preferences.protobuf.i r2 = r7.f5913a
            int r1 = r2.mo9704h(r1)
            K r2 = r9.f5857b
            V r3 = r9.f5859d
        L_0x0014:
            int r4 = r7.mo9797z()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            androidx.datastore.preferences.protobuf.i r5 = r7.f5913a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo9702e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo9750C()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f5858c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f5859d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.mo9761N(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f5856a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.mo9761N(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo9750C()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            androidx.datastore.preferences.protobuf.i r8 = r7.f5913a
            r8.mo9703g(r1)
            return
        L_0x0065:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.i r9 = r7.f5913a
            r9.mo9703g(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2598j.mo9759L(java.util.Map, androidx.datastore.preferences.protobuf.e0$a, androidx.datastore.preferences.protobuf.o):void");
    }

    /* renamed from: M */
    public final <T> void mo9760M(List<T> list, C2642y0<T> y0Var, C2611o oVar) throws IOException {
        int x;
        int i = this.f5914b;
        if ((i & 7) == 3) {
            do {
                list.add(mo9762O(y0Var, oVar));
                if (!this.f5913a.mo9702e() && this.f5916d == 0) {
                    x = this.f5913a.mo9720x();
                } else {
                    return;
                }
            } while (x == i);
            this.f5916d = x;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: N */
    public final Object mo9761N(WireFormat$FieldType wireFormat$FieldType, Class<?> cls, C2611o oVar) throws IOException {
        switch (C2599a.f5917a[wireFormat$FieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo9772d());
            case 2:
                return mo9783n();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo9779j());
            case 5:
                return Integer.valueOf(mo9791t());
            case 6:
                return Long.valueOf(mo9769a());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo9784o());
            case 9:
                return Long.valueOf(mo9754G());
            case 10:
                mo9766S(2);
                return mo9763P(C2628u0.f5965c.mo9895a(cls), oVar);
            case 11:
                return Integer.valueOf(mo9751D());
            case 12:
                return Long.valueOf(mo9773e());
            case 13:
                return Integer.valueOf(mo9780k());
            case 14:
                return Long.valueOf(mo9795x());
            case 15:
                return mo9755H();
            case 16:
                return Integer.valueOf(mo9775g());
            case 17:
                return Long.valueOf(mo9787r());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: O */
    public final <T> T mo9762O(C2642y0<T> y0Var, C2611o oVar) throws IOException {
        int i = this.f5915c;
        this.f5915c = ((this.f5914b >>> 3) << 3) | 4;
        try {
            T newInstance = y0Var.newInstance();
            y0Var.mo9845g(newInstance, this, oVar);
            y0Var.mo9840b(newInstance);
            if (this.f5914b == this.f5915c) {
                return newInstance;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f5915c = i;
        }
    }

    /* renamed from: P */
    public final <T> T mo9763P(C2642y0<T> y0Var, C2611o oVar) throws IOException {
        int y = this.f5913a.mo9721y();
        C2592i iVar = this.f5913a;
        if (iVar.f5886a < iVar.f5887b) {
            int h = iVar.mo9704h(y);
            T newInstance = y0Var.newInstance();
            this.f5913a.f5886a++;
            y0Var.mo9845g(newInstance, this, oVar);
            y0Var.mo9840b(newInstance);
            this.f5913a.mo9700a(0);
            C2592i iVar2 = this.f5913a;
            iVar2.f5886a--;
            iVar2.mo9703g(h);
            return newInstance;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: Q */
    public final void mo9764Q(List<String> list, boolean z) throws IOException {
        int x;
        int x2;
        if ((this.f5914b & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        } else if (!(list instanceof C2548a0) || z) {
            do {
                list.add(z ? mo9755H() : mo9796y());
                if (!this.f5913a.mo9702e()) {
                    x = this.f5913a.mo9720x();
                } else {
                    return;
                }
            } while (x == this.f5914b);
            this.f5916d = x;
        } else {
            C2548a0 a0Var = (C2548a0) list;
            do {
                a0Var.mo9546c0(mo9783n());
                if (!this.f5913a.mo9702e()) {
                    x2 = this.f5913a.mo9720x();
                } else {
                    return;
                }
            } while (x2 == this.f5914b);
            this.f5916d = x2;
        }
    }

    /* renamed from: R */
    public final void mo9765R(int i) throws IOException {
        if (this.f5913a.mo9701d() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: S */
    public final void mo9766S(int i) throws IOException {
        if ((this.f5914b & 7) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* renamed from: T */
    public final void mo9767T(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: U */
    public final void mo9768U(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: a */
    public final long mo9769a() throws IOException {
        mo9766S(1);
        return this.f5913a.mo9710n();
    }

    /* renamed from: b */
    public final void mo9770b(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2629v) {
            C2629v vVar = (C2629v) list;
            int i = this.f5914b & 7;
            if (i == 2) {
                int y = this.f5913a.mo9721y();
                mo9767T(y);
                int d = this.f5913a.mo9701d() + y;
                do {
                    vVar.mo9897c(this.f5913a.mo9714r());
                } while (this.f5913a.mo9701d() < d);
            } else if (i == 5) {
                do {
                    vVar.mo9897c(this.f5913a.mo9714r());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 2) {
                int y2 = this.f5913a.mo9721y();
                mo9767T(y2);
                int d2 = this.f5913a.mo9701d() + y2;
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9714r()));
                } while (this.f5913a.mo9701d() < d2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9714r()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: c */
    public final void mo9771c(List<Long> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2564c0) {
            C2564c0 c0Var = (C2564c0) list;
            int i = this.f5914b & 7;
            if (i == 0) {
                do {
                    c0Var.mo9609c(this.f5913a.mo9717u());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int d = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    c0Var.mo9609c(this.f5913a.mo9717u());
                } while (this.f5913a.mo9701d() < d);
                mo9765R(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f5913a.mo9717u()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int d2 = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    list.add(Long.valueOf(this.f5913a.mo9717u()));
                } while (this.f5913a.mo9701d() < d2);
                mo9765R(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo9772d() throws IOException {
        mo9766S(0);
        return this.f5913a.mo9705i();
    }

    /* renamed from: e */
    public final long mo9773e() throws IOException {
        mo9766S(1);
        return this.f5913a.mo9715s();
    }

    /* renamed from: f */
    public final void mo9774f(List<Long> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2564c0) {
            C2564c0 c0Var = (C2564c0) list;
            int i = this.f5914b & 7;
            if (i == 0) {
                do {
                    c0Var.mo9609c(this.f5913a.mo9722z());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int d = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    c0Var.mo9609c(this.f5913a.mo9722z());
                } while (this.f5913a.mo9701d() < d);
                mo9765R(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f5913a.mo9722z()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int d2 = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    list.add(Long.valueOf(this.f5913a.mo9722z()));
                } while (this.f5913a.mo9701d() < d2);
                mo9765R(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: g */
    public final int mo9775g() throws IOException {
        mo9766S(0);
        return this.f5913a.mo9721y();
    }

    public final int getTag() {
        return this.f5914b;
    }

    /* renamed from: h */
    public final void mo9777h(List<Long> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2564c0) {
            C2564c0 c0Var = (C2564c0) list;
            int i = this.f5914b & 7;
            if (i == 0) {
                do {
                    c0Var.mo9609c(this.f5913a.mo9713q());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int d = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    c0Var.mo9609c(this.f5913a.mo9713q());
                } while (this.f5913a.mo9701d() < d);
                mo9765R(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f5913a.mo9713q()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int d2 = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    list.add(Long.valueOf(this.f5913a.mo9713q()));
                } while (this.f5913a.mo9701d() < d2);
                mo9765R(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: i */
    public final void mo9778i(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2629v) {
            C2629v vVar = (C2629v) list;
            int i = this.f5914b & 7;
            if (i == 0) {
                do {
                    vVar.mo9897c(this.f5913a.mo9708l());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int d = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    vVar.mo9897c(this.f5913a.mo9708l());
                } while (this.f5913a.mo9701d() < d);
                mo9765R(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9708l()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int d2 = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9708l()));
                } while (this.f5913a.mo9701d() < d2);
                mo9765R(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: j */
    public final int mo9779j() throws IOException {
        mo9766S(0);
        return this.f5913a.mo9708l();
    }

    /* renamed from: k */
    public final int mo9780k() throws IOException {
        mo9766S(0);
        return this.f5913a.mo9716t();
    }

    /* renamed from: l */
    public final void mo9781l(List<Boolean> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2576f) {
            C2576f fVar = (C2576f) list;
            int i = this.f5914b & 7;
            if (i == 0) {
                do {
                    fVar.mo9647c(this.f5913a.mo9705i());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int d = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    fVar.mo9647c(this.f5913a.mo9705i());
                } while (this.f5913a.mo9701d() < d);
                mo9765R(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f5913a.mo9705i()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int d2 = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    list.add(Boolean.valueOf(this.f5913a.mo9705i()));
                } while (this.f5913a.mo9701d() < d2);
                mo9765R(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: m */
    public final void mo9782m(List<String> list) throws IOException {
        mo9764Q(list, true);
    }

    /* renamed from: n */
    public final ByteString mo9783n() throws IOException {
        mo9766S(2);
        return this.f5913a.mo9706j();
    }

    /* renamed from: o */
    public final int mo9784o() throws IOException {
        mo9766S(0);
        return this.f5913a.mo9712p();
    }

    /* renamed from: p */
    public final void mo9785p(List<Long> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2564c0) {
            C2564c0 c0Var = (C2564c0) list;
            int i = this.f5914b & 7;
            if (i == 1) {
                do {
                    c0Var.mo9609c(this.f5913a.mo9710n());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int y = this.f5913a.mo9721y();
                mo9768U(y);
                int d = this.f5913a.mo9701d() + y;
                do {
                    c0Var.mo9609c(this.f5913a.mo9710n());
                } while (this.f5913a.mo9701d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f5913a.mo9710n()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int y2 = this.f5913a.mo9721y();
                mo9768U(y2);
                int d2 = this.f5913a.mo9701d() + y2;
                do {
                    list.add(Long.valueOf(this.f5913a.mo9710n()));
                } while (this.f5913a.mo9701d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: q */
    public final void mo9786q(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2629v) {
            C2629v vVar = (C2629v) list;
            int i = this.f5914b & 7;
            if (i == 0) {
                do {
                    vVar.mo9897c(this.f5913a.mo9716t());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int d = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    vVar.mo9897c(this.f5913a.mo9716t());
                } while (this.f5913a.mo9701d() < d);
                mo9765R(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9716t()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int d2 = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9716t()));
                } while (this.f5913a.mo9701d() < d2);
                mo9765R(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: r */
    public final long mo9787r() throws IOException {
        mo9766S(0);
        return this.f5913a.mo9722z();
    }

    public final double readDouble() throws IOException {
        mo9766S(1);
        return this.f5913a.mo9707k();
    }

    public final float readFloat() throws IOException {
        mo9766S(5);
        return this.f5913a.mo9711o();
    }

    /* renamed from: s */
    public final void mo9790s(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2629v) {
            C2629v vVar = (C2629v) list;
            int i = this.f5914b & 7;
            if (i == 0) {
                do {
                    vVar.mo9897c(this.f5913a.mo9721y());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int d = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    vVar.mo9897c(this.f5913a.mo9721y());
                } while (this.f5913a.mo9701d() < d);
                mo9765R(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9721y()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int d2 = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9721y()));
                } while (this.f5913a.mo9701d() < d2);
                mo9765R(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: t */
    public final int mo9791t() throws IOException {
        mo9766S(5);
        return this.f5913a.mo9709m();
    }

    /* renamed from: u */
    public final void mo9792u(List<Long> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2564c0) {
            C2564c0 c0Var = (C2564c0) list;
            int i = this.f5914b & 7;
            if (i == 1) {
                do {
                    c0Var.mo9609c(this.f5913a.mo9715s());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int y = this.f5913a.mo9721y();
                mo9768U(y);
                int d = this.f5913a.mo9701d() + y;
                do {
                    c0Var.mo9609c(this.f5913a.mo9715s());
                } while (this.f5913a.mo9701d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f5913a.mo9715s()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int y2 = this.f5913a.mo9721y();
                mo9768U(y2);
                int d2 = this.f5913a.mo9701d() + y2;
                do {
                    list.add(Long.valueOf(this.f5913a.mo9715s()));
                } while (this.f5913a.mo9701d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: v */
    public final void mo9793v(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2629v) {
            C2629v vVar = (C2629v) list;
            int i = this.f5914b & 7;
            if (i == 0) {
                do {
                    vVar.mo9897c(this.f5913a.mo9712p());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else if (i == 2) {
                int d = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    vVar.mo9897c(this.f5913a.mo9712p());
                } while (this.f5913a.mo9701d() < d);
                mo9765R(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9712p()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else if (i2 == 2) {
                int d2 = this.f5913a.mo9701d() + this.f5913a.mo9721y();
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9712p()));
                } while (this.f5913a.mo9701d() < d2);
                mo9765R(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: w */
    public final void mo9794w(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C2629v) {
            C2629v vVar = (C2629v) list;
            int i = this.f5914b & 7;
            if (i == 2) {
                int y = this.f5913a.mo9721y();
                mo9767T(y);
                int d = this.f5913a.mo9701d() + y;
                do {
                    vVar.mo9897c(this.f5913a.mo9709m());
                } while (this.f5913a.mo9701d() < d);
            } else if (i == 5) {
                do {
                    vVar.mo9897c(this.f5913a.mo9709m());
                    if (!this.f5913a.mo9702e()) {
                        x2 = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x2 == this.f5914b);
                this.f5916d = x2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f5914b & 7;
            if (i2 == 2) {
                int y2 = this.f5913a.mo9721y();
                mo9767T(y2);
                int d2 = this.f5913a.mo9701d() + y2;
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9709m()));
                } while (this.f5913a.mo9701d() < d2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f5913a.mo9709m()));
                    if (!this.f5913a.mo9702e()) {
                        x = this.f5913a.mo9720x();
                    } else {
                        return;
                    }
                } while (x == this.f5914b);
                this.f5916d = x;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: x */
    public final long mo9795x() throws IOException {
        mo9766S(0);
        return this.f5913a.mo9717u();
    }

    /* renamed from: y */
    public final String mo9796y() throws IOException {
        mo9766S(2);
        return this.f5913a.mo9718v();
    }

    /* renamed from: z */
    public final int mo9797z() throws IOException {
        int i = this.f5916d;
        if (i != 0) {
            this.f5914b = i;
            this.f5916d = 0;
        } else {
            this.f5914b = this.f5913a.mo9720x();
        }
        int i2 = this.f5914b;
        return (i2 == 0 || i2 == this.f5915c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2 >>> 3;
    }
}
