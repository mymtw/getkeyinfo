package com.google.common.collect;

import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.Multimaps;

/* renamed from: com.google.common.collect.f1 */
public final class C16169f1 extends MultimapBuilder.C16053a<Object, Object> {

    /* renamed from: a */
    public final /* synthetic */ int f36265a = 2;

    /* renamed from: b */
    public final /* synthetic */ MultimapBuilder.C16054b f36266b;

    public C16169f1(MultimapBuilder.C16054b bVar) {
        this.f36266b = bVar;
    }

    /* renamed from: a */
    public final <K, V> C16219s0<K, V> mo57660a() {
        return new Multimaps.CustomListMultimap(this.f36266b.mo57170a(), new MultimapBuilder.ArrayListSupplier(this.f36265a));
    }
}
