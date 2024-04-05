package p726zi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.core.widget.C2397b;
import androidx.room.C3252r;
import androidx.room.C3254t;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.C9053d;
import com.etsy.android.stylekit.views.C9054e;
import com.google.android.exoplayer2.p526ui.DefaultTimeBar;
import com.google.android.exoplayer2.p526ui.StyledPlayerControlView;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.ArrayList;
import p579hi.C17811c;

/* renamed from: zi.l */
public final class C18917l {

    /* renamed from: A */
    public boolean f42137A;

    /* renamed from: B */
    public boolean f42138B;

    /* renamed from: C */
    public boolean f42139C = true;

    /* renamed from: a */
    public final StyledPlayerControlView f42140a;

    /* renamed from: b */
    public final View f42141b;

    /* renamed from: c */
    public final ViewGroup f42142c;

    /* renamed from: d */
    public final ViewGroup f42143d;

    /* renamed from: e */
    public final ViewGroup f42144e;

    /* renamed from: f */
    public final ViewGroup f42145f;

    /* renamed from: g */
    public final ViewGroup f42146g;

    /* renamed from: h */
    public final ViewGroup f42147h;

    /* renamed from: i */
    public final ViewGroup f42148i;

    /* renamed from: j */
    public final View f42149j;

    /* renamed from: k */
    public final View f42150k;

    /* renamed from: l */
    public final AnimatorSet f42151l;

    /* renamed from: m */
    public final AnimatorSet f42152m;

    /* renamed from: n */
    public final AnimatorSet f42153n;

    /* renamed from: o */
    public final AnimatorSet f42154o;

    /* renamed from: p */
    public final AnimatorSet f42155p;

    /* renamed from: q */
    public final ValueAnimator f42156q;

    /* renamed from: r */
    public final ValueAnimator f42157r;

    /* renamed from: s */
    public final C18911f f42158s = new C18911f(this, 0);

    /* renamed from: t */
    public final C3252r f42159t = new C3252r(this, 3);

    /* renamed from: u */
    public final C17811c f42160u = new C17811c(this, 1);

    /* renamed from: v */
    public final C3254t f42161v = new C3254t(this, 3);

    /* renamed from: w */
    public final C2397b f42162w = new C2397b(this, 4);

    /* renamed from: x */
    public final C18914i f42163x = new C18914i(this);

    /* renamed from: y */
    public final ArrayList f42164y = new ArrayList();

    /* renamed from: z */
    public int f42165z = 0;

    /* renamed from: zi.l$a */
    public class C18918a extends AnimatorListenerAdapter {
        public C18918a() {
        }

        public final void onAnimationEnd(Animator animator) {
            View view = C18917l.this.f42141b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = C18917l.this.f42142c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = C18917l.this.f42144e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            C18917l lVar = C18917l.this;
            View view = lVar.f42149j;
            if ((view instanceof DefaultTimeBar) && !lVar.f42137A) {
                ((DefaultTimeBar) view).hideScrubber(250);
            }
        }
    }

    /* renamed from: zi.l$b */
    public class C18919b extends AnimatorListenerAdapter {
        public C18919b() {
        }

        public final void onAnimationStart(Animator animator) {
            View view = C18917l.this.f42141b;
            int i = 0;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = C18917l.this.f42142c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            C18917l lVar = C18917l.this;
            ViewGroup viewGroup2 = lVar.f42144e;
            if (viewGroup2 != null) {
                if (!lVar.f42137A) {
                    i = 4;
                }
                viewGroup2.setVisibility(i);
            }
            C18917l lVar2 = C18917l.this;
            View view2 = lVar2.f42149j;
            if ((view2 instanceof DefaultTimeBar) && !lVar2.f42137A) {
                ((DefaultTimeBar) view2).showScrubber(250);
            }
        }
    }

    /* renamed from: zi.l$c */
    public class C18920c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f42168a;

        public C18920c(StyledPlayerControlView styledPlayerControlView) {
            this.f42168a = styledPlayerControlView;
        }

        public final void onAnimationEnd(Animator animator) {
            C18917l.this.mo70352i(1);
            C18917l lVar = C18917l.this;
            if (lVar.f42138B) {
                this.f42168a.post(lVar.f42158s);
                C18917l.this.f42138B = false;
            }
        }

