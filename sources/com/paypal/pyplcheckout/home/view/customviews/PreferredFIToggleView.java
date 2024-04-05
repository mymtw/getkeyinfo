package com.paypal.pyplcheckout.home.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;

@SuppressLint({"CustomViewStyleable"})
public final class PreferredFIToggleView extends ConstraintLayout {
    public Map<Integer, View> _$_findViewCache;
    private boolean isFavorite;
    private ImageView preferredFIViewState;
    private TextView preferredText;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PreferredFIToggleView(Context context) {
        this(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreferredFIToggleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void animateFavoriteText() {
        AnimationUtils.INSTANCE.expandFavorite(this.preferredText, this);
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

    public final void deselectPaymentStateAsFavorite() {
        this.isFavorite = false;
        ImageView imageView = this.preferredFIViewState;
        Context context = getContext();
        int i = C17165R.C17166drawable.ic_preferred_gray;
        Object obj = C8184a.f17966a;
        imageView.setImageDrawable(C8184a.C8187c.m16466b(context, i));
        this.preferredFIViewState.setContentDescription(getContext().getString(C17165R.string.paypal_checkout_preferred_fi_instrument_button));
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setFavorite(boolean z) {
        this.isFavorite = z;
    }

    public final void updatePaymentViewStateToFavorite(boolean z) {
        this.isFavorite = true;
        ImageView imageView = this.preferredFIViewState;
        Context context = getContext();
        int i = C17165R.C17166drawable.ic_preferred_orange;
        Object obj = C8184a.f17966a;
        imageView.setImageDrawable(C8184a.C8187c.m16466b(context, i));
        if (z) {
            animateFavoriteText();
        }
        this.preferredFIViewState.setContentDescription(getContext().getString(C17165R.string.paypal_checkout_preferred_fi_instrument_button_selected));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferredFIToggleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17165R.styleable.preferred_fi_view_attrs, 0, 0);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…iew_attrs, 0, 0\n        )");
        this.isFavorite = obtainStyledAttributes.getBoolean(C17165R.styleable.preferred_fi_view_attrs_is_favorite_payment, false);
        obtainStyledAttributes.recycle();
        View.inflate(context, C17165R.C17169layout.preferred_fi_view_layout, this);
        View findViewById = findViewById(C17165R.C17167id.preferred_fi_view_state);
        C19383o.m32796f(findViewById, "findViewById(R.id.preferred_fi_view_state)");
        this.preferredFIViewState = (ImageView) findViewById;
        View findViewById2 = findViewById(C17165R.C17167id.preferred_text);
        C19383o.m32796f(findViewById2, "findViewById(R.id.preferred_text)");
        this.preferredText = (TextView) findViewById2;
        if (this.isFavorite) {
            ImageView imageView = this.preferredFIViewState;
            int i = C17165R.C17166drawable.ic_preferred_orange;
            Object obj = C8184a.f17966a;
            imageView.setImageDrawable(C8184a.C8187c.m16466b(context, i));
        }
    }
}
