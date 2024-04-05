package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.C0340p0;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.etsy.android.R;
import com.google.android.material.internal.C15346c;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.C15404b;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;
import p260v0.C8184a;
import p507al.C14025c;
import p550dl.C17575a;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int DEF_STYLE_RES = 2132018408;
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    private int layoutGravity;
    public C15389c listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    /* access modifiers changed from: private */
    public final C15346c presenter;
    private final RectF shapeClipBounds;
    private Path shapeClipPath;
    /* access modifiers changed from: private */
    public final int[] tmpLocation;
    private boolean topInsetScrimEnabled;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    public class C15387a implements MenuBuilder.C0200a {
        public C15387a() {
        }

        /* renamed from: a */
        public final boolean mo1310a(MenuBuilder menuBuilder, MenuItem menuItem) {
            C15389c cVar = NavigationView.this.listener;
            return cVar != null && cVar.mo54412a();
        }

        /* renamed from: b */
        public final void mo1311b(MenuBuilder menuBuilder) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    public class C15388b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C15388b() {
        }

        public final void onGlobalLayout() {
            Activity activity;
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.tmpLocation);
            boolean z = true;
            boolean z2 = NavigationView.this.tmpLocation[1] == 0;
            C15346c access$100 = NavigationView.this.presenter;
            if (access$100.f34486v != z2) {
                access$100.f34486v = z2;
                int i = (access$100.f34467c.getChildCount() != 0 || !access$100.f34486v) ? 0 : access$100.f34488x;
                NavigationMenuView navigationMenuView = access$100.f34466b;
                navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
            }
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z2 && navigationView2.isTopInsetScrimEnabled());
            Context context = NavigationView.this.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                boolean z3 = activity.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                boolean z4 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                if (!z3 || !z4 || !navigationView3.isBottomInsetScrimEnabled()) {
                    z = false;
                }
                navigationView3.setDrawBottomInsetForeground(z);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public interface C15389c {
        /* renamed from: a */
        boolean mo54412a();
    }

    public NavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList b = C8184a.m16459b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = b.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{b.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private final Drawable createDefaultItemBackground(C0340p0 p0Var) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new C15401a(C15401a.m24980a(getContext(), p0Var.mo3105i(16, 0), p0Var.mo3105i(17, 0), new C17575a((float) 0))));
        materialShapeDrawable.setFillColor(C14025c.m21583b(getContext(), p0Var, 18));
        return new InsetDrawable(materialShapeDrawable, p0Var.mo3100d(21, 0), p0Var.mo3100d(22, 0), p0Var.mo3100d(20, 0), p0Var.mo3100d(19, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(C0340p0 p0Var) {
        return p0Var.mo3108l(16) || p0Var.mo3108l(17);
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i, int i2) {
        if (!(getParent() instanceof DrawerLayout) || this.drawerLayoutCornerSize <= 0 || !(getBackground() instanceof MaterialShapeDrawable)) {
            this.shapeClipPath = null;
            this.shapeClipBounds.setEmpty();
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
        C15401a shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        shapeAppearanceModel.getClass();
        C15401a.C15402a aVar = new C15401a.C15402a(shapeAppearanceModel);
        int i3 = this.layoutGravity;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (Gravity.getAbsoluteGravity(i3, C2364y.C2369e.m5233d(this)) == 3) {
            aVar.mo54621g((float) this.drawerLayoutCornerSize);
            aVar.mo54619e((float) this.drawerLayoutCornerSize);
        } else {
            aVar.mo54620f((float) this.drawerLayoutCornerSize);
            aVar.mo54618d((float) this.drawerLayoutCornerSize);
        }
        materialShapeDrawable.setShapeAppearanceModel(new C15401a(aVar));
        if (this.shapeClipPath == null) {
            this.shapeClipPath = new Path();
        }
        this.shapeClipPath.reset();
        this.shapeClipBounds.set(0.0f, 0.0f, (float) i, (float) i2);
        C15404b.C15405a.f34607a.mo54622a(materialShapeDrawable.getShapeAppearanceModel(), materialShapeDrawable.getInterpolation(), this.shapeClipBounds, this.shapeClipPath);
        invalidate();
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new C15388b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(View view) {
        C15346c cVar = this.presenter;
        cVar.f34467c.addView(view);
        NavigationMenuView navigationMenuView = cVar.f34466b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.shapeClipPath == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.shapeClipPath);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.presenter.f34470f.f34493c;
    }

    public int getDividerInsetEnd() {
        return this.presenter.f34483s;
    }

    public int getDividerInsetStart() {
        return this.presenter.f34482r;
    }

    public int getHeaderCount() {
        return this.presenter.f34467c.getChildCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.f34467c.getChildAt(i);
    }

    public Drawable getItemBackground() {
        return this.presenter.f34477m;
    }

    public int getItemHorizontalPadding() {
        return this.presenter.f34478n;
    }

    public int getItemIconPadding() {
        return this.presenter.f34480p;
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.f34476l;
    }

    public int getItemMaxLines() {
        return this.presenter.f34487w;
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.f34475k;
    }

    public int getItemVerticalPadding() {
        return this.presenter.f34479o;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public int getSubheaderInsetEnd() {
        this.presenter.getClass();
        return 0;
    }

    public int getSubheaderInsetStart() {
        return this.presenter.f34484t;
    }

    public View inflateHeaderView(int i) {
        C15346c cVar = this.presenter;
        View inflate = cVar.f34471g.inflate(i, cVar.f34467c, false);
        cVar.f34467c.addView(inflate);
        NavigationMenuView navigationMenuView = cVar.f34466b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
        return inflate;
    }

    public void inflateMenu(int i) {
        C15346c.C15349c cVar = this.presenter.f34470f;
        if (cVar != null) {
            cVar.f34494d = true;
        }
        getMenuInflater().inflate(i, this.menu);
        C15346c cVar2 = this.presenter;
        C15346c.C15349c cVar3 = cVar2.f34470f;
        if (cVar3 != null) {
            cVar3.f34494d = false;
        }
        cVar2.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19543e0.m33316i0(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void onInsetsChanged(C2348w0 w0Var) {
        C15346c cVar = this.presenter;
        cVar.getClass();
        int g = w0Var.mo8948g();
        if (cVar.f34488x != g) {
            cVar.f34488x = g;
            int i = (cVar.f34467c.getChildCount() != 0 || !cVar.f34486v) ? 0 : cVar.f34488x;
            NavigationMenuView navigationMenuView = cVar.f34466b;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = cVar.f34466b;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, w0Var.mo8944d());
        C2364y.m5187b(cVar.f34467c, w0Var);
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        maybeUpdateCornerSizeForDrawerLayout(i, i2);
    }

    public void removeHeaderView(View view) {
        C15346c cVar = this.presenter;
        cVar.f34467c.removeView(view);
        if (cVar.f34467c.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = cVar.f34466b;
            navigationMenuView.setPadding(0, cVar.f34488x, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.bottomInsetScrimEnabled = z;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.menu.findItem(i);
        if (findItem != null) {
            this.presenter.f34470f.mo54195k((MenuItemImpl) findItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        C15346c cVar = this.presenter;
        cVar.f34483s = i;
        cVar.updateMenuView(false);
    }

    public void setDividerInsetStart(int i) {
        C15346c cVar = this.presenter;
        cVar.f34482r = i;
        cVar.updateMenuView(false);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C19543e0.m33315h0(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        C15346c cVar = this.presenter;
        cVar.f34477m = drawable;
        cVar.updateMenuView(false);
    }

    public void setItemBackgroundResource(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setItemBackground(C8184a.C8187c.m16466b(context, i));
    }

    public void setItemHorizontalPadding(int i) {
        C15346c cVar = this.presenter;
        cVar.f34478n = i;
        cVar.updateMenuView(false);
    }

    public void setItemHorizontalPaddingResource(int i) {
        C15346c cVar = this.presenter;
        cVar.f34478n = getResources().getDimensionPixelSize(i);
        cVar.updateMenuView(false);
    }

    public void setItemIconPadding(int i) {
        C15346c cVar = this.presenter;
        cVar.f34480p = i;
        cVar.updateMenuView(false);
    }

    public void setItemIconPaddingResource(int i) {
        C15346c cVar = this.presenter;
        cVar.f34480p = getResources().getDimensionPixelSize(i);
        cVar.updateMenuView(false);
    }

    public void setItemIconSize(int i) {
        C15346c cVar = this.presenter;
        if (cVar.f34481q != i) {
            cVar.f34481q = i;
            cVar.f34485u = true;
            cVar.updateMenuView(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        C15346c cVar = this.presenter;
        cVar.f34476l = colorStateList;
        cVar.updateMenuView(false);
    }

    public void setItemMaxLines(int i) {
        C15346c cVar = this.presenter;
        cVar.f34487w = i;
        cVar.updateMenuView(false);
    }

    public void setItemTextAppearance(int i) {
        C15346c cVar = this.presenter;
        cVar.f34474j = i;
        cVar.updateMenuView(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        C15346c cVar = this.presenter;
        cVar.f34475k = colorStateList;
        cVar.updateMenuView(false);
    }

    public void setItemVerticalPadding(int i) {
        C15346c cVar = this.presenter;
        cVar.f34479o = i;
        cVar.updateMenuView(false);
    }

    public void setItemVerticalPaddingResource(int i) {
        C15346c cVar = this.presenter;
        cVar.f34479o = getResources().getDimensionPixelSize(i);
        cVar.updateMenuView(false);
    }

    public void setNavigationItemSelectedListener(C15389c cVar) {
        this.listener = cVar;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C15346c cVar = this.presenter;
        if (cVar != null) {
            cVar.f34490z = i;
            NavigationMenuView navigationMenuView = cVar.f34466b;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setSubheaderInsetEnd(int i) {
        C15346c cVar = this.presenter;
        cVar.f34484t = i;
        cVar.updateMenuView(false);
    }

    public void setSubheaderInsetStart(int i) {
        C15346c cVar = this.presenter;
        cVar.f34484t = i;
        cVar.updateMenuView(false);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.topInsetScrimEnabled = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15386a();
        public Bundle menuState;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        public static class C15386a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            int r6 = DEF_STYLE_RES
            android.content.Context r13 = p574gl.C17790a.m29918a(r13, r14, r15, r6)
            r12.<init>(r13, r14, r15)
            com.google.android.material.internal.c r13 = new com.google.android.material.internal.c
            r13.<init>()
            r12.presenter = r13
            r7 = 2
            int[] r0 = new int[r7]
            r12.tmpLocation = r0
            r8 = 1
            r12.topInsetScrimEnabled = r8
            r12.bottomInsetScrimEnabled = r8
            r9 = 0
            r12.layoutGravity = r9
            r12.drawerLayoutCornerSize = r9
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r12.shapeClipBounds = r0
            android.content.Context r10 = r12.getContext()
            com.google.android.material.internal.NavigationMenu r11 = new com.google.android.material.internal.NavigationMenu
            r11.<init>(r10)
            r12.menu = r11
            int[] r2 = p610kp.C18161c.f39675R
            int[] r5 = new int[r9]
            r0 = r10
            r1 = r14
            r3 = r15
            r4 = r6
            androidx.appcompat.widget.p0 r0 = com.google.android.material.internal.C15367g.m24958e(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0.mo3108l(r8)
            if (r1 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r1 = r0.mo3101e(r8)
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r2 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2368d.m5227q(r12, r1)
        L_0x004c:
            r1 = 7
            int r1 = r0.mo3100d(r1, r9)
            r12.drawerLayoutCornerSize = r1
            int r1 = r0.mo3104h(r9, r9)
            r12.layoutGravity = r1
            android.graphics.drawable.Drawable r1 = r12.getBackground()
            if (r1 == 0) goto L_0x0067
            android.graphics.drawable.Drawable r1 = r12.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L_0x0092
        L_0x0067:
            com.google.android.material.shape.a$a r14 = com.google.android.material.shape.C15401a.m24981b(r10, r14, r15, r6)
            com.google.android.material.shape.a r15 = new com.google.android.material.shape.a
            r15.<init>(r14)
            android.graphics.drawable.Drawable r14 = r12.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>((com.google.android.material.shape.C15401a) r15)
            boolean r15 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r15 == 0) goto L_0x008a
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r1.setFillColor(r14)
        L_0x008a:
            r1.initializeElevationOverlay(r10)
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r14 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2368d.m5227q(r12, r1)
        L_0x0092:
            r14 = 8
            boolean r15 = r0.mo3108l(r14)
            if (r15 == 0) goto L_0x00a2
            int r14 = r0.mo3100d(r14, r9)
            float r14 = (float) r14
            r12.setElevation(r14)
        L_0x00a2:
            boolean r14 = r0.mo3097a(r7, r9)
            r12.setFitsSystemWindows(r14)
            r14 = 3
            int r14 = r0.mo3100d(r14, r9)
            r12.maxWidth = r14
            r14 = 29
            boolean r15 = r0.mo3108l(r14)
            r1 = 0
            if (r15 == 0) goto L_0x00be
            android.content.res.ColorStateList r14 = r0.mo3098b(r14)
            goto L_0x00bf
        L_0x00be:
            r14 = r1
        L_0x00bf:
            r15 = 32
            boolean r2 = r0.mo3108l(r15)
            if (r2 == 0) goto L_0x00cc
            int r15 = r0.mo3105i(r15, r9)
            goto L_0x00cd
        L_0x00cc:
            r15 = r9
        L_0x00cd:
            r2 = 16842808(0x1010038, float:2.3693715E-38)
            if (r15 != 0) goto L_0x00d8
            if (r14 != 0) goto L_0x00d8
            android.content.res.ColorStateList r14 = r12.createDefaultColorStateList(r2)
        L_0x00d8:
            r3 = 14
            boolean r4 = r0.mo3108l(r3)
            if (r4 == 0) goto L_0x00e5
            android.content.res.ColorStateList r2 = r0.mo3098b(r3)
            goto L_0x00e9
        L_0x00e5:
            android.content.res.ColorStateList r2 = r12.createDefaultColorStateList(r2)
        L_0x00e9:
            r3 = 23
            boolean r4 = r0.mo3108l(r3)
            if (r4 == 0) goto L_0x00f6
            int r3 = r0.mo3105i(r3, r9)
            goto L_0x00f7
        L_0x00f6:
            r3 = r9
        L_0x00f7:
            r4 = 13
            boolean r5 = r0.mo3108l(r4)
            if (r5 == 0) goto L_0x0106
            int r4 = r0.mo3100d(r4, r9)
            r12.setItemIconSize(r4)
        L_0x0106:
            r4 = 24
            boolean r5 = r0.mo3108l(r4)
            if (r5 == 0) goto L_0x0112
            android.content.res.ColorStateList r1 = r0.mo3098b(r4)
        L_0x0112:
            if (r3 != 0) goto L_0x011d
            if (r1 != 0) goto L_0x011d
            r1 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r1 = r12.createDefaultColorStateList(r1)
        L_0x011d:
            r4 = 10
            android.graphics.drawable.Drawable r4 = r0.mo3101e(r4)
            if (r4 != 0) goto L_0x012f
            boolean r5 = r12.hasShapeAppearance(r0)
            if (r5 == 0) goto L_0x012f
            android.graphics.drawable.Drawable r4 = r12.createDefaultItemBackground(r0)
        L_0x012f:
            r5 = 11
            boolean r6 = r0.mo3108l(r5)
            if (r6 == 0) goto L_0x013e
            int r5 = r0.mo3100d(r5, r9)
            r12.setItemHorizontalPadding(r5)
        L_0x013e:
            r5 = 25
            boolean r6 = r0.mo3108l(r5)
            if (r6 == 0) goto L_0x014d
            int r5 = r0.mo3100d(r5, r9)
            r12.setItemVerticalPadding(r5)
        L_0x014d:
            r5 = 6
            int r5 = r0.mo3100d(r5, r9)
            r12.setDividerInsetStart(r5)
            r5 = 5
            int r5 = r0.mo3100d(r5, r9)
            r12.setDividerInsetEnd(r5)
            r5 = 31
            int r5 = r0.mo3100d(r5, r9)
            r12.setSubheaderInsetStart(r5)
            r5 = 30
            int r5 = r0.mo3100d(r5, r9)
            r12.setSubheaderInsetEnd(r5)
            r5 = 33
            boolean r6 = r12.topInsetScrimEnabled
            boolean r5 = r0.mo3097a(r5, r6)
            r12.setTopInsetScrimEnabled(r5)
            r5 = 4
            boolean r6 = r12.bottomInsetScrimEnabled
            boolean r5 = r0.mo3097a(r5, r6)
            r12.setBottomInsetScrimEnabled(r5)
            r5 = 12
            int r5 = r0.mo3100d(r5, r9)
            r6 = 15
            int r6 = r0.mo3104h(r6, r8)
            r12.setItemMaxLines(r6)
            com.google.android.material.navigation.NavigationView$a r6 = new com.google.android.material.navigation.NavigationView$a
            r6.<init>()
            r11.setCallback(r6)
            r13.f34469e = r8
            r13.initForMenu(r10, r11)
            if (r15 == 0) goto L_0x01a7
            r13.f34472h = r15
            r13.updateMenuView(r9)
        L_0x01a7:
            r13.f34473i = r14
            r13.updateMenuView(r9)
            r13.f34476l = r2
            r13.updateMenuView(r9)
            int r14 = r12.getOverScrollMode()
            r13.f34490z = r14
            com.google.android.material.internal.NavigationMenuView r15 = r13.f34466b
            if (r15 == 0) goto L_0x01be
            r15.setOverScrollMode(r14)
        L_0x01be:
            if (r3 == 0) goto L_0x01c5
            r13.f34474j = r3
            r13.updateMenuView(r9)
        L_0x01c5:
            r13.f34475k = r1
            r13.updateMenuView(r9)
            r13.f34477m = r4
            r13.updateMenuView(r9)
            r13.f34480p = r5
            r13.updateMenuView(r9)
            r11.addMenuPresenter(r13)
            com.google.android.material.internal.NavigationMenuView r14 = r13.f34466b
            if (r14 != 0) goto L_0x021d
            android.view.LayoutInflater r14 = r13.f34471g
            r15 = 2131624089(0x7f0e0099, float:1.8875348E38)
            android.view.View r14 = r14.inflate(r15, r12, r9)
            com.google.android.material.internal.NavigationMenuView r14 = (com.google.android.material.internal.NavigationMenuView) r14
            r13.f34466b = r14
            com.google.android.material.internal.c$h r15 = new com.google.android.material.internal.c$h
            com.google.android.material.internal.NavigationMenuView r1 = r13.f34466b
            r15.<init>(r1)
            r14.setAccessibilityDelegateCompat(r15)
            com.google.android.material.internal.c$c r14 = r13.f34470f
            if (r14 != 0) goto L_0x01fd
            com.google.android.material.internal.c$c r14 = new com.google.android.material.internal.c$c
            r14.<init>()
            r13.f34470f = r14
        L_0x01fd:
            int r14 = r13.f34490z
            r15 = -1
            if (r14 == r15) goto L_0x0207
            com.google.android.material.internal.NavigationMenuView r15 = r13.f34466b
            r15.setOverScrollMode(r14)
        L_0x0207:
            android.view.LayoutInflater r14 = r13.f34471g
            r15 = 2131624086(0x7f0e0096, float:1.8875342E38)
            com.google.android.material.internal.NavigationMenuView r1 = r13.f34466b
            android.view.View r14 = r14.inflate(r15, r1, r9)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r13.f34467c = r14
            com.google.android.material.internal.NavigationMenuView r14 = r13.f34466b
            com.google.android.material.internal.c$c r15 = r13.f34470f
            r14.setAdapter(r15)
        L_0x021d:
            com.google.android.material.internal.NavigationMenuView r13 = r13.f34466b
            r12.addView(r13)
            r13 = 26
            boolean r14 = r0.mo3108l(r13)
            if (r14 == 0) goto L_0x0231
            int r13 = r0.mo3105i(r13, r9)
            r12.inflateMenu(r13)
        L_0x0231:
            r13 = 9
            boolean r14 = r0.mo3108l(r13)
            if (r14 == 0) goto L_0x0240
            int r13 = r0.mo3105i(r13, r9)
            r12.inflateHeaderView(r13)
        L_0x0240:
            r0.mo3109n()
            r12.setupInsetScrimsListener()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.f34470f.mo54195k((MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
