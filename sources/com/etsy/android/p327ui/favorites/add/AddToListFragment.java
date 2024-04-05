package com.etsy.android.p327ui.favorites.add;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.FavoritesTabKey;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.shophome.C8993g;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p260v0.C8184a;
import p356ge.C12790b;
import p377jf.C12979a;
import p425q9.C13260k;
import p440s9.C13366a;
import p496za.C13943a;
import p628nj.C18263b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListFragment */
public final class AddToListFragment extends TrackingBaseFragment implements C9768i, C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private C8703p analyticsTracker;
    public C13943a preferencesProvider;
    public AddToListPresenter presenter;
    private TransactionViewModel<C11869a> transactionViewModel;

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

    public void dismiss() {
        Fragment parentFragment = getParentFragment();
        AddToListContainerFragment addToListContainerFragment = parentFragment instanceof AddToListContainerFragment ? (AddToListContainerFragment) parentFragment : null;
        if (addToListContainerFragment == null) {
            return;
        }
        if (addToListContainerFragment.isStateSaved()) {
            addToListContainerFragment.dismissAllowingStateLoss();
        } else {
            addToListContainerFragment.dismiss();
        }
    }

    public final void done() {
        getPresenter().mo32709a();
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13943a getPreferencesProvider() {
        C13943a aVar = this.preferencesProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("preferencesProvider");
        throw null;
    }

    public final AddToListPresenter getPresenter() {
        AddToListPresenter addToListPresenter = this.presenter;
        if (addToListPresenter != null) {
            return addToListPresenter;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public void navigateToFavorites() {
        C12790b.m20430b(this, new FavoritesTabKey(C12790b.m20432d(this), (String) null, (String) null, 0, false, (Bundle) null, 54, (DefaultConstructorMarker) null));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.transactionViewModel = C18263b.m30829X(this, new C11869a());
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32794d(analyticsContext);
        this.analyticsTracker = analyticsContext;
        TransactionViewModel<C11869a> transactionViewModel2 = this.transactionViewModel;
        if (transactionViewModel2 != null) {
            Object b = ((C11869a) transactionViewModel2.f26405b).mo38345b(ResponseConstants.LISTING);
            ListingLike listingLike = b instanceof ListingLike ? (ListingLike) b : null;
            Bundle arguments = getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("is_favoriting", false);
            }
            if (listingLike == null) {
                LogCatKt.m17045a().mo21313g("Attempted to launch/resume AddToListFragment with a null listing from the transactionData. See https://developer.android.com/topic/libraries/architecture/saving-states for more");
                dismiss();
                return;
            }
            AddToListPresenter presenter2 = getPresenter();
            presenter2.getClass();
            presenter2.f21557g = this;
            presenter2.f21561k = listingLike;
            presenter2.f21558h = new AddToListAdapter(listingLike.getListingId().getIdAsLongDeprecated(), presenter2.f21556f, presenter2.f21555e, new AddToListPresenter$attach$1(presenter2, z));
            presenter2.f21551a.getActivity();
            ((RecyclerView) presenter2.f21551a._$_findCachedViewById(R.id.add_to_list_recyclerview)).setLayoutManager(new LinearLayoutManager());
            RecyclerView recyclerView = (RecyclerView) presenter2.f21551a._$_findCachedViewById(R.id.add_to_list_recyclerview);
            AddToListAdapter addToListAdapter = presenter2.f21558h;
            if (addToListAdapter != null) {
                recyclerView.setAdapter(addToListAdapter);
                C9766h hVar = presenter2.f21553c;
                EtsyId listingId = listingLike.getListingId();
                C19383o.m32796f(listingId, "listing.listingId");
                hVar.getClass();
                C8071s<C20145v<C19928a0>> b2 = hVar.f21604a.mo32776b(listingId.getId(), true);
                C8993g gVar = new C8993g(1);
                b2.getClass();
                ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(presenter2.f21552b, C0326j.m860e(presenter2.f21552b, new C19208j(new C19208j(b2, gVar), new C13260k(5)))), new AddToListPresenter$attach$2(presenter2), new AddToListPresenter$attach$3(presenter2, z));
                C7091a aVar = presenter2.f21559i;
                C19383o.m32798h(aVar, "compositeDisposable");
                aVar.mo19403b(e);
                Button button = (Button) presenter2.f21551a._$_findCachedViewById(R.id.add_list_done);
                C19383o.m32796f(button, "fragment.add_list_done");
                ViewExtensions.m12866j(button, new AddToListPresenter$attach$4(presenter2));
                return;
            }
            C19383o.m32805o("adapter");
            throw null;
        }
        C19383o.m32805o("transactionViewModel");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_add_to_list, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…o_list, container, false)");
        return inflate;
    }

    public void onDestroyView() {
        AddToListPresenter presenter2 = getPresenter();
        presenter2.f21559i.mo19405d();
        presenter2.f21557g = null;
        super.onDestroyView();
    }

    public void onFinishedLoading() {
        if (getView() != null) {
            ViewExtensions.m12860d((LoadingIndicatorView) _$_findCachedViewById(R.id.add_to_list_loading));
            ViewExtensions.m12869m((RecyclerView) _$_findCachedViewById(R.id.add_to_list_recyclerview));
        }
    }

    public void onLoading() {
        if (getView() != null) {
            ViewExtensions.m12860d((RecyclerView) _$_findCachedViewById(R.id.add_to_list_recyclerview));
            ViewExtensions.m12869m((LoadingIndicatorView) _$_findCachedViewById(R.id.add_to_list_loading));
        }
    }

    public final void setPreferencesProvider(C13943a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.preferencesProvider = aVar;
    }

    public final void setPresenter(AddToListPresenter addToListPresenter) {
        C19383o.m32797g(addToListPresenter, "<set-?>");
        this.presenter = addToListPresenter;
    }

    public void showAlert(AlertData alertData) {
        C19383o.m32797g(alertData, "data");
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45783c(alertData.getIcon());
        a.mo45785e(alertData.getTitle());
        if (alertData.getBodyIcon() != null) {
            String body = alertData.getBody();
            Context requireContext = requireContext();
            int intValue = alertData.getBodyIcon().intValue();
            Object obj = C8184a.f17966a;
            a.mo45782b(body, C8184a.C8187c.m16466b(requireContext, intValue));
        } else {
            a.f28588b.setBodyText(alertData.getBody(), (Drawable) null);
        }
        a.mo45781a(alertData.getAlertType());
        a.f28591e = alertData.getDuration();
        a.mo45784d(alertData.getOnClickListener());
        a.mo45786f();
    }

    public void showError() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C12979a a = C12979a.C12980a.m20683a(activity);
            a.mo45781a(CollageAlert.AlertType.ERROR);
            a.mo45785e(getString(R.string.collection_action_error));
            a.mo45783c(R.drawable.clg_icon_core_exclamation_v1);
            a.mo45786f();
            dismiss();
        }
    }
}
