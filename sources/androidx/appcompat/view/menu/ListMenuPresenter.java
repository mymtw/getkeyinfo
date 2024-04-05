package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.view.menu.C0220g;
import com.etsy.android.R;
import java.util.ArrayList;

public class ListMenuPresenter implements C0218f, AdapterView.OnItemClickListener {
    private static final String TAG = "ListMenuPresenter";
    public static final String VIEWS_TAG = "android:menu:list";
    public C0199a mAdapter;
    private C0218f.C0219a mCallback;
    public Context mContext;
    private int mId;
    public LayoutInflater mInflater;
    public int mItemIndexOffset;
    public int mItemLayoutRes;
    public MenuBuilder mMenu;
    public ExpandedMenuView mMenuView;
    public int mThemeRes;

    /* renamed from: androidx.appcompat.view.menu.ListMenuPresenter$a */
    public class C0199a extends BaseAdapter {

        /* renamed from: b */
        public int f553b = -1;

        public C0199a() {
            mo1748a();
        }

        /* renamed from: a */
        public final void mo1748a() {
            MenuItemImpl expandedItem = ListMenuPresenter.this.mMenu.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<MenuItemImpl> nonActionItems = ListMenuPresenter.this.mMenu.getNonActionItems();
                int size = nonActionItems.size();
                for (int i = 0; i < size; i++) {
                    if (nonActionItems.get(i) == expandedItem) {
                        this.f553b = i;
                        return;
                    }
                }
            }
            this.f553b = -1;
        }

        /* renamed from: b */
        public final MenuItemImpl getItem(int i) {
            ArrayList<MenuItemImpl> nonActionItems = ListMenuPresenter.this.mMenu.getNonActionItems();
            int i2 = i + ListMenuPresenter.this.mItemIndexOffset;
            int i3 = this.f553b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return nonActionItems.get(i2);
        }

        public final int getCount() {
            int size = ListMenuPresenter.this.mMenu.getNonActionItems().size() - ListMenuPresenter.this.mItemIndexOffset;
            return this.f553b < 0 ? size : size - 1;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
                view = listMenuPresenter.mInflater.inflate(listMenuPresenter.mItemLayoutRes, viewGroup, false);
            }
            ((C0220g.C0221a) view).initialize(getItem(i), 0);
            return view;
        }

        public final void notifyDataSetChanged() {
            mo1748a();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context, int i) {
        this(i, 0);
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public ListAdapter getAdapter() {
        if (this.mAdapter == null) {
            this.mAdapter = new C0199a();
        }
        return this.mAdapter;
    }

    public int getId() {
        return this.mId;
    }

    public int getItemIndexOffset() {
        return this.mItemIndexOffset;
    }

    public C0220g getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (ExpandedMenuView) this.mInflater.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.mAdapter == null) {
                this.mAdapter = new C0199a();
            }
            this.mMenuView.setAdapter(this.mAdapter);
            this.mMenuView.setOnItemClickListener(this);
        }
        return this.mMenuView;
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        if (this.mThemeRes != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.mThemeRes);
            this.mContext = contextThemeWrapper;
            this.mInflater = LayoutInflater.from(contextThemeWrapper);
        } else if (this.mContext != null) {
            this.mContext = context;
            if (this.mInflater == null) {
                this.mInflater = LayoutInflater.from(context);
            }
        }
        this.mMenu = menuBuilder;
        C0199a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        C0218f.C0219a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onCloseMenu(menuBuilder, z);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.mMenu.performItemAction(this.mAdapter.getItem(i), this, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        restoreHierarchyState((Bundle) parcelable);
    }

    public Parcelable onSaveInstanceState() {
        if (this.mMenuView == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        saveHierarchyState(bundle);
        return bundle;
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        C0215d dVar = new C0215d(subMenuBuilder);
        AlertDialog.C0133a aVar = new AlertDialog.C0133a(subMenuBuilder.getContext());
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(aVar.getContext(), (int) R.layout.abc_list_menu_item_layout);
        dVar.f611d = listMenuPresenter;
        listMenuPresenter.setCallback(dVar);
        dVar.f609b.addMenuPresenter(dVar.f611d);
        ListAdapter adapter = dVar.f611d.getAdapter();
        AlertController.C0130b bVar = aVar.f286a;
        bVar.f276r = adapter;
        bVar.f277s = dVar;
        View headerView = subMenuBuilder.getHeaderView();
        if (headerView != null) {
            aVar.f286a.f263e = headerView;
        } else {
            aVar.f286a.f261c = subMenuBuilder.getHeaderIcon();
            aVar.setTitle(subMenuBuilder.getHeaderTitle());
        }
        aVar.f286a.f274p = dVar;
        AlertDialog create = aVar.create();
        dVar.f610c = create;
        create.setOnDismissListener(dVar);
        WindowManager.LayoutParams attributes = dVar.f610c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dVar.f610c.show();
        C0218f.C0219a aVar2 = this.mCallback;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo1342a(subMenuBuilder);
        return true;
    }

    public void restoreHierarchyState(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(VIEWS_TAG);
        if (sparseParcelableArray != null) {
            this.mMenuView.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void saveHierarchyState(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.mMenuView;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(VIEWS_TAG, sparseArray);
    }

    public void setCallback(C0218f.C0219a aVar) {
        this.mCallback = aVar;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setItemIndexOffset(int i) {
        this.mItemIndexOffset = i;
        if (this.mMenuView != null) {
            updateMenuView(false);
        }
    }

    public void updateMenuView(boolean z) {
        C0199a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(int i, int i2) {
        this.mItemLayoutRes = i;
        this.mThemeRes = i2;
    }
}
