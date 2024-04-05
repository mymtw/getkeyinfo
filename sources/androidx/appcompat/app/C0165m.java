package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.C0347s0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.app.m */
public final class C0165m extends ActionBar {

    /* renamed from: a */
    public final C0347s0 f399a;

    /* renamed from: b */
    public final Window.Callback f400b;

    /* renamed from: c */
    public final C0170e f401c;

    /* renamed from: d */
    public boolean f402d;

    /* renamed from: e */
    public boolean f403e;

    /* renamed from: f */
    public boolean f404f;

    /* renamed from: g */
    public ArrayList<ActionBar.C0127a> f405g = new ArrayList<>();

    /* renamed from: h */
    public final C0166a f406h = new C0166a();

    /* renamed from: androidx.appcompat.app.m$a */
    public class C0166a implements Runnable {
        public C0166a() {
        }

        public final void run() {
            C0165m mVar = C0165m.this;
            Menu I = mVar.mo1422I();
            MenuBuilder menuBuilder = I instanceof MenuBuilder ? (MenuBuilder) I : null;
            if (menuBuilder != null) {
                menuBuilder.stopDispatchingItemsChanged();
            }
            try {
                I.clear();
                if (!mVar.f400b.onCreatePanelMenu(0, I) || !mVar.f400b.onPreparePanel(0, (View) null, I)) {
                    I.clear();
                }
            } finally {
                if (menuBuilder != null) {
                    menuBuilder.startDispatchingItemsChanged();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$b */
    public class C0167b implements Toolbar.C0294e {
        public C0167b() {
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return C0165m.this.f400b.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.m$c */
    public final class C0168c implements C0218f.C0219a {

        /* renamed from: b */
        public boolean f409b;

        public C0168c() {
        }

        /* renamed from: a */
        public final boolean mo1342a(MenuBuilder menuBuilder) {
            C0165m.this.f400b.onMenuOpened(108, menuBuilder);
            return true;
        }

        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (!this.f409b) {
                this.f409b = true;
                C0165m.this.f399a.mo3139j();
                C0165m.this.f400b.onPanelClosed(108, menuBuilder);
                this.f409b = false;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$d */
    public final class C0169d implements MenuBuilder.C0200a {
        public C0169d() {
        }

        /* renamed from: a */
        public final boolean mo1310a(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        /* renamed from: b */
        public final void mo1311b(MenuBuilder menuBuilder) {
            if (C0165m.this.f399a.isOverflowMenuShowing()) {
                C0165m.this.f400b.onPanelClosed(108, menuBuilder);
            } else if (C0165m.this.f400b.onPreparePanel(0, (View) null, menuBuilder)) {
                C0165m.this.f400b.onMenuOpened(108, menuBuilder);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$e */
    public class C0170e implements AppCompatDelegateImpl.C0139c {
        public C0170e() {
        }
    }

    public C0165m(Toolbar toolbar, CharSequence charSequence, AppCompatDelegateImpl.C0143f fVar) {
        C0167b bVar = new C0167b();
        toolbar.getClass();
        C0347s0 s0Var = new C0347s0(toolbar, false);
        this.f399a = s0Var;
        fVar.getClass();
        this.f400b = fVar;
        s0Var.f913l = fVar;
        toolbar.setOnMenuItemClickListener(bVar);
        s0Var.setWindowTitle(charSequence);
        this.f401c = new C0170e();
    }

    /* renamed from: A */
    public final void mo1164A(boolean z) {
    }

    /* renamed from: B */
    public final void mo1165B() {
        this.f399a.setIcon((int) R.drawable.ic_menu_e);
    }

    /* renamed from: C */
    public final void mo1166C(boolean z) {
    }

    /* renamed from: D */
    public final void mo1167D(CharSequence charSequence) {
        this.f399a.mo3128d(charSequence);
    }

    /* renamed from: E */
    public final void mo1168E(CharSequence charSequence) {
        this.f399a.setTitle(charSequence);
    }

    /* renamed from: F */
    public final void mo1169F(CharSequence charSequence) {
        this.f399a.setWindowTitle(charSequence);
    }

    /* renamed from: G */
    public final void mo1170G() {
        this.f399a.mo3146q(0);
    }

    /* renamed from: I */
    public final Menu mo1422I() {
        if (!this.f403e) {
            C0347s0 s0Var = this.f399a;
            s0Var.f902a.setMenuCallbacks(new C0168c(), new C0169d());
            this.f403e = true;
        }
        return this.f399a.f902a.getMenu();
    }

    /* renamed from: J */
    public final void mo1423J(int i, int i2) {
        C0347s0 s0Var = this.f399a;
        s0Var.mo3124b((i & i2) | ((~i2) & s0Var.f903b));
    }

    /* renamed from: a */
    public final boolean mo1172a() {
        return this.f399a.hideOverflowMenu();
    }

    /* renamed from: b */
    public final boolean mo1173b() {
        if (!this.f399a.mo3123a()) {
            return false;
        }
        this.f399a.collapseActionView();
        return true;
    }

    /* renamed from: c */
    public final void mo1174c(boolean z) {
        if (z != this.f404f) {
            this.f404f = z;
            int size = this.f405g.size();
            for (int i = 0; i < size; i++) {
                this.f405g.get(i).mo1198a();
            }
        }
    }

    /* renamed from: d */
    public final View mo1175d() {
        return this.f399a.f905d;
    }

    /* renamed from: e */
    public final int mo1176e() {
        return this.f399a.f903b;
    }

    /* renamed from: f */
    public final int mo1177f() {
        return 0;
    }

    /* renamed from: g */
    public final Context mo1178g() {
        return this.f399a.getContext();
    }

    /* renamed from: h */
    public final void mo1179h() {
        this.f399a.mo3146q(8);
    }

    /* renamed from: i */
    public final boolean mo1180i() {
        this.f399a.f902a.removeCallbacks(this.f406h);
        Toolbar toolbar = this.f399a.f902a;
        C0166a aVar = this.f406h;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5223m(toolbar, aVar);
        return true;
    }

    /* renamed from: j */
    public final void mo1181j() {
    }

    /* renamed from: k */
    public final void mo1182k() {
        this.f399a.f902a.removeCallbacks(this.f406h);
    }

    /* renamed from: l */
    public final boolean mo1183l(int i, KeyEvent keyEvent) {
        Menu I = mo1422I();
        if (I == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        I.setQwertyMode(z);
        return I.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: m */
    public final boolean mo1184m(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo1185n();
        }
        return true;
    }

    /* renamed from: n */
    public final boolean mo1185n() {
        return this.f399a.showOverflowMenu();
    }

    /* renamed from: o */
    public final void mo1186o(ColorDrawable colorDrawable) {
        Toolbar toolbar = this.f399a.f902a;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5227q(toolbar, colorDrawable);
    }

    /* renamed from: p */
    public final void mo1187p(View view) {
        mo1188q(view, new ActionBar.LayoutParams(-2, -2));
    }

    /* renamed from: q */
    public final void mo1188q(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.f399a.mo3158u(view);
    }

    /* renamed from: r */
    public final void mo1189r(boolean z) {
    }

    /* renamed from: s */
    public final void mo1190s(boolean z) {
        mo1423J(z ? 4 : 0, 4);
    }

    /* renamed from: t */
    public final void mo1191t(boolean z) {
        mo1423J(z ? 16 : 0, 16);
    }

    /* renamed from: u */
    public final void mo1192u(boolean z) {
        mo1423J(z ? 2 : 0, 2);
    }

    /* renamed from: v */
    public final void mo1193v(boolean z) {
        mo1423J(z ? 8 : 0, 8);
    }

    /* renamed from: w */
    public final void mo1194w() {
        mo1423J(0, 1);
    }

    /* renamed from: x */
    public final void mo1195x(CharSequence charSequence) {
        this.f399a.mo3125c(charSequence);
    }

    /* renamed from: y */
    public final void mo1196y(int i) {
        this.f399a.mo3145p(i);
    }

    /* renamed from: z */
    public final void mo1197z(Drawable drawable) {
        this.f399a.mo3160w(drawable);
    }
}