        public final void onAnimationStart(Animator animator) {
            C18917l.this.mo70352i(3);
        }
    }

    /* renamed from: zi.l$d */
    public class C18921d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f42170a;

        public C18921d(StyledPlayerControlView styledPlayerControlView) {
            this.f42170a = styledPlayerControlView;
        }

        public final void onAnimationEnd(Animator animator) {
            C18917l.this.mo70352i(2);
            C18917l lVar = C18917l.this;
            if (lVar.f42138B) {
                this.f42170a.post(lVar.f42158s);
                C18917l.this.f42138B = false;
            }
        }

        public final void onAnimationStart(Animator animator) {
            C18917l.this.mo70352i(3);
        }
    }

    /* renamed from: zi.l$e */
    public class C18922e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f42172a;

        public C18922e(StyledPlayerControlView styledPlayerControlView) {
            this.f42172a = styledPlayerControlView;
        }

        public final void onAnimationEnd(Animator animator) {
            C18917l.this.mo70352i(2);
            C18917l lVar = C18917l.this;
            if (lVar.f42138B) {
                this.f42172a.post(lVar.f42158s);
                C18917l.this.f42138B = false;
            }
        }

        public final void onAnimationStart(Animator animator) {
            C18917l.this.mo70352i(3);
        }
    }

    /* renamed from: zi.l$f */
    public class C18923f extends AnimatorListenerAdapter {
        public C18923f() {
        }

        public final void onAnimationEnd(Animator animator) {
            C18917l.this.mo70352i(0);
        }

        public final void onAnimationStart(Animator animator) {
            C18917l.this.mo70352i(4);
        }
    }

    /* renamed from: zi.l$g */
    public class C18924g extends AnimatorListenerAdapter {
        public C18924g() {
        }

        public final void onAnimationEnd(Animator animator) {
            C18917l.this.mo70352i(0);
        }

        public final void onAnimationStart(Animator animator) {
            C18917l.this.mo70352i(4);
        }
    }

    /* renamed from: zi.l$h */
    public class C18925h extends AnimatorListenerAdapter {
        public C18925h() {
        }

        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = C18917l.this.f42145f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = C18917l.this.f42147h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = C18917l.this.f42147h;
                viewGroup2.setTranslationX((float) viewGroup2.getWidth());
                ViewGroup viewGroup3 = C18917l.this.f42147h;
                viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
            }
        }
    }

    /* renamed from: zi.l$i */
    public class C18926i extends AnimatorListenerAdapter {
        public C18926i() {
        }

        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = C18917l.this.f42147h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = C18917l.this.f42145f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    public C18917l(StyledPlayerControlView styledPlayerControlView) {
        this.f42140a = styledPlayerControlView;
        this.f42141b = styledPlayerControlView.findViewById(R.id.exo_controls_background);
        this.f42142c = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_center_controls);
        this.f42144e = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_bottom_bar);
        this.f42143d = viewGroup;
        this.f42148i = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_time);
        View findViewById = styledPlayerControlView.findViewById(R.id.exo_progress);
        this.f42149j = findViewById;
        this.f42145f = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_basic_controls);
        this.f42146g = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_extra_controls);
        this.f42147h = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = styledPlayerControlView.findViewById(R.id.exo_overflow_show);
        this.f42150k = findViewById2;
        View findViewById3 = styledPlayerControlView.findViewById(R.id.exo_overflow_hide);
        if (!(findViewById2 == null || findViewById3 == null)) {
            findViewById2.setOnClickListener(new C9053d(this, 5));
            findViewById3.setOnClickListener(new C9054e(this, 4));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C18915j(this));
        ofFloat.addListener(new C18918a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new C18916k(this));
        ofFloat2.addListener(new C18919b());
        Resources resources = styledPlayerControlView.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42151l = animatorSet;
        animatorSet.setDuration(250);
        animatorSet.addListener(new C18920c(styledPlayerControlView));
        animatorSet.play(ofFloat).with(m32013e(0.0f, dimension, findViewById)).with(m32013e(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f42152m = animatorSet2;
        animatorSet2.setDuration(250);
        animatorSet2.addListener(new C18921d(styledPlayerControlView));
        animatorSet2.play(m32013e(dimension, dimension2, findViewById)).with(m32013e(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f42153n = animatorSet3;
        animatorSet3.setDuration(250);
        animatorSet3.addListener(new C18922e(styledPlayerControlView));
        animatorSet3.play(ofFloat).with(m32013e(0.0f, dimension2, findViewById)).with(m32013e(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f42154o = animatorSet4;
        animatorSet4.setDuration(250);
        animatorSet4.addListener(new C18923f());
        animatorSet4.play(ofFloat2).with(m32013e(dimension, 0.0f, findViewById)).with(m32013e(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f42155p = animatorSet5;
        animatorSet5.setDuration(250);
        animatorSet5.addListener(new C18924g());
        animatorSet5.play(ofFloat2).with(m32013e(dimension2, 0.0f, findViewById)).with(m32013e(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f42156q = ofFloat3;
        ofFloat3.setDuration(250);
        ofFloat3.addUpdateListener(new C18912g(this));
        ofFloat3.addListener(new C18925h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f42157r = ofFloat4;
        ofFloat4.setDuration(250);
        ofFloat4.addUpdateListener(new C18913h(this));
        ofFloat4.addListener(new C18926i());
    }

    /* renamed from: a */
    public static void m32011a(C18917l lVar, View view) {
        lVar.mo70350g();
        if (view.getId() == R.id.exo_overflow_show) {
            lVar.f42156q.start();
        } else if (view.getId() == R.id.exo_overflow_hide) {
            lVar.f42157r.start();
        }
    }

    /* renamed from: d */
    public static int m32012d(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* renamed from: e */
    public static ObjectAnimator m32013e(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", new float[]{f, f2});
    }

    /* renamed from: j */
    public static boolean m32014j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    /* renamed from: b */
    public final void mo70347b(float f) {
        ViewGroup viewGroup = this.f42147h;
        if (viewGroup != null) {
            this.f42147h.setTranslationX((float) ((int) ((1.0f - f) * ((float) viewGroup.getWidth()))));
        }
        ViewGroup viewGroup2 = this.f42148i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f42145f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    /* renamed from: c */
    public final boolean mo70348c(View view) {
        return view != null && this.f42164y.contains(view);
    }

    /* renamed from: f */
    public final void mo70349f() {
        this.f42140a.removeCallbacks(this.f42162w);
        this.f42140a.removeCallbacks(this.f42159t);
        this.f42140a.removeCallbacks(this.f42161v);
        this.f42140a.removeCallbacks(this.f42160u);
    }

    /* renamed from: g */
    public final void mo70350g() {
        if (this.f42165z != 3) {
            mo70349f();
            int showTimeoutMs = this.f42140a.getShowTimeoutMs();
            if (showTimeoutMs <= 0) {
                return;
            }
            if (!this.f42139C) {
                C2397b bVar = this.f42162w;
                long j = (long) showTimeoutMs;
                if (j >= 0) {
                    this.f42140a.postDelayed(bVar, j);
                }
            } else if (this.f42165z == 1) {
                this.f42140a.postDelayed(this.f42160u, NetworkRetryInterceptor.DEFAULT_RETRY_DELAY);
            } else {
                C3254t tVar = this.f42161v;
                long j2 = (long) showTimeoutMs;
                if (j2 >= 0) {
                    this.f42140a.postDelayed(tVar, j2);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo70351h(View view, boolean z) {
        if (view != null) {
            if (!z) {
                view.setVisibility(8);
                this.f42164y.remove(view);
                return;
            }
            if (!this.f42137A || !m32014j(view)) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
            this.f42164y.add(view);
        }
    }

    /* renamed from: i */
    public final void mo70352i(int i) {
        int i2 = this.f42165z;
        this.f42165z = i;
        if (i == 2) {
            this.f42140a.setVisibility(8);
        } else if (i2 == 2) {
            this.f42140a.setVisibility(0);
        }
        if (i2 != i) {
            this.f42140a.notifyOnVisibilityChange();
        }
    }

    /* renamed from: k */
    public final void mo70353k() {
        if (!this.f42139C) {
            mo70352i(0);
            mo70350g();
            return;
        }
        int i = this.f42165z;
        if (i == 1) {
            this.f42154o.start();
        } else if (i == 2) {
            this.f42155p.start();
        } else if (i == 3) {
            this.f42138B = true;
        } else if (i == 4) {
            return;
        }
        mo70350g();
    }
}
