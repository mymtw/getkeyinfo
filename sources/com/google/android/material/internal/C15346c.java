package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.C3137d0;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p088e1.C6689b;

/* renamed from: com.google.android.material.internal.c */
public final class C15346c implements C0218f {

    /* renamed from: A */
    public final C15347a f34465A = new C15347a();

    /* renamed from: b */
    public NavigationMenuView f34466b;

    /* renamed from: c */
    public LinearLayout f34467c;

    /* renamed from: d */
    public MenuBuilder f34468d;

    /* renamed from: e */
    public int f34469e;

    /* renamed from: f */
    public C15349c f34470f;

    /* renamed from: g */
    public LayoutInflater f34471g;

    /* renamed from: h */
    public int f34472h = 0;

    /* renamed from: i */
    public ColorStateList f34473i;

    /* renamed from: j */
    public int f34474j = 0;

    /* renamed from: k */
    public ColorStateList f34475k;

    /* renamed from: l */
    public ColorStateList f34476l;

    /* renamed from: m */
    public Drawable f34477m;

    /* renamed from: n */
    public int f34478n;

    /* renamed from: o */
    public int f34479o;

    /* renamed from: p */
    public int f34480p;

    /* renamed from: q */
    public int f34481q;

    /* renamed from: r */
    public int f34482r;

    /* renamed from: s */
    public int f34483s;

    /* renamed from: t */
    public int f34484t;

    /* renamed from: u */
    public boolean f34485u;

    /* renamed from: v */
    public boolean f34486v = true;

    /* renamed from: w */
    public int f34487w;

    /* renamed from: x */
    public int f34488x;

    /* renamed from: y */
    public int f34489y;

    /* renamed from: z */
    public int f34490z = -1;

