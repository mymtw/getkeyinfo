package com.etsy.android.lib.network.oauth2.signin;

import com.etsy.android.lib.network.oauth2.C8744a;
import com.etsy.android.lib.network.oauth2.C8761k;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations.TranslateReviewClickedHandler;
import dagger.internal.C17555d;
import p342ed.C12683b;
import p456ua.C13461f;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.p */
public final class C8789p implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19339a;

    /* renamed from: b */
    public final C19011a f19340b;

    /* renamed from: c */
    public final C19011a f19341c;

    /* renamed from: d */
    public final C19011a f19342d;

    /* renamed from: e */
    public final C19011a f19343e;

    public /* synthetic */ C8789p(C19011a aVar, C17555d dVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f19339a = i;
        this.f19340b = aVar;
        this.f19341c = dVar;
        this.f19342d = aVar2;
        this.f19343e = aVar3;
    }

    public final Object get() {
        switch (this.f19339a) {
            case 0:
                return new OAuth2SignInViewModel((C13461f) this.f19340b.get(), (C8744a) this.f19341c.get(), (C8786n) this.f19342d.get(), (C8761k) this.f19343e.get());
            default:
                return new TranslateReviewClickedHandler((C12683b) this.f19340b.get(), (C13461f) this.f19341c.get(), (C13573c) this.f19342d.get(), (C10101d) this.f19343e.get());
        }
    }
}
