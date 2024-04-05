package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.C0608f;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class LazyGridDslKt$LazyVerticalGrid$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0800b $columns;
    public final /* synthetic */ C19857l<Object, C19394m> $content;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ C0608f $flingBehavior;
    public final /* synthetic */ C0718d.C0722d $horizontalArrangement;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyGridState $state;
    public final /* synthetic */ boolean $userScrollEnabled;
    public final /* synthetic */ C0718d.C0729k $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$LazyVerticalGrid$1(C0800b bVar, C1436d dVar, LazyGridState lazyGridState, C0759v vVar, boolean z, C0718d.C0729k kVar, C0718d.C0722d dVar2, C0608f fVar, boolean z2, C19857l<Object, C19394m> lVar, int i, int i2) {
        super(2);
        this.$columns = bVar;
        this.$modifier = dVar;
        this.$state = lazyGridState;
        this.$contentPadding = vVar;
        this.$reverseLayout = z;
        this.$verticalArrangement = kVar;
        this.$horizontalArrangement = dVar2;
        this.$flingBehavior = fVar;
        this.$userScrollEnabled = z2;
        this.$content = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            androidx.compose.foundation.lazy.grid.b r2 = r0.$columns
            androidx.compose.ui.d r1 = r0.$modifier
            androidx.compose.foundation.lazy.grid.LazyGridState r3 = r0.$state
            androidx.compose.foundation.layout.v r4 = r0.$contentPadding
            boolean r5 = r0.$reverseLayout
            androidx.compose.foundation.layout.d$k r6 = r0.$verticalArrangement
            androidx.compose.foundation.layout.d$d r7 = r0.$horizontalArrangement
            androidx.compose.foundation.gestures.f r8 = r0.$flingBehavior
            boolean r9 = r0.$userScrollEnabled
            kq.l<java.lang.Object, kotlin.m> r15 = r0.$content
            int r10 = r0.$$changed
            r11 = 1
            r14 = r10 | 1
            int r13 = r0.$$default
            java.lang.String r10 = "columns"
            kotlin.jvm.internal.C19383o.m32797g(r2, r10)
            java.lang.String r10 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r10)
            r10 = 1485410512(0x588990d0, float:1.21004046E15)
            r12 = r30
            androidx.compose.runtime.ComposerImpl r12 = r12.mo5440h(r10)
            r10 = r13 & 1
            if (r10 == 0) goto L_0x0037
            r10 = r14 | 6
            goto L_0x0047
        L_0x0037:
            r10 = r14 & 14
            if (r10 != 0) goto L_0x0046
            boolean r10 = r12.mo5408I(r2)
            if (r10 == 0) goto L_0x0043
            r10 = 4
            goto L_0x0044
        L_0x0043:
            r10 = 2
        L_0x0044:
            r10 = r10 | r14
            goto L_0x0047
        L_0x0046:
            r10 = r14
        L_0x0047:
            r16 = r13 & 2
            if (r16 == 0) goto L_0x004e
            r10 = r10 | 48
            goto L_0x005f
        L_0x004e:
            r17 = r14 & 112(0x70, float:1.57E-43)
            if (r17 != 0) goto L_0x005f
            boolean r17 = r12.mo5408I(r1)
            if (r17 == 0) goto L_0x005b
            r17 = 32
            goto L_0x005d
        L_0x005b:
            r17 = 16
        L_0x005d:
            r10 = r10 | r17
        L_0x005f:
            r11 = r14 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0073
            r11 = r13 & 4
            if (r11 != 0) goto L_0x0070
            boolean r11 = r12.mo5408I(r3)
            if (r11 == 0) goto L_0x0070
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0072
        L_0x0070:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r10 = r10 | r11
        L_0x0073:
            r11 = r13 & 8
            if (r11 == 0) goto L_0x007a
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            goto L_0x008b
        L_0x007a:
            r0 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x008b
            boolean r0 = r12.mo5408I(r4)
            if (r0 == 0) goto L_0x0087
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r0 = r0 | r10
            goto L_0x008c
        L_0x008b:
            r0 = r10
        L_0x008c:
            r10 = r13 & 16
            r17 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x0096
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a7
        L_0x0096:
            r18 = r14 & r17
            if (r18 != 0) goto L_0x00a7
            boolean r18 = r12.mo5427a(r5)
            if (r18 == 0) goto L_0x00a3
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a3:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r0 = r0 | r18
        L_0x00a7:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r14 & r18
            if (r18 != 0) goto L_0x00be
            r18 = r13 & 32
            if (r18 != 0) goto L_0x00ba
            boolean r18 = r12.mo5408I(r6)
            if (r18 == 0) goto L_0x00ba
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r0 = r0 | r18
        L_0x00be:
            r18 = r13 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00c7
            r20 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00d6
        L_0x00c7:
            r20 = r14 & r19
            if (r20 != 0) goto L_0x00d8
            boolean r20 = r12.mo5408I(r7)
            if (r20 == 0) goto L_0x00d4
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r0 = r0 | r20
        L_0x00d8:
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r21 = r14 & r20
            if (r21 != 0) goto L_0x00f1
            r21 = r1
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x00ed
            boolean r1 = r12.mo5408I(r8)
            if (r1 == 0) goto L_0x00ed
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ef
        L_0x00ed:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ef:
            r0 = r0 | r1
            goto L_0x00f3
        L_0x00f1:
            r21 = r1
        L_0x00f3:
            r1 = r13 & 256(0x100, float:3.59E-43)
            r22 = 234881024(0xe000000, float:1.5777218E-30)
            if (r1 == 0) goto L_0x00fc
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            goto L_0x010b
        L_0x00fc:
            r23 = r14 & r22
            if (r23 != 0) goto L_0x010d
            boolean r23 = r12.mo5427a(r9)
            if (r23 == 0) goto L_0x0109
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r0 = r0 | r23
        L_0x010d:
            r23 = r3
            r3 = r13 & 512(0x200, float:7.175E-43)
            r24 = 1879048192(0x70000000, float:1.58456325E29)
            if (r3 == 0) goto L_0x0118
            r3 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x0127
        L_0x0118:
            r3 = r14 & r24
            if (r3 != 0) goto L_0x0128
            boolean r3 = r12.mo5408I(r15)
            if (r3 == 0) goto L_0x0125
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0127
        L_0x0125:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0127:
            r0 = r0 | r3
        L_0x0128:
            r3 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r3 & r0
            r25 = r4
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r4) goto L_0x0152
            boolean r3 = r12.mo5442i()
            if (r3 != 0) goto L_0x013a
            goto L_0x0152
        L_0x013a:
            r12.mo5396C()
            r10 = r9
            r26 = r13
            r27 = r14
            r28 = r15
            r3 = r21
            r4 = r23
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r25
            r25 = r12
            goto L_0x0254
        L_0x0152:
            r12.mo5466u0()
            r3 = r14 & 1
            r26 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = 0
            if (r3 == 0) goto L_0x0182
            boolean r3 = r12.mo5425Y()
            if (r3 == 0) goto L_0x0164
            goto L_0x0182
        L_0x0164:
            r12.mo5396C()
            r1 = r13 & 4
            if (r1 == 0) goto L_0x016d
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x016d:
            r1 = r13 & 32
            if (r1 == 0) goto L_0x0173
            r0 = r0 & r26
        L_0x0173:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x017b
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r1
        L_0x017b:
            r1 = r21
            r3 = r23
            r4 = r25
            goto L_0x01c9
        L_0x0182:
            if (r16 == 0) goto L_0x0187
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0189
        L_0x0187:
            r3 = r21
        L_0x0189:
            r16 = r13 & 4
            if (r16 == 0) goto L_0x0194
            androidx.compose.foundation.lazy.grid.LazyGridState r16 = androidx.compose.foundation.lazy.grid.C0817s.m1852a(r12)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0196
        L_0x0194:
            r16 = r23
        L_0x0196:
            if (r11 == 0) goto L_0x019f
            float r11 = (float) r4
            androidx.compose.foundation.layout.w r4 = new androidx.compose.foundation.layout.w
            r4.<init>(r11, r11, r11, r11)
            goto L_0x01a1
        L_0x019f:
            r4 = r25
        L_0x01a1:
            if (r10 == 0) goto L_0x01a4
            r5 = 0
        L_0x01a4:
            r10 = r13 & 32
            if (r10 == 0) goto L_0x01b3
            androidx.compose.foundation.layout.d$i r6 = androidx.compose.foundation.layout.C0718d.f1476a
            if (r5 != 0) goto L_0x01af
            androidx.compose.foundation.layout.d$j r6 = androidx.compose.foundation.layout.C0718d.f1478c
            goto L_0x01b1
        L_0x01af:
            androidx.compose.foundation.layout.d$a r6 = androidx.compose.foundation.layout.C0718d.f1479d
        L_0x01b1:
            r0 = r0 & r26
        L_0x01b3:
            if (r18 == 0) goto L_0x01b7
            androidx.compose.foundation.layout.d$i r7 = androidx.compose.foundation.layout.C0718d.f1476a
        L_0x01b7:
            r10 = r13 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x01c3
            androidx.compose.foundation.gestures.a r8 = kotlin.reflect.C19421p.m32919I(r12)
            r10 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r10
        L_0x01c3:
            if (r1 == 0) goto L_0x01c6
            r9 = 1
        L_0x01c6:
            r1 = r3
            r3 = r16
        L_0x01c9:
            r12.mo5419S()
            int r10 = r0 >> 3
            r11 = -1355301804(0xffffffffaf37bc54, float:-1.671066E-10)
            r12.mo5465u(r11)
            r11 = 1618982084(0x607fb4c4, float:7.370227E19)
            r12.mo5465u(r11)
            boolean r11 = r12.mo5408I(r2)
            boolean r16 = r12.mo5408I(r7)
            r11 = r11 | r16
            boolean r16 = r12.mo5408I(r4)
            r11 = r11 | r16
            r16 = r13
            java.lang.Object r13 = r12.mo5431c0()
            if (r11 != 0) goto L_0x01f6
            androidx.compose.runtime.d$a$a r11 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r13 != r11) goto L_0x01fe
        L_0x01f6:
            androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1 r13 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
            r13.<init>(r4, r2, r7)
            r12.mo5407H0(r13)
        L_0x01fe:
            r11 = 0
            r12.mo5418R(r11)
            kq.p r13 = (p753kq.C19861p) r13
            r12.mo5418R(r11)
            r11 = 196608(0x30000, float:2.75506E-40)
            r18 = r10 & 14
            r11 = r18 | r11
            r18 = r10 & 112(0x70, float:1.57E-43)
            r11 = r11 | r18
            r30 = r12
            r12 = r0 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = r0 & r17
            r11 = r11 | r12
            r12 = r10 & r19
            r11 = r11 | r12
            r10 = r10 & r20
            r10 = r10 | r11
            int r11 = r0 << 9
            r12 = r11 & r22
            r10 = r10 | r12
            r11 = r11 & r24
            r22 = r10 | r11
            int r0 = r0 >> 27
            r23 = r0 & 14
            r24 = 0
            r0 = 1
            r10 = r1
            r11 = r3
            r25 = r30
            r12 = r13
            r26 = r16
            r13 = r4
            r27 = r14
            r14 = r5
            r28 = r15
            r15 = r0
            r16 = r8
            r17 = r9
            r18 = r6
            r19 = r7
            r20 = r28
            r21 = r25
            androidx.compose.foundation.lazy.grid.LazyGridKt.m1811a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r1
        L_0x0254:
            androidx.compose.runtime.v0 r0 = r25.mo5421U()
            if (r0 != 0) goto L_0x025b
            goto L_0x0269
        L_0x025b:
            androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1 r14 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
            r1 = r14
            r11 = r28
            r12 = r27
            r13 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.f3081d = r14
        L_0x0269:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1.invoke(androidx.compose.runtime.d, int):void");
    }
}
