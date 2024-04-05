package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2273a;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p088e1.C6689b;
import p114g4.C6865e;
import p388lb.C13006a;

public final class CollageRadioButton extends ConstraintLayout implements Checkable {
    public static final int $stable = 8;
    public static final C9043b Companion = new C9043b();
    public static final int DIRECTION_END = 1;
    public static final int DIRECTION_START = 0;
    private final View bottomDivider;
    private int direction;
    private final TextView helperTextView;
    private boolean isChecked;
    private boolean isSmall;
    private final TextView metaTextView;
    private CollageCheckableImageView radioButton;
    private final CollageCheckableImageView radioButtonEnd;
    private final CollageCheckableImageView radioButtonStart;
    private final TextView textView;

    /* renamed from: com.etsy.android.stylekit.views.CollageRadioButton$a */
    public static final class C9042a extends C2273a {

        /* renamed from: a */
        public final /* synthetic */ CollageRadioButton f19916a;

        public C9042a(CollageRadioButton collageRadioButton) {
            this.f19916a = collageRadioButton;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C19383o.m32797g(view, "host");
            C19383o.m32797g(accessibilityEvent, "event");
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(this.f19916a.isChecked());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            C19383o.m32797g(view, "host");
            C19383o.m32797g(bVar, "info");
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.mo18865o(this.f19916a.isEnabled());
            bVar.mo18866p(this.f19916a.isChecked());
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageRadioButton$b */
    public static final class C9043b {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageRadioButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageRadioButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setOnCheckListener() {
        setOnClickListener(new C6865e(this, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: setOnCheckListener$lambda-1  reason: not valid java name */
    public static final void m34893setOnCheckListener$lambda1(CollageRadioButton collageRadioButton, View view) {
        C19383o.m32797g(collageRadioButton, "this$0");
        collageRadioButton.setChecked(true);
    }

    private final void showTopPadding(boolean z) {
        ((Space) findViewById(R.id.clg_radio_button_top_spacer)).setVisibility(z ? 0 : 8);
    }

    private final void updateDirection(int i) {
        if (i == 0) {
            this.radioButtonStart.setVisibility(0);
            this.radioButtonEnd.setVisibility(8);
            this.radioButton = this.radioButtonStart;
        } else if (i == 1) {
            this.radioButtonEnd.setVisibility(0);
            this.radioButtonStart.setVisibility(8);
            this.metaTextView.setVisibility(8);
            this.radioButton = this.radioButtonEnd;
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
        this.radioButton.setChecked(z);
    }

    public final void setDirection(int i) {
        updateDirection(i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        setFocusable(z);
        this.textView.setEnabled(z);
        this.helperTextView.setEnabled(z);
        this.metaTextView.setEnabled(z);
        this.radioButton.setEnabled(z);
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

    public final void setSmall(boolean z) {
        setSmallText(z);
    }

    public final void setSmallText(boolean z) {
        this.radioButton.setSmall(z);
        float dimensionPixelSize = (float) (z ? getResources().getDimensionPixelSize(R.dimen.clg_text_size_small) : getResources().getDimensionPixelSize(R.dimen.clg_text_size_default));
        this.textView.setTextSize(0, dimensionPixelSize);
        this.metaTextView.setTextSize(0, dimensionPixelSize);
    }

    public final void setText(String str) {
        this.textView.setText(str);
    }

    public final void showBottomDivider(boolean z) {
        showTopPadding(z);
        this.bottomDivider.setVisibility(z ? 0 : 8);
    }

    public void toggle() {
        setChecked(!this.isChecked);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        View inflate = LayoutInflater.from(context).inflate(R.layout.clg_radio_button, this, true);
        View findViewById = inflate.findViewById(R.id.clg_radio_button_text);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.clg_radio_button_text)");
        this.textView = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.clg_radio_button_helper_text);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.c…radio_button_helper_text)");
        this.helperTextView = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.clg_radio_button_meta_text);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.clg_radio_button_meta_text)");
        this.metaTextView = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.clg_radio_button_selector);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.clg_radio_button_selector)");
        CollageCheckableImageView collageCheckableImageView = (CollageCheckableImageView) findViewById4;
        this.radioButtonStart = collageCheckableImageView;
        View findViewById5 = inflate.findViewById(R.id.clg_radio_button_selector_end);
        C19383o.m32796f(findViewById5, "view.findViewById(R.id.c…adio_button_selector_end)");
        this.radioButtonEnd = (CollageCheckableImageView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.clg_radio_button_bottom_divider);
        C19383o.m32796f(findViewById6, "view.findViewById(R.id.c…io_button_bottom_divider)");
        this.bottomDivider = findViewById6;
        this.radioButton = collageCheckableImageView;
        setMinHeight(getResources().getDimensionPixelSize(R.dimen.tap_target_size_sp));
        setBackgroundResource(R.drawable.clg_touch_feedback);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28649p, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…CollageRadioButton, 0, 0)");
            String string = obtainStyledAttributes.getString(7);
            String string2 = obtainStyledAttributes.getString(3);
            String string3 = obtainStyledAttributes.getString(4);
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            boolean z2 = obtainStyledAttributes.getBoolean(0, false);
            boolean z3 = obtainStyledAttributes.getBoolean(6, false);
            int i2 = obtainStyledAttributes.getInt(1, 0);
            boolean z4 = obtainStyledAttributes.getBoolean(5, false);
            setSmall(z3);
            this.isChecked = z2;
            setChecked(z2);
            setDirection(i2);
            setText(string);
            setHelperText(string2);
            setMetaText(string3);
            setEnabled(z);
            setSmallText(z3);
            showBottomDivider(z4);
            obtainStyledAttributes.recycle();
        }
        setOnCheckListener();
        C2364y.m5201p(this, new C9042a(this));
    }
}
