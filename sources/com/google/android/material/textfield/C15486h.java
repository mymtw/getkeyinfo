package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p629nk.C18268a;

/* renamed from: com.google.android.material.textfield.h */
public final class C15486h extends C15499m {

    /* renamed from: e */
    public final C15487a f34759e = new C15487a();

    /* renamed from: f */
    public final C15489b f34760f = new C15489b();

    /* renamed from: g */
    public final C15490c f34761g = new C15490c(this.f34787a);

    /* renamed from: h */
    public final C15491d f34762h = new C15491d();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    public final C15492e f34763i = new C15492e();

    /* renamed from: j */
    public boolean f34764j = false;

    /* renamed from: k */
    public boolean f34765k = false;

    /* renamed from: l */
    public long f34766l = Long.MAX_VALUE;

    /* renamed from: m */
    public StateListDrawable f34767m;

    /* renamed from: n */
    public MaterialShapeDrawable f34768n;

    /* renamed from: o */
    public AccessibilityManager f34769o;

    /* renamed from: p */
    public ValueAnimator f34770p;

    /* renamed from: q */
    public ValueAnimator f34771q;

    /* renamed from: com.google.android.material.textfield.h$a */
    public class C15487a extends TextWatcherAdapter {

        /* renamed from: com.google.android.material.textfield.h$a$a */
        public class C15488a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AutoCompleteTextView f34773b;

            public C15488a(AutoCompleteTextView autoCompleteTextView) {
                this.f34773b = autoCompleteTextView;
            }

            public final void run() {
                boolean isPopupShowing = this.f34773b.isPopupShowing();
                C15486h.this.mo55110f(isPopupShowing);
                C15486h.this.f34764j = isPopupShowing;
            }
        }

        public C15487a() {
        }

