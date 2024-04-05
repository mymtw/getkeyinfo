package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.flow.internal.C19626c;
import p753kq.C19861p;

public final class CallbackFlowBuilder<T> extends C19594c<T> {

    /* renamed from: f */
    public final C19861p<C19513o<? super T>, C19340c<? super C19394m>, Object> f43508f;

    public CallbackFlowBuilder(C19861p<? super C19513o<? super T>, ? super C19340c<? super C19394m>, ? extends Object> pVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(pVar, coroutineContext, i, bufferOverflow);
        this.f43508f = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72260f(kotlinx.coroutines.channels.C19513o<? super T> r5, kotlin.coroutines.C19340c<? super kotlin.C19394m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.C19513o) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0048
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            r0.L$0 = r5
            r0.label = r3
            kq.p<kotlinx.coroutines.channels.o<? super T>, kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r6 = r4.f43563e
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            kotlin.m r6 = kotlin.C19394m.f43287a
        L_0x0045:
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            boolean r5 = r5.mo72189F()
            if (r5 == 0) goto L_0x0051
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x0051:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CallbackFlowBuilder.mo72260f(kotlinx.coroutines.channels.o, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g */
    public final C19626c<T> mo72261g(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f43508f, coroutineContext, i, bufferOverflow);
    }
}
