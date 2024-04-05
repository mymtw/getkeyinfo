package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", mo70541f = "SharingStarted.kt", mo70542l = {178, 180, 182, 183, 185}, mo70543m = "invokeSuspend")
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements C19862q<C19600e<? super SharingCommand>, Integer, C19340c<? super C19394m>, Object> {
    public /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StartedWhileSubscribed this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, C19340c<? super StartedWhileSubscribed$command$1> cVar) {
        super(3, cVar);
        this.this$0 = startedWhileSubscribed;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C19600e<? super SharingCommand>) (C19600e) obj, ((Number) obj2).intValue(), (C19340c<? super C19394m>) (C19340c) obj3);
    }

    public final Object invoke(C19600e<? super SharingCommand> eVar, int i, C19340c<? super C19394m> cVar) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, cVar);
        startedWhileSubscribed$command$1.L$0 = eVar;
        startedWhileSubscribed$command$1.I$0 = i;
        return startedWhileSubscribed$command$1.invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 == r6) goto L_0x0036
            if (r1 == r5) goto L_0x002e
            if (r1 == r4) goto L_0x0026
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            goto L_0x0036
        L_0x0016:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001e:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C19600e) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            goto L_0x0086
        L_0x0026:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C19600e) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            goto L_0x0077
        L_0x002e:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C19600e) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            goto L_0x0060
        L_0x0036:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            goto L_0x0094
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            java.lang.Object r10 = r9.L$0
            r1 = r10
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C19600e) r1
            int r10 = r9.I$0
            if (r10 <= 0) goto L_0x0051
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.START
            r9.label = r6
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L_0x0094
            return r0
        L_0x0051:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
            long r6 = r10.f43557a
            r9.L$0 = r1
            r9.label = r5
            java.lang.Object r10 = p628nj.C18263b.m30814I(r6, r9)
            if (r10 != r0) goto L_0x0060
            return r0
        L_0x0060:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
            long r5 = r10.f43558b
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0086
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
            r9.L$0 = r1
            r9.label = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L_0x0077
            return r0
        L_0x0077:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
            long r4 = r10.f43558b
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = p628nj.C18263b.m30814I(r4, r9)
            if (r10 != r0) goto L_0x0086
            return r0
        L_0x0086:
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r3 = 0
            r9.L$0 = r3
            r9.label = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L_0x0094
            return r0
        L_0x0094:
            kotlin.m r10 = kotlin.C19394m.f43287a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
