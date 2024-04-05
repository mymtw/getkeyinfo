package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.channels.C19503g;

/* renamed from: kotlinx.coroutines.channels.h */
public final /* synthetic */ class C19506h {
    /* renamed from: a */
    public static final Object m33189a(C19513o oVar, Object obj) {
        Object l = oVar.mo72199l(obj);
        if (l instanceof C19503g.C19505b) {
            return ((C19503g) C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new ChannelsKt__ChannelsKt$trySendBlocking$2(oVar, obj, (C19340c<? super ChannelsKt__ChannelsKt$trySendBlocking$2>) null))).f43450a;
        }
        C19394m mVar = (C19394m) l;
        return C19394m.f43287a;
    }
}
