package com.etsy.android.p327ui.search;

import com.etsy.android.lib.requests.apiv3.SearchHistoryEndpoint;
import com.etsy.android.p327ui.search.p330v2.C11026g;
import com.etsy.android.p327ui.search.p330v2.C11028i;
import com.etsy.android.p327ui.shop.C11248v;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p350fe.C12741o;
import p444se.C13375a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.search.g */
public final class C10864g implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f24093a;

    /* renamed from: b */
    public final C19011a f24094b;

    /* renamed from: c */
    public final C19011a f24095c;

    public /* synthetic */ C10864g(C19011a aVar, C19011a aVar2, int i) {
        this.f24093a = i;
        this.f24094b = aVar;
        this.f24095c = aVar2;
    }

    public final Object get() {
        switch (this.f24093a) {
            case 0:
                return new SearchHistoryRepository((SearchHistoryEndpoint) this.f24094b.get(), (CoroutineDispatcher) this.f24095c.get());
            case 1:
                return new C11028i((C11026g) this.f24094b.get(), (C17414y) this.f24095c.get());
            default:
                return new C11248v((C12741o) this.f24094b.get(), (C13375a) this.f24095c.get());
        }
    }
}
