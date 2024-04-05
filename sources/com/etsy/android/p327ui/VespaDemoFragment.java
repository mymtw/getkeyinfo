package com.etsy.android.p327ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.cart.CartErrorResolution;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.cart.C9329o;
import com.etsy.android.p327ui.cart.C9332q;
import com.etsy.android.p327ui.cart.C9333r;
import com.etsy.android.p327ui.cart.C9422z;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.PositionList;
import com.etsy.android.vespa.VespaBaseFragment;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p415of.C13173c;
import p425q9.C13258i;
import p440s9.C13366a;
import p445sf.C13379a;
import p445sf.C13382d;
import p456ua.C13461f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;

/* renamed from: com.etsy.android.ui.VespaDemoFragment */
public class VespaDemoFragment extends VespaBaseFragment implements C9333r, C9731e0.C9732a, C13366a {
    private final String MOCK_FILE_CARD_VIEW_DEMO_PAGE = "card_view_demo_page";
    private final String MOCK_FILE_EXPLORE_DEMO_PAGE = "explore_demo_page";
    private final String MOCK_FILE_MAIN_VESPA_DEMO_PAGE = "vespa_demo_page";
    private final String MOCK_FILE_MULTISHOP_CART_DEMO_PAGE = "multishop_demo_page";
    private final String MOCK_FILE_ONBOARDING_DEMO_PAGE = "onboarding_demo_page";
    private final String MOCK_FILE_SAVED_FOR_LATER_DEMO_PAGE = "saved_for_later_demo_page";
    public C8267e adImpressionRepository;
    public C9329o cartScrollEventDelegate;
    public C9332q cartViewEligibility;
    public C12724a deepLinkEligibility;
    public C13851a deepLinkEntityChecker;
    public C11780h favoriteRepository;
    private String mMockFileName;
    public C12741o routeInspector;
    public C13461f rxSchedulers;
    public C10865h searchUriParser;

    public String getApiUrl() {
        return "";
    }

    public String getFragmentTitleString() {
        return "BOE Vespa Demo";
    }

