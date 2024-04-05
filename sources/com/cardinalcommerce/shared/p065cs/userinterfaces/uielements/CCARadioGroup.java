package com.cardinalcommerce.shared.p065cs.userinterfaces.uielements;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.etsy.android.R;

/* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCARadioGroup */
public class CCARadioGroup extends LinearLayout {

    /* renamed from: a */
    private int f14057a = -1;

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCARadioGroup$a */
    public class C6318a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ View f14058b;

        public C6318a(View view) {
            this.f14058b = view;
        }

        public final void onClick(View view) {
            CCARadioGroup.this.m12758a();
            CCARadioGroup.this.setSelectedButtonToSelectedState((C6322b) this.f14058b);
        }
    }

    public CCARadioGroup(Context context) {
        super(context);
    }

    public CCARadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CCARadioGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CCARadioGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12758a() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C6322b) {
                setButtonToUnselectedState((C6322b) childAt);
            }
        }
    }

    private void setButtonToUnselectedState(C6322b bVar) {
        bVar.setCCAButtonDrawable(R.drawable.ic_radio_button_unchecked);
    }

    private void setCheckedId(int i) {
        this.f14057a = i;
    }

    /* access modifiers changed from: private */
    public void setSelectedButtonToSelectedState(C6322b bVar) {
        bVar.setCCAButtonDrawable(R.drawable.ic_check_circle);
        setCheckedId(bVar.getId());
    }

    /* renamed from: a */
    public void mo17921a(View view) {
        if (view instanceof C6322b) {
            view.setOnClickListener(new C6318a(view));
        }
        super.addView(view);
    }

    public void addView(View view) {
    }

    public int getCheckedCCARadioButtonId() {
        return this.f14057a;
    }
}
