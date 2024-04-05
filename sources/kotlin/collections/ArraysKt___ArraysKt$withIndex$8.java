package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C19369a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ArraysKt___ArraysKt$withIndex$8 extends Lambda implements C19846a<Iterator<? extends Boolean>> {
    public final /* synthetic */ boolean[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$8(boolean[] zArr) {
        super(0);
        this.$this_withIndex = zArr;
    }

    public final Iterator<Boolean> invoke() {
        boolean[] zArr = this.$this_withIndex;
        C19383o.m32797g(zArr, "array");
        return new C19369a(zArr);
    }
}
