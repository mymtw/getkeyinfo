package com.etsy.android.p327ui.core.listingnomapper.listingvariations;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.lib.models.apiv3.listing.FormattedMoney;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.VariationType;
import com.etsy.android.stylekit.views.CollageListItem;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import org.apache.commons.lang3.StringEscapeUtils;
import p260v0.C8184a;
import p435rb.C13350a;

/* renamed from: com.etsy.android.ui.core.listingnomapper.listingvariations.i */
public final class C9694i extends RecyclerView.Adapter<RecyclerView.C3084b0> {

    /* renamed from: b */
    public final List<AppsInventoryUiOption> f21467b;

    /* renamed from: c */
    public final Map<Long, ListingImage> f21468c;

    /* renamed from: d */
    public final Integer[] f21469d = null;

    /* renamed from: e */
    public final VariationType f21470e;

    /* renamed from: f */
    public final C9691f f21471f;

    /* renamed from: g */
    public final C10156h f21472g;

    /* renamed from: com.etsy.android.ui.core.listingnomapper.listingvariations.i$a */
    public /* synthetic */ class C9695a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21473a;

        static {
            int[] iArr = new int[VariationType.values().length];
            iArr[VariationType.VARIATION_FIRST.ordinal()] = 1;
            iArr[VariationType.VARIATION_SECOND.ordinal()] = 2;
            iArr[VariationType.QUANTITY.ordinal()] = 3;
            f21473a = iArr;
        }
    }

    public C9694i(List list, Map map, VariationType variationType, C9691f fVar, C10156h hVar) {
        C19383o.m32797g(variationType, "variationType");
        C19383o.m32797g(hVar, "listingViewEligibility");
        this.f21467b = list;
        this.f21468c = map;
        this.f21470e = variationType;
        this.f21471f = fVar;
        this.f21472g = hVar;
    }

    public final int getItemCount() {
        int i = C9695a.f21473a[this.f21470e.ordinal()];
        if (i == 1) {
            List<AppsInventoryUiOption> list = this.f21467b;
            if (list != null) {
                return list.size();
            }
            return 0;
        } else if (i == 2) {
            List<AppsInventoryUiOption> list2 = this.f21467b;
            if (list2 != null) {
                return list2.size();
            }
            return 0;
        } else if (i == 3) {
            Integer[] numArr = this.f21469d;
            if (numArr != null) {
                return numArr.length;
            }
            return 0;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final int getItemViewType(int i) {
        int i2 = C9695a.f21473a[this.f21470e.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32797g(b0Var, "holder");
        int itemViewType = getItemViewType(i);
        String str = null;
        if (itemViewType == 0 || itemViewType == 1) {
            List<AppsInventoryUiOption> list = this.f21467b;
            if (list != null) {
                String str2 = "";
                if (b0Var instanceof C9692g) {
                    AppsInventoryUiOption appsInventoryUiOption = list.get(i);
                    C9692g gVar = (C9692g) b0Var;
                    ListingImage listingImage = this.f21468c.get(appsInventoryUiOption.getValue());
                    if (listingImage != null) {
                        gVar.f21462f.setBackgroundDrawable((Drawable) null);
                        gVar.f21462f.setImageInfo(listingImage);
                    } else {
                        gVar.f21462f.setBackgroundResource(R.drawable.bg_rounded_rect);
                        gVar.f21462f.setBackgroundTintList(ColorStateList.valueOf(gVar.itemView.getResources().getColor(R.color.listing_variation_bottom_sheet_thumbnail_background)));
                        gVar.f21462f.setImageDrawable((Drawable) null);
                    }
                    TextView textView = gVar.f21459c;
                    String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(String.valueOf(appsInventoryUiOption.getRawDisplayValue()));
                    if (unescapeHtml4 != null) {
                        str2 = unescapeHtml4;
                    }
                    textView.setText(str2);
                    FormattedMoney displayValue = appsInventoryUiOption.getDisplayValue();
                    String formattedMoney = displayValue != null ? displayValue.toString() : null;
                    String s1 = formattedMoney != null ? C19459m.m33050s1(formattedMoney, String.valueOf(appsInventoryUiOption.getRawDisplayValue())) : null;
                    String u1 = s1 != null ? C19459m.m33052u1(C19459m.m33050s1(s1, " ")) : null;
                    TextView textView2 = gVar.f21460d;
                    if (u1 != null) {
                        str = StringEscapeUtils.unescapeHtml4(u1);
                    }
                    textView2.setText(str);
                    Boolean selected = appsInventoryUiOption.getSelected();
                    Boolean bool = Boolean.TRUE;
                    if (C19383o.m32792b(selected, bool)) {
                        ViewExtensions.m12869m(gVar.f21461e);
                        ViewExtensions.m12860d(gVar.f21460d);
                    } else {
                        ViewExtensions.m12860d(gVar.f21461e);
                        ViewExtensions.m12869m(gVar.f21460d);
                    }
                    if (C19383o.m32792b(appsInventoryUiOption.getEnabled(), bool)) {
                        View view = gVar.itemView;
                        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageListItem");
                        CollageListItem collageListItem = (CollageListItem) view;
                        gVar.itemView.setEnabled(true);
                        Context context = gVar.itemView.getContext();
                        C19383o.m32796f(context, "itemView.context");
                        int d = C13350a.m21013d(context, R.attr.clg_color_text_primary);
                        gVar.f21459c.setTextColor(d);
                        gVar.f21460d.setTextColor(d);
                    } else {
                        View view2 = gVar.itemView;
                        C19383o.m32795e(view2, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageListItem");
                        CollageListItem collageListItem2 = (CollageListItem) view2;
                        gVar.itemView.setEnabled(false);
                        Context context2 = gVar.itemView.getContext();
                        Object obj = C8184a.f17966a;
                        int a = C8184a.C8188d.m16468a(context2, R.color.text_gray_disabled);
                        gVar.f21459c.setTextColor(a);
                        gVar.f21460d.setTextColor(a);
                    }
                    View view3 = gVar.itemView;
                    C19383o.m32796f(view3, "itemView");
                    ViewExtensions.m12866j(view3, new VariationOptionsThumbnailVariantViewHolder$bind$1(gVar, appsInventoryUiOption));
                    return;
                }
                C9693h hVar = (C9693h) b0Var;
                AppsInventoryUiOption appsInventoryUiOption2 = list.get(i);
                C19383o.m32797g(appsInventoryUiOption2, "option");
                TextView textView3 = hVar.f21464c;
                String unescapeHtml42 = StringEscapeUtils.unescapeHtml4(String.valueOf(appsInventoryUiOption2.getRawDisplayValue()));
                if (unescapeHtml42 != null) {
                    str2 = unescapeHtml42;
                }
                textView3.setText(str2);
                FormattedMoney displayValue2 = appsInventoryUiOption2.getDisplayValue();
                String formattedMoney2 = displayValue2 != null ? displayValue2.toString() : null;
                String s12 = formattedMoney2 != null ? C19459m.m33050s1(formattedMoney2, String.valueOf(appsInventoryUiOption2.getRawDisplayValue())) : null;
                String u12 = s12 != null ? C19459m.m33052u1(C19459m.m33050s1(s12, " ")) : null;
                TextView textView4 = hVar.f21465d;
                if (u12 != null) {
                    str = StringEscapeUtils.unescapeHtml4(u12);
                }
                textView4.setText(str);
                Boolean selected2 = appsInventoryUiOption2.getSelected();
                Boolean bool2 = Boolean.TRUE;
                if (C19383o.m32792b(selected2, bool2)) {
                    ViewExtensions.m12869m(hVar.f21466e);
                    ViewExtensions.m12860d(hVar.f21465d);
                } else {
                    ViewExtensions.m12860d(hVar.f21466e);
                    ViewExtensions.m12869m(hVar.f21465d);
                }
                if (C19383o.m32792b(appsInventoryUiOption2.getEnabled(), bool2)) {
                    View view4 = hVar.itemView;
                    C19383o.m32795e(view4, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageListItem");
                    CollageListItem collageListItem3 = (CollageListItem) view4;
                    hVar.itemView.setEnabled(true);
                    Context context3 = hVar.itemView.getContext();
                    C19383o.m32796f(context3, "itemView.context");
                    int d2 = C13350a.m21013d(context3, R.attr.clg_color_text_primary);
                    hVar.f21464c.setTextColor(d2);
                    hVar.f21465d.setTextColor(d2);
                } else {
                    View view5 = hVar.itemView;
                    C19383o.m32795e(view5, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageListItem");
                    CollageListItem collageListItem4 = (CollageListItem) view5;
                    hVar.itemView.setEnabled(false);
                    Context context4 = hVar.itemView.getContext();
                    Object obj2 = C8184a.f17966a;
                    int a2 = C8184a.C8188d.m16468a(context4, R.color.text_gray_disabled);
                    hVar.f21464c.setTextColor(a2);
                    hVar.f21465d.setTextColor(a2);
                }
                View view6 = hVar.itemView;
                C19383o.m32796f(view6, "itemView");
                ViewExtensions.m12866j(view6, new VariationOptionsViewHolder$bind$1(hVar, appsInventoryUiOption2));
            }
        } else if (itemViewType == 2) {
            C9690e eVar = (C9690e) b0Var;
            eVar.f21457b.setText((CharSequence) null);
            View view7 = eVar.itemView;
            C19383o.m32796f(view7, "itemView");
            ViewExtensions.m12866j(view7, new QuantityViewHolder$bind$1(eVar, (Integer[]) null, i));
        }
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        List<AppsInventoryUiOption> list = this.f21467b;
        boolean z = (list != null && (list.isEmpty() ^ true)) && (this.f21468c.isEmpty() ^ true) && this.f21472g.f22335a.mo21132b(C8592b.C8601i.f18896j);
        if (i == 0 || i == 1) {
            if (z) {
                View inflate = from.inflate(R.layout.layout_variation_thumbnail_variant_sheet_item, viewGroup, false);
                C19383o.m32796f(inflate, "view");
                return new C9692g(inflate, this.f21471f);
            }
            View inflate2 = from.inflate(R.layout.layout_variation_sheet_item, viewGroup, false);
            C19383o.m32796f(inflate2, "view");
            return new C9693h(inflate2, this.f21471f);
        } else if (i != 2) {
            View inflate3 = from.inflate(R.layout.layout_variation_sheet_item, viewGroup, false);
            C19383o.m32796f(inflate3, "view");
            return new C9693h(inflate3, this.f21471f);
        } else {
            View inflate4 = from.inflate(R.layout.clg_select_item, viewGroup, false);
            C19383o.m32796f(inflate4, "view");
            return new C9690e(inflate4, (C9689d) null);
        }
    }
}
