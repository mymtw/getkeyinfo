package com.etsy.android.lib.network.oauth2.signin;

import android.content.Context;
import androidx.activity.result.C0123f;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10530c;
import com.etsy.android.p327ui.user.C11760s;
import dagger.internal.C17555d;
import p350fe.C12741o;
import p428qc.C13294e;
import p458uc.C13466a;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.f */
public final class C8777f implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19317a;

    /* renamed from: b */
    public final C19011a f19318b;

    /* renamed from: c */
    public final C19011a f19319c;

    public /* synthetic */ C8777f(C19011a aVar, C19011a aVar2, int i) {
        this.f19317a = i;
        this.f19318b = aVar;
        this.f19319c = aVar2;
    }

    public final Object get() {
        switch (this.f19317a) {
            case 0:
                return new C8776e((Context) this.f19318b.get(), (C0123f) this.f19319c.get());
            case 1:
                return new C13466a((C12741o) this.f19318b.get(), (C13294e) this.f19319c.get());
            case 2:
                return new C10530c((C13573c) this.f19318b.get(), (C8623e) this.f19319c.get());
            default:
                return new C11760s((C12741o) this.f19318b.get(), (C13294e) this.f19319c.get());
        }
    }
}
