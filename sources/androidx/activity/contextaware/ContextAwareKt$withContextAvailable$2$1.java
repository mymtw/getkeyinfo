package androidx.activity.contextaware;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p000a.C0000a;
import p000a.C0002c;
import p000a.C0003d;
import p753kq.C19857l;

public final class ContextAwareKt$withContextAvailable$2$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C0002c $listener;
    public final /* synthetic */ C0000a $this_withContextAvailable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextAwareKt$withContextAvailable$2$1(C0000a aVar, C0002c cVar) {
        super(1);
        this.$this_withContextAvailable = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.$this_withContextAvailable.removeOnContextAvailableListener((C0003d) null);
    }
}
