package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.C0209b;

/* renamed from: androidx.appcompat.view.menu.c */
public final class C0214c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0209b.C0213d f605b;

    /* renamed from: c */
    public final /* synthetic */ MenuItem f606c;

    /* renamed from: d */
    public final /* synthetic */ MenuBuilder f607d;

    /* renamed from: e */
    public final /* synthetic */ C0209b.C0212c f608e;

    public C0214c(C0209b.C0212c cVar, C0209b.C0213d dVar, MenuItemImpl menuItemImpl, MenuBuilder menuBuilder) {
        this.f608e = cVar;
        this.f605b = dVar;
        this.f606c = menuItemImpl;
        this.f607d = menuBuilder;
    }

    public final void run() {
        C0209b.C0213d dVar = this.f605b;
        if (dVar != null) {
            C0209b.this.f574B = true;
            dVar.f603b.close(false);
            C0209b.this.f574B = false;
        }
        if (this.f606c.isEnabled() && this.f606c.hasSubMenu()) {
            this.f607d.performItemAction(this.f606c, 4);
        }
    }
}
