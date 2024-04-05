package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class AbstractPersistentList$retainAll$1 extends Lambda implements C19857l<Object, Boolean> {
    public final /* synthetic */ Collection<Object> $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractPersistentList$retainAll$1(Collection<Object> collection) {
        super(1);
        this.$elements = collection;
    }

    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(!this.$elements.contains(obj));
    }
}
