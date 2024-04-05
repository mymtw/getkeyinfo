package com.etsy.android.p327ui.user.addresses;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C3185q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.Country;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.AddressDetailKey;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p260v0.C8184a;
import p356ge.C12788a;
import p377jf.C12979a;
import p435rb.C13350a;
import p440s9.C13366a;
import p628nj.C18263b;
import p672sk.C18519a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListFragment */
public final class AddressListFragment extends TrackingBaseFragment implements C13366a, C9731e0.C9733b, C11452u {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Button addNewAddressButton;
    /* access modifiers changed from: private */
    public C11439o addressesAdapter;
    public C8618c configMap;
    private View errorView;
    private ImageView noAddressesImage;
    private TextView noAddressesTextView;
    public AddressListPresenter presenter;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private Button tryAgain;
    private View viewAddressesLoader;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(C11460w.class), new AddressListFragment$special$$inlined$viewModels$default$2(new AddressListFragment$special$$inlined$viewModels$default$1(this)), new AddressListFragment$viewModel$2(this));
    public C19011a<C11460w> viewModelProvider;

    /* renamed from: com.etsy.android.ui.user.addresses.AddressListFragment$a */
    public static final class C11376a extends C3185q.C3194g {

        /* renamed from: e */
        public final ColorDrawable f25089e;

        /* renamed from: f */
        public final Drawable f25090f;

        /* renamed from: g */
        public final /* synthetic */ AddressListFragment f25091g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11376a(AddressListFragment addressListFragment) {
            super(4);
            this.f25091g = addressListFragment;
            Context requireContext = addressListFragment.requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            this.f25089e = new ColorDrawable(C13350a.m21013d(requireContext, R.attr.clg_color_bg_error));
            Context requireContext2 = addressListFragment.requireContext();
            Object obj = C8184a.f17966a;
            this.f25090f = C8184a.C8187c.m16466b(requireContext2, R.drawable.clg_icon_core_trash_v1);
        }

        /* renamed from: d */
        public final void mo11932d(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3084b0 b0Var, float f, float f2, int i, boolean z) {
            C19383o.m32797g(canvas, "canvas");
            C19383o.m32797g(recyclerView, "recyclerView");
            C19383o.m32797g(b0Var, "viewHolder");
            View view = b0Var.itemView;
            C19383o.m32796f(view, "viewHolder.itemView");
            if (f < 0.0f) {
                int i2 = (int) f;
                this.f25089e.setBounds(view.getRight() + i2, view.getTop(), view.getRight(), view.getBottom());
                this.f25089e.draw(canvas);
                Drawable drawable = this.f25090f;
                if (drawable != null) {
                    AddressListFragment addressListFragment = this.f25091g;
                    int height = (view.getHeight() - drawable.getIntrinsicHeight()) / 2;
                    int right = view.getRight() + i2;
                    int top = view.getTop() + height;
                    Context requireContext = addressListFragment.requireContext();
                    C19383o.m32796f(requireContext, "requireContext()");
                    drawable.setTint(C13350a.m21013d(requireContext, R.attr.clg_color_text_primary_on_dark));
                    drawable.setBounds(new Rect(view.getRight() + i2 + 32, top, drawable.getIntrinsicWidth() + right + 32, view.getBottom() - height));
                    drawable.draw(canvas);
                }
            }
            canvas.save();
            super.mo11932d(canvas, recyclerView, b0Var, f, f2, i, z);
        }

        /* renamed from: e */
        public final void mo11933e(RecyclerView recyclerView, RecyclerView.C3084b0 b0Var, RecyclerView.C3084b0 b0Var2) {
            C19383o.m32797g(recyclerView, "recyclerView");
            C19383o.m32797g(b0Var, "viewHolder");
        }

        /* renamed from: f */
        public final void mo11934f(RecyclerView.C3084b0 b0Var) {
            C19383o.m32797g(b0Var, "viewHolder");
            Context requireContext = this.f25091g.requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            C9056g gVar = new C9056g(requireContext);
            gVar.mo70029r(R.string.address_delete_dialog_title);
            gVar.mo70023l(R.string.address_delete_dialog_subtitle);
            C18519a m = gVar.setPositiveButton(R.string.address_delete_dialog_deletebutton, new C11442q(0, this.f25091g, b0Var)).setNegativeButton(R.string.cancel, new C11443r());
            m.f286a.f272n = new C11444s(this.f25091g, b0Var);
            m.mo1240k();
        }
    }

    private final void clearViewReferences() {
        this.swipeRefreshLayout = null;
        this.recyclerView = null;
        this.noAddressesTextView = null;
        this.noAddressesImage = null;
        this.addNewAddressButton = null;
        this.viewAddressesLoader = null;
        this.errorView = null;
        this.tryAgain = null;
    }

    /* access modifiers changed from: private */
    public final C11460w getViewModel() {
        return (C11460w) this.viewModel$delegate.getValue();
    }

    private final void initPresenter() {
        AddressListPresenter presenter2 = getPresenter();
        C19383o.m32796f(requireContext(), "requireContext()");
        C11460w viewModel = getViewModel();
        AddressListFragment$initPresenter$1 addressListFragment$initPresenter$1 = new AddressListFragment$initPresenter$1(this);
        presenter2.getClass();
        C19383o.m32797g(viewModel, "viewModel");
        presenter2.f25093b = this;
        presenter2.f25094c = viewModel;
        setAdapter(new C11439o(addressListFragment$initPresenter$1));
        getAddresses();
    }

    /* access modifiers changed from: private */
    public final void onEditAddress(AddressItemUI addressItemUI) {
        C12788a.m20424c(getActivity(), new AddressDetailKey(C19421p.m32935c0(getActivity()), addressItemUI, (Integer) null, (String) null, false, 28, (DefaultConstructorMarker) null));
        trackEvent("existing_address_tapped");
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m35059onViewCreated$lambda0(AddressListFragment addressListFragment) {
        C19383o.m32797g(addressListFragment, "this$0");
        addressListFragment.getPresenter().mo37219a();
    }

    private final void trackEvent(String str) {
        getAnalyticsContext().mo21333d(str, (Map<? extends AnalyticsProperty, Object>) null);
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

    public void getAddresses() {
        getPresenter().mo37219a();
    }

    public final C8618c getConfigMap() {
        C8618c cVar = this.configMap;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("configMap");
        throw null;
    }

    public int getFragmentTitle() {
        return R.string.manage_addresses;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final AddressListPresenter getPresenter() {
        AddressListPresenter addressListPresenter = this.presenter;
        if (addressListPresenter != null) {
            return addressListPresenter;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public String getTrackingName() {
        return "shipping_address_management";
    }

    public final C19011a<C11460w> getViewModelProvider() {
        C19011a<C11460w> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("viewModelProvider");
        throw null;
    }

    public void onAddNewAddress(Country country, boolean z) {
        if (country != null) {
            C12788a.m20424c(getActivity(), new AddressDetailKey(C19421p.m32935c0(getActivity()), (AddressItemUI) null, Integer.valueOf(country.getCountryId()), country.getName(), z, 2, (DefaultConstructorMarker) null));
            trackEvent("add_new_address_tapped");
        }
    }

    public void onAddressDeleteFailure(Throwable th) {
        C19383o.m32797g(th, "error");
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45785e(getString(R.string.address_delete_toast_error));
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.mo45783c(R.drawable.clg_icon_core_exclamation_v1);
        a.f28590d = true;
        a.mo45786f();
    }

    public void onAddressDeleteSuccess() {
        RecyclerView.Adapter adapter;
        getAnalyticsContext().mo21333d("existing_address_deleted", (Map<? extends AnalyticsProperty, Object>) null);
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.mo45785e(getString(R.string.address_delete_toast_success));
        a.mo45781a(CollageAlert.AlertType.SUCCESS);
        a.mo45783c(R.drawable.clg_icon_core_check_v1);
        boolean z = true;
        a.f28590d = true;
        a.mo45786f();
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null || (adapter = recyclerView2.getAdapter()) == null || adapter.getItemCount() != 0) {
            z = false;
        }
        if (z) {
            showEmptyState();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_address_list, viewGroup, false);
        this.swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        this.addNewAddressButton = (Button) inflate.findViewById(R.id.addNewAddressButton);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view_addresses);
        this.noAddressesTextView = (TextView) inflate.findViewById(R.id.address_list_no_addresses_title);
        this.noAddressesImage = (ImageView) inflate.findViewById(R.id.address_list_empty_image);
        this.viewAddressesLoader = inflate.findViewById(R.id.view_addresses_loader);
        View findViewById = inflate.findViewById(R.id.view_addresses_error);
        this.errorView = findViewById;
        this.tryAgain = findViewById != null ? (Button) findViewById.findViewById(R.id.btn_retry_internet) : null;
        Button button = this.addNewAddressButton;
        if (button != null) {
            ViewExtensions.m12866j(button, new AddressListFragment$onCreateView$1(this));
        }
        new C3185q(new C11376a(this)).mo11917f(this.recyclerView);
        initPresenter();
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        clearViewReferences();
    }

    public void onStop() {
        super.onStop();
        getPresenter().f25095d.mo19405d();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setOnRefreshListener(new C11441p(this));
        }
    }

    public void setAdapter(C11439o oVar) {
        C19383o.m32797g(oVar, "adapter");
        this.addressesAdapter = oVar;
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView2.setAdapter(this.addressesAdapter);
        }
    }

    public final void setConfigMap(C8618c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.configMap = cVar;
    }

    public final void setPresenter(AddressListPresenter addressListPresenter) {
        C19383o.m32797g(addressListPresenter, "<set-?>");
        this.presenter = addressListPresenter;
    }

    public final void setViewModelProvider(C19011a<C11460w> aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.viewModelProvider = aVar;
    }

    public void showAddresses(List<AddressItemUI> list) {
        C19383o.m32797g(list, "addresses");
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        TextView textView = this.noAddressesTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        Button button = this.addNewAddressButton;
        if (button != null) {
            button.setVisibility(0);
        }
        ImageView imageView = this.noAddressesImage;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        View view = this.viewAddressesLoader;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.errorView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        C11439o oVar = this.addressesAdapter;
        if (oVar != null) {
            oVar.mo11950j(list);
        }
    }

    public void showEmptyState() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        View view = this.viewAddressesLoader;
        if (view != null) {
            view.setVisibility(8);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        View view2 = this.errorView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView = this.noAddressesTextView;
        if (textView != null) {
            textView.setVisibility(0);
        }
        ImageView imageView = this.noAddressesImage;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        Button button = this.addNewAddressButton;
        if (button != null) {
            button.setVisibility(0);
        }
    }

    public void showErrorState() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        View view = this.viewAddressesLoader;
        if (view != null) {
            view.setVisibility(8);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        TextView textView = this.noAddressesTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.noAddressesImage;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Button button = this.addNewAddressButton;
        if (button != null) {
            button.setVisibility(8);
        }
        View view2 = this.errorView;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        Button button2 = this.tryAgain;
        if (button2 != null) {
            ViewExtensions.m12866j(button2, new AddressListFragment$showErrorState$1(this));
        }
    }

    public void showLoader() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        TextView textView = this.noAddressesTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        Button button = this.addNewAddressButton;
        if (button != null) {
            button.setVisibility(8);
        }
        ImageView imageView = this.noAddressesImage;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        View view = this.errorView;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.viewAddressesLoader;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}
