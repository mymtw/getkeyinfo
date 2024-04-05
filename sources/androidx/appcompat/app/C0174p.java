package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.C0194a;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0358x;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C2328r0;
import androidx.core.view.C2330s0;
import androidx.core.view.C2334u0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19382n;
import p097f.C6761b;
import p628nj.C18263b;

/* renamed from: androidx.appcompat.app.p */
public final class C0174p extends ActionBar implements ActionBarOverlayLayout.C0229d {

    /* renamed from: A */
    public static final AccelerateInterpolator f423A = new AccelerateInterpolator();

    /* renamed from: B */
    public static final DecelerateInterpolator f424B = new DecelerateInterpolator();

    /* renamed from: a */
    public Context f425a;

    /* renamed from: b */
    public Context f426b;

    /* renamed from: c */
    public ActionBarOverlayLayout f427c;

    /* renamed from: d */
    public ActionBarContainer f428d;

    /* renamed from: e */
    public C0358x f429e;

    /* renamed from: f */
    public ActionBarContextView f430f;

    /* renamed from: g */
    public View f431g;

    /* renamed from: h */
    public boolean f432h;

    /* renamed from: i */
    public C0178d f433i;

    /* renamed from: j */
    public C0178d f434j;

    /* renamed from: k */
    public C0194a.C0195a f435k;

    /* renamed from: l */
    public boolean f436l;

    /* renamed from: m */
    public ArrayList<ActionBar.C0127a> f437m = new ArrayList<>();

    /* renamed from: n */
    public boolean f438n;

    /* renamed from: o */
    public int f439o = 0;

    /* renamed from: p */
    public boolean f440p = true;

    /* renamed from: q */
    public boolean f441q;

    /* renamed from: r */
    public boolean f442r;

    /* renamed from: s */
    public boolean f443s;

    /* renamed from: t */
    public boolean f444t = true;

    /* renamed from: u */
    public C6761b f445u;

    /* renamed from: v */
    public boolean f446v;

    /* renamed from: w */
    public boolean f447w;

    /* renamed from: x */
    public final C0175a f448x = new C0175a();

    /* renamed from: y */
    public final C0176b f449y = new C0176b();

    /* renamed from: z */
    public final C0177c f450z = new C0177c();

    /* renamed from: androidx.appcompat.app.p$a */
    public class C0175a extends C19382n {
        public C0175a() {
        }

