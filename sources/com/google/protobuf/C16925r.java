package com.google.protobuf;

import com.google.protobuf.C16906j0;
import com.google.protobuf.C16925r.C16927b;
import com.google.protobuf.C16935v;
import com.google.protobuf.C16944w;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.r */
public final class C16925r<T extends C16927b<T>> {

    /* renamed from: d */
    public static final C16925r f37283d = new C16925r(0);

    /* renamed from: a */
    public final C16953z0<T, Object> f37284a;

    /* renamed from: b */
    public boolean f37285b;

    /* renamed from: c */
    public boolean f37286c;

    /* renamed from: com.google.protobuf.r$a */
    public static /* synthetic */ class C16926a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37287a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f37288b;

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
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat$FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37288b = r0
                r1 = 1
                com.google.protobuf.WireFormat$FieldType r2 = com.google.protobuf.WireFormat$FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f37288b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r3 = com.google.protobuf.WireFormat$FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f37288b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r4 = com.google.protobuf.WireFormat$FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f37288b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r5 = com.google.protobuf.WireFormat$FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f37288b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r6 = com.google.protobuf.WireFormat$FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f37288b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r7 = com.google.protobuf.WireFormat$FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f37288b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r8 = com.google.protobuf.WireFormat$FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f37288b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r9 = com.google.protobuf.WireFormat$FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f37288b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f37288b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f37288b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f37288b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f37288b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f37288b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f37288b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f37288b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f37288b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f37288b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat$FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.WireFormat$JavaType[] r9 = com.google.protobuf.WireFormat$JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f37287a = r9
                com.google.protobuf.WireFormat$JavaType r10 = com.google.protobuf.WireFormat$JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f37287a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.WireFormat$JavaType r9 = com.google.protobuf.WireFormat$JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f37287a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f37287a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f37287a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f37287a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f37287a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f37287a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f37287a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat$JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16925r.C16926a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.r$b */
    public interface C16927b<T extends C16927b<T>> extends Comparable<T> {
        /* renamed from: A */
        void mo59762A();

        /* renamed from: b */
        GeneratedMessageLite.C16838a mo59763b(C16906j0.C16907a aVar, C16906j0 j0Var);

        void getNumber();

        /* renamed from: x */
        void mo59766x();

        /* renamed from: y */
        void mo59767y();

        /* renamed from: z */
        WireFormat$JavaType mo59768z();
    }

    public C16925r() {
        int i = C16953z0.f37318i;
        this.f37284a = new C16951y0(16);
    }

