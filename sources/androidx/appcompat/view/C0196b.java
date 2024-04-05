package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.C0194a;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.view.b */
public final class C0196b extends C0194a implements MenuBuilder.C0200a {

    /* renamed from: d */
    public Context f546d;

    /* renamed from: e */
    public ActionBarContextView f547e;

    /* renamed from: f */
    public C0194a.C0195a f548f;

    /* renamed from: g */
    public WeakReference<View> f549g;

    /* renamed from: h */
    public boolean f550h;

    /* renamed from: i */
    public MenuBuilder f551i;

    public C0196b(Context context, ActionBarContextView actionBarContextView, C0194a.C0195a aVar) {
        this.f546d = context;
        this.f547e = actionBarContextView;
        this.f548f = aVar;
        MenuBuilder defaultShowAsAction = new MenuBuilder(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f551i = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    /* renamed from: a */
    public final boolean mo1310a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f548f.mo1346c(this, menuItem);
    }

    /* renamed from: b */
    public final void mo1311b(MenuBuilder menuBuilder) {
        mo1438i();
        this.f547e.showOverflowMenu();
    }

    /* renamed from: c */
    public final void mo1432c() {
        if (!this.f550h) {
            this.f550h = true;
            this.f548f.mo1344a(this);
        }
    }

    /* renamed from: d */
    public final View mo1433d() {
        WeakReference<View> weakReference = this.f549g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public final MenuBuilder mo1434e() {
        return this.f551i;
    }

    /* renamed from: f */
    public final MenuInflater mo1435f() {
        return new SupportMenuInflater(this.f547e.getContext());
    }

    /* renamed from: g */
    public final CharSequence mo1436g() {
        return this.f547e.getSubtitle();
    }

    /* renamed from: h */
    public final CharSequence mo1437h() {
        return this.f547e.getTitle();
    }

    /* renamed from: i */
    public final void mo1438i() {
        this.f548f.mo1347d(this, this.f551i);
    }

    /* renamed from: j */
    public final boolean mo1439j() {
        return this.f547e.isTitleOptional();
    }

    /* renamed from: k */
    public final void mo1440k(View view) {
        this.f547e.setCustomView(view);
        this.f549g = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: l */
    public final void mo1441l(int i) {
        mo1442m(this.f546d.getString(i));
    }

    /* renamed from: m */
    public final void mo1442m(CharSequence charSequence) {
        this.f547e.setSubtitle(charSequence);
    }

    /* renamed from: n */
    public final void mo1443n(int i) {
        mo1444o(this.f546d.getString(i));
    }

    /* renamed from: o */
    public final void mo1444o(CharSequence charSequence) {
        this.f547e.setTitle(charSequence);
    }

    /* renamed from: p */
    public final void mo1445p(boolean z) {
        this.f545c = z;
        this.f547e.setTitleOptional(z);
    }
}
