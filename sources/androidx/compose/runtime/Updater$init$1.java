package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class Updater$init$1 extends Lambda implements C19861p<T, C19394m, C19394m> {
    public final /* synthetic */ C19857l<T, C19394m> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Updater$init$1(C19857l<? super T, C19394m> lVar) {
        super(2);
        this.$block = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(obj, (C19394m) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(T t, C19394m mVar) {
        C19383o.m32797g(mVar, "it");
        this.$block.invoke(t);
    }
}
