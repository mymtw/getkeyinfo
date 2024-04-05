package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

final class TabKt$LeadingIconTab$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ long $selectedContentColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;
    public final /* synthetic */ long $unselectedContentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$LeadingIconTab$3(boolean z, C19846a<C19394m> aVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C1436d dVar, boolean z2, C0640j jVar, long j, long j2, int i, int i2) {
        super(2);
        this.$selected = z;
        this.$onClick = aVar;
        this.$text = pVar;
        this.$icon = pVar2;
        this.$modifier = dVar;
        this.$enabled = z2;
        this.$interactionSource = jVar;
        this.$selectedContentColor = j;
        this.$unselectedContentColor = j2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r31, int r32) {
        /*
            r30 = this;
            r0 = r30
            boolean r11 = r0.$selected
            kq.a<kotlin.m> r12 = r0.$onClick
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r13 = r0.$text
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r14 = r0.$icon
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            androidx.compose.foundation.interaction.j r3 = r0.$interactionSource
            long r4 = r0.$selectedContentColor
            long r6 = r0.$unselectedContentColor
            int r8 = r0.$$changed
            r15 = r8 | 1
            int r10 = r0.$$default
            float r8 = androidx.compose.material.TabKt.f2313a
            java.lang.String r8 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r12, r8)
            java.lang.String r8 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r13, r8)
            java.lang.String r8 = "icon"
            kotlin.jvm.internal.C19383o.m32797g(r14, r8)
            r8 = -1499861761(0xffffffffa699ecff, float:-1.0680746E-15)
            r9 = r31
            androidx.compose.runtime.ComposerImpl r9 = r9.mo5440h(r8)
            r8 = r10 & 1
            if (r8 == 0) goto L_0x003b
            r8 = r15 | 6
            goto L_0x004b
        L_0x003b:
            r8 = r15 & 14
            if (r8 != 0) goto L_0x004a
            boolean r8 = r9.mo5427a(r11)
            if (r8 == 0) goto L_0x0047
            r8 = 4
            goto L_0x0048
        L_0x0047:
            r8 = 2
        L_0x0048:
            r8 = r8 | r15
            goto L_0x004b
        L_0x004a:
            r8 = r15
        L_0x004b:
            r16 = r10 & 2
            if (r16 == 0) goto L_0x0052
            r8 = r8 | 48
            goto L_0x0063
        L_0x0052:
            r16 = r15 & 112(0x70, float:1.57E-43)
            if (r16 != 0) goto L_0x0063
            boolean r16 = r9.mo5408I(r12)
            if (r16 == 0) goto L_0x005f
            r16 = 32
            goto L_0x0061
        L_0x005f:
            r16 = 16
        L_0x0061:
            r8 = r8 | r16
        L_0x0063:
            r16 = r10 & 4
            if (r16 == 0) goto L_0x006a
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x007a
        L_0x006a:
            r0 = r15 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x007a
            boolean r0 = r9.mo5408I(r13)
            if (r0 == 0) goto L_0x0077
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0079
        L_0x0077:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0079:
            r8 = r8 | r0
        L_0x007a:
            r0 = r10 & 8
            if (r0 == 0) goto L_0x0081
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0091
        L_0x0081:
            r0 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0091
            boolean r0 = r9.mo5408I(r14)
            if (r0 == 0) goto L_0x008e
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0090
        L_0x008e:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0090:
            r8 = r8 | r0
        L_0x0091:
            r0 = r10 & 16
            if (r0 == 0) goto L_0x0098
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ac
        L_0x0098:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00ac
            boolean r16 = r9.mo5408I(r1)
            if (r16 == 0) goto L_0x00a8
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00aa
        L_0x00a8:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00aa:
            r8 = r8 | r16
        L_0x00ac:
            r16 = r10 & 32
            if (r16 == 0) goto L_0x00b3
            r17 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00c4
        L_0x00b3:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x00c6
            boolean r17 = r9.mo5427a(r2)
            if (r17 == 0) goto L_0x00c2
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r8 = r8 | r17
        L_0x00c6:
            r17 = r10 & 64
            if (r17 == 0) goto L_0x00cd
            r18 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00de
        L_0x00cd:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r15 & r18
            if (r18 != 0) goto L_0x00e0
            boolean r18 = r9.mo5408I(r3)
            if (r18 == 0) goto L_0x00dc
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r8 = r8 | r18
        L_0x00e0:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r15 & r18
            if (r18 != 0) goto L_0x00f9
            r18 = r1
            r1 = r10 & 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x00f5
            boolean r1 = r9.mo5434e(r4)
            if (r1 == 0) goto L_0x00f5
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r8 = r8 | r1
            goto L_0x00fb
        L_0x00f9:
            r18 = r1
        L_0x00fb:
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r15
            if (r1 != 0) goto L_0x0110
            r1 = r10 & 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x010d
            boolean r1 = r9.mo5434e(r6)
            if (r1 == 0) goto L_0x010d
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x010d:
            r1 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010f:
            r8 = r8 | r1
        L_0x0110:
            r1 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r1 & r8
            r19 = r2
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r2) goto L_0x0136
            boolean r1 = r9.mo5442i()
            if (r1 != 0) goto L_0x0122
            goto L_0x0136
        L_0x0122:
            r9.mo5396C()
            r8 = r3
            r27 = r6
            r17 = r10
            r16 = r14
            r32 = r15
            r6 = r18
            r7 = r19
            r14 = r9
            r9 = r4
            goto L_0x0213
        L_0x0136:
            r9.mo5466u0()
            r1 = r15 & 1
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r20 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r1 == 0) goto L_0x0165
            boolean r1 = r9.mo5425Y()
            if (r1 == 0) goto L_0x014a
            goto L_0x0165
        L_0x014a:
            r9.mo5396C()
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0153
            r8 = r8 & r20
        L_0x0153:
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0158
            r8 = r8 & r2
        L_0x0158:
            r24 = r3
            r25 = r4
            r27 = r6
            r29 = r8
            r0 = r18
            r23 = r19
            goto L_0x01b9
        L_0x0165:
            if (r0 == 0) goto L_0x016b
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r1 = r0
            goto L_0x016d
        L_0x016b:
            r1 = r18
        L_0x016d:
            if (r16 == 0) goto L_0x0171
            r0 = 1
            goto L_0x0173
        L_0x0171:
            r0 = r19
        L_0x0173:
            if (r17 == 0) goto L_0x018d
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.mo5465u(r3)
            java.lang.Object r3 = r9.mo5431c0()
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r2) goto L_0x0187
            androidx.compose.foundation.interaction.k r3 = android.support.p013v4.media.C0072d.m198e(r9)
        L_0x0187:
            r2 = 0
            r9.mo5418R(r2)
            androidx.compose.foundation.interaction.j r3 = (androidx.compose.foundation.interaction.C0640j) r3
        L_0x018d:
            r2 = r10 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x019d
            androidx.compose.runtime.t r2 = androidx.compose.material.ContentColorKt.f2199a
            java.lang.Object r2 = r9.mo5410J(r2)
            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
            long r4 = r2.f3366a
            r8 = r8 & r20
        L_0x019d:
            r2 = r10 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x01ae
            float r2 = kotlinx.coroutines.C19543e0.m33302T(r9)
            long r6 = androidx.compose.p015ui.graphics.C1545s.m3356b(r4, r2)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r2 & r8
            r8 = r2
        L_0x01ae:
            r23 = r0
            r0 = r1
            r24 = r3
            r25 = r4
            r27 = r6
            r29 = r8
        L_0x01b9:
            r9.mo5419S()
            r16 = 1
            r17 = 0
            int r1 = r29 >> 15
            r1 = r1 & 896(0x380, float:1.256E-42)
            r21 = r1 | 6
            r22 = 2
            r18 = r25
            r20 = r9
            androidx.compose.material.ripple.c r5 = androidx.compose.material.ripple.C1244j.m2369a(r16, r17, r18, r20, r21, r22)
            r8 = 866677691(0x33a873bb, float:7.844161E-8)
            androidx.compose.material.TabKt$LeadingIconTab$2 r7 = new androidx.compose.material.TabKt$LeadingIconTab$2
            r1 = r7
            r2 = r0
            r3 = r11
            r4 = r24
            r6 = r23
            r31 = r0
            r0 = r7
            r7 = r12
            r32 = r15
            r15 = r8
            r8 = r14
            r16 = r14
            r14 = r9
            r9 = r29
            r17 = r10
            r10 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.runtime.internal.ComposableLambdaImpl r6 = p628nj.C18263b.m30805A(r14, r15, r0)
            int r0 = r29 >> 21
            r1 = r0 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r29 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r8 = r0 | r1
            r1 = r25
            r3 = r27
            r5 = r11
            r7 = r14
            androidx.compose.material.TabKt.m2257c(r1, r3, r5, r6, r7, r8)
            r6 = r31
            r7 = r23
            r8 = r24
            r9 = r25
        L_0x0213:
            androidx.compose.runtime.v0 r0 = r14.mo5421U()
            if (r0 != 0) goto L_0x021a
            goto L_0x022d
        L_0x021a:
            androidx.compose.material.TabKt$LeadingIconTab$3 r15 = new androidx.compose.material.TabKt$LeadingIconTab$3
            r1 = r15
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r16
            r11 = r27
            r13 = r32
            r14 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r14)
            r0.f3081d = r15
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt$LeadingIconTab$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
