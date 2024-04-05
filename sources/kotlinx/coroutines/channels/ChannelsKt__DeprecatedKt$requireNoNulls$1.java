package kotlinx.coroutines.channels;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.apache.commons.lang3.ClassUtils;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", mo70541f = "Deprecated.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$requireNoNulls$1 extends SuspendLambda implements C19861p {
    public final /* synthetic */ C19515q $this_requireNoNulls;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$requireNoNulls$1(C19515q qVar, C19340c cVar) {
        super(2, cVar);
        this.$this_requireNoNulls = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$requireNoNulls$1 channelsKt__DeprecatedKt$requireNoNulls$1 = new ChannelsKt__DeprecatedKt$requireNoNulls$1(this.$this_requireNoNulls, cVar);
        channelsKt__DeprecatedKt$requireNoNulls$1.L$0 = obj;
        return channelsKt__DeprecatedKt$requireNoNulls$1;
    }

    public final Object invoke(Object obj, C19340c cVar) {
        return ((ChannelsKt__DeprecatedKt$requireNoNulls$1) create(obj, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            Object obj2 = this.L$0;
            if (obj2 != null) {
                return obj2;
            }
            StringBuilder h = C0072d.m201h("null element found in ");
            h.append(this.$this_requireNoNulls);
            h.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            throw new IllegalArgumentException(h.toString());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
