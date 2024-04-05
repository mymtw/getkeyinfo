package com.etsy.android.lib.network;

import androidx.activity.C0114h;
import androidx.work.C3437q;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.elk.uploading.C8687h;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.search.SearchSuggestionsRepository;
import com.etsy.android.p327ui.search.toplevelcategories.C10955a;
import com.etsy.android.p327ui.search.toplevelcategories.C10959d;
import com.etsy.android.p327ui.search.toplevelcategories.C10966f;
import com.etsy.android.p327ui.user.inappnotifications.UpdatesEligibility;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p040c9.C4591k;
import p409o9.C13135n;
import p491ye.C13919c;
import p491ye.C13921e;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.v */
public final class C8812v implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19361a;

    /* renamed from: b */
    public final C19011a f19362b;

    /* renamed from: c */
    public final C19011a f19363c;

    /* renamed from: d */
    public final Object f19364d;

    public /* synthetic */ C8812v(C19011a aVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f19361a = i;
        this.f19362b = aVar;
        this.f19363c = aVar2;
        this.f19364d = aVar3;
    }

    public final Object get() {
        switch (this.f19361a) {
            case 0:
                return new C8810u((C13135n) this.f19362b.get(), (C8890e0) this.f19363c.get(), (C8618c) ((C19011a) this.f19364d).get());
            case 1:
                return new C10966f((SearchSuggestionsRepository) this.f19362b.get(), (C10955a) this.f19363c.get(), (C10959d) ((C19011a) this.f19364d).get());
            case 2:
                return new C13919c((C13921e) this.f19362b.get(), (C8890e0) this.f19363c.get(), (UpdatesEligibility) ((C19011a) this.f19364d).get());
            default:
                C8618c cVar = (C8618c) this.f19362b.get();
                C3437q qVar = (C3437q) this.f19363c.get();
                ((C0114h) this.f19364d).getClass();
                C19383o.m32797g(cVar, "configMap");
                C19383o.m32797g(qVar, "workManager");
                return new C8687h(cVar, qVar);
        }
    }

    public C8812v(C0114h hVar, C4591k kVar, C19011a aVar) {
        this.f19361a = 3;
        this.f19364d = hVar;
        this.f19362b = kVar;
        this.f19363c = aVar;
    }
}
