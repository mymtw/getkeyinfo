package kotlin.text;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p764pq.C20057i;

final class StringsKt__StringsKt$splitToSequence$2 extends Lambda implements C19857l<C20057i, String> {
    public final /* synthetic */ CharSequence $this_splitToSequence;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$splitToSequence$2(CharSequence charSequence) {
        super(1);
        this.$this_splitToSequence = charSequence;
    }

    public final String invoke(C20057i iVar) {
        C19383o.m32797g(iVar, "it");
        return C19459m.m33028A1(this.$this_splitToSequence, iVar);
    }
}
