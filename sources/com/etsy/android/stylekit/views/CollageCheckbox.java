package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2273a;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p088e1.C6689b;
import p388lb.C13006a;

public final class CollageCheckbox extends ConstraintLayout implements Checkable {
    public static final int $stable = 8;
    public static final C9026b Companion = new C9026b();
    public static final int DIRECTION_END = 1;
    public static final int DIRECTION_START = 0;
    private CollageCheckableImageView checkbox;
    private final CollageCheckableImageView checkboxEnd;
    private final CollageCheckableImageView checkboxStart;
    private int direction;
    private final TextView helperTextView;
    private boolean isChecked;
    private boolean isSmall;
    private final TextView metaTextView;
    private C9027c onCheckedChangeListener;
    private final TextView textView;

    /* renamed from: com.etsy.android.stylekit.views.CollageCheckbox$a */
    public static final class C9025a extends C2273a {

        /* renamed from: a */
        public final /* synthetic */ CollageCheckbox f19898a;

        public C9025a(CollageCheckbox collageCheckbox) {
            this.f19898a = collageCheckbox;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C19383o.m32797g(view, "host");
            C19383o.m32797g(accessibilityEvent, "event");
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(this.f19898a.isChecked());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            C19383o.m32797g(view, "host");
            C19383o.m32797g(bVar, "info");
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.mo18865o(this.f19898a.isEnabled());
            bVar.mo18866p(this.f19898a.isChecked());
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageCheckbox$b */
    public static final class C9026b {
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageCheckbox$c */
    public interface C9027c {
        /* renamed from: a */
        void mo30790a(boolean z, CollageCheckbox collageCheckbox);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageCheckbox(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageCheckbox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageCheckbox(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void invokeOnCheckedChangeListener(CollageCheckbox collageCheckbox) {
        C9027c cVar = this.onCheckedChangeListener;
        if (cVar != null) {
            cVar.mo30790a(collageCheckbox.isChecked, collageCheckbox);
        }
    }

    private final void setOnCheckedListener() {
        setOnClickListener(new C9052c(this, 0));
    }

    /* access modifiers changed from: private */
    /* renamed from: setOnCheckedListener$lambda-1  reason: not valid java name */
    public static final void m34882setOnCheckedListener$lambda1(CollageCheckbox collageCheckbox, View view) {
        C19383o.m32797g(collageCheckbox, "this$0");
        collageCheckbox.setChecked(!collageCheckbox.isChecked);
        collageCheckbox.invokeOnCheckedChangeListener(collageCheckbox);
    }

    private final void updateDirection(int i) {
        if (i == 0) {
            this.checkboxStart.setVisibility(0);
            this.checkboxEnd.setVisibility(8);
            this.checkbox = this.checkboxStart;
        } else if (i == 1) {
            this.checkboxEnd.setVisibility(0);
            this.checkboxStart.setVisibility(8);
            this.metaTextView.setVisibility(8);
            this.checkbox = this.checkboxEnd;
        } else {
            throw new IllegalArgumentException("Direction must be one of DIRECTION_START or DIRECTION_END");
        }
    }

    public final int getDirection() {
        return this.direction;
    }

    public final String getHelperText() {
        return this.helperTextView.getText().toString();
    }

    public final String getMetaText() {
        return this.metaTextView.getText().toString();
    }

    public final String getText() {
        return this.textView.getText().toString();
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public final boolean isSmall() {
        return this.isSmall;
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
        this.checkbox.setChecked(z);
    }

    public final void setDirection(int i) {
        updateDirection(i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        setFocusable(z);
        this.textView.setEnabled(z);
        this.metaTextView.setEnabled(z);
        this.helperTextView.setEnabled(z);
        this.checkbox.setEnabled(z);
    }

    public final void setHelperText(String str) {
        this.helperTextView.setText(str);
        TextView textView2 = this.helperTextView;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public final void setMetaText(String str) {
        this.metaTextView.setText(str);
        TextView textView2 = this.metaTextView;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public final void setOnCheckedChangeListener(C9027c cVar) {
        C19383o.m32797g(cVar, "onCheckedChangeListener");
        this.onCheckedChangeListener = cVar;
    }

    public final void setSmall(boolean z) {
        setSmallText(z);
    }

    public final void setSmallText(boolean z) {
        this.checkbox.setSmall(z);
        float dimensionPixelSize = (float) (z ? getResources().getDimensionPixelSize(R.dimen.clg_text_size_small) : getResources().getDimensionPixelSize(R.dimen.clg_text_size_default));
        this.textView.setTextSize(0, dimensionPixelSize);
        this.metaTextView.setTextSize(0, dimensionPixelSize);
    }

    public final void setText(String str) {
        this.textView.setText(str);
    }

    public void toggle() {
        setChecked(!this.isChecked);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageCheckbox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        View inflate = LayoutInflater.from(context).inflate(R.layout.clg_checkbox, this, true);
        View findViewById = inflate.findViewById(R.id.clg_checkbox_text);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.clg_checkbox_text)");
        this.textView = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.clg_checkbox_helper_text);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.clg_checkbox_helper_text)");
        this.helperTextView = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.clg_checkbox_meta_text);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.clg_checkbox_meta_text)");
        this.metaTextView = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.clg_checkbox_selector);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.clg_checkbox_selector)");
        CollageCheckableImageView collageCheckableImageView = (CollageCheckableImageView) findViewById4;
        this.checkboxStart = collageCheckableImageView;
        View findViewById5 = inflate.findViewById(R.id.clg_checkbox_selector_end);
        C19383o.m32796f(findViewById5, "view.findViewById(R.id.clg_checkbox_selector_end)");
        this.checkboxEnd = (CollageCheckableImageView) findViewById5;
        this.checkbox = collageCheckableImageView;
        setMinHeight(getResources().getDimensionPixelSize(R.dimen.tap_target_size_sp));
        setBackgroundResource(R.drawable.clg_touch_feedback);
        setDirection(0);
        setSmall(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28640g, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…le.CollageCheckbox, 0, 0)");
            String string = obtainStyledAttributes.getString(6);
            String string2 = obtainStyledAttributes.getString(3);
            String string3 = obtainStyledAttributes.getString(4);
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            boolean z2 = obtainStyledAttributes.getBoolean(0, false);
            boolean z3 = obtainStyledAttributes.getBoolean(5, false);
            int i2 = obtainStyledAttributes.getInt(1, 0);
            setSmall(z3);
            setDirection(i2);
            this.isChecked = z2;
            setChecked(z2);
            setText(string);
            setHelperText(string2);
            setMetaText(string3);
            setEnabled(z);
            setSmallText(z3);
            updateDirection(i2);
            obtainStyledAttributes.recycle();
        }
        setOnCheckedListener();
        C2364y.m5201p(this, new C9025a(this));
    }

    public final void setText(int i) {
        this.textView.setText(i);
    }
}
