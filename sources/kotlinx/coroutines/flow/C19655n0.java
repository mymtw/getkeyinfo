package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import com.google.android.gms.common.api.Api;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import p753kq.C19861p;

/* renamed from: kotlinx.coroutines.flow.n0 */
public final /* synthetic */ class C19655n0 {

    /* renamed from: a */
    public static final /* synthetic */ int f43604a = 0;

    static {
        C0761x.m1680M0((long) 16, (long) 1, (long) Api.BaseClientBuilder.API_PRIORITY_OTHER, "kotlinx.coroutines.flow.defaultConcurrency");
    }

    /* renamed from: a */
    public static final ChannelFlowTransformLatest m33426a(C19597d dVar, C19861p pVar) {
        return new ChannelFlowTransformLatest(new FlowKt__MergeKt$mapLatest$1(pVar, (C19340c<? super FlowKt__MergeKt$mapLatest$1>) null), dVar, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }
}
