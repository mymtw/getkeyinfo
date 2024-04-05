package com.etsy.android.p327ui.core.nudge;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.core.nudge.NudgePanelViewRedesign */
public final class NudgePanelViewRedesign extends LinearLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private C8672b analyticsTracker;
    private Integer currentAnim;
    private final C19285c nudgeImage$delegate;
    private final C19285c nudgeLottie$delegate;
    private final C19285c nudgeText$delegate;
    private final C19285c nudgeTitle$delegate;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NudgePanelViewRedesign(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NudgePanelViewRedesign(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NudgePanelViewRedesign(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        this.nudgeTitle$delegate = C19350d.m32677b(new NudgePanelViewRedesign$nudgeTitle$2(this));
        this.nudgeText$delegate = C19350d.m32677b(new NudgePanelViewRedesign$nudgeText$2(this));
        this.nudgeLottie$delegate = C19350d.m32677b(new NudgePanelViewRedesign$nudgeLottie$2(this));
        this.nudgeImage$delegate = C19350d.m32677b(new NudgePanelViewRedesign$nudgeImage$2(this));
        LayoutInflater.from(context).inflate(R.layout.view_lottie_nudge_redesign, this, true);
        setImportantForAccessibility(1);
        if (Build.VERSION.SDK_INT >= 28) {
            setScreenReaderFocusable(true);
        } else {
            setFocusable(true);
        }
    }

    private final ImageView getNudgeImage() {
        return (ImageView) this.nudgeImage$delegate.getValue();
    }

    private final LottieAnimationView getNudgeLottie() {
        return (LottieAnimationView) this.nudgeLottie$delegate.getValue();
    }

    private final TextView getNudgeText() {
        return (TextView) this.nudgeText$delegate.getValue();
    }

    private final TextView getNudgeTitle() {
        return (TextView) this.nudgeTitle$delegate.getValue();
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
        return getNudgeLottie().isAnimating();
    }

    public final C8672b getAnalyticsTracker() {
        return this.analyticsTracker;
    }

    public final void hide() {
        ViewExtensions.m12860d(this);
    }

    public final void setAnalyticsTracker(C8672b bVar) {
        this.analyticsTracker = bVar;
    }

    public final void setContent(String str) {
        C19383o.m32797g(str, "text");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C18263b.m30867s0(str));
        Object[] spans = spannableStringBuilder.getSpans(0, str.length(), URLSpan.class);
        C19383o.m32796f(spans, "spannableBuilder.getSpan…gth, URLSpan::class.java)");
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            spannableStringBuilder.removeSpan(uRLSpan);
            spannableStringBuilder.setSpan(new NudgePanelViewRedesign$setContent$1$1(this, uRLSpan, uRLSpan.getURL()), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), 17);
        }
        getNudgeText().setText(spannableStringBuilder);
        getNudgeText().setMovementMethod(LinkMovementMethod.getInstance());
        setContentDescription(str);
    }

    public final void setImage(int i) {
        getNudgeImage().setImageResource(i);
        ViewExtensions.m12860d(getNudgeLottie());
        ViewExtensions.m12869m(getNudgeImage());
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "title");
        getNudgeTitle().setText(str);
    }

    public final void show() {
        ViewExtensions.m12869m(this);
    }

    public final void showEndFor(int i) {
        Integer num = this.currentAnim;
        if (num == null || num.intValue() != i) {
            getNudgeLottie().setAnimation(i);
            getNudgeLottie().setProgress(1.0f);
            this.currentAnim = Integer.valueOf(i);
            ViewExtensions.m12869m(getNudgeLottie());
            ViewExtensions.m12860d(getNudgeImage());
        }
    }

    public final void showStartFor(int i) {
        Integer num = this.currentAnim;
        if (num == null || num.intValue() != i) {
            getNudgeLottie().setAnimation(i);
            getNudgeLottie().setProgress(0.0f);
            this.currentAnim = Integer.valueOf(i);
            ViewExtensions.m12869m(getNudgeLottie());
            ViewExtensions.m12860d(getNudgeImage());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NudgePanelViewRedesign(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
