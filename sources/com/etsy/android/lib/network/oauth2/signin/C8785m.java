package com.etsy.android.lib.network.oauth2.signin;

import androidx.activity.result.C0123f;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.useraction.UserActionBus;
import com.etsy.android.p327ui.cart.saveforlater.SaveForLaterRepository;
import com.etsy.android.p327ui.cart.saveforlater.SaveForLaterViewModel;
import com.etsy.android.p327ui.home.home.C9990a;
import com.etsy.android.p327ui.home.home.C9994e;
import com.etsy.android.p327ui.util.C11786n;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p488yb.C13901c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.m */
public final class C8785m implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19334a;

    /* renamed from: b */
    public final C19011a f19335b;

    /* renamed from: c */
    public final C19011a f19336c;

    /* renamed from: d */
    public final C19011a f19337d;

    public /* synthetic */ C8785m(C19011a aVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f19334a = i;
        this.f19335b = aVar;
        this.f19336c = aVar2;
        this.f19337d = aVar3;
    }

    public final Object get() {
        switch (this.f19334a) {
            case 0:
                return new C8784l((FragmentActivity) this.f19335b.get(), (C0123f) this.f19336c.get(), (C8618c) this.f19337d.get());
            case 1:
                return new SaveForLaterViewModel((SaveForLaterRepository) this.f19335b.get(), (C13901c) this.f19336c.get(), (C11786n) this.f19337d.get());
            default:
                return new C9994e((C9990a) this.f19335b.get(), (UserActionBus) this.f19336c.get(), (C17414y) this.f19337d.get());
        }
    }
}
