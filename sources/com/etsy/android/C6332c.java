package com.etsy.android;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.currency.C8637h;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.oauth2.AccessTokens;
import com.etsy.android.lib.network.oauth2.C8744a;
import com.etsy.android.lib.network.oauth2.C8767q;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.C9905g0;
import com.etsy.android.p327ui.cart.clicklisteners.C9274e;
import com.etsy.android.p327ui.favorites.add.AddToListPresenter;
import com.etsy.android.p327ui.nav.NotificationActivity;
import java.util.Currency;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p346fa.C12703a;

/* renamed from: com.etsy.android.c */
public final /* synthetic */ class C6332c implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f14115b;

    /* renamed from: c */
    public final /* synthetic */ Object f14116c;

    public /* synthetic */ C6332c(Object obj, int i) {
        this.f14115b = i;
        this.f14116c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f14115b) {
            case 0:
                ((BOEApplication) this.f14116c).lambda$onCreate$2((Throwable) obj);
                return;
            case 1:
                C8637h hVar = (C8637h) this.f14116c;
                String str = (String) obj;
                C19383o.m32797g(hVar, "this$0");
                try {
                    Currency.getInstance(hVar.f18982a.mo46719c());
                    return;
                } catch (IllegalArgumentException unused) {
                    C8694h hVar2 = hVar.f18984c;
                    StringBuilder h = C0072d.m201h("invalid currency for locale ");
                    h.append(hVar.f18982a.mo46719c());
                    h.append(" in deviceCurrency");
                    hVar2.mo21306a(h.toString());
                    C12703a aVar = hVar.f18985d;
                    StringBuilder h2 = C0072d.m201h("currency.invalid_device_currency_for_locale_");
                    h2.append(hVar.f18982a.mo46719c());
                    aVar.mo45474a(h2.toString());
                    return;
                }
            case 2:
                C8767q qVar = (C8767q) this.f14116c;
                AccessTokens accessTokens = (AccessTokens) obj;
                C19383o.m32797g(qVar, "this$0");
                C8744a aVar2 = qVar.f19284e;
                C19383o.m32796f(accessTokens, "accessTokens");
                aVar2.mo30070a(accessTokens);
                return;
            case 3:
                ((BOEActivity) this.f14116c).observeUpgradePrompt((C9905g0) obj);
                return;
            case 4:
                C9274e eVar = (C9274e) this.f14116c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(eVar, "this$0");
                eVar.mo31607b((String) null);
                return;
            case 5:
                AddToListPresenter addToListPresenter = (AddToListPresenter) this.f14116c;
                Throwable th2 = (Throwable) obj;
                C19383o.m32797g(addToListPresenter, "this$0");
                addToListPresenter.mo32711c();
                return;
            default:
                NotificationActivity.m35026onStart$lambda1((NotificationActivity) this.f14116c, (Throwable) obj);
                return;
        }
    }
}