        public final void onAnimationEnd() {
            View view;
            C0174p pVar = C0174p.this;
            if (pVar.f440p && (view = pVar.f431g) != null) {
                view.setTranslationY(0.0f);
                C0174p.this.f428d.setTranslationY(0.0f);
            }
            C0174p.this.f428d.setVisibility(8);
            C0174p.this.f428d.setTransitioning(false);
            C0174p pVar2 = C0174p.this;
            pVar2.f445u = null;
            C0194a.C0195a aVar = pVar2.f435k;
            if (aVar != null) {
                aVar.mo1344a(pVar2.f434j);
                pVar2.f434j = null;
                pVar2.f435k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = C0174p.this.f427c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2372h.m5253c(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.p$b */
    public class C0176b extends C19382n {
        public C0176b() {
        }

        public final void onAnimationEnd() {
            C0174p pVar = C0174p.this;
            pVar.f445u = null;
            pVar.f428d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.p$c */
    public class C0177c implements C2334u0 {
        public C0177c() {
        }
    }

    /* renamed from: androidx.appcompat.app.p$d */
    public class C0178d extends C0194a implements MenuBuilder.C0200a {

        /* renamed from: d */
        public final Context f454d;

        /* renamed from: e */
        public final MenuBuilder f455e;

        /* renamed from: f */
        public C0194a.C0195a f456f;

        /* renamed from: g */
        public WeakReference<View> f457g;

        public C0178d(Context context, AppCompatDelegateImpl.C0141e eVar) {
            this.f454d = context;
            this.f456f = eVar;
            MenuBuilder defaultShowAsAction = new MenuBuilder(context).setDefaultShowAsAction(1);
            this.f455e = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        /* renamed from: a */
        public final boolean mo1310a(MenuBuilder menuBuilder, MenuItem menuItem) {
            C0194a.C0195a aVar = this.f456f;
            if (aVar != null) {
                return aVar.mo1346c(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public final void mo1311b(MenuBuilder menuBuilder) {
            if (this.f456f != null) {
                mo1438i();
                C0174p.this.f430f.showOverflowMenu();
            }
        }

        /* renamed from: c */
        public final void mo1432c() {
            C0174p pVar = C0174p.this;
            if (pVar.f433i == this) {
                boolean z = pVar.f441q;
                boolean z2 = pVar.f442r;
                boolean z3 = true;
                if (z || z2) {
                    z3 = false;
                }
                if (!z3) {
                    pVar.f434j = this;
                    pVar.f435k = this.f456f;
                } else {
                    this.f456f.mo1344a(this);
                }
                this.f456f = null;
                C0174p.this.mo1427I(false);
                C0174p.this.f430f.closeMode();
                C0174p pVar2 = C0174p.this;
                pVar2.f427c.setHideOnContentScrollEnabled(pVar2.f447w);
                C0174p.this.f433i = null;
            }
        }

        /* renamed from: d */
        public final View mo1433d() {
            WeakReference<View> weakReference = this.f457g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public final MenuBuilder mo1434e() {
            return this.f455e;
        }

        /* renamed from: f */
        public final MenuInflater mo1435f() {
            return new SupportMenuInflater(this.f454d);
        }

        /* renamed from: g */
        public final CharSequence mo1436g() {
            return C0174p.this.f430f.getSubtitle();
        }

        /* renamed from: h */
        public final CharSequence mo1437h() {
            return C0174p.this.f430f.getTitle();
        }

        /* renamed from: i */
        public final void mo1438i() {
            if (C0174p.this.f433i == this) {
                this.f455e.stopDispatchingItemsChanged();
                try {
                    this.f456f.mo1347d(this, this.f455e);
                } finally {
                    this.f455e.startDispatchingItemsChanged();
                }
            }
        }

        /* renamed from: j */
        public final boolean mo1439j() {
            return C0174p.this.f430f.isTitleOptional();
        }

        /* renamed from: k */
        public final void mo1440k(View view) {
            C0174p.this.f430f.setCustomView(view);
            this.f457g = new WeakReference<>(view);
        }

        /* renamed from: l */
        public final void mo1441l(int i) {
            mo1442m(C0174p.this.f425a.getResources().getString(i));
        }

        /* renamed from: m */
        public final void mo1442m(CharSequence charSequence) {
            C0174p.this.f430f.setSubtitle(charSequence);
        }

        /* renamed from: n */
        public final void mo1443n(int i) {
            mo1444o(C0174p.this.f425a.getResources().getString(i));
        }

        /* renamed from: o */
        public final void mo1444o(CharSequence charSequence) {
            C0174p.this.f430f.setTitle(charSequence);
        }

        /* renamed from: p */
        public final void mo1445p(boolean z) {
            this.f545c = z;
            C0174p.this.f430f.setTitleOptional(z);
        }
    }

    public C0174p(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        mo1428J(decorView);
        if (!z) {
            this.f431g = decorView.findViewById(16908290);
        }
    }

    /* renamed from: A */
    public final void mo1164A(boolean z) {
        this.f429e.mo3141l();
    }

    /* renamed from: B */
    public final void mo1165B() {
        this.f429e.setIcon((int) R.drawable.ic_menu_e);
    }

    /* renamed from: C */
    public final void mo1166C(boolean z) {
        C6761b bVar;
        this.f446v = z;
        if (!z && (bVar = this.f445u) != null) {
            bVar.mo18910a();
        }
    }

    /* renamed from: D */
    public final void mo1167D(CharSequence charSequence) {
        this.f429e.mo3128d(charSequence);
    }

    /* renamed from: E */
    public final void mo1168E(CharSequence charSequence) {
        this.f429e.setTitle(charSequence);
    }

    /* renamed from: F */
    public final void mo1169F(CharSequence charSequence) {
        this.f429e.setWindowTitle(charSequence);
    }

    /* renamed from: G */
    public final void mo1170G() {
        if (this.f441q) {
            this.f441q = false;
            mo1431M(false);
        }
    }

    /* renamed from: H */
    public final C0194a mo1171H(AppCompatDelegateImpl.C0141e eVar) {
        C0178d dVar = this.f433i;
        if (dVar != null) {
            dVar.mo1432c();
        }
        this.f427c.setHideOnContentScrollEnabled(false);
        this.f430f.killMode();
        C0178d dVar2 = new C0178d(this.f430f.getContext(), eVar);
        dVar2.f455e.stopDispatchingItemsChanged();
        try {
            if (!dVar2.f456f.mo1345b(dVar2, dVar2.f455e)) {
                return null;
            }
            this.f433i = dVar2;
            dVar2.mo1438i();
            this.f430f.initForMode(dVar2);
            mo1427I(true);
            return dVar2;
        } finally {
            dVar2.f455e.startDispatchingItemsChanged();
        }
    }

    /* renamed from: I */
    public final void mo1427I(boolean z) {
        C2330s0 s0Var;
        C2330s0 s0Var2;
        if (z) {
            if (!this.f443s) {
                this.f443s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f427c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                mo1431M(false);
            }
        } else if (this.f443s) {
            this.f443s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f427c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            mo1431M(false);
        }
        ActionBarContainer actionBarContainer = this.f428d;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2371g.m5246c(actionBarContainer)) {
            if (z) {
                s0Var = this.f429e.mo3130f(4, 100);
                s0Var2 = this.f430f.setupAnimatorToVisibility(0, 200);
            } else {
                s0Var2 = this.f429e.mo3130f(0, 200);
                s0Var = this.f430f.setupAnimatorToVisibility(8, 100);
            }
            C6761b bVar = new C6761b();
            bVar.f14894a.add(s0Var);
            View view = s0Var.f5586a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = s0Var2.f5586a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            bVar.f14894a.add(s0Var2);
            bVar.mo18911b();
        } else if (z) {
            this.f429e.mo3146q(4);
            this.f430f.setVisibility(0);
        } else {
            this.f429e.mo3146q(0);
            this.f430f.setVisibility(8);
        }
    }

    /* renamed from: J */
    public final void mo1428J(View view) {
        C0358x xVar;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f427c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof C0358x) {
            xVar = (C0358x) findViewById;
        } else if (findViewById instanceof Toolbar) {
            xVar = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder h = C0072d.m201h("Can't make a decor toolbar out of ");
            h.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(h.toString());
        }
        this.f429e = xVar;
        this.f430f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f428d = actionBarContainer;
        C0358x xVar2 = this.f429e;
        if (xVar2 == null || this.f430f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0174p.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f425a = xVar2.getContext();
        boolean z = (this.f429e.mo3157t() & 4) != 0;
        if (z) {
            this.f432h = true;
        }
        Context context = this.f425a;
        mo1164A((context.getApplicationInfo().targetSdkVersion < 14) || z);
        mo1430L(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f425a.obtainStyledAttributes((AttributeSet) null, C18263b.f40067g, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            if (this.f427c.isInOverlayMode()) {
                this.f447w = true;
                this.f427c.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f428d;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2373i.m5272s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: K */
    public final void mo1429K(int i, int i2) {
        int t = this.f429e.mo3157t();
        if ((i2 & 4) != 0) {
            this.f432h = true;
        }
        this.f429e.mo3124b((i & i2) | ((~i2) & t));
    }

    /* renamed from: L */
    public final void mo1430L(boolean z) {
        this.f438n = z;
        if (!z) {
            this.f429e.mo3142m();
            this.f428d.setTabContainer((ScrollingTabContainerView) null);
        } else {
            this.f428d.setTabContainer((ScrollingTabContainerView) null);
            this.f429e.mo3142m();
        }
        mo1177f();
        C0358x xVar = this.f429e;
        boolean z2 = this.f438n;
        xVar.mo3136i(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f427c;
        boolean z3 = this.f438n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: M */
    public final void mo1431M(boolean z) {
        View view;
        View view2;
        View view3;
        C2328r0 r0Var = null;
        if (this.f443s || (!this.f441q && !this.f442r)) {
            if (!this.f444t) {
                this.f444t = true;
                C6761b bVar = this.f445u;
                if (bVar != null) {
                    bVar.mo18910a();
                }
                this.f428d.setVisibility(0);
                if (this.f439o != 0 || (!this.f446v && !z)) {
                    this.f428d.setAlpha(1.0f);
                    this.f428d.setTranslationY(0.0f);
                    if (this.f440p && (view2 = this.f431g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f449y.onAnimationEnd();
                } else {
                    this.f428d.setTranslationY(0.0f);
                    float f = (float) (-this.f428d.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.f428d.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f428d.setTranslationY(f);
                    C6761b bVar2 = new C6761b();
                    C2330s0 a = C2364y.m5186a(this.f428d);
                    a.mo8923f(0.0f);
                    C0177c cVar = this.f450z;
                    View view4 = a.f5586a.get();
                    if (view4 != null) {
                        if (cVar != null) {
                            r0Var = new C2328r0(cVar, view4);
                        }
                        view4.animate().setUpdateListener(r0Var);
                    }
                    if (!bVar2.f14898e) {
                        bVar2.f14894a.add(a);
                    }
                    if (this.f440p && (view3 = this.f431g) != null) {
                        view3.setTranslationY(f);
                        C2330s0 a2 = C2364y.m5186a(this.f431g);
                        a2.mo8923f(0.0f);
                        if (!bVar2.f14898e) {
                            bVar2.f14894a.add(a2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f424B;
                    boolean z2 = bVar2.f14898e;
                    if (!z2) {
                        bVar2.f14896c = decelerateInterpolator;
                    }
                    if (!z2) {
                        bVar2.f14895b = 250;
                    }
                    C0176b bVar3 = this.f449y;
                    if (!z2) {
                        bVar2.f14897d = bVar3;
                    }
                    this.f445u = bVar2;
                    bVar2.mo18911b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f427c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2372h.m5253c(actionBarOverlayLayout);
                }
            }
        } else if (this.f444t) {
            this.f444t = false;
            C6761b bVar4 = this.f445u;
            if (bVar4 != null) {
                bVar4.mo18910a();
            }
            if (this.f439o != 0 || (!this.f446v && !z)) {
                this.f448x.onAnimationEnd();
                return;
            }
            this.f428d.setAlpha(1.0f);
            this.f428d.setTransitioning(true);
            C6761b bVar5 = new C6761b();
            float f2 = (float) (-this.f428d.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.f428d.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            C2330s0 a3 = C2364y.m5186a(this.f428d);
            a3.mo8923f(f2);
            C0177c cVar2 = this.f450z;
            View view5 = a3.f5586a.get();
            if (view5 != null) {
                if (cVar2 != null) {
                    r0Var = new C2328r0(cVar2, view5);
                }
                view5.animate().setUpdateListener(r0Var);
            }
            if (!bVar5.f14898e) {
                bVar5.f14894a.add(a3);
            }
            if (this.f440p && (view = this.f431g) != null) {
                C2330s0 a4 = C2364y.m5186a(view);
                a4.mo8923f(f2);
                if (!bVar5.f14898e) {
                    bVar5.f14894a.add(a4);
                }
            }
            AccelerateInterpolator accelerateInterpolator = f423A;
            boolean z3 = bVar5.f14898e;
            if (!z3) {
                bVar5.f14896c = accelerateInterpolator;
            }
            if (!z3) {
                bVar5.f14895b = 250;
            }
            C0175a aVar = this.f448x;
            if (!z3) {
                bVar5.f14897d = aVar;
            }
            this.f445u = bVar5;
            bVar5.mo18911b();
        }
    }

    /* renamed from: b */
    public final boolean mo1173b() {
        C0358x xVar = this.f429e;
        if (xVar == null || !xVar.mo3123a()) {
            return false;
        }
        this.f429e.collapseActionView();
        return true;
    }

    /* renamed from: c */
    public final void mo1174c(boolean z) {
        if (z != this.f436l) {
            this.f436l = z;
            int size = this.f437m.size();
            for (int i = 0; i < size; i++) {
                this.f437m.get(i).mo1198a();
            }
        }
    }

    /* renamed from: d */
    public final View mo1175d() {
        return this.f429e.mo3140k();
    }

    /* renamed from: e */
    public final int mo1176e() {
        return this.f429e.mo3157t();
    }

    /* renamed from: f */
    public final int mo1177f() {
        this.f429e.mo3129e();
        return 0;
    }

    /* renamed from: g */
    public final Context mo1178g() {
        if (this.f426b == null) {
            TypedValue typedValue = new TypedValue();
            this.f425a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f426b = new ContextThemeWrapper(this.f425a, i);
            } else {
                this.f426b = this.f425a;
            }
        }
        return this.f426b;
    }

    /* renamed from: h */
    public final void mo1179h() {
        if (!this.f441q) {
            this.f441q = true;
            mo1431M(false);
        }
    }

    /* renamed from: j */
    public final void mo1181j() {
        mo1430L(this.f425a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    /* renamed from: l */
    public final boolean mo1183l(int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        C0178d dVar = this.f433i;
        if (dVar == null || (menuBuilder = dVar.f455e) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        menuBuilder.setQwertyMode(z);
        return menuBuilder.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: o */
    public final void mo1186o(ColorDrawable colorDrawable) {
        this.f428d.setPrimaryBackground(colorDrawable);
    }

    /* renamed from: p */
    public final void mo1187p(View view) {
        this.f429e.mo3158u(view);
    }

    /* renamed from: q */
    public final void mo1188q(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f429e.mo3158u(view);
    }

    /* renamed from: r */
    public final void mo1189r(boolean z) {
        if (!this.f432h) {
            mo1190s(z);
        }
    }

    /* renamed from: s */
    public final void mo1190s(boolean z) {
        mo1429K(z ? 4 : 0, 4);
    }

    /* renamed from: t */
    public final void mo1191t(boolean z) {
        mo1429K(z ? 16 : 0, 16);
    }

    /* renamed from: u */
    public final void mo1192u(boolean z) {
        mo1429K(z ? 2 : 0, 2);
    }

    /* renamed from: v */
    public final void mo1193v(boolean z) {
        mo1429K(z ? 8 : 0, 8);
    }

    /* renamed from: w */
    public final void mo1194w() {
        mo1429K(0, 1);
    }

    /* renamed from: x */
    public final void mo1195x(CharSequence charSequence) {
        this.f429e.mo3125c(charSequence);
    }

    /* renamed from: y */
    public final void mo1196y(int i) {
        this.f429e.mo3145p(i);
    }

    /* renamed from: z */
    public final void mo1197z(Drawable drawable) {
        this.f429e.mo3160w(drawable);
    }

    public C0174p(Dialog dialog) {
        new ArrayList();
        mo1428J(dialog.getWindow().getDecorView());
    }
}
