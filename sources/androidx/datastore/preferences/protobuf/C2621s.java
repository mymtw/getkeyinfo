package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2602k0;
import androidx.datastore.preferences.protobuf.C2621s.C2623b;
import androidx.datastore.preferences.protobuf.C2631w;
import androidx.datastore.preferences.protobuf.C2637x;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.s */
public final class C2621s<T extends C2623b<T>> {

    /* renamed from: d */
    public static final C2621s f5956d = new C2621s(0);

    /* renamed from: a */
    public final C2554b1<T, Object> f5957a;

    /* renamed from: b */
    public boolean f5958b;

    /* renamed from: c */
    public boolean f5959c;

    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    public static /* synthetic */ class C2622a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5960a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f5961b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5961b = r0
                r1 = 1
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r2 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5961b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r3 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f5961b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f5961b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r5 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f5961b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f5961b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r7 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f5961b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r8 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f5961b     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r9 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f5961b     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f5961b     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f5961b     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f5961b     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f5961b     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f5961b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f5961b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f5961b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f5961b     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f5961b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat$FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                androidx.datastore.preferences.protobuf.WireFormat$JavaType[] r9 = androidx.datastore.preferences.protobuf.WireFormat$JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f5960a = r9
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r10 = androidx.datastore.preferences.protobuf.WireFormat$JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f5960a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r9 = androidx.datastore.preferences.protobuf.WireFormat$JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f5960a     // Catch:{ NoSuchFieldError -> 0x00fd }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat$JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f5960a     // Catch:{ NoSuchFieldError -> 0x0107 }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat$JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f5960a     // Catch:{ NoSuchFieldError -> 0x0111 }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat$JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f5960a     // Catch:{ NoSuchFieldError -> 0x011b }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat$JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f5960a     // Catch:{ NoSuchFieldError -> 0x0125 }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat$JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f5960a     // Catch:{ NoSuchFieldError -> 0x012f }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat$JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f5960a     // Catch:{ NoSuchFieldError -> 0x0139 }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat$JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2621s.C2622a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface C2623b<T extends C2623b<T>> extends Comparable<T> {
        /* renamed from: A */
        void mo9477A();

        /* renamed from: P */
        GeneratedMessageLite.C2521a mo9478P(C2602k0.C2603a aVar, C2602k0 k0Var);

        void getNumber();

        /* renamed from: x */
        void mo9481x();

        /* renamed from: y */
        void mo9482y();

