package kotlin.coroutines.intrinsics;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import p753kq.C19857l;

/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2 */
public final class C19345xa50de661 extends ContinuationImpl {
    public final /* synthetic */ C19857l $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19345xa50de661(C19340c cVar, CoroutineContext coroutineContext, C19857l lVar) {
        super(cVar, coroutineContext);
        this.$this_createCoroutineUnintercepted$inlined = lVar;
        C19383o.m32795e(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C0761x.m1684O0(obj);
            C19383o.m32795e(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-0>, kotlin.Any?>");
            C19857l lVar = this.$this_createCoroutineUnintercepted$inlined;
            C19389t.m32910d(1, lVar);
            return lVar.invoke(this);
        } else if (i == 1) {
            this.label = 2;
            C0761x.m1684O0(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