        public final void afterTextChanged(Editable editable) {
            EditText editText = C15486h.this.f34787a.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (C15486h.this.f34769o.isTouchExplorationEnabled()) {
                    if ((autoCompleteTextView.getKeyListener() != null) && !C15486h.this.f34789c.hasFocus()) {
                        autoCompleteTextView.dismissDropDown();
                    }
                }
                autoCompleteTextView.post(new C15488a(autoCompleteTextView));
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    public class C15489b implements View.OnFocusChangeListener {
        public C15489b() {
        }

        public final void onFocusChange(View view, boolean z) {
            C15486h.this.f34787a.setEndIconActivated(z);
            if (!z) {
                C15486h.this.mo55110f(false);
                C15486h.this.f34764j = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    public class C15490c extends TextInputLayout.C15470e {
        public C15490c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            if (!(C15486h.this.f34787a.getEditText().getKeyListener() != null)) {
                bVar.mo18867q(Spinner.class.getName());
            }
            if (bVar.f14759a.isShowingHintText()) {
                bVar.f14759a.setHintText((CharSequence) null);
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            EditText editText = C15486h.this.f34787a.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                boolean z = true;
                if (accessibilityEvent.getEventType() == 1 && C15486h.this.f34769o.isTouchExplorationEnabled()) {
                    if (C15486h.this.f34787a.getEditText().getKeyListener() == null) {
                        z = false;
                    }
                    if (!z) {
                        C15486h.m25079d(C15486h.this, autoCompleteTextView);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    public class C15491d implements TextInputLayout.C15471f {
        public C15491d() {
        }

        /* renamed from: a */
        public final void mo55092a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                C15486h hVar = C15486h.this;
                int boxBackgroundMode = hVar.f34787a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(hVar.f34768n);
                } else if (boxBackgroundMode == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(hVar.f34767m);
                }
                C15486h hVar2 = C15486h.this;
                hVar2.getClass();
                boolean z = false;
                if (!(autoCompleteTextView.getKeyListener() != null)) {
                    int boxBackgroundMode2 = hVar2.f34787a.getBoxBackgroundMode();
                    MaterialShapeDrawable boxBackground = hVar2.f34787a.getBoxBackground();
                    int E = C1993m.m4344E(R.attr.colorControlHighlight, autoCompleteTextView);
                    int[][] iArr = {new int[]{16842919}, new int[0]};
                    if (boxBackgroundMode2 == 2) {
                        int E2 = C1993m.m4344E(R.attr.colorSurface, autoCompleteTextView);
                        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(boxBackground.getShapeAppearanceModel());
                        int R = C1993m.m4357R(0.1f, E, E2);
                        materialShapeDrawable.setFillColor(new ColorStateList(iArr, new int[]{R, 0}));
                        materialShapeDrawable.setTint(E2);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{R, E2});
                        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(boxBackground.getShapeAppearanceModel());
                        materialShapeDrawable2.setTint(-1);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable, materialShapeDrawable2), boxBackground});
                        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                        C2364y.C2368d.m5227q(autoCompleteTextView, layerDrawable);
                    } else if (boxBackgroundMode2 == 1) {
                        int boxBackgroundColor = hVar2.f34787a.getBoxBackgroundColor();
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{C1993m.m4357R(0.1f, E, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground);
                        WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                        C2364y.C2368d.m5227q(autoCompleteTextView, rippleDrawable);
                    }
                }
                C15486h hVar3 = C15486h.this;
                hVar3.getClass();
                autoCompleteTextView.setOnTouchListener(new C15496j(hVar3, autoCompleteTextView));
                autoCompleteTextView.setOnFocusChangeListener(hVar3.f34760f);
                autoCompleteTextView.setOnDismissListener(new C15497k(hVar3));
                autoCompleteTextView.setThreshold(0);
                autoCompleteTextView.removeTextChangedListener(C15486h.this.f34759e);
                autoCompleteTextView.addTextChangedListener(C15486h.this.f34759e);
                textInputLayout.setEndIconCheckable(true);
                textInputLayout.setErrorIconDrawable((Drawable) null);
                if (autoCompleteTextView.getKeyListener() != null) {
                    z = true;
                }
                if (!z) {
                    CheckableImageButton checkableImageButton = C15486h.this.f34789c;
                    WeakHashMap<View, C2330s0> weakHashMap3 = C2364y.f5646a;
                    C2364y.C2368d.m5229s(checkableImageButton, 2);
                }
                textInputLayout.setTextInputAccessibilityDelegate(C15486h.this.f34761g);
                textInputLayout.setEndIconVisible(true);
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* renamed from: com.google.android.material.textfield.h$e */
    public class C15492e implements TextInputLayout.C15472g {

        /* renamed from: com.google.android.material.textfield.h$e$a */
        public class C15493a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AutoCompleteTextView f34779b;

            public C15493a(AutoCompleteTextView autoCompleteTextView) {
                this.f34779b = autoCompleteTextView;
            }

            public final void run() {
                this.f34779b.removeTextChangedListener(C15486h.this.f34759e);
            }
        }

        public C15492e() {
        }

        /* renamed from: a */
        public final void mo55093a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new C15493a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C15486h.this.f34760f) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$f */
    public class C15494f implements View.OnClickListener {
        public C15494f() {
        }

        public final void onClick(View view) {
            C15486h.m25079d(C15486h.this, (AutoCompleteTextView) C15486h.this.f34787a.getEditText());
        }
    }

    public C15486h(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    /* renamed from: d */
    public static void m25079d(C15486h hVar, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            hVar.getClass();
            return;
        }
        hVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - hVar.f34766l;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            hVar.f34764j = false;
        }
        if (!hVar.f34764j) {
            hVar.mo55110f(!hVar.f34765k);
            if (hVar.f34765k) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        hVar.f34764j = false;
    }

    /* renamed from: a */
    public final void mo55094a() {
        float dimensionPixelOffset = (float) this.f34788b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f34788b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f34788b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        MaterialShapeDrawable e = mo55109e(dimensionPixelOffset3, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2);
        MaterialShapeDrawable e2 = mo55109e(dimensionPixelOffset3, 0.0f, dimensionPixelOffset, dimensionPixelOffset2);
        this.f34768n = e;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f34767m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, e);
        this.f34767m.addState(new int[0], e2);
        int i = this.f34790d;
        if (i == 0) {
            i = R.drawable.mtrl_dropdown_arrow;
        }
        this.f34787a.setEndIconDrawable(i);
        TextInputLayout textInputLayout = this.f34787a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f34787a.setEndIconOnClickListener(new C15494f());
        this.f34787a.addOnEditTextAttachedListener(this.f34762h);
        this.f34787a.addOnEndIconChangedListener(this.f34763i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        LinearInterpolator linearInterpolator = C18268a.f40091a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new C15495i(this));
        this.f34771q = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new C15495i(this));
        this.f34770p = ofFloat2;
        ofFloat2.addListener(new C15498l(this));
        this.f34769o = (AccessibilityManager) this.f34788b.getSystemService("accessibility");
    }

    /* renamed from: b */
    public final boolean mo55108b(int i) {
        return i != 0;
    }

    /* renamed from: e */
    public final MaterialShapeDrawable mo55109e(int i, float f, float f2, float f3) {
        C15401a.C15402a aVar = new C15401a.C15402a();
        aVar.mo54620f(f);
        aVar.mo54621g(f);
        aVar.mo54618d(f2);
        aVar.mo54619e(f2);
        C15401a aVar2 = new C15401a(aVar);
        MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(this.f34788b, f3);
        createWithElevationOverlay.setShapeAppearanceModel(aVar2);
        createWithElevationOverlay.setPadding(0, i, 0, i);
        return createWithElevationOverlay;
    }

    /* renamed from: f */
    public final void mo55110f(boolean z) {
        if (this.f34765k != z) {
            this.f34765k = z;
            this.f34771q.cancel();
            this.f34770p.start();
        }
    }
}