    public C13379a getPagination() {
        return new C13382d();
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        String string = requireArguments().getString("mock_file");
        if (TextUtils.isEmpty(string)) {
            this.mMockFileName = "vespa_demo_page";
        } else {
            this.mMockFileName = string;
        }
        String str = this.mMockFileName;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1858341814:
                if (str.equals("saved_for_later_demo_page")) {
                    c = 0;
                    break;
                }
                break;
            case -1781699393:
                if (str.equals("explore_demo_page")) {
                    c = 1;
                    break;
                }
                break;
            case -1622614457:
                if (str.equals("onboarding_demo_page")) {
                    c = 2;
                    break;
                }
                break;
            case 765274843:
                if (str.equals("multishop_demo_page")) {
                    c = 3;
                    break;
                }
                break;
            case 1799860064:
                if (str.equals("card_view_demo_page")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
                View view = onCreateView;
                C13799a.C13800a aVar = new C13799a.C13800a();
                aVar.f30377a = this;
                C13173c adapter = getAdapter();
                C19383o.m32797g(adapter, "value");
                aVar.f30378b = adapter;
                C11780h hVar = this.favoriteRepository;
                C19383o.m32797g(hVar, "value");
                aVar.f30380d = hVar;
                C13461f fVar = this.rxSchedulers;
                C19383o.m32797g(fVar, "value");
                aVar.f30381e = fVar;
                C8703p analyticsContext = getAnalyticsContext();
                C19383o.m32797g(analyticsContext, "value");
                aVar.f30379c = analyticsContext;
                C8267e eVar = this.adImpressionRepository;
                C19383o.m32797g(eVar, "value");
                aVar.f30384h = eVar;
                C12724a aVar2 = this.deepLinkEligibility;
                C19383o.m32797g(aVar2, "value");
                aVar.f30385i = aVar2;
                C12741o oVar = this.routeInspector;
                C19383o.m32797g(oVar, "value");
                aVar.f30386j = oVar;
                C13851a aVar3 = this.deepLinkEntityChecker;
                C19383o.m32797g(aVar3, "value");
                aVar.f30387k = aVar3;
                C10865h hVar2 = this.searchUriParser;
                C19383o.m32797g(hVar2, "value");
                aVar.f30388l = hVar2;
                addDelegateViewHolderFactory(new C13801b(aVar.mo46660a()));
                return view;
            case 3:
                C13799a.C13800a aVar4 = new C13799a.C13800a();
                aVar4.f30377a = this;
                C13173c adapter2 = getAdapter();
                C19383o.m32797g(adapter2, "value");
                aVar4.f30378b = adapter2;
                C11780h hVar3 = this.favoriteRepository;
                C19383o.m32797g(hVar3, "value");
                aVar4.f30380d = hVar3;
                C8703p analyticsContext2 = getAnalyticsContext();
                C19383o.m32797g(analyticsContext2, "value");
                aVar4.f30379c = analyticsContext2;
                aVar4.f30382f = this;
                aVar4.f30383g = new ListingCardViewHolderOptions.C11971e(0, getAnalyticsContext().f19116n);
                C13461f fVar2 = this.rxSchedulers;
                C19383o.m32797g(fVar2, "value");
                aVar4.f30381e = fVar2;
                C8267e eVar2 = this.adImpressionRepository;
                C19383o.m32797g(eVar2, "value");
                aVar4.f30384h = eVar2;
                C12724a aVar5 = this.deepLinkEligibility;
                C19383o.m32797g(aVar5, "value");
                aVar4.f30385i = aVar5;
                C12741o oVar2 = this.routeInspector;
                C19383o.m32797g(oVar2, "value");
                aVar4.f30386j = oVar2;
                C13851a aVar6 = this.deepLinkEntityChecker;
                C19383o.m32797g(aVar6, "value");
                aVar4.f30387k = aVar6;
                C10865h hVar4 = this.searchUriParser;
                C19383o.m32797g(hVar4, "value");
                aVar4.f30388l = hVar4;
                View view2 = onCreateView;
                C9422z zVar = r0;
                C9422z zVar2 = new C9422z(this, getAnalyticsContext(), this.cartScrollEventDelegate, this, this.cartViewEligibility, this.favoriteRepository, this.rxSchedulers, new C13801b(aVar4.mo46660a()), this.adImpressionRepository, this.deepLinkEligibility, this.routeInspector, this.deepLinkEntityChecker, this.searchUriParser);
                addDelegateViewHolderFactory(zVar);
                return view2;
            default:
                return onCreateView;
        }
    }

    public void onLoadContent() {
        int identifier = getResources().getIdentifier(this.mMockFileName, "raw", getActivity().getPackageName());
        char c = 65535;
        if (identifier == -1) {
            showErrorView();
            return;
        }
        try {
            InputStream openRawResource = getActivity().getResources().openRawResource(identifier);
            byte[] bArr = new byte[openRawResource.available()];
            openRawResource.read(bArr);
            JsonParser a = C13258i.f29122d.mo45955a(bArr);
            a.nextToken();
            String str = this.mMockFileName;
            if (str.hashCode() == 765274843) {
                if (str.equals("multishop_demo_page")) {
                    c = 0;
                }
            }
            Page page = c != 0 ? new Page() : new CartPage();
            page.parseData(a);
            onLoadComplete(page);
            this.adapter.notifyDataSetChanged();
        } catch (IOException e) {
            e.printStackTrace();
            showErrorView();
        }
    }

    public void proceedToCheckout(String str, String str2) {
    }

    public void requestGPay(GooglePayData googlePayData) {
    }

    public void showAddShopCouponDialog(PositionList positionList, ServerDrivenAction serverDrivenAction) {
        C8694h.f19097a.mo21310e(positionList.toString());
    }

    public void showApplyCouponDialog(CartGroupItem cartGroupItem, PositionList positionList) {
        C8694h.f19097a.mo21310e(positionList.toString());
    }

    public void showSelectShippingDestinationDialog(PositionList positionList, ServerDrivenAction serverDrivenAction, CartErrorResolution cartErrorResolution) {
        C8694h.f19097a.mo21310e(positionList.toString());
    }

    public void showVariationSelectDialog(PositionList positionList, ServerDrivenAction serverDrivenAction) {
        C8694h.f19097a.mo21310e(positionList.toString());
    }
}
