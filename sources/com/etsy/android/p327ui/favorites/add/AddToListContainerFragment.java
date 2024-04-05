package com.etsy.android.p327ui.favorites.add;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p363he.C12824f;
import p440s9.C13366a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListContainerFragment */
public final class AddToListContainerFragment extends TrackingBottomSheetDialogFragment implements C13366a {
    public static final int $stable = 8;
    public static final String BOTTOM_SHEET_PEEK_HEIGHT = "add_to_list_bottom_sheet_peek_height";
    public static final String BOTTOM_SHEET_STATE = "add_to_list_bottom_sheet_state";
    public static final C9745a Companion = new C9745a();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private boolean isFavoriting;
    private ListingLike listing;
    public C9752b presenter;
    private TransactionViewModel<C11869a> transactionViewModel;

    /* renamed from: com.etsy.android.ui.favorites.add.AddToListContainerFragment$a */
    public static final class C9745a {
    }

    /* access modifiers changed from: private */
    public final void makePeekHeightOneThird(BottomSheetDialog bottomSheetDialog) {
        C19383o.m32796f(bottomSheetDialog.getBehavior(), "bottomSheetDialog.behavior");
        FrameLayout frameLayout = (FrameLayout) bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
        DisplayMetrics a = frameLayout != null ? ViewExtensions.m12857a(frameLayout) : null;
        int i = a != null ? a.heightPixels : 0;
        if (i != 0) {
            bottomSheetDialog.getBehavior().setPeekHeight((int) Math.floor(((double) i) / 3.0d), true);
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

    public final void back() {
        View view = getView();
        if (view != null) {
            view.addOnLayoutChangeListener(new AddToListContainerFragment$back$$inlined$doOnNextLayout$1(this));
        }
        getChildFragmentManager().mo10364Q();
    }

    public final ListingLike getListing() {
        return this.listing;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C9752b getPresenter() {
        C9752b bVar = this.presenter;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public final boolean isFavoriting() {
        return this.isFavoriting;
    }

    public final void nameAList() {
        Window window;
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        C19383o.m32795e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) parent).getLayoutParams();
        C19383o.m32795e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C2245c behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        C19383o.m32795e(behavior, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
        int peekHeight = bottomSheetBehavior.getPeekHeight();
        int state = bottomSheetBehavior.getState();
        FragmentManager childFragmentManager = getChildFragmentManager();
        C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
        NameAListFragment nameAListFragment = new NameAListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(BOTTOM_SHEET_PEEK_HEIGHT, peekHeight);
        bundle.putInt(BOTTOM_SHEET_STATE, state);
        nameAListFragment.setArguments(bundle);
        View view2 = getView();
        if (view2 != null) {
            View view3 = getView();
            view2.setMinimumHeight(view3 != null ? view3.getHeight() : 0);
        }
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(48);
        }
        c.mo10532i(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        c.mo10531h(R.id.add_to_list_container, nameAListFragment, (String) null);
        c.mo10529c(C19386q.m32807a(NameAListFragment.class).mo71919c());
        c.mo10483d();
    }

    public void onCancel(DialogInterface dialogInterface) {
        C19383o.m32797g(dialogInterface, "dialog");
        getPresenter().mo32758a(dialogInterface);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C9752b presenter2 = getPresenter();
        presenter2.getClass();
        Context requireContext = presenter2.f21580a.requireContext();
        C19383o.m32796f(requireContext, "fragment.requireContext()");
        return new AddToListBottomSheetDialog(requireContext, presenter2.f21580a.getTheme(), new C9748a(presenter2));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_add_to_list_bottom_sheet_container, viewGroup, false);
    }

    public void onDestroyView() {
        Window window;
        getPresenter().getClass();
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(32);
        }
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        TransactionViewModel<C11869a> transactionViewModel2 = this.transactionViewModel;
        if (transactionViewModel2 != null) {
            ((C11869a) transactionViewModel2.f26405b).mo38349f(ResponseConstants.LISTING, this.listing);
        } else {
            C19383o.m32805o("transactionViewModel");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        C19383o.m32795e(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        C19383o.m32796f(bottomSheetDialog.getBehavior(), "bottomSheetDialog.behavior");
        FrameLayout frameLayout = (FrameLayout) bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        View view = getView();
        if (view != null) {
            view.addOnLayoutChangeListener(new AddToListContainerFragment$onStart$$inlined$doOnNextLayout$1(this));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        TransactionViewModel<C11869a> X = C18263b.m30829X(this, new C11869a());
        this.transactionViewModel = X;
        C11869a aVar = (C11869a) X.f26405b;
        boolean z = false;
        if (aVar.f26406a.containsKey(ResponseConstants.LISTING)) {
            Object b = aVar.mo38345b(ResponseConstants.LISTING);
            C19383o.m32795e(b, "null cannot be cast to non-null type com.etsy.android.lib.models.interfaces.ListingLike");
            this.listing = (ListingLike) b;
            Bundle arguments = getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("is_favoriting");
            }
            this.isFavoriting = z;
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null && arguments2.containsKey(ResponseConstants.LISTING)) {
                Bundle arguments3 = getArguments();
                Object obj = arguments3 != null ? arguments3.get(ResponseConstants.LISTING) : null;
                C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.lib.models.interfaces.ListingLike");
                this.listing = (ListingLike) obj;
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    z = arguments4.getBoolean("is_favoriting");
                }
                this.isFavoriting = z;
            } else {
                dismiss();
                return;
            }
        }
        C9752b presenter2 = getPresenter();
        ListingLike listingLike = this.listing;
        C19383o.m32794d(listingLike);
        boolean z2 = this.isFavoriting;
        presenter2.getClass();
        if (presenter2.f21580a.getChildFragmentManager().mo10352B(R.id.add_to_list_container) == null) {
            FragmentManager childFragmentManager = presenter2.f21580a.getChildFragmentManager();
            C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
            AddToListFragment addToListFragment = new AddToListFragment();
            C11869a aVar2 = new C11869a();
            aVar2.mo38349f(ResponseConstants.LISTING, listingLike);
            C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
            int b2 = TransactionDataRepository.C11867a.m19552a().mo38343b(aVar2);
            C12824f fVar = new C12824f();
            fVar.f28304a.put("transaction-data", Integer.valueOf(b2));
            fVar.f28304a.put("is_favoriting", Boolean.valueOf(z2));
            addToListFragment.setArguments(fVar.mo45608a());
            c.mo10485g(R.id.add_to_list_container, addToListFragment, (String) null, 1);
            c.mo10529c(C19386q.m32807a(AddToListFragment.class).mo71919c());
            c.mo10483d();
        }
    }

    public final void setFavoriting(boolean z) {
        this.isFavoriting = z;
    }

    public final void setPresenter(C9752b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.presenter = bVar;
    }
}
