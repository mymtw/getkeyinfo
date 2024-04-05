package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C19371c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ArraysKt___ArraysKt$withIndex$9 extends Lambda implements C19846a<Iterator<? extends Character>> {
    public final /* synthetic */ char[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$9(char[] cArr) {
        super(0);
        this.$this_withIndex = cArr;
    }

    public final Iterator<Character> invoke() {
        char[] cArr = this.$this_withIndex;
        C19383o.m32797g(cArr, "array");
        return new C19371c(cArr);
    }
}
