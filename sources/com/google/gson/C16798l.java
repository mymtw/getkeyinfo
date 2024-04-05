package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.gson.l */
public final class C16798l extends C16800n implements Iterable<C16800n> {

    /* renamed from: b */
    public final ArrayList f37121b = new ArrayList();

    /* renamed from: e */
    public final String mo59630e() {
        if (this.f37121b.size() == 1) {
            return ((C16800n) this.f37121b.get(0)).mo59630e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C16798l) && ((C16798l) obj).f37121b.equals(this.f37121b));
    }

    public final int hashCode() {
        return this.f37121b.hashCode();
    }

    public final Iterator<C16800n> iterator() {
        return this.f37121b.iterator();
    }
}
