package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C19370b;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ArraysKt___ArraysKt$withIndex$2 extends Lambda implements C19846a<Iterator<? extends Byte>> {
    public final /* synthetic */ byte[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$2(byte[] bArr) {
        super(0);
        this.$this_withIndex = bArr;
    }

    public final Iterator<Byte> invoke() {
        byte[] bArr = this.$this_withIndex;
        C19383o.m32797g(bArr, "array");
        return new C19370b(bArr);
    }
}
