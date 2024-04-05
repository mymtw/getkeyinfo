package com.etsy.android;

import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.toolbar.AdminToolbarJSONActivity;
import com.etsy.android.p327ui.cart.C9326n;
import com.etsy.android.p327ui.cart.clicklisteners.C9274e;
import com.etsy.android.p327ui.cart.saved.StandaloneSavedCartItemsFragment;
import com.etsy.android.p327ui.cart.viewholders.C9405s;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.conversation.details.ccm.C9510o;
import com.etsy.android.p327ui.conversation.details.models.ConversationResponse;
import com.etsy.android.p327ui.conversation.details.models.Message;
import com.etsy.android.p327ui.favorites.add.AddToListPresenter;
import com.etsy.android.p327ui.favorites.add.C9775p;
import com.etsy.android.p327ui.nav.NotificationActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p348fc.C12715a;
import p354gc.C12764c;
import p486y9.C13887c;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.b */
public final /* synthetic */ class C6331b implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f14113b;

    /* renamed from: c */
    public final /* synthetic */ Object f14114c;

    public /* synthetic */ C6331b(Object obj, int i) {
        this.f14113b = i;
        this.f14114c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f14113b) {
            case 0:
                ((BOEApplication) this.f14114c).lambda$onCreate$1((C13887c) obj);
                return;
            case 1:
                AdminToolbarJSONActivity.m34877onCreate$lambda7$lambda6((AdminToolbarJSONActivity) this.f14114c, (Throwable) obj);
                return;
            case 2:
                C9274e eVar = (C9274e) this.f14114c;
                C9326n nVar = (C9326n) obj;
                C19383o.m32797g(eVar, "this$0");
                if (nVar instanceof C9326n.C9328b) {
                    CartPage cartPage = ((C9326n.C9328b) nVar).f20599a;
                    C9274e.C9276b bVar = eVar.f20488e;
                    if (bVar instanceof C9274e.C9276b.C9280d) {
                        String invalidShopCouponError = cartPage.getInvalidShopCouponError(((C9274e.C9276b.C9280d) bVar).f20497b);
                        if (C18263b.m30839d0(invalidShopCouponError)) {
                            eVar.mo31607b(invalidShopCouponError);
                            return;
                        }
                        C19857l<? super CartPage, C19394m> lVar = eVar.f20489f;
                        if (lVar != null) {
                            lVar.invoke(cartPage);
                        }
                        eVar.mo31606a();
                        return;
                    }
                    return;
                } else if (nVar instanceof C9326n.C9327a) {
                    eVar.mo31607b(((C9326n.C9327a) nVar).f20598b);
                    return;
                } else {
                    return;
                }
            case 3:
                StandaloneSavedCartItemsFragment.m34928onCreateView$lambda1((StandaloneSavedCartItemsFragment) this.f14114c, (String) obj);
                return;
            case 4:
                C9405s sVar = (C9405s) this.f14114c;
                int i = C9405s.f20842n;
                sVar.getClass();
                int i2 = ((CharSequence) obj).length() < 150 ? 8 : 0;
                if (i2 != sVar.f20846f.getVisibility()) {
                    sVar.f20846f.setVisibility(i2);
                    return;
                }
                return;
            case 5:
                C9510o oVar = (C9510o) this.f14114c;
                ConversationResponse conversationResponse = (ConversationResponse) obj;
                C19383o.m32797g(oVar, "this$0");
                C9477c cVar = oVar.f21087b;
                C19383o.m32796f(conversationResponse, "conversation");
                C12715a b = C12764c.m20411b(conversationResponse);
                List<Message> list = conversationResponse.f21174c.f21212c;
                ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
                for (Message c : list) {
                    arrayList.add(C12764c.m20412c(c));
                }
                cVar.mo31977i(b, arrayList);
                return;
            case 6:
                AddToListPresenter addToListPresenter = (AddToListPresenter) this.f14114c;
                C19383o.m32797g(addToListPresenter, "this$0");
                if (((C9775p) obj) instanceof C9775p.C9778c) {
                    addToListPresenter.mo32712d();
                    return;
                } else {
                    addToListPresenter.mo32711c();
                    return;
                }
            default:
                NotificationActivity.m35025onStart$lambda0((NotificationActivity) this.f14114c, (Long) obj);
                return;
        }
    }
}
