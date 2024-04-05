package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.C0311f0;
import com.etsy.android.R;
import com.google.android.material.internal.C15367g;
import java.util.Locale;
import p574gl.C17790a;
import p610kp.C18161c;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    private static final int MAX_ITEMS_MEASURED = 15;
    private final AccessibilityManager accessibilityManager;
    /* access modifiers changed from: private */
    public final C0311f0 modalListPopup;
    private final Rect tempRect;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    public class C15464a implements AdapterView.OnItemClickListener {
        public C15464a() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object obj;
            View view2 = null;
            if (i < 0) {
                C0311f0 access$000 = MaterialAutoCompleteTextView.this.modalListPopup;
                obj = !access$000.mo2004b() ? null : access$000.f773d.getSelectedItem();
            } else {
                obj = MaterialAutoCompleteTextView.this.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.this.updateText(obj);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    C0311f0 access$0002 = MaterialAutoCompleteTextView.this.modalListPopup;
                    if (access$0002.mo2004b()) {
                        view2 = access$0002.f773d.getSelectedView();
                    }
                    view = view2;
                    C0311f0 access$0003 = MaterialAutoCompleteTextView.this.modalListPopup;
                    i = !access$0003.mo2004b() ? -1 : access$0003.f773d.getSelectedItemPosition();
                    C0311f0 access$0004 = MaterialAutoCompleteTextView.this.modalListPopup;
                    j = !access$0004.mo2004b() ? Long.MIN_VALUE : access$0004.f773d.getSelectedItemId();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.modalListPopup.f773d, view, i, j);
            }
            MaterialAutoCompleteTextView.this.modalListPopup.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private TextInputLayout findTextInputLayoutAncestor() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int measureContentWidth() {
        ListAdapter adapter = getAdapter();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        int i = 0;
        if (adapter == null || findTextInputLayoutAncestor == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        C0311f0 f0Var = this.modalListPopup;
        int min = Math.min(adapter.getCount(), Math.max(0, !f0Var.mo2004b() ? -1 : f0Var.f773d.getSelectedItemPosition()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, findTextInputLayoutAncestor);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable g = this.modalListPopup.mo3039g();
        if (g != null) {
            g.getPadding(this.tempRect);
            Rect rect = this.tempRect;
            i2 += rect.left + rect.right;
        }
        return findTextInputLayoutAncestor.getEndIconView().getMeasuredWidth() + i2;
    }

    /* access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void updateText(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public CharSequence getHint() {
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        return (findTextInputLayoutAncestor == null || !findTextInputLayoutAncestor.isProvidingHint()) ? super.getHint() : findTextInputLayoutAncestor.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null && findTextInputLayoutAncestor.isProvidingHint() && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.modalListPopup.mo2479m(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 == null || !accessibilityManager2.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.modalListPopup.mo2003a();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C17790a.m29918a(context, attributeSet, i, 0), attributeSet, i);
        this.tempRect = new Rect();
        Context context2 = getContext();
        TypedArray d = C15367g.m24957d(context2, attributeSet, C18161c.f39658A, i, 2132018338, new int[0]);
        if (d.hasValue(0) && d.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        C0311f0 f0Var = new C0311f0(context2);
        this.modalListPopup = f0Var;
        f0Var.f794y = true;
        f0Var.f795z.setFocusable(true);
        f0Var.f785p = this;
        f0Var.f795z.setInputMethodMode(2);
        f0Var.mo2479m(getAdapter());
        f0Var.f786q = new C15464a();
        d.recycle();
    }
}
