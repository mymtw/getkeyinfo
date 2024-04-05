package kotlin.text;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class Regex$findAll$1 extends Lambda implements C19846a<C19451e> {
    public final /* synthetic */ CharSequence $input;
    public final /* synthetic */ int $startIndex;
    public final /* synthetic */ Regex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$findAll$1(Regex regex, CharSequence charSequence, int i) {
        super(0);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$startIndex = i;
    }

    public final C19451e invoke() {
        return this.this$0.find(this.$input, this.$startIndex);
    }
}
