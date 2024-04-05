package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.core.view.C2330s0;
import androidx.core.view.C2332t0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import p628nj.C18263b;

/* renamed from: androidx.appcompat.widget.a */
public abstract class C0296a extends ViewGroup {
    private static final int FADE_DURATION = 200;
    public ActionMenuPresenter mActionMenuPresenter;
    public int mContentHeight;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    public ActionMenuView mMenuView;
    public final Context mPopupContext;
    public final C0298b mVisAnimListener;
    public C2330s0 mVisibilityAnim;

    /* renamed from: androidx.appcompat.widget.a$a */
    public class C0297a implements Runnable {
        public C0297a() {
        }

        public final void run() {
            C0296a.this.showOverflowMenu();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    public class C0298b implements C2332t0 {

        /* renamed from: b */
        public boolean f744b = false;

        /* renamed from: c */
        public int f745c;

        public C0298b() {
        }

        /* renamed from: b */
        public final void mo1391b() {
            C0296a.super.setVisibility(0);
            this.f744b = false;
        }

        /* renamed from: c */
        public final void mo3011c(View view) {
            this.f744b = true;
        }

        public final void onAnimationEnd() {
            if (!this.f744b) {
                C0296a aVar = C0296a.this;
                aVar.mVisibilityAnim = null;
                C0296a.super.setVisibility(this.f745c);
            }
        }
    }

    public C0296a(Context context) {
        this(context, (AttributeSet) null);
    }

    public static int next(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public void animateToVisibility(int i) {
        setupAnimatorToVisibility(i, 200).mo8922e();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo2152b();
            ActionMenuPresenter.C0231a aVar = actionMenuPresenter.f662v;
            if (aVar != null && aVar.mo2028b()) {
                aVar.f621j.dismiss();
            }
        }
    }

    public int getAnimatedVisibility() {
        return this.mVisibilityAnim != null ? this.mVisAnimListener.f745c : getVisibility();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo2152b();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.f663w != null || actionMenuPresenter.mo2153c();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo2153c();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.f654n;
    }

    public int measureChildView(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C18263b.f40067g, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f565c.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            actionMenuPresenter.f658r = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuBuilder menuBuilder = actionMenuPresenter.f566d;
            if (menuBuilder != null) {
                menuBuilder.onItemsChanged(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public int positionChild(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public void postShowOverflowMenu() {
        post(new C0297a());
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C2330s0 s0Var = this.mVisibilityAnim;
            if (s0Var != null) {
                s0Var.mo8919b();
            }
            super.setVisibility(i);
        }
    }

    public C2330s0 setupAnimatorToVisibility(int i, long j) {
        C2330s0 s0Var = this.mVisibilityAnim;
        if (s0Var != null) {
            s0Var.mo8919b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C2330s0 a = C2364y.m5186a(this);
            a.mo8918a(1.0f);
            a.mo8920c(j);
            C0298b bVar = this.mVisAnimListener;
            C0296a.this.mVisibilityAnim = a;
            bVar.f745c = i;
            a.mo8921d(bVar);
            return a;
        }
        C2330s0 a2 = C2364y.m5186a(this);
        a2.mo8918a(0.0f);
        a2.mo8920c(j);
        C0298b bVar2 = this.mVisAnimListener;
        C0296a.this.mVisibilityAnim = a2;
        bVar2.f745c = i;
        a2.mo8921d(bVar2);
        return a2;
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo2155e();
        }
        return false;
    }

    public C0296a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0296a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVisAnimListener = new C0298b();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.mPopupContext = context;
        } else {
            this.mPopupContext = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
