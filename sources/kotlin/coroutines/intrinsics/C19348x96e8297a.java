package kotlin.coroutines.intrinsics;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 */
public final class C19348x96e8297a extends RestrictedContinuationImpl {
    public final /* synthetic */ C19857l<C19340c<Object>, Object> $block;
    private int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19348x96e8297a(C19340c<Object> cVar, C19857l<? super C19340c<Object>, ? extends Object> lVar) {
        super(cVar);
        this.$block = lVar;
        C19383o.m32795e(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C0761x.m1684O0(obj);
            return this.$block.invoke(this);
        } else if (i == 1) {
            this.label = 2;
            C0761x.m1684O0(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
