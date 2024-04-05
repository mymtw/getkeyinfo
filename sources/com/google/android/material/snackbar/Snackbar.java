package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.etsy.android.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: r */
    public static final int[] f34669r = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: q */
    public final AccessibilityManager f34670q;

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public Snackbar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f34670q = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: h */
    public static Snackbar m25028h(View view, String str, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                    viewGroup2 = (ViewGroup) view;
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f34669r);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            boolean z = true;
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId == -1 || resourceId2 == -1) {
                z = false;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(z ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, viewGroup, false);
            Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.f34654c.getChildAt(0)).getMessageView().setText(str);
            snackbar.f34656e = i;
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: a */
    public final void mo54733a() {
        mo54734b(3);
    }

    /* renamed from: g */
    public final int mo54761g() {
        int i = this.f34656e;
        if (i == -2) {
            return -2;
        }
        return Build.VERSION.SDK_INT >= 29 ? this.f34670q.getRecommendedTimeoutMillis(i, 3) : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54762i() {
        /*
            r7 = this;
            com.google.android.material.snackbar.i r0 = com.google.android.material.snackbar.C15441i.m25034b()
            int r1 = r7.mo54761g()
            com.google.android.material.snackbar.BaseTransientBottomBar$c r2 = r7.f34664m
            java.lang.Object r3 = r0.f34680a
            monitor-enter(r3)
            boolean r4 = r0.mo54779c(r2)     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0023
            com.google.android.material.snackbar.i$c r2 = r0.f34682c     // Catch:{ all -> 0x0074 }
            r2.f34686b = r1     // Catch:{ all -> 0x0074 }
            android.os.Handler r1 = r0.f34681b     // Catch:{ all -> 0x0074 }
            r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0074 }
            com.google.android.material.snackbar.i$c r1 = r0.f34682c     // Catch:{ all -> 0x0074 }
            r0.mo54780d(r1)     // Catch:{ all -> 0x0074 }
            monitor-exit(r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0071
        L_0x0023:
            com.google.android.material.snackbar.i$c r4 = r0.f34683d     // Catch:{ all -> 0x0074 }
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0039
            if (r2 == 0) goto L_0x0035
            java.lang.ref.WeakReference<com.google.android.material.snackbar.i$b> r4 = r4.f34685a     // Catch:{ all -> 0x0074 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0074 }
            if (r4 != r2) goto L_0x0035
            r4 = r5
            goto L_0x0036
        L_0x0035:
            r4 = r6
        L_0x0036:
            if (r4 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r5 = r6
        L_0x003a:
            if (r5 == 0) goto L_0x0041
            com.google.android.material.snackbar.i$c r2 = r0.f34683d     // Catch:{ all -> 0x0074 }
            r2.f34686b = r1     // Catch:{ all -> 0x0074 }
            goto L_0x0048
        L_0x0041:
            com.google.android.material.snackbar.i$c r4 = new com.google.android.material.snackbar.i$c     // Catch:{ all -> 0x0074 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0074 }
            r0.f34683d = r4     // Catch:{ all -> 0x0074 }
        L_0x0048:
            com.google.android.material.snackbar.i$c r1 = r0.f34682c     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0055
            r2 = 4
            boolean r1 = r0.mo54778a(r1, r2)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0055
            monitor-exit(r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0071
        L_0x0055:
            r1 = 0
            r0.f34682c = r1     // Catch:{ all -> 0x0074 }
            com.google.android.material.snackbar.i$c r2 = r0.f34683d     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x0070
            r0.f34682c = r2     // Catch:{ all -> 0x0074 }
            r0.f34683d = r1     // Catch:{ all -> 0x0074 }
            java.lang.ref.WeakReference<com.google.android.material.snackbar.i$b> r2 = r2.f34685a     // Catch:{ all -> 0x0074 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0074 }
            com.google.android.material.snackbar.i$b r2 = (com.google.android.material.snackbar.C15441i.C15443b) r2     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x006e
            r2.mo54759a()     // Catch:{ all -> 0x0074 }
            goto L_0x0070
        L_0x006e:
            r0.f34682c = r1     // Catch:{ all -> 0x0074 }
        L_0x0070:
            monitor-exit(r3)     // Catch:{ all -> 0x0074 }
        L_0x0071:
            return
        L_0x0072:
            monitor-exit(r3)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.mo54762i():void");
    }
}
