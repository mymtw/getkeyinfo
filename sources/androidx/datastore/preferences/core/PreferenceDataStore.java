package androidx.datastore.preferences.core;

import androidx.datastore.core.C2478e;
import androidx.datastore.core.SingleProcessDataStore;
import kotlin.coroutines.C19340c;
import kotlinx.coroutines.flow.C19597d;
import p753kq.C19861p;

public final class PreferenceDataStore implements C2478e<C2493b> {

    /* renamed from: a */
    public final C2478e<C2493b> f5763a;

    public PreferenceDataStore(SingleProcessDataStore singleProcessDataStore) {
        this.f5763a = singleProcessDataStore;
    }

    /* renamed from: a */
    public final Object mo9303a(C19861p<? super C2493b, ? super C19340c<? super C2493b>, ? extends Object> pVar, C19340c<? super C2493b> cVar) {
        return this.f5763a.mo9303a(new PreferenceDataStore$updateData$2(pVar, (C19340c<? super PreferenceDataStore$updateData$2>) null), cVar);
    }

    public final C19597d<C2493b> getData() {
        return this.f5763a.getData();
    }
}
