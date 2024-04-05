package com.etsy.android.uikit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.C0326j;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.etsy.android.R;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import com.etsy.android.stylekit.views.CollageTabLayout;
import com.etsy.android.uikit.behavior.EtsyAppBarBehavior;
import com.etsy.android.uikit.util.AnimationUtil;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import p186n2.C7377b;
import p186n2.C7426q;
import p186n2.C7429r;

public class AppBarHelper implements AdapterView.OnItemSelectedListener {
    private static int COLLAPSE_ANIM_DURATION = 0;
    private static int EXPAND_ANIM_DURATION = 300;
    private View anotherCustomViewBelow;
    private View customTitleView;
    private int defaultStatusBarColor;
    private int defaultToolbarHeight;
    private ActionBar mAb;
    private AppBarLayout mAppBarLayout;
    private Spinner mNavSpinner;
    private C11820a mNavigationListener;
    private CollageTabLayout mTabLayout;
    private int mTabMode = 1;
    private Toolbar mToolbar;
    private int originalToolbarContentInsetLeft = -1;
    private int originalToolbarContentInsetRight = -1;
    private int originalToolbarContentInsetStartWithNavigation = -1;
    private TextView titleTextView;

    /* renamed from: com.etsy.android.uikit.AppBarHelper$a */
    public interface C11820a {
        /* renamed from: a */
        boolean mo38215a();
    }

