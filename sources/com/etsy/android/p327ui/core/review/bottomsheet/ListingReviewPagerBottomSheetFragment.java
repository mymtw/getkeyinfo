package com.etsy.android.p327ui.core.review.bottomsheet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.core.review.DisplayVideoReviewsEvent;
import com.etsy.android.p327ui.core.review.ListingReviewPagerFragment;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import com.etsy.android.uikit.zoom.C12029a;
import com.etsy.android.uikit.zoom.C12030b;
import com.etsy.android.uikit.zoom.C12031c;
import com.etsy.android.uikit.zoom.C12032d;
import com.etsy.android.uikit.zoom.ZoomTouchListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p381kc.C12990a;
import p392lf.C13020a;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.core.review.bottomsheet.ListingReviewPagerBottomSheetFragment */
public final class ListingReviewPagerBottomSheetFragment extends TrackingBottomSheetDialogFragment implements C13366a, C13020a, C12990a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Bundle bundle;

    private final void loadListingReviewFragment() {
        ListingReviewPagerFragment listingReviewPagerFragment = new ListingReviewPagerFragment(this);
        listingReviewPagerFragment.setArguments(this.bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C2740a aVar = new C2740a(childFragmentManager);
        aVar.mo10531h(R.id.bottom_sheet_fragment_container, listingReviewPagerFragment, (String) null);
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

    public void activateZoomOnDialog(View view, C12032d dVar) {
        Window window;
        C19383o.m32797g(view, "view");
        C19383o.m32797g(dVar, "zoomListener");
        ImageView imageView = (ImageView) view.findViewById(R.id.buyer_review_image);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C19383o.m32796f(imageView, ResponseConstants.IMAGE);
            C12031c cVar = new C12031c(0);
            View decorView = window.getDecorView();
            C19383o.m32795e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            imageView.setOnTouchListener(new ZoomTouchListener((ViewGroup) decorView, imageView, cVar, (C12030b) null, (C12029a) null, dVar));
        }
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
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
        }
        this.bundle = bundle2;
    }

    public Dialog onCreateDialog(Bundle bundle2) {
        return new ListingReviewPagerBottomSheetFragment$onCreateDialog$1(this, requireActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle2) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_listing_review_pager_bottom_sheet, viewGroup, false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C19383o.m32797g(dialogInterface, "dialog");
        C8703p analyticsContext = getAnalyticsContext();
        if (analyticsContext != null) {
            analyticsContext.mo21333d(DisplayVideoReviewsEvent.REVIEW_MODAL_DISMISSED.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
        }
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle2) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle2);
        loadListingReviewFragment();
    }
}
