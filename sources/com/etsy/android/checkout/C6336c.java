package com.etsy.android.checkout;

import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.p327ui.cart.SavedCartItemsFragment;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import com.etsy.android.p327ui.favorites.add.AddToListPresenter;
import com.etsy.android.p327ui.user.CurrencySelectFragment;
import com.etsy.android.p327ui.user.profile.C11623a;
import com.etsy.android.p327ui.user.profile.UserProfileFragment;
import com.etsy.android.p327ui.util.countries.CountrySelectorFragment;
import com.etsy.android.util.C12069z;
import com.jakewharton.rxbinding2.widget.C17025m;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.checkout.c */
public final /* synthetic */ class C6336c implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f14120b;

    /* renamed from: c */
    public final /* synthetic */ Object f14121c;

    public /* synthetic */ C6336c(Object obj, int i) {
        this.f14120b = i;
        this.f14121c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f14120b) {
            case 0:
                C6337d dVar = (C6337d) this.f14121c;
                C19383o.m32797g(dVar, "this$0");
                dVar.f14124c.mo21309d("Abandon cart error", (Throwable) obj);
                dVar.f14125d.mo45474a("abandon_cart.register_failure");
                return;
            case 1:
                ((SavedCartItemsFragment) this.f14121c).processCartRefreshEvent((C9315k) obj);
                return;
            case 2:
                ConversationDetailsFragment.m34935onViewCreated$lambda2$lambda1((ConversationDetailsFragment) this.f14121c, (C17025m) obj);
                return;
            case 3:
                AddToListPresenter addToListPresenter = (AddToListPresenter) this.f14121c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(addToListPresenter, "this$0");
                addToListPresenter.mo32711c();
                return;
            case 4:
                ((CurrencySelectFragment) this.f14121c).onCurrencyLoaded((List) obj);
                return;
            case 5:
                ((UserProfileFragment) this.f14121c).lambda$fetchPageInfo$2((C11623a) obj);
                return;
            case 6:
                CountrySelectorFragment.m35094initObservers$lambda2((CountrySelectorFragment) this.f14121c, (Throwable) obj);
                return;
            default:
                C12069z zVar = (C12069z) this.f14121c;
                zVar.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    return;
                }
                if (!zVar.f26914a.mo30211e()) {
                    zVar.f26914a.mo30209c();
                    return;
                } else {
                    zVar.f26920g.mo19405d();
                    return;
                }
        }
    }
}
