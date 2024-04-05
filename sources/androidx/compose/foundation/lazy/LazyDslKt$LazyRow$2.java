package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.C0608f;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class LazyDslKt$LazyRow$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19857l<C0859r, C19394m> $content;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ C0608f $flingBehavior;
    public final /* synthetic */ C0718d.C0722d $horizontalArrangement;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ C1428a.C1431c $verticalAlignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$LazyRow$2(C1436d dVar, LazyListState lazyListState, C0759v vVar, boolean z, C0718d.C0722d dVar2, C1428a.C1431c cVar, C0608f fVar, C19857l<? super C0859r, C19394m> lVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$state = lazyListState;
        this.$contentPadding = vVar;
        this.$reverseLayout = z;
        this.$horizontalArrangement = dVar2;
        this.$verticalAlignment = cVar;
        this.$flingBehavior = fVar;
        this.$content = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            androidx.compose.ui.d r1 = r0.$modifier
            androidx.compose.foundation.lazy.LazyListState r2 = r0.$state
            androidx.compose.foundation.layout.v r3 = r0.$contentPadding
            boolean r4 = r0.$reverseLayout
            androidx.compose.foundation.layout.d$d r5 = r0.$horizontalArrangement
            androidx.compose.ui.a$c r6 = r0.$verticalAlignment
            androidx.compose.foundation.gestures.f r7 = r0.$flingBehavior
            kq.l<androidx.compose.foundation.lazy.r, kotlin.m> r15 = r0.$content
            int r8 = r0.$$changed
            r14 = r8 | 1
            int r13 = r0.$$default
            java.lang.String r8 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r8)
            r8 = 407929823(0x185083df, float:2.6949948E-24)
            r9 = r24
            androidx.compose.runtime.ComposerImpl r12 = r9.mo5440h(r8)
            r8 = r13 & 1
            if (r8 == 0) goto L_0x002d
            r9 = r14 | 6
            goto L_0x003d
        L_0x002d:
            r9 = r14 & 14
            if (r9 != 0) goto L_0x003c
            boolean r9 = r12.mo5408I(r1)
            if (r9 == 0) goto L_0x0039
            r9 = 4
            goto L_0x003a
        L_0x0039:
            r9 = 2
        L_0x003a:
            r9 = r9 | r14
            goto L_0x003d
        L_0x003c:
            r9 = r14
        L_0x003d:
            r10 = r14 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x0051
            r10 = r13 & 2
            if (r10 != 0) goto L_0x004e
            boolean r10 = r12.mo5408I(r2)
            if (r10 == 0) goto L_0x004e
            r10 = 32
            goto L_0x0050
        L_0x004e:
            r10 = 16
        L_0x0050:
            r9 = r9 | r10
        L_0x0051:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0058
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0058:
            r11 = r14 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0068
            boolean r11 = r12.mo5408I(r3)
            if (r11 == 0) goto L_0x0065
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r9 = r9 | r11
        L_0x0068:
            r11 = r13 & 8
            if (r11 == 0) goto L_0x006f
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006f:
            r0 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0080
            boolean r0 = r12.mo5427a(r4)
            if (r0 == 0) goto L_0x007c
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r0 = r0 | r9
            goto L_0x0081
        L_0x0080:
            r0 = r9
        L_0x0081:
            r9 = 57344(0xe000, float:8.0356E-41)
            r16 = r14 & r9
            if (r16 != 0) goto L_0x0099
            r16 = r13 & 16
            if (r16 != 0) goto L_0x0095
            boolean r16 = r12.mo5408I(r5)
            if (r16 == 0) goto L_0x0095
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r0 = r0 | r16
        L_0x0099:
            r16 = r13 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00a2
            r18 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b1
        L_0x00a2:
            r18 = r14 & r17
            if (r18 != 0) goto L_0x00b3
            boolean r18 = r12.mo5408I(r6)
            if (r18 == 0) goto L_0x00af
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r0 = r0 | r18
        L_0x00b3:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r19 = r14 & r18
            if (r19 != 0) goto L_0x00ca
            r19 = r13 & 64
            if (r19 != 0) goto L_0x00c6
            boolean r19 = r12.mo5408I(r7)
            if (r19 == 0) goto L_0x00c6
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c8
        L_0x00c6:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00c8:
            r0 = r0 | r19
        L_0x00ca:
            r9 = r13 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00d3
            r0 = r0 | r19
            goto L_0x00e4
        L_0x00d3:
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r14
            if (r9 != 0) goto L_0x00e4
            boolean r9 = r12.mo5408I(r15)
            if (r9 == 0) goto L_0x00e1
            r9 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e3
        L_0x00e1:
            r9 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e3:
            r0 = r0 | r9
        L_0x00e4:
            r9 = 23967451(0x16db6db, float:4.3661218E-38)
            r9 = r9 & r0
            r25 = r1
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r9 != r1) goto L_0x010a
            boolean r1 = r12.mo5442i()
            if (r1 != 0) goto L_0x00f6
            goto L_0x010a
        L_0x00f6:
            r12.mo5396C()
            r9 = r25
            r10 = r2
            r11 = r3
            r0 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x0104:
            r12 = r4
            r13 = r5
            r14 = r6
            r15 = r7
            goto L_0x01b4
        L_0x010a:
            r12.mo5466u0()
            r1 = r14 & 1
            r9 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r1 == 0) goto L_0x0135
            boolean r1 = r12.mo5425Y()
            if (r1 == 0) goto L_0x011e
            goto L_0x0135
        L_0x011e:
            r12.mo5396C()
            r1 = r13 & 2
            if (r1 == 0) goto L_0x0127
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0127:
            r1 = r13 & 16
            if (r1 == 0) goto L_0x012d
            r0 = r0 & r20
        L_0x012d:
            r1 = r13 & 64
            if (r1 == 0) goto L_0x0132
            r0 = r0 & r9
        L_0x0132:
            r1 = r25
            goto L_0x0172
        L_0x0135:
            if (r8 == 0) goto L_0x013a
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x013c
        L_0x013a:
            r1 = r25
        L_0x013c:
            r8 = r13 & 2
            r9 = 0
            if (r8 == 0) goto L_0x0147
            androidx.compose.foundation.lazy.LazyListState r2 = androidx.compose.foundation.lazy.C0863v.m1919a(r12)
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0147:
            if (r10 == 0) goto L_0x0150
            float r3 = (float) r9
            androidx.compose.foundation.layout.w r8 = new androidx.compose.foundation.layout.w
            r8.<init>(r3, r3, r3, r3)
            r3 = r8
        L_0x0150:
            if (r11 == 0) goto L_0x0153
            r4 = r9
        L_0x0153:
            r8 = r13 & 16
            if (r8 == 0) goto L_0x0162
            androidx.compose.foundation.layout.d$i r5 = androidx.compose.foundation.layout.C0718d.f1476a
            if (r4 != 0) goto L_0x015e
            androidx.compose.foundation.layout.d$i r5 = androidx.compose.foundation.layout.C0718d.f1476a
            goto L_0x0160
        L_0x015e:
            androidx.compose.foundation.layout.d$c r5 = androidx.compose.foundation.layout.C0718d.f1477b
        L_0x0160:
            r0 = r0 & r20
        L_0x0162:
            if (r16 == 0) goto L_0x0166
            androidx.compose.ui.b$b r6 = androidx.compose.p015ui.C1428a.C1429a.f3113i
        L_0x0166:
            r8 = r13 & 64
            if (r8 == 0) goto L_0x0172
            androidx.compose.foundation.gestures.a r7 = kotlin.reflect.C19421p.m32919I(r12)
            r8 = -3670017(0xffffffffffc7ffff, float:NaN)
            r0 = r0 & r8
        L_0x0172:
            r12.mo5419S()
            r16 = 1
            r8 = r0 & 14
            r8 = r8 | r19
            r9 = r0 & 112(0x70, float:1.57E-43)
            r8 = r8 | r9
            r9 = r0 & 896(0x380, float:1.256E-42)
            r8 = r8 | r9
            r9 = r0 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r0
            r8 = r8 | r9
            r9 = r0 & r17
            r8 = r8 | r9
            r9 = r0 & r18
            r8 = r8 | r9
            r9 = 234881024(0xe000000, float:1.5777218E-30)
            int r0 = r0 << 3
            r0 = r0 & r9
            r18 = r8 | r0
            r19 = 0
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r0 = r12
            r12 = r5
            r20 = r13
            r13 = r6
            r21 = r14
            r14 = r7
            r22 = r15
            r15 = r16
            r16 = r22
            r17 = r0
            androidx.compose.foundation.lazy.LazyDslKt.m1772b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r9 = r1
            r10 = r2
            r11 = r3
            goto L_0x0104
        L_0x01b4:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x01bb
            goto L_0x01c9
        L_0x01bb:
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2 r1 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
            r8 = r1
            r16 = r22
            r17 = r21
            r18 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.f3081d = r1
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2.invoke(androidx.compose.runtime.d, int):void");
    }
}
