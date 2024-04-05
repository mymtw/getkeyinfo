package com.etsy.android.stylekit.views;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.animation.C0391c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2364y;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlin.text.C19457k;
import p186n2.C7377b;
import p186n2.C7390d;
import p186n2.C7418m;
import p186n2.C7425p;
import p186n2.C7426q;
import p186n2.C7429r;
import p388lb.C13006a;
import p396mb.C13036b;
import p396mb.C13037c;
import p396mb.C13042h;
import p404nb.C13100a;
import p435rb.C13350a;
import p435rb.C13351b;

public final class CollageContentToggle extends ConstraintLayout {
    public static final int $stable = 8;
    private final View bottomLine;
    private final C13036b collapseAction;
    /* access modifiers changed from: private */
    public final LinearLayout content;
    private ObjectAnimator contentAnimator;
    private final TextView description;
    private final C13037c expandAction;
    private final C13042h.C13043a expandableOnPerformAction;
    private boolean expanded;
    private final ConstraintLayout header;
    private boolean inflated;
    private boolean isPopOut;
    private boolean largeTitle;
    private C9030a listener;
    private final View popOutArrow;
    private boolean showBottomDivider;
    private final TextView title;
    private final FrameLayout titleCompanion;
    private final CheckBox toggleArrow;

    public static final class SavedState extends View.BaseSavedState {
        public static final CREATOR CREATOR = new CREATOR((DefaultConstructorMarker) null);
        private boolean expanded;

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
            StringBuilder h = C0072d.m201h("CollageContentToggle.SavedState{");
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

    /* renamed from: com.etsy.android.stylekit.views.CollageContentToggle$a */
    public interface C9030a {
        void onAnimationComplete();

        void onCollapse();

        void onExpanded();

        void onPopOut();
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageContentToggle$b */
    public static final class C9031b extends C7425p {

        /* renamed from: a */
        public final /* synthetic */ CollageContentToggle f19901a;

        public C9031b(CollageContentToggle collageContentToggle) {
            this.f19901a = collageContentToggle;
        }

