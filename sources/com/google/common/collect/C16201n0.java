package com.google.common.collect;

import androidx.appcompat.widget.C0326j;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.n0 */
public final class C16201n0 {
    @CanIgnoreReturnValue
    /* renamed from: a */
    public static boolean m26210a(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return Iterators.m25978a(collection, iterable.iterator());
    }

    /* renamed from: b */
    public static <T> T m26211b(Iterable<T> iterable) {
        T next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator<T> it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: c */
    public static <T> T m26212c(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public static String m26213d(Iterable<?> iterable) {
        StringBuilder k = C0326j.m866k('[');
        boolean z = true;
        for (Object append : iterable) {
            if (!z) {
                k.append(", ");
            }
            z = false;
            k.append(append);
        }
        k.append(']');
        return k.toString();
    }
}
