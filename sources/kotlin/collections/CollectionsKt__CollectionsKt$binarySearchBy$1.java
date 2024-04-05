package kotlin.collections;

import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;

public final class CollectionsKt__CollectionsKt$binarySearchBy$1 extends Lambda implements C19857l<Object, Integer> {
    public final /* synthetic */ Comparable<Object> $key;
    public final /* synthetic */ C19857l<Object, Comparable<Object>> $selector;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(C19857l<Object, Comparable<Object>> lVar, Comparable<Object> comparable) {
        super(1);
        this.$selector = lVar;
        this.$key = comparable;
    }

    public final Integer invoke(Object obj) {
        return Integer.valueOf(C18263b.m30880z(this.$selector.invoke(obj), this.$key));
    }
}
