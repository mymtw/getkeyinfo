package androidx.activity.compose;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BackHandlerKt$BackHandler$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C0108b $backCallback;
    public final /* synthetic */ boolean $enabled;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$1$1(C0108b bVar, boolean z) {
        super(0);
        this.$backCallback = bVar;
        this.$enabled = z;
    }

    public final void invoke() {
        this.$backCallback.f163a = this.$enabled;
    }
}
