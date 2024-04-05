package com.etsy.android.p327ui.listing.p329ui.buyitnow.summary;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2364y;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.C9060k;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p186n2.C7377b;
import p186n2.C7390d;
import p186n2.C7418m;
import p186n2.C7425p;
import p186n2.C7426q;
import p186n2.C7429r;
import p396mb.C13036b;
import p396mb.C13037c;
import p396mb.C13042h;
import p404nb.C13100a;
import p435rb.C13350a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.BuyItNowTotalContentToggle */
public final class BuyItNowTotalContentToggle extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final C13036b collapseAction;
    private final TextView collapsedTitle;
    private final LinearLayout content;
    private ObjectAnimator contentAnimator;
    private final ImageView downArrow;
    private final C13037c expandAction;
    private final C13042h.C13043a expandableOnPerformAction;
    private boolean expanded;
    private final TextView expandedTitle;
    private final LinearLayout header;
    private boolean inflated;
    private C10401a listener;
    private final ImageView upArrow;

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.BuyItNowTotalContentToggle$SavedState */
    public static final class SavedState extends View.BaseSavedState {
        public static final CREATOR CREATOR = new CREATOR((DefaultConstructorMarker) null);
        private boolean expanded;

        /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.BuyItNowTotalContentToggle$SavedState$CREATOR */
        public static final class CREATOR implements Parcelable.Creator<SavedState> {
            private CREATOR() {
            }

            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public SavedState createFromParcel(Parcel parcel) {
                C19383o.m32797g(parcel, "parcel");
                return new SavedState(parcel, (DefaultConstructorMarker) null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final boolean getExpanded() {
            return this.expanded;
        }

        public final void setExpanded(boolean z) {
            this.expanded = z;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("BuyItNowTotalContentToggle.SavedState{");
            h.append(Integer.toHexString(System.identityHashCode(this)));
            h.append(" expanded=");
            return C0391c.m1058d(h, this.expanded, '}');
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.expanded));
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            Object readValue = parcel.readValue(SavedState.class.getClassLoader());
            C19383o.m32795e(readValue, "null cannot be cast to non-null type kotlin.Boolean");
            this.expanded = ((Boolean) readValue).booleanValue();
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.BuyItNowTotalContentToggle$a */
    public interface C10401a {
        void onAnimationComplete();

        void onCollapse();

        void onExpanded();
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.BuyItNowTotalContentToggle$b */
    public static final class C10402b extends C7425p {

        /* renamed from: a */
        public final /* synthetic */ BuyItNowTotalContentToggle f22771a;

        public C10402b(BuyItNowTotalContentToggle buyItNowTotalContentToggle) {
            this.f22771a = buyItNowTotalContentToggle;
        }

        public final void onTransitionEnd(C7418m mVar) {
            C19383o.m32797g(mVar, "transition");
            C10401a listener = this.f22771a.getListener();
            if (listener != null) {
                listener.onAnimationComplete();
            }
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.BuyItNowTotalContentToggle$c */
    public static final class C10403c extends C7425p {

        /* renamed from: a */
        public final /* synthetic */ BuyItNowTotalContentToggle f22772a;

        public C10403c(BuyItNowTotalContentToggle buyItNowTotalContentToggle) {
            this.f22772a = buyItNowTotalContentToggle;
        }

        public final void onTransitionEnd(C7418m mVar) {
            C19383o.m32797g(mVar, "transition");
            C10401a listener = this.f22772a.getListener();
            if (listener != null) {
                listener.onAnimationComplete();
            }
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.BuyItNowTotalContentToggle$d */
    public static final class C10404d implements C13042h.C13043a {

        /* renamed from: a */
        public final /* synthetic */ BuyItNowTotalContentToggle f22773a;

        public C10404d(BuyItNowTotalContentToggle buyItNowTotalContentToggle) {
            this.f22773a = buyItNowTotalContentToggle;
        }

        /* renamed from: a */
        public final boolean mo30839a(Bundle bundle) {
            this.f22773a.toggle();
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BuyItNowTotalContentToggle(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BuyItNowTotalContentToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuyItNowTotalContentToggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        C10404d dVar = new C10404d(this);
        this.expandableOnPerformAction = dVar;
        this.expandAction = new C13037c(dVar);
        this.collapseAction = new C13036b(dVar);
        LayoutInflater.from(context).inflate(R.layout.view_buy_it_now_total_content_toggle, this, true);
        this.inflated = true;
        View findViewById = findViewById(R.id.collapsed_title);
        C19383o.m32796f(findViewById, "findViewById(R.id.collapsed_title)");
        this.collapsedTitle = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.expanded_title);
        C19383o.m32796f(findViewById2, "findViewById(R.id.expanded_title)");
        this.expandedTitle = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.clg_content_toggle_content);
        C19383o.m32796f(findViewById3, "findViewById(R.id.clg_content_toggle_content)");
        this.content = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.clg_content_toggle_header);
        C19383o.m32796f(findViewById4, "findViewById(R.id.clg_content_toggle_header)");
        LinearLayout linearLayout = (LinearLayout) findViewById4;
        this.header = linearLayout;
        View findViewById5 = findViewById(R.id.up_arrow);
        C19383o.m32796f(findViewById5, "findViewById(R.id.up_arrow)");
        this.upArrow = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.down_arrow);
        C19383o.m32796f(findViewById6, "findViewById(R.id.down_arrow)");
        this.downArrow = (ImageView) findViewById6;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1993m.f4489d, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…TotalContentToggle, 0, 0)");
            this.expanded = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        linearLayout.setFocusable(true);
        linearLayout.setClickable(true);
        linearLayout.setImportantForAccessibility(1);
        ViewsExtensionsKt.m17424c(linearLayout, true);
        ViewsExtensionsKt.m17423b(linearLayout, AccessibilityClassNames.BUTTON);
        if (this.expanded) {
            jumpToExpanded();
        } else {
            jumpToCollapsed();
        }
        setOnClickListener(new C9060k(this, 3));
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-1  reason: not valid java name */
    public static final void m35013_init_$lambda1(BuyItNowTotalContentToggle buyItNowTotalContentToggle, View view) {
        C19383o.m32797g(buyItNowTotalContentToggle, "this$0");
        buyItNowTotalContentToggle.toggle();
    }

    private final void animateCollapse() {
        endRunningAnimations();
        C7429r rVar = new C7429r();
        C7390d dVar = new C7390d();
        C7377b bVar = new C7377b();
        C7390d dVar2 = new C7390d();
        dVar.f16565g.add(this.content);
        dVar.f16562d = 300;
        bVar.f16565g.add(this.content);
        bVar.f16562d = 300;
        dVar2.f16565g.add(this.collapsedTitle);
        dVar2.f16565g.add(this.expandedTitle);
        dVar2.f16565g.add(this.upArrow);
        dVar2.f16565g.add(this.downArrow);
        dVar2.f16562d = 300;
        rVar.mo19770F(new FastOutSlowInInterpolator());
        rVar.mo19802N(dVar);
        rVar.mo19802N(bVar);
        rVar.mo19802N(dVar2);
        rVar.mo19801M(new C10402b(this));
        C7426q.m14342a(this, rVar);
        this.content.setVisibility(8);
        this.expandedTitle.setVisibility(8);
        this.collapsedTitle.setVisibility(0);
        this.downArrow.setVisibility(0);
        this.upArrow.setVisibility(8);
        LinearLayout linearLayout = this.content;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{0.0f, (float) C13350a.m21014e(12, context)});
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(300);
        ofFloat.start();
        this.contentAnimator = ofFloat;
    }

    private final void animateExpand() {
        endRunningAnimations();
        C7429r rVar = new C7429r();
        C7390d dVar = new C7390d();
        C7390d dVar2 = new C7390d();
        C7377b bVar = new C7377b();
        dVar.f16565g.add(this.collapsedTitle);
        dVar.f16565g.add(this.expandedTitle);
        dVar.f16565g.add(this.upArrow);
        dVar.f16565g.add(this.downArrow);
        dVar.f16562d = 300;
        dVar2.f16561c = 200;
        dVar2.f16565g.add(this.content);
        dVar2.f16562d = 300;
        bVar.f16561c = 200;
        bVar.f16565g.add(this.content);
        bVar.f16562d = 300;
        rVar.mo19770F(new FastOutSlowInInterpolator());
        rVar.mo19802N(dVar);
        rVar.mo19802N(dVar2);
        rVar.mo19802N(bVar);
        rVar.mo19801M(new C10403c(this));
        C7426q.m14342a(this, rVar);
        this.content.setVisibility(0);
        this.expandedTitle.setVisibility(0);
        this.collapsedTitle.setVisibility(8);
        this.downArrow.setVisibility(8);
        this.upArrow.setVisibility(0);
        LinearLayout linearLayout = this.content;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{(float) C13350a.m21014e(12, context), 0.0f});
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setStartDelay(200);
        ofFloat.setDuration(300);
        ofFloat.start();
        this.contentAnimator = ofFloat;
    }

    private final void endRunningAnimations() {
        C7426q.m14343b(this);
        ObjectAnimator objectAnimator = this.contentAnimator;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        this.contentAnimator = null;
    }

    private final void jumpToCollapsed() {
        LinearLayout linearLayout = this.content;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        linearLayout.setTranslationY((float) C13350a.m21014e(12, context));
        this.content.setVisibility(8);
        this.expanded = false;
        this.expandedTitle.setVisibility(8);
        this.collapsedTitle.setVisibility(0);
        this.upArrow.setVisibility(8);
        this.downArrow.setVisibility(0);
        C13100a.m20773d(this.header, this.collapseAction, this.expandAction);
    }

    private final void jumpToExpanded() {
        this.content.setTranslationY(0.0f);
        this.content.setVisibility(0);
        this.expanded = true;
        this.expandedTitle.setVisibility(0);
        this.collapsedTitle.setVisibility(8);
        this.upArrow.setVisibility(0);
        this.downArrow.setVisibility(8);
        C13100a.m20773d(this.header, this.expandAction, this.collapseAction);
    }

    /* access modifiers changed from: private */
    public final void toggle() {
        if (this.expanded) {
            collapse();
        } else {
            expand();
        }
    }

    private final void updateAccessibilityPaneTitle() {
        C2364y.m5202q(this.content, isExpanded() ? this.expandedTitle.getText() : this.collapsedTitle.getText());
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

    public void addView(View view) {
        if (this.inflated) {
            this.content.addView(view);
        } else {
            super.addView(view);
        }
    }

    public final void collapse() {
        if (this.expanded) {
            this.expanded = false;
            updateAccessibilityPaneTitle();
            C13100a.m20773d(this.header, this.collapseAction, this.expandAction);
            animateCollapse();
            C10401a aVar = this.listener;
            if (aVar != null) {
                aVar.onCollapse();
            }
        }
    }

    public final void expand() {
        if (!this.expanded) {
            this.expanded = true;
            updateAccessibilityPaneTitle();
            C13100a.m20773d(this.header, this.expandAction, this.collapseAction);
            animateExpand();
            C10401a aVar = this.listener;
            if (aVar != null) {
                aVar.onExpanded();
            }
        }
    }

    public final C10401a getListener() {
        return this.listener;
    }

    public final CharSequence getTitle() {
        if (isExpanded()) {
            CharSequence text = this.expandedTitle.getText();
            C19383o.m32796f(text, "{\n            expandedTitle.text\n        }");
            return text;
        }
        CharSequence text2 = this.collapsedTitle.getText();
        C19383o.m32796f(text2, "{\n            collapsedTitle.text\n        }");
        return text2;
    }

    public final boolean isExpanded() {
        return this.expanded;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getParent() instanceof RecyclerView)) {
            ViewParent parent = getParent();
            C19383o.m32795e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setLayoutTransition(new LayoutTransition());
            ViewParent parent2 = getParent();
            C19383o.m32795e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent2).getLayoutTransition().enableTransitionType(4);
            ViewParent parent3 = getParent();
            C19383o.m32795e(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent3).getLayoutTransition().disableTransitionType(2);
            ViewParent parent4 = getParent();
            C19383o.m32795e(parent4, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent4).getLayoutTransition().disableTransitionType(3);
            ViewParent parent5 = getParent();
            C19383o.m32795e(parent5, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent5).getLayoutTransition().disableTransitionType(0);
            ViewParent parent6 = getParent();
            C19383o.m32795e(parent6, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent6).getLayoutTransition().disableTransitionType(1);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.expanded) {
            jumpToExpanded();
        } else {
            jumpToCollapsed();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C19383o.m32795e(parcelable, "null cannot be cast to non-null type com.etsy.android.ui.listing.ui.buyitnow.summary.BuyItNowTotalContentToggle.SavedState");
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.getExpanded()) {
            jumpToExpanded();
        } else {
            jumpToCollapsed();
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.setExpanded(this.expanded);
        return savedState;
    }

    public final void removeAllContentViews() {
        if (this.inflated) {
            this.content.removeAllViews();
        }
    }

    public final void setExpanded(boolean z) {
        this.expanded = z;
        if (z) {
            jumpToExpanded();
        } else {
            jumpToCollapsed();
        }
    }

    public final void setListener(C10401a aVar) {
        this.listener = aVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.header.setOnClickListener(onClickListener);
    }

    public final void setTitle(String str, String str2) {
        C19383o.m32797g(str, "collapsedTitleText");
        C19383o.m32797g(str2, "expandedTitleText");
        this.collapsedTitle.setText(str);
        this.expandedTitle.setText(str2);
        updateAccessibilityPaneTitle();
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C19383o.m32797g(layoutParams, ResponseConstants.PARAMS);
        if (this.inflated) {
            this.content.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.inflated) {
            this.content.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public void addView(View view, int i) {
        if (this.inflated) {
            this.content.addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    public void addView(View view, int i, int i2) {
        if (this.inflated) {
            this.content.addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BuyItNowTotalContentToggle(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