    /* renamed from: com.google.android.material.internal.c$a */
    public class C15347a implements View.OnClickListener {
        public C15347a() {
        }

        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            C15349c cVar = C15346c.this.f34470f;
            boolean z = true;
            if (cVar != null) {
                cVar.f34494d = true;
            }
            MenuItemImpl itemData = navigationMenuItemView.getItemData();
            C15346c cVar2 = C15346c.this;
            boolean performItemAction = cVar2.f34468d.performItemAction(itemData, cVar2, 0);
            if (itemData == null || !itemData.isCheckable() || !performItemAction) {
                z = false;
            } else {
                C15346c.this.f34470f.mo54195k(itemData);
            }
            C15346c cVar3 = C15346c.this;
            C15349c cVar4 = cVar3.f34470f;
            if (cVar4 != null) {
                cVar4.f34494d = false;
            }
            if (z) {
                cVar3.updateMenuView(false);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.c$b */
    public static class C15348b extends C15358l {
        public C15348b(LinearLayout linearLayout) {
            super(linearLayout);
        }
    }

    /* renamed from: com.google.android.material.internal.c$c */
    public class C15349c extends RecyclerView.Adapter<C15358l> {

        /* renamed from: b */
        public final ArrayList<C15351e> f34492b = new ArrayList<>();

        /* renamed from: c */
        public MenuItemImpl f34493c;

        /* renamed from: d */
        public boolean f34494d;

        public C15349c() {
            mo54194j();
        }

        public final int getItemCount() {
            return this.f34492b.size();
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemViewType(int i) {
            C15351e eVar = this.f34492b.get(i);
            if (eVar instanceof C15352f) {
                return 2;
            }
            if (eVar instanceof C15350d) {
                return 3;
            }
            if (eVar instanceof C15353g) {
                return ((C15353g) eVar).f34498a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: j */
        public final void mo54194j() {
            if (!this.f34494d) {
                this.f34494d = true;
                this.f34492b.clear();
                this.f34492b.add(new C15350d());
                int i = -1;
                int size = C15346c.this.f34468d.getVisibleItems().size();
                boolean z = false;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (i2 < size) {
                    MenuItemImpl menuItemImpl = C15346c.this.f34468d.getVisibleItems().get(i2);
                    if (menuItemImpl.isChecked()) {
                        mo54195k(menuItemImpl);
                    }
                    if (menuItemImpl.isCheckable()) {
                        menuItemImpl.setExclusiveCheckable(z);
                    }
                    if (menuItemImpl.hasSubMenu()) {
                        SubMenu subMenu = menuItemImpl.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i2 != 0) {
                                this.f34492b.add(new C15352f(C15346c.this.f34489y, z ? 1 : 0));
                            }
                            this.f34492b.add(new C15353g(menuItemImpl));
                            int size2 = subMenu.size();
                            int i4 = z;
                            int i5 = i4;
                            while (i4 < size2) {
                                MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i4);
                                if (menuItemImpl2.isVisible()) {
                                    if (i5 == 0 && menuItemImpl2.getIcon() != null) {
                                        i5 = 1;
                                    }
                                    if (menuItemImpl2.isCheckable()) {
                                        menuItemImpl2.setExclusiveCheckable(z);
                                    }
                                    if (menuItemImpl.isChecked()) {
                                        mo54195k(menuItemImpl);
                                    }
                                    this.f34492b.add(new C15353g(menuItemImpl2));
                                }
                                i4++;
                                z = false;
                            }
                            if (i5 != 0) {
                                int size3 = this.f34492b.size();
                                for (int size4 = this.f34492b.size(); size4 < size3; size4++) {
                                    ((C15353g) this.f34492b.get(size4)).f34499b = true;
                                }
                            }
                        }
                    } else {
                        int groupId = menuItemImpl.getGroupId();
                        if (groupId != i) {
                            i3 = this.f34492b.size();
                            z2 = menuItemImpl.getIcon() != null;
                            if (i2 != 0) {
                                i3++;
                                ArrayList<C15351e> arrayList = this.f34492b;
                                int i6 = C15346c.this.f34489y;
                                arrayList.add(new C15352f(i6, i6));
                            }
                        } else if (!z2 && menuItemImpl.getIcon() != null) {
                            int size5 = this.f34492b.size();
                            for (int i7 = i3; i7 < size5; i7++) {
                                ((C15353g) this.f34492b.get(i7)).f34499b = true;
                            }
                            z2 = true;
                        }
                        C15353g gVar = new C15353g(menuItemImpl);
                        gVar.f34499b = z2;
                        this.f34492b.add(gVar);
                        i = groupId;
                    }
                    i2++;
                    z = false;
                }
                this.f34494d = z;
            }
        }

        /* renamed from: k */
        public final void mo54195k(MenuItemImpl menuItemImpl) {
            if (this.f34493c != menuItemImpl && menuItemImpl.isCheckable()) {
                MenuItemImpl menuItemImpl2 = this.f34493c;
                if (menuItemImpl2 != null) {
                    menuItemImpl2.setChecked(false);
                }
                this.f34493c = menuItemImpl;
                menuItemImpl.setChecked(true);
            }
        }

        public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            C15358l lVar = (C15358l) b0Var;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                navigationMenuItemView.setIconTintList(C15346c.this.f34476l);
                int i2 = C15346c.this.f34474j;
                if (i2 != 0) {
                    navigationMenuItemView.setTextAppearance(i2);
                }
                ColorStateList colorStateList = C15346c.this.f34475k;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = C15346c.this.f34477m;
                Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2368d.m5227q(navigationMenuItemView, newDrawable);
                C15353g gVar = (C15353g) this.f34492b.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f34499b);
                C15346c cVar = C15346c.this;
                int i3 = cVar.f34478n;
                int i4 = cVar.f34479o;
                navigationMenuItemView.setPadding(i3, i4, i3, i4);
                navigationMenuItemView.setIconPadding(C15346c.this.f34480p);
                C15346c cVar2 = C15346c.this;
                if (cVar2.f34485u) {
                    navigationMenuItemView.setIconSize(cVar2.f34481q);
                }
                navigationMenuItemView.setMaxLines(C15346c.this.f34487w);
                navigationMenuItemView.initialize(gVar.f34498a, 0);
            } else if (itemViewType == 1) {
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((C15353g) this.f34492b.get(i)).f34498a.getTitle());
                int i5 = C15346c.this.f34472h;
                if (i5 != 0) {
                    textView.setTextAppearance(i5);
                }
                int i6 = C15346c.this.f34484t;
                int paddingTop = textView.getPaddingTop();
                C15346c.this.getClass();
                textView.setPadding(i6, paddingTop, 0, textView.getPaddingBottom());
                ColorStateList colorStateList2 = C15346c.this.f34473i;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
            } else if (itemViewType == 2) {
                C15352f fVar = (C15352f) this.f34492b.get(i);
                View view = lVar.itemView;
                C15346c cVar3 = C15346c.this;
                view.setPadding(cVar3.f34482r, fVar.f34496a, cVar3.f34483s, fVar.f34497b);
            }
        }

        public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C3084b0 b0Var;
            if (i == 0) {
                C15346c cVar = C15346c.this;
                b0Var = new C15355i(cVar.f34471g, viewGroup, cVar.f34465A);
            } else if (i == 1) {
                b0Var = new C15357k(C15346c.this.f34471g, viewGroup);
            } else if (i == 2) {
                b0Var = new C15356j(C15346c.this.f34471g, viewGroup);
            } else if (i != 3) {
                return null;
            } else {
                return new C15348b(C15346c.this.f34467c);
            }
            return b0Var;
        }

        public final void onViewRecycled(RecyclerView.C3084b0 b0Var) {
            C15358l lVar = (C15358l) b0Var;
            if (lVar instanceof C15355i) {
                ((NavigationMenuItemView) lVar.itemView).recycle();
            }
        }
    }

    /* renamed from: com.google.android.material.internal.c$d */
    public static class C15350d implements C15351e {
    }

    /* renamed from: com.google.android.material.internal.c$e */
    public interface C15351e {
    }

    /* renamed from: com.google.android.material.internal.c$f */
    public static class C15352f implements C15351e {

        /* renamed from: a */
        public final int f34496a;

        /* renamed from: b */
        public final int f34497b;

        public C15352f(int i, int i2) {
            this.f34496a = i;
            this.f34497b = i2;
        }
    }

    /* renamed from: com.google.android.material.internal.c$g */
    public static class C15353g implements C15351e {

        /* renamed from: a */
        public final MenuItemImpl f34498a;

        /* renamed from: b */
        public boolean f34499b;

        public C15353g(MenuItemImpl menuItemImpl) {
            this.f34498a = menuItemImpl;
        }
    }

    /* renamed from: com.google.android.material.internal.c$h */
    public class C15354h extends C3137d0 {
        public C15354h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            int i;
            int i2;
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            C15349c cVar = C15346c.this.f34470f;
            if (C15346c.this.f34467c.getChildCount() == 0) {
                i2 = 0;
                i = 0;
            } else {
                i2 = 1;
                i = 0;
            }
            while (i < C15346c.this.f34470f.getItemCount()) {
                if (C15346c.this.f34470f.getItemViewType(i) == 0) {
                    i2++;
                }
                i++;
            }
            bVar.f14759a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i2, 0, false));
        }
    }

    /* renamed from: com.google.android.material.internal.c$i */
    public static class C15355i extends C15358l {
        public C15355i(LayoutInflater layoutInflater, ViewGroup viewGroup, C15347a aVar) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(aVar);
        }
    }

    /* renamed from: com.google.android.material.internal.c$j */
    public static class C15356j extends C15358l {
        public C15356j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.c$k */
    public static class C15357k extends C15358l {
        public C15357k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.c$l */
    public static abstract class C15358l extends RecyclerView.C3084b0 {
        public C15358l(View view) {
            super(view);
        }
    }

    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final int getId() {
        return this.f34469e;
    }

    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f34471g = LayoutInflater.from(context);
        this.f34468d = menuBuilder;
        this.f34489y = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItemImpl menuItemImpl;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        MenuItemImpl menuItemImpl2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.f34466b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C15349c cVar = this.f34470f;
                cVar.getClass();
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    cVar.f34494d = true;
                    int size = cVar.f34492b.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        C15351e eVar = cVar.f34492b.get(i2);
                        if ((eVar instanceof C15353g) && (menuItemImpl2 = ((C15353g) eVar).f34498a) != null && menuItemImpl2.getItemId() == i) {
                            cVar.mo54195k(menuItemImpl2);
                            break;
                        }
                        i2++;
                    }
                    cVar.f34494d = false;
                    cVar.mo54194j();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = cVar.f34492b.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C15351e eVar2 = cVar.f34492b.get(i3);
                        if (!(!(eVar2 instanceof C15353g) || (menuItemImpl = ((C15353g) eVar2).f34498a) == null || (actionView = menuItemImpl.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(menuItemImpl.getItemId())) == null)) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f34467c.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f34466b != null) {
            SparseArray sparseArray = new SparseArray();
            this.f34466b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        C15349c cVar = this.f34470f;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            MenuItemImpl menuItemImpl = cVar.f34493c;
            if (menuItemImpl != null) {
                bundle2.putInt("android:menu:checked", menuItemImpl.getItemId());
            }
            SparseArray sparseArray2 = new SparseArray();
            int size = cVar.f34492b.size();
            for (int i = 0; i < size; i++) {
                C15351e eVar = cVar.f34492b.get(i);
                if (eVar instanceof C15353g) {
                    MenuItemImpl menuItemImpl2 = ((C15353g) eVar).f34498a;
                    View actionView = menuItemImpl2 != null ? menuItemImpl2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(menuItemImpl2.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f34467c != null) {
            SparseArray sparseArray3 = new SparseArray();
            this.f34467c.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public final void updateMenuView(boolean z) {
        C15349c cVar = this.f34470f;
        if (cVar != null) {
            cVar.mo54194j();
            cVar.notifyDataSetChanged();
        }
    }
}
