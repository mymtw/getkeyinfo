package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0208a;
import androidx.appcompat.view.menu.C0216e;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.view.menu.C0220g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C2277b;
import com.etsy.android.R;
import java.util.ArrayList;
import p109g.C6825b;
import p109g.C6826c;

public final class ActionMenuPresenter extends C0208a implements C2277b.C2278a {

    /* renamed from: k */
    public C0234d f651k;

    /* renamed from: l */
    public Drawable f652l;

    /* renamed from: m */
    public boolean f653m;

    /* renamed from: n */
    public boolean f654n;

    /* renamed from: o */
    public boolean f655o;

    /* renamed from: p */
    public int f656p;

    /* renamed from: q */
    public int f657q;

    /* renamed from: r */
    public int f658r;

    /* renamed from: s */
    public boolean f659s;

    /* renamed from: t */
    public final SparseBooleanArray f660t = new SparseBooleanArray();

    /* renamed from: u */
    public C0236e f661u;

    /* renamed from: v */
    public C0231a f662v;

    /* renamed from: w */
    public C0233c f663w;

    /* renamed from: x */
    public C0232b f664x;

    /* renamed from: y */
    public final C0237f f665y = new C0237f();

    /* renamed from: z */
    public int f666z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0230a();

        /* renamed from: b */
        public int f667b;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        public class C0230a implements Parcelable.Creator<SavedState> {
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
            parcel.writeInt(this.f667b);
        }

