package com.google.common.collect;

import com.google.common.collect.EnumMultiset;
import com.google.common.collect.Multisets;

/* renamed from: com.google.common.collect.s */
public final class C16218s extends Multisets.C16064a<Enum<Object>> {

    /* renamed from: b */
    public final /* synthetic */ int f36319b;

    /* renamed from: c */
    public final /* synthetic */ EnumMultiset.C15936b f36320c;

    public C16218s(EnumMultiset.C15936b bVar, int i) {
        this.f36320c = bVar;
        this.f36319b = i;
    }

    public final int getCount() {
        return EnumMultiset.this.f35859f[this.f36319b];
    }

    public final Object getElement() {
        return EnumMultiset.this.f35858e[this.f36319b];
    }
}
