package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p753kq.C19846a;
import p753kq.C19861p;

final class ComposerImpl$doCompose$2$5 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ Object $savedContent;
    public final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$doCompose$2$5(C19861p<? super C1302d, ? super Integer, C19394m> pVar, ComposerImpl composerImpl, Object obj) {
        super(0);
        this.$content = pVar;
        this.this$0 = composerImpl;
        this.$savedContent = obj;
    }

    public final void invoke() {
        if (this.$content != null) {
            this.this$0.mo5468v0(200, ComposerKt.f2753f);
            ComposerImpl composerImpl = this.this$0;
            C19861p<C1302d, Integer, C19394m> pVar = this.$content;
            C19383o.m32797g(composerImpl, "composer");
            C19383o.m32797g(pVar, "composable");
            C19389t.m32910d(2, pVar);
            pVar.invoke(composerImpl, 1);
            this.this$0.mo5418R(false);
            return;
        }
        this.this$0.getClass();
        ComposerImpl composerImpl2 = this.this$0;
        if (composerImpl2.f2732r.isEmpty()) {
            composerImpl2.f2726l = composerImpl2.f2695D.mo5635m() + composerImpl2.f2726l;
            return;
        }
        C1298b1 b1Var = composerImpl2.f2695D;
        int e = b1Var.mo5627e();
        int i = b1Var.f2810f;
        Object j = i < b1Var.f2811g ? b1Var.mo5632j(i, b1Var.f2806b) : null;
        Object d = b1Var.mo5626d();
        composerImpl2.mo5395B0(e, j, d);
        composerImpl2.mo5474y0((Object) null, C0005b.m68y(b1Var.f2810f, b1Var.f2806b));
        composerImpl2.mo5445j0();
        b1Var.mo5625c();
        composerImpl2.mo5397C0(e, j, d);
    }
}
