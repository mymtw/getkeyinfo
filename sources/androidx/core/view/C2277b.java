package androidx.core.view;

import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;

/* renamed from: androidx.core.view.b */
public abstract class C2277b {

    /* renamed from: a */
    public C2278a f5535a;

    /* renamed from: b */
    public C2279b f5536b;

    /* renamed from: androidx.core.view.b$a */
    public interface C2278a {
    }

    /* renamed from: androidx.core.view.b$b */
    public interface C2279b {
    }

    /* renamed from: a */
    public boolean mo1956a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1960b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo1957c();

    /* renamed from: d */
    public View mo1961d(MenuItem menuItem) {
        return mo1957c();
    }

    /* renamed from: e */
    public boolean mo1958e() {
        return false;
    }

    /* renamed from: f */
    public void mo1959f(SubMenuBuilder subMenuBuilder) {
    }

    /* renamed from: g */
    public boolean mo1962g() {
        return false;
    }

    /* renamed from: h */
    public void mo1963h(MenuItemImpl.C0202a aVar) {
        if (this.f5536b != null) {
            StringBuilder h = C0072d.m201h("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            h.append(getClass().getSimpleName());
            h.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", h.toString());
        }
        this.f5536b = aVar;
    }
}
