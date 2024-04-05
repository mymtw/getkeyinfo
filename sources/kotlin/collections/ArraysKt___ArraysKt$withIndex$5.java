package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C19376h;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ArraysKt___ArraysKt$withIndex$5 extends Lambda implements C19846a<Iterator<? extends Long>> {
    public final /* synthetic */ long[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$5(long[] jArr) {
        super(0);
        this.$this_withIndex = jArr;
    }

    public final Iterator<Long> invoke() {
        long[] jArr = this.$this_withIndex;
        C19383o.m32797g(jArr, "array");
        return new C19376h(jArr);
    }
}
