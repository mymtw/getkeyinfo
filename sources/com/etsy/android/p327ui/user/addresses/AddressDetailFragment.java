package com.etsy.android.p327ui.user.addresses;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2895z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.C6467l;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.C10674m0;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.giftcards.C9911b;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.AddressCountrySelectorKey;
import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import com.etsy.android.p327ui.user.addresses.C11378a;
import com.etsy.android.p327ui.user.addresses.C11381a0;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import com.etsy.android.uikit.adapter.C11829a;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p356ge.C12788a;
import p377jf.C12979a;
import p402n9.C13089i;
import p425q9.C13263n;
import p440s9.C13366a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailFragment */
public final class AddressDetailFragment extends BaseRecyclerViewListFragment<C11396e> implements C13366a, C9731e0.C9733b, C10674m0.C10675a, C11324t.C11329b, C11414g {
    public static final int $stable = 8;
    public static final int ADD_ADDRESS = 0;
    public static final C11360a Companion = new C11360a();
    public static final int EDIT_ADDRESS = 1;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C11409f presenter;
    public C13461f schedulers;
    public AddressDetailViewModel viewModel;
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailFragment$a */
    public static final class C11360a {
    }

    private final void handleBackNavigation() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String postal_code;
        AddressDetailViewModel viewModel2 = getViewModel();
        AddressItemUI addressItemUI = viewModel2.f25058j;
        String str6 = "";
        if (addressItemUI == null || (str = addressItemUI.getName()) == null) {
            str = str6;
        }
        boolean z = false;
        if (C19383o.m32792b(str, viewModel2.f25055g.f25199b)) {
            AddressItemUI addressItemUI2 = viewModel2.f25058j;
            if (addressItemUI2 == null || (str2 = addressItemUI2.getFirst_line()) == null) {
                str2 = str6;
            }
            if (C19383o.m32792b(str2, viewModel2.f25055g.f25200c)) {
                AddressItemUI addressItemUI3 = viewModel2.f25058j;
                if (addressItemUI3 == null || (str3 = addressItemUI3.getSecond_line()) == null) {
                    str3 = str6;
                }
                if (C19383o.m32792b(str3, viewModel2.f25055g.f25201d)) {
                    AddressItemUI addressItemUI4 = viewModel2.f25058j;
                    if (addressItemUI4 == null || (str4 = addressItemUI4.getLocality()) == null) {
                        str4 = str6;
                    }
                    if (C19383o.m32792b(str4, viewModel2.f25055g.f25202e)) {
                        AddressItemUI addressItemUI5 = viewModel2.f25058j;
                        if (addressItemUI5 == null || (str5 = addressItemUI5.getAdministrative_area()) == null) {
                            str5 = str6;
                        }
                        if (C19383o.m32792b(str5, viewModel2.f25055g.f25203f)) {
                            AddressItemUI addressItemUI6 = viewModel2.f25058j;
                            if (!(addressItemUI6 == null || (postal_code = addressItemUI6.getPostal_code()) == null)) {
                                str6 = postal_code;
                            }
                            if (C19383o.m32792b(str6, viewModel2.f25055g.f25204g)) {
                                AddressItemUI addressItemUI7 = viewModel2.f25058j;
                                if (C19383o.m32792b(Boolean.valueOf(addressItemUI7 != null ? addressItemUI7.is_default_address() : false), viewModel2.f25055g.f25207j)) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!z) {
            Context requireContext = requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            C9056g gVar = new C9056g(requireContext);
            gVar.mo70029r(R.string.are_you_sure);
            gVar.mo70023l(R.string.navigate_without_saving_address);
            gVar.setPositiveButton(R.string.navigate_without_saving_address_yes, new C11394d(this)).setNegativeButton(R.string.navigate_without_saving_address_no, new C9911b(1)).mo1240k();
            return;
        }
        C12788a.m20426e(getActivity());
    }

    /* access modifiers changed from: private */
    /* renamed from: handleBackNavigation$lambda-8  reason: not valid java name */
    public static final void m35055handleBackNavigation$lambda8(AddressDetailFragment addressDetailFragment, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(addressDetailFragment, "this$0");
        C12788a.m20426e(addressDetailFragment.getActivity());
    }

    /* access modifiers changed from: private */
    /* renamed from: handleBackNavigation$lambda-9  reason: not valid java name */
    public static final void m35056handleBackNavigation$lambda9(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: showDeleteConfirmation$lambda-3  reason: not valid java name */
    public static final void m35057showDeleteConfirmation$lambda3(AddressDetailFragment addressDetailFragment, DialogInterface dialogInterface, int i) {
        C19383o.m32797g(addressDetailFragment, "this$0");
        AddressDetailViewModel viewModel2 = addressDetailFragment.getViewModel();
        viewModel2.f25054f.postValue(AddressDetailViewModel.C11361a.C11367f.f25065a);
        ConsumerSingleObserver g = C0391c.m1056b(viewModel2.f25050b, C0326j.m860e(viewModel2.f25050b, viewModel2.f25051c.mo37264a(new C11381a0.C11382a(viewModel2.f25055g.f25198a)))).mo20658g(new C13263n(viewModel2, 6), new C13089i(viewModel2, 8));
        C7091a aVar = viewModel2.f25053e;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(g);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: showDeleteConfirmation$lambda-4  reason: not valid java name */
    public static final void m35058showDeleteConfirmation$lambda4(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
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

    public RecyclerView.C3100o createLayoutManager() {
        C11378a.C11379a aVar;
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        C11829a<T> aVar2 = this.adapter;
        C11378a aVar3 = aVar2 instanceof C11378a ? (C11378a) aVar2 : null;
        if (!(aVar3 == null || (aVar = aVar3.f25106e) == null)) {
            gridLayoutManager.f7008K = aVar;
        }
        return gridLayoutManager;
    }

    public int getFragmentTitle() {
        return getViewModel().f25056h == 0 ? R.string.add_address_title : getViewModel().f25056h == 1 ? R.string.edit_address_title : R.string.manage_addresses;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C11409f getPresenter() {
        C11409f fVar = this.presenter;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public final C13461f getSchedulers() {
        C13461f fVar = this.schedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("schedulers");
        throw null;
    }

    public String getTrackingName() {
        return "shipping_address_management";
    }

    public final AddressDetailViewModel getViewModel() {
        AddressDetailViewModel addressDetailViewModel = this.viewModel;
        if (addressDetailViewModel != null) {
            return addressDetailViewModel;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public boolean handleBackPressed() {
        handleBackNavigation();
        return true;
    }

    public void hideKeyboard() {
        View view = getView();
        if (view != null) {
            C15588c1.m25340p0(view);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setViewModel((AddressDetailViewModel) new C2870k0((C2880m0) this, (C2870k0.C2872b) getViewModelFactory()).mo10829a(AddressDetailViewModel.class));
        C11409f presenter2 = getPresenter();
        C19383o.m32796f(requireContext(), "requireContext()");
        AddressDetailViewModel viewModel2 = getViewModel();
        Bundle arguments = getArguments();
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        presenter2.getClass();
        C19383o.m32797g(viewModel2, "viewModel");
        presenter2.f25146a = this;
        presenter2.f25147b = viewModel2;
        presenter2.f25148c = analyticsContext;
        presenter2.mo37269a(arguments);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2895z<AddressDetailViewModel.C11361a> zVar;
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        this.adapter = new C11378a(requireActivity, new AddressDetailFragment$onCreateView$1(this), getViewModel().f25060l, getViewModel().f25056h);
        this.recyclerView.setLayoutManager(createLayoutManager());
        this.recyclerView.setAdapter(this.adapter);
        this.swipeRefreshLayout.setEnabled(false);
        this.recyclerView.setPadding(0, (int) requireContext().getResources().getDimension(R.dimen.clg_space_8), 0, 0);
        C11409f presenter2 = getPresenter();
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        presenter2.getClass();
        AddressDetailViewModel addressDetailViewModel = presenter2.f25147b;
        if (!(addressDetailViewModel == null || (zVar = addressDetailViewModel.f25054f) == null)) {
            zVar.observe(viewLifecycleOwner, new C6467l(presenter2, 1));
        }
        C11409f presenter3 = getPresenter();
        RecyclerView recyclerView = this.recyclerView;
        C19383o.m32796f(recyclerView, "recyclerView");
        presenter3.getClass();
        recyclerView.getRecycledViewPool().mo11691b(0);
        recyclerView.getRecycledViewPool().mo11691b(1);
        recyclerView.getRecycledViewPool().mo11691b(2);
        recyclerView.getRecycledViewPool().mo11691b(3);
        recyclerView.getRecycledViewPool().mo11691b(5);
        recyclerView.getRecycledViewPool().mo11691b(4);
        return onCreateView;
    }

    public void onLoadContent() {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        handleBackNavigation();
        return true;
    }

    public final void setPresenter(C11409f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.presenter = fVar;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setViewModel(AddressDetailViewModel addressDetailViewModel) {
        C19383o.m32797g(addressDetailViewModel, "<set-?>");
        this.viewModel = addressDetailViewModel;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }

    public void showAddressDetailError() {
        setLoading(false);
        View findViewById = this.errorView.findViewById(R.id.btn_retry_internet);
        C19383o.m32796f(findViewById, "retryButton");
        ViewExtensions.m12866j(findViewById, new AddressDetailFragment$showAddressDetailError$1(this));
        showErrorView();
    }

    public void showAddressDetails(List<? extends C11396e> list) {
        setLoading(false);
        if (list != null) {
            this.adapter.clear();
            this.adapter.addItems(list);
        }
        showListView();
    }

    public void showAddressLoadingView() {
        setLoading(true);
        showLoadingView();
    }

    public void showCountrySelector() {
        C19388s.m32894x0(this, "REQUEST_COUNTRY_SELECTED", new AddressDetailFragment$showCountrySelector$1(this));
        C12788a.m20424c(getActivity(), new AddressCountrySelectorKey(C19421p.m32935c0(getActivity()), getViewModel().f25057i));
    }

    public void showDeleteConfirmation() {
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C9056g gVar = new C9056g(requireContext);
        gVar.mo70029r(R.string.address_delete_dialog_title);
        gVar.mo70023l(R.string.address_delete_dialog_subtitle);
        gVar.setPositiveButton(R.string.address_delete_dialog_deletebutton, new C11390b(this)).setNegativeButton(R.string.cancel, new C11392c(0)).mo1240k();
    }

    public void showFailurePopup(int i) {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45785e(getString(i));
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.f28590d = true;
        a.mo45786f();
    }

    public void showSuccessPopup(int i) {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45785e(getString(i));
        a.mo45781a(CollageAlert.AlertType.SUCCESS);
        a.mo45783c(R.drawable.clg_icon_core_check_v1);
        a.f28590d = true;
        a.mo45786f();
        C12788a.m20426e(getActivity());
    }

    public int softInputMode() {
        return 16;
    }

    public void updateAddressDetails(List<? extends C11396e> list) {
        C19383o.m32797g(list, "addressItems");
        this.adapter.replaceList(list);
        this.adapter.notifyDataSetChanged();
    }

    public C11324t.C11325a.C11327b getBottomTabsOverrides() {
        return C11324t.C11325a.C11327b.f24989c;
    }
}
