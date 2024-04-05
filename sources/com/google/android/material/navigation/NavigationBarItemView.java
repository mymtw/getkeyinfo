package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0220g;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.material.badge.BadgeDrawable;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p260v0.C8184a;
import p629nk.C18268a;
import p712xk.C18787a;

public abstract class NavigationBarItemView extends FrameLayout implements C0220g.C0221a {
    private static final C15378d ACTIVE_INDICATOR_LABELED_TRANSFORM = new C15378d();
    private static final C15378d ACTIVE_INDICATOR_UNLABELED_TRANSFORM = new C15379e();
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int INVALID_ITEM_POSITION = -1;
    private ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight = 0;
    private int activeIndicatorDesiredWidth = 0;
    private boolean activeIndicatorEnabled = false;
    private int activeIndicatorMarginHorizontal = 0;
    private float activeIndicatorProgress = 0.0f;
    private boolean activeIndicatorResizeable = false;
    private C15378d activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
    private final View activeIndicatorView;
    private BadgeDrawable badgeDrawable;
    /* access modifiers changed from: private */
    public final ImageView icon;
    private final FrameLayout iconContainer;
    private ColorStateList iconTint;
    private boolean initialized = false;
    private boolean isShifting;
    private MenuItemImpl itemData;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition = -1;
    private final ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;
    private Drawable wrappedIconDrawable;

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$a */
    public class C15375a implements View.OnLayoutChangeListener {
        public C15375a() {
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (NavigationBarItemView.this.icon.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.tryUpdateBadgeBounds(navigationBarItemView.icon);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$b */
    public class C15376b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f34527b;

        public C15376b(int i) {
            this.f34527b = i;
        }

        public final void run() {
            NavigationBarItemView.this.updateActiveIndicatorLayoutParams(this.f34527b);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$c */
    public class C15377c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f34529a;

        public C15377c(float f) {
            this.f34529a = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.setActiveIndicatorProgress(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f34529a);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$d */
    public static class C15378d {
        /* renamed from: a */
        public float mo54245a(float f, float f2) {
            return 1.0f;
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$e */
    public static class C15379e extends C15378d {
        /* renamed from: a */
        public final float mo54245a(float f, float f2) {
            LinearInterpolator linearInterpolator = C18268a.f40091a;
            return (f * 0.6f) + 0.4f;
        }
    }

    public NavigationBarItemView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.iconContainer = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.activeIndicatorView = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.icon = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.labelGroup = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.largeLabel = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.itemPaddingTop = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.itemPaddingBottom = viewGroup.getPaddingBottom();
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5229s(textView, 2);
        C2364y.C2368d.m5229s(textView2, 2);
        setFocusable(true);
        calculateTextScaleFactors(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C15375a());
        }
    }

    private void calculateTextScaleFactors(float f, float f2) {
        this.shiftAmount = f - f2;
        this.scaleUpFactor = (f2 * 1.0f) / f;
        this.scaleDownFactor = (f * 1.0f) / f2;
    }

    private FrameLayout getCustomParentForBadge(View view) {
        return null;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.iconContainer;
        return frameLayout != null ? frameLayout : this.icon;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        BadgeDrawable badgeDrawable2 = this.badgeDrawable;
        int minimumHeight = badgeDrawable2 != null ? badgeDrawable2.getMinimumHeight() / 2 : 0;
        return this.icon.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable2 = this.badgeDrawable;
        int minimumWidth = badgeDrawable2 == null ? 0 : badgeDrawable2.getMinimumWidth() - this.badgeDrawable.getHorizontalOffset();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.icon.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
        return this.activeIndicatorResizeable && this.labelVisibilityMode == 2;
    }

    private void maybeAnimateActiveIndicatorToProgress(float f) {
        if (this.activeIndicatorEnabled && this.initialized) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2371g.m5245b(this)) {
                ValueAnimator valueAnimator = this.activeIndicatorAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.activeIndicatorAnimator = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.activeIndicatorProgress, f});
                this.activeIndicatorAnimator = ofFloat;
                ofFloat.addUpdateListener(new C15377c(f));
                this.activeIndicatorAnimator.setInterpolator(C18787a.m31706d(getContext(), R.attr.motionEasingStandard, C18268a.f40092b));
                this.activeIndicatorAnimator.setDuration((long) C18787a.m31705c(R.attr.motionDurationLong1, getContext(), getResources().getInteger(R.integer.material_motion_duration_long_1)));
                this.activeIndicatorAnimator.start();
                return;
            }
        }
        setActiveIndicatorProgress(f, f);
    }

