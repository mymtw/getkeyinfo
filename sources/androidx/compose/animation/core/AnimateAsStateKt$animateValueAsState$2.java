package androidx.compose.animation.core;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.C19499d;
import p753kq.C19846a;

final class AnimateAsStateKt$animateValueAsState$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C19499d<Object> $channel;
    public final /* synthetic */ Object $targetValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2(C19499d<Object> dVar, Object obj) {
        super(0);
        this.$channel = dVar;
        this.$targetValue = obj;
    }

    public final void invoke() {
        this.$channel.mo72199l(this.$targetValue);
    }
}
