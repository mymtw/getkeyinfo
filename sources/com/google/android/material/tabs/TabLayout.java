package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C15370j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;
import p075d.C6614a;
import p077d1.C6620d;
import p077d1.C6622f;
import p088e1.C6689b;
import p213q2.C7717a;
import p260v0.C8184a;
import p566fl.C17746a;
import p629nk.C18268a;

@ViewPager.C3330e
public class TabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    public static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final int DEF_STYLE_RES = 2132018411;
    public static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final C6620d<C15453g> tabPool = new C6622f(16);
    private C15448b adapterChangeListener;
    private int contentInsetStart;
    private C15449c currentVpSelectedListener;
    public boolean inlineLabel;
    public int mode;
    private C15454h pageChangeListener;
    private C7717a pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private C15449c selectedListener;
    private final ArrayList<C15449c> selectedListeners;
    private C15453g selectedTab;
    private boolean setupViewPagerImplicitly;
    public final C15452f slidingTabIndicator;
    public final int tabBackgroundResId;
    public int tabGravity;
    public ColorStateList tabIconTint;
    public PorterDuff.Mode tabIconTintMode;
    public int tabIndicatorAnimationDuration;
    public int tabIndicatorAnimationMode;
    public boolean tabIndicatorFullWidth;
    public int tabIndicatorGravity;
    public int tabIndicatorHeight;
    /* access modifiers changed from: private */
    public C15456a tabIndicatorInterpolator;
    public int tabMaxWidth;
    public int tabPaddingBottom;
    public int tabPaddingEnd;
    public int tabPaddingStart;
    public int tabPaddingTop;
    public ColorStateList tabRippleColorStateList;
    public Drawable tabSelectedIndicator;
    /* access modifiers changed from: private */
    public int tabSelectedIndicatorColor;
    public int tabTextAppearance;
    public ColorStateList tabTextColors;
    public float tabTextMultiLineSize;
    public float tabTextSize;
    private final C6620d<TabView> tabViewPool;
    private final ArrayList<C15453g> tabs;
    public boolean unboundedRipple;
    public ViewPager viewPager;

    public final class TabView extends LinearLayout {
        private View badgeAnchorView;
        /* access modifiers changed from: private */
        public BadgeDrawable badgeDrawable;
        private Drawable baseBackgroundDrawable;
        private ImageView customIconView;
        private TextView customTextView;
        private View customView;
        private int defaultMaxLines = 2;
        private ImageView iconView;
        private C15453g tab;
        private TextView textView;

        /* renamed from: com.google.android.material.tabs.TabLayout$TabView$a */
        public class C15446a implements View.OnLayoutChangeListener {

            /* renamed from: b */
            public final /* synthetic */ View f34688b;

            public C15446a(View view) {
                this.f34688b = view;
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f34688b.getVisibility() == 0) {
                    TabView.this.tryUpdateBadgeDrawableBounds(this.f34688b);
                }
            }
        }

        public TabView(Context context) {
            super(context);
            updateBackgroundDrawable(context);
            int i = TabLayout.this.tabPaddingStart;
            int i2 = TabLayout.this.tabPaddingTop;
            int i3 = TabLayout.this.tabPaddingEnd;
            int i4 = TabLayout.this.tabPaddingBottom;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2369e.m5240k(this, i, i2, i3, i4);
            setGravity(17);
            setOrientation(TabLayout.this.inlineLabel ^ true ? 1 : 0);
            setClickable(true);
            C2364y.C2376k.m5287d(this, PointerIcon.getSystemIcon(getContext(), CloseCodes.PROTOCOL_ERROR));
        }

        private void addOnLayoutChangeListener(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C15446a(view));
            }
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            return (f / layout.getPaint().getTextSize()) * layout.getLineWidth(i);
        }

        private void clipViewToPaddingForBadge(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        private FrameLayout createPreApi18BadgeAnchorRoot() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        public void drawBackground(Canvas canvas) {
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        /* access modifiers changed from: private */
        public BadgeDrawable getBadge() {
            return this.badgeDrawable;
        }

        private FrameLayout getCustomParentForBadge(View view) {
            return null;
        }

        /* access modifiers changed from: private */
        public BadgeDrawable getOrCreateBadge() {
            if (this.badgeDrawable == null) {
                this.badgeDrawable = BadgeDrawable.create(getContext());
            }
            tryUpdateBadgeAnchor();
            BadgeDrawable badgeDrawable2 = this.badgeDrawable;
            if (badgeDrawable2 != null) {
                return badgeDrawable2;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* access modifiers changed from: private */
        public boolean hasBadgeDrawable() {
            return this.badgeDrawable != null;
        }

        private void inflateAndAddDefaultIconView() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, this, false);
            this.iconView = imageView;
            addView(imageView, 0);
        }

        private void inflateAndAddDefaultTextView() {
            TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, this, false);
            this.textView = textView2;
            addView(textView2);
        }

        /* access modifiers changed from: private */
        public void removeBadge() {
            if (this.badgeAnchorView != null) {
                tryRemoveBadgeFromAnchor();
            }
            this.badgeDrawable = null;
        }

        private void tryAttachBadgeToAnchor(View view) {
            if (hasBadgeDrawable() && view != null) {
                clipViewToPaddingForBadge(false);
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
                this.badgeAnchorView = view;
            }
        }

        private void tryRemoveBadgeFromAnchor() {
            if (hasBadgeDrawable()) {
                clipViewToPaddingForBadge(true);
                View view = this.badgeAnchorView;
                if (view != null) {
                    BadgeDrawable badgeDrawable2 = this.badgeDrawable;
                    if (badgeDrawable2 != null) {
                        if (badgeDrawable2.getCustomBadgeParent() != null) {
                            badgeDrawable2.getCustomBadgeParent().setForeground((Drawable) null);
                        } else {
                            view.getOverlay().remove(badgeDrawable2);
                        }
                    }
                    this.badgeAnchorView = null;
                }
            }
        }

        private void tryUpdateBadgeAnchor() {
            C15453g gVar;
            C15453g gVar2;
            if (hasBadgeDrawable()) {
                if (this.customView != null) {
                    tryRemoveBadgeFromAnchor();
                    return;
                }
                ImageView imageView = this.iconView;
                if (imageView == null || (gVar2 = this.tab) == null || gVar2.f34700b == null) {
                    TextView textView2 = this.textView;
                    if (textView2 == null || (gVar = this.tab) == null || gVar.f34705g != 1) {
                        tryRemoveBadgeFromAnchor();
                    } else if (this.badgeAnchorView != textView2) {
                        tryRemoveBadgeFromAnchor();
                        tryAttachBadgeToAnchor(this.textView);
                    } else {
                        tryUpdateBadgeDrawableBounds(textView2);
                    }
                } else if (this.badgeAnchorView != imageView) {
                    tryRemoveBadgeFromAnchor();
                    tryAttachBadgeToAnchor(this.iconView);
                } else {
                    tryUpdateBadgeDrawableBounds(imageView);
                }
            }
        }

        /* access modifiers changed from: private */
        public void tryUpdateBadgeDrawableBounds(View view) {
            if (hasBadgeDrawable() && view == this.badgeAnchorView) {
                BadgeDrawable badgeDrawable2 = this.badgeDrawable;
                FrameLayout customParentForBadge = getCustomParentForBadge(view);
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                badgeDrawable2.setBounds(rect);
                badgeDrawable2.updateBadgeCoordinates(view, customParentForBadge);
            }
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void updateBackgroundDrawable(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.tabBackgroundResId
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = p075d.C6614a.m12981a(r6, r0)
                r5.baseBackgroundDrawable = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.baseBackgroundDrawable
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.baseBackgroundDrawable = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.tabRippleColorStateList
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.tabRippleColorStateList
                android.content.res.ColorStateList r2 = p515bl.C14091a.m21807a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.unboundedRipple
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r0 = androidx.core.view.C2364y.f5646a
                androidx.core.view.C2364y.C2368d.m5227q(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.updateBackgroundDrawable(android.content.Context):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.f34700b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void updateTextAndIcon(android.widget.TextView r8, android.widget.ImageView r9) {
            /*
                r7 = this;
                com.google.android.material.tabs.TabLayout$g r0 = r7.tab
                r1 = 0
                if (r0 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r0 = r0.f34700b
                if (r0 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L_0x000f
            L_0x000e:
                r0 = r1
            L_0x000f:
                if (r0 == 0) goto L_0x0021
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.tabIconTint
                r0.setTintList(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.tabIconTintMode
                if (r2 == 0) goto L_0x0021
                r0.setTintMode(r2)
            L_0x0021:
                com.google.android.material.tabs.TabLayout$g r2 = r7.tab
                if (r2 == 0) goto L_0x0028
                java.lang.CharSequence r2 = r2.f34701c
                goto L_0x0029
            L_0x0028:
                r2 = r1
            L_0x0029:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L_0x0040
                if (r0 == 0) goto L_0x003a
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L_0x0040
            L_0x003a:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L_0x0040:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                r5 = 1
                r0 = r0 ^ r5
                if (r8 == 0) goto L_0x0064
                if (r0 == 0) goto L_0x005e
                r8.setText(r2)
                com.google.android.material.tabs.TabLayout$g r6 = r7.tab
                int r6 = r6.f34705g
                if (r6 != r5) goto L_0x0057
                r8.setVisibility(r4)
                goto L_0x005a
            L_0x0057:
                r8.setVisibility(r3)
            L_0x005a:
                r7.setVisibility(r4)
                goto L_0x0064
            L_0x005e:
                r8.setVisibility(r3)
                r8.setText(r1)
            L_0x0064:
                if (r9 == 0) goto L_0x00a6
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r0 == 0) goto L_0x007e
                int r5 = r9.getVisibility()
                if (r5 != 0) goto L_0x007e
                android.content.Context r5 = r7.getContext()
                float r3 = com.google.android.material.internal.C15370j.m24961b(r5, r3)
                int r3 = (int) r3
                goto L_0x007f
            L_0x007e:
                r3 = r4
            L_0x007f:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                boolean r5 = r5.inlineLabel
                if (r5 == 0) goto L_0x0097
                int r5 = r8.getMarginEnd()
                if (r3 == r5) goto L_0x00a6
                r8.setMarginEnd(r3)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto L_0x00a6
            L_0x0097:
                int r5 = r8.bottomMargin
                if (r3 == r5) goto L_0x00a6
                r8.bottomMargin = r3
                r8.setMarginEnd(r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            L_0x00a6:
                com.google.android.material.tabs.TabLayout$g r8 = r7.tab
                if (r8 == 0) goto L_0x00ac
                java.lang.CharSequence r1 = r8.f34702d
            L_0x00ac:
                if (r0 == 0) goto L_0x00af
                goto L_0x00b0
            L_0x00af:
                r2 = r1
            L_0x00b0:
                r7.setTooltipText(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.updateTextAndIcon(android.widget.TextView, android.widget.ImageView):void");
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.baseBackgroundDrawable;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.baseBackgroundDrawable.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public C15453g getTab() {
            return this.tab;
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable2 = this.badgeDrawable;
            if (badgeDrawable2 != null && badgeDrawable2.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.badgeDrawable.getContentDescription());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C6689b.C6692c.m13082a(0, 1, this.tab.f34703e, 1, false, isSelected()).f14783a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C6689b.C6690a.f14764g.f14778a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.textView != null) {
                float f = TabLayout.this.tabTextSize;
                int i3 = this.defaultMaxLines;
                ImageView imageView = this.iconView;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView2 = this.textView;
                    if (textView2 != null && textView2.getLineCount() > 1) {
                        f = TabLayout.this.tabTextMultiLineSize;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int maxLines = this.textView.getMaxLines();
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.mode == 1 && i4 > 0 && lineCount == 1 && ((layout = this.textView.getLayout()) == null || approximateLineWidth(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.textView.setTextSize(0, f);
                        this.textView.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.tab == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            C15453g gVar = this.tab;
            TabLayout tabLayout = gVar.f34706h;
            if (tabLayout != null) {
                tabLayout.selectTab(gVar);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void reset() {
            setTab((C15453g) null);
            setSelected(false);
        }

        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView2 = this.textView;
            if (textView2 != null) {
                textView2.setSelected(z);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.customView;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(C15453g gVar) {
            if (gVar != this.tab) {
                this.tab = gVar;
                update();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d3, code lost:
            if ((r3 != -1 && r3 == r0.f34703e) != false) goto L_0x00df;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void update() {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout$g r0 = r5.tab
                r1 = 0
                if (r0 == 0) goto L_0x0008
                android.view.View r2 = r0.f34704f
                goto L_0x0009
            L_0x0008:
                r2 = r1
            L_0x0009:
                if (r2 == 0) goto L_0x0051
                android.view.ViewParent r3 = r2.getParent()
                if (r3 == r5) goto L_0x001b
                if (r3 == 0) goto L_0x0018
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r3.removeView(r2)
            L_0x0018:
                r5.addView(r2)
            L_0x001b:
                r5.customView = r2
                android.widget.TextView r3 = r5.textView
                r4 = 8
                if (r3 == 0) goto L_0x0026
                r3.setVisibility(r4)
            L_0x0026:
                android.widget.ImageView r3 = r5.iconView
                if (r3 == 0) goto L_0x0032
                r3.setVisibility(r4)
                android.widget.ImageView r3 = r5.iconView
                r3.setImageDrawable(r1)
            L_0x0032:
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r5.customTextView = r1
                if (r1 == 0) goto L_0x0045
                int r1 = r1.getMaxLines()
                r5.defaultMaxLines = r1
            L_0x0045:
                r1 = 16908294(0x1020006, float:2.3877246E-38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r5.customIconView = r1
                goto L_0x005e
            L_0x0051:
                android.view.View r2 = r5.customView
                if (r2 == 0) goto L_0x005a
                r5.removeView(r2)
                r5.customView = r1
            L_0x005a:
                r5.customTextView = r1
                r5.customIconView = r1
            L_0x005e:
                android.view.View r1 = r5.customView
                if (r1 != 0) goto L_0x00a1
                android.widget.ImageView r1 = r5.iconView
                if (r1 != 0) goto L_0x0069
                r5.inflateAndAddDefaultIconView()
            L_0x0069:
                android.widget.TextView r1 = r5.textView
                if (r1 != 0) goto L_0x0078
                r5.inflateAndAddDefaultTextView()
                android.widget.TextView r1 = r5.textView
                int r1 = r1.getMaxLines()
                r5.defaultMaxLines = r1
            L_0x0078:
                android.widget.TextView r1 = r5.textView
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.tabTextAppearance
                r1.setTextAppearance(r2)
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r1 = r1.tabTextColors
                if (r1 == 0) goto L_0x008c
                android.widget.TextView r2 = r5.textView
                r2.setTextColor(r1)
            L_0x008c:
                android.widget.TextView r1 = r5.textView
                android.widget.ImageView r2 = r5.iconView
                r5.updateTextAndIcon(r1, r2)
                r5.tryUpdateBadgeAnchor()
                android.widget.ImageView r1 = r5.iconView
                r5.addOnLayoutChangeListener(r1)
                android.widget.TextView r1 = r5.textView
                r5.addOnLayoutChangeListener(r1)
                goto L_0x00ae
            L_0x00a1:
                android.widget.TextView r1 = r5.customTextView
                if (r1 != 0) goto L_0x00a9
                android.widget.ImageView r2 = r5.customIconView
                if (r2 == 0) goto L_0x00ae
            L_0x00a9:
                android.widget.ImageView r2 = r5.customIconView
                r5.updateTextAndIcon(r1, r2)
            L_0x00ae:
                if (r0 == 0) goto L_0x00bd
                java.lang.CharSequence r1 = r0.f34702d
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x00bd
                java.lang.CharSequence r1 = r0.f34702d
                r5.setContentDescription(r1)
            L_0x00bd:
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x00de
                com.google.android.material.tabs.TabLayout r3 = r0.f34706h
                if (r3 == 0) goto L_0x00d6
                int r3 = r3.getSelectedTabPosition()
                r4 = -1
                if (r3 == r4) goto L_0x00d2
                int r0 = r0.f34703e
                if (r3 != r0) goto L_0x00d2
                r0 = r1
                goto L_0x00d3
            L_0x00d2:
                r0 = r2
            L_0x00d3:
                if (r0 == 0) goto L_0x00de
                goto L_0x00df
            L_0x00d6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
            L_0x00de:
                r1 = r2
            L_0x00df:
                r5.setSelected(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.update():void");
        }

        public final void updateOrientation() {
            setOrientation(TabLayout.this.inlineLabel ^ true ? 1 : 0);
            TextView textView2 = this.customTextView;
            if (textView2 == null && this.customIconView == null) {
                updateTextAndIcon(this.textView, this.iconView);
            } else {
                updateTextAndIcon(textView2, this.customIconView);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C15447a implements ValueAnimator.AnimatorUpdateListener {
        public C15447a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C15448b implements ViewPager.C3333h {

        /* renamed from: b */
        public boolean f34691b;

        public C15448b() {
        }

        /* renamed from: a */
        public final void mo12624a(ViewPager viewPager, C7717a aVar, C7717a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.viewPager == viewPager) {
                tabLayout.setPagerAdapter(aVar2, this.f34691b);
            }
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C15449c<T extends C15453g> {
        /* renamed from: a */
        void mo36757a(T t);

        /* renamed from: b */
        void mo36758b();

        /* renamed from: c */
        void mo36759c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface C15450d extends C15449c<C15453g> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C15451e extends DataSetObserver {
        public C15451e() {
        }

        public final void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        public final void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public class C15452f extends LinearLayout {

        /* renamed from: f */
        public static final /* synthetic */ int f34694f = 0;

        /* renamed from: b */
        public ValueAnimator f34695b;

        /* renamed from: c */
        public int f34696c = -1;

        /* renamed from: d */
        public float f34697d;

        public C15452f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* renamed from: a */
        public final void mo54874a() {
            View childAt = getChildAt(this.f34696c);
            C15456a access$1300 = TabLayout.this.tabIndicatorInterpolator;
            TabLayout tabLayout = TabLayout.this;
            Drawable drawable = tabLayout.tabSelectedIndicator;
            access$1300.getClass();
            RectF a = C15456a.m25053a(tabLayout, childAt);
            drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        }

        /* renamed from: b */
        public final void mo54875b(int i) {
            Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
            TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* renamed from: c */
        public final void mo54876c(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                C15456a access$1300 = TabLayout.this.tabIndicatorInterpolator;
                TabLayout tabLayout = TabLayout.this;
                access$1300.mo54884b(tabLayout, view, view2, f, tabLayout.tabSelectedIndicator);
            } else {
                Drawable drawable = TabLayout.this.tabSelectedIndicator;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.tabSelectedIndicator.getBounds().bottom);
            }
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }

        /* renamed from: d */
        public final void mo54877d(int i, int i2, boolean z) {
            View childAt = getChildAt(this.f34696c);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                mo54874a();
                return;
            }
            C15457b bVar = new C15457b(this, childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f34695b = valueAnimator;
                valueAnimator.setInterpolator(C18268a.f40092b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(bVar);
                valueAnimator.addListener(new C15458c(this, i));
                valueAnimator.start();
                return;
            }
            this.f34695b.removeAllUpdateListeners();
            this.f34695b.addUpdateListener(bVar);
        }

        public final void draw(Canvas canvas) {
            int height = TabLayout.this.tabSelectedIndicator.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            }
            int i = TabLayout.this.tabIndicatorGravity;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                height = i != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.tabSelectedIndicator.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
                TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.tabSelectedIndicator;
                if (tabLayout.tabSelectedIndicatorColor != 0) {
                    drawable.setTint(TabLayout.this.tabSelectedIndicatorColor);
                } else {
                    drawable.setTintList((ColorStateList) null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f34695b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                mo54874a();
            } else {
                mo54877d(this.f34696c, -1, false);
            }
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C15370j.m24961b(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.tabGravity = 0;
                            tabLayout2.updateTabViews(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C15453g {

        /* renamed from: a */
        public Object f34699a;

        /* renamed from: b */
        public Drawable f34700b;

        /* renamed from: c */
        public CharSequence f34701c;

        /* renamed from: d */
        public CharSequence f34702d;

        /* renamed from: e */
        public int f34703e = -1;

        /* renamed from: f */
        public View f34704f;

        /* renamed from: g */
        public int f34705g = 1;

        /* renamed from: h */
        public TabLayout f34706h;

        /* renamed from: i */
        public TabView f34707i;

        /* renamed from: j */
        public int f34708j = -1;

        /* renamed from: a */
        public final void mo54882a(int i) {
            this.f34704f = LayoutInflater.from(this.f34707i.getContext()).inflate(i, this.f34707i, false);
            TabView tabView = this.f34707i;
            if (tabView != null) {
                tabView.update();
            }
        }

        /* renamed from: b */
        public final void mo54883b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f34702d) && !TextUtils.isEmpty(charSequence)) {
                this.f34707i.setContentDescription(charSequence);
            }
            this.f34701c = charSequence;
            TabView tabView = this.f34707i;
            if (tabView != null) {
                tabView.update();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C15454h implements ViewPager.C3334i {

        /* renamed from: b */
        public final WeakReference<TabLayout> f34709b;

        /* renamed from: c */
        public int f34710c;

        /* renamed from: d */
        public int f34711d;

        public C15454h(TabLayout tabLayout) {
            this.f34709b = new WeakReference<>(tabLayout);
        }

        public final void onPageScrollStateChanged(int i) {
            this.f34710c = this.f34711d;
            this.f34711d = i;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f34709b.get();
            if (tabLayout != null) {
                int i3 = this.f34711d;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f34710c == 1;
                if (!(i3 == 2 && this.f34710c == 0)) {
                    z = true;
                }
                tabLayout.setScrollPosition(i, f, z2, z);
            }
        }

        public final void onPageSelected(int i) {
            TabLayout tabLayout = this.f34709b.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f34711d;
                tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.f34710c == 0));
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public static class C15455i implements C15450d {

        /* renamed from: a */
        public final ViewPager f34712a;

        public C15455i(ViewPager viewPager) {
            this.f34712a = viewPager;
        }

        /* renamed from: a */
        public final void mo36757a(C15453g gVar) {
            this.f34712a.setCurrentItem(gVar.f34703e);
        }

        /* renamed from: b */
        public final void mo36758b() {
        }

        /* renamed from: c */
        public final void mo36759c(C15453g gVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addTabFromItemView(TabItem tabItem) {
        C15453g newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            newTab.mo54883b(charSequence);
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            newTab.f34700b = drawable;
            TabLayout tabLayout = newTab.f34706h;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            TabView tabView = newTab.f34707i;
            if (tabView != null) {
                tabView.update();
            }
        }
        int i = tabItem.customLayout;
        if (i != 0) {
            newTab.mo54882a(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.f34702d = tabItem.getContentDescription();
            TabView tabView2 = newTab.f34707i;
            if (tabView2 != null) {
                tabView2.update();
            }
        }
        addTab(newTab);
    }

    private void addTabView(C15453g gVar) {
        TabView tabView = gVar.f34707i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.slidingTabIndicator.addView(tabView, gVar.f34703e, createLayoutParamsForTabs());
    }

    private void addViewInternal(View view) {
        if (view instanceof TabItem) {
            addTabFromItemView((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void animateToTab(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (C2364y.C2371g.m5246c(this)) {
                    C15452f fVar = this.slidingTabIndicator;
                    int childCount = fVar.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount) {
                            z = false;
                            break;
                        } else if (fVar.getChildAt(i2).getWidth() <= 0) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        int scrollX = getScrollX();
                        int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
                        if (scrollX != calculateScrollXForTab) {
                            ensureScrollAnimator();
                            this.scrollAnimator.setIntValues(new int[]{scrollX, calculateScrollXForTab});
                            this.scrollAnimator.start();
                        }
                        C15452f fVar2 = this.slidingTabIndicator;
                        int i3 = this.tabIndicatorAnimationDuration;
                        ValueAnimator valueAnimator = fVar2.f34695b;
                        if (valueAnimator != null && valueAnimator.isRunning()) {
                            fVar2.f34695b.cancel();
                        }
                        fVar2.mo54877d(i, i3, true);
                        return;
                    }
                }
            }
            setScrollPosition(i, 0.0f, true);
        }
    }

    private void applyGravityForModeScrollable(int i) {
        if (i == 0) {
            Log.w(LOG_TAG, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.slidingTabIndicator.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.slidingTabIndicator.setGravity(8388611);
    }

    private void applyModeAndGravity() {
        int i = this.mode;
        int max = (i == 0 || i == 2) ? Math.max(0, this.contentInsetStart - this.tabPaddingStart) : 0;
        C15452f fVar = this.slidingTabIndicator;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2369e.m5240k(fVar, max, 0, 0, 0);
        int i2 = this.mode;
        if (i2 == 0) {
            applyGravityForModeScrollable(this.tabGravity);
        } else if (i2 == 1 || i2 == 2) {
            if (this.tabGravity == 2) {
                Log.w(LOG_TAG, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.slidingTabIndicator.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i, float f) {
        View childAt;
        int i2 = this.mode;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.slidingTabIndicator.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        View childAt2 = i4 < this.slidingTabIndicator.getChildCount() ? this.slidingTabIndicator.getChildAt(i4) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return C2364y.C2369e.m5233d(this) == 0 ? left + i5 : left - i5;
    }

    private void configureTab(C15453g gVar, int i) {
        gVar.f34703e = i;
        this.tabs.add(i, gVar);
        int size = this.tabs.size();
        while (true) {
            i++;
            if (i < size) {
                this.tabs.get(i).f34703e = i;
            } else {
                return;
            }
        }
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private TabView createTabView(C15453g gVar) {
        C6620d<TabView> dVar = this.tabViewPool;
        TabView b = dVar != null ? dVar.mo18807b() : null;
        if (b == null) {
            b = new TabView(getContext());
        }
        b.setTab(gVar);
        b.setFocusable(true);
        b.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f34702d)) {
            b.setContentDescription(gVar.f34701c);
        } else {
            b.setContentDescription(gVar.f34702d);
        }
        return b;
    }

    private void dispatchTabReselected(C15453g gVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).mo36759c(gVar);
        }
    }

    private void dispatchTabSelected(C15453g gVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).mo36757a(gVar);
        }
    }

    private void dispatchTabUnselected(C15453g gVar) {
        int size = this.selectedListeners.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.selectedListeners.get(size).mo36758b();
            } else {
                return;
            }
        }
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(C18268a.f40092b);
            this.scrollAnimator.setDuration((long) this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new C15447a());
        }
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C15453g gVar = this.tabs.get(i);
                if (gVar != null && gVar.f34700b != null && !TextUtils.isEmpty(gVar.f34701c)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.inlineLabel) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.requestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        int i2 = this.mode;
        if (i2 == 0 || i2 == 2) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void removeTabViewAt(int i) {
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i);
        this.slidingTabIndicator.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.mo18806a(tabView);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i) {
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            TabView tabView = this.tabs.get(i).f34707i;
            if (tabView != null) {
                tabView.update();
            }
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void addOnTabSelectedListener(C15450d dVar) {
        addOnTabSelectedListener((C15449c) dVar);
    }

    public void addTab(C15453g gVar) {
        addTab(gVar, this.tabs.isEmpty());
    }

    public void addView(View view) {
        addViewInternal(view);
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public C15453g createTabFromPool() {
        C15453g b = tabPool.mo18807b();
        return b == null ? new C15453g() : b;
    }

    public int getSelectedTabPosition() {
        C15453g gVar = this.selectedTab;
        if (gVar != null) {
            return gVar.f34703e;
        }
        return -1;
    }

    public C15453g getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.tabs.get(i);
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorAnimationMode() {
        return this.tabIndicatorAnimationMode;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    public C15453g newTab() {
        C15453g createTabFromPool = createTabFromPool();
        createTabFromPool.f34706h = this;
        TabView createTabView = createTabView(createTabFromPool);
        createTabFromPool.f34707i = createTabView;
        int i = createTabFromPool.f34708j;
        if (i != -1) {
            createTabView.setId(i);
        }
        return createTabFromPool;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19543e0.m33316i0(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager((ViewPager) null);
            this.setupViewPagerImplicitly = false;
        }
    }

    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6689b.C6691b.m13081a(1, getTabCount(), 1).f14782a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C15370j.m24961b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.requestedTabMaxWidth
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C15370j.m24961b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.tabMaxWidth = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.mode
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = r5
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        C7717a aVar = this.pagerAdapter;
        if (aVar != null) {
            int j = aVar.mo20184j();
            for (int i = 0; i < j; i++) {
                C15453g newTab = newTab();
                newTab.mo54883b(this.pagerAdapter.mo20186l(i));
                addTab(newTab, false);
            }
            ViewPager viewPager2 = this.viewPager;
            if (viewPager2 != null && j > 0 && (currentItem = viewPager2.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
            }
        }
    }

    public boolean releaseFromTabPool(C15453g gVar) {
        return tabPool.mo18806a(gVar);
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<C15453g> it = this.tabs.iterator();
        while (it.hasNext()) {
            C15453g next = it.next();
            it.remove();
            next.f34706h = null;
            next.f34707i = null;
            next.f34699a = null;
            next.f34700b = null;
            next.f34708j = -1;
            next.f34701c = null;
            next.f34702d = null;
            next.f34703e = -1;
            next.f34704f = null;
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    public void removeOnTabSelectedListener(C15450d dVar) {
        removeOnTabSelectedListener((C15449c) dVar);
    }

    public void removeTab(C15453g gVar) {
        if (gVar.f34706h == this) {
            removeTabAt(gVar.f34703e);
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i) {
        C15453g gVar = this.selectedTab;
        int i2 = gVar != null ? gVar.f34703e : 0;
        removeTabViewAt(i);
        C15453g remove = this.tabs.remove(i);
        C15453g gVar2 = null;
        if (remove != null) {
            remove.f34706h = null;
            remove.f34707i = null;
            remove.f34699a = null;
            remove.f34700b = null;
            remove.f34708j = -1;
            remove.f34701c = null;
            remove.f34702d = null;
            remove.f34703e = -1;
            remove.f34704f = null;
            releaseFromTabPool(remove);
        }
        int size = this.tabs.size();
        for (int i3 = i; i3 < size; i3++) {
            this.tabs.get(i3).f34703e = i3;
        }
        if (i2 == i) {
            if (!this.tabs.isEmpty()) {
                gVar2 = this.tabs.get(Math.max(0, i - 1));
            }
            selectTab(gVar2);
        }
    }

    public void selectTab(C15453g gVar) {
        selectTab(gVar, true);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C19543e0.m33315h0(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C15450d dVar) {
        setOnTabSelectedListener((C15449c) dVar);
    }

    public void setPagerAdapter(C7717a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        C7717a aVar2 = this.pagerAdapter;
        if (!(aVar2 == null || (dataSetObserver = this.pagerAdapterObserver) == null)) {
            aVar2.f17111b.unregisterObserver(dataSetObserver);
        }
        this.pagerAdapter = aVar;
        if (z && aVar != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new C15451e();
            }
            aVar.f17111b.registerObserver(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.tabSelectedIndicator != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.tabSelectedIndicator = drawable;
            int i = this.tabIndicatorHeight;
            if (i == -1) {
                i = drawable.getIntrinsicHeight();
            }
            this.slidingTabIndicator.mo54875b(i);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.tabSelectedIndicatorColor = i;
        updateTabViews(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            C15452f fVar = this.slidingTabIndicator;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(fVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.tabIndicatorHeight = i;
        this.slidingTabIndicator.mo54875b(i);
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C8184a.m16459b(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.tabIndicatorAnimationMode = i;
        if (i == 0) {
            this.tabIndicatorInterpolator = new C15456a();
        } else if (i == 1) {
            this.tabIndicatorInterpolator = new C17746a();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        C15452f fVar = this.slidingTabIndicator;
        int i = C15452f.f34694f;
        fVar.mo54874a();
        C15452f fVar2 = this.slidingTabIndicator;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5221k(fVar2);
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C8184a.m16459b(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C7717a aVar) {
        setPagerAdapter(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager2) {
        setupWithViewPager(viewPager2, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Deprecated
    public void addOnTabSelectedListener(C15449c cVar) {
        if (!this.selectedListeners.contains(cVar)) {
            this.selectedListeners.add(cVar);
        }
    }

    public void addTab(C15453g gVar, int i) {
        addTab(gVar, i, this.tabs.isEmpty());
    }

    public void addView(View view, int i) {
        addViewInternal(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(C15449c cVar) {
        this.selectedListeners.remove(cVar);
    }

    public void selectTab(C15453g gVar, boolean z) {
        C15453g gVar2 = this.selectedTab;
        if (gVar2 != gVar) {
            int i = gVar != null ? gVar.f34703e : -1;
            if (z) {
                if ((gVar2 == null || gVar2.f34703e == -1) && i != -1) {
                    setScrollPosition(i, 0.0f, true);
                } else {
                    animateToTab(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.selectedTab = gVar;
            if (gVar2 != null) {
                dispatchTabUnselected(gVar2);
            }
            if (gVar != null) {
                dispatchTabSelected(gVar);
            }
        } else if (gVar2 != null) {
            dispatchTabReselected(gVar);
            animateToTab(gVar.f34703e);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(C15449c cVar) {
        C15449c cVar2 = this.selectedListener;
        if (cVar2 != null) {
            removeOnTabSelectedListener(cVar2);
        }
        this.selectedListener = cVar;
        if (cVar != null) {
            addOnTabSelectedListener(cVar);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int i2;
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.slidingTabIndicator.getChildCount()) {
            if (z2) {
                C15452f fVar = this.slidingTabIndicator;
                ValueAnimator valueAnimator = fVar.f34695b;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.f34695b.cancel();
                }
                fVar.f34696c = i;
                fVar.f34697d = f;
                fVar.mo54876c(fVar.getChildAt(i), fVar.getChildAt(fVar.f34696c + 1), fVar.f34697d);
            }
            ValueAnimator valueAnimator2 = this.scrollAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.scrollAnimator.cancel();
            }
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = calculateScrollXForTab(i, f);
            }
            scrollTo(i2, 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void setupWithViewPager(ViewPager viewPager2, boolean z) {
        setupWithViewPager(viewPager2, z, false);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            int r4 = DEF_STYLE_RES
            android.content.Context r13 = p574gl.C17790a.m29918a(r13, r14, r15, r4)
            r12.<init>(r13, r14, r15)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r12.tabs = r13
            android.graphics.drawable.GradientDrawable r13 = new android.graphics.drawable.GradientDrawable
            r13.<init>()
            r12.tabSelectedIndicator = r13
            r13 = 0
            r12.tabSelectedIndicatorColor = r13
            r0 = 2147483647(0x7fffffff, float:NaN)
            r12.tabMaxWidth = r0
            r6 = -1
            r12.tabIndicatorHeight = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.selectedListeners = r0
            d1.e r0 = new d1.e
            r7 = 12
            r0.<init>(r7)
            r12.tabViewPool = r0
            android.content.Context r8 = r12.getContext()
            r12.setHorizontalScrollBarEnabled(r13)
            com.google.android.material.tabs.TabLayout$f r9 = new com.google.android.material.tabs.TabLayout$f
            r9.<init>(r8)
            r12.slidingTabIndicator = r9
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r6)
            super.addView(r9, r13, r0)
            int[] r2 = p610kp.C18161c.f39697l1
            r10 = 1
            int[] r5 = new int[r10]
            r11 = 23
            r5[r13] = r11
            r0 = r8
            r1 = r14
            r3 = r15
            android.content.res.TypedArray r14 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r15 = r12.getBackground()
            boolean r15 = r15 instanceof android.graphics.drawable.ColorDrawable
            if (r15 == 0) goto L_0x0086
            android.graphics.drawable.Drawable r15 = r12.getBackground()
            android.graphics.drawable.ColorDrawable r15 = (android.graphics.drawable.ColorDrawable) r15
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            int r15 = r15.getColor()
            android.content.res.ColorStateList r15 = android.content.res.ColorStateList.valueOf(r15)
            r0.setFillColor(r15)
            r0.initializeElevationOverlay(r8)
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r15 = androidx.core.view.C2364y.f5646a
            float r15 = androidx.core.view.C2364y.C2373i.m5262i(r12)
            r0.setElevation(r15)
            androidx.core.view.C2364y.C2368d.m5227q(r12, r0)
        L_0x0086:
            r15 = 5
            android.graphics.drawable.Drawable r15 = p507al.C14025c.m21585d(r8, r14, r15)
            r12.setSelectedTabIndicator((android.graphics.drawable.Drawable) r15)
            r15 = 8
            int r15 = r14.getColor(r15, r13)
            r12.setSelectedTabIndicatorColor(r15)
            r15 = 11
            int r15 = r14.getDimensionPixelSize(r15, r6)
            r9.mo54875b(r15)
            r15 = 10
            int r15 = r14.getInt(r15, r13)
            r12.setSelectedTabIndicatorGravity(r15)
            r15 = 7
            int r15 = r14.getInt(r15, r13)
            r12.setTabIndicatorAnimationMode(r15)
            r15 = 9
            boolean r15 = r14.getBoolean(r15, r10)
            r12.setTabIndicatorFullWidth(r15)
            r15 = 16
            int r15 = r14.getDimensionPixelSize(r15, r13)
            r12.tabPaddingBottom = r15
            r12.tabPaddingEnd = r15
            r12.tabPaddingTop = r15
            r12.tabPaddingStart = r15
            r0 = 19
            int r15 = r14.getDimensionPixelSize(r0, r15)
            r12.tabPaddingStart = r15
            r15 = 20
            int r0 = r12.tabPaddingTop
            int r15 = r14.getDimensionPixelSize(r15, r0)
            r12.tabPaddingTop = r15
            r15 = 18
            int r0 = r12.tabPaddingEnd
            int r15 = r14.getDimensionPixelSize(r15, r0)
            r12.tabPaddingEnd = r15
            r15 = 17
            int r0 = r12.tabPaddingBottom
            int r15 = r14.getDimensionPixelSize(r15, r0)
            r12.tabPaddingBottom = r15
            r15 = 2132018008(0x7f140358, float:1.967431E38)
            int r15 = r14.getResourceId(r11, r15)
            r12.tabTextAppearance = r15
            int[] r0 = p628nj.C18263b.f40042F
            android.content.res.TypedArray r15 = r8.obtainStyledAttributes(r15, r0)
            int r0 = r15.getDimensionPixelSize(r13, r13)     // Catch:{ all -> 0x01ae }
            float r0 = (float) r0     // Catch:{ all -> 0x01ae }
            r12.tabTextSize = r0     // Catch:{ all -> 0x01ae }
            r0 = 3
            android.content.res.ColorStateList r1 = p507al.C14025c.m21582a(r8, r15, r0)     // Catch:{ all -> 0x01ae }
            r12.tabTextColors = r1     // Catch:{ all -> 0x01ae }
            r15.recycle()
            r15 = 24
            boolean r1 = r14.hasValue(r15)
            if (r1 == 0) goto L_0x011c
            android.content.res.ColorStateList r15 = p507al.C14025c.m21582a(r8, r14, r15)
            r12.tabTextColors = r15
        L_0x011c:
            r15 = 22
            boolean r1 = r14.hasValue(r15)
            if (r1 == 0) goto L_0x0134
            int r15 = r14.getColor(r15, r13)
            android.content.res.ColorStateList r1 = r12.tabTextColors
            int r1 = r1.getDefaultColor()
            android.content.res.ColorStateList r15 = createColorStateList(r1, r15)
            r12.tabTextColors = r15
        L_0x0134:
            android.content.res.ColorStateList r15 = p507al.C14025c.m21582a(r8, r14, r0)
            r12.tabIconTint = r15
            r15 = 4
            int r15 = r14.getInt(r15, r6)
            r0 = 0
            android.graphics.PorterDuff$Mode r15 = com.google.android.material.internal.C15370j.m24964e(r15, r0)
            r12.tabIconTintMode = r15
            r15 = 21
            android.content.res.ColorStateList r15 = p507al.C14025c.m21582a(r8, r14, r15)
            r12.tabRippleColorStateList = r15
            r15 = 6
            r0 = 300(0x12c, float:4.2E-43)
            int r15 = r14.getInt(r15, r0)
            r12.tabIndicatorAnimationDuration = r15
            r15 = 14
            int r15 = r14.getDimensionPixelSize(r15, r6)
            r12.requestedTabMinWidth = r15
            r15 = 13
            int r15 = r14.getDimensionPixelSize(r15, r6)
            r12.requestedTabMaxWidth = r15
            int r15 = r14.getResourceId(r13, r13)
            r12.tabBackgroundResId = r15
            int r15 = r14.getDimensionPixelSize(r10, r13)
            r12.contentInsetStart = r15
            r15 = 15
            int r15 = r14.getInt(r15, r10)
            r12.mode = r15
            r15 = 2
            int r15 = r14.getInt(r15, r13)
            r12.tabGravity = r15
            boolean r15 = r14.getBoolean(r7, r13)
            r12.inlineLabel = r15
            r15 = 25
            boolean r13 = r14.getBoolean(r15, r13)
            r12.unboundedRipple = r13
            r14.recycle()
            android.content.res.Resources r13 = r12.getResources()
            r14 = 2131165543(0x7f070167, float:1.7945306E38)
            int r14 = r13.getDimensionPixelSize(r14)
            float r14 = (float) r14
            r12.tabTextMultiLineSize = r14
            r14 = 2131165541(0x7f070165, float:1.7945302E38)
            int r13 = r13.getDimensionPixelSize(r14)
            r12.scrollableTabMinWidth = r13
            r12.applyModeAndGravity()
            return
        L_0x01ae:
            r13 = move-exception
            r15.recycle()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setupWithViewPager(ViewPager viewPager2, boolean z, boolean z2) {
        ViewPager viewPager3 = this.viewPager;
        if (viewPager3 != null) {
            C15454h hVar = this.pageChangeListener;
            if (hVar != null) {
                viewPager3.removeOnPageChangeListener(hVar);
            }
            C15448b bVar = this.adapterChangeListener;
            if (bVar != null) {
                this.viewPager.removeOnAdapterChangeListener(bVar);
            }
        }
        C15449c cVar = this.currentVpSelectedListener;
        if (cVar != null) {
            removeOnTabSelectedListener(cVar);
            this.currentVpSelectedListener = null;
        }
        if (viewPager2 != null) {
            this.viewPager = viewPager2;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new C15454h(this);
            }
            C15454h hVar2 = this.pageChangeListener;
            hVar2.f34711d = 0;
            hVar2.f34710c = 0;
            viewPager2.addOnPageChangeListener(hVar2);
            C15455i iVar = new C15455i(viewPager2);
            this.currentVpSelectedListener = iVar;
            addOnTabSelectedListener((C15449c) iVar);
            C7717a adapter = viewPager2.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new C15448b();
            }
            C15448b bVar2 = this.adapterChangeListener;
            bVar2.f34691b = z;
            viewPager2.addOnAdapterChangeListener(bVar2);
            setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter((C7717a) null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    public void addTab(C15453g gVar, boolean z) {
        addTab(gVar, this.tabs.size(), z);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void addTab(C15453g gVar, int i, boolean z) {
        if (gVar.f34706h == this) {
            configureTab(gVar, i);
            addTabView(gVar);
            if (z) {
                TabLayout tabLayout = gVar.f34706h;
                if (tabLayout != null) {
                    tabLayout.selectTab(gVar);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C6614a.m12981a(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