    private void addView(View view, boolean z) {
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout == null) {
            return;
        }
        if (z) {
            animateExpand(view);
        } else {
            appBarLayout.addView(view);
        }
    }

    private void animateCollapse(View view) {
        C7429r rVar = new C7429r();
        C7377b bVar = new C7377b();
        bVar.f16565g.add(this.mAppBarLayout);
        bVar.f16562d = (long) COLLAPSE_ANIM_DURATION;
        rVar.mo19770F(new FastOutSlowInInterpolator());
        rVar.mo19802N(bVar);
        C7426q.m14342a(this.mAppBarLayout, rVar);
        this.mAppBarLayout.removeView(view);
    }

    private void animateExpand(View view) {
        C7429r rVar = new C7429r();
        C7377b bVar = new C7377b();
        bVar.f16565g.add(this.mAppBarLayout);
        bVar.f16562d = (long) EXPAND_ANIM_DURATION;
        rVar.mo19770F(new FastOutSlowInInterpolator());
        rVar.mo19802N(bVar);
        C7426q.m14342a(this.mAppBarLayout, rVar);
        this.mAppBarLayout.addView(view);
    }

    private void createSpinnerInAppBar(SpinnerAdapter spinnerAdapter) {
        Spinner spinner = (Spinner) ((LayoutInflater) getThemedContext().getSystemService("layout_inflater")).inflate(R.layout.app_bar_spinner, (ViewGroup) null);
        this.mNavSpinner = spinner;
        spinner.setAdapter(spinnerAdapter);
        this.mNavSpinner.setOnItemSelectedListener(this);
        showCustomView(this.mNavSpinner);
    }

    private void removeView(View view, boolean z) {
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null && appBarLayout.indexOfChild(view) >= 0) {
            if (z) {
                animateCollapse(view);
            } else {
                this.mAppBarLayout.removeView(view);
            }
        }
    }

    private void setTitleAccessibilityHeading(CharSequence charSequence) {
        TextView textView = this.titleTextView;
        if (textView == null) {
            for (int i = 0; i < this.mToolbar.getChildCount(); i++) {
                View childAt = this.mToolbar.getChildAt(i);
                if (childAt instanceof TextView) {
                    TextView textView2 = (TextView) childAt;
                    if (TextUtils.equals(textView2.getText(), charSequence)) {
                        ViewsExtensionsKt.m17424c(textView2, true);
                        this.titleTextView = textView2;
                        return;
                    }
                }
            }
        } else if (!C2364y.m5194i(textView)) {
            ViewsExtensionsKt.m17424c(this.titleTextView, true);
        }
    }

    private void setupDefaults() {
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            actionBar.mo1194w();
            this.mAb.mo1190s(true);
            this.mAb.mo1192u(true);
            this.mAb.mo1191t(false);
            setTitle((CharSequence) "");
        }
    }

    public void addExtraUpPadding(Activity activity) {
        ActionBar actionBar = this.mAb;
        if (actionBar != null && actionBar.mo1177f() != 1 && this.mAb.mo1175d() == null) {
            ImageView imageView = (ImageView) activity.findViewById(16908332);
            if (imageView == null) {
                imageView = (ImageView) activity.findViewById(R.id.home);
            }
            if (imageView != null) {
                imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight() + activity.getResources().getDimensionPixelSize(R.dimen.actionbar_dropdown_offset), imageView.getPaddingBottom());
            }
        }
    }

    public CollageTabLayout addTabLayout() {
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout == null) {
            return null;
        }
        CollageTabLayout collageTabLayout = this.mTabLayout;
        if (collageTabLayout != null) {
            collageTabLayout.removeAllTabs();
            this.mTabLayout.setTabGravity(0);
            this.mTabLayout.clearOnTabSelectedListeners();
            return this.mTabLayout;
        }
        CollageTabLayout collageTabLayout2 = (CollageTabLayout) LayoutInflater.from(appBarLayout.getContext()).inflate(R.layout.toolbar_tabs_layout, this.mAppBarLayout, false);
        this.mTabLayout = collageTabLayout2;
        collageTabLayout2.setTabGravity(0);
        this.mTabLayout.setTabMode(this.mTabMode);
        CollageTabLayout collageTabLayout3 = this.mTabLayout;
        AppBarLayout appBarLayout2 = this.mAppBarLayout;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        addView(collageTabLayout3, C2364y.C2371g.m5246c(appBarLayout2));
        ((AppBarLayout.LayoutParams) this.mAppBarLayout.findViewById(R.id.app_bar_toolbar).getLayoutParams()).setScrollFlags(5);
        return this.mTabLayout;
    }

    public void addViewBelowAppBar(int i, boolean z) {
        if (this.mAppBarLayout != null) {
            removeViewBelowAppBar(false);
            View inflate = LayoutInflater.from(this.mAppBarLayout.getContext()).inflate(i, this.mAppBarLayout, false);
            this.anotherCustomViewBelow = inflate;
            addView(inflate, z);
        }
    }

    public void cancelAnimations() {
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            View[] viewArr = {appBarLayout};
            for (int i = 0; i < 1; i++) {
                View view = viewArr[i];
                if (view != null) {
                    view.animate().setListener((Animator.AnimatorListener) null);
                    view.animate().setUpdateListener((ValueAnimator.AnimatorUpdateListener) null);
                    view.animate().cancel();
                }
            }
        }
    }

    public void changeStatusBarColor(int i, Activity activity) {
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
    }

    public void changeToolbarBackgroundColor(int i) {
        this.mToolbar.setBackgroundColor(i);
    }

    public void fadeInAppBar() {
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            AnimationUtil.m19606b(500, appBarLayout);
        }
    }

    public void fadeOutAppBar(AnimatorListenerAdapter animatorListenerAdapter) {
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            appBarLayout.animate().cancel();
            appBarLayout.setAlpha(1.0f);
            appBarLayout.animate().setDuration((long) 500).alpha(0.0f).setListener(animatorListenerAdapter).start();
        }
    }

    public AppBarLayout getAppBarLayout() {
        return this.mAppBarLayout;
    }

    public View getCustomTitleView() {
        return this.customTitleView;
    }

    public int getDefaultStatusBarColor() {
        return this.defaultStatusBarColor;
    }

    public int getStatusBarHeight(Activity activity) {
        Toolbar toolbar = this.mToolbar;
        return (toolbar == null || toolbar.getRootWindowInsets() == null) ? C8914m.m17344b(activity.getResources()) : this.mToolbar.getRootWindowInsets().getSystemWindowInsetTop();
    }

    public CollageTabLayout getTabLayout() {
        if (this.mTabLayout == null) {
            this.mTabLayout = addTabLayout();
        }
        return this.mTabLayout;
    }

    public Context getThemedContext() {
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            return actionBar.mo1178g();
        }
        return null;
    }

    public Toolbar getToolbar() {
        return this.mToolbar;
    }

    public int getToolbarHeight() {
        return this.mToolbar.getHeight();
    }

    public void hideAppBar() {
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            actionBar.mo1179h();
        }
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            appBarLayout.setVisibility(8);
        }
    }

    public void hideTitle() {
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            actionBar.mo1193v(false);
        }
    }

    public void init(AppCompatActivity appCompatActivity) {
        Toolbar toolbar;
        if (appCompatActivity != null) {
            this.mAppBarLayout = (AppBarLayout) appCompatActivity.findViewById(R.id.app_bar_layout);
            this.mToolbar = (Toolbar) appCompatActivity.findViewById(R.id.app_bar_toolbar);
            this.mTabLayout = (CollageTabLayout) appCompatActivity.findViewById(R.id.app_bar_tablayout);
            Toolbar toolbar2 = this.mToolbar;
            if (toolbar2 != null) {
                this.defaultToolbarHeight = toolbar2.getLayoutParams().height;
            }
            AppBarLayout appBarLayout = this.mAppBarLayout;
            if (appBarLayout == null || (toolbar = this.mToolbar) == null) {
                boolean z = true;
                boolean z2 = appBarLayout == null;
                if (this.mToolbar != null) {
                    z = false;
                }
                if (z2 != z) {
                    IllegalStateException illegalStateException = new IllegalStateException("Activities using app bar must include both AppBarLayout and Toolbar (include app_bar.xml");
                    if (C0326j.m869n(BuildTarget.Companion)) {
                        throw illegalStateException;
                    }
                } else if (this.mAb == null) {
                    this.mAb = appCompatActivity.getSupportActionBar();
                    setupDefaults();
                }
            } else {
                appCompatActivity.setSupportActionBar(toolbar);
                this.mAb = appCompatActivity.getSupportActionBar();
                setupDefaults();
            }
            this.defaultStatusBarColor = appCompatActivity.getWindow().getStatusBarColor();
        }
    }

    public boolean isFullScreen(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        if (!C8914m.m17346d(activity)) {
            if (systemUiVisibility == 9472) {
                return true;
            }
        } else if (systemUiVisibility == 1280) {
            return true;
        }
        return false;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C11820a aVar = this.mNavigationListener;
        if (aVar != null) {
            aVar.mo38215a();
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeCustomTitleView() {
        View view;
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null && (view = this.customTitleView) != null) {
            toolbar.removeView(view);
            this.customTitleView = null;
        }
    }

    public void removeCustomView() {
        int i;
        ActionBar actionBar = this.mAb;
        if (actionBar != null && actionBar.mo1175d() != null) {
            this.mAb.mo1187p((View) null);
            Toolbar toolbar = this.mToolbar;
            if (toolbar != null && (i = this.originalToolbarContentInsetLeft) != -1) {
                toolbar.setContentInsetsAbsolute(i, this.originalToolbarContentInsetRight);
                this.mToolbar.setContentInsetStartWithNavigation(this.originalToolbarContentInsetStartWithNavigation);
            }
        }
    }

    public void removeElevation() {
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            appBarLayout.setElevation(0.0f);
        }
    }

    public void removeListNavigation() {
        if (this.mAb != null) {
            Spinner spinner = this.mNavSpinner;
            if (spinner != null) {
                spinner.setVisibility(8);
            }
            this.mNavigationListener = null;
        }
    }

    public void removeTabLayout() {
        CollageTabLayout collageTabLayout = this.mTabLayout;
        if (collageTabLayout != null) {
            collageTabLayout.clearOnTabSelectedListeners();
            removeView(this.mTabLayout, true);
            this.mTabLayout = null;
        }
        ((AppBarLayout.LayoutParams) this.mAppBarLayout.findViewById(R.id.app_bar_toolbar).getLayoutParams()).setScrollFlags(0);
    }

    public void removeViewBelowAppBar(View view, boolean z) {
        if (view != null) {
            removeView(view, z);
        }
    }

    public void resetNavigationIcon() {
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            actionBar.mo1196y(0);
        }
    }

    public void resetPosition(CoordinatorLayout coordinatorLayout) {
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof EtsyAppBarBehavior) {
                AppBarLayout appBarLayout2 = this.mAppBarLayout;
                behavior.onNestedFling(coordinatorLayout, appBarLayout2, (View) null, 0.0f, (float) (-appBarLayout2.getHeight()), true);
            }
        }
    }

    public void resetStatusBarColor(Activity activity) {
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        if (isFullScreen(activity)) {
            window.setStatusBarColor(0);
        } else {
            window.setStatusBarColor(this.defaultStatusBarColor);
        }
    }

    public void resetToolbarColor() {
        this.mToolbar.setBackground((Drawable) null);
    }

    public void restoreElevation() {
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            appBarLayout.setElevation((float) appBarLayout.getContext().getResources().getDimensionPixelSize(R.dimen.app_bar_elevation));
        }
    }

    public View setCustomTitleView(int i) {
        if (this.mToolbar == null) {
            return null;
        }
        setTitle((CharSequence) null);
        View inflate = LayoutInflater.from(this.mToolbar.getContext()).inflate(i, this.mToolbar, false);
        this.customTitleView = inflate;
        this.mToolbar.addView(inflate);
        ViewGroup.LayoutParams layoutParams = this.mToolbar.getLayoutParams();
        layoutParams.height = -2;
        this.mToolbar.setLayoutParams(layoutParams);
        return this.customTitleView;
    }

    public void setHomeAsUpEnabled(boolean z) {
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            actionBar.mo1190s(z);
            this.mAb.mo1192u(z);
            this.mAb.mo1164A(z);
        }
    }

    public void setIcon(int i) {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setLogo(i);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(getThemedContext().getDrawable(i));
    }

    public void setNavigationIconContentDescription(int i) {
        setNavigationIconContentDescription((CharSequence) getThemedContext().getString(i));
    }

    public void setSelectedNavigationItem(int i) {
        Spinner spinner;
        if (this.mAb != null && (spinner = this.mNavSpinner) != null) {
            spinner.setSelection(i);
        }
    }

    public void setTabMode(int i) {
        this.mTabMode = i;
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, (CharSequence) null);
    }

    public void setToolbarScrollFlags(int i) {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            if (layoutParams instanceof AppBarLayout.LayoutParams) {
                ((AppBarLayout.LayoutParams) layoutParams).setScrollFlags(i);
            }
        }
    }

    public void setupListNavigation(SpinnerAdapter spinnerAdapter, C11820a aVar) {
        if (this.mAb != null) {
            hideTitle();
            createSpinnerInAppBar(spinnerAdapter);
            this.mNavigationListener = aVar;
        }
    }

    public void showAppBar() {
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            actionBar.mo1170G();
        }
        AppBarLayout appBarLayout = this.mAppBarLayout;
        if (appBarLayout != null) {
            appBarLayout.setAlpha(1.0f);
            this.mAppBarLayout.setVisibility(0);
        }
    }

    public void showCustomView(View view, ActionBar.LayoutParams layoutParams) {
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            actionBar.mo1191t(true);
            if (layoutParams != null) {
                this.mAb.mo1188q(view, layoutParams);
            } else {
                this.mAb.mo1187p(view);
            }
            Toolbar toolbar = (Toolbar) view.getParent();
            if (this.originalToolbarContentInsetLeft == -1) {
                this.originalToolbarContentInsetLeft = toolbar.getContentInsetLeft();
                this.originalToolbarContentInsetRight = toolbar.getContentInsetRight();
                this.originalToolbarContentInsetStartWithNavigation = toolbar.getContentInsetStartWithNavigation();
            }
            toolbar.setContentInsetsAbsolute(0, 0);
            toolbar.setContentInsetStartWithNavigation(0);
        }
    }

    public void updateToolbarHeight(boolean z, int i) {
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.mToolbar.getLayoutParams();
        if (z) {
            this.mToolbar.setFitsSystemWindows(true);
            this.mAppBarLayout.setFitsSystemWindows(true);
            layoutParams.height = this.defaultToolbarHeight + i;
        }
        this.mToolbar.setLayoutParams(layoutParams);
    }

    public void removeViewBelowAppBar(boolean z) {
        View view = this.anotherCustomViewBelow;
        if (view != null) {
            removeView(view, z);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setNavigationIcon(drawable);
            return;
        }
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            actionBar.mo1197z(drawable);
        }
    }

    public void setNavigationIconContentDescription(CharSequence charSequence) {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setNavigationContentDescription(charSequence);
            return;
        }
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            actionBar.mo1195x(charSequence);
        }
    }

    public void setTitle(int i) {
        setTitle((CharSequence) getThemedContext().getString(i));
    }

    public void setIcon(Drawable drawable) {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setLogo(drawable);
        }
    }

    public void setTitle(CharSequence charSequence, int i) {
        setTitle(charSequence, (CharSequence) getThemedContext().getString(i));
    }

    public void setTitle(int i, int i2) {
        setTitle((CharSequence) getThemedContext().getString(i), (CharSequence) getThemedContext().getString(i2));
    }

    public void setTitle(int i, CharSequence charSequence) {
        setTitle((CharSequence) getThemedContext().getString(i), charSequence);
    }

    public void addViewBelowAppBar(View view, boolean z) {
        if (this.mAppBarLayout != null) {
            removeViewBelowAppBar(false);
            this.anotherCustomViewBelow = view;
            addView(view, z);
        }
    }

    public void setTitle(CharSequence charSequence, CharSequence charSequence2) {
        ActionBar actionBar = this.mAb;
        if (actionBar != null) {
            actionBar.mo1193v(true);
            if (TextUtils.isEmpty(charSequence)) {
                this.mAb.mo1168E("");
                return;
            }
            SpannableString spannableString = new SpannableString(charSequence.toString());
            spannableString.setSpan(new StyleKitSpan.BoldSpan(getThemedContext()), 0, charSequence.length(), 0);
            this.mAb.mo1168E(spannableString);
            this.mAb.mo1167D(charSequence2);
            removeCustomTitleView();
            setTitleAccessibilityHeading(charSequence);
        }
    }

    public void setCustomTitleView(View view) {
        if (this.mToolbar != null) {
            setTitle((CharSequence) null);
            this.mToolbar.addView(view, 0);
            this.customTitleView = view;
        }
    }

    public void showCustomView(View view) {
        showCustomView(view, (ActionBar.LayoutParams) null);
    }
}
