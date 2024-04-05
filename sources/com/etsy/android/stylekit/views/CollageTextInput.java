package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.appboy.Constants;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p260v0.C8184a;
import p388lb.C13006a;
import p435rb.C13350a;

public class CollageTextInput extends ConstraintLayout {
    public static final int $stable = 8;
    public static final C9047a Companion = new C9047a();
    private static final int MAX_LINES = 12;
    private static final int MIN_LINES = 3;
    private final TextView button;
    private final TextView counter;
    /* access modifiers changed from: private */
    public boolean counterEnabled;
    private int counterMaxLength;
    private boolean counterOverflowed;
    private TextView.OnEditorActionListener editorActionListener;
    private final TextView error;
    private final TextView helper;
    private final int invalidMaxLength;
    private final TextView label;
    private final int layoutRes;
    private final EditText materialInput;
    private final TextInputLayout materialLayout;
    private final TextView requiredStar;
    private final int[] styleAttrs;
    /* access modifiers changed from: private */
    public TextWatcher textChangeListener;

    /* renamed from: com.etsy.android.stylekit.views.CollageTextInput$a */
    public static final class C9047a {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTextInput(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTextInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageTextInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-1  reason: not valid java name */
    public static final boolean m34900_init_$lambda1(CollageTextInput collageTextInput, TextView textView, int i, KeyEvent keyEvent) {
        C19383o.m32797g(collageTextInput, "this$0");
        TextView.OnEditorActionListener onEditorActionListener = collageTextInput.editorActionListener;
        if (onEditorActionListener != null) {
            return onEditorActionListener.onEditorAction(textView, i, keyEvent);
        }
        return false;
    }

    private final void updateCounter() {
        Editable text = getMaterialInput().getText();
        updateCounter(text != null ? text.length() : 0);
    }

    private final void updateCounterContentDescription(Context context, TextView textView, int i, int i2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.label.getText());
        sb.append(' ');
        sb.append(C13350a.m21016g(context, z ? R.attr.clg_character_counter_overflowed_content_description : R.attr.clg_character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
        textView.setContentDescription(sb.toString());
    }

    private final void updateCounterTextColor() {
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        int d = C13350a.m21013d(context, R.attr.clg_color_text_tertiary);
        Context context2 = getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        int d2 = C13350a.m21013d(context2, R.attr.clg_color_text_error);
        if (!this.counterOverflowed) {
            this.counter.setTextColor(d);
        }
        if (this.counterOverflowed) {
            this.counter.setTextColor(d2);
        }
    }

    public final TextView getButton() {
        return this.button;
    }

    public final Editable getEditable() {
        Editable editableText = getMaterialInput().getEditableText();
        C19383o.m32796f(editableText, "materialInput.editableText");
        return editableText;
    }

    public final CharSequence getErrorText() {
        CharSequence text = this.error.getText();
        C19383o.m32796f(text, "error.text");
        return text;
    }

    public final TextView getLabel() {
        return this.label;
    }

    public int getLayoutRes() {
        return this.layoutRes;
    }

    public EditText getMaterialInput() {
        return this.materialInput;
    }

    public final TextInputLayout getMaterialLayout() {
        return this.materialLayout;
    }

    public int[] getStyleAttrs() {
        return this.styleAttrs;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (r0 = r0.getText()).toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getText() {
        /*
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r1.materialLayout
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L_0x0014
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0016
        L_0x0014:
            java.lang.String r0 = ""
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.stylekit.views.CollageTextInput.getText():java.lang.String");
    }

    public final void setButtonText(String str) {
        if (str == null || C19457k.m33020X0(str)) {
            this.button.setVisibility(8);
            return;
        }
        this.button.setText(str);
        this.button.setVisibility(0);
    }

    public final void setCounterEnabled(boolean z) {
        this.counterEnabled = z;
        if (z) {
            this.counter.setVisibility(0);
            updateCounter();
            return;
        }
        this.counter.setVisibility(8);
    }

    public final void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i <= 0) {
                i = this.invalidMaxLength;
            }
            this.counterMaxLength = i;
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            TextInputLayout textInputLayout = this.materialLayout;
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            textInputLayout.setBoxStrokeColor(C13350a.m21013d(context, R.attr.clg_color_select_outline_focused));
            TextInputLayout textInputLayout2 = this.materialLayout;
            Context context2 = getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            textInputLayout2.setBoxBackgroundColor(C13350a.m21012c(context2, R.color.clg_color_transparent));
            TextView textView = this.label;
            Context context3 = getContext();
            C19383o.m32796f(context3, ResponseConstants.CONTEXT);
            textView.setTextColor(C13350a.m21013d(context3, R.attr.clg_color_text_primary));
            EditText materialInput2 = getMaterialInput();
            Context context4 = getContext();
            C19383o.m32796f(context4, ResponseConstants.CONTEXT);
            materialInput2.setTextColor(C13350a.m21013d(context4, R.attr.clg_color_text_primary));
        } else {
            TextInputLayout textInputLayout3 = this.materialLayout;
            Context context5 = getContext();
            C19383o.m32796f(context5, ResponseConstants.CONTEXT);
            textInputLayout3.setBoxStrokeColor(C13350a.m21013d(context5, R.attr.clg_color_select_outline));
            TextInputLayout textInputLayout4 = this.materialLayout;
            Context context6 = getContext();
            C19383o.m32796f(context6, ResponseConstants.CONTEXT);
            textInputLayout4.setBoxBackgroundColor(C13350a.m21013d(context6, R.attr.clg_color_text_input_disabled_bg));
            TextView textView2 = this.label;
            Context context7 = getContext();
            C19383o.m32796f(context7, ResponseConstants.CONTEXT);
            textView2.setTextColor(C13350a.m21013d(context7, R.attr.clg_color_text_tertiary));
            EditText materialInput3 = getMaterialInput();
            Context context8 = getContext();
            C19383o.m32796f(context8, ResponseConstants.CONTEXT);
            materialInput3.setTextColor(C13350a.m21013d(context8, R.attr.clg_color_text_tertiary));
        }
        this.materialLayout.setEnabled(z);
    }

    public final void setEndIconDrawable(int i) {
        Context context = this.materialLayout.getContext();
        Object obj = C8184a.f17966a;
        setEndIconDrawable(C8184a.C8187c.m16466b(context, i));
    }

    public final void setErrorBackgroundEnabled(boolean z) {
        if (z) {
            TextInputLayout textInputLayout = this.materialLayout;
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            textInputLayout.setBoxStrokeColor(C13350a.m21013d(context, R.attr.clg_color_text_error));
            TextInputLayout textInputLayout2 = this.materialLayout;
            Context context2 = getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            textInputLayout2.setBoxBackgroundColor(C13350a.m21013d(context2, R.attr.clg_color_text_input_error_bg));
            return;
        }
        TextInputLayout textInputLayout3 = this.materialLayout;
        Context context3 = getContext();
        C19383o.m32796f(context3, ResponseConstants.CONTEXT);
        textInputLayout3.setBoxStrokeColor(C13350a.m21013d(context3, R.attr.clg_color_select_outline_focused));
        TextInputLayout textInputLayout4 = this.materialLayout;
        Context context4 = getContext();
        C19383o.m32796f(context4, ResponseConstants.CONTEXT);
        textInputLayout4.setBoxBackgroundColor(C13350a.m21012c(context4, R.color.clg_color_transparent));
    }

    public final void setErrorText(String str) {
        boolean z = true;
        if (!(str == null || C19457k.m33020X0(str))) {
            this.helper.setVisibility(8);
            this.error.setText(str);
            TextView textView = this.error;
            Context context = textView.getContext();
            C19383o.m32796f(context, "error.context");
            textView.setContentDescription(C13350a.m21016g(context, R.attr.clg_error_content_description, str));
            this.error.setVisibility(0);
            setErrorBackgroundEnabled(true);
            return;
        }
        CharSequence text = this.helper.getText();
        if (text != null && !C19457k.m33020X0(text)) {
            z = false;
        }
        if (z) {
            this.helper.setVisibility(8);
        } else {
            this.helper.setVisibility(0);
        }
        this.error.setText(str);
        this.error.setContentDescription((CharSequence) null);
        this.error.setVisibility(8);
        setEnabled(isEnabled());
    }

    public final void setFilters(List<? extends InputFilter> list) {
        if (list == null) {
            getMaterialInput().setFilters(new InputFilter[0]);
            return;
        }
        EditText materialInput2 = getMaterialInput();
        Object[] array = list.toArray(new InputFilter[0]);
        if (array != null) {
            materialInput2.setFilters((InputFilter[]) array);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public void setFocusable(boolean z) {
        getMaterialInput().setFocusable(z);
    }

    public final void setHelperText(String str) {
        this.helper.setText(str);
        CharSequence text = this.helper.getText();
        if (text == null || C19457k.m33020X0(text)) {
            this.helper.setVisibility(8);
        } else {
            this.helper.setVisibility(0);
        }
    }

    public final void setHint(int i) {
        getMaterialInput().setHint(i);
    }

    public final void setImeOptions(int i) {
        getMaterialInput().setImeOptions(i);
    }

    public final void setInputType(int i) {
        getMaterialInput().setInputType(i);
    }

    public final void setLabelText(String str) {
        if (str == null) {
            Log.e("Collage", "Selects should have a label set for accessibility.");
        }
        this.label.setText(str);
    }

    public final void setMaxLines(int i) {
        if (i <= 12) {
            getMaterialInput().setSingleLine(false);
            getMaterialInput().setMaxLines(i);
            return;
        }
        throw new IllegalArgumentException("Max lines must be less than or equal to 12".toString());
    }

    public final void setMinLines(int i) {
        if (i >= 3) {
            getMaterialInput().setSingleLine(false);
            getMaterialInput().setMinLines(i);
            return;
        }
        throw new IllegalArgumentException("Min lines must be greater than or equal to 3".toString());
    }

    public final void setMultiline(boolean z) {
        getMaterialInput().setSingleLine(!z);
        if (z) {
            setMinLines(3);
            setMaxLines(12);
            return;
        }
        getMaterialInput().setMinLines(1);
        getMaterialInput().setMaxLines(1);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        getMaterialInput().setOnClickListener(onClickListener);
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.editorActionListener = onEditorActionListener;
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        getMaterialInput().setOnFocusChangeListener(onFocusChangeListener);
    }

    public final void setRequired(boolean z) {
        if (z) {
            this.requiredStar.setVisibility(0);
        } else {
            this.requiredStar.setVisibility(8);
        }
    }

    public void setSelection(int i) {
        getMaterialInput().setSelection(i);
    }

    public void setSmall(boolean z) {
        if (z) {
            getMaterialInput().setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.clg_text_size_small));
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.clg_space_8);
            getMaterialInput().setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            this.materialLayout.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.clg_space_36);
            return;
        }
        getMaterialInput().setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.clg_text_size_default));
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        getMaterialInput().setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        this.materialLayout.getLayoutParams().height = -2;
    }

    public final void setStartIconDrawable(int i) {
        Context context = this.materialLayout.getContext();
        Object obj = C8184a.f17966a;
        setStartIconDrawable(C8184a.C8187c.m16466b(context, i));
    }

    public final void setText(String str) {
        EditText editText = this.materialLayout.getEditText();
        if (editText != null) {
            editText.setText(str, TextView.BufferType.EDITABLE);
        }
        EditText editText2 = this.materialLayout.getEditText();
        if (editText2 != null) {
            editText2.setSelection(getText().length());
        }
    }

    public void setTextChangeListener(TextWatcher textWatcher) {
        this.textChangeListener = textWatcher;
    }

    public final void showCursor(boolean z) {
        getMaterialInput().setCursorVisible(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageTextInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        String str;
        boolean z2;
        Drawable drawable;
        Drawable drawable2;
        boolean z3;
        String str2;
        String str3;
        int i2;
        String str4;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        int i3 = -1;
        this.invalidMaxLength = -1;
        this.layoutRes = R.layout.clg_text_input;
        this.styleAttrs = C13006a.f28656w;
        boolean z4 = true;
        LayoutInflater.from(context).inflate(getLayoutRes(), this, true);
        View findViewById = findViewById(R.id.clg_text_input_label);
        C19383o.m32796f(findViewById, "findViewById(R.id.clg_text_input_label)");
        this.label = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.clg_text_input_required_star);
        C19383o.m32796f(findViewById2, "findViewById(R.id.clg_text_input_required_star)");
        this.requiredStar = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.clg_text_input_helper);
        C19383o.m32796f(findViewById3, "findViewById(R.id.clg_text_input_helper)");
        this.helper = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.clg_text_input_error);
        C19383o.m32796f(findViewById4, "findViewById(R.id.clg_text_input_error)");
        this.error = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.clg_text_input_counter);
        C19383o.m32796f(findViewById5, "findViewById(R.id.clg_text_input_counter)");
        this.counter = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.clg_text_input_button);
        C19383o.m32796f(findViewById6, "findViewById(R.id.clg_text_input_button)");
        this.button = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.clg_text_input_layout);
        C19383o.m32796f(findViewById7, "findViewById(R.id.clg_text_input_layout)");
        this.materialLayout = (TextInputLayout) findViewById7;
        View findViewById8 = findViewById(R.id.clg_text_input);
        C19383o.m32796f(findViewById8, "findViewById(R.id.clg_text_input)");
        this.materialInput = (EditText) findViewById8;
        int i4 = 5;
        String str5 = null;
        boolean z5 = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, getStyleAttrs(), 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…tes(it, styleAttrs, 0, 0)");
            str5 = obtainStyledAttributes.getString(12);
            String string = obtainStyledAttributes.getString(11);
            str3 = obtainStyledAttributes.getString(10);
            str2 = obtainStyledAttributes.getString(5);
            z3 = obtainStyledAttributes.getBoolean(14, false);
            drawable2 = obtainStyledAttributes.getDrawable(15);
            drawable = obtainStyledAttributes.getDrawable(9);
            boolean z6 = obtainStyledAttributes.getBoolean(0, true);
            str = obtainStyledAttributes.getString(1);
            int i5 = obtainStyledAttributes.getInt(3, 1);
            i3 = obtainStyledAttributes.getInt(8, -1);
            z = obtainStyledAttributes.getBoolean(7, false);
            boolean z7 = obtainStyledAttributes.getBoolean(13, false);
            int integer = obtainStyledAttributes.getInteger(4, 5);
            boolean z8 = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
            str4 = string;
            i2 = i5;
            z4 = z6;
            z2 = z8;
            z5 = z7;
            i4 = integer;
        } else {
            z3 = false;
            z2 = false;
            z = false;
            str4 = null;
            str3 = null;
            str2 = null;
            drawable2 = null;
            drawable = null;
            str = null;
            i2 = 1;
        }
        setEnabled(z4);
        getMaterialInput().setInputType(i2);
        setMultiline(z5);
        setLabelText(str5);
        setHelperText(str4);
        setErrorText(str3);
        setButtonText(str2);
        setRequired(z3);
        setText(str);
        setStartIconDrawable(drawable2);
        setEndIconDrawable(drawable);
        setSmall(z2);
        setCounterMaxLength(i3);
        setCounterEnabled(z);
        getMaterialInput().addTextChangedListener(new TextWatcher(this) {
            public final /* synthetic */ CollageTextInput this$0;

            {
                this.this$0 = r1;
            }

            public void afterTextChanged(Editable editable) {
                C19383o.m32797g(editable, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
                if (this.this$0.counterEnabled) {
                    this.this$0.updateCounter(editable.length());
                }
                TextWatcher access$getTextChangeListener$p = this.this$0.textChangeListener;
                if (access$getTextChangeListener$p != null) {
                    access$getTextChangeListener$p.afterTextChanged(editable);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C19383o.m32797g(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
                TextWatcher access$getTextChangeListener$p = this.this$0.textChangeListener;
                if (access$getTextChangeListener$p != null) {
                    access$getTextChangeListener$p.beforeTextChanged(charSequence, i, i2, i3);
                }
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C19383o.m32797g(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
                TextWatcher access$getTextChangeListener$p = this.this$0.textChangeListener;
                if (access$getTextChangeListener$p != null) {
                    access$getTextChangeListener$p.onTextChanged(charSequence, i, i2, i3);
                }
            }
        });
        setImeOptions(i4);
        getMaterialInput().setOnEditorActionListener(new C9068q(this));
    }

    /* access modifiers changed from: private */
    public final void updateCounter(int i) {
        boolean z = this.counterOverflowed;
        int i2 = this.counterMaxLength;
        if (i2 == this.invalidMaxLength) {
            this.counter.setText(String.valueOf(i));
            this.counter.setContentDescription((CharSequence) null);
            this.counterOverflowed = false;
        } else {
            if (i >= i2) {
                TextView textView = this.counter;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (C2364y.C2371g.m5244a(textView) == 0) {
                    C2364y.C2371g.m5249f(this.counter, 2);
                }
            } else {
                TextView textView2 = this.counter;
                WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                if (C2364y.C2371g.m5244a(textView2) != 0) {
                    C2364y.C2371g.m5249f(this.counter, 0);
                }
            }
            this.counterOverflowed = i > this.counterMaxLength;
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            updateCounterContentDescription(context, this.counter, i, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextColor();
            }
            this.counter.setText(getContext().getString(R.string.clg_character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.counterMaxLength)}));
        }
        boolean z2 = this.counterOverflowed;
        if (z != z2) {
            setErrorBackgroundEnabled(z2);
        }
    }

    public final void setHint(CharSequence charSequence) {
        C19383o.m32797g(charSequence, ResponseConstants.HINT);
        getMaterialInput().setHint(charSequence);
    }

    public final void setSelection(int i, int i2) {
        getMaterialInput().setSelection(i, i2);
    }

    public final void setEndIconDrawable(Drawable drawable) {
        this.materialLayout.setEndIconMode(-1);
        this.materialLayout.setEndIconDrawable(drawable);
        if (drawable == null) {
            this.materialLayout.setEndIconMode(0);
        }
    }

    public final void setStartIconDrawable(Drawable drawable) {
        this.materialLayout.setStartIconDrawable(drawable);
    }
}
