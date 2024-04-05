package p109g;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0209b;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* renamed from: g.b */
public abstract class C6825b implements C6826c, C0218f, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Rect f15026b;

    /* renamed from: d */
    public static int m13208d(MenuAdapter menuAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = menuAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = menuAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = menuAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: l */
    public static boolean m13209l(MenuBuilder menuBuilder) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public abstract void mo2005c(MenuBuilder menuBuilder);

    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: e */
    public abstract void mo2007e(View view);

    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: f */
    public abstract void mo2008f(boolean z);

    /* renamed from: g */
    public abstract void mo2009g(int i);

    public final int getId() {
        return 0;
    }

    /* renamed from: h */
    public abstract void mo2010h(int i);

    /* renamed from: i */
    public abstract void mo2011i(PopupWindow.OnDismissListener onDismissListener);

    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
    }

    /* renamed from: j */
    public abstract void mo2012j(boolean z);

    /* renamed from: k */
    public abstract void mo2013k(int i);

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (MenuAdapter) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (MenuAdapter) listAdapter).mAdapterMenu.performItemAction((MenuItem) listAdapter.getItem(i), this, (this instanceof C0209b) ^ true ? 0 : 4);
    }
}
