package androidx.compose.p015ui.tooling.data;

import java.lang.reflect.Field;
import java.util.Comparator;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.tooling.data.g */
public final class C2064g<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C18263b.m30880z(((Field) t).getName(), ((Field) t2).getName());
    }
}
