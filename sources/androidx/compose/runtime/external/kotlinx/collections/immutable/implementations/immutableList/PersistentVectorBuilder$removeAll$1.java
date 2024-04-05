package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class PersistentVectorBuilder$removeAll$1 extends Lambda implements C19857l<E, Boolean> {
    public final /* synthetic */ Collection<E> $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentVectorBuilder$removeAll$1(Collection<? extends E> collection) {
        super(1);
        this.$elements = collection;
    }

    public final Boolean invoke(E e) {
        return Boolean.valueOf(this.$elements.contains(e));
    }
}
