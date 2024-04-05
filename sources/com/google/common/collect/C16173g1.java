package com.google.common.collect;

import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.collect.g1 */
public final class C16173g1 extends Multisets.C16064a<Object> {

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f36268b;

    public C16173g1(Map.Entry entry) {
        this.f36268b = entry;
    }

    public final int getCount() {
        return ((Collection) this.f36268b.getValue()).size();
    }

    public final Object getElement() {
        return this.f36268b.getKey();
    }
}
