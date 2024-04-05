package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C19373e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ArraysKt___ArraysKt$withIndex$6 extends Lambda implements C19846a<Iterator<? extends Float>> {
    public final /* synthetic */ float[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$6(float[] fArr) {
        super(0);
        this.$this_withIndex = fArr;
    }

    public final Iterator<Float> invoke() {
        float[] fArr = this.$this_withIndex;
        C19383o.m32797g(fArr, "array");
        return new C19373e(fArr);
    }
}
