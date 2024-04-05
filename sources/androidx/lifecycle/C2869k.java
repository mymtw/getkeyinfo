package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.CallbackFlowBuilder;

/* renamed from: androidx.lifecycle.k */
public final class C2869k {
    /* renamed from: a */
    public static final CallbackFlowBuilder m6799a(C19597d dVar, Lifecycle lifecycle, Lifecycle.State state) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(state, "minActiveState");
        return new CallbackFlowBuilder(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, dVar, (C19340c<? super FlowExtKt$flowWithLifecycle$1>) null), EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }
}
