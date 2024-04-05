package com.etsy.android.p327ui.core.nudge;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p015ui.text.font.C1948d;
import com.airbnb.lottie.LottieAnimationView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.view.ObservableScrollView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.core.nudge.NudgePanelView */
public final class NudgePanelView extends LinearLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private C8672b analyticsTracker;
    private Integer currentAnim;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NudgePanelView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NudgePanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NudgePanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        setImportantForAccessibility(1);
        if (Build.VERSION.SDK_INT >= 28) {
            setScreenReaderFocusable(true);
        } else {
            setFocusable(true);
        }
    }

    private final BottomNavigationView bottomNav() {
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        Activity i = C1948d.m4277i(context);
        if (i != null) {
            return (BottomNavigationView) i.findViewById(R.id.bottom_navigation);
        }
        return null;
    }

    private final ObservableScrollView scrollView() {
        ViewParent parent = getParent();
        for (int i = 0; i < 20; i++) {
            if (parent instanceof ObservableScrollView) {
                return (ObservableScrollView) parent;
            }
            parent = parent != null ? parent.getParent() : null;
        }
        return null;
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

    public final boolean animating() {
        return ((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie)).isAnimating();
    }

    public final C8672b getAnalyticsTracker() {
        return this.analyticsTracker;
    }

    public final void hide() {
        ViewExtensions.m12860d(this);
    }

    public final boolean onScreen() {
        ObservableScrollView scrollView = scrollView();
        if (scrollView == null) {
            return false;
        }
        Rect rect = new Rect();
        scrollView.getHitRect(rect);
        BottomNavigationView bottomNav = bottomNav();
        rect.bottom = (rect.bottom - (bottomNav != null ? bottomNav.getHeight() : 0)) - getHeight();
        return getLocalVisibleRect(rect) && (((getY() > 0.0f ? 1 : (getY() == 0.0f ? 0 : -1)) == 0) ^ true);
    }

    public final void playAnimation(int i) {
        ((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie)).setAnimation(i);
        ((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie)).playAnimation();
        ViewExtensions.m12869m((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie));
        ViewExtensions.m12860d((ImageView) _$_findCachedViewById(R.id.nudge_image));
    }

    public final void setAnalyticsTracker(C8672b bVar) {
        this.analyticsTracker = bVar;
    }

    public final void setImage(int i) {
        ((ImageView) _$_findCachedViewById(R.id.nudge_image)).setImageResource(i);
        ViewExtensions.m12860d((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie));
        ViewExtensions.m12869m((ImageView) _$_findCachedViewById(R.id.nudge_image));
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "text");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C18263b.m30867s0(str));
        Object[] spans = spannableStringBuilder.getSpans(0, str.length(), URLSpan.class);
        C19383o.m32796f(spans, "spannableBuilder.getSpan…gth, URLSpan::class.java)");
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            spannableStringBuilder.removeSpan(uRLSpan);
            spannableStringBuilder.setSpan(new NudgePanelView$setTitle$1$1(this, uRLSpan, uRLSpan.getURL()), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), 17);
        }
        ((TextView) _$_findCachedViewById(R.id.nudge_text)).setText(spannableStringBuilder);
        ((TextView) _$_findCachedViewById(R.id.nudge_text)).setMovementMethod(LinkMovementMethod.getInstance());
        setContentDescription(str);
    }

    public final void show() {
        ViewExtensions.m12869m(this);
    }

    public final void showEndFor(int i) {
        Integer num = this.currentAnim;
        if (num == null || num.intValue() != i) {
            ((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie)).setAnimation(i);
            ((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie)).setProgress(1.0f);
            this.currentAnim = Integer.valueOf(i);
            ViewExtensions.m12869m((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie));
            ViewExtensions.m12860d((ImageView) _$_findCachedViewById(R.id.nudge_image));
        }
    }

    public final void showStartFor(int i) {
        Integer num = this.currentAnim;
        if (num == null || num.intValue() != i) {
            ((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie)).setAnimation(i);
            ((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie)).setProgress(0.0f);
            this.currentAnim = Integer.valueOf(i);
            ViewExtensions.m12869m((LottieAnimationView) _$_findCachedViewById(R.id.nudge_lottie));
            ViewExtensions.m12860d((ImageView) _$_findCachedViewById(R.id.nudge_image));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NudgePanelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
