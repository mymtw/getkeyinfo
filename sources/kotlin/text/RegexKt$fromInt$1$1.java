package kotlin.text;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class RegexKt$fromInt$1$1 extends Lambda implements C19857l<Enum<Object>, Boolean> {
    public final /* synthetic */ int $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegexKt$fromInt$1$1(int i) {
        super(1);
        this.$value = i;
    }

    public final Boolean invoke(Enum<Object> enumR) {
        C19449c cVar = (C19449c) enumR;
        return Boolean.valueOf((this.$value & cVar.getMask()) == cVar.getValue());
    }
}
