package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.widget.C0299a0;
import androidx.appcompat.widget.MenuPopupWindow;
import com.etsy.android.R;
import p109g.C6825b;

/* renamed from: androidx.appcompat.view.menu.h */
public final class C0222h extends C6825b implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: c */
    public final Context f625c;

    /* renamed from: d */
    public final MenuBuilder f626d;

    /* renamed from: e */
    public final MenuAdapter f627e;

    /* renamed from: f */
    public final boolean f628f;

    /* renamed from: g */
    public final int f629g;

    /* renamed from: h */
    public final int f630h;

    /* renamed from: i */
    public final int f631i;

    /* renamed from: j */
    public final MenuPopupWindow f632j;

    /* renamed from: k */
    public final C0223a f633k = new C0223a();

    /* renamed from: l */
    public final C0224b f634l = new C0224b();

    /* renamed from: m */
    public PopupWindow.OnDismissListener f635m;

    /* renamed from: n */
    public View f636n;

    /* renamed from: o */
    public View f637o;

    /* renamed from: p */
    public C0218f.C0219a f638p;

    /* renamed from: q */
    public ViewTreeObserver f639q;

    /* renamed from: r */
    public boolean f640r;

    /* renamed from: s */
    public boolean f641s;

    /* renamed from: t */
    public int f642t;

    /* renamed from: u */
    public int f643u = 0;

    /* renamed from: v */
    public boolean f644v;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    public class C0223a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0223a() {
        }

        public final void onGlobalLayout() {
            if (C0222h.this.mo2004b()) {
                C0222h hVar = C0222h.this;
                if (!hVar.f632j.f794y) {
                    View view = hVar.f637o;
                    if (view == null || !view.isShown()) {
                        C0222h.this.dismiss();
                    } else {
                        C0222h.this.f632j.mo2003a();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.h$b */
    public class C0224b implements View.OnAttachStateChangeListener {
        public C0224b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0222h.this.f639q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0222h.this.f639q = view.getViewTreeObserver();
                }
                C0222h hVar = C0222h.this;
                hVar.f639q.removeGlobalOnLayoutListener(hVar.f633k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0222h(int i, int i2, Context context, View view, MenuBuilder menuBuilder, boolean z) {
        this.f625c = context;
        this.f626d = menuBuilder;
        this.f628f = z;
        this.f627e = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f630h = i;
        this.f631i = i2;
        Resources resources = context.getResources();
        this.f629g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f636n = view;
        this.f632j = new MenuPopupWindow(context, i, i2);
        menuBuilder.addMenuPresenter(this, context);
    }

    /* renamed from: a */
    public final void mo2003a() {
        View view;
        Rect rect;
        boolean z = true;
        if (!mo2004b()) {
            if (this.f640r || (view = this.f636n) == null) {
                z = false;
            } else {
                this.f637o = view;
                this.f632j.f795z.setOnDismissListener(this);
                MenuPopupWindow menuPopupWindow = this.f632j;
                menuPopupWindow.f786q = this;
                menuPopupWindow.f794y = true;
                menuPopupWindow.f795z.setFocusable(true);
                View view2 = this.f637o;
                boolean z2 = this.f639q == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f639q = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f633k);
                }
                view2.addOnAttachStateChangeListener(this.f634l);
                MenuPopupWindow menuPopupWindow2 = this.f632j;
                menuPopupWindow2.f785p = view2;
                menuPopupWindow2.f782m = this.f643u;
                if (!this.f641s) {
                    this.f642t = C6825b.m13208d(this.f627e, this.f625c, this.f629g);
                    this.f641s = true;
                }
                this.f632j.mo3043r(this.f642t);
                this.f632j.f795z.setInputMethodMode(2);
                MenuPopupWindow menuPopupWindow3 = this.f632j;
                Rect rect2 = this.f15026b;
                if (rect2 != null) {
                    menuPopupWindow3.getClass();
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                menuPopupWindow3.f793x = rect;
                this.f632j.mo2003a();
                C0299a0 a0Var = this.f632j.f773d;
                a0Var.setOnKeyListener(this);
                if (this.f644v && this.f626d.getHeaderTitle() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f625c).inflate(R.layout.abc_popup_menu_header_item_layout, a0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f626d.getHeaderTitle());
                    }
                    frameLayout.setEnabled(false);
                    a0Var.addHeaderView(frameLayout, (Object) null, false);
                }
                this.f632j.mo2479m(this.f627e);
                this.f632j.mo2003a();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public final boolean mo2004b() {
        return !this.f640r && this.f632j.mo2004b();
    }

    /* renamed from: c */
    public final void mo2005c(MenuBuilder menuBuilder) {
    }

    public final void dismiss() {
        if (mo2004b()) {
            this.f632j.dismiss();
        }
    }

    /* renamed from: e */
    public final void mo2007e(View view) {
        this.f636n = view;
    }

    /* renamed from: f */
    public final void mo2008f(boolean z) {
        this.f627e.setForceShowIcon(z);
    }

    public final boolean flagActionItems() {
        return false;
    }

    /* renamed from: g */
    public final void mo2009g(int i) {
        this.f643u = i;
    }

    /* renamed from: h */
    public final void mo2010h(int i) {
        this.f632j.f776g = i;
    }

    /* renamed from: i */
    public final void mo2011i(PopupWindow.OnDismissListener onDismissListener) {
        this.f635m = onDismissListener;
    }

    /* renamed from: j */
    public final void mo2012j(boolean z) {
        this.f644v = z;
    }

    /* renamed from: k */
    public final void mo2013k(int i) {
        this.f632j.mo3040i(i);
    }

    /* renamed from: o */
    public final C0299a0 mo2015o() {
        return this.f632j.f773d;
    }

    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder == this.f626d) {
            dismiss();
            C0218f.C0219a aVar = this.f638p;
            if (aVar != null) {
                aVar.onCloseMenu(menuBuilder, z);
            }
        }
    }

    public final void onDismiss() {
        this.f640r = true;
        this.f626d.close();
        ViewTreeObserver viewTreeObserver = this.f639q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f639q = this.f637o.getViewTreeObserver();
            }
            this.f639q.removeGlobalOnLayoutListener(this.f633k);
            this.f639q = null;
        }
        this.f637o.removeOnAttachStateChangeListener(this.f634l);
        PopupWindow.OnDismissListener onDismissListener = this.f635m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    public final Parcelable onSaveInstanceState() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.e r0 = new androidx.appcompat.view.menu.e
            android.content.Context r5 = r9.f625c
            android.view.View r6 = r9.f637o
            boolean r8 = r9.f628f
            int r3 = r9.f630h
            int r4 = r9.f631i
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.f$a r2 = r9.f638p
            r0.f620i = r2
            g.b r3 = r0.f621j
            if (r3 == 0) goto L_0x0023
            r3.setCallback(r2)
        L_0x0023:
            boolean r2 = p109g.C6825b.m13209l(r10)
            r0.f619h = r2
            g.b r3 = r0.f621j
            if (r3 == 0) goto L_0x0030
            r3.mo2008f(r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f635m
            r0.f622k = r2
            r2 = 0
            r9.f635m = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r9.f626d
            r2.close(r1)
            androidx.appcompat.widget.MenuPopupWindow r2 = r9.f632j
            int r3 = r2.f776g
            int r2 = r2.mo3041l()
            int r4 = r9.f643u
            android.view.View r5 = r9.f636n
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r6 = androidx.core.view.C2364y.f5646a
            int r5 = androidx.core.view.C2364y.C2369e.m5233d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005e
            android.view.View r4 = r9.f636n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005e:
            boolean r4 = r0.mo2028b()
            r5 = 1
            if (r4 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            android.view.View r4 = r0.f617f
            if (r4 != 0) goto L_0x006c
            r0 = r1
            goto L_0x0070
        L_0x006c:
            r0.mo2030d(r3, r2, r5, r5)
        L_0x006f:
            r0 = r5
        L_0x0070:
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.f$a r0 = r9.f638p
            if (r0 == 0) goto L_0x0079
            r0.mo1342a(r10)
        L_0x0079:
            return r5
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0222h.onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder):boolean");
    }

    public final void setCallback(C0218f.C0219a aVar) {
        this.f638p = aVar;
    }

    public final void updateMenuView(boolean z) {
        this.f641s = false;
        MenuAdapter menuAdapter = this.f627e;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }
}
