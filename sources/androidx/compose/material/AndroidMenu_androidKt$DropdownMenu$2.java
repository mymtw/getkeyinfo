package androidx.compose.material;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.window.C2093f;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

final class AndroidMenu_androidKt$DropdownMenu$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ C2093f $properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$2(boolean z, C19846a<C19394m> aVar, C1436d dVar, long j, C2093f fVar, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$expanded = z;
        this.$onDismissRequest = aVar;
        this.$modifier = dVar;
        this.$offset = j;
        this.$properties = fVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e2, code lost:
        if ((r7 & 16) != 0) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            boolean r2 = r0.$expanded
            kq.a<kotlin.m> r10 = r0.$onDismissRequest
            androidx.compose.ui.d r1 = r0.$modifier
            long r3 = r0.$offset
            androidx.compose.ui.window.f r5 = r0.$properties
            kq.q<androidx.compose.foundation.layout.i, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r9 = r0.$content
            int r6 = r0.$$changed
            r8 = r6 | 1
            int r7 = r0.$$default
            java.lang.String r6 = "onDismissRequest"
            kotlin.jvm.internal.C19383o.m32797g(r10, r6)
            java.lang.String r6 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r9, r6)
            r6 = -840283139(0xffffffffcdea4bfd, float:-4.91356064E8)
            r11 = r23
            androidx.compose.runtime.ComposerImpl r6 = r11.mo5440h(r6)
            r11 = r7 & 1
            if (r11 == 0) goto L_0x002e
            r11 = r8 | 6
            goto L_0x003e
        L_0x002e:
            r11 = r8 & 14
            if (r11 != 0) goto L_0x003d
            boolean r11 = r6.mo5427a(r2)
            if (r11 == 0) goto L_0x003a
            r11 = 4
            goto L_0x003b
        L_0x003a:
            r11 = 2
        L_0x003b:
            r11 = r11 | r8
            goto L_0x003e
        L_0x003d:
            r11 = r8
        L_0x003e:
            r12 = r7 & 2
            if (r12 == 0) goto L_0x0045
            r11 = r11 | 48
            goto L_0x0055
        L_0x0045:
            r12 = r8 & 112(0x70, float:1.57E-43)
            if (r12 != 0) goto L_0x0055
            boolean r12 = r6.mo5408I(r10)
            if (r12 == 0) goto L_0x0052
            r12 = 32
            goto L_0x0054
        L_0x0052:
            r12 = 16
        L_0x0054:
            r11 = r11 | r12
        L_0x0055:
            r12 = r7 & 4
            if (r12 == 0) goto L_0x005c
            r11 = r11 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r13 = r8 & 896(0x380, float:1.256E-42)
            if (r13 != 0) goto L_0x006c
            boolean r13 = r6.mo5408I(r1)
            if (r13 == 0) goto L_0x0069
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r13 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r11 = r11 | r13
        L_0x006c:
            r13 = r7 & 8
            if (r13 == 0) goto L_0x0073
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0073:
            r14 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x0083
            boolean r14 = r6.mo5434e(r3)
            if (r14 == 0) goto L_0x0080
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r11 = r11 | r14
        L_0x0083:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x0099
            r14 = r7 & 16
            if (r14 != 0) goto L_0x0096
            boolean r14 = r6.mo5408I(r5)
            if (r14 == 0) goto L_0x0096
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r11 = r11 | r14
        L_0x0099:
            r14 = r7 & 32
            if (r14 == 0) goto L_0x00a0
            r14 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b0
        L_0x00a0:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00b1
            boolean r14 = r6.mo5408I(r9)
            if (r14 == 0) goto L_0x00ae
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r11 = r11 | r14
        L_0x00b1:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r11
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00ce
            boolean r14 = r6.mo5442i()
            if (r14 != 0) goto L_0x00c1
            goto L_0x00ce
        L_0x00c1:
            r6.mo5396C()
            r15 = r6
            r0 = r7
            r16 = r8
            r11 = r9
            r7 = r5
            r5 = r3
            r4 = r1
            goto L_0x01e0
        L_0x00ce:
            r6.mo5466u0()
            r14 = r8 & 1
            r15 = 0
            if (r14 == 0) goto L_0x00ed
            boolean r14 = r6.mo5425Y()
            if (r14 == 0) goto L_0x00dd
            goto L_0x00ed
        L_0x00dd:
            r6.mo5396C()
            r12 = r7 & 16
            if (r12 == 0) goto L_0x00e8
        L_0x00e4:
            r12 = -57345(0xffffffffffff1fff, float:NaN)
            goto L_0x010e
        L_0x00e8:
            r17 = r5
            r4 = r3
            r3 = r11
            goto L_0x0110
        L_0x00ed:
            if (r12 == 0) goto L_0x00f1
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x00f1:
            if (r13 == 0) goto L_0x00f8
            float r3 = (float) r15
            long r3 = kotlin.jvm.internal.C19388s.m32858d(r3, r3)
        L_0x00f8:
            r12 = r7 & 16
            if (r12 == 0) goto L_0x00e8
            androidx.compose.ui.window.f r5 = new androidx.compose.ui.window.f
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 62
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x00e4
        L_0x010e:
            r11 = r11 & r12
            goto L_0x00e8
        L_0x0110:
            r6.mo5419S()
            r11 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo5465u(r11)
            java.lang.Object r12 = r6.mo5431c0()
            androidx.compose.runtime.d$a$a r13 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r12 != r13) goto L_0x012b
            androidx.compose.animation.core.c0 r12 = new androidx.compose.animation.core.c0
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r12.<init>(r14)
            r6.mo5407H0(r12)
        L_0x012b:
            r6.mo5418R(r15)
            androidx.compose.animation.core.c0 r12 = (androidx.compose.animation.core.C0418c0) r12
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            androidx.compose.runtime.ParcelableSnapshotMutableState r15 = r12.f1094b
            r15.setValue(r14)
            androidx.compose.runtime.ParcelableSnapshotMutableState r14 = r12.f1093a
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L_0x015e
            androidx.compose.runtime.ParcelableSnapshotMutableState r14 = r12.f1094b
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0156
            goto L_0x015e
        L_0x0156:
            r13 = r4
            r15 = r6
            r0 = r7
            r16 = r8
            r11 = r9
            goto L_0x01dc
        L_0x015e:
            r6.mo5465u(r11)
            java.lang.Object r11 = r6.mo5431c0()
            if (r11 != r13) goto L_0x0175
            long r14 = androidx.compose.p015ui.graphics.C1540p0.f3337b
            androidx.compose.ui.graphics.p0 r11 = new androidx.compose.ui.graphics.p0
            r11.<init>(r14)
            androidx.compose.runtime.ParcelableSnapshotMutableState r11 = androidx.compose.foundation.layout.C0761x.m1751w0(r11, androidx.compose.runtime.C1351n1.f2948a)
            r6.mo5407H0(r11)
        L_0x0175:
            r14 = 0
            r6.mo5418R(r14)
            r14 = r11
            androidx.compose.runtime.j0 r14 = (androidx.compose.runtime.C1338j0) r14
            androidx.compose.runtime.l1 r11 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r11 = r6.mo5410J(r11)
            m0.b r11 = (p174m0.C7282b) r11
            r15 = 1157296644(0x44faf204, float:2007.563)
            r6.mo5465u(r15)
            boolean r15 = r6.mo5408I(r14)
            java.lang.Object r0 = r6.mo5431c0()
            if (r15 != 0) goto L_0x0196
            if (r0 != r13) goto L_0x019e
        L_0x0196:
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 r0 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
            r0.<init>(r14)
            r6.mo5407H0(r0)
        L_0x019e:
            r13 = 0
            r6.mo5418R(r13)
            kq.p r0 = (p753kq.C19861p) r0
            androidx.compose.material.l0 r15 = new androidx.compose.material.l0
            r15.<init>(r4, r11, r0)
            r0 = 79632374(0x4bf17f6, float:4.492589E-36)
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1 r13 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
            r11 = r13
            r18 = r4
            r4 = r13
            r13 = r14
            r14 = r1
            r5 = r15
            r15 = r9
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r6, r0, r4)
            r4 = r3 & 112(0x70, float:1.57E-43)
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            int r3 = r3 >> 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r11 = r4 | r3
            r12 = 0
            r3 = r5
            r13 = r18
            r4 = r10
            r5 = r17
            r15 = r6
            r6 = r0
            r0 = r7
            r7 = r15
            r16 = r8
            r8 = r11
            r11 = r9
            r9 = r12
            androidx.compose.p015ui.window.AndroidPopup_androidKt.m4514a(r3, r4, r5, r6, r7, r8, r9)
        L_0x01dc:
            r4 = r1
            r5 = r13
            r7 = r17
        L_0x01e0:
            androidx.compose.runtime.v0 r12 = r15.mo5421U()
            if (r12 != 0) goto L_0x01e7
            goto L_0x01f4
        L_0x01e7:
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2 r13 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
            r1 = r13
            r3 = r10
            r8 = r11
            r9 = r16
            r10 = r0
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            r12.f3081d = r13
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2.invoke(androidx.compose.runtime.d, int):void");
    }
}
