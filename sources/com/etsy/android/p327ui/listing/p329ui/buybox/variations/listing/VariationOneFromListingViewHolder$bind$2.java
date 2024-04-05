package com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.VariationType;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.StringEscapeUtils;
import p413od.C13154a;
import p466vc.C13573c;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.listing.VariationOneFromListingViewHolder$bind$2 */
public final class VariationOneFromListingViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C10423j $uiModel;
    public final /* synthetic */ VariationOneFromListingViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VariationOneFromListingViewHolder$bind$2(VariationOneFromListingViewHolder variationOneFromListingViewHolder, C10423j jVar) {
        super(1);
        this.this$0 = variationOneFromListingViewHolder;
        this.$uiModel = jVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13573c cVar = this.this$0.f22705b;
        String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(((C10349a) this.$uiModel).f22709a.getName());
        if (unescapeHtml4 == null) {
            unescapeHtml4 = "";
        }
        VariationType variationType = VariationType.VARIATION_FIRST;
        List values = ((C10349a) this.$uiModel).f22709a.getValues();
        if (values == null) {
            values = EmptyList.INSTANCE;
        }
        cVar.mo38043a(new C13597g.C13610b4(new C13154a(unescapeHtml4, variationType, new C13154a.C13155a.C13157b(values))));
    }
}
