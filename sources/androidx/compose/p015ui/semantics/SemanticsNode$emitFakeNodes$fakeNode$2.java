package androidx.compose.p015ui.semantics;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2 */
final class SemanticsNode$emitFakeNodes$fakeNode$2 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ String $contentDescription;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemanticsNode$emitFakeNodes$fakeNode$2(String str) {
        super(1);
        this.$contentDescription = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$fakeSemanticsNode");
        C1908o.m4200g(qVar, this.$contentDescription);
    }
}