        public SavedState(Parcel parcel) {
            this.f667b = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    public class C0231a extends C0216e {
        public C0231a(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(context, subMenuBuilder, view, false);
            if (!((MenuItemImpl) subMenuBuilder.getItem()).isActionButton()) {
                View view2 = ActionMenuPresenter.this.f651k;
                this.f617f = view2 == null ? (View) ActionMenuPresenter.this.f571i : view2;
            }
            C0237f fVar = ActionMenuPresenter.this.f665y;
            this.f620i = fVar;
            C6825b bVar = this.f621j;
            if (bVar != null) {
                bVar.setCallback(fVar);
            }
        }

        /* renamed from: c */
        public final void mo2029c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f662v = null;
            actionMenuPresenter.f666z = 0;
            super.mo2029c();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    public class C0232b extends ActionMenuItemView.C0198b {
        public C0232b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    public class C0233c implements Runnable {

        /* renamed from: b */
        public C0236e f670b;

        public C0233c(C0236e eVar) {
            this.f670b = eVar;
        }

        public final void run() {
            MenuBuilder menuBuilder = ActionMenuPresenter.this.f566d;
            if (menuBuilder != null) {
                menuBuilder.changeMenuMode();
            }
            View view = (View) ActionMenuPresenter.this.f571i;
            if (!(view == null || view.getWindowToken() == null)) {
                C0236e eVar = this.f670b;
                boolean z = true;
                if (!eVar.mo2028b()) {
                    if (eVar.f617f == null) {
                        z = false;
                    } else {
                        eVar.mo2030d(0, 0, false, false);
                    }
                }
                if (z) {
                    ActionMenuPresenter.this.f661u = this.f670b;
                }
            }
            ActionMenuPresenter.this.f663w = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    public class C0234d extends AppCompatImageView implements ActionMenuView.C0238a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        public class C0235a extends ForwardingListener {
            public C0235a(View view) {
                super(view);
            }

            public final C6826c getPopup() {
                C0236e eVar = ActionMenuPresenter.this.f661u;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo2027a();
            }

            public final boolean onForwardingStarted() {
                ActionMenuPresenter.this.mo2155e();
                return true;
            }

            public final boolean onForwardingStopped() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f663w != null) {
                    return false;
                }
                actionMenuPresenter.mo2152b();
                return true;
            }
        }

        public C0234d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setTooltipText(getContentDescription());
            setOnTouchListener(new C0235a(this));
        }

        public final boolean needsDividerAfter() {
            return false;
        }

        public final boolean needsDividerBefore() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo2155e();
            return true;
        }

        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    public class C0236e extends C0216e {
        public C0236e(Context context, MenuBuilder menuBuilder, C0234d dVar) {
            super(context, menuBuilder, dVar, true);
            this.f618g = 8388613;
            C0237f fVar = ActionMenuPresenter.this.f665y;
            this.f620i = fVar;
            C6825b bVar = this.f621j;
            if (bVar != null) {
                bVar.setCallback(fVar);
            }
        }

        /* renamed from: c */
        public final void mo2029c() {
            MenuBuilder menuBuilder = ActionMenuPresenter.this.f566d;
            if (menuBuilder != null) {
                menuBuilder.close();
            }
            ActionMenuPresenter.this.f661u = null;
            super.mo2029c();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    public class C0237f implements C0218f.C0219a {
        public C0237f() {
        }

        /* renamed from: a */
        public final boolean mo1342a(MenuBuilder menuBuilder) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (menuBuilder == actionMenuPresenter.f566d) {
                return false;
            }
            actionMenuPresenter.f666z = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            C0218f.C0219a aVar = ActionMenuPresenter.this.f568f;
            if (aVar != null) {
                return aVar.mo1342a(menuBuilder);
            }
            return false;
        }

        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuBuilder) {
                menuBuilder.getRootMenu().close(false);
            }
            C0218f.C0219a aVar = ActionMenuPresenter.this.f568f;
            if (aVar != null) {
                aVar.onCloseMenu(menuBuilder, z);
            }
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final View mo2151a(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        int i = 0;
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            C0220g.C0221a aVar = view instanceof C0220g.C0221a ? (C0220g.C0221a) view : (C0220g.C0221a) this.f567e.inflate(this.f570h, viewGroup, false);
            aVar.initialize(menuItemImpl, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f571i);
            if (this.f664x == null) {
                this.f664x = new C0232b();
            }
            actionMenuItemView.setPopupCallback(this.f664x);
            actionView = (View) aVar;
        }
        if (menuItemImpl.isActionViewExpanded()) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: b */
    public final boolean mo2152b() {
        C0220g gVar;
        C0233c cVar = this.f663w;
        if (cVar == null || (gVar = this.f571i) == null) {
            C0236e eVar = this.f661u;
            if (eVar == null) {
                return false;
            }
            if (eVar.mo2028b()) {
                eVar.f621j.dismiss();
            }
            return true;
        }
        ((View) gVar).removeCallbacks(cVar);
        this.f663w = null;
        return true;
    }

    /* renamed from: c */
    public final boolean mo2153c() {
        C0236e eVar = this.f661u;
        return eVar != null && eVar.mo2028b();
    }

    /* renamed from: d */
    public final void mo2154d(boolean z) {
        if (z) {
            C0218f.C0219a aVar = this.f568f;
            if (aVar != null) {
                aVar.mo1342a(this.f566d);
                return;
            }
            return;
        }
        MenuBuilder menuBuilder = this.f566d;
        if (menuBuilder != null) {
            menuBuilder.close(false);
        }
    }

    /* renamed from: e */
    public final boolean mo2155e() {
        MenuBuilder menuBuilder;
        if (!this.f654n || mo2153c() || (menuBuilder = this.f566d) == null || this.f571i == null || this.f663w != null || menuBuilder.getNonActionItems().isEmpty()) {
            return false;
        }
        C0233c cVar = new C0233c(new C0236e(this.f565c, this.f566d, this.f651k));
        this.f663w = cVar;
        ((View) this.f571i).post(cVar);
        return true;
    }

    public final boolean flagActionItems() {
        int i;
        ArrayList<MenuItemImpl> arrayList;
        boolean z;
        boolean z2;
        MenuBuilder menuBuilder = this.f566d;
        View view = null;
        boolean z3 = false;
        if (menuBuilder != null) {
            arrayList = menuBuilder.getVisibleItems();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.f658r;
        int i3 = this.f657q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f571i;
        int i4 = 0;
        boolean z4 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            MenuItemImpl menuItemImpl = arrayList.get(i4);
            if (menuItemImpl.requiresActionButton()) {
                i5++;
            } else if (menuItemImpl.requestsActionButton()) {
                i6++;
            } else {
                z4 = true;
            }
            if (this.f659s && menuItemImpl.isActionViewExpanded()) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f654n && (z4 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.f660t;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            MenuItemImpl menuItemImpl2 = arrayList.get(i8);
            if (menuItemImpl2.requiresActionButton()) {
                View a = mo2151a(menuItemImpl2, view, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z);
                }
                menuItemImpl2.setIsActionButton(z);
                z2 = z3;
            } else if (menuItemImpl2.requestsActionButton()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z5 = sparseBooleanArray.get(groupId2);
                boolean z6 = ((i7 > 0 || z5) && i3 > 0) ? z : z3;
                if (z6) {
                    View a2 = mo2151a(menuItemImpl2, view, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z6 &= i3 + i9 > 0 ? z : false;
                }
                boolean z7 = z6;
                if (z7 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z);
                } else if (z5) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i10 = 0; i10 < i8; i10++) {
                        MenuItemImpl menuItemImpl3 = arrayList.get(i10);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.isActionButton()) {
                                i7++;
                            }
                            menuItemImpl3.setIsActionButton(false);
                        }
                    }
                }
                if (z7) {
                    i7--;
                }
                menuItemImpl2.setIsActionButton(z7);
                z2 = false;
            } else {
                z2 = z3;
                menuItemImpl2.setIsActionButton(z2);
            }
            i8++;
            z3 = z2;
            view = null;
            z = true;
        }
        return z;
    }

    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f565c = context;
        LayoutInflater.from(context);
        this.f566d = menuBuilder;
        Resources resources = context.getResources();
        if (!this.f655o) {
            this.f654n = true;
        }
        int i = 2;
        this.f656p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f658r = i;
        int i4 = this.f656p;
        if (this.f654n) {
            if (this.f651k == null) {
                C0234d dVar = new C0234d(this.f564b);
                this.f651k = dVar;
                if (this.f653m) {
                    dVar.setImageDrawable(this.f652l);
                    this.f652l = null;
                    this.f653m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f651k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f651k.getMeasuredWidth();
        } else {
            this.f651k = null;
        }
        this.f657q = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        mo2152b();
        C0231a aVar = this.f662v;
        if (aVar != null && aVar.mo2028b()) {
            aVar.f621j.dismiss();
        }
        C0218f.C0219a aVar2 = this.f568f;
        if (aVar2 != null) {
            aVar2.onCloseMenu(menuBuilder, z);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f667b) > 0 && (findItem = this.f566d.findItem(i)) != null) {
            onSubMenuSelected((SubMenuBuilder) findItem.getSubMenu());
        }
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f667b = this.f666z;
        return savedState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            android.view.Menu r2 = r0.getParentMenu()
            androidx.appcompat.view.menu.MenuBuilder r3 = r8.f566d
            if (r2 == r3) goto L_0x0018
            android.view.Menu r0 = r0.getParentMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r0 = (androidx.appcompat.view.menu.SubMenuBuilder) r0
            goto L_0x0009
        L_0x0018:
            android.view.MenuItem r0 = r0.getItem()
            androidx.appcompat.view.menu.g r2 = r8.f571i
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L_0x0024
            goto L_0x0041
        L_0x0024:
            int r4 = r2.getChildCount()
            r5 = r1
        L_0x0029:
            if (r5 >= r4) goto L_0x0041
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.C0220g.C0221a
            if (r7 == 0) goto L_0x003e
            r7 = r6
            androidx.appcompat.view.menu.g$a r7 = (androidx.appcompat.view.menu.C0220g.C0221a) r7
            androidx.appcompat.view.menu.MenuItemImpl r7 = r7.getItemData()
            if (r7 != r0) goto L_0x003e
            r3 = r6
            goto L_0x0041
        L_0x003e:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0041:
            if (r3 != 0) goto L_0x0044
            return r1
        L_0x0044:
            android.view.MenuItem r0 = r9.getItem()
            int r0 = r0.getItemId()
            r8.f666z = r0
            int r0 = r9.size()
            r2 = r1
        L_0x0053:
            r4 = 1
            if (r2 >= r0) goto L_0x006b
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x0068
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L_0x0068
            r0 = r4
            goto L_0x006c
        L_0x0068:
            int r2 = r2 + 1
            goto L_0x0053
        L_0x006b:
            r0 = r1
        L_0x006c:
            androidx.appcompat.widget.ActionMenuPresenter$a r2 = new androidx.appcompat.widget.ActionMenuPresenter$a
            android.content.Context r5 = r8.f565c
            r2.<init>(r5, r9, r3)
            r8.f662v = r2
            r2.f619h = r0
            g.b r2 = r2.f621j
            if (r2 == 0) goto L_0x007e
            r2.mo2008f(r0)
        L_0x007e:
            androidx.appcompat.widget.ActionMenuPresenter$a r0 = r8.f662v
            boolean r2 = r0.mo2028b()
            if (r2 == 0) goto L_0x0088
        L_0x0086:
            r1 = r4
            goto L_0x0091
        L_0x0088:
            android.view.View r2 = r0.f617f
            if (r2 != 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            r0.mo2030d(r1, r1, r1, r1)
            goto L_0x0086
        L_0x0091:
            if (r1 == 0) goto L_0x009b
            androidx.appcompat.view.menu.f$a r0 = r8.f568f
            if (r0 == 0) goto L_0x009a
            r0.mo1342a(r9)
        L_0x009a:
            return r4
        L_0x009b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder):boolean");
    }

    public final void updateMenuView(boolean z) {
        C0220g gVar;
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f571i;
        ArrayList<MenuItemImpl> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            MenuBuilder menuBuilder = this.f566d;
            if (menuBuilder != null) {
                menuBuilder.flagActionItems();
                ArrayList<MenuItemImpl> visibleItems = this.f566d.getVisibleItems();
                int size = visibleItems.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemImpl menuItemImpl = visibleItems.get(i2);
                    if (menuItemImpl.isActionButton()) {
                        View childAt = viewGroup.getChildAt(i);
                        MenuItemImpl itemData = childAt instanceof C0220g.C0221a ? ((C0220g.C0221a) childAt).getItemData() : null;
                        View a = mo2151a(menuItemImpl, childAt, viewGroup);
                        if (menuItemImpl != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f571i).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f651k) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f571i).requestLayout();
        MenuBuilder menuBuilder2 = this.f566d;
        if (menuBuilder2 != null) {
            ArrayList<MenuItemImpl> actionItems = menuBuilder2.getActionItems();
            int size2 = actionItems.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C2277b supportActionProvider = actionItems.get(i3).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.f5535a = this;
                }
            }
        }
        MenuBuilder menuBuilder3 = this.f566d;
        if (menuBuilder3 != null) {
            arrayList = menuBuilder3.getNonActionItems();
        }
        if (this.f654n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).isActionViewExpanded();
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f651k == null) {
                this.f651k = new C0234d(this.f564b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f651k.getParent();
            if (viewGroup3 != this.f571i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f651k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f571i;
                actionMenuView.addView(this.f651k, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            C0234d dVar = this.f651k;
            if (dVar != null && dVar.getParent() == (gVar = this.f571i)) {
                ((ViewGroup) gVar).removeView(this.f651k);
            }
        }
        ((ActionMenuView) this.f571i).setOverflowReserved(this.f654n);
    }
}
