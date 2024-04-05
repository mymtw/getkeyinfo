package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.C0194a;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;
import p193o.C7506i;

public class SupportActionModeWrapper extends ActionMode {
    public final Context mContext;
    public final C0194a mWrappedObject;

    /* renamed from: androidx.appcompat.view.SupportActionModeWrapper$a */
    public static class C0191a implements C0194a.C0195a {

        /* renamed from: a */
        public final ActionMode.Callback f506a;

        /* renamed from: b */
        public final Context f507b;

        /* renamed from: c */
        public final ArrayList<SupportActionModeWrapper> f508c = new ArrayList<>();

        /* renamed from: d */
        public final C7506i<Menu, Menu> f509d = new C7506i<>();

        public C0191a(Context context, ActionMode.Callback callback) {
            this.f507b = context;
            this.f506a = callback;
        }

        /* renamed from: a */
        public final void mo1344a(C0194a aVar) {
            this.f506a.onDestroyActionMode(mo1609e(aVar));
        }

        /* renamed from: b */
        public final boolean mo1345b(C0194a aVar, MenuBuilder menuBuilder) {
            ActionMode.Callback callback = this.f506a;
            SupportActionModeWrapper e = mo1609e(aVar);
            Menu orDefault = this.f509d.getOrDefault(menuBuilder, null);
            if (orDefault == null) {
                orDefault = new MenuWrapperICS(this.f507b, menuBuilder);
                this.f509d.put(menuBuilder, orDefault);
            }
            return callback.onCreateActionMode(e, orDefault);
        }

        /* renamed from: c */
        public final boolean mo1346c(C0194a aVar, MenuItem menuItem) {
            return this.f506a.onActionItemClicked(mo1609e(aVar), new MenuItemWrapperICS(this.f507b, (SupportMenuItem) menuItem));
        }

        /* renamed from: d */
        public final boolean mo1347d(C0194a aVar, MenuBuilder menuBuilder) {
            ActionMode.Callback callback = this.f506a;
            SupportActionModeWrapper e = mo1609e(aVar);
            Menu orDefault = this.f509d.getOrDefault(menuBuilder, null);
            if (orDefault == null) {
                orDefault = new MenuWrapperICS(this.f507b, menuBuilder);
                this.f509d.put(menuBuilder, orDefault);
            }
            return callback.onPrepareActionMode(e, orDefault);
        }

        /* renamed from: e */
        public final SupportActionModeWrapper mo1609e(C0194a aVar) {
            int size = this.f508c.size();
            for (int i = 0; i < size; i++) {
                SupportActionModeWrapper supportActionModeWrapper = this.f508c.get(i);
                if (supportActionModeWrapper != null && supportActionModeWrapper.mWrappedObject == aVar) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.f507b, aVar);
            this.f508c.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }
    }

    public SupportActionModeWrapper(Context context, C0194a aVar) {
        this.mContext = context;
        this.mWrappedObject = aVar;
    }

    public void finish() {
        this.mWrappedObject.mo1432c();
    }

    public View getCustomView() {
        return this.mWrappedObject.mo1433d();
    }

    public Menu getMenu() {
        return new MenuWrapperICS(this.mContext, this.mWrappedObject.mo1434e());
    }

    public MenuInflater getMenuInflater() {
        return this.mWrappedObject.mo1435f();
    }

    public CharSequence getSubtitle() {
        return this.mWrappedObject.mo1436g();
    }

    public Object getTag() {
        return this.mWrappedObject.f544b;
    }

    public CharSequence getTitle() {
        return this.mWrappedObject.mo1437h();
    }

    public boolean getTitleOptionalHint() {
        return this.mWrappedObject.f545c;
    }

    public void invalidate() {
        this.mWrappedObject.mo1438i();
    }

    public boolean isTitleOptional() {
        return this.mWrappedObject.mo1439j();
    }

    public void setCustomView(View view) {
        this.mWrappedObject.mo1440k(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mWrappedObject.mo1442m(charSequence);
    }

    public void setTag(Object obj) {
        this.mWrappedObject.f544b = obj;
    }

    public void setTitle(CharSequence charSequence) {
        this.mWrappedObject.mo1444o(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.mWrappedObject.mo1445p(z);
    }

    public void setSubtitle(int i) {
        this.mWrappedObject.mo1441l(i);
    }

    public void setTitle(int i) {
        this.mWrappedObject.mo1443n(i);
    }
}
