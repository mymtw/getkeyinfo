package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C19372d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ArraysKt___ArraysKt$withIndex$7 extends Lambda implements C19846a<Iterator<? extends Double>> {
    public final /* synthetic */ double[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$7(double[] dArr) {
        super(0);
        this.$this_withIndex = dArr;
    }

    public final Iterator<Double> invoke() {
        double[] dArr = this.$this_withIndex;
        C19383o.m32797g(dArr, "array");
        return new C19372d(dArr);
    }
}
