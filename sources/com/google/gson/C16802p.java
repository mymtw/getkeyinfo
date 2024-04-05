package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* renamed from: com.google.gson.p */
public final class C16802p extends C16800n {

    /* renamed from: b */
    public final LinkedTreeMap<String, C16800n> f37123b = new LinkedTreeMap<>();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C16802p) && ((C16802p) obj).f37123b.equals(this.f37123b));
    }

    public final int hashCode() {
        return this.f37123b.hashCode();
    }
}