    /* renamed from: b */
    public static int m28362b(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int u = CodedOutputStream.m27896u(i);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            u *= 2;
        }
        return m28363c(wireFormat$FieldType, obj) + u;
    }

    /* renamed from: c */
    public static int m28363c(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (C16926a.f37288b[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f37140b;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f37140b;
                return 4;
            case 3:
                return CodedOutputStream.m27900y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m27900y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m27887l(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f37140b;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.f37140b;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.f37140b;
                return 1;
            case 9:
                Logger logger6 = CodedOutputStream.f37140b;
                return ((C16906j0) obj).mo59745b();
            case 10:
                if (obj instanceof C16944w) {
                    return CodedOutputStream.m27889n((C16944w) obj);
                }
                Logger logger7 = CodedOutputStream.f37140b;
                int b = ((C16906j0) obj).mo59745b();
                return CodedOutputStream.m27898w(b) + b;
            case 11:
                if (!(obj instanceof ByteString)) {
                    return CodedOutputStream.m27895t((String) obj);
                }
                Logger logger8 = CodedOutputStream.f37140b;
                int size = ((ByteString) obj).size();
                return CodedOutputStream.m27898w(size) + size;
            case 12:
                if (obj instanceof ByteString) {
                    Logger logger9 = CodedOutputStream.f37140b;
                    int size2 = ((ByteString) obj).size();
                    return CodedOutputStream.m27898w(size2) + size2;
                }
                Logger logger10 = CodedOutputStream.f37140b;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.m27898w(length) + length;
            case 13:
                return CodedOutputStream.m27898w(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = CodedOutputStream.f37140b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = CodedOutputStream.f37140b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.m27898w((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.m27900y((longValue >> 63) ^ (longValue << 1));
            case 18:
                return obj instanceof C16935v.C16936a ? CodedOutputStream.m27887l(((C16935v.C16936a) obj).getNumber()) : CodedOutputStream.m27887l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static int m28364d(C16927b<?> bVar, Object obj) {
        bVar.mo59767y();
        bVar.getNumber();
        bVar.mo59766x();
        return m28362b((WireFormat$FieldType) null, 0, obj);
    }

    /* renamed from: f */
    public static int m28365f(Map.Entry entry) {
        C16927b bVar = (C16927b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.mo59768z() != WireFormat$JavaType.MESSAGE) {
            return m28364d(bVar, value);
        }
        bVar.mo59766x();
        bVar.mo59762A();
        if (value instanceof C16944w) {
            ((C16927b) entry.getKey()).getNumber();
            return CodedOutputStream.m27889n((C16944w) value) + CodedOutputStream.m27896u(3) + CodedOutputStream.m27897v(2, 0) + (CodedOutputStream.m27896u(1) * 2);
        }
        ((C16927b) entry.getKey()).getNumber();
        int v = CodedOutputStream.m27897v(2, 0) + (CodedOutputStream.m27896u(1) * 2);
        int u = CodedOutputStream.m27896u(3);
        int b = ((C16906j0) value).mo59745b();
        return CodedOutputStream.m27898w(b) + b + u + v;
    }

    /* renamed from: j */
    public static <T extends C16927b<T>> boolean m28366j(Map.Entry<T, Object> entry) {
        C16927b bVar = (C16927b) entry.getKey();
        if (bVar.mo59768z() == WireFormat$JavaType.MESSAGE) {
            bVar.mo59766x();
            Object value = entry.getValue();
            if (value instanceof C16906j0) {
                if (!((C16906j0) value).mo59748f()) {
                    return false;
                }
            } else if (value instanceof C16944w) {
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
        if ((r2 instanceof com.google.protobuf.C16944w) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if ((r2 instanceof com.google.protobuf.C16935v.C16936a) == false) goto L_0x0044;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m28367n(com.google.protobuf.WireFormat$FieldType r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = com.google.protobuf.C16935v.f37301a
            r2.getClass()
            int[] r0 = com.google.protobuf.C16925r.C16926a.f37287a
            com.google.protobuf.WireFormat$JavaType r1 = r1.getJavaType()
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
            boolean r1 = r2 instanceof com.google.protobuf.C16906j0
            if (r1 != 0) goto L_0x0030
            boolean r1 = r2 instanceof com.google.protobuf.C16944w
            if (r1 == 0) goto L_0x0044
            goto L_0x0030
        L_0x001f:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x0030
            boolean r1 = r2 instanceof com.google.protobuf.C16935v.C16936a
            if (r1 == 0) goto L_0x0044
            goto L_0x0030
        L_0x0028:
            boolean r1 = r2 instanceof com.google.protobuf.ByteString
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16925r.m28367n(com.google.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    /* renamed from: o */
    public static void m28368o(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            codedOutputStream.mo59726Q(i, 3);
            ((C16906j0) obj).mo59753m(codedOutputStream);
            codedOutputStream.mo59726Q(i, 4);
            return;
        }
        codedOutputStream.mo59726Q(i, wireFormat$FieldType.getWireType());
        switch (C16926a.f37288b[wireFormat$FieldType.ordinal()]) {
            case 1:
                codedOutputStream.mo59717H(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 2:
                codedOutputStream.mo59715F(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 3:
                codedOutputStream.mo59730U(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo59730U(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo59719J(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo59717H(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo59715F(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo59731z(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 9:
                ((C16906j0) obj).mo59753m(codedOutputStream);
                return;
            case 10:
                codedOutputStream.mo59721L((C16906j0) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo59713D((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo59725P((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo59713D((ByteString) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.mo59711B(bArr.length, bArr);
                return;
            case 13:
                codedOutputStream.mo59728S(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.mo59715F(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo59717H(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.mo59728S((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.mo59730U((longValue >> 63) ^ (longValue << 1));
                return;
            case 18:
                if (obj instanceof C16935v.C16936a) {
                    codedOutputStream.mo59719J(((C16935v.C16936a) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.mo59719J(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public final C16925r<T> clone() {
        C16925r<T> rVar = new C16925r<>();
        for (int i = 0; i < this.f37284a.mo60081d(); i++) {
            Map.Entry<T, Object> c = this.f37284a.mo60078c(i);
            rVar.mo60029m((C16927b) c.getKey(), c.getValue());
        }
        for (Map.Entry next : this.f37284a.mo60082e()) {
            rVar.mo60029m((C16927b) next.getKey(), next.getValue());
        }
        rVar.f37286c = this.f37286c;
        return rVar;
    }

    /* renamed from: e */
    public final Object mo60021e(T t) {
        Object obj = this.f37284a.get(t);
        return obj instanceof C16944w ? ((C16944w) obj).mo60068a((C16906j0) null) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16925r)) {
            return false;
        }
        return this.f37284a.equals(((C16925r) obj).f37284a);
    }

    /* renamed from: g */
    public final int mo60023g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f37284a.mo60081d(); i2++) {
            Map.Entry<T, Object> c = this.f37284a.mo60078c(i2);
            i += m28364d((C16927b) c.getKey(), c.getValue());
        }
        for (Map.Entry next : this.f37284a.mo60082e()) {
            i += m28364d((C16927b) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: h */
    public final boolean mo60024h() {
        return this.f37284a.isEmpty();
    }

    public final int hashCode() {
        return this.f37284a.hashCode();
    }

    /* renamed from: i */
    public final boolean mo60026i() {
        for (int i = 0; i < this.f37284a.mo60081d(); i++) {
            if (!m28366j(this.f37284a.mo60078c(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> j : this.f37284a.mo60082e()) {
            if (!m28366j(j)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final Iterator<Map.Entry<T, Object>> mo60027k() {
        return this.f37286c ? new C16944w.C16946b(this.f37284a.entrySet().iterator()) : this.f37284a.entrySet().iterator();
    }

    /* renamed from: l */
    public final void mo60028l(Map.Entry<T, Object> entry) {
        C16927b bVar = (C16927b) entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof C16944w) {
            value = ((C16944w) value).mo60068a((C16906j0) null);
        }
        bVar.mo59766x();
        if (bVar.mo59768z() == WireFormat$JavaType.MESSAGE) {
            Object e = mo60021e(bVar);
            if (e == null) {
                C16953z0<T, Object> z0Var = this.f37284a;
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                z0Var.put(bVar, value);
                return;
            }
            this.f37284a.put(bVar, bVar.mo59763b(((C16906j0) e).mo59750h(), (C16906j0) value).mo59759s());
            return;
        }
        C16953z0<T, Object> z0Var2 = this.f37284a;
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        z0Var2.put(bVar, value);
    }

    /* renamed from: m */
    public final void mo60029m(T t, Object obj) {
        t.mo59766x();
        t.mo59767y();
        m28367n((WireFormat$FieldType) null, obj);
        if (obj instanceof C16944w) {
            this.f37286c = true;
        }
        this.f37284a.put(t, obj);
    }

    public C16925r(int i) {
        int i2 = C16953z0.f37318i;
        C16951y0 y0Var = new C16951y0(0);
        this.f37284a = y0Var;
        if (!this.f37285b) {
            y0Var.mo60074g();
            this.f37285b = true;
        }
        if (!this.f37285b) {
            y0Var.mo60074g();
            this.f37285b = true;
        }
    }
}
