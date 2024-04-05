package androidx.compose.foundation.text;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class ClickableTextKt$ClickableText$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<Integer, C19394m> $onClick;
    public final /* synthetic */ C19857l<C2021q, C19394m> $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C2023s $style;
    public final /* synthetic */ C1913a $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$3(C1913a aVar, C1436d dVar, C2023s sVar, boolean z, int i, int i2, C19857l<? super C2021q, C19394m> lVar, C19857l<? super Integer, C19394m> lVar2, int i3, int i4) {
        super(2);
        this.$text = aVar;
        this.$modifier = dVar;
        this.$style = sVar;
        this.$softWrap = z;
        this.$overflow = i;
        this.$maxLines = i2;
        this.$onTextLayout = lVar;
        this.$onClick = lVar2;
        this.$$changed = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            androidx.compose.ui.text.a r12 = r0.$text
            androidx.compose.ui.d r1 = r0.$modifier
            androidx.compose.ui.text.s r2 = r0.$style
            boolean r3 = r0.$softWrap
            int r4 = r0.$overflow
            int r5 = r0.$maxLines
            kq.l<androidx.compose.ui.text.q, kotlin.m> r6 = r0.$onTextLayout
            kq.l<java.lang.Integer, kotlin.m> r13 = r0.$onClick
            int r7 = r0.$$changed
            r8 = 1
            r14 = r7 | 1
            int r15 = r0.$$default
            java.lang.String r7 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r12, r7)
            java.lang.String r7 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r13, r7)
            r7 = -246609449(0xfffffffff14d09d7, float:-1.0153012E30)
            r9 = r24
            androidx.compose.runtime.ComposerImpl r11 = r9.mo5440h(r7)
            r7 = r15 & 1
            if (r7 == 0) goto L_0x0033
            r7 = r14 | 6
            goto L_0x0043
        L_0x0033:
            r7 = r14 & 14
            if (r7 != 0) goto L_0x0042
            boolean r7 = r11.mo5408I(r12)
            if (r7 == 0) goto L_0x003f
            r7 = 4
            goto L_0x0040
        L_0x003f:
            r7 = 2
        L_0x0040:
            r7 = r7 | r14
            goto L_0x0043
        L_0x0042:
            r7 = r14
        L_0x0043:
            r9 = r15 & 2
            if (r9 == 0) goto L_0x004a
            r7 = r7 | 48
            goto L_0x005a
        L_0x004a:
            r10 = r14 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x005a
            boolean r10 = r11.mo5408I(r1)
            if (r10 == 0) goto L_0x0057
            r10 = 32
            goto L_0x0059
        L_0x0057:
            r10 = 16
        L_0x0059:
            r7 = r7 | r10
        L_0x005a:
            r10 = r15 & 4
            if (r10 == 0) goto L_0x0061
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0071
        L_0x0061:
            r8 = r14 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0071
            boolean r8 = r11.mo5408I(r2)
            if (r8 == 0) goto L_0x006e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0070
        L_0x006e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0070:
            r7 = r7 | r8
        L_0x0071:
            r8 = r15 & 8
            if (r8 == 0) goto L_0x0078
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0088
        L_0x0078:
            r0 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0088
            boolean r0 = r11.mo5427a(r3)
            if (r0 == 0) goto L_0x0085
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r7 = r7 | r0
        L_0x0088:
            r0 = r15 & 16
            r16 = 57344(0xe000, float:8.0356E-41)
            if (r0 == 0) goto L_0x0092
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x0092:
            r17 = r14 & r16
            if (r17 != 0) goto L_0x00a3
            boolean r17 = r11.mo5432d(r4)
            if (r17 == 0) goto L_0x009f
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r7 = r7 | r17
        L_0x00a3:
            r17 = r15 & 32
            r18 = 458752(0x70000, float:6.42848E-40)
            if (r17 == 0) goto L_0x00ac
            r19 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00bb
        L_0x00ac:
            r19 = r14 & r18
            if (r19 != 0) goto L_0x00bd
            boolean r19 = r11.mo5432d(r5)
            if (r19 == 0) goto L_0x00b9
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r7 = r7 | r19
        L_0x00bd:
            r19 = r15 & 64
            r20 = 3670016(0x380000, float:5.142788E-39)
            if (r19 == 0) goto L_0x00c6
            r21 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00d5
        L_0x00c6:
            r21 = r14 & r20
            if (r21 != 0) goto L_0x00d7
            boolean r21 = r11.mo5408I(r6)
            if (r21 == 0) goto L_0x00d3
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r7 = r7 | r21
        L_0x00d7:
            r21 = r1
            r1 = r15 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00e0
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x00f0
        L_0x00e0:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r14
            if (r1 != 0) goto L_0x00f1
            boolean r1 = r11.mo5408I(r13)
            if (r1 == 0) goto L_0x00ee
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ee:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r7 = r7 | r1
        L_0x00f1:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r7
            r22 = r2
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r2) goto L_0x0112
            boolean r1 = r11.mo5442i()
            if (r1 != 0) goto L_0x0103
            goto L_0x0112
        L_0x0103:
            r11.mo5396C()
            r7 = r5
            r8 = r6
            r16 = r11
            r5 = r3
            r6 = r4
            r3 = r21
        L_0x010e:
            r4 = r22
            goto L_0x01de
        L_0x0112:
            if (r9 == 0) goto L_0x0118
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r9 = r1
            goto L_0x011a
        L_0x0118:
            r9 = r21
        L_0x011a:
            if (r10 == 0) goto L_0x0120
            androidx.compose.ui.text.s r2 = androidx.compose.p015ui.text.C2023s.f4598d
            r22 = r2
        L_0x0120:
            if (r8 == 0) goto L_0x0125
            r21 = 1
            goto L_0x0127
        L_0x0125:
            r21 = r3
        L_0x0127:
            if (r0 == 0) goto L_0x012b
            r0 = 1
            goto L_0x012c
        L_0x012b:
            r0 = r4
        L_0x012c:
            if (r17 == 0) goto L_0x0131
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0131:
            r17 = r5
            if (r19 == 0) goto L_0x0137
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$1 r6 = androidx.compose.foundation.text.ClickableTextKt$ClickableText$1.INSTANCE
        L_0x0137:
            r10 = r6
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r1)
            java.lang.Object r1 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            r3 = 0
            if (r1 != r2) goto L_0x014e
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = androidx.compose.foundation.layout.C0761x.m1751w0(r3, androidx.compose.runtime.C1351n1.f2948a)
            r11.mo5407H0(r1)
        L_0x014e:
            r4 = 0
            r11.mo5418R(r4)
            androidx.compose.runtime.j0 r1 = (androidx.compose.runtime.C1338j0) r1
            androidx.compose.ui.d$a r5 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.mo5465u(r6)
            boolean r8 = r11.mo5408I(r1)
            boolean r19 = r11.mo5408I(r13)
            r8 = r8 | r19
            java.lang.Object r6 = r11.mo5431c0()
            if (r8 != 0) goto L_0x016e
            if (r6 != r2) goto L_0x0176
        L_0x016e:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1 r6 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1
            r6.<init>(r1, r13, r3)
            r11.mo5407H0(r6)
        L_0x0176:
            r11.mo5418R(r4)
            kq.p r6 = (p753kq.C19861p) r6
            androidx.compose.ui.d r3 = androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt.m3484b(r5, r13, r6)
            androidx.compose.ui.d r3 = r9.mo6148i0(r3)
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.mo5465u(r5)
            boolean r5 = r11.mo5408I(r1)
            boolean r6 = r11.mo5408I(r10)
            r5 = r5 | r6
            java.lang.Object r6 = r11.mo5431c0()
            if (r5 != 0) goto L_0x019a
            if (r6 != r2) goto L_0x01a2
        L_0x019a:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1 r6 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
            r6.<init>(r1, r10)
            r11.mo5407H0(r6)
        L_0x01a2:
            r11.mo5418R(r4)
            r4 = r6
            kq.l r4 = (p753kq.C19857l) r4
            r8 = 0
            r1 = r7 & 14
            r2 = r7 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r7 & r16
            r1 = r1 | r2
            int r2 = r7 << 6
            r2 = r2 & r18
            r1 = r1 | r2
            int r2 = r7 << 3
            r2 = r2 & r20
            r16 = r1 | r2
            r18 = 128(0x80, float:1.794E-43)
            r1 = r12
            r2 = r3
            r3 = r22
            r5 = r0
            r6 = r21
            r7 = r17
            r19 = r9
            r9 = r11
            r20 = r10
            r10 = r16
            r16 = r11
            r11 = r18
            androidx.compose.foundation.text.BasicTextKt.m1953a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r6 = r0
            r3 = r19
            r8 = r20
            r5 = r21
            goto L_0x010e
        L_0x01de:
            androidx.compose.runtime.v0 r0 = r16.mo5421U()
            if (r0 != 0) goto L_0x01e5
            goto L_0x01f2
        L_0x01e5:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$3 r11 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
            r1 = r11
            r2 = r12
            r9 = r13
            r10 = r14
            r12 = r11
            r11 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f3081d = r12
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
