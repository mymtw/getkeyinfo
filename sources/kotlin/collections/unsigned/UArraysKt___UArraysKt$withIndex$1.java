package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.C19354g;
import kotlin.C19355h;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class UArraysKt___UArraysKt$withIndex$1 extends Lambda implements C19846a<Iterator<? extends C19354g>> {
    public final /* synthetic */ int[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UArraysKt___UArraysKt$withIndex$1(int[] iArr) {
        super(0);
        this.$this_withIndex = iArr;
    }

    public final Iterator<C19354g> invoke() {
        return new C19355h(this.$this_withIndex);
    }
}
