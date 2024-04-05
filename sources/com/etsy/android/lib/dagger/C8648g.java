package com.etsy.android.lib.dagger;

import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.p327ui.search.filters.refactor.C10855s;
import com.etsy.android.p327ui.search.filters.refactor.C10856t;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;
import com.google.firebase.perf.config.RemoteConfigManager;
import dagger.internal.C17555d;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.C19760n0;
import p514bk.C14088a;
import p560en.C17726a;
import p568fn.C17782b;
import p768rq.C20152a;

/* renamed from: com.etsy.android.lib.dagger.g */
public final class C8648g implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19009a;

    /* renamed from: b */
    public final Object f19010b;

    public /* synthetic */ C8648g(Object obj, int i) {
        this.f19009a = i;
        this.f19010b = obj;
    }

    public final Object get() {
        switch (this.f19009a) {
            case 0:
                ((C14088a) this.f19010b).getClass();
                C20152a aVar = C19760n0.f43720b;
                C17782b.m29841G(aVar);
                return aVar;
            case 1:
                ((C19543e0) this.f19010b).getClass();
                EmptyList emptyList = EmptyList.INSTANCE;
                return new C10855s(new C10856t((SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, emptyList, (SearchFiltersUiGroupItem.OtherOptions) null, emptyList, 1544), (FilterParams) null, (FacetCount) null);
            default:
                ((C17726a) this.f19010b).getClass();
                RemoteConfigManager instance = RemoteConfigManager.getInstance();
                C17782b.m29838E(instance);
                return instance;
        }
    }
}
