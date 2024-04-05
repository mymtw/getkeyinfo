package kotlin.coroutines.intrinsics;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import p753kq.C19861p;

/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 */
public final class C19347xa50de663 extends ContinuationImpl {
    public final /* synthetic */ Object $receiver$inlined;
    public final /* synthetic */ C19861p $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19347xa50de663(C19340c cVar, CoroutineContext coroutineContext, C19861p pVar, Object obj) {
        super(cVar, coroutineContext);
        this.$this_createCoroutineUnintercepted$inlined = pVar;
        this.$receiver$inlined = obj;
        C19383o.m32795e(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C0761x.m1684O0(obj);
            C19383o.m32795e(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
            C19861p pVar = this.$this_createCoroutineUnintercepted$inlined;
            C19389t.m32910d(2, pVar);
            return pVar.invoke(this.$receiver$inlined, this);
        } else if (i == 1) {
            this.label = 2;
            C0761x.m1684O0(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
