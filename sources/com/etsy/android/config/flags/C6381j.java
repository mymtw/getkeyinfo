package com.etsy.android.config.flags;

import com.etsy.android.lib.network.C8727d;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.network.oauth2.C8748c;
import com.etsy.android.p327ui.home.landingpage.C10036i;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.handlers.PersonalizationRequiredToggledHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers.FaqsPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10536h;
import com.etsy.android.p327ui.user.addresses.C11391b0;
import com.etsy.android.p327ui.user.auth.C11476d;
import com.etsy.android.p327ui.user.auth.C11484j;
import com.etsy.android.p327ui.user.help.C11529b;
import com.etsy.android.p327ui.user.help.C11531d;
import dagger.internal.C17554c;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p350fe.C12741o;
import p445sf.C13380b;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.config.flags.j */
public final class C6381j implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f14206a;

    /* renamed from: b */
    public final Object f14207b;

    public /* synthetic */ C6381j(Object obj, int i) {
        this.f14206a = i;
        this.f14207b = obj;
    }

    public final Object get() {
        switch (this.f14206a) {
            case 0:
                return new ConfigFlagsViewModel(C17554c.m29426a((C19011a) this.f14207b));
            case 1:
                C8727d dVar = (C8727d) ((C19011a) this.f14207b).get();
                C19383o.m32797g(dVar, "retrofit");
                Object b = dVar.f19172a.mo74387b(C8748c.class);
                C19383o.m32796f(b, "retrofit.moshiOAuth2Retr…angeEndpoint::class.java)");
                return (C8748c) b;
            case 2:
                return new C10036i((C12741o) ((C19011a) this.f14207b).get());
            case 3:
                return new PersonalizationRequiredToggledHandler((C13573c) ((C19011a) this.f14207b).get());
            case 4:
                return new FaqsPanelClickedHandler((C13573c) ((C19011a) this.f14207b).get());
            case 5:
                return new C10536h((C13573c) ((C19011a) this.f14207b).get());
            case 6:
                C8731g gVar = (C8731g) ((C19011a) this.f14207b).get();
                C19383o.m32797g(gVar, "retrofit");
                Object b2 = gVar.f19177a.mo74387b(C11391b0.class);
                C19383o.m32796f(b2, "retrofit.v3moshiRetrofit…ssesEndpoint::class.java)");
                return (C11391b0) b2;
            case 7:
                return new C11476d((C11484j) ((C19011a) this.f14207b).get());
            case 8:
                return new C11529b((C11531d) ((C19011a) this.f14207b).get());
            default:
                ((C19382n) this.f14207b).getClass();
                return new C13380b();
        }
    }
}
