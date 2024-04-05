package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C19374f;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ArraysKt___ArraysKt$withIndex$4 extends Lambda implements C19846a<Iterator<? extends Integer>> {
    public final /* synthetic */ int[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$4(int[] iArr) {
        super(0);
        this.$this_withIndex = iArr;
    }

    public final Iterator<Integer> invoke() {
        int[] iArr = this.$this_withIndex;
        C19383o.m32797g(iArr, "array");
        return new C19374f(iArr);
    }
}
