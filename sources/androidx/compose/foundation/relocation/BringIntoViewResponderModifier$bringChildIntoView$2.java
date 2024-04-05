package androidx.compose.foundation.relocation;

import androidx.compose.p015ui.layout.C1689j;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p288y.C8345d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", mo70541f = "BringIntoViewResponder.kt", mo70542l = {214, 223, 230}, mo70543m = "invokeSuspend")
public final class BringIntoViewResponderModifier$bringChildIntoView$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1689j $childCoordinates;
    public final /* synthetic */ C8345d $rect;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ BringIntoViewResponderModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier$bringChildIntoView$2(BringIntoViewResponderModifier bringIntoViewResponderModifier, C1689j jVar, C8345d dVar, C19340c<? super BringIntoViewResponderModifier$bringChildIntoView$2> cVar) {
        super(2, cVar);
        this.this$0 = bringIntoViewResponderModifier;
        this.$childCoordinates = jVar;
        this.$rect = dVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        BringIntoViewResponderModifier$bringChildIntoView$2 bringIntoViewResponderModifier$bringChildIntoView$2 = new BringIntoViewResponderModifier$bringChildIntoView$2(this.this$0, this.$childCoordinates, this.$rect, cVar);
        bringIntoViewResponderModifier$bringChildIntoView$2.L$0 = obj;
        return bringIntoViewResponderModifier$bringChildIntoView$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((BringIntoViewResponderModifier$bringChildIntoView$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r5) goto L_0x0035
            if (r1 == r4) goto L_0x0021
            if (r1 != r3) goto L_0x0019
            java.lang.Object r0 = r12.L$0
            kotlin.Pair r0 = (kotlin.Pair) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)     // Catch:{ all -> 0x003e }
            goto L_0x00e8
        L_0x0019:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0021:
            java.lang.Object r1 = r12.L$2
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r4 = r12.L$1
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r12.L$0
            androidx.compose.ui.layout.j r5 = (androidx.compose.p015ui.layout.C1689j) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)     // Catch:{ all -> 0x0032 }
            goto L_0x00d2
        L_0x0032:
            r13 = move-exception
            goto L_0x00fa
        L_0x0035:
            java.lang.Object r0 = r12.L$0
            kotlin.Pair r0 = (kotlin.Pair) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)     // Catch:{ all -> 0x003e }
            goto L_0x010a
        L_0x003e:
            r13 = move-exception
            goto L_0x011b
        L_0x0041:
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.d0 r13 = (kotlinx.coroutines.C19525d0) r13
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r1 = r12.this$0
            androidx.compose.ui.layout.j r1 = r1.f1893d
            if (r1 == 0) goto L_0x0055
            boolean r6 = r1.mo6685c()
            if (r6 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = r2
        L_0x0056:
            if (r1 != 0) goto L_0x005b
            kotlin.m r13 = kotlin.C19394m.f43287a
            return r13
        L_0x005b:
            androidx.compose.ui.layout.j r6 = r12.$childCoordinates
            boolean r6 = r6.mo6685c()
            if (r6 != 0) goto L_0x0066
            kotlin.m r13 = kotlin.C19394m.f43287a
            return r13
        L_0x0066:
            androidx.compose.ui.layout.j r6 = r12.$childCoordinates
            y.d r7 = r12.$rect
            r8 = 0
            y.d r6 = r1.mo6689v(r6, r8)
            float r9 = r6.f18301a
            float r6 = r6.f18302b
            long r9 = kotlin.reflect.C19421p.m32952q(r9, r6)
            y.d r6 = r7.mo20930e(r9)
            kotlin.coroutines.CoroutineContext r13 = r13.getCoroutineContext()
            kotlinx.coroutines.g1 r13 = androidx.compose.p015ui.text.input.C1993m.m4345F(r13)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r6, r13)
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r13 = r12.this$0
            kotlin.Pair<y.d, ? extends kotlinx.coroutines.g1> r9 = r13.f1888f
            r13.f1888f = r7
            if (r9 == 0) goto L_0x00fc
            java.lang.Object r13 = r9.getFirst()     // Catch:{ all -> 0x011d }
            y.d r13 = (p288y.C8345d) r13     // Catch:{ all -> 0x011d }
            float r10 = r13.f18301a     // Catch:{ all -> 0x011d }
            float r11 = r6.f18301a     // Catch:{ all -> 0x011d }
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x00b7
            float r10 = r13.f18302b     // Catch:{ all -> 0x011d }
            float r11 = r6.f18302b     // Catch:{ all -> 0x011d }
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x00b7
            float r10 = r13.f18303c     // Catch:{ all -> 0x011d }
            float r11 = r6.f18303c     // Catch:{ all -> 0x011d }
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 < 0) goto L_0x00b7
            float r13 = r13.f18304d     // Catch:{ all -> 0x011d }
            float r6 = r6.f18304d     // Catch:{ all -> 0x011d }
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x00b7
            r8 = r5
        L_0x00b7:
            if (r8 != 0) goto L_0x00ba
            goto L_0x00fc
        L_0x00ba:
            java.lang.Object r13 = r9.getSecond()     // Catch:{ all -> 0x011d }
            kotlinx.coroutines.g1 r13 = (kotlinx.coroutines.C19699g1) r13     // Catch:{ all -> 0x011d }
            r12.L$0 = r1     // Catch:{ all -> 0x011d }
            r12.L$1 = r7     // Catch:{ all -> 0x011d }
            r12.L$2 = r9     // Catch:{ all -> 0x011d }
            r12.label = r4     // Catch:{ all -> 0x011d }
            java.lang.Object r13 = r13.mo72394c0(r12)     // Catch:{ all -> 0x011d }
            if (r13 != r0) goto L_0x00cf
            return r0
        L_0x00cf:
            r5 = r1
            r4 = r7
            r1 = r9
        L_0x00d2:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r13 = r12.this$0     // Catch:{ all -> 0x0032 }
            kotlin.Pair<y.d, ? extends kotlinx.coroutines.g1> r6 = r13.f1889g     // Catch:{ all -> 0x0032 }
            if (r6 != r1) goto L_0x00e9
            r12.L$0 = r4     // Catch:{ all -> 0x0032 }
            r12.L$1 = r2     // Catch:{ all -> 0x0032 }
            r12.L$2 = r2     // Catch:{ all -> 0x0032 }
            r12.label = r3     // Catch:{ all -> 0x0032 }
            java.lang.Object r13 = androidx.compose.foundation.relocation.BringIntoViewResponderModifier.m1933b(r13, r4, r5, r12)     // Catch:{ all -> 0x0032 }
            if (r13 != r0) goto L_0x00e7
            return r0
        L_0x00e7:
            r0 = r4
        L_0x00e8:
            r4 = r0
        L_0x00e9:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r13 = r12.this$0
            kotlin.Pair<y.d, ? extends kotlinx.coroutines.g1> r0 = r13.f1889g
            kotlin.Pair<y.d, ? extends kotlinx.coroutines.g1> r1 = r13.f1888f
            if (r0 != r1) goto L_0x00f3
            r13.f1889g = r2
        L_0x00f3:
            if (r1 != r4) goto L_0x00f7
            r13.f1888f = r2
        L_0x00f7:
            kotlin.m r13 = kotlin.C19394m.f43287a
            return r13
        L_0x00fa:
            r7 = r4
            goto L_0x011e
        L_0x00fc:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r13 = r12.this$0     // Catch:{ all -> 0x011d }
            r12.L$0 = r7     // Catch:{ all -> 0x011d }
            r12.label = r5     // Catch:{ all -> 0x011d }
            java.lang.Object r13 = androidx.compose.foundation.relocation.BringIntoViewResponderModifier.m1933b(r13, r7, r1, r12)     // Catch:{ all -> 0x011d }
            if (r13 != r0) goto L_0x0109
            return r0
        L_0x0109:
            r0 = r7
        L_0x010a:
            kotlin.m r13 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x003e }
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r1 = r12.this$0
            kotlin.Pair<y.d, ? extends kotlinx.coroutines.g1> r3 = r1.f1889g
            kotlin.Pair<y.d, ? extends kotlinx.coroutines.g1> r4 = r1.f1888f
            if (r3 != r4) goto L_0x0116
            r1.f1889g = r2
        L_0x0116:
            if (r4 != r0) goto L_0x011a
            r1.f1888f = r2
        L_0x011a:
            return r13
        L_0x011b:
            r7 = r0
            goto L_0x011e
        L_0x011d:
            r13 = move-exception
        L_0x011e:
            androidx.compose.foundation.relocation.BringIntoViewResponderModifier r0 = r12.this$0
            kotlin.Pair<y.d, ? extends kotlinx.coroutines.g1> r1 = r0.f1889g
            kotlin.Pair<y.d, ? extends kotlinx.coroutines.g1> r3 = r0.f1888f
            if (r1 != r3) goto L_0x0128
            r0.f1889g = r2
        L_0x0128:
            if (r3 != r7) goto L_0x012c
            r0.f1888f = r2
        L_0x012c:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
