package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.C19392k;
import kotlin.C19393l;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class UArraysKt___UArraysKt$withIndex$4 extends Lambda implements C19846a<Iterator<? extends C19392k>> {
    public final /* synthetic */ short[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UArraysKt___UArraysKt$withIndex$4(short[] sArr) {
        super(0);
        this.$this_withIndex = sArr;
    }

    public final Iterator<C19392k> invoke() {
        return new C19393l(this.$this_withIndex);
    }
}