        public final void onTransitionEnd(C7418m mVar) {
            C19383o.m32797g(mVar, "transition");
            C9030a listener = this.f19901a.getListener();
            if (listener != null) {
                listener.onAnimationComplete();
            }
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageContentToggle$c */
    public static final class C9032c extends C7425p {

        /* renamed from: a */
        public final /* synthetic */ CollageContentToggle f19902a;

        public C9032c(CollageContentToggle collageContentToggle) {
            this.f19902a = collageContentToggle;
        }

        public final void onTransitionEnd(C7418m mVar) {
            C19383o.m32797g(mVar, "transition");
            this.f19902a.setEnabled(true);
            this.f19902a.content.setVisibility(8);
            C9030a listener = this.f19902a.getListener();
            if (listener != null) {
                listener.onAnimationComplete();
            }
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageContentToggle$d */
    public static final class C9033d extends C7425p {

        /* renamed from: a */
        public final /* synthetic */ CollageContentToggle f19903a;

        public C9033d(CollageContentToggle collageContentToggle) {
            this.f19903a = collageContentToggle;
        }

        public final void onTransitionEnd(C7418m mVar) {
            C19383o.m32797g(mVar, "transition");
            C9030a listener = this.f19903a.getListener();
            if (listener != null) {
                listener.onAnimationComplete();
            }
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageContentToggle$e */
    public static final class C9034e extends C7425p {

        /* renamed from: a */
        public final /* synthetic */ CollageContentToggle f19904a;

        public C9034e(CollageContentToggle collageContentToggle) {
            this.f19904a = collageContentToggle;
        }

        public final void onTransitionEnd(C7418m mVar) {
            C19383o.m32797g(mVar, "transition");
            this.f19904a.setEnabled(true);
            C9030a listener = this.f19904a.getListener();
            if (listener != null) {
                listener.onAnimationComplete();
            }
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageContentToggle$f */
    public static final class C9035f implements C13042h.C13043a {

        /* renamed from: a */
        public final /* synthetic */ CollageContentToggle f19905a;

        public C9035f(CollageContentToggle collageContentToggle) {
            this.f19905a = collageContentToggle;
        }

        /* renamed from: a */
        public final boolean mo30839a(Bundle bundle) {
            this.f19905a.toggle();
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageContentToggle(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageContentToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageContentToggle(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void animateCollapse() {
        endRunningAnimations();
        C7429r rVar = new C7429r();
        C7390d dVar = new C7390d();
        C7377b bVar = new C7377b();
        C7377b bVar2 = new C7377b();
        C7390d dVar2 = new C7390d();
        C7377b bVar3 = new C7377b();
        dVar.f16565g.add(this.content);
        dVar.f16562d = 300;
        bVar.f16565g.add(this.content);
        bVar.f16562d = 300;
        bVar2.f16565g.add(this.title);
        bVar2.f16562d = 300;
        dVar2.f16561c = 200;
        dVar2.f16565g.add(this.description);
        dVar2.f16562d = 150;
        bVar3.f16561c = 0;
        bVar3.f16565g.add(this.bottomLine);
        bVar3.f16565g.add(this);
        bVar3.f16562d = 300;
        rVar.mo19770F(new FastOutSlowInInterpolator());
        rVar.mo19802N(dVar);
        rVar.mo19802N(bVar);
        rVar.mo19802N(bVar2);
        rVar.mo19802N(dVar2);
        rVar.mo19802N(bVar3);
        rVar.mo19801M(new C9031b(this));
        C7426q.m14342a(this, rVar);
        this.content.setVisibility(8);
        CharSequence text = this.description.getText();
        C19383o.m32796f(text, "description.text");
        if (!C19457k.m33020X0(text)) {
            this.description.setVisibility(0);
        }
        LinearLayout linearLayout = this.content;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{0.0f, (float) C13350a.m21014e(12, context)});
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(300);
        ofFloat.start();
        this.contentAnimator = ofFloat;
        this.toggleArrow.setChecked(false);
    }

    private final void animateCollapseForRecyclerView() {
        endRunningAnimations();
        setEnabled(false);
        C7429r rVar = new C7429r();
        C7390d dVar = new C7390d();
        C7390d dVar2 = new C7390d();
        C7377b bVar = new C7377b();
        dVar.f16565g.add(this.content);
        dVar.f16562d = 300;
        dVar2.f16561c = 200;
        dVar2.f16565g.add(this.description);
        dVar2.f16562d = 150;
        rVar.mo19770F(new FastOutSlowInInterpolator());
        rVar.mo19802N(dVar);
        rVar.mo19802N(bVar);
        rVar.mo19802N(dVar2);
        rVar.mo19801M(new C9032c(this));
        C7426q.m14342a(this, rVar);
        this.content.setVisibility(4);
        CharSequence text = this.description.getText();
        C19383o.m32796f(text, "description.text");
        if (!C19457k.m33020X0(text)) {
            this.description.setVisibility(0);
        }
        LinearLayout linearLayout = this.content;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{0.0f, (float) C13350a.m21014e(12, context)});
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(300);
        ofFloat.start();
        this.contentAnimator = ofFloat;
        this.toggleArrow.setChecked(false);
    }

    private final void animateExpand() {
        endRunningAnimations();
        C7429r rVar = new C7429r();
        C7390d dVar = new C7390d();
        C7377b bVar = new C7377b();
        C7377b bVar2 = new C7377b();
        C7390d dVar2 = new C7390d();
        C7377b bVar3 = new C7377b();
        dVar.f16565g.add(this.description);
        dVar.f16562d = 150;
        bVar.f16565g.add(this.bottomLine);
        bVar.f16565g.add(this);
        bVar.f16562d = 300;
        bVar2.f16561c = 50;
        bVar2.f16565g.add(this.title);
        bVar2.f16562d = 300;
        dVar2.f16561c = 200;
        dVar2.f16565g.add(this.content);
        dVar2.f16562d = 300;
        bVar3.f16561c = 200;
        bVar3.f16565g.add(this.content);
        bVar3.f16562d = 300;
        rVar.mo19770F(new FastOutSlowInInterpolator());
        rVar.mo19802N(dVar);
        rVar.mo19802N(bVar);
        rVar.mo19802N(bVar2);
        rVar.mo19802N(dVar2);
        rVar.mo19802N(bVar3);
        rVar.mo19801M(new C9033d(this));
        C7426q.m14342a(this, rVar);
        this.description.setVisibility(8);
        this.content.setVisibility(0);
        LinearLayout linearLayout = this.content;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{(float) C13350a.m21014e(12, context), 0.0f});
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setStartDelay(200);
        ofFloat.setDuration(300);
        ofFloat.start();
        this.contentAnimator = ofFloat;
        this.toggleArrow.setChecked(true);
    }

    private final void animateExpandForRecyclerView() {
        endRunningAnimations();
        setEnabled(false);
        C7429r rVar = new C7429r();
        C7390d dVar = new C7390d();
        C7377b bVar = new C7377b();
        C7377b bVar2 = new C7377b();
        C7390d dVar2 = new C7390d();
        C7377b bVar3 = new C7377b();
        dVar.f16565g.add(this.description);
        dVar.f16562d = 150;
        bVar.f16565g.add(this.bottomLine);
        bVar.f16565g.add(this);
        bVar.f16562d = 300;
        bVar2.f16561c = 50;
        bVar2.f16565g.add(this.title);
        bVar2.f16562d = 300;
        dVar2.f16561c = 200;
        dVar2.f16565g.add(this.content);
        dVar2.f16562d = 300;
        bVar3.f16561c = 200;
        bVar3.f16565g.add(this.content);
        bVar3.f16562d = 300;
        rVar.mo19770F(new FastOutSlowInInterpolator());
        rVar.mo19802N(dVar);
        rVar.mo19802N(bVar);
        rVar.mo19802N(bVar2);
        rVar.mo19802N(dVar2);
        rVar.mo19802N(bVar3);
        rVar.mo19801M(new C9034e(this));
        C7426q.m14342a(this, rVar);
        this.description.setVisibility(8);
        this.content.setVisibility(0);
        LinearLayout linearLayout = this.content;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{(float) C13350a.m21014e(12, context), 0.0f});
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setStartDelay(200);
        ofFloat.setDuration(300);
        ofFloat.start();
        this.contentAnimator = ofFloat;
        this.toggleArrow.setChecked(true);
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
        this.toggleArrow.setChecked(false);
        this.toggleArrow.getBackground().jumpToCurrentState();
        CharSequence text = this.description.getText();
        C19383o.m32796f(text, "description.text");
        if (!C19457k.m33020X0(text)) {
            this.description.setVisibility(0);
        }
        this.content.setVisibility(8);
        this.expanded = false;
        C13100a.m20773d(this.header, this.collapseAction, this.expandAction);
    }

    private final void jumpToExpanded() {
        this.content.setTranslationY(0.0f);
        this.toggleArrow.setChecked(true);
        this.toggleArrow.getBackground().jumpToCurrentState();
        this.description.setVisibility(8);
        this.content.setVisibility(0);
        this.expanded = true;
        C13100a.m20773d(this.header, this.expandAction, this.collapseAction);
    }

    /* access modifiers changed from: private */
    /* renamed from: setPopOut$lambda-1  reason: not valid java name */
    public static final void m34884setPopOut$lambda1(CollageContentToggle collageContentToggle, View view) {
        C19383o.m32797g(collageContentToggle, "this$0");
        C9030a aVar = collageContentToggle.listener;
        if (aVar != null) {
            aVar.onPopOut();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setPopOut$lambda-2  reason: not valid java name */
    public static final void m34885setPopOut$lambda2(CollageContentToggle collageContentToggle, View view) {
        C19383o.m32797g(collageContentToggle, "this$0");
        collageContentToggle.toggle();
    }

    /* access modifiers changed from: private */
    public final void toggle() {
        if (this.expanded) {
            collapse();
        } else {
            expand();
        }
    }

    public void addView(View view) {
        if (this.inflated) {
            this.content.addView(view);
        } else {
            super.addView(view);
        }
    }

    public final void collapse() {
        if (!this.isPopOut && this.expanded) {
            this.expanded = false;
            C13100a.m20773d(this.header, this.collapseAction, this.expandAction);
            if (getParent() instanceof RecyclerView) {
                animateCollapseForRecyclerView();
            } else {
                animateCollapse();
            }
            C9030a aVar = this.listener;
            if (aVar != null) {
                aVar.onCollapse();
            }
        }
    }

    public final void expand() {
        if (!this.isPopOut && !this.expanded) {
            this.expanded = true;
            C13100a.m20773d(this.header, this.expandAction, this.collapseAction);
            if (getParent() instanceof RecyclerView) {
                animateExpandForRecyclerView();
            } else {
                animateExpand();
            }
            C9030a aVar = this.listener;
            if (aVar != null) {
                aVar.onExpanded();
            }
        }
    }

    public final CharSequence getDescription() {
        return this.description.getText();
    }

    public final C9030a getListener() {
        return this.listener;
    }

    public final CharSequence getTitle() {
        return this.title.getText();
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
        C19383o.m32795e(parcelable, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageContentToggle.SavedState");
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

    public final void setDescription(CharSequence charSequence) {
        this.description.setText(charSequence);
        CharSequence text = this.description.getText();
        C19383o.m32796f(text, "this.description.text");
        if (!(!C19457k.m33020X0(text)) || this.expanded) {
            this.description.setVisibility(8);
        } else {
            this.description.setVisibility(0);
        }
    }

    public final void setDescriptionEllipsize(TextUtils.TruncateAt truncateAt) {
        C19383o.m32797g(truncateAt, "truncateAt");
        this.description.setEllipsize(truncateAt);
    }

    public final void setExpanded(boolean z) {
        this.expanded = z;
        if (z) {
            jumpToExpanded();
        } else {
            jumpToCollapsed();
        }
    }

    public final void setLargeTitle(boolean z) {
        this.largeTitle = z;
        ViewGroup.LayoutParams layoutParams = this.title.getLayoutParams();
        C19383o.m32795e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = this.header.getLayoutParams();
        C19383o.m32795e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        if (this.largeTitle) {
            C13351b.m21018b(this.title, R.style.clg_text_title_large);
            layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.clg_space_20);
            layoutParams2.goneBottomMargin = getResources().getDimensionPixelSize(R.dimen.clg_space_20);
            C19421p.m32936d0(getResources().getDimensionPixelSize(R.dimen.clg_space_20), this.description);
            C19421p.m32936d0(getResources().getDimensionPixelSize(R.dimen.clg_space_24), this.content);
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            layoutParams4.matchConstraintMinHeight = C13350a.m21015f(62, context);
            return;
        }
        C13351b.m21018b(this.title, R.style.clg_text_title);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        layoutParams2.goneBottomMargin = getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        C19421p.m32936d0(getResources().getDimensionPixelSize(R.dimen.clg_space_8), this.description);
        C19421p.m32936d0(getResources().getDimensionPixelSize(R.dimen.clg_space_12), this.content);
        layoutParams4.matchConstraintMinHeight = getResources().getDimensionPixelSize(R.dimen.tap_target_size_sp);
    }

    public final void setListener(C9030a aVar) {
        this.listener = aVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.header.setOnClickListener(onClickListener);
    }

    public final void setPopOut(boolean z) {
        this.isPopOut = z;
        if (z) {
            this.toggleArrow.setVisibility(8);
            this.popOutArrow.setVisibility(0);
            setOnClickListener(new C9053d(this, 0));
            return;
        }
        this.toggleArrow.setVisibility(0);
        this.popOutArrow.setVisibility(8);
        setOnClickListener(new C9054e(this, 0));
    }

    public final void setTitle(CharSequence charSequence) {
        this.title.setText(charSequence);
        C2364y.m5202q(this.content, charSequence);
    }

    public final void setTitleCompanionView(View view) {
        this.titleCompanion.removeAllViews();
        if (view == null) {
            this.titleCompanion.setVisibility(8);
            return;
        }
        this.titleCompanion.addView(view, new FrameLayout.LayoutParams(-2, -1));
        this.titleCompanion.setVisibility(0);
    }

    public final void showBottomDivider(boolean z) {
        this.showBottomDivider = z;
        if (z) {
            this.bottomLine.setVisibility(0);
        } else {
            this.bottomLine.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageContentToggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TextUtils.TruncateAt truncateAt;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C9035f fVar = new C9035f(this);
        this.expandableOnPerformAction = fVar;
        this.expandAction = new C13037c(fVar);
        this.collapseAction = new C13036b(fVar);
        LayoutInflater.from(context).inflate(R.layout.clg_content_toggle, this, true);
        this.inflated = true;
        View findViewById = findViewById(R.id.clg_content_toggle_summary_title);
        C19383o.m32796f(findViewById, "findViewById(R.id.clg_co…ent_toggle_summary_title)");
        this.title = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.clg_content_toggle_summary_description);
        C19383o.m32796f(findViewById2, "findViewById(R.id.clg_co…ggle_summary_description)");
        this.description = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.clg_content_toggle_title_companion);
        C19383o.m32796f(findViewById3, "findViewById(R.id.clg_co…t_toggle_title_companion)");
        this.titleCompanion = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(R.id.clg_content_toggle_arrow);
        C19383o.m32796f(findViewById4, "findViewById(R.id.clg_content_toggle_arrow)");
        this.toggleArrow = (CheckBox) findViewById4;
        View findViewById5 = findViewById(R.id.clg_content_toggle_popout_arrow);
        C19383o.m32796f(findViewById5, "findViewById(R.id.clg_content_toggle_popout_arrow)");
        this.popOutArrow = findViewById5;
        View findViewById6 = findViewById(R.id.clg_content_toggle_content);
        C19383o.m32796f(findViewById6, "findViewById(R.id.clg_content_toggle_content)");
        this.content = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(R.id.clg_content_toggle_bottom_divider);
        C19383o.m32796f(findViewById7, "findViewById(R.id.clg_co…nt_toggle_bottom_divider)");
        this.bottomLine = findViewById7;
        View findViewById8 = findViewById(R.id.clg_content_toggle_header);
        C19383o.m32796f(findViewById8, "findViewById(R.id.clg_content_toggle_header)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById8;
        this.header = constraintLayout;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28642i, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…llageContentToggle, 0, 0)");
            this.isPopOut = obtainStyledAttributes.getBoolean(3, false);
            this.expanded = obtainStyledAttributes.getBoolean(2, false);
            this.showBottomDivider = obtainStyledAttributes.getBoolean(5, false);
            this.largeTitle = obtainStyledAttributes.getBoolean(4, false);
            String string = obtainStyledAttributes.getString(6);
            String string2 = obtainStyledAttributes.getString(1);
            setTitle(string);
            setDescription(string2);
            int integer = obtainStyledAttributes.getInteger(0, 0);
            if (integer == 1) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (integer == 2) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else if (integer != 3) {
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                truncateAt = TextUtils.TruncateAt.END;
            }
            setDescriptionEllipsize(truncateAt);
            obtainStyledAttributes.recycle();
        }
        constraintLayout.setFocusable(true);
        constraintLayout.setClickable(true);
        constraintLayout.setImportantForAccessibility(1);
        ViewsExtensionsKt.m17424c(constraintLayout, true);
        ViewsExtensionsKt.m17423b(constraintLayout, AccessibilityClassNames.BUTTON);
        setPopOut(this.isPopOut);
        if (this.expanded) {
            jumpToExpanded();
        } else {
            jumpToCollapsed();
        }
        showBottomDivider(this.showBottomDivider);
        setLargeTitle(this.largeTitle);
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
}
