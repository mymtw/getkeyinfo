package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import kotlin.jvm.internal.C19382n;
import p075d.C6614a;
import p628nj.C18263b;

/* renamed from: androidx.appcompat.widget.s0 */
public final class C0347s0 implements C0358x {

    /* renamed from: a */
    public Toolbar f902a;

    /* renamed from: b */
    public int f903b;

    /* renamed from: c */
    public ScrollingTabContainerView f904c;

    /* renamed from: d */
    public View f905d;

    /* renamed from: e */
    public Drawable f906e;

    /* renamed from: f */
    public Drawable f907f;

    /* renamed from: g */
    public Drawable f908g;

    /* renamed from: h */
    public boolean f909h;

    /* renamed from: i */
    public CharSequence f910i;

    /* renamed from: j */
    public CharSequence f911j;

    /* renamed from: k */
    public CharSequence f912k;

    /* renamed from: l */
    public Window.Callback f913l;

    /* renamed from: m */
    public boolean f914m;

    /* renamed from: n */
    public ActionMenuPresenter f915n;

    /* renamed from: o */
    public int f916o = 0;

    /* renamed from: p */
    public Drawable f917p;

    /* renamed from: androidx.appcompat.widget.s0$a */
    public class C0348a extends C19382n {

        /* renamed from: r */
        public boolean f918r = false;

        /* renamed from: s */
        public final /* synthetic */ int f919s;

        public C0348a(int i) {
            this.f919s = i;
        }

        /* renamed from: b */
        public final void mo1391b() {
            C0347s0.this.f902a.setVisibility(0);
        }

        /* renamed from: c */
        public final void mo3011c(View view) {
            this.f918r = true;
        }

        public final void onAnimationEnd() {
            if (!this.f918r) {
                C0347s0.this.f902a.setVisibility(this.f919s);
            }
        }
    }

