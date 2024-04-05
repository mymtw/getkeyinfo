package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.C0220g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.C0340p0;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import androidx.room.C3218a0;
import androidx.room.C3260z;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.ViewClickAnalyticsLog;
import com.etsy.android.lib.util.C8906j;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.navigation.bottom.C10683e;
import com.etsy.android.uikit.nav.TrackingBaseActivity;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C15367g;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19543e0;
import p507al.C14025c;
import p515bl.C14091a;
import p550dl.C17575a;
import p574gl.C17790a;
import p610kp.C18161c;

public abstract class NavigationBarView extends FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;
    private ColorStateList itemRippleColor;
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;
    private final NavigationBarMenuView menuView;
    private final NavigationBarPresenter presenter;
    /* access modifiers changed from: private */
    public C15384b reselectedListener;
    /* access modifiers changed from: private */
    public C15385c selectedListener;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15382a();

        /* renamed from: b */
        public Bundle f34537b;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        public static class C15382a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f34537b);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f34537b = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    public class C15383a implements MenuBuilder.C0200a {
        public C15383a() {
        }

        /* renamed from: a */
        public final boolean mo1310a(MenuBuilder menuBuilder, MenuItem menuItem) {
            C8703p pVar;
            String str;
            if (NavigationBarView.this.reselectedListener == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                if (NavigationBarView.this.selectedListener != null) {
                    C10683e eVar = (C10683e) ((C3260z) NavigationBarView.this.selectedListener).f7580b;
                    C19383o.m32797g(eVar, "this$0");
                    C19383o.m32797g(menuItem, "item");
                    TrackingBaseActivity trackingBaseActivity = eVar.f23558b.get();
                    if (!(trackingBaseActivity == null || (pVar = trackingBaseActivity.mAnalyticsTracker) == null)) {
                        ViewClickAnalyticsLog.ViewAction viewAction = ViewClickAnalyticsLog.ViewAction.clicked;
                        Pair[] pairArr = new Pair[1];
                        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.TAB_NAME;
                        switch (menuItem.getItemId()) {
                            case R.id.menu_bottom_nav_cart:
                                str = "menu_bottom_nav_cart";
                                break;
                            case R.id.menu_bottom_nav_favorites:
                                str = "menu_bottom_nav_favorites";
                                break;
                            case R.id.menu_bottom_nav_home:
                                str = "menu_bottom_nav_home";
                                break;
                            case R.id.menu_bottom_nav_updates:
                                str = "menu_bottom_nav_updates";
                                break;
                            case R.id.menu_bottom_nav_you:
                                str = "menu_bottom_nav_you";
                                break;
                            default:
                                StringBuilder h = C0072d.m201h("Menu item ");
                                h.append(menuItem.getTitle());
                                h.append(" not currently supported");
                                throw new IllegalStateException(h.toString());
                        }
                        pairArr[0] = new Pair(predefinedAnalyticsProperty, str);
                        pVar.mo21364l("bottom_nav", viewAction, C19294b0.m32561r0(pairArr));
                    }
                    CrashUtil.m17307a().mo30460e(new C8906j.C8911e("BottomNav", C19421p.m32931U(new Pair("tab", String.valueOf(menuItem.getTitle())))));
                    eVar.f23557a.mo34415a(menuItem.getItemId(), false);
                }
                return false;
            }
            C10683e eVar2 = (C10683e) ((C3218a0) NavigationBarView.this.reselectedListener).f7488c;
            C19383o.m32797g(eVar2, "this$0");
            eVar2.f23557a.mo34415a(menuItem.getItemId(), true);
            return true;
        }

        /* renamed from: b */
        public final void mo1311b(MenuBuilder menuBuilder) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    public interface C15384b {
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    public interface C15385c {
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C17790a.m29918a(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        Context context2 = getContext();
        C0340p0 e = C15367g.m24958e(context2, attributeSet, C18161c.f39673P, i, i2, 10, 9);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.menu = navigationBarMenu;
        NavigationBarMenuView createNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = createNavigationBarMenuView;
        navigationBarPresenter.f34532b = createNavigationBarMenuView;
        navigationBarPresenter.f34534d = 1;
        createNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        if (e.mo3108l(5)) {
            createNavigationBarMenuView.setIconTintList(e.mo3098b(5));
        } else {
            createNavigationBarMenuView.setIconTintList(createNavigationBarMenuView.createDefaultColorStateList(16842808));
        }
        setItemIconSize(e.mo3100d(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (e.mo3108l(10)) {
            setItemTextAppearanceInactive(e.mo3105i(10, 0));
        }
        if (e.mo3108l(9)) {
            setItemTextAppearanceActive(e.mo3105i(9, 0));
        }
        if (e.mo3108l(11)) {
            setItemTextColor(e.mo3098b(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            MaterialShapeDrawable createMaterialShapeDrawableBackground = createMaterialShapeDrawableBackground(context2);
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5227q(this, createMaterialShapeDrawableBackground);
        }
        if (e.mo3108l(7)) {
            setItemPaddingTop(e.mo3100d(7, 0));
        }
        if (e.mo3108l(6)) {
            setItemPaddingBottom(e.mo3100d(6, 0));
        }
        if (e.mo3108l(1)) {
            setElevation((float) e.mo3100d(1, 0));
        }
        getBackground().mutate().setTintList(C14025c.m21583b(context2, e, 0));
        setLabelVisibilityMode(e.f876b.getInteger(12, -1));
        int i3 = e.mo3105i(3, 0);
        if (i3 != 0) {
            createNavigationBarMenuView.setItemBackgroundRes(i3);
        } else {
            setItemRippleColor(C14025c.m21583b(context2, e, 8));
        }
        int i4 = e.mo3105i(2, 0);
        if (i4 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(i4, C18161c.f39672O);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(C14025c.m21582a(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(new C15401a(C15401a.m24980a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new C17575a((float) 0))));
            obtainStyledAttributes.recycle();
        }
        if (e.mo3108l(13)) {
            inflateMenu(e.mo3105i(13, 0));
        }
        e.mo3109n();
        addView(createNavigationBarMenuView);
        navigationBarMenu.setCallback(new C15383a());
    }

    private MaterialShapeDrawable createMaterialShapeDrawableBackground(Context context) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.initializeElevationOverlay(context);
        return materialShapeDrawable;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    public abstract NavigationBarMenuView createNavigationBarMenuView(Context context);

    public BadgeDrawable getBadge(int i) {
        return this.menuView.getBadge(i);
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    public C15401a getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.menu;
    }

    public C0220g getMenuView() {
        return this.menuView;
    }

    public BadgeDrawable getOrCreateBadge(int i) {
        return this.menuView.getOrCreateBadge(i);
    }

    public NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i) {
        this.presenter.f34533c = true;
        getMenuInflater().inflate(i, this.menu);
        NavigationBarPresenter navigationBarPresenter = this.presenter;
        navigationBarPresenter.f34533c = false;
        navigationBarPresenter.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19543e0.m33316i0(this);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.f34537b);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f34537b = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i) {
        this.menuView.removeBadge(i);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C19543e0.m33315h0(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.menuView.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.menuView.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C15401a aVar) {
        this.menuView.setItemActiveIndicatorShapeAppearance(aVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.menuView.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.menuView.setItemBackground(drawable);
        this.itemRippleColor = null;
    }

    public void setItemBackgroundResource(int i) {
        this.menuView.setItemBackgroundRes(i);
        this.itemRippleColor = null;
    }

    public void setItemIconSize(int i) {
        this.menuView.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i, onTouchListener);
    }

    public void setItemPaddingBottom(int i) {
        this.menuView.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.menuView.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.itemRippleColor != colorStateList) {
            this.itemRippleColor = colorStateList;
            if (colorStateList == null) {
                this.menuView.setItemBackground((Drawable) null);
                return;
            }
            this.menuView.setItemBackground(new RippleDrawable(C14091a.m21807a(colorStateList), (Drawable) null, (Drawable) null));
        } else if (colorStateList == null && this.menuView.getItemBackground() != null) {
            this.menuView.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.menuView.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.menuView.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.menuView.getLabelVisibilityMode() != i) {
            this.menuView.setLabelVisibilityMode(i);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(C15384b bVar) {
        this.reselectedListener = bVar;
    }

    public void setOnItemSelectedListener(C15385c cVar) {
        this.selectedListener = cVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.menu.findItem(i);
        if (findItem != null && !this.menu.performItemAction(findItem, this.presenter, 0)) {
            findItem.setChecked(true);
        }
    }
}
