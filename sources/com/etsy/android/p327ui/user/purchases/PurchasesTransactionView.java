package com.etsy.android.p327ui.user.purchases;

import android.content.Context;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.util.EtsyLinkify;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.user.purchases.PurchasesTransactionView */
public final class PurchasesTransactionView extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PurchasesTransactionView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PurchasesTransactionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesTransactionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
    }

    private final void linkifyTransparentPricing() {
        URLSpan[] urls = ((TextView) _$_findCachedViewById(R.id.text_transparent_pricing)).getUrls();
        if ((urls != null ? urls.length : 0) > 0) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.text_transparent_pricing);
            C19383o.m32796f(textView, "text_transparent_pricing");
            EtsyLinkify.m19608b(textView, true, false, (View.OnClickListener) null);
        }
    }

    private final void setBuyThisAgainListener(long j, boolean z, boolean z2, C11628a aVar) {
        Button button = (Button) _$_findCachedViewById(R.id.buy_this_again_button);
        C19383o.m32796f(button, "buy_this_again_button");
        ViewExtensions.m12866j(button, new PurchasesTransactionView$setBuyThisAgainListener$1(aVar, j, z, z2));
    }

    private final void setHelpWithOrderClicked(long j, C11628a aVar) {
        Button button = (Button) _$_findCachedViewById(R.id.help_with_order_button);
        C19383o.m32796f(button, "help_with_order_button");
        ViewExtensions.m12866j(button, new PurchasesTransactionView$setHelpWithOrderClicked$1(aVar, j));
    }

    private final void setImageUrl(String str) {
        C0114h.m270B0(getContext()).load(str).mo16816M((ImageView) _$_findCachedViewById(R.id.item_image));
    }

    private final void setLeaveReviewClickListener(long j, C11628a aVar) {
        Button button = (Button) _$_findCachedViewById(R.id.review_callout);
        C19383o.m32796f(button, "review_callout");
        ViewExtensions.m12866j(button, new PurchasesTransactionView$setLeaveReviewClickListener$1(aVar, j));
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

    public final void setViewState(C11681w wVar, C11677s sVar) {
        C19383o.m32797g(wVar, "state");
        C19383o.m32797g(sVar, "receiptState");
        ((Button) _$_findCachedViewById(R.id.help_with_order_button)).setVisibility(wVar.f25887e);
        ((Button) _$_findCachedViewById(R.id.help_with_order_button)).setContentDescription(getContext().getResources().getString(R.string.help_with_order_desc, new Object[]{wVar.f25888f, sVar.f25869d}));
        ((CollageHeadingTextView) _$_findCachedViewById(R.id.listing_title)).setText(wVar.f25888f);
        CollageHeadingTextView collageHeadingTextView = (CollageHeadingTextView) _$_findCachedViewById(R.id.listing_title);
        C19383o.m32796f(collageHeadingTextView, ResponseConstants.LISTING_TITLE);
        ViewsExtensionsKt.m17423b(collageHeadingTextView, AccessibilityClassNames.BUTTON);
        ((TextView) _$_findCachedViewById(R.id.price)).setText(wVar.f25890h);
        ((TextView) _$_findCachedViewById(R.id.quantity)).setText(wVar.f25891i);
        ((TextView) _$_findCachedViewById(R.id.text_transparent_pricing)).setVisibility(wVar.f25892j);
        ((TextView) _$_findCachedViewById(R.id.text_transparent_pricing)).setText(wVar.f25893k);
        linkifyTransparentPricing();
        ((CollageRatingView) _$_findCachedViewById(R.id.rating)).setVisibility(wVar.f25894l);
        ((CollageRatingView) _$_findCachedViewById(R.id.rating)).setRating((float) wVar.f25895m);
        ((Button) _$_findCachedViewById(R.id.review_callout)).setVisibility(wVar.f25896n);
        ((Button) _$_findCachedViewById(R.id.review_callout)).setContentDescription(getContext().getResources().getString(R.string.leave_a_review_desc, new Object[]{wVar.f25888f, sVar.f25869d}));
        ((Button) _$_findCachedViewById(R.id.buy_this_again_button)).setVisibility(wVar.f25897o);
        ((Button) _$_findCachedViewById(R.id.buy_this_again_button)).setContentDescription(getContext().getResources().getString(R.string.buy_this_again_desc, new Object[]{wVar.f25888f, sVar.f25869d}));
        setImageUrl(wVar.f25900r);
        setLeaveReviewClickListener(wVar.f25885c, wVar.f25883a);
        setBuyThisAgainListener(wVar.f25886d, wVar.f25898p, wVar.f25899q, wVar.f25883a);
        setHelpWithOrderClicked(wVar.f25884b, wVar.f25883a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PurchasesTransactionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
