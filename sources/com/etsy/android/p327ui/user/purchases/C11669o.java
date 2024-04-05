package com.etsy.android.p327ui.user.purchases;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2843a0;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.LightWeightListingLike;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.LandingPageKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import com.etsy.android.p327ui.user.purchases.module.C11656a;
import com.etsy.android.p327ui.user.purchases.module.C11662c;
import com.etsy.android.p327ui.user.purchases.module.C11663d;
import com.etsy.android.util.C12059p;
import com.etsy.android.vespa.VespaBottomSheetDialog;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaToggleState;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p119g9.C6897b;
import p338df.C12651b;
import p338df.C12652c;
import p338df.C12653d;
import p338df.C12654e;
import p356ge.C12790b;

/* renamed from: com.etsy.android.ui.user.purchases.o */
public final /* synthetic */ class C11669o implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f25835b;

    /* renamed from: c */
    public final /* synthetic */ Object f25836c;

    public /* synthetic */ C11669o(Object obj, int i) {
        this.f25835b = i;
        this.f25836c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f25835b) {
            case 0:
                C11672r rVar = (C11672r) this.f25836c;
                C19383o.m32797g(rVar, "this$0");
                C11656a aVar = (C11656a) ((C12059p) obj).mo38935a();
                boolean z = true;
                if (aVar instanceof C11656a.C11660d) {
                    C11663d dVar = rVar.f25850m;
                    Fragment fragment = rVar.f25838a.getFragment();
                    C11656a.C11660d dVar2 = (C11656a.C11660d) aVar;
                    long j = dVar2.f25806a;
                    String str = dVar2.f25807b;
                    dVar.getClass();
                    C19383o.m32797g(fragment, "fragment");
                    dVar.f25812a.mo21333d("purchasesreviews_tapped_listing", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(j)), new Pair(PredefinedAnalyticsProperty.CONTENT_SOURCE, str)));
                    C12790b.m20430b(fragment, new ListingKey(C12790b.m20432d(fragment), new EtsyId(j), false, false, (Bundle) null, 28, (DefaultConstructorMarker) null));
                    return;
                } else if (aVar instanceof C11656a.C11659c) {
                    C11663d dVar3 = rVar.f25850m;
                    Fragment fragment2 = rVar.f25838a.getFragment();
                    C11656a.C11659c cVar = (C11656a.C11659c) aVar;
                    String str2 = cVar.f25803a;
                    String str3 = cVar.f25804b;
                    String str4 = cVar.f25805c;
                    dVar3.getClass();
                    C19383o.m32797g(fragment2, "fragment");
                    C19383o.m32797g(str2, "title");
                    C19383o.m32797g(str3, "apiPath");
                    C19383o.m32797g(str4, "eventName");
                    dVar3.f25812a.mo21333d("purchasesreviews_tapped_view_all", (Map<? extends AnalyticsProperty, Object>) null);
                    C12790b.m20430b(fragment2, new LandingPageKey(C12790b.m20432d(fragment2), LandingPageLink.Companion.from(str2, str3, "listings", str4), (Bundle) null, 4, (DefaultConstructorMarker) null));
                    return;
                } else if (aVar instanceof C11656a.C11658b) {
                    FragmentActivity fragmentActivity = rVar.f25838a.getFragmentActivity();
                    if (fragmentActivity != null) {
                        C11663d dVar4 = rVar.f25850m;
                        C11656a.C11658b bVar = (C11656a.C11658b) aVar;
                        long j2 = bVar.f25799a;
                        String str5 = bVar.f25800b;
                        boolean z2 = bVar.f25801c;
                        boolean z3 = bVar.f25802d;
                        dVar4.getClass();
                        if (fragmentActivity instanceof C6897b) {
                            C6897b bVar2 = (C6897b) fragmentActivity;
                            boolean z4 = !z3 && !z2;
                            if (z3 || !z2) {
                                z = false;
                            }
                            LightWeightListingLike lightWeightListingLike = new LightWeightListingLike(new EtsyId(j2), (String) null, (EtsyMoney) null, (String) null, (ListingImage) null, (String) null, (EtsyId) null, z2, z3);
                            if (z4 || z) {
                                bVar2.getFavoriteHandler().mo19010a(lightWeightListingLike, fragmentActivity, new C11662c(dVar4, j2, str5));
                                return;
                            } else {
                                bVar2.getFavoriteHandler().mo19011b(lightWeightListingLike, fragmentActivity);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (aVar instanceof C11656a.C11657a) {
                    C11663d dVar5 = rVar.f25850m;
                    Fragment fragment3 = rVar.f25838a.getFragment();
                    C12654e eVar = ((C11656a.C11657a) aVar).f25798a;
                    dVar5.getClass();
                    C19383o.m32797g(fragment3, "fragment");
                    C19383o.m32797g(eVar, ResponseConstants.LISTING);
                    dVar5.f25812a.mo21333d("listing_card_long_pressed", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(eVar.f27908a)), new Pair(PredefinedAnalyticsProperty.CONTENT_SOURCE, eVar.f27910c)));
                    C12653d dVar6 = dVar5.f25813b;
                    dVar6.getClass();
                    VespaBottomSheetDialog vespaBottomSheetDialog = new VespaBottomSheetDialog(fragment3, dVar6.f27906a);
                    C9126k.C9127a aVar2 = C12653d.f27904c;
                    Resources resources = fragment3.getResources();
                    C19383o.m32796f(resources, "fragment.resources");
                    vespaBottomSheetDialog.addItems(aVar2.mo31352a(resources, eVar.f27913f));
                    vespaBottomSheetDialog.setOnCancelListener(new C12651b(dVar6.f27906a, eVar));
                    vespaBottomSheetDialog.registerItemClickHandler(C12653d.f27905d, new C12652c(fragment3, dVar6.f27906a, dVar6, eVar, vespaBottomSheetDialog));
                    vespaBottomSheetDialog.show();
                    return;
                } else {
                    return;
                }
            case 1:
                PayPalBillingAgreementsToggle.m35232listenForShowEvents$lambda6((PayPalBillingAgreementsToggle) this.f25836c, (BaToggleState) obj);
                return;
            case 2:
                ShippingView.m35389initViewModelObservers$lambda0((ShippingView) this.f25836c, (Boolean) obj);
                return;
            default:
                HomeFragment.m35411initPYPLHomeViewModelObservers$lambda10((HomeFragment) this.f25836c, (Boolean) obj);
                return;
        }
    }
}
