package com.reddit.indicatorfastscroll;

import android.animation.StateListAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.reddit.indicatorfastscroll.C17346a;
import com.reddit.indicatorfastscroll.FastScrollerView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C19410j;
import p166l1.C7218b;
import p166l1.C7233d;
import p166l1.C7234e;
import p568fn.C17782b;
import p628nj.C18263b;

public final class FastScrollerThumbView extends ConstraintLayout implements FastScrollerView.C17343b {
    public static final /* synthetic */ C19410j[] $$delegatedProperties;
    private FastScrollerView fastScrollerView;
    private final C17351d iconColor$delegate;
    private final ImageView iconView;
    private final C17351d textAppearanceRes$delegate;
    private final C17351d textColor$delegate;
    private final TextView textView;
    private final C7233d thumbAnimation;
    private final C17351d thumbColor$delegate;
    private final ViewGroup thumbView;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C19386q.m32807a(FastScrollerThumbView.class), "thumbColor", "getThumbColor()Landroid/content/res/ColorStateList;");
        C19386q.f43269a.getClass();
        $$delegatedProperties = new C19410j[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(C19386q.m32807a(FastScrollerThumbView.class), "iconColor", "getIconColor()I"), new MutablePropertyReference1Impl(C19386q.m32807a(FastScrollerThumbView.class), "textAppearanceRes", "getTextAppearanceRes()I"), new MutablePropertyReference1Impl(C19386q.m32807a(FastScrollerThumbView.class), "textColor", "getTextColor()I")};
    }

    public FastScrollerThumbView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public FastScrollerThumbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FastScrollerThumbView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.indicatorFastScrollerThumbStyle : i);
    }

    /* access modifiers changed from: private */
    public final void applyStyle() {
        StateListAnimator stateListAnimator = this.thumbView.getStateListAnimator();
        if (stateListAnimator != null && !this.thumbView.isAttachedToWindow()) {
            ViewGroup viewGroup = this.thumbView;
            ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new FastScrollerThumbView$$special$$inlined$doOnPreDraw$1(viewGroup, viewTreeObserver, stateListAnimator));
        }
        this.thumbView.setBackgroundTintList(getThumbColor());
        this.textView.setTextAppearance(getTextAppearanceRes());
        this.textView.setTextColor(getTextColor());
        this.iconView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    private final boolean isSetup() {
        return this.fastScrollerView != null;
    }

    public final int getIconColor() {
        return ((Number) this.iconColor$delegate.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final int getTextAppearanceRes() {
        return ((Number) this.textAppearanceRes$delegate.getValue(this, $$delegatedProperties[2])).intValue();
    }

    public final int getTextColor() {
        return ((Number) this.textColor$delegate.getValue(this, $$delegatedProperties[3])).intValue();
    }

    public final ColorStateList getThumbColor() {
        return (ColorStateList) this.thumbColor$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public void onItemIndicatorSelected(C17346a aVar, int i, int i2) {
        C19383o.m32798h(aVar, "indicator");
        this.thumbAnimation.mo19506c(((float) i) - ((float) (this.thumbView.getMeasuredHeight() / 2)));
        if (aVar instanceof C17346a.C17348b) {
            this.textView.setVisibility(0);
            this.iconView.setVisibility(8);
            this.textView.setText(((C17346a.C17348b) aVar).f37878a);
        } else if (aVar instanceof C17346a.C17347a) {
            this.textView.setVisibility(8);
            this.iconView.setVisibility(0);
            C17346a.C17347a aVar2 = (C17346a.C17347a) aVar;
            this.iconView.setImageResource(0);
        }
    }

    public final void setIconColor(int i) {
        this.iconColor$delegate.mo68379a(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setTextAppearanceRes(int i) {
        this.textAppearanceRes$delegate.mo68379a(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    public final void setTextColor(int i) {
        this.textColor$delegate.mo68379a(this, $$delegatedProperties[3], Integer.valueOf(i));
    }

    public final void setThumbColor(ColorStateList colorStateList) {
        C19383o.m32798h(colorStateList, "<set-?>");
        this.thumbColor$delegate.mo68379a(this, $$delegatedProperties[0], colorStateList);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setupWithFastScroller(FastScrollerView fastScrollerView2) {
        C19383o.m32798h(fastScrollerView2, "fastScrollerView");
        if (!isSetup()) {
            this.fastScrollerView = fastScrollerView2;
            fastScrollerView2.getItemIndicatorSelectedCallbacks().add(this);
            fastScrollerView2.setOnItemIndicatorTouched$indicator_fast_scroll_release(new FastScrollerThumbView$setupWithFastScroller$2(this));
            return;
        }
        throw new IllegalStateException("Only set this view's FastScrollerView once!".toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastScrollerThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32798h(context, ResponseConstants.CONTEXT);
        this.thumbColor$delegate = new C17351d(new FastScrollerThumbView$thumbColor$2(this));
        this.iconColor$delegate = new C17351d(new FastScrollerThumbView$iconColor$2(this));
        this.textAppearanceRes$delegate = new C17351d(new FastScrollerThumbView$textAppearanceRes$2(this));
        this.textColor$delegate = new C17351d(new FastScrollerThumbView$textColor$2(this));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C18263b.f40061Z, i, 2132018416);
        C19383o.m32793c(obtainStyledAttributes, "context.theme.obtainStyl…l_FastScrollerThumb\n    )");
        C17782b.m29876n0(this, 2132018416, new FastScrollerThumbView$$special$$inlined$use$lambda$1(obtainStyledAttributes, this));
        C19394m mVar = C19394m.f43287a;
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(R.layout.fast_scroller_thumb_view, this, true);
        View findViewById = findViewById(R.id.fast_scroller_thumb);
        C19383o.m32793c(findViewById, "findViewById(R.id.fast_scroller_thumb)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.thumbView = viewGroup;
        View findViewById2 = viewGroup.findViewById(R.id.fast_scroller_thumb_text);
        C19383o.m32793c(findViewById2, "thumbView.findViewById(R…fast_scroller_thumb_text)");
        this.textView = (TextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.fast_scroller_thumb_icon);
        C19383o.m32793c(findViewById3, "thumbView.findViewById(R…fast_scroller_thumb_icon)");
        this.iconView = (ImageView) findViewById3;
        applyStyle();
        C7233d dVar = new C7233d(viewGroup, C7218b.f16017l);
        C7234e eVar = new C7234e();
        eVar.f16043b = (double) 1.0f;
        eVar.f16044c = false;
        dVar.f16039u = eVar;
        this.thumbAnimation = dVar;
    }
}