    private void refreshChecked() {
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    /* access modifiers changed from: private */
    public void setActiveIndicatorProgress(float f, float f2) {
        View view = this.activeIndicatorView;
        if (view != null) {
            C15378d dVar = this.activeIndicatorTransform;
            dVar.getClass();
            LinearInterpolator linearInterpolator = C18268a.f40091a;
            view.setScaleX((0.6f * f) + 0.4f);
            view.setScaleY(dVar.mo54245a(f, f2));
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            view.setAlpha(C18268a.m30884a(0.0f, 1.0f, i == 0 ? 0.8f : 0.0f, i == 0 ? 1.0f : 0.2f, f));
        }
        this.activeIndicatorProgress = f;
    }

    private static void setViewScaleValues(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private static void setViewTopMarginAndGravity(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private void tryAttachBadgeToAnchor(View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeDrawable badgeDrawable2 = this.badgeDrawable;
            FrameLayout customParentForBadge = getCustomParentForBadge(view);
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable2.setBounds(rect);
            badgeDrawable2.updateBadgeCoordinates(view, customParentForBadge);
            if (badgeDrawable2.getCustomBadgeParent() != null) {
                badgeDrawable2.getCustomBadgeParent().setForeground(badgeDrawable2);
            } else {
                view.getOverlay().add(badgeDrawable2);
            }
        }
    }

    private void tryRemoveBadgeFromAnchor(View view) {
        if (hasBadge()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeDrawable badgeDrawable2 = this.badgeDrawable;
                if (badgeDrawable2 != null) {
                    if (badgeDrawable2.getCustomBadgeParent() != null) {
                        badgeDrawable2.getCustomBadgeParent().setForeground((Drawable) null);
                    } else {
                        view.getOverlay().remove(badgeDrawable2);
                    }
                }
            }
            this.badgeDrawable = null;
        }
    }

    /* access modifiers changed from: private */
    public void tryUpdateBadgeBounds(View view) {
        if (hasBadge()) {
            BadgeDrawable badgeDrawable2 = this.badgeDrawable;
            FrameLayout customParentForBadge = getCustomParentForBadge(view);
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable2.setBounds(rect);
            badgeDrawable2.updateBadgeCoordinates(view, customParentForBadge);
        }
    }

    /* access modifiers changed from: private */
    public void updateActiveIndicatorLayoutParams(int i) {
        if (this.activeIndicatorView != null) {
            int min = Math.min(this.activeIndicatorDesiredWidth, i - (this.activeIndicatorMarginHorizontal * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
            layoutParams.height = isActiveIndicatorResizeableAndUnlabeled() ? min : this.activeIndicatorDesiredHeight;
            layoutParams.width = min;
            this.activeIndicatorView.setLayoutParams(layoutParams);
        }
    }

    private void updateActiveIndicatorTransform() {
        if (isActiveIndicatorResizeableAndUnlabeled()) {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
        } else {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        }
    }

    private static void updateViewPaddingBottom(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public void clear() {
        removeBadge();
        this.itemData = null;
        this.activeIndicatorProgress = 0.0f;
        this.initialized = false;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.activeIndicatorView;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.itemPosition;
    }

    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return this.labelGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.labelGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.itemData = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        setTooltipText(!TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        this.initialized = true;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable2 = this.badgeDrawable;
        if (badgeDrawable2 != null && badgeDrawable2.isVisible()) {
            CharSequence title = this.itemData.getTitle();
            if (!TextUtils.isEmpty(this.itemData.getContentDescription())) {
                title = this.itemData.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.badgeDrawable.getContentDescription());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C6689b.C6692c.m13082a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f14783a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C6689b.C6690a.f14764g.f14778a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C15376b(i));
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.activeIndicatorView;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.activeIndicatorEnabled = z;
        View view = this.activeIndicatorView;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.activeIndicatorDesiredHeight = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.activeIndicatorMarginHorizontal = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.activeIndicatorResizeable = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.activeIndicatorDesiredWidth = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setBadge(BadgeDrawable badgeDrawable2) {
        this.badgeDrawable = badgeDrawable2;
        ImageView imageView = this.icon;
        if (imageView != null) {
            tryAttachBadgeToAnchor(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.largeLabel;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.largeLabel;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.smallLabel;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.smallLabel;
        textView4.setPivotY((float) textView4.getBaseline());
        maybeAnimateActiveIndicatorToProgress(z ? 1.0f : 0.0f);
        int i = this.labelVisibilityMode;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                    updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                    this.largeLabel.setVisibility(0);
                } else {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                    updateViewPaddingBottom(this.labelGroup, 0);
                    this.largeLabel.setVisibility(4);
                }
                this.smallLabel.setVisibility(4);
            } else if (i == 1) {
                updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                if (z) {
                    setViewTopMarginAndGravity(getIconOrContainer(), (int) (((float) this.itemPaddingTop) + this.shiftAmount), 49);
                    setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                    TextView textView5 = this.smallLabel;
                    float f = this.scaleUpFactor;
                    setViewScaleValues(textView5, f, f, 4);
                } else {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                    TextView textView6 = this.largeLabel;
                    float f2 = this.scaleDownFactor;
                    setViewScaleValues(textView6, f2, f2, 4);
                    setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                this.largeLabel.setVisibility(8);
                this.smallLabel.setVisibility(8);
            }
        } else if (this.isShifting) {
            if (z) {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                this.largeLabel.setVisibility(0);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                updateViewPaddingBottom(this.labelGroup, 0);
                this.largeLabel.setVisibility(4);
            }
            this.smallLabel.setVisibility(4);
        } else {
            updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
            if (z) {
                setViewTopMarginAndGravity(getIconOrContainer(), (int) (((float) this.itemPaddingTop) + this.shiftAmount), 49);
                setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                TextView textView7 = this.smallLabel;
                float f3 = this.scaleUpFactor;
                setViewScaleValues(textView7, f3, f3, 4);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                TextView textView8 = this.largeLabel;
                float f4 = this.scaleDownFactor;
                setViewScaleValues(textView8, f4, f4, 4);
                setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.smallLabel.setEnabled(z);
        this.largeLabel.setEnabled(z);
        this.icon.setEnabled(z);
        if (z) {
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), CloseCodes.PROTOCOL_ERROR);
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2376k.m5287d(this, systemIcon);
            return;
        }
        WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
        C2364y.C2376k.m5287d(this, (PointerIcon) null);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.originalIconDrawable) {
            this.originalIconDrawable = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                this.wrappedIconDrawable = drawable;
                ColorStateList colorStateList = this.iconTint;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
            }
            this.icon.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData != null && (drawable = this.wrappedIconDrawable) != null) {
            drawable.setTintList(colorStateList);
            this.wrappedIconDrawable.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            Context context = getContext();
            Object obj = C8184a.f17966a;
            drawable = C8184a.C8187c.m16466b(context, i);
        }
        setItemBackground(drawable);
    }

    public void setItemPaddingBottom(int i) {
        if (this.itemPaddingBottom != i) {
            this.itemPaddingBottom = i;
            refreshChecked();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.itemPaddingTop != i) {
            this.itemPaddingTop = i;
            refreshChecked();
        }
    }

    public void setItemPosition(int i) {
        this.itemPosition = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.labelVisibilityMode != i) {
            this.labelVisibilityMode = i;
            updateActiveIndicatorTransform();
            updateActiveIndicatorLayoutParams(getWidth());
            refreshChecked();
        }
    }

    public void setShifting(boolean z) {
        if (this.isShifting != z) {
            this.isShifting = z;
            refreshChecked();
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(int i) {
        this.largeLabel.setTextAppearance(i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        this.smallLabel.setTextAppearance(i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.itemData;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.itemData.getTooltipText();
        }
        setTooltipText(charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5227q(this, drawable);
    }
}
