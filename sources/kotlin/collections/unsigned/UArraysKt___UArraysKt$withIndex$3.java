package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.C19352e;
import kotlin.C19353f;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class UArraysKt___UArraysKt$withIndex$3 extends Lambda implements C19846a<Iterator<? extends C19352e>> {
    public final /* synthetic */ byte[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UArraysKt___UArraysKt$withIndex$3(byte[] bArr) {
        super(0);
        this.$this_withIndex = bArr;
    }

    public final Iterator<C19352e> invoke() {
        return new C19353f(this.$this_withIndex);
    }
}
