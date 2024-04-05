package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;

public final class NavigationBarPresenter implements C0218f {

    /* renamed from: b */
    public NavigationBarMenuView f34532b;

    /* renamed from: c */
    public boolean f34533c = false;

    /* renamed from: d */
    public int f34534d;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15381a();

        /* renamed from: b */
        public int f34535b;

        /* renamed from: c */
        public ParcelableSparseArray f34536c;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        public static class C15381a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f34535b);
            parcel.writeParcelable(this.f34536c, 0);
        }

        public SavedState(Parcel parcel) {
            this.f34535b = parcel.readInt();
            this.f34536c = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
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
        return this.f34534d;
    }

    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f34532b.initialize(menuBuilder);
    }

    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f34532b.tryRestoreSelectedItemId(savedState.f34535b);
            Context context = this.f34532b.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f34536c;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            int i = 0;
            while (i < parcelableSparseArray.size()) {
                int keyAt = parcelableSparseArray.keyAt(i);
                BadgeDrawable.SavedState savedState2 = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i);
                if (savedState2 != null) {
                    sparseArray.put(keyAt, BadgeDrawable.createFromSavedState(context, savedState2));
                    i++;
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            this.f34532b.setBadgeDrawables(sparseArray);
        }
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f34535b = this.f34532b.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.f34532b.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < badgeDrawables.size()) {
            int keyAt = badgeDrawables.keyAt(i);
            BadgeDrawable valueAt = badgeDrawables.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.getSavedState());
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        savedState.f34536c = parcelableSparseArray;
        return savedState;
    }

    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public final void updateMenuView(boolean z) {
        if (!this.f34533c) {
            if (z) {
                this.f34532b.buildMenuView();
            } else {
                this.f34532b.updateMenuView();
            }
        }
    }
}
