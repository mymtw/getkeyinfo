package p239t;

import java.util.Iterator;
import kotlin.collections.C19313f;
import kotlin.jvm.internal.C19383o;

/* renamed from: t.i */
public final class C7921i<K, V> extends C19313f<K> {

    /* renamed from: b */
    public final C7917e<K, V> f17389b;

    public C7921i(C7917e<K, V> eVar) {
        C19383o.m32797g(eVar, "builder");
        this.f17389b = eVar;
    }

    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f17389b.clear();
    }

    public final boolean contains(Object obj) {
        return this.f17389b.containsKey(obj);
    }

    public final int getSize() {
        return this.f17389b.mo20413c();
    }

    public final Iterator<K> iterator() {
        return new C7922j(this.f17389b);
    }

    public final boolean remove(Object obj) {
        if (!this.f17389b.containsKey(obj)) {
            return false;
        }
        this.f17389b.remove(obj);
        return true;
    }
}
