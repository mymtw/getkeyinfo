package com.etsy.android.p327ui.core.listingpromotion;

import android.content.Context;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p374jc.C12970a;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listingpromotion.ListingPromotionView */
public final class ListingPromotionView extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListingPromotionView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListingPromotionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingPromotionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
    }

    private final void hideDisclaimer() {
        ViewExtensions.m12860d((TextView) _$_findCachedViewById(R.id.text_disclaimer));
    }

    private final void setDescription(String str, boolean z, C19857l<? super View, C19394m> lVar) {
        Spanned s0 = C18263b.m30867s0(str);
        ((TextView) _$_findCachedViewById(R.id.text_description)).setText(s0);
        URLSpan[] urls = ((TextView) _$_findCachedViewById(R.id.text_description)).getUrls();
        C19383o.m32796f(urls, "text_description.urls");
        if (!(!(urls.length == 0)) || lVar == null || !z) {
            ((TextView) _$_findCachedViewById(R.id.text_description)).setText(s0.toString());
            return;
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.text_description);
        C19383o.m32796f(textView, "text_description");
        EtsyLinkify.m19608b(textView, true, false, trackingClick(lVar));
    }

    private final void setDisclaimer(String str) {
        ((TextView) _$_findCachedViewById(R.id.text_disclaimer)).setText(str);
        ViewExtensions.m12869m((TextView) _$_findCachedViewById(R.id.text_disclaimer));
    }

    private final TrackingOnClickListener trackingClick(C19857l<? super View, C19394m> lVar) {
        return new ListingPromotionView$trackingClick$1(lVar);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onDestroyView() {
        EtsyLinkify.m19614h((TextView) _$_findCachedViewById(R.id.text_description));
    }

    public final void render(C12970a aVar) {
        C19383o.m32797g(aVar, "state");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingPromotionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
