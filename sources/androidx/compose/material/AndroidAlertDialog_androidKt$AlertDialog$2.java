package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.window.C2089b;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

final class AndroidAlertDialog_androidKt$AlertDialog$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $confirmButton;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $dismissButton;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ C2089b $properties;
    public final /* synthetic */ C1530k0 $shape;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$2(C19846a<C19394m> aVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, C1530k0 k0Var, long j, long j2, C2089b bVar, int i, int i2) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$confirmButton = pVar;
        this.$modifier = dVar;
        this.$dismissButton = pVar2;
        this.$title = pVar3;
        this.$text = pVar4;
        this.$shape = k0Var;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$properties = bVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0180, code lost:
        if ((r12 & androidx.recyclerview.widget.RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0) goto L_0x0182;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r31, int r32) {
        /*
            r30 = this;
            r0 = r30
            kq.a<kotlin.m> r15 = r0.$onDismissRequest
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r14 = r0.$confirmButton
            androidx.compose.ui.d r1 = r0.$modifier
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r2 = r0.$dismissButton
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r3 = r0.$title
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r4 = r0.$text
            androidx.compose.ui.graphics.k0 r5 = r0.$shape
            long r6 = r0.$backgroundColor
            long r8 = r0.$contentColor
            androidx.compose.ui.window.b r10 = r0.$properties
            int r11 = r0.$$changed
            r13 = r11 | 1
            int r12 = r0.$$default
            java.lang.String r11 = "onDismissRequest"
            kotlin.jvm.internal.C19383o.m32797g(r15, r11)
            java.lang.String r11 = "confirmButton"
            kotlin.jvm.internal.C19383o.m32797g(r14, r11)
            r11 = -606536823(0xffffffffdbd8fb89, float:-1.22150322E17)
            r0 = r31
            androidx.compose.runtime.ComposerImpl r0 = r0.mo5440h(r11)
            r11 = r12 & 1
            if (r11 == 0) goto L_0x0036
            r11 = r13 | 6
            goto L_0x0046
        L_0x0036:
            r11 = r13 & 14
            if (r11 != 0) goto L_0x0045
            boolean r11 = r0.mo5408I(r15)
            if (r11 == 0) goto L_0x0042
            r11 = 4
            goto L_0x0043
        L_0x0042:
            r11 = 2
        L_0x0043:
            r11 = r11 | r13
            goto L_0x0046
        L_0x0045:
            r11 = r13
        L_0x0046:
            r16 = r12 & 2
            if (r16 == 0) goto L_0x004d
            r11 = r11 | 48
            goto L_0x005e
        L_0x004d:
            r16 = r13 & 112(0x70, float:1.57E-43)
            if (r16 != 0) goto L_0x005e
            boolean r16 = r0.mo5408I(r14)
            if (r16 == 0) goto L_0x005a
            r16 = 32
            goto L_0x005c
        L_0x005a:
            r16 = 16
        L_0x005c:
            r11 = r11 | r16
        L_0x005e:
            r16 = r12 & 4
            if (r16 == 0) goto L_0x0067
            r11 = r11 | 384(0x180, float:5.38E-43)
            r32 = r15
            goto L_0x0079
        L_0x0067:
            r32 = r15
            r15 = r13 & 896(0x380, float:1.256E-42)
            if (r15 != 0) goto L_0x0079
            boolean r15 = r0.mo5408I(r1)
            if (r15 == 0) goto L_0x0076
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x0078
        L_0x0076:
            r15 = 128(0x80, float:1.794E-43)
        L_0x0078:
            r11 = r11 | r15
        L_0x0079:
            r15 = r12 & 8
            if (r15 == 0) goto L_0x0082
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            r17 = r1
            goto L_0x0095
        L_0x0082:
            r17 = r1
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0095
            boolean r1 = r0.mo5408I(r2)
            if (r1 == 0) goto L_0x0091
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0093
        L_0x0091:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0093:
            r1 = r1 | r11
            goto L_0x0096
        L_0x0095:
            r1 = r11
        L_0x0096:
            r11 = r12 & 16
            r18 = 57344(0xe000, float:8.0356E-41)
            if (r11 == 0) goto L_0x00a0
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b1
        L_0x00a0:
            r19 = r13 & r18
            if (r19 != 0) goto L_0x00b1
            boolean r19 = r0.mo5408I(r3)
            if (r19 == 0) goto L_0x00ad
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00af
        L_0x00ad:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x00af:
            r1 = r1 | r19
        L_0x00b1:
            r19 = r12 & 32
            r20 = 458752(0x70000, float:6.42848E-40)
            if (r19 == 0) goto L_0x00ba
            r21 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00c9
        L_0x00ba:
            r21 = r13 & r20
            if (r21 != 0) goto L_0x00cb
            boolean r21 = r0.mo5408I(r4)
            if (r21 == 0) goto L_0x00c7
            r21 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00c7:
            r21 = 65536(0x10000, float:9.18355E-41)
        L_0x00c9:
            r1 = r1 | r21
        L_0x00cb:
            r21 = 3670016(0x380000, float:5.142788E-39)
            r22 = r13 & r21
            if (r22 != 0) goto L_0x00e2
            r22 = r12 & 64
            if (r22 != 0) goto L_0x00de
            boolean r22 = r0.mo5408I(r5)
            if (r22 == 0) goto L_0x00de
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r1 = r1 | r22
        L_0x00e2:
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r13 & r22
            if (r23 != 0) goto L_0x00fb
            r23 = r2
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f7
            boolean r2 = r0.mo5434e(r6)
            if (r2 == 0) goto L_0x00f7
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f7:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r1 = r1 | r2
            goto L_0x00fd
        L_0x00fb:
            r23 = r2
        L_0x00fd:
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r24 = r13 & r2
            if (r24 != 0) goto L_0x0113
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0110
            boolean r2 = r0.mo5434e(r8)
            if (r2 == 0) goto L_0x0110
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0112
        L_0x0110:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0112:
            r1 = r1 | r2
        L_0x0113:
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r13
            if (r2 != 0) goto L_0x0128
            r2 = r12 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0125
            boolean r2 = r0.mo5408I(r10)
            if (r2 == 0) goto L_0x0125
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0127
        L_0x0125:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0127:
            r1 = r1 | r2
        L_0x0128:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r1
            r24 = r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x0150
            boolean r2 = r0.mo5442i()
            if (r2 != 0) goto L_0x013a
            goto L_0x0150
        L_0x013a:
            r0.mo5396C()
            r21 = r12
            r22 = r13
            r18 = r14
            r11 = r8
            r13 = r10
            r8 = r5
            r9 = r6
            r5 = r23
            r6 = r24
            r7 = r4
            r4 = r17
            goto L_0x0246
        L_0x0150:
            r0.mo5466u0()
            r2 = r13 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r25 = -3670017(0xffffffffffc7ffff, float:NaN)
            r26 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r27 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r2 == 0) goto L_0x0194
            boolean r2 = r0.mo5425Y()
            if (r2 == 0) goto L_0x016a
            goto L_0x0194
        L_0x016a:
            r0.mo5396C()
            r2 = r12 & 64
            if (r2 == 0) goto L_0x0173
            r1 = r1 & r25
        L_0x0173:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0178
            r1 = r1 & r3
        L_0x0178:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x017e
            r1 = r1 & r27
        L_0x017e:
            r2 = r12 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0187
        L_0x0182:
            r2 = r23
            r3 = r24
            goto L_0x01dd
        L_0x0187:
            r16 = r4
            r19 = r5
            r25 = r6
            r27 = r8
            r15 = r23
        L_0x0191:
            r23 = r10
            goto L_0x01eb
        L_0x0194:
            if (r16 == 0) goto L_0x019a
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r17 = r2
        L_0x019a:
            r2 = 0
            if (r15 == 0) goto L_0x019f
            r23 = r2
        L_0x019f:
            if (r11 == 0) goto L_0x01a3
            r24 = r2
        L_0x01a3:
            if (r19 == 0) goto L_0x01a6
            r4 = r2
        L_0x01a6:
            r2 = r12 & 64
            if (r2 == 0) goto L_0x01b6
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r2 = r0.mo5410J(r2)
            androidx.compose.material.q1 r2 = (androidx.compose.material.C1225q1) r2
            p.a r5 = r2.f2548b
            r1 = r1 & r25
        L_0x01b6:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x01c7
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r2 = r0.mo5410J(r2)
            androidx.compose.material.v r2 = (androidx.compose.material.C1259v) r2
            long r6 = r2.mo5363j()
            r1 = r1 & r3
        L_0x01c7:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x01d1
            long r8 = androidx.compose.material.ColorsKt.m2174b(r6, r0)
            r1 = r1 & r27
        L_0x01d1:
            r2 = r12 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0187
            androidx.compose.ui.window.b r2 = new androidx.compose.ui.window.b
            r3 = 0
            r2.<init>(r3)
            r10 = r2
            goto L_0x0182
        L_0x01dd:
            r1 = r1 & r26
            r15 = r2
            r24 = r3
            r16 = r4
            r19 = r5
            r25 = r6
            r27 = r8
            goto L_0x0191
        L_0x01eb:
            r0.mo5419S()
            r2 = -1849673151(0xffffffff91c03a41, float:-3.032816E-28)
            androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1 r3 = new androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
            r3.<init>(r15, r1, r14)
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = p628nj.C18263b.m30805A(r0, r2, r3)
            r3 = r1 & 14
            r3 = r3 | 48
            r4 = r1 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            int r1 = r1 >> 3
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = r1 & r18
            r3 = r3 | r4
            r4 = r1 & r20
            r3 = r3 | r4
            r4 = r1 & r21
            r3 = r3 | r4
            r4 = r1 & r22
            r3 = r3 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r4
            r18 = r3 | r1
            r20 = 0
            r1 = r32
            r3 = r17
            r4 = r24
            r5 = r16
            r6 = r19
            r7 = r25
            r9 = r27
            r11 = r23
            r21 = r12
            r12 = r0
            r22 = r13
            r13 = r18
            r18 = r14
            r14 = r20
            androidx.compose.material.AndroidAlertDialog_androidKt.m2164a(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r5 = r15
            r7 = r16
            r4 = r17
            r8 = r19
            r13 = r23
            r6 = r24
            r9 = r25
            r11 = r27
        L_0x0246:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x024d
            goto L_0x0261
        L_0x024d:
            androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2 r15 = new androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
            r1 = r15
            r2 = r32
            r3 = r18
            r14 = r22
            r29 = r15
            r15 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r14, r15)
            r1 = r29
            r0.f3081d = r1
        L_0x0261:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2.invoke(androidx.compose.runtime.d, int):void");
    }
}
