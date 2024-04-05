package kotlin.text;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class Regex$special$$inlined$fromInt$1 extends Lambda implements C19857l<RegexOption, Boolean> {
    public final /* synthetic */ int $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$special$$inlined$fromInt$1(int i) {
        super(1);
        this.$value = i;
    }

    public final Boolean invoke(RegexOption regexOption) {
        C19449c cVar = regexOption;
        return Boolean.valueOf((this.$value & cVar.getMask()) == cVar.getValue());
    }
}
