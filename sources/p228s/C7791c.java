package p228s;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.Collection;
import p753kq.C19857l;
import p755lq.C19875a;

/* renamed from: s.c */
public interface C7791c<E> extends C7788a<E>, Collection, C19875a {
    /* renamed from: B */
    C7791c<E> mo5762B(int i);

    C7791c<E> add(int i, E e);

    C7791c<E> add(E e);

    C7791c<E> addAll(Collection<? extends E> collection);

    PersistentVectorBuilder builder();

    /* renamed from: f0 */
    C7791c<E> mo5769f0(C19857l<? super E, Boolean> lVar);

    C7791c<E> remove(E e);

    C7791c<E> removeAll(Collection<? extends E> collection);

    C7791c<E> set(int i, E e);
}
