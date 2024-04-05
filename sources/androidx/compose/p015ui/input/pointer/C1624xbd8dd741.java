package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilter;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", mo70541f = "SuspendingPointerInputFilter.kt", mo70542l = {617, 618}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 */
public final class C1624xbd8dd741 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ long $timeMillis;
    public int label;
    public final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1624xbd8dd741(long j, SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, C19340c<? super C1624xbd8dd741> cVar) {
        super(2, cVar);
        this.$timeMillis = j;
        this.this$0 = pointerEventHandlerCoroutine;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new C1624xbd8dd741(this.$timeMillis, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((C1624xbd8dd741) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 1
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r5) goto L_0x001a
            if (r1 != r4) goto L_0x0012
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x0036
        L_0x0012:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x002d
        L_0x001e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            long r6 = r8.$timeMillis
            long r6 = r6 - r2
            r8.label = r5
            java.lang.Object r9 = p628nj.C18263b.m30814I(r6, r8)
            if (r9 != r0) goto L_0x002d
            return r0
        L_0x002d:
            r8.label = r4
            java.lang.Object r9 = p628nj.C18263b.m30814I(r2, r8)
            if (r9 != r0) goto L_0x0036
            return r0
        L_0x0036:
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<R> r9 = r8.this$0
            kotlinx.coroutines.k<? super androidx.compose.ui.input.pointer.l> r9 = r9.f3618d
            if (r9 == 0) goto L_0x004e
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            long r1 = r8.$timeMillis
            r0.<init>(r1)
            kotlin.Result$Failure r0 = androidx.compose.foundation.layout.C0761x.m1673J(r0)
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)
            r9.resumeWith(r0)
        L_0x004e:
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.pointer.C1624xbd8dd741.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
