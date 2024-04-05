package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;
import p496za.C13943a;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.g */
public final class C10582g {

    /* renamed from: a */
    public final C13943a f23191a;

    public C10582g(C13943a aVar) {
        C19383o.m32797g(aVar, "sharedPreferencesProvider");
        this.f23191a = aVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo34186a(C13597g.C13651h3 h3Var) {
        C19383o.m32797g(h3Var, "event");
        C13943a aVar = this.f23191a;
        String str = h3Var.f30139a;
        aVar.getClass();
        C19383o.m32797g(str, "countryIso");
        SharedPreferences.Editor edit = aVar.f30662a.getSharedPreferences("EtsyUserPrefs", 0).edit();
        edit.putString("shippingAddressCountryIso", str);
        edit.apply();
        C13943a aVar2 = this.f23191a;
        String str2 = h3Var.f30140b;
        if (str2 == null) {
            str2 = "";
        }
        aVar2.getClass();
        SharedPreferences.Editor edit2 = aVar2.f30662a.getSharedPreferences("EtsyUserPrefs", 0).edit();
        edit2.putString("shippingAddressZIP", str2);
        edit2.apply();
        return C13574d.C13575a.f29662a;
    }
}
