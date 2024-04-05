package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19747k;
import p753kq.C19857l;

final class Latch$await$2$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C19747k<C19394m> $co;
    public final /* synthetic */ C1300c0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Latch$await$2$2(C1300c0 c0Var, C19747k<? super C19394m> kVar) {
        super(1);
        this.this$0 = c0Var;
        this.$co = kVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C1300c0 c0Var = this.this$0;
        Object obj = c0Var.f2816a;
        C19747k<C19394m> kVar = this.$co;
        synchronized (obj) {
            c0Var.f2817b.remove(kVar);
            C19394m mVar = C19394m.f43287a;
        }
    }
}
