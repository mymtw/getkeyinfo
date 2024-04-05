package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class CheckboxKt$Checkbox$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ C1226r $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onCheckedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$Checkbox$3(boolean z, C19857l<? super Boolean, C19394m> lVar, C1436d dVar, boolean z2, C0640j jVar, C1226r rVar, int i, int i2) {
        super(2);
        this.$checked = z;
        this.$onCheckedChange = lVar;
        this.$modifier = dVar;
        this.$enabled = z2;
        this.$interactionSource = jVar;
        this.$colors = rVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d7, code lost:
        if ((r9 & 32) != 0) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            boolean r2 = r0.$checked
            kq.l<java.lang.Boolean, kotlin.m> r3 = r0.$onCheckedChange
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r4 = r0.$enabled
            androidx.compose.foundation.interaction.j r5 = r0.$interactionSource
            androidx.compose.material.r r6 = r0.$colors
            int r7 = r0.$$changed
            r8 = r7 | 1
            int r9 = r0.$$default
            float r7 = androidx.compose.material.CheckboxKt.f2181a
            r7 = -2118660998(0xffffffff81b7cc7a, float:-6.751699E-38)
            r10 = r20
            androidx.compose.runtime.ComposerImpl r7 = r10.mo5440h(r7)
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0026
            r10 = r8 | 6
            goto L_0x0036
        L_0x0026:
            r10 = r8 & 14
            if (r10 != 0) goto L_0x0035
            boolean r10 = r7.mo5427a(r2)
            if (r10 == 0) goto L_0x0032
            r10 = 4
            goto L_0x0033
        L_0x0032:
            r10 = 2
        L_0x0033:
            r10 = r10 | r8
            goto L_0x0036
        L_0x0035:
            r10 = r8
        L_0x0036:
            r11 = r9 & 2
            if (r11 == 0) goto L_0x003d
            r10 = r10 | 48
            goto L_0x004d
        L_0x003d:
            r11 = r8 & 112(0x70, float:1.57E-43)
            if (r11 != 0) goto L_0x004d
            boolean r11 = r7.mo5408I(r3)
            if (r11 == 0) goto L_0x004a
            r11 = 32
            goto L_0x004c
        L_0x004a:
            r11 = 16
        L_0x004c:
            r10 = r10 | r11
        L_0x004d:
            r11 = r9 & 4
            if (r11 == 0) goto L_0x0054
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r12 = r8 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x0064
            boolean r12 = r7.mo5408I(r1)
            if (r12 == 0) goto L_0x0061
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r10 = r10 | r12
        L_0x0064:
            r12 = r9 & 8
            if (r12 == 0) goto L_0x006b
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x007b
            boolean r13 = r7.mo5427a(r4)
            if (r13 == 0) goto L_0x0078
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r10 = r10 | r13
        L_0x007b:
            r13 = r9 & 16
            r14 = 57344(0xe000, float:8.0356E-41)
            if (r13 == 0) goto L_0x0085
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0094
        L_0x0085:
            r14 = r14 & r8
            if (r14 != 0) goto L_0x0094
            boolean r14 = r7.mo5408I(r5)
            if (r14 == 0) goto L_0x0091
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r10 = r10 | r14
        L_0x0094:
            r14 = 458752(0x70000, float:6.42848E-40)
            r15 = r8 & r14
            if (r15 != 0) goto L_0x00aa
            r15 = r9 & 32
            if (r15 != 0) goto L_0x00a7
            boolean r15 = r7.mo5408I(r6)
            if (r15 == 0) goto L_0x00a7
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00a7:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00a9:
            r10 = r10 | r15
        L_0x00aa:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r10
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r14) goto L_0x00c3
            boolean r14 = r7.mo5442i()
            if (r14 != 0) goto L_0x00ba
            goto L_0x00c3
        L_0x00ba:
            r7.mo5396C()
        L_0x00bd:
            r10 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            goto L_0x0163
        L_0x00c3:
            r7.mo5466u0()
            r14 = r8 & 1
            r15 = 0
            if (r14 == 0) goto L_0x00da
            boolean r14 = r7.mo5425Y()
            if (r14 == 0) goto L_0x00d2
            goto L_0x00da
        L_0x00d2:
            r7.mo5396C()
            r11 = r9 & 32
            if (r11 == 0) goto L_0x0106
            goto L_0x0102
        L_0x00da:
            if (r11 == 0) goto L_0x00de
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x00de:
            if (r12 == 0) goto L_0x00e1
            r4 = 1
        L_0x00e1:
            if (r13 == 0) goto L_0x00fa
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo5465u(r5)
            java.lang.Object r5 = r7.mo5431c0()
            androidx.compose.runtime.d$a$a r11 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r5 != r11) goto L_0x00f5
            androidx.compose.foundation.interaction.k r5 = android.support.p013v4.media.C0072d.m198e(r7)
        L_0x00f5:
            r7.mo5418R(r15)
            androidx.compose.foundation.interaction.j r5 = (androidx.compose.foundation.interaction.C0640j) r5
        L_0x00fa:
            r11 = r9 & 32
            if (r11 == 0) goto L_0x0106
            androidx.compose.material.y r6 = androidx.compose.material.C1261v1.m2394c(r7)
        L_0x0102:
            r11 = -458753(0xfffffffffff8ffff, float:NaN)
            r10 = r10 & r11
        L_0x0106:
            r7.mo5419S()
            androidx.compose.ui.state.ToggleableState r11 = kotlin.reflect.C19421p.m32953r(r2)
            r12 = 1433125990(0x556bc466, float:1.62017973E13)
            r7.mo5465u(r12)
            if (r3 == 0) goto L_0x0140
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            r13 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.mo5465u(r13)
            boolean r13 = r7.mo5408I(r3)
            boolean r12 = r7.mo5408I(r12)
            r12 = r12 | r13
            java.lang.Object r13 = r7.mo5431c0()
            if (r12 != 0) goto L_0x0132
            androidx.compose.runtime.d$a$a r12 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r13 != r12) goto L_0x013a
        L_0x0132:
            androidx.compose.material.CheckboxKt$Checkbox$2$1 r13 = new androidx.compose.material.CheckboxKt$Checkbox$2$1
            r13.<init>(r3, r2)
            r7.mo5407H0(r13)
        L_0x013a:
            r7.mo5418R(r15)
            kq.a r13 = (p753kq.C19846a) r13
            goto L_0x0142
        L_0x0140:
            r12 = 0
            r13 = r12
        L_0x0142:
            r7.mo5418R(r15)
            r12 = r10 & 896(0x380, float:1.256E-42)
            r14 = r10 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r10
            r12 = r12 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r14
            r17 = r12 | r10
            r18 = 0
            r10 = r11
            r11 = r13
            r12 = r1
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            androidx.compose.material.CheckboxKt.m2172b(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00bd
        L_0x0163:
            androidx.compose.runtime.v0 r11 = r7.mo5421U()
            if (r11 != 0) goto L_0x016a
            goto L_0x0173
        L_0x016a:
            androidx.compose.material.CheckboxKt$Checkbox$3 r12 = new androidx.compose.material.CheckboxKt$Checkbox$3
            r1 = r12
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r11.f3081d = r12
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt$Checkbox$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
