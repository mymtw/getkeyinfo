package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.models.apiv3.inappnotifications.IANTooltip;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.favorites.add.AddToListPresenter;
import com.etsy.android.p327ui.favorites.add.C9760d0;
import com.etsy.android.p327ui.listing.ListingViewModel;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10384d;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10385e;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.CardType;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.PaymentMethod;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.ShippingAddress;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.ShippingMethod;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.SubtotalLineItem;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState;
import com.etsy.android.p327ui.user.CurrencySelectFragment;
import com.etsy.android.p327ui.user.ReceiptFragment;
import com.etsy.android.p327ui.util.countries.CountrySelectorFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p145io.reactivex.functions.Consumer;
import p400mf.C13074b;
import p418pa.C13198d;
import p466vc.C13573c;
import p466vc.C13597g;
import p514bk.C14088a;
import p568fn.C17782b;

/* renamed from: com.etsy.android.lib.network.oauth2.p */
public final /* synthetic */ class C8766p implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f19278b;

    /* renamed from: c */
    public final /* synthetic */ Object f19279c;

    public /* synthetic */ C8766p(Object obj, int i) {
        this.f19278b = i;
        this.f19279c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f19278b) {
            case 0:
                C8767q qVar = (C8767q) this.f19279c;
                AccessTokens accessTokens = (AccessTokens) obj;
                C19383o.m32797g(qVar, "this$0");
                C8744a aVar = qVar.f19284e;
                C19383o.m32796f(accessTokens, "accessTokens");
                aVar.mo30070a(accessTokens);
                return;
            case 1:
                C13198d dVar = (C13198d) this.f19279c;
                Throwable th = (Throwable) obj;
                Map<String, Integer> map = C13198d.f29029f;
                C19383o.m32797g(dVar, "this$0");
                dVar.f29035e.onNext(C13198d.C13199a.C13200a.f29036a);
                return;
            case 2:
                ((BOEActivity) this.f19279c).showTooltip((IANTooltip) obj);
                return;
            case 3:
                AddToListPresenter addToListPresenter = (AddToListPresenter) this.f19279c;
                C19383o.m32797g(addToListPresenter, "this$0");
                if (((C9760d0) obj) instanceof C9760d0.C9762b) {
                    addToListPresenter.mo32712d();
                    return;
                } else {
                    addToListPresenter.mo32711c();
                    return;
                }
            case 4:
                ListingViewModel listingViewModel = (ListingViewModel) this.f19279c;
                C13074b bVar = (C13074b) obj;
                C19383o.m32797g(listingViewModel, "this$0");
                C13573c cVar = listingViewModel.f22222c;
                C19383o.m32796f(bVar, "heartUpdate");
                cVar.mo38043a(new C13597g.C13649h1(bVar));
                return;
            case 5:
                C10384d dVar2 = (C10384d) this.f19279c;
                Long l = (Long) obj;
                C19383o.m32797g(dVar2, "this$0");
                ArrayList f0 = C17782b.m29866f0(new ShippingMethod("Standard international", "Estimated delivery: Apr 4 - Apr 6", "FREE"), new ShippingMethod("Fast international", "Estimated delivery: Apr 2 - Apr 3", "$124.93"), new ShippingMethod("Santa Clause", "Estimated delivery: Dec 25", "$40.40"));
                List e0 = C17782b.m29865e0(new ShippingAddress("John Smith", "117 Prospect St, Brooklyn, NY 11201"), new ShippingAddress("Joe Schmoe", "Way down, Kokomo, HI 99998"), new ShippingAddress("Jane Doe", "217 Adams St, Brooklyn, NY 11201"));
                List e02 = C17782b.m29865e0(new PaymentMethod("VISA", "•••• 1212", CardType.VISA), new PaymentMethod("MasterCard", "•••• 4567", CardType.MASTERCARD), new PaymentMethod("Credit Card", "•••• 0303", CardType.GENERIC));
                ShippingMethod shippingMethod = r3;
                ShippingMethod shippingMethod2 = new ShippingMethod("Standard international shipping", "Estimated delivery: Feb 15 - Apr 6", "$56.12");
                ShippingAddress shippingAddress = r3;
                ShippingAddress shippingAddress2 = new ShippingAddress("John Smith", "117 Prospect St, Brooklyn, NY 11201");
                PaymentMethod paymentMethod = r25;
                PaymentMethod paymentMethod2 = new PaymentMethod("Credit card", "•••• 1212", (CardType) null, 4, (DefaultConstructorMarker) null);
                dVar2.f22739c.setValue(new UiState.Summary("This is a listing title", "https://i.etsystatic.com/19025811/r/il/176320/2760054711/il_1588xN.2760054711_f2d6.jpg", "Personalization: Some personalization here", "Size: Large", "Color: Blue", 2, shippingMethod, shippingAddress, paymentMethod, C17782b.m29865e0(new SubtotalLineItem("Item(s)", "$95.66"), new SubtotalLineItem("Shop discount", "-$10.00"), new SubtotalLineItem("Shipping", "$5.00"), new SubtotalLineItem("Tax", "$2.31")), "$92.97", "Slide to confirm purchase", "By making a purchase, you agree to Etsy's <a href=\"/legal/terms-of-use\" title=\"Terms of Use\" data-article-id=\"25545769842\" class=\"text-link-secondary text-link-underline\">Terms of Use</a> and <a href=\"http://www.etsy.com/legal/privacy\" title=\"Privacy Policy\" data-article-id=\"25468388617\" class=\"text-link-secondary text-link-underline\">Privacy Policy</a>.", f0, e0, e02, false, 65536, (DefaultConstructorMarker) null));
                C14088a.m21780e(dVar2.f22740d, C10385e.C10393h.f22750a);
                return;
            case 6:
                ((CurrencySelectFragment) this.f19279c).lambda$updateUserPreference$2((Throwable) obj);
                return;
            case 7:
                ((ReceiptFragment) this.f19279c).handlePaymentError((Throwable) obj);
                return;
            default:
                CountrySelectorFragment.m35093initObservers$lambda1((CountrySelectorFragment) this.f19279c, (List) obj);
                return;
        }
    }
}
