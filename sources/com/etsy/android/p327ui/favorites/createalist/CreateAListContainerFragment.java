package com.etsy.android.p327ui.favorites.createalist;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.p327ui.favorites.createalist.CreateAListContainerPresenter;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p145io.reactivex.subjects.C19254a;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListContainerFragment */
public final class CreateAListContainerFragment extends TrackingBottomSheetDialogFragment implements C13366a, C9825n {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public CreateAListContainerPresenter presenter;

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

    public C9799a eventDispatcher() {
        return getPresenter().f21661g;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final CreateAListContainerPresenter getPresenter() {
        CreateAListContainerPresenter createAListContainerPresenter = this.presenter;
        if (createAListContainerPresenter != null) {
            return createAListContainerPresenter;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C19383o.m32797g(dialogInterface, "dialog");
        CreateAListContainerPresenter presenter2 = getPresenter();
        presenter2.getClass();
        if (presenter2.f21660f) {
            presenter2.mo32797c(dialogInterface, CreateAListContainerPresenter.C9794a.C9795a.f21662a);
            return;
        }
        presenter2.f21657c.mo21333d("favorites_create_list_dismiss", (Map<? extends AnalyticsProperty, Object>) null);
        dialogInterface.dismiss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        CreateAListContainerPresenter presenter2 = getPresenter();
        presenter2.getClass();
        Context requireContext = presenter2.f21656b.requireContext();
        C19383o.m32796f(requireContext, "fragment.requireContext()");
        return new CustomBottomSheetDialog(requireContext, presenter2.f21656b.getTheme(), false, new C9802d(presenter2), 4, (DefaultConstructorMarker) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_create_a_list_container, viewGroup, false);
    }

    public void onDestroyView() {
        getPresenter().getClass();
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        CreateAListContainerPresenter presenter2 = getPresenter();
        presenter2.f21658d.getClass();
        LinkedHashSet<ListingCard> linkedHashSet = C9816h.f21712b;
        linkedHashSet.clear();
        C9816h.f21713c = C19254a.m32516l(linkedHashSet);
        if (presenter2.f21656b.getChildFragmentManager().mo10352B(R.id.create_a_list_container) == null) {
            FragmentManager childFragmentManager = presenter2.f21656b.getChildFragmentManager();
            C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
            c.mo10485g(R.id.create_a_list_container, new CreateAListFragment(), (String) null, 1);
            c.mo10529c(C19386q.m32807a(CreateAListFragment.class).mo71919c());
            c.mo10483d();
        }
    }

    public final void setPresenter(CreateAListContainerPresenter createAListContainerPresenter) {
        C19383o.m32797g(createAListContainerPresenter, "<set-?>");
        this.presenter = createAListContainerPresenter;
    }
}
