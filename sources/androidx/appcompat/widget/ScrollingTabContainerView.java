package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.etsy.android.R;
import p628nj.C18263b;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final int FADE_DURATION = 200;
    private static final String TAG = "ScrollingTabContainerView";
    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    private boolean mAllowCollapse;
    private int mContentHeight;
    public int mMaxTabWidth;
    private int mSelectedTabIndex;
    public int mStackedTabMaxWidth;
    private C0268c mTabClickListener;
    public LinearLayoutCompat mTabLayout;
    public Runnable mTabSelector;
    private Spinner mTabSpinner;
    public final VisibilityAnimListener mVisAnimListener = new VisibilityAnimListener();
    public ViewPropertyAnimator mVisibilityAnim;

    public class VisibilityAnimListener extends AnimatorListenerAdapter {
        private boolean mCanceled = false;
        private int mFinalVisibility;

        public VisibilityAnimListener() {
        }

        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.mCanceled) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                scrollingTabContainerView.mVisibilityAnim = null;
                scrollingTabContainerView.setVisibility(this.mFinalVisibility);
            }
        }

        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.mFinalVisibility = i;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator;
            return this;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$a */
    public class C0266a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f706b;

        public C0266a(View view) {
            this.f706b = view;
        }

        public final void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f706b.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f706b.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.mTabSelector = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    public class C0267b extends BaseAdapter {
        public C0267b() {
        }

        public final int getCount() {
            return ScrollingTabContainerView.this.mTabLayout.getChildCount();
        }

        public final Object getItem(int i) {
            return ((C0269d) ScrollingTabContainerView.this.mTabLayout.getChildAt(i)).f710b;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.createTabView((ActionBar.C0128b) getItem(i), true);
            }
            C0269d dVar = (C0269d) view;
            dVar.f710b = (ActionBar.C0128b) getItem(i);
            dVar.mo2678a();
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    public class C0268c implements View.OnClickListener {
        public C0268c() {
        }

        public final void onClick(View view) {
            ((C0269d) view).f710b.mo1203e();
            int childCount = ScrollingTabContainerView.this.mTabLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.mTabLayout.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$d */
    public class C0269d extends LinearLayout {

        /* renamed from: b */
        public ActionBar.C0128b f710b;

        /* renamed from: c */
        public AppCompatTextView f711c;

        /* renamed from: d */
        public AppCompatImageView f712d;

        /* renamed from: e */
        public View f713e;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
            r7 = r5.getResourceId(0, 0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0269d(android.content.Context r6, androidx.appcompat.app.ActionBar.C0128b r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.ScrollingTabContainerView.this = r5
                r5 = 0
                r0 = 2130968585(0x7f040009, float:1.7545828E38)
                r4.<init>(r6, r5, r0)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 0
                r3 = 16842964(0x10100d4, float:2.3694152E-38)
                r1[r2] = r3
                r4.f710b = r7
                android.content.res.TypedArray r5 = r6.obtainStyledAttributes(r5, r1, r0, r2)
                boolean r7 = r5.hasValue(r2)
                if (r7 == 0) goto L_0x0036
                boolean r7 = r5.hasValue(r2)
                if (r7 == 0) goto L_0x002f
                int r7 = r5.getResourceId(r2, r2)
                if (r7 == 0) goto L_0x002f
                android.graphics.drawable.Drawable r6 = p075d.C6614a.m12981a(r6, r7)
                goto L_0x0033
            L_0x002f:
                android.graphics.drawable.Drawable r6 = r5.getDrawable(r2)
            L_0x0033:
                r4.setBackgroundDrawable(r6)
            L_0x0036:
                r5.recycle()
                if (r8 == 0) goto L_0x0041
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0041:
                r4.mo2678a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ScrollingTabContainerView.C0269d.<init>(androidx.appcompat.widget.ScrollingTabContainerView, android.content.Context, androidx.appcompat.app.ActionBar$b, boolean):void");
        }

        /* renamed from: a */
        public final void mo2678a() {
            ActionBar.C0128b bVar = this.f710b;
            View b = bVar.mo1200b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f713e = b;
                AppCompatTextView appCompatTextView = this.f711c;
                if (appCompatTextView != null) {
                    appCompatTextView.setVisibility(8);
                }
                AppCompatImageView appCompatImageView = this.f712d;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                    this.f712d.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f713e;
            if (view != null) {
                removeView(view);
                this.f713e = null;
            }
            Drawable c = bVar.mo1201c();
            CharSequence d = bVar.mo1202d();
            if (c != null) {
                if (this.f712d == null) {
                    AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView2.setLayoutParams(layoutParams);
                    addView(appCompatImageView2, 0);
                    this.f712d = appCompatImageView2;
                }
                this.f712d.setImageDrawable(c);
                this.f712d.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView3 = this.f712d;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                    this.f712d.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f711c == null) {
                    AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), (AttributeSet) null, R.attr.actionBarTabTextStyle);
                    appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView2.setLayoutParams(layoutParams2);
                    addView(appCompatTextView2);
                    this.f711c = appCompatTextView2;
                }
                this.f711c.setText(d);
                this.f711c.setVisibility(0);
            } else {
                AppCompatTextView appCompatTextView3 = this.f711c;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setVisibility(8);
                    this.f711c.setText((CharSequence) null);
                }
            }
            AppCompatImageView appCompatImageView4 = this.f712d;
            if (appCompatImageView4 != null) {
                appCompatImageView4.setContentDescription(bVar.mo1199a());
            }
            if (!z) {
                charSequence = bVar.mo1199a();
            }
            setTooltipText(charSequence);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.mMaxTabWidth > 0 && getMeasuredWidth() > (i3 = ScrollingTabContainerView.this.mMaxTabWidth)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C18263b.f40067g, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        layoutDimension = !context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs) ? Math.min(layoutDimension, context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height)) : layoutDimension;
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.mStackedTabMaxWidth = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat createTabLayout = createTabLayout();
        this.mTabLayout = createTabLayout;
        addView(createTabLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner createSpinner() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat createTabLayout() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    private boolean isCollapsed() {
        Spinner spinner = this.mTabSpinner;
        return spinner != null && spinner.getParent() == this;
    }

    private void performCollapse() {
        if (!isCollapsed()) {
            if (this.mTabSpinner == null) {
                this.mTabSpinner = createSpinner();
            }
            removeView(this.mTabLayout);
            addView(this.mTabSpinner, new ViewGroup.LayoutParams(-2, -1));
            if (this.mTabSpinner.getAdapter() == null) {
                this.mTabSpinner.setAdapter(new C0267b());
            }
            Runnable runnable = this.mTabSelector;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.mTabSelector = null;
            }
            this.mTabSpinner.setSelection(this.mSelectedTabIndex);
        }
    }

    private boolean performExpand() {
        if (!isCollapsed()) {
            return false;
        }
        removeView(this.mTabSpinner);
        addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.mTabSpinner.getSelectedItemPosition());
        return false;
    }

    public void addTab(ActionBar.C0128b bVar, boolean z) {
        C0269d createTabView = createTabView(bVar, false);
        this.mTabLayout.addView(createTabView, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((C0267b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void animateToTab(int i) {
        View childAt = this.mTabLayout.getChildAt(i);
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0266a aVar = new C0266a(childAt);
        this.mTabSelector = aVar;
        post(aVar);
    }

    public void animateToVisibility(int i) {
        ViewPropertyAnimator viewPropertyAnimator = this.mVisibilityAnim;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimator alpha = animate().alpha(1.0f);
            alpha.setDuration(200);
            alpha.setInterpolator(sAlphaInterpolator);
            alpha.setListener(this.mVisAnimListener.withFinalVisibility(alpha, i));
            alpha.start();
            return;
        }
        ViewPropertyAnimator alpha2 = animate().alpha(0.0f);
        alpha2.setDuration(200);
        alpha2.setInterpolator(sAlphaInterpolator);
        alpha2.setListener(this.mVisAnimListener.withFinalVisibility(alpha2, i));
        alpha2.start();
    }

    public C0269d createTabView(ActionBar.C0128b bVar, boolean z) {
        C0269d dVar = new C0269d(getContext(), bVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.mContentHeight));
        } else {
            dVar.setFocusable(true);
            if (this.mTabClickListener == null) {
                this.mTabClickListener = new C0268c();
            }
            dVar.setOnClickListener(this.mTabClickListener);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C18263b.f40067g, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.mStackedTabMaxWidth = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0269d) view).f710b.mo1203e();
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.mTabLayout.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.mMaxTabWidth = -1;
        } else {
            if (childCount > 2) {
                this.mMaxTabWidth = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.mMaxTabWidth = View.MeasureSpec.getSize(i) / 2;
            }
            this.mMaxTabWidth = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
        if (z2 || !this.mAllowCollapse) {
            z = false;
        }
        if (z) {
            this.mTabLayout.measure(0, makeMeasureSpec);
            if (this.mTabLayout.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                performCollapse();
            } else {
                performExpand();
            }
        } else {
            performExpand();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.mSelectedTabIndex);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeAllTabs() {
        this.mTabLayout.removeAllViews();
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((C0267b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void removeTabAt(int i) {
        this.mTabLayout.removeViewAt(i);
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((C0267b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.mAllowCollapse = z;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.mSelectedTabIndex = i;
        int childCount = this.mTabLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.mTabLayout.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                animateToTab(i);
            }
            i2++;
        }
        Spinner spinner = this.mTabSpinner;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    public void updateTab(int i) {
        ((C0269d) this.mTabLayout.getChildAt(i)).mo2678a();
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((C0267b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void addTab(ActionBar.C0128b bVar, int i, boolean z) {
        C0269d createTabView = createTabView(bVar, false);
        this.mTabLayout.addView(createTabView, i, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((C0267b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }
}
