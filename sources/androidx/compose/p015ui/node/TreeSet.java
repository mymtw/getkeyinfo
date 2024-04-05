package androidx.compose.p015ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.node.TreeSet */
public final class TreeSet<E> extends java.util.TreeSet<E> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TreeSet(Comparator<? super E> comparator) {
        super(comparator);
        C19383o.m32797g(comparator, "comparator");
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
