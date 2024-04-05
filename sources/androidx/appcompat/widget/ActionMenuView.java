package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0069a;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0218f;
import androidx.appcompat.view.menu.C0220g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C2313k;
import java.util.Iterator;

public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.C0201b, C0220g {
    public static final int GENERATED_ITEM_PADDING = 4;
    public static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private C0218f.C0219a mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    public MenuBuilder.C0200a mMenuBuilderCallback;
    private int mMinCellSize;
    public C0241d mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty
        public int cellsUsed;
        @ViewDebug.ExportedProperty
        public boolean expandable;
        public boolean expanded;
        @ViewDebug.ExportedProperty
        public int extraPixels;
        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;
        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.isOverflowButton = false;
        }

        public LayoutParams(int i, int i2, boolean z) {
            super(i, i2);
            this.isOverflowButton = z;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0238a {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0239b implements C0218f.C0219a {
        /* renamed from: a */
        public final boolean mo1342a(MenuBuilder menuBuilder) {
            return false;
        }

        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public class C0240c implements MenuBuilder.C0200a {
        public C0240c() {
        }

        /* renamed from: a */
        public final boolean mo1310a(MenuBuilder menuBuilder, MenuItem menuItem) {
            boolean z;
            boolean z2;
            C0241d dVar = ActionMenuView.this.mOnMenuItemClickListener;
            if (dVar != null) {
                Toolbar.C0290a aVar = (Toolbar.C0290a) dVar;
                Iterator<C2313k> it = Toolbar.this.mMenuHostHelper.f5569b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().mo8900b()) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    z2 = true;
                } else {
                    Toolbar.C0294e eVar = Toolbar.this.mOnMenuItemClickListener;
                    z2 = eVar != null ? eVar.onMenuItemClick(menuItem) : false;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final void mo1311b(MenuBuilder menuBuilder) {
            MenuBuilder.C0200a aVar = ActionMenuView.this.mMenuBuilderCallback;
            if (aVar != null) {
                aVar.mo1311b(menuBuilder);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public interface C0241d {
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static int measureChildForCells(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.hasText();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.isOverflowButton || !z2) {
            z = false;
        }
        layoutParams.expandable = z;
        layoutParams.cellsUsed = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    private void onMeasureExactFormat(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size - paddingRight;
        int i10 = this.mMinCellSize;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        boolean z5 = false;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        long j = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            int i19 = size2;
            if (childAt.getVisibility() == 8) {
                i7 = paddingBottom;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i20 = i16 + 1;
                if (z6) {
                    int i21 = this.mGeneratedItemPadding;
                    i8 = i20;
                    z4 = false;
                    childAt.setPadding(i21, 0, i21, 0);
                } else {
                    i8 = i20;
                    z4 = false;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = z4;
                layoutParams.extraPixels = z4 ? 1 : 0;
                layoutParams.cellsUsed = z4;
                layoutParams.expandable = z4;
                layoutParams.leftMargin = z4;
                layoutParams.rightMargin = z4;
                layoutParams.preventEdgeOffset = z6 && ((ActionMenuItemView) childAt).hasText();
                int measureChildForCells = measureChildForCells(childAt, i13, layoutParams.isOverflowButton ? 1 : i11, childMeasureSpec, paddingBottom);
                i17 = Math.max(i17, measureChildForCells);
                if (layoutParams.expandable) {
                    i18++;
                }
                if (layoutParams.isOverflowButton) {
                    z5 = true;
                }
                i11 -= measureChildForCells;
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                if (measureChildForCells == 1) {
                    i7 = paddingBottom;
                    j |= (long) (1 << i15);
                    i11 = i11;
                } else {
                    i7 = paddingBottom;
                    int i22 = i11;
                }
                i16 = i8;
            }
            i15++;
            paddingBottom = i7;
            size2 = i19;
        }
        int i23 = size2;
        boolean z7 = z5 && i16 == 2;
        boolean z8 = false;
        while (true) {
            if (i18 <= 0 || i11 <= 0) {
                i5 = mode;
                i3 = i9;
                z = z8;
                i4 = i14;
            } else {
                int i24 = Integer.MAX_VALUE;
                int i25 = 0;
                int i26 = 0;
                long j2 = 0;
                while (i26 < childCount) {
                    boolean z9 = z8;
                    LayoutParams layoutParams2 = (LayoutParams) getChildAt(i26).getLayoutParams();
                    int i27 = i14;
                    if (layoutParams2.expandable) {
                        int i28 = layoutParams2.cellsUsed;
                        if (i28 < i24) {
                            j2 = 1 << i26;
                            i24 = i28;
                            i25 = 1;
                        } else if (i28 == i24) {
                            i25++;
                            j2 |= 1 << i26;
                        }
                    }
                    i26++;
                    i14 = i27;
                    z8 = z9;
                }
                z = z8;
                i4 = i14;
                j |= j2;
                if (i25 > i11) {
                    i5 = mode;
                    i3 = i9;
                    break;
                }
                int i29 = i24 + 1;
                int i30 = 0;
                while (i30 < childCount) {
                    View childAt2 = getChildAt(i30);
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    int i31 = i9;
                    int i32 = mode;
                    long j3 = (long) (1 << i30);
                    if ((j2 & j3) == 0) {
                        if (layoutParams3.cellsUsed == i29) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !layoutParams3.preventEdgeOffset || i11 != 1) {
                            z3 = z7;
                        } else {
                            int i33 = this.mGeneratedItemPadding;
                            z3 = z7;
                            childAt2.setPadding(i33 + i13, 0, i33, 0);
                        }
                        layoutParams3.cellsUsed++;
                        layoutParams3.expanded = true;
                        i11--;
                    }
                    i30++;
                    mode = i32;
                    i9 = i31;
                    z7 = z3;
                }
                i14 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i16 == 1;
        if (i11 <= 0 || j == 0 || (i11 >= i16 - 1 && !z10 && i17 <= 1)) {
            i6 = 0;
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                i6 = 0;
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount - 1;
                if ((j & ((long) (1 << i34))) != 0 && !((LayoutParams) getChildAt(i34).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            int i35 = bitCount > 0.0f ? (int) (((float) (i11 * i13)) / bitCount) : i6;
            z2 = z;
            for (int i36 = i6; i36 < childCount; i36++) {
                if ((j & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i35;
                        layoutParams4.expanded = true;
                        if (i36 == 0 && !layoutParams4.preventEdgeOffset) {
                            layoutParams4.leftMargin = (-i35) / 2;
                        }
                        z2 = true;
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i35;
                        layoutParams4.expanded = true;
                        layoutParams4.rightMargin = (-i35) / 2;
                        z2 = true;
                    } else {
                        if (i36 != 0) {
                            layoutParams4.leftMargin = i35 / 2;
                        }
                        if (i36 != childCount - 1) {
                            layoutParams4.rightMargin = i35 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i37 = i6; i37 < childCount; i37++) {
                View childAt4 = getChildAt(i37);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i13) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i23);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo2152b();
            ActionMenuPresenter.C0231a aVar = actionMenuPresenter.f662v;
            if (aVar != null && aVar.mo2028b()) {
                aVar.f621j.dismiss();
            }
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.setCallback(new C0240c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.f654n = true;
            actionMenuPresenter.f655o = true;
            C0218f.C0219a aVar = this.mActionMenuPresenterCallback;
            if (aVar == null) {
                aVar = new C0239b();
            }
            actionMenuPresenter.f568f = aVar;
            this.mMenu.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            actionMenuPresenter2.f571i = this;
            initialize(actionMenuPresenter2.f566d);
        }
        return this.mMenu;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        ActionMenuPresenter.C0234d dVar = actionMenuPresenter.f651k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (actionMenuPresenter.f653m) {
            return actionMenuPresenter.f652l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public boolean hasSupportDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0238a)) {
            z = false | ((C0238a) childAt).needsDividerAfter();
        }
        return (i <= 0 || !(childAt2 instanceof C0238a)) ? z : z | ((C0238a) childAt2).needsDividerBefore();
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.mo2152b();
    }

    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            if (actionMenuPresenter.f663w != null || actionMenuPresenter.mo2153c()) {
                return true;
            }
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.mo2153c();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.mPresenter.mo2153c()) {
                this.mPresenter.mo2152b();
                this.mPresenter.mo2155e();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.mFormatItems) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0353t0.m961a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i5 = getPaddingLeft() + layoutParams.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    hasSupportDividerBeforeChildAt(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int i16 = 0;
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i16 < childCount) {
                View childAt3 = getChildAt(i16);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i17 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
                i16++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i16 < childCount) {
            View childAt4 = getChildAt(i16);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i19 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = C0069a.m171b(measuredWidth4, layoutParams3.rightMargin, max, i19);
            }
            i16++;
        }
    }

    public void onMeasure(int i, int i2) {
        MenuBuilder menuBuilder;
        boolean z = this.mFormatItems;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.mFormatItems = z2;
        if (z != z2) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.mFormatItems || (menuBuilder = this.mMenu) == null || size == this.mFormatItemsWidth)) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.mFormatItems || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        onMeasureExactFormat(i, i2);
    }

    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mPresenter.f659s = z;
    }

    public void setMenuCallbacks(C0218f.C0219a aVar, MenuBuilder.C0200a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
    }

    public void setOnMenuItemClickListener(C0241d dVar) {
        this.mOnMenuItemClickListener = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        ActionMenuPresenter.C0234d dVar = actionMenuPresenter.f651k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.f653m = true;
        actionMenuPresenter.f652l = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.mReserveOverflow = z;
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.f571i = this;
        initialize(actionMenuPresenter.f566d);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.mo2155e();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f);
        this.mGeneratedItemPadding = (int) (f * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        if (layoutParams instanceof LayoutParams) {
            layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (layoutParams2.gravity <= 0) {
            layoutParams2.gravity = 16;
        }
        return layoutParams2;
    }
}
