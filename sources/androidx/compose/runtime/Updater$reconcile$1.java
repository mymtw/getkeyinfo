package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class Updater$reconcile$1 extends Lambda implements C19861p<Object, C19394m, C19394m> {
    public final /* synthetic */ C19857l<Object, C19394m> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Updater$reconcile$1(C19857l<Object, C19394m> lVar) {
        super(2);
        this.$block = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(obj, (C19394m) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(Object obj, C19394m mVar) {
        C19383o.m32797g(mVar, "it");
        this.$block.invoke(obj);
    }
}
