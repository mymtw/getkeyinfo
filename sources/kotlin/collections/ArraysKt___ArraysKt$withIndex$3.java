package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C19377i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ArraysKt___ArraysKt$withIndex$3 extends Lambda implements C19846a<Iterator<? extends Short>> {
    public final /* synthetic */ short[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$3(short[] sArr) {
        super(0);
        this.$this_withIndex = sArr;
    }

    public final Iterator<Short> invoke() {
        short[] sArr = this.$this_withIndex;
        C19383o.m32797g(sArr, "array");
        return new C19377i(sArr);
    }
}
