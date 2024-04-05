package com.google.common.collect;

import com.google.common.collect.C16178h1;
import com.google.common.collect.Multisets;
import java.util.Iterator;

/* renamed from: com.google.common.collect.q */
public final class C16211q extends Multisets.C16066c<Object> {

    /* renamed from: b */
    public final /* synthetic */ C16215r f36311b;

    public C16211q(C16215r rVar) {
        this.f36311b = rVar;
    }

    /* renamed from: a */
    public final C16178h1<Object> mo56398a() {
        return this.f36311b;
    }

    public final Iterator<C16178h1.C16179a<Object>> iterator() {
        return C16175h.this.descendingEntryIterator();
    }

    public final int size() {
        return C16175h.this.entrySet().size();
    }
}
