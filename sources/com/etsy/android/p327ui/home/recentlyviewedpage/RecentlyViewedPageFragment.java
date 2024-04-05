package com.etsy.android.p327ui.home.recentlyviewedpage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.network.oauth2.C8758h;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.C10076i0;
import com.etsy.android.p327ui.conversation.details.ccm.C9498g;
import com.etsy.android.p327ui.home.landingpage.LandingPageFragment;
import com.etsy.android.p327ui.home.recentlyviewedpage.C10039b;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.util.C12059p;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p277w8.C8267e;
import p280x0.C8292f;
import p350fe.C12724a;
import p350fe.C12741o;
import p356ge.C12788a;
import p357gf.C12796e;
import p395ma.C13033c;
import p415of.C13173c;
import p456ua.C13461f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;
import p628nj.C18263b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.home.recentlyviewedpage.RecentlyViewedPageFragment */
public final class RecentlyViewedPageFragment extends LandingPageFragment {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C10043d recentlyViewedPageRepository;
    private final C19285c recentlyViewedPageViewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(C10045f.class), new RecentlyViewedPageFragment$special$$inlined$viewModels$default$2(new RecentlyViewedPageFragment$special$$inlined$viewModels$default$1(this)), new RecentlyViewedPageFragment$recentlyViewedPageViewModel$2(this));

    /* access modifiers changed from: private */
    public final void confirmClearRecentlyViewed() {
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C9056g gVar = new C9056g(requireContext);
        gVar.mo70029r(R.string.confirm_clear_recently_viewed_title);
        gVar.mo70023l(R.string.confirm_clear_recently_viewed);
        gVar.setPositiveButton(R.string.clear, new C10076i0(this, 1));
        gVar.setNegativeButton(R.string.cancel, new C10042c());
        gVar.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: confirmClearRecentlyViewed$lambda-2  reason: not valid java name */
    public static final void m34996confirmClearRecentlyViewed$lambda2(RecentlyViewedPageFragment recentlyViewedPageFragment, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(recentlyViewedPageFragment, "this$0");
        C10045f recentlyViewedPageViewModel = recentlyViewedPageFragment.getRecentlyViewedPageViewModel();
        C10043d dVar = recentlyViewedPageViewModel.f22103b;
        C10038a aVar = dVar.f22098b;
        String str = dVar.f22097a.f28895a;
        C19383o.m32796f(str, "installInfo.uuid");
        C8071s<C20145v<C19928a0>> a = aVar.mo33315a(str);
        C8758h hVar = new C8758h(dVar, 3);
        a.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(recentlyViewedPageViewModel.f22104c, C0472h.m1243e(recentlyViewedPageViewModel.f22104c, new C19211l(new C19208j(a, hVar), new C13033c(dVar, 1)))), new RecentlyViewedPageViewModel$clearRecentlyViewed$1(recentlyViewedPageViewModel), new RecentlyViewedPageViewModel$clearRecentlyViewed$2(recentlyViewedPageViewModel));
        C7091a aVar2 = recentlyViewedPageViewModel.f22105d;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(e);
    }

    /* access modifiers changed from: private */
    /* renamed from: confirmClearRecentlyViewed$lambda-3  reason: not valid java name */
    public static final void m34997confirmClearRecentlyViewed$lambda3(DialogInterface dialogInterface, int i) {
    }

    private final C10045f getRecentlyViewedPageViewModel() {
        return (C10045f) this.recentlyViewedPageViewModel$delegate.getValue();
    }

    private final void handleEvent(C10039b bVar) {
        if (bVar instanceof C10039b.C10041b) {
            onSuccess();
        } else if (bVar instanceof C10039b.C10040a) {
            onError();
        }
    }

    private final void onError() {
        Toast.makeText(requireActivity(), R.string.something_went_wrong, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m34998onViewCreated$lambda1(RecentlyViewedPageFragment recentlyViewedPageFragment, C12059p pVar) {
        C19383o.m32797g(recentlyViewedPageFragment, "this$0");
        C10039b bVar = (C10039b) pVar.mo38935a();
        if (bVar != null) {
            recentlyViewedPageFragment.handleEvent(bVar);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C13801b getCardViewHolderFactory() {
        C13173c adapter = getAdapter();
        C11780h favoriteRepository = getFavoriteRepository();
        C8703p analyticsContext = getAnalyticsContext();
        C13461f rxSchedulers = getRxSchedulers();
        C8267e adImpressionRepository = getAdImpressionRepository();
        C12724a deepLinkEligibility = getDeepLinkEligibility();
        C12741o routeInspector = getRouteInspector();
        C13851a deepLinkEntityChecker = getDeepLinkEntityChecker();
        C10865h searchUriParser = getSearchUriParser();
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(analyticsContext, "analyticsContext");
        return new C13801b(new C13799a(this, adapter, analyticsContext, favoriteRepository, rxSchedulers, adImpressionRepository, deepLinkEligibility, routeInspector, deepLinkEntityChecker, searchUriParser, this, (ListingCardViewHolderOptions) null, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 63488));
    }

    public final C10043d getRecentlyViewedPageRepository() {
        C10043d dVar = this.recentlyViewedPageRepository;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("recentlyViewedPageRepository");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        menu.clear();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            menuInflater.inflate(R.menu.recently_viewed_action_bar, menu);
            MenuItem findItem = menu.findItem(R.id.clear);
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(R.attr.clg_color_interaction_button_secondary, typedValue, true);
            int i = typedValue.resourceId;
            String string = activity.getString(R.string.clear);
            float dimension = activity.getResources().getDimension(R.dimen.actionbar_menu_text_size);
            ColorStateList colorStateList = activity.getResources().getColorStateList(i);
            int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R.dimen.fixed_large);
            int a = C8914m.m17343a(activity);
            TextView textView = new TextView(activity);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            textView.setGravity(16);
            textView.setTextColor(colorStateList);
            textView.setTextSize(0, dimension);
            textView.setTypeface(C8292f.m16582a(textView.getContext(), R.font.clg_typeface_bold));
            textView.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            textView.setMinHeight(a);
            textView.setBackgroundResource(R.drawable.clg_touch_feedback);
            textView.setText(string);
            findItem.setActionView(textView);
            ViewExtensions.m12866j(textView, new RecentlyViewedPageFragment$onCreateOptionsMenu$1(this));
        }
    }

    public final void onSuccess() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C12788a.m20426e(activity);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        getRecentlyViewedPageViewModel().f22107f.observe(getViewLifecycleOwner(), new C9498g(this, 2));
    }

    public final void setRecentlyViewedPageRepository(C10043d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.recentlyViewedPageRepository = dVar;
    }
}