    public C0347s0(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f902a = toolbar;
        this.f910i = toolbar.getTitle();
        this.f911j = toolbar.getSubtitle();
        this.f909h = this.f910i != null;
        this.f908g = toolbar.getNavigationIcon();
        String str = null;
        C0340p0 m = C0340p0.m891m(toolbar.getContext(), (AttributeSet) null, C18263b.f40067g, R.attr.actionBarStyle);
        int i = 15;
        this.f917p = m.mo3101e(15);
        if (z) {
            CharSequence k = m.mo3107k(27);
            if (!TextUtils.isEmpty(k)) {
                setTitle(k);
            }
            CharSequence k2 = m.mo3107k(25);
            if (!TextUtils.isEmpty(k2)) {
                mo3128d(k2);
            }
            Drawable e = m.mo3101e(20);
            if (e != null) {
                this.f907f = e;
                mo3162y();
            }
            Drawable e2 = m.mo3101e(17);
            if (e2 != null) {
                setIcon(e2);
            }
            if (this.f908g == null && (drawable = this.f917p) != null) {
                mo3160w(drawable);
            }
            mo3124b(m.mo3104h(10, 0));
            int i2 = m.mo3105i(9, 0);
            if (i2 != 0) {
                mo3158u(LayoutInflater.from(this.f902a.getContext()).inflate(i2, this.f902a, false));
                mo3124b(this.f903b | 16);
            }
            int layoutDimension = m.f876b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.f902a.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.f902a.setLayoutParams(layoutParams);
            }
            int c = m.mo3099c(7, -1);
            int c2 = m.mo3099c(3, -1);
            if (c >= 0 || c2 >= 0) {
                this.f902a.setContentInsetsRelative(Math.max(c, 0), Math.max(c2, 0));
            }
            int i3 = m.mo3105i(28, 0);
            if (i3 != 0) {
                Toolbar toolbar2 = this.f902a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), i3);
            }
            int i4 = m.mo3105i(26, 0);
            if (i4 != 0) {
                Toolbar toolbar3 = this.f902a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), i4);
            }
            int i5 = m.mo3105i(22, 0);
            if (i5 != 0) {
                this.f902a.setPopupTheme(i5);
            }
        } else {
            if (this.f902a.getNavigationIcon() != null) {
                this.f917p = this.f902a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f903b = i;
        }
        m.mo3109n();
        if (R.string.abc_action_bar_up_description != this.f916o) {
            this.f916o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f902a.getNavigationContentDescription())) {
                int i6 = this.f916o;
                mo3125c(i6 != 0 ? getContext().getString(i6) : str);
            }
        }
        this.f912k = this.f902a.getNavigationContentDescription();
        this.f902a.setNavigationOnClickListener(new C0345r0(this));
    }

    /* renamed from: a */
    public final boolean mo3123a() {
        return this.f902a.hasExpandedActionView();
    }

    /* renamed from: b */
    public final void mo3124b(int i) {
        View view;
        int i2 = this.f903b ^ i;
        this.f903b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    mo3161x();
                }
                if ((this.f903b & 4) != 0) {
                    Toolbar toolbar = this.f902a;
                    Drawable drawable = this.f908g;
                    if (drawable == null) {
                        drawable = this.f917p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    this.f902a.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                mo3162y();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f902a.setTitle(this.f910i);
                    this.f902a.setSubtitle(this.f911j);
                } else {
                    this.f902a.setTitle((CharSequence) null);
                    this.f902a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f905d) != null) {
                if ((i & 16) != 0) {
                    this.f902a.addView(view);
                } else {
                    this.f902a.removeView(view);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo3125c(CharSequence charSequence) {
        this.f912k = charSequence;
        mo3161x();
    }

    public final boolean canShowOverflowMenu() {
        return this.f902a.canShowOverflowMenu();
    }

    public final void collapseActionView() {
        this.f902a.collapseActionView();
    }

    /* renamed from: d */
    public final void mo3128d(CharSequence charSequence) {
        this.f911j = charSequence;
        if ((this.f903b & 8) != 0) {
            this.f902a.setSubtitle(charSequence);
        }
    }

    /* renamed from: e */
    public final void mo3129e() {
    }

    /* renamed from: f */
    public final C2330s0 mo3130f(int i, long j) {
        C2330s0 a = C2364y.m5186a(this.f902a);
        a.mo8918a(i == 0 ? 1.0f : 0.0f);
        a.mo8920c(j);
        a.mo8921d(new C0348a(i));
        return a;
    }

    /* renamed from: g */
    public final boolean mo3131g() {
        return this.f906e != null;
    }

    public final Context getContext() {
        return this.f902a.getContext();
    }

    public final CharSequence getTitle() {
        return this.f902a.getTitle();
    }

    /* renamed from: h */
    public final void mo3134h() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final boolean hideOverflowMenu() {
        return this.f902a.hideOverflowMenu();
    }

    /* renamed from: i */
    public final void mo3136i(boolean z) {
        this.f902a.setCollapsible(z);
    }

    public final boolean isOverflowMenuShowPending() {
        return this.f902a.isOverflowMenuShowPending();
    }

    public final boolean isOverflowMenuShowing() {
        return this.f902a.isOverflowMenuShowing();
    }

    /* renamed from: j */
    public final void mo3139j() {
        this.f902a.dismissPopupMenus();
    }

    /* renamed from: k */
    public final View mo3140k() {
        return this.f905d;
    }

    /* renamed from: l */
    public final void mo3141l() {
    }

    /* renamed from: m */
    public final void mo3142m() {
        Toolbar toolbar;
        ScrollingTabContainerView scrollingTabContainerView = this.f904c;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getParent() == (toolbar = this.f902a)) {
            toolbar.removeView(this.f904c);
        }
        this.f904c = null;
    }

    /* renamed from: n */
    public final void mo3143n(SparseArray<Parcelable> sparseArray) {
        this.f902a.saveHierarchyState(sparseArray);
    }

    /* renamed from: o */
    public final void mo3144o(int i) {
        this.f907f = i != 0 ? C6614a.m12981a(getContext(), i) : null;
        mo3162y();
    }

    /* renamed from: p */
    public final void mo3145p(int i) {
        mo3160w(i != 0 ? C6614a.m12981a(getContext(), i) : null);
    }

    /* renamed from: q */
    public final void mo3146q(int i) {
        this.f902a.setVisibility(i);
    }

    /* renamed from: r */
    public final void mo3147r(SparseArray<Parcelable> sparseArray) {
        this.f902a.restoreHierarchyState(sparseArray);
    }

    /* renamed from: s */
    public final boolean mo3148s() {
        return this.f907f != null;
    }

    public final void setIcon(int i) {
        setIcon(i != 0 ? C6614a.m12981a(getContext(), i) : null);
    }

    public final void setMenu(Menu menu, C0218f.C0219a aVar) {
        if (this.f915n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f902a.getContext());
            this.f915n = actionMenuPresenter;
            actionMenuPresenter.f572j = R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.f915n;
        actionMenuPresenter2.f568f = aVar;
        this.f902a.setMenu((MenuBuilder) menu, actionMenuPresenter2);
    }

    public final void setMenuPrepared() {
        this.f914m = true;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f909h = true;
        this.f910i = charSequence;
        if ((this.f903b & 8) != 0) {
            this.f902a.setTitle(charSequence);
            if (this.f909h) {
                C2364y.m5202q(this.f902a.getRootView(), charSequence);
            }
        }
    }

    public final void setWindowCallback(Window.Callback callback) {
        this.f913l = callback;
    }

    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f909h) {
            this.f910i = charSequence;
            if ((this.f903b & 8) != 0) {
                this.f902a.setTitle(charSequence);
                if (this.f909h) {
                    C2364y.m5202q(this.f902a.getRootView(), charSequence);
                }
            }
        }
    }

    public final boolean showOverflowMenu() {
        return this.f902a.showOverflowMenu();
    }

    /* renamed from: t */
    public final int mo3157t() {
        return this.f903b;
    }

    /* renamed from: u */
    public final void mo3158u(View view) {
        View view2 = this.f905d;
        if (!(view2 == null || (this.f903b & 16) == 0)) {
            this.f902a.removeView(view2);
        }
        this.f905d = view;
        if (view != null && (this.f903b & 16) != 0) {
            this.f902a.addView(view);
        }
    }

    /* renamed from: v */
    public final void mo3159v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: w */
    public final void mo3160w(Drawable drawable) {
        this.f908g = drawable;
        if ((this.f903b & 4) != 0) {
            Toolbar toolbar = this.f902a;
            if (drawable == null) {
                drawable = this.f917p;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f902a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: x */
    public final void mo3161x() {
        if ((this.f903b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f912k)) {
            this.f902a.setNavigationContentDescription(this.f916o);
        } else {
            this.f902a.setNavigationContentDescription(this.f912k);
        }
    }

    /* renamed from: y */
    public final void mo3162y() {
        Drawable drawable;
        int i = this.f903b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f907f;
            if (drawable == null) {
                drawable = this.f906e;
            }
        } else {
            drawable = this.f906e;
        }
        this.f902a.setLogo(drawable);
    }

    public final void setIcon(Drawable drawable) {
        this.f906e = drawable;
        mo3162y();
    }
}
