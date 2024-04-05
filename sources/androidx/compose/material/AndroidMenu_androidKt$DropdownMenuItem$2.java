package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

final class AndroidMenu_androidKt$DropdownMenuItem$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenuItem$2(C19846a<C19394m> aVar, C1436d dVar, boolean z, C0759v vVar, C0640j jVar, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = dVar;
        this.$enabled = z;
        this.$contentPadding = vVar;
        this.$interactionSource = jVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            kq.a<kotlin.m> r10 = r0.$onClick
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            androidx.compose.foundation.layout.v r3 = r0.$contentPadding
            androidx.compose.foundation.interaction.j r4 = r0.$interactionSource
            kq.q<androidx.compose.foundation.layout.z, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r11 = r0.$content
            int r5 = r0.$$changed
            r12 = r5 | 1
            int r13 = r0.$$default
            java.lang.String r5 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r10, r5)
            java.lang.String r5 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r11, r5)
            r5 = -1988562892(0xffffffff8978f034, float:-2.9964857E-33)
            r6 = r20
            androidx.compose.runtime.ComposerImpl r14 = r6.mo5440h(r5)
            r5 = r13 & 1
            if (r5 == 0) goto L_0x002e
            r5 = r12 | 6
            goto L_0x003e
        L_0x002e:
            r5 = r12 & 14
            if (r5 != 0) goto L_0x003d
            boolean r5 = r14.mo5408I(r10)
            if (r5 == 0) goto L_0x003a
            r5 = 4
            goto L_0x003b
        L_0x003a:
            r5 = 2
        L_0x003b:
            r5 = r5 | r12
            goto L_0x003e
        L_0x003d:
            r5 = r12
        L_0x003e:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0045
            r5 = r5 | 48
            goto L_0x0055
        L_0x0045:
            r7 = r12 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0055
            boolean r7 = r14.mo5408I(r1)
            if (r7 == 0) goto L_0x0052
            r7 = 32
            goto L_0x0054
        L_0x0052:
            r7 = 16
        L_0x0054:
            r5 = r5 | r7
        L_0x0055:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x005c
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r8 = r12 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x006c
            boolean r8 = r14.mo5427a(r2)
            if (r8 == 0) goto L_0x0069
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r5 = r5 | r8
        L_0x006c:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x0073
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0073:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0083
            boolean r9 = r14.mo5408I(r3)
            if (r9 == 0) goto L_0x0080
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r5 = r5 | r9
        L_0x0083:
            r9 = r13 & 16
            r15 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008d
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008d:
            r16 = r12 & r15
            if (r16 != 0) goto L_0x009e
            boolean r16 = r14.mo5408I(r4)
            if (r16 == 0) goto L_0x009a
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r5 = r5 | r16
        L_0x009e:
            r16 = r13 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00a7
            r16 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b6
        L_0x00a7:
            r16 = r12 & r17
            if (r16 != 0) goto L_0x00b8
            boolean r16 = r14.mo5408I(r11)
            if (r16 == 0) goto L_0x00b4
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r5 = r5 | r16
        L_0x00b8:
            r16 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r5 & r16
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r0) goto L_0x00d1
            boolean r0 = r14.mo5442i()
            if (r0 != 0) goto L_0x00c9
            goto L_0x00d1
        L_0x00c9:
            r14.mo5396C()
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L_0x0124
        L_0x00d1:
            if (r6 == 0) goto L_0x00d5
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x00d5:
            r0 = r1
            if (r7 == 0) goto L_0x00d9
            r2 = 1
        L_0x00d9:
            r15 = r2
            if (r8 == 0) goto L_0x00de
            androidx.compose.foundation.layout.w r3 = androidx.compose.material.C1165a1.f2376a
        L_0x00de:
            r16 = r3
            if (r9 == 0) goto L_0x00fb
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo5465u(r1)
            java.lang.Object r1 = r14.mo5431c0()
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r2) goto L_0x00f4
            androidx.compose.foundation.interaction.k r1 = android.support.p013v4.media.C0072d.m198e(r14)
        L_0x00f4:
            r2 = 0
            r14.mo5418R(r2)
            r4 = r1
            androidx.compose.foundation.interaction.j r4 = (androidx.compose.foundation.interaction.C0640j) r4
        L_0x00fb:
            r18 = r4
            r1 = r5 & 14
            r2 = r5 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r5 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r5 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r5
            r1 = r1 | r2
            r2 = r5 & r17
            r8 = r1 | r2
            r9 = 0
            r1 = r10
            r2 = r0
            r3 = r15
            r4 = r16
            r5 = r18
            r6 = r11
            r7 = r14
            androidx.compose.material.MenuKt.m2192b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = r0
            r4 = r15
            r5 = r16
            r6 = r18
        L_0x0124:
            androidx.compose.runtime.v0 r0 = r14.mo5421U()
            if (r0 != 0) goto L_0x012b
            goto L_0x0137
        L_0x012b:
            androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$2 r14 = new androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$2
            r1 = r14
            r2 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f3081d = r14
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$2.invoke(androidx.compose.runtime.d, int):void");
    }
}
