package p110g0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.p015ui.platform.actionmodecallback.MenuItemOption;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p288y.C8345d;
import p753kq.C19846a;

/* renamed from: g0.a */
public final class C6828a {

    /* renamed from: a */
    public final C19846a<C19394m> f15028a;

    /* renamed from: b */
    public C8345d f15029b;

    /* renamed from: c */
    public C19846a<C19394m> f15030c = null;

    /* renamed from: d */
    public C19846a<C19394m> f15031d = null;

    /* renamed from: e */
    public C19846a<C19394m> f15032e = null;

    /* renamed from: f */
    public C19846a<C19394m> f15033f = null;

    public C6828a(C19846a aVar) {
        C8345d dVar = C8345d.f18300e;
        this.f15028a = aVar;
        this.f15029b = dVar;
    }

    /* renamed from: a */
    public static void m13221a(Menu menu, MenuItemOption menuItemOption) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuItemOption, "item");
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    /* renamed from: b */
    public static void m13222b(Menu menu, MenuItemOption menuItemOption, C19846a aVar) {
        if (aVar != null && menu.findItem(menuItemOption.getId()) == null) {
            m13221a(menu, menuItemOption);
        } else if (aVar == null && menu.findItem(menuItemOption.getId()) != null) {
            menu.removeItem(menuItemOption.getId());
        }
    }

    /* renamed from: c */
    public final boolean mo18954c(ActionMode actionMode, MenuItem menuItem) {
        C19383o.m32794d(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            C19846a<C19394m> aVar = this.f15030c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            C19846a<C19394m> aVar2 = this.f15031d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            C19846a<C19394m> aVar3 = this.f15032e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId != MenuItemOption.SelectAll.getId()) {
            return false;
        } else {
            C19846a<C19394m> aVar4 = this.f15033f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    /* renamed from: d */
    public final void mo18955d(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (actionMode != null) {
            if (this.f15030c != null) {
                m13221a(menu, MenuItemOption.Copy);
            }
            if (this.f15031d != null) {
                m13221a(menu, MenuItemOption.Paste);
            }
            if (this.f15032e != null) {
                m13221a(menu, MenuItemOption.Cut);
            }
            if (this.f15033f != null) {
                m13221a(menu, MenuItemOption.SelectAll);
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: e */
    public final boolean mo18956e(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m13222b(menu, MenuItemOption.Copy, this.f15030c);
        m13222b(menu, MenuItemOption.Paste, this.f15031d);
        m13222b(menu, MenuItemOption.Cut, this.f15032e);
        m13222b(menu, MenuItemOption.SelectAll, this.f15033f);
        return true;
    }
}