        /* renamed from: z */
        WireFormat$JavaType mo9483z();
    }

    public C2621s() {
        int i = C2554b1.f5819i;
        this.f5957a = new C2549a1(16);
    }

    /* renamed from: b */
    public static int m6245b(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int u = CodedOutputStream.m5515u(i);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            u *= 2;
        }
        return m6246c(wireFormat$FieldType, obj) + u;
    }

    /* renamed from: c */
    public static int m6246c(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (C2622a.f5961b[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f5781b;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f5781b;
                return 4;
            case 3:
                return CodedOutputStream.m5519y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m5519y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m5506l(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f5781b;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.f5781b;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.f5781b;
                return 1;
            case 9:
                Logger logger6 = CodedOutputStream.f5781b;
                return ((C2602k0) obj).mo9461b();
            case 10:
                if (obj instanceof C2637x) {
                    return CodedOutputStream.m5508n((C2637x) obj);
                }
                Logger logger7 = CodedOutputStream.f5781b;
                int b = ((C2602k0) obj).mo9461b();
                return CodedOutputStream.m5517w(b) + b;
            case 11:
                if (!(obj instanceof ByteString)) {
                    return CodedOutputStream.m5514t((String) obj);
                }
                Logger logger8 = CodedOutputStream.f5781b;
                int size = ((ByteString) obj).size();
                return CodedOutputStream.m5517w(size) + size;
            case 12:
                if (obj instanceof ByteString) {
                    Logger logger9 = CodedOutputStream.f5781b;
                    int size2 = ((ByteString) obj).size();
                    return CodedOutputStream.m5517w(size2) + size2;
                }
                Logger logger10 = CodedOutputStream.f5781b;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.m5517w(length) + length;
            case 13:
                return CodedOutputStream.m5517w(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = CodedOutputStream.f5781b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = CodedOutputStream.f5781b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.m5517w((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.m5519y((longValue >> 63) ^ (longValue << 1));
            case 18:
                return obj instanceof C2631w.C2632a ? CodedOutputStream.m5506l(((C2631w.C2632a) obj).getNumber()) : CodedOutputStream.m5506l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static int m6247d(C2623b<?> bVar, Object obj) {
        bVar.mo9482y();
        bVar.getNumber();
        bVar.mo9481x();
        return m6245b((WireFormat$FieldType) null, 0, obj);
    }

    /* renamed from: f */
    public static int m6248f(Map.Entry entry) {
        C2623b bVar = (C2623b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.mo9483z() != WireFormat$JavaType.MESSAGE) {
            return m6247d(bVar, value);
        }
        bVar.mo9481x();
        bVar.mo9477A();
        if (value instanceof C2637x) {
            ((C2623b) entry.getKey()).getNumber();
            return CodedOutputStream.m5508n((C2637x) value) + CodedOutputStream.m5515u(3) + CodedOutputStream.m5516v(2, 0) + (CodedOutputStream.m5515u(1) * 2);
        }
        ((C2623b) entry.getKey()).getNumber();
        int v = CodedOutputStream.m5516v(2, 0) + (CodedOutputStream.m5515u(1) * 2);
        int u = CodedOutputStream.m5515u(3);
        int b = ((C2602k0) value).mo9461b();
        return CodedOutputStream.m5517w(b) + b + u + v;
    }

    /* renamed from: j */
    public static <T extends C2623b<T>> boolean m6249j(Map.Entry<T, Object> entry) {
        C2623b bVar = (C2623b) entry.getKey();
        if (bVar.mo9483z() == WireFormat$JavaType.MESSAGE) {
            bVar.mo9481x();
            Object value = entry.getValue();
            if (value instanceof C2602k0) {
                if (!((C2602k0) value).mo9465f()) {
                    return false;
                }
            } else if (value instanceof C2637x) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ((r2 instanceof androidx.datastore.preferences.protobuf.C2637x) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if ((r2 instanceof androidx.datastore.preferences.protobuf.C2631w.C2632a) == false) goto L_0x0044;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6250n(androidx.datastore.preferences.protobuf.WireFormat$FieldType r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = androidx.datastore.preferences.protobuf.C2631w.f5973a
            r2.getClass()
            int[] r0 = androidx.datastore.preferences.protobuf.C2621s.C2622a.f5960a
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = r1.getJavaType()
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 0
            switch(r1) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0044
        L_0x0016:
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.C2602k0
            if (r1 != 0) goto L_0x0030
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.C2637x
            if (r1 == 0) goto L_0x0044
            goto L_0x0030
        L_0x001f:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x0030
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.C2631w.C2632a
            if (r1 == 0) goto L_0x0044
            goto L_0x0030
        L_0x0028:
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r1 != 0) goto L_0x0030
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L_0x0044
        L_0x0030:
            r1 = 1
            r0 = r1
            goto L_0x0044
        L_0x0033:
            boolean r0 = r2 instanceof java.lang.String
            goto L_0x0044
        L_0x0036:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0039:
            boolean r0 = r2 instanceof java.lang.Double
            goto L_0x0044
        L_0x003c:
            boolean r0 = r2 instanceof java.lang.Float
            goto L_0x0044
        L_0x003f:
            boolean r0 = r2 instanceof java.lang.Long
            goto L_0x0044
        L_0x0042:
            boolean r0 = r2 instanceof java.lang.Integer
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2621s.m6250n(androidx.datastore.preferences.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    /* renamed from: o */
    public static void m6251o(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            codedOutputStream.mo9432R(i, 3);
            ((C2602k0) obj).mo9469j(codedOutputStream);
            codedOutputStream.mo9432R(i, 4);
            return;
        }
        codedOutputStream.mo9432R(i, wireFormat$FieldType.getWireType());
        switch (C2622a.f5961b[wireFormat$FieldType.ordinal()]) {
            case 1:
                codedOutputStream.mo9423I(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 2:
                codedOutputStream.mo9421G(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 3:
                codedOutputStream.mo9436V(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo9436V(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo9425K(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo9423I(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo9421G(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo9415A(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 9:
                ((C2602k0) obj).mo9469j(codedOutputStream);
                return;
            case 10:
                codedOutputStream.mo9427M((C2602k0) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo9419E((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo9431Q((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo9419E((ByteString) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.mo9417C(bArr.length, bArr);
                return;
            case 13:
                codedOutputStream.mo9434T(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.mo9421G(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo9423I(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.mo9434T((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.mo9436V((longValue >> 63) ^ (longValue << 1));
                return;
            case 18:
                if (obj instanceof C2631w.C2632a) {
                    codedOutputStream.mo9425K(((C2631w.C2632a) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.mo9425K(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public final C2621s<T> clone() {
        C2621s<T> sVar = new C2621s<>();
        for (int i = 0; i < this.f5957a.mo9560d(); i++) {
            Map.Entry<T, Object> c = this.f5957a.mo9557c(i);
            sVar.mo9886m((C2623b) c.getKey(), c.getValue());
        }
        for (Map.Entry next : this.f5957a.mo9561e()) {
            sVar.mo9886m((C2623b) next.getKey(), next.getValue());
        }
        sVar.f5959c = this.f5959c;
        return sVar;
    }

    /* renamed from: e */
    public final Object mo9878e(T t) {
        Object obj = this.f5957a.get(t);
        return obj instanceof C2637x ? ((C2637x) obj).mo9921a((C2602k0) null) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2621s)) {
            return false;
        }
        return this.f5957a.equals(((C2621s) obj).f5957a);
    }

    /* renamed from: g */
    public final int mo9880g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f5957a.mo9560d(); i2++) {
            Map.Entry<T, Object> c = this.f5957a.mo9557c(i2);
            i += m6247d((C2623b) c.getKey(), c.getValue());
        }
        for (Map.Entry next : this.f5957a.mo9561e()) {
            i += m6247d((C2623b) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: h */
    public final boolean mo9881h() {
        return this.f5957a.isEmpty();
    }

    public final int hashCode() {
        return this.f5957a.hashCode();
    }

    /* renamed from: i */
    public final boolean mo9883i() {
        for (int i = 0; i < this.f5957a.mo9560d(); i++) {
            if (!m6249j(this.f5957a.mo9557c(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> j : this.f5957a.mo9561e()) {
            if (!m6249j(j)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final Iterator<Map.Entry<T, Object>> mo9884k() {
        return this.f5959c ? new C2637x.C2639b(this.f5957a.entrySet().iterator()) : this.f5957a.entrySet().iterator();
    }

    /* renamed from: l */
    public final void mo9885l(Map.Entry<T, Object> entry) {
        C2623b bVar = (C2623b) entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof C2637x) {
            value = ((C2637x) value).mo9921a((C2602k0) null);
        }
        bVar.mo9481x();
        if (bVar.mo9483z() == WireFormat$JavaType.MESSAGE) {
            Object e = mo9878e(bVar);
            if (e == null) {
                C2554b1<T, Object> b1Var = this.f5957a;
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                b1Var.put(bVar, value);
                return;
            }
            this.f5957a.put(bVar, bVar.mo9478P(((C2602k0) e).mo9466h(), (C2602k0) value).mo9474l());
            return;
        }
        C2554b1<T, Object> b1Var2 = this.f5957a;
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        b1Var2.put(bVar, value);
    }

    /* renamed from: m */
    public final void mo9886m(T t, Object obj) {
        t.mo9481x();
        t.mo9482y();
        m6250n((WireFormat$FieldType) null, obj);
        if (obj instanceof C2637x) {
            this.f5959c = true;
        }
        this.f5957a.put(t, obj);
    }

    public C2621s(int i) {
        int i2 = C2554b1.f5819i;
        C2549a1 a1Var = new C2549a1(0);
        this.f5957a = a1Var;
        if (!this.f5958b) {
            a1Var.mo9550g();
            this.f5958b = true;
        }
        if (!this.f5958b) {
            a1Var.mo9550g();
            this.f5958b = true;
        }
    }
}
