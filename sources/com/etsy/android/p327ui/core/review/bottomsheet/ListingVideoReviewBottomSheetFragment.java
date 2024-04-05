package com.etsy.android.p327ui.core.review.bottomsheet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.core.review.DisplayVideoReviewsEvent;
import com.etsy.android.p327ui.core.review.ListingVideoReviewFragment;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p381kc.C12991b;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.core.review.bottomsheet.ListingVideoReviewBottomSheetFragment */
public final class ListingVideoReviewBottomSheetFragment extends TrackingBottomSheetDialogFragment implements C13366a, C12991b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Bundle bundle;

    private final void loadListingVideoReviewFragment() {
        ListingVideoReviewFragment listingVideoReviewFragment = new ListingVideoReviewFragment(this);
        listingVideoReviewFragment.setArguments(this.bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C2740a aVar = new C2740a(childFragmentManager);
        aVar.mo10531h(R.id.bottom_sheet_fragment_container, listingVideoReviewFragment, (String) null);
        aVar.mo10483d();
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

    public final Bundle getBundle() {
        return this.bundle;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void handleDismiss() {
        dismiss();
    }

    public void onCreate(Bundle bundle2) {
        super.onCreate(bundle2);
        if (bundle2 == null) {
            if (getArguments() != null) {
                bundle2 = getArguments();
                C19383o.m32795e(bundle2, "null cannot be cast to non-null type android.os.Bundle");
            } else {
                return;
            }
        }
        this.bundle = bundle2;
    }

    public Dialog onCreateDialog(Bundle bundle2) {
        return new ListingVideoReviewBottomSheetFragment$onCreateDialog$1(this, requireActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle2) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_review_video_bottom_sheet, viewGroup, false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C19383o.m32797g(dialogInterface, "dialog");
        C8703p analyticsContext = getAnalyticsContext();
        if (analyticsContext != null) {
            analyticsContext.mo21333d(DisplayVideoReviewsEvent.VIDEO_REVIEW_MODAL_DISMISSED.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
        }
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle2) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle2);
        loadListingVideoReviewFragment();
    }

    public final void setBundle(Bundle bundle2) {
        this.bundle = bundle2;
    }
}
