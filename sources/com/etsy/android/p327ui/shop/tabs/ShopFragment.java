package com.etsy.android.p327ui.shop.tabs;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.p015ui.platform.ComposeView;
import androidx.compose.p015ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2887s;
import com.etsy.android.R;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.C10674m0;
import com.etsy.android.p327ui.shop.tabs.C11209a;
import com.etsy.android.p327ui.shop.tabs.C11219f;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlowImpl;
import p440s9.C13366a;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.shop.tabs.ShopFragment */
public final class ShopFragment extends TrackingBaseFragment implements C10674m0.C10675a, C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C19285c appBarHelper$delegate = C19350d.m32677b(new ShopFragment$appBarHelper$2(this));
    public C19011a<AppBarHelper> appBarHelperProvider;
    public CoroutineDispatcher mainDispatcher;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(ShopViewModel.class), new ShopFragment$special$$inlined$viewModels$default$2(new ShopFragment$special$$inlined$viewModels$default$1(this)), new ShopFragment$viewModel$2(this));
    public C8656o viewModelFactory;

    private final AppBarHelper getAppBarHelper() {
        return (AppBarHelper) this.appBarHelper$delegate.getValue();
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    /* access modifiers changed from: private */
    public final void handleSideEffect(C11219f fVar) {
        Object value;
        C11221g gVar;
        if (fVar instanceof C11219f.C11220a) {
            Toast.makeText(requireActivity(), ((C11219f.C11220a) fVar).f24801a, 0).show();
        }
        ShopViewModel viewModel = getViewModel();
        viewModel.getClass();
        C19383o.m32797g(fVar, "sideEffect");
        StateFlowImpl stateFlowImpl = viewModel.f24772d;
        do {
            value = stateFlowImpl.getValue();
            gVar = (C11221g) value;
            gVar.getClass();
        } while (!stateFlowImpl.mo72337i(value, C11221g.m19147a(gVar, (C11224i) null, C19327t.m32649e1(fVar, gVar.f24803b), 1)));
    }

    /* access modifiers changed from: private */
    public final void handleViewState(C11224i iVar) {
        if (C19383o.m32792b(iVar, C11224i.C11225a.f24805a)) {
            getAppBarHelper().setTitle((CharSequence) "");
        } else if (iVar instanceof C11224i.C11229e) {
            getAppBarHelper().setTitle((int) R.string.loading);
        } else if (iVar instanceof C11224i.C11230f) {
            getAppBarHelper().setTitle((CharSequence) ((C11224i.C11230f) iVar).f24811a);
        } else if (C19383o.m32792b(iVar, C11224i.C11226b.f24806a)) {
            getAppBarHelper().setTitle((int) R.string.network_unavailable);
        } else if (iVar instanceof C11224i.C11227c) {
            getAppBarHelper().setTitle((int) R.string.unavailable);
        } else if (iVar instanceof C11224i.C11228d) {
            getAppBarHelper().setTitle((int) R.string.unavailable);
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

    public final C19011a<AppBarHelper> getAppBarHelperProvider() {
        C19011a<AppBarHelper> aVar = this.appBarHelperProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("appBarHelperProvider");
        throw null;
    }

    public final CoroutineDispatcher getMainDispatcher() {
        CoroutineDispatcher coroutineDispatcher = this.mainDispatcher;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        C19383o.m32805o("mainDispatcher");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return "shop_home";
    }

    public final ShopViewModel getViewModel() {
        return (ShopViewModel) this.viewModel$delegate.getValue();
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        Long l;
        String string;
        super.onCreate(bundle);
        C11869a aVar = (C11869a) C18263b.m30830Y(this, "baseshophome", new C11869a()).f26405b;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        boolean z = true;
        String str = null;
        if (bundle != null && bundle.containsKey("shop_id")) {
            l = Long.valueOf(arguments.getLong("shop_id", -1));
        } else {
            if (aVar.mo38344a("shop_id")) {
                EtsyId etsyId = (EtsyId) aVar.mo38345b("shop_id");
                if (etsyId != null) {
                    l = Long.valueOf(etsyId.getIdAsLong());
                }
            } else if (arguments.containsKey("shop_id") && (string = arguments.getString("shop_id", (String) null)) != null) {
                l = Long.valueOf(Long.parseLong(string));
            }
            l = null;
        }
        if (bundle != null && bundle.containsKey("referring_listing_id")) {
            str = bundle.getString("referring_listing_id");
        } else if (aVar.mo38344a("referring_listing_id")) {
            str = aVar.mo38348e("referring_listing_id", (String) null);
        } else if (arguments.containsKey("referring_listing_id")) {
            str = arguments.getString("referring_listing_id");
        }
        if (bundle == null || !bundle.containsKey(ResponseConstants.SHOP_NAME)) {
            z = false;
        }
        String string2 = z ? bundle.getString(ResponseConstants.SHOP_NAME, "") : aVar.mo38344a(ResponseConstants.SHOP_NAME) ? aVar.mo38348e(ResponseConstants.SHOP_NAME, "") : arguments.getString(ResponseConstants.SHOP_NAME, "");
        arguments.getBoolean("favorite_shop", false);
        String string3 = arguments.getString("coupon");
        ShopViewModel viewModel = getViewModel();
        viewModel.f24775g = l;
        viewModel.f24776h = string2;
        viewModel.f24777i = str;
        viewModel.f24778j = string3;
        if (C15588c1.m25348t0(l)) {
            viewModel.f24771c.mo38013a(C11209a.C11214e.f24789a);
            C11216c cVar = viewModel.f24771c;
            Long l2 = viewModel.f24775g;
            C19383o.m32794d(l2);
            cVar.mo38013a(new C11209a.C11211b(l2.longValue(), viewModel.f24777i, viewModel.f24778j));
        } else if (C18263b.m30839d0(viewModel.f24776h)) {
            viewModel.f24771c.mo38013a(C11209a.C11214e.f24789a);
            C11216c cVar2 = viewModel.f24771c;
            String str2 = viewModel.f24776h;
            C19383o.m32794d(str2);
            cVar2.mo38013a(new C11209a.C11212c(str2));
        } else {
            throw new IllegalStateException("ShopId or Shop Name must be provided");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        ComposeView composeView = new ComposeView(requireActivity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f4049a);
        composeView.setContent(C18263b.m30807B(new ShopFragment$onCreateView$view$1$1(this), 1942638167, true));
        return composeView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        C19697g.m33468f(C15588c1.m25329i0(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new ShopFragment$onViewCreated$1(this, (C19340c<? super ShopFragment$onViewCreated$1>) null), 3);
        C2887s viewLifecycleOwner2 = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner2, "viewLifecycleOwner");
        C19697g.m33468f(C15588c1.m25329i0(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new ShopFragment$onViewCreated$2(this, (C19340c<? super ShopFragment$onViewCreated$2>) null), 3);
    }

    public final void setAppBarHelperProvider(C19011a<AppBarHelper> aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.appBarHelperProvider = aVar;
    }

    public final void setMainDispatcher(CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(coroutineDispatcher, "<set-?>");
        this.mainDispatcher = coroutineDispatcher;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }

    public int softInputMode() {
        return 32;
    }
}
