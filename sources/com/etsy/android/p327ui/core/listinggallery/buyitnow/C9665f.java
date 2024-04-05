package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.referrers.Referrer;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9684a;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9687c;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9694i;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.VariationType;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageTextView;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import org.apache.commons.lang3.StringEscapeUtils;
import p001a0.C0005b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.f */
public final class C9665f {

    /* renamed from: a */
    public final C0005b f21401a;

    /* renamed from: b */
    public final C10156h f21402b;

    /* renamed from: c */
    public final C9684a f21403c;

    /* renamed from: d */
    public C9671l f21404d;

    /* renamed from: e */
    public C9674o f21405e;

    /* renamed from: f */
    public C9677r f21406f;

    /* renamed from: g */
    public TrackingBaseFragment f21407g;

    /* renamed from: h */
    public C9666g f21408h;

    public C9665f(C0005b bVar, C10156h hVar, C9684a aVar) {
        this.f21401a = bVar;
        this.f21402b = hVar;
        this.f21403c = aVar;
    }

    /* renamed from: a */
    public static final void m18002a(C9665f fVar) {
        C8703p analyticsContext;
        TrackingBaseFragment trackingBaseFragment = fVar.f21407g;
        if (trackingBaseFragment != null && (analyticsContext = trackingBaseFragment.getAnalyticsContext()) != null) {
            analyticsContext.mo21333d("listing_variation_changed", fVar.mo32379b());
        }
    }

    /* renamed from: b */
    public final Map<AnalyticsProperty, Object> mo32379b() {
        TrackingBaseFragment trackingBaseFragment = this.f21407g;
        if (trackingBaseFragment == null) {
            return C19294b0.m32559p0();
        }
        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.REFERRER;
        C19285c<String> cVar = Referrer.f19131c;
        return C19421p.m32931U(new Pair(predefinedAnalyticsProperty, Referrer.C8712a.m17141a(trackingBaseFragment).toString()));
    }

    /* renamed from: c */
    public final void mo32380c() {
        C9671l lVar = this.f21404d;
        if (lVar != null) {
            lVar.mo32390a();
        }
        this.f21404d = null;
        C9674o oVar = this.f21405e;
        if (oVar != null) {
            CollageBottomSheet collageBottomSheet = oVar.f21434a;
            if (collageBottomSheet != null) {
                collageBottomSheet.setOnCancelListener((DialogInterface.OnCancelListener) null);
                collageBottomSheet.setOnDismissListener((DialogInterface.OnDismissListener) null);
                if (collageBottomSheet.isShowing()) {
                    collageBottomSheet.dismiss();
                }
            }
            oVar.f21434a = null;
        }
        this.f21405e = null;
        C9677r rVar = this.f21406f;
        if (rVar != null) {
            CollageBottomSheet collageBottomSheet2 = rVar.f21437a;
            if (collageBottomSheet2 != null) {
                collageBottomSheet2.setOnCancelListener((DialogInterface.OnCancelListener) null);
                collageBottomSheet2.setOnDismissListener((DialogInterface.OnDismissListener) null);
                if (collageBottomSheet2.isShowing()) {
                    collageBottomSheet2.dismiss();
                }
            }
            rVar.f21437a = null;
        }
        this.f21406f = null;
    }

    /* renamed from: d */
    public final void mo32381d(AppsInventoryUiSelect appsInventoryUiSelect, Map<Long, ListingImage> map, C19857l<? super AppsInventoryUiOption, C19394m> lVar) {
        mo32380c();
        List<AppsInventoryUiOption> options = appsInventoryUiSelect.getOptions();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(options));
        for (AppsInventoryUiOption value : options) {
            Long value2 = value.getValue();
            arrayList.add(Long.valueOf(value2 != null ? value2.longValue() : -1));
        }
        this.f21403c.getClass();
        Map a = C9684a.m18020a(arrayList, map);
        C9674o oVar = new C9674o();
        this.f21405e = oVar;
        TrackingBaseFragment trackingBaseFragment = this.f21407g;
        FragmentActivity requireActivity = trackingBaseFragment != null ? trackingBaseFragment.requireActivity() : null;
        C19383o.m32794d(requireActivity);
        C10156h hVar = this.f21402b;
        C19383o.m32797g(hVar, "listingViewEligibility");
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(requireActivity);
        View inflate = LayoutInflater.from(requireActivity).inflate(R.layout.layout_variation_options_bottom_sheet, (ViewGroup) null);
        ((CollageTextView) inflate.findViewById(R.id.variation_title)).setText(StringEscapeUtils.unescapeHtml4(appsInventoryUiSelect.getLabel()));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.variation_options);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(new C9694i(appsInventoryUiSelect.getOptions(), a, VariationType.VARIATION_FIRST, new C9673n(lVar), hVar));
        collageBottomSheet.setContentView(inflate);
        collageBottomSheet.setPopover(true);
        oVar.f21434a = collageBottomSheet;
        collageBottomSheet.setOnDismissListener((DialogInterface.OnDismissListener) null);
        collageBottomSheet.dismiss();
        collageBottomSheet.show();
        collageBottomSheet.setOnDismissListener(new C9672m(oVar));
    }

    /* renamed from: e */
    public final void mo32382e(Variation variation, C19857l<? super VariationValue, C19394m> lVar) {
        mo32380c();
        C9677r rVar = new C9677r();
        this.f21406f = rVar;
        TrackingBaseFragment trackingBaseFragment = this.f21407g;
        FragmentActivity requireActivity = trackingBaseFragment != null ? trackingBaseFragment.requireActivity() : null;
        C19383o.m32794d(requireActivity);
        C19383o.m32797g(variation, "variation");
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(requireActivity);
        View inflate = LayoutInflater.from(requireActivity).inflate(R.layout.layout_variation_options_bottom_sheet, (ViewGroup) null);
        ((CollageTextView) inflate.findViewById(R.id.variation_title)).setText(StringEscapeUtils.unescapeHtml4(variation.getName()));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.variation_options);
        recyclerView.setAdapter(new C9687c(variation.getValues(), new C9676q(lVar)));
        recyclerView.setLayoutManager(new LinearLayoutManager());
        collageBottomSheet.setContentView(inflate);
        collageBottomSheet.setPopover(true);
        rVar.f21437a = collageBottomSheet;
        collageBottomSheet.setOnDismissListener((DialogInterface.OnDismissListener) null);
        collageBottomSheet.dismiss();
        collageBottomSheet.show();
        collageBottomSheet.setOnDismissListener(new C9675p(rVar));
    }
}
