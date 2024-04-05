package com.etsy.android.p327ui.listing.p329ui.toppanel.favoriteinfo.confetti;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.StyledBannerModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import p504ai.C13983i;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.listing.ui.toppanel.favoriteinfo.confetti.ConfettiView */
public final class ConfettiView extends FrameLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final ImageView confettiHeart1;
    private final ImageView confettiHeart2;
    private final ImageView confettiHeart3;
    private final ImageView confettiHeart4;
    private final ImageView confettiHeart5;
    private final ImageView confettiStar1;
    private final ImageView confettiStar10;
    private final ImageView confettiStar2;
    private final ImageView confettiStar3;
    private final ImageView confettiStar4;
    private final ImageView confettiStar5;
    private final ImageView confettiStar6;
    private final ImageView confettiStar7;
    private final ImageView confettiStar8;
    private final ImageView confettiStar9;
    private final List<ImageView> promptConfetti;
    private final List<ImageView> successConfetti;
    private final ImageView successRipple;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConfettiView(Context context) {
        this(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        this._$_findViewCache = C13983i.m21496o(context2, ResponseConstants.CONTEXT);
        View.inflate(context2, R.layout.view_confetti, this);
        View findViewById = findViewById(R.id.confetti_star_1);
        C19383o.m32796f(findViewById, "findViewById(R.id.confetti_star_1)");
        ImageView imageView = (ImageView) findViewById;
        this.confettiStar1 = imageView;
        View findViewById2 = findViewById(R.id.confetti_star_2);
        C19383o.m32796f(findViewById2, "findViewById(R.id.confetti_star_2)");
        ImageView imageView2 = (ImageView) findViewById2;
        this.confettiStar2 = imageView2;
        View findViewById3 = findViewById(R.id.confetti_star_3);
        C19383o.m32796f(findViewById3, "findViewById(R.id.confetti_star_3)");
        ImageView imageView3 = (ImageView) findViewById3;
        this.confettiStar3 = imageView3;
        View findViewById4 = findViewById(R.id.confetti_star_4);
        C19383o.m32796f(findViewById4, "findViewById(R.id.confetti_star_4)");
        ImageView imageView4 = (ImageView) findViewById4;
        this.confettiStar4 = imageView4;
        View findViewById5 = findViewById(R.id.confetti_star_5);
        C19383o.m32796f(findViewById5, "findViewById(R.id.confetti_star_5)");
        ImageView imageView5 = (ImageView) findViewById5;
        this.confettiStar5 = imageView5;
        View findViewById6 = findViewById(R.id.confetti_star_6);
        C19383o.m32796f(findViewById6, "findViewById(R.id.confetti_star_6)");
        ImageView imageView6 = (ImageView) findViewById6;
        this.confettiStar6 = imageView6;
        View findViewById7 = findViewById(R.id.confetti_star_7);
        C19383o.m32796f(findViewById7, "findViewById(R.id.confetti_star_7)");
        ImageView imageView7 = (ImageView) findViewById7;
        this.confettiStar7 = imageView7;
        View findViewById8 = findViewById(R.id.confetti_star_8);
        C19383o.m32796f(findViewById8, "findViewById(R.id.confetti_star_8)");
        ImageView imageView8 = (ImageView) findViewById8;
        this.confettiStar8 = imageView8;
        View findViewById9 = findViewById(R.id.confetti_star_9);
        C19383o.m32796f(findViewById9, "findViewById(R.id.confetti_star_9)");
        ImageView imageView9 = (ImageView) findViewById9;
        this.confettiStar9 = imageView9;
        View findViewById10 = findViewById(R.id.confetti_star_10);
        C19383o.m32796f(findViewById10, "findViewById(R.id.confetti_star_10)");
        ImageView imageView10 = (ImageView) findViewById10;
        this.confettiStar10 = imageView10;
        View findViewById11 = findViewById(R.id.confetti_heart_1);
        C19383o.m32796f(findViewById11, "findViewById(R.id.confetti_heart_1)");
        ImageView imageView11 = (ImageView) findViewById11;
        this.confettiHeart1 = imageView11;
        View findViewById12 = findViewById(R.id.confetti_heart_2);
        C19383o.m32796f(findViewById12, "findViewById(R.id.confetti_heart_2)");
        ImageView imageView12 = (ImageView) findViewById12;
        this.confettiHeart2 = imageView12;
        View findViewById13 = findViewById(R.id.confetti_heart_3);
        C19383o.m32796f(findViewById13, "findViewById(R.id.confetti_heart_3)");
        ImageView imageView13 = (ImageView) findViewById13;
        this.confettiHeart3 = imageView13;
        View findViewById14 = findViewById(R.id.confetti_heart_4);
        C19383o.m32796f(findViewById14, "findViewById(R.id.confetti_heart_4)");
        ImageView imageView14 = (ImageView) findViewById14;
        this.confettiHeart4 = imageView14;
        View findViewById15 = findViewById(R.id.confetti_heart_5);
        ImageView imageView15 = imageView14;
        C19383o.m32796f(findViewById15, "findViewById(R.id.confetti_heart_5)");
        ImageView imageView16 = (ImageView) findViewById15;
        this.confettiHeart5 = imageView16;
        View findViewById16 = findViewById(R.id.success_ripple);
        C19383o.m32796f(findViewById16, "findViewById(R.id.success_ripple)");
        this.successRipple = (ImageView) findViewById16;
        this.promptConfetti = C17782b.m29865e0(imageView, imageView2, imageView3, imageView4, imageView5);
        this.successConfetti = C17782b.m29865e0(imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView15, imageView16);
        setClipChildren(false);
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

    public final Pair<Float, Float> centerPoint(ImageView imageView) {
        C19383o.m32797g(imageView, "confetti");
        return new Pair<>(Float.valueOf((((float) getWidth()) / 2.0f) - (((float) imageView.getWidth()) / 2.0f)), Float.valueOf((((float) getHeight()) / 2.0f) - (((float) imageView.getHeight()) / 2.0f)));
    }

    public final List<ImageView> getPromptConfetti() {
        return this.promptConfetti;
    }

    public final List<ImageView> getSuccessConfetti() {
        return this.successConfetti;
    }

    public final ImageView getSuccessRipple() {
        return this.successRipple;
    }

    public final Pair<Float, Float> randomPoint(ImageView imageView) {
        C19383o.m32797g(imageView, StyledBannerModel.STAR);
        int width = getWidth() - imageView.getWidth();
        int height = getHeight() - imageView.getHeight();
        int width2 = getWidth();
        double nextInt = (double) Random.Default.nextInt(0, 360);
        double d = (double) width2;
        int sin = (int) ((Math.sin(nextInt) * d) + ((double) (((float) getWidth()) / 2.0f)));
        int cos = (int) ((Math.cos(nextInt) * d) + ((double) (((float) getHeight()) / 2.0f)));
        if (sin <= width) {
            width = sin;
        }
        if (cos <= height) {
            height = cos;
        }
        return new Pair<>(Float.valueOf((float) width), Float.valueOf((float) height));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConfettiView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
