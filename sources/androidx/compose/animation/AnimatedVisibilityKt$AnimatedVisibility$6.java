package androidx.compose.animation;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class AnimatedVisibilityKt$AnimatedVisibility$6 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C0468d, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C0473i $enter;
    public final /* synthetic */ C0475k $exit;
    public final /* synthetic */ String $label;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C0739i $this_AnimatedVisibility;
    public final /* synthetic */ boolean $visible;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$6(C0739i iVar, boolean z, C1436d dVar, C0473i iVar2, C0475k kVar, String str, C19862q<? super C0468d, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$this_AnimatedVisibility = iVar;
        this.$visible = z;
        this.$modifier = dVar;
        this.$enter = iVar2;
        this.$exit = kVar;
        this.$label = str;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            androidx.compose.foundation.layout.i r2 = r0.$this_AnimatedVisibility
            boolean r3 = r0.$visible
            androidx.compose.ui.d r1 = r0.$modifier
            androidx.compose.animation.i r4 = r0.$enter
            androidx.compose.animation.k r5 = r0.$exit
            java.lang.String r6 = r0.$label
            kq.q<androidx.compose.animation.d, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r15 = r0.$content
            int r7 = r0.$$changed
            r14 = r7 | 1
            int r13 = r0.$$default
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r2, r7)
            java.lang.String r7 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r7)
            r7 = 1766503102(0x694ab2be, float:1.5315444E25)
            r8 = r20
            androidx.compose.runtime.ComposerImpl r12 = r8.mo5440h(r7)
            r7 = r13 & 1
            if (r7 == 0) goto L_0x0030
            r7 = r14 | 48
            goto L_0x0042
        L_0x0030:
            r7 = r14 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0041
            boolean r7 = r12.mo5427a(r3)
            if (r7 == 0) goto L_0x003d
            r7 = 32
            goto L_0x003f
        L_0x003d:
            r7 = 16
        L_0x003f:
            r7 = r7 | r14
            goto L_0x0042
        L_0x0041:
            r7 = r14
        L_0x0042:
            r8 = r13 & 2
            if (r8 == 0) goto L_0x0049
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0049:
            r9 = r14 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0059
            boolean r9 = r12.mo5408I(r1)
            if (r9 == 0) goto L_0x0056
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r7 = r7 | r9
        L_0x0059:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0060
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0070
        L_0x0060:
            r10 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0070
            boolean r10 = r12.mo5408I(r4)
            if (r10 == 0) goto L_0x006d
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x006f
        L_0x006d:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x006f:
            r7 = r7 | r10
        L_0x0070:
            r10 = r13 & 8
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x007a
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008b
        L_0x007a:
            r16 = r14 & r11
            if (r16 != 0) goto L_0x008b
            boolean r16 = r12.mo5408I(r5)
            if (r16 == 0) goto L_0x0087
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r7 = r7 | r16
        L_0x008b:
            r16 = r13 & 16
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x0094
            r18 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00a3
        L_0x0094:
            r18 = r14 & r17
            if (r18 != 0) goto L_0x00a5
            boolean r18 = r12.mo5408I(r6)
            if (r18 == 0) goto L_0x00a1
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a3
        L_0x00a1:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00a3:
            r7 = r7 | r18
        L_0x00a5:
            r18 = r13 & 32
            if (r18 == 0) goto L_0x00ac
            r18 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00bd
        L_0x00ac:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r14 & r18
            if (r18 != 0) goto L_0x00bf
            boolean r18 = r12.mo5408I(r15)
            if (r18 == 0) goto L_0x00bb
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00bd
        L_0x00bb:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00bd:
            r7 = r7 | r18
        L_0x00bf:
            r18 = 2995921(0x2db6d1, float:4.19818E-39)
            r11 = r7 & r18
            r0 = 599184(0x92490, float:8.39636E-40)
            if (r11 != r0) goto L_0x00dd
            boolean r0 = r12.mo5442i()
            if (r0 != 0) goto L_0x00d0
            goto L_0x00dd
        L_0x00d0:
            r12.mo5396C()
            r7 = r6
            r0 = r12
            r17 = r13
            r18 = r14
        L_0x00d9:
            r6 = r5
            r5 = r4
            r4 = r1
            goto L_0x013a
        L_0x00dd:
            if (r8 == 0) goto L_0x00e1
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x00e1:
            r0 = 0
            r8 = 3
            if (r9 == 0) goto L_0x00f1
            androidx.compose.animation.j r4 = androidx.compose.animation.EnterExitTransitionKt.m1037f(r0, r8)
            androidx.compose.animation.j r9 = androidx.compose.animation.EnterExitTransitionKt.m1036e()
            androidx.compose.animation.j r4 = r4.mo3547b(r9)
        L_0x00f1:
            if (r10 == 0) goto L_0x00ff
            androidx.compose.animation.l r0 = androidx.compose.animation.EnterExitTransitionKt.m1038g(r0, r8)
            androidx.compose.animation.l r5 = androidx.compose.animation.EnterExitTransitionKt.m1043l()
            androidx.compose.animation.l r5 = r0.mo3551b(r5)
        L_0x00ff:
            if (r16 == 0) goto L_0x0103
            java.lang.String r6 = "AnimatedVisibility"
        L_0x0103:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            int r8 = r7 >> 3
            r9 = r8 & 14
            int r10 = r7 >> 12
            r10 = r10 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            r10 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.m1103e(r0, r6, r12, r9, r10)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5 r9 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5.INSTANCE
            r10 = r7 & 896(0x380, float:1.256E-42)
            r10 = r10 | 48
            r11 = r7 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r11
            r7 = r7 | r10
            r8 = r8 & r17
            r16 = r7 | r8
            r7 = r0
            r8 = r9
            r9 = r1
            r10 = r4
            r11 = r5
            r0 = r12
            r12 = r15
            r17 = r13
            r13 = r0
            r18 = r14
            r14 = r16
            androidx.compose.animation.AnimatedVisibilityKt.m1025a(r7, r8, r9, r10, r11, r12, r13, r14)
            r7 = r6
            goto L_0x00d9
        L_0x013a:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x0141
            goto L_0x014e
        L_0x0141:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6 r11 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
            r1 = r11
            r8 = r15
            r9 = r18
            r10 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f3081d = r11
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6.invoke(androidx.compose.runtime.d, int):void");
    }
}
