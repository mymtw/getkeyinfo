package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.elk.uploading.C8691k;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.p327ui.conversation.details.C9532l;
import com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p336dc.C12646d;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p470w9.C13795c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.j */
public final class C9501j implements C17555d<ConversationDetailsViewModel> {

    /* renamed from: a */
    public final C19011a<C13461f> f21064a = C13462g.C13463a.f29482a;

    /* renamed from: b */
    public final C19011a<C8630b> f21065b;

    /* renamed from: c */
    public final C19011a<C13265p> f21066c;

    /* renamed from: d */
    public final C19011a<C11786n> f21067d;

    /* renamed from: e */
    public final C19011a<C9510o> f21068e;

    /* renamed from: f */
    public final C19011a<BottomNavStateRepo> f21069f;

    /* renamed from: g */
    public final C19011a<C12646d> f21070g;

    /* renamed from: h */
    public final C19011a<C9532l> f21071h;

    public C9501j(C19011a aVar, C17553b bVar, C8782j jVar, C19011a aVar2, C19011a aVar3, C8691k kVar, C13795c cVar) {
        this.f21065b = aVar;
        this.f21066c = bVar;
        this.f21067d = jVar;
        this.f21068e = aVar2;
        this.f21069f = aVar3;
        this.f21070g = kVar;
        this.f21071h = cVar;
    }

    public final Object get() {
        return new ConversationDetailsViewModel(this.f21064a.get(), this.f21065b.get(), this.f21066c.get(), this.f21067d.get(), this.f21068e.get(), this.f21069f.get(), this.f21070g.get(), this.f21071h.get());
    }
}
