package kotlinx.coroutines.selects;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.selects.WhileSelectKt", mo70541f = "WhileSelect.kt", mo70542l = {37}, mo70543m = "whileSelect")
final class WhileSelectKt$whileSelect$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public WhileSelectKt$whileSelect$1(C19340c<? super WhileSelectKt$whileSelect$1> cVar) {
        super(cVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r5.result = r6
            int r6 = r5.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r0
            r5.label = r6
            r1 = r6 & r0
            if (r1 == 0) goto L_0x0012
            int r6 = r6 - r0
            r5.label = r6
            r6 = r5
            goto L_0x0017
        L_0x0012:
            kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 r6 = new kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1
            r6.<init>(r5)
        L_0x0017:
            java.lang.Object r0 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            java.lang.Object r2 = r6.L$0
            kq.l r2 = (p753kq.C19857l) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x0051
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            r0 = 0
            r2 = r0
        L_0x0037:
            r6.L$0 = r2
            r6.label = r3
            kotlinx.coroutines.selects.a r0 = new kotlinx.coroutines.selects.a
            r0.<init>(r6)
            r2.invoke(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r4 = move-exception
            r0.mo72630H(r4)
        L_0x0048:
            java.lang.Object r0 = r0.mo72629G()
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r0 != r1) goto L_0x0051
            goto L_0x005c
        L_0x0051:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005a
            goto L_0x0037
        L_0x005a:
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
