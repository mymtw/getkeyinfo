package androidx.compose.material;

import androidx.compose.foundation.layout.C0763z;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class SwipeToDismissKt$SwipeToDismiss$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $background;
    public final /* synthetic */ Set<DismissDirection> $directions;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $dismissContent;
    public final /* synthetic */ C19857l<DismissDirection, C1174c2> $dismissThresholds;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C1189h0 $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$3(C1189h0 h0Var, C1436d dVar, Set<? extends DismissDirection> set, C19857l<? super DismissDirection, ? extends C1174c2> lVar, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar2, int i, int i2) {
        super(2);
        this.$state = h0Var;
        this.$modifier = dVar;
        this.$directions = set;
        this.$dismissThresholds = lVar;
        this.$background = qVar;
        this.$dismissContent = qVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            androidx.compose.material.h0 r8 = r0.$state
            androidx.compose.ui.d r1 = r0.$modifier
            java.util.Set<androidx.compose.material.DismissDirection> r2 = r0.$directions
            kq.l<androidx.compose.material.DismissDirection, androidx.compose.material.c2> r3 = r0.$dismissThresholds
            kq.q<androidx.compose.foundation.layout.z, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r9 = r0.$background
            kq.q<androidx.compose.foundation.layout.z, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r10 = r0.$dismissContent
            int r4 = r0.$$changed
            r5 = 1
            r11 = r4 | 1
            int r12 = r0.$$default
            java.lang.String r4 = "state"
            kotlin.jvm.internal.C19383o.m32797g(r8, r4)
            java.lang.String r4 = "background"
            kotlin.jvm.internal.C19383o.m32797g(r9, r4)
            java.lang.String r4 = "dismissContent"
            kotlin.jvm.internal.C19383o.m32797g(r10, r4)
            r4 = 634380143(0x25cfdf6f, float:3.606018E-16)
            r6 = r24
            androidx.compose.runtime.ComposerImpl r15 = r6.mo5440h(r4)
            r4 = r12 & 1
            r6 = 4
            r7 = 2
            if (r4 == 0) goto L_0x0036
            r4 = r11 | 6
            goto L_0x0046
        L_0x0036:
            r4 = r11 & 14
            if (r4 != 0) goto L_0x0045
            boolean r4 = r15.mo5408I(r8)
            if (r4 == 0) goto L_0x0042
            r4 = r6
            goto L_0x0043
        L_0x0042:
            r4 = r7
        L_0x0043:
            r4 = r4 | r11
            goto L_0x0046
        L_0x0045:
            r4 = r11
        L_0x0046:
            r13 = r12 & 2
            if (r13 == 0) goto L_0x004d
            r4 = r4 | 48
            goto L_0x005d
        L_0x004d:
            r14 = r11 & 112(0x70, float:1.57E-43)
            if (r14 != 0) goto L_0x005d
            boolean r14 = r15.mo5408I(r1)
            if (r14 == 0) goto L_0x005a
            r14 = 32
            goto L_0x005c
        L_0x005a:
            r14 = 16
        L_0x005c:
            r4 = r4 | r14
        L_0x005d:
            r14 = r12 & 4
            if (r14 == 0) goto L_0x0063
            r4 = r4 | 128(0x80, float:1.794E-43)
        L_0x0063:
            r16 = r12 & 8
            if (r16 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007a
            boolean r5 = r15.mo5408I(r3)
            if (r5 == 0) goto L_0x0077
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r5
        L_0x007a:
            r5 = r12 & 16
            if (r5 == 0) goto L_0x0081
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0093
        L_0x0081:
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r11
            if (r5 != 0) goto L_0x0093
            boolean r5 = r15.mo5408I(r9)
            if (r5 == 0) goto L_0x0090
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r4 = r4 | r5
        L_0x0093:
            r5 = r12 & 32
            if (r5 == 0) goto L_0x009a
            r5 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00aa
        L_0x009a:
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r11
            if (r5 != 0) goto L_0x00ab
            boolean r5 = r15.mo5408I(r10)
            if (r5 == 0) goto L_0x00a8
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00a8:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00aa:
            r4 = r4 | r5
        L_0x00ab:
            if (r14 != r6) goto L_0x00c6
            r5 = 374491(0x5b6db, float:5.24774E-40)
            r5 = r5 & r4
            r6 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r6) goto L_0x00c6
            boolean r5 = r15.mo5442i()
            if (r5 != 0) goto L_0x00bd
            goto L_0x00c6
        L_0x00bd:
            r15.mo5396C()
            r4 = r2
            r5 = r3
            r2 = r15
            r3 = r1
            goto L_0x0134
        L_0x00c6:
            r15.mo5466u0()
            r5 = r11 & 1
            if (r5 == 0) goto L_0x00e3
            boolean r5 = r15.mo5425Y()
            if (r5 == 0) goto L_0x00d4
            goto L_0x00e3
        L_0x00d4:
            r15.mo5396C()
            if (r14 == 0) goto L_0x00db
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00db:
            r20 = r1
            r21 = r2
            r22 = r3
            r13 = r4
            goto L_0x0100
        L_0x00e3:
            if (r13 == 0) goto L_0x00e7
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x00e7:
            if (r14 == 0) goto L_0x00fb
            androidx.compose.material.DismissDirection[] r2 = new androidx.compose.material.DismissDirection[r7]
            r5 = 0
            androidx.compose.material.DismissDirection r6 = androidx.compose.material.DismissDirection.EndToStart
            r2[r5] = r6
            androidx.compose.material.DismissDirection r5 = androidx.compose.material.DismissDirection.StartToEnd
            r6 = 1
            r2[r6] = r5
            java.util.Set r2 = kotlin.jvm.internal.C19382n.m32704D0(r2)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00fb:
            if (r16 == 0) goto L_0x00db
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$1 r3 = androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$1.INSTANCE
            goto L_0x00db
        L_0x0100:
            r15.mo5419S()
            r14 = 338007641(0x14259659, float:8.360022E-27)
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2 r7 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
            r1 = r7
            r2 = r21
            r3 = r22
            r4 = r13
            r5 = r8
            r6 = r9
            r0 = r7
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r16 = p628nj.C18263b.m30805A(r15, r14, r0)
            int r0 = r13 >> 3
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r19 = 6
            r14 = 0
            r1 = 0
            r13 = r20
            r2 = r15
            r15 = r1
            r17 = r2
            r18 = r0
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m1460a(r13, r14, r15, r16, r17, r18, r19)
            r3 = r20
            r4 = r21
            r5 = r22
        L_0x0134:
            androidx.compose.runtime.v0 r0 = r2.mo5421U()
            if (r0 != 0) goto L_0x013b
            goto L_0x0148
        L_0x013b:
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3 r13 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3
            r1 = r13
            r2 = r8
            r6 = r9
            r7 = r10
            r8 = r11
            r9 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f3081d = r13
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
