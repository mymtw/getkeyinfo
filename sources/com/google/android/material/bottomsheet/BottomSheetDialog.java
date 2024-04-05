package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2273a;
import androidx.core.view.C2325q;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p289y0.C8351c;

public class BottomSheetDialog extends AppCompatDialog {
    /* access modifiers changed from: private */
    public BottomSheetBehavior<FrameLayout> behavior;
    /* access modifiers changed from: private */
    public FrameLayout bottomSheet;
    private BottomSheetBehavior.C15221f bottomSheetCallback;
    public boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    public boolean dismissWithAnimation;
    /* access modifiers changed from: private */
    public BottomSheetBehavior.C15221f edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$a */
    public class C15223a implements C2325q {
        public C15223a() {
        }

        /* renamed from: b */
        public final C2348w0 mo1389b(View view, C2348w0 w0Var) {
            if (BottomSheetDialog.this.edgeToEdgeCallback != null) {
                BottomSheetDialog.this.behavior.removeBottomSheetCallback(BottomSheetDialog.this.edgeToEdgeCallback);
            }
            BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
            BottomSheetBehavior.C15221f unused = bottomSheetDialog.edgeToEdgeCallback = new C15228f(bottomSheetDialog.bottomSheet, w0Var);
            BottomSheetDialog.this.behavior.addBottomSheetCallback(BottomSheetDialog.this.edgeToEdgeCallback);
            return w0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$b */
    public class C15224b implements View.OnClickListener {
        public C15224b() {
        }

        public final void onClick(View view) {
            BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
            if (bottomSheetDialog.cancelable && bottomSheetDialog.isShowing() && BottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$c */
    public class C15225c extends C2273a {
        public C15225c() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            if (BottomSheetDialog.this.cancelable) {
                bVar.mo18850a(1048576);
                bVar.f14759a.setDismissable(true);
                return;
            }
            bVar.f14759a.setDismissable(false);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.cancelable) {
                    bottomSheetDialog.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$d */
    public class C15226d implements View.OnTouchListener {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$e */
    public class C15227e extends BottomSheetBehavior.C15221f {
        public C15227e() {
        }

        public final void onSlide(View view, float f) {
        }

        public final void onStateChanged(View view, int i) {
            if (i == 5) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$f */
    public static class C15228f extends BottomSheetBehavior.C15221f {

        /* renamed from: a */
        public final boolean f34159a;

        /* renamed from: b */
        public final boolean f34160b;

        /* renamed from: c */
        public final C2348w0 f34161c;

        public C15228f(FrameLayout frameLayout, C2348w0 w0Var) {
            ColorStateList colorStateList;
            this.f34161c = w0Var;
            boolean z = true;
            boolean z2 = (frameLayout.getSystemUiVisibility() & 8192) != 0;
            this.f34160b = z2;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.from(frameLayout).getMaterialShapeDrawable();
            if (materialShapeDrawable != null) {
                colorStateList = materialShapeDrawable.getFillColor();
            } else {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                colorStateList = C2364y.C2373i.m5260g(frameLayout);
            }
            if (colorStateList != null) {
                int defaultColor = colorStateList.getDefaultColor();
                this.f34159a = (defaultColor == 0 || C8351c.m16662d(defaultColor) <= 0.5d) ? false : z;
            } else if (frameLayout.getBackground() instanceof ColorDrawable) {
                int color = ((ColorDrawable) frameLayout.getBackground()).getColor();
                this.f34159a = (color == 0 || C8351c.m16662d(color) <= 0.5d) ? false : z;
            } else {
                this.f34159a = z2;
            }
        }

        /* renamed from: a */
        public final void mo53235a(View view) {
            if (view.getTop() < this.f34161c.mo8948g()) {
                BottomSheetDialog.setLightStatusBar(view, this.f34159a);
                view.setPadding(view.getPaddingLeft(), this.f34161c.mo8948g() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                BottomSheetDialog.setLightStatusBar(view, this.f34160b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void onSlide(View view, float f) {
            mo53235a(view);
        }

        public final void onStateChanged(View view, int i) {
            mo53235a(view);
        }
    }

    public BottomSheetDialog(Context context) {
        this(context, 0);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(R.id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(frameLayout2);
            this.behavior = from;
            from.addBottomSheetCallback(this.bottomSheetCallback);
            this.behavior.setHideable(this.cancelable);
        }
        return this.container;
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 2132018130;
    }

    public static void setLightStatusBar(View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
    }

    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            FrameLayout frameLayout = this.bottomSheet;
            C15223a aVar = new C15223a();
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2373i.m5274u(frameLayout, aVar);
        }
        this.bottomSheet.removeAllViews();
        if (layoutParams == null) {
            this.bottomSheet.addView(view);
        } else {
            this.bottomSheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new C15224b());
        C2364y.m5201p(this.bottomSheet, new C15225c());
        this.bottomSheet.setOnTouchListener(new C15226d());
        return this.container;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior2 = getBehavior();
        if (!this.dismissWithAnimation || behavior2.getState() == 5) {
            super.cancel();
        } else {
            behavior2.setState(5);
        }
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5) {
            this.behavior.setState(4);
        }
    }

    public void removeDefaultCallback() {
        this.behavior.removeBottomSheetCallback(this.bottomSheetCallback);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setDismissWithAnimation(boolean z) {
        this.dismissWithAnimation = z;
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public BottomSheetDialog(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C15227e();
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public BottomSheetDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C15227e();
        supportRequestWindowFeature(1);
        this.cancelable = z;
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }
}
