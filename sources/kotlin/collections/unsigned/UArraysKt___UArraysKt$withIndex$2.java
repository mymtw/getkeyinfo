package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.C19356i;
import kotlin.C19368j;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class UArraysKt___UArraysKt$withIndex$2 extends Lambda implements C19846a<Iterator<? extends C19356i>> {
    public final /* synthetic */ long[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UArraysKt___UArraysKt$withIndex$2(long[] jArr) {
        super(0);
        this.$this_withIndex = jArr;
    }

    public final Iterator<C19356i> invoke() {
        return new C19368j(this.$this_withIndex);
    }
}
