package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class StringsKt___StringsKt$withIndex$1 extends Lambda implements C19846a<Iterator<? extends Character>> {
    public final /* synthetic */ CharSequence $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt___StringsKt$withIndex$1(CharSequence charSequence) {
        super(0);
        this.$this_withIndex = charSequence;
    }

    public final Iterator<Character> invoke() {
        CharSequence charSequence = this.$this_withIndex;
        C19383o.m32797g(charSequence, "<this>");
        return new C19458l(charSequence);
    }
}
