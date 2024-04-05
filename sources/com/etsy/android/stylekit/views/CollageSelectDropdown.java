package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p388lb.C13006a;
import p435rb.C13350a;
import p504ai.C13983i;

public final class CollageSelectDropdown extends ConstraintLayout {
    public static final int $stable = 8;
    private final TextView error;
    private final TextView label;
    private final ConstraintLayout labelContainer;
    private final AutoCompleteTextView materialInput;
    private final TextInputLayout materialLayout;
    private AdapterView.OnItemClickListener onItemClickListener;
    private final TextView requiredStar;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageSelectDropdown(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageSelectDropdown(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageSelectDropdown(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: setCollageAdapter$lambda-2  reason: not valid java name */
    public static final void m34895setCollageAdapter$lambda2(CollageSelectAdapter collageSelectAdapter, CollageSelectDropdown collageSelectDropdown, AdapterView adapterView, View view, int i, long j) {
        C19383o.m32797g(collageSelectAdapter, "$adapter");
        C19383o.m32797g(collageSelectDropdown, "this$0");
        collageSelectAdapter.onItemClick(adapterView, view, i, j);
        AdapterView.OnItemClickListener onItemClickListener2 = collageSelectDropdown.onItemClickListener;
        if (onItemClickListener2 != null) {
            onItemClickListener2.onItemClick(adapterView, view, i, j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setOnItemClickListener$lambda-3  reason: not valid java name */
    public static final void m34896setOnItemClickListener$lambda3(CollageSelectDropdown collageSelectDropdown, AdapterView.OnItemClickListener onItemClickListener2, AdapterView adapterView, View view, int i, long j) {
        C19383o.m32797g(collageSelectDropdown, "this$0");
        C19383o.m32797g(onItemClickListener2, "$listener");
        NavigationExtensionsKt.m17420a(collageSelectDropdown.materialInput, 500);
        if (collageSelectDropdown.materialInput.getAdapter() instanceof CollageSelectAdapter) {
            ListAdapter adapter = collageSelectDropdown.materialInput.getAdapter();
            C19383o.m32795e(adapter, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageSelectAdapter");
            ((CollageSelectAdapter) adapter).onItemClick(adapterView, view, i, j);
        }
        onItemClickListener2.onItemClick(adapterView, view, i, j);
    }

    private final void setSelectionGeneric(Object obj) {
        ListAdapter adapter = this.materialInput.getAdapter();
        int count = adapter.getCount();
        int i = 0;
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            } else if (C19383o.m32792b(obj.toString(), adapter.getItem(i).toString())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            setSelection(i);
            return;
        }
        throw new IllegalStateException(C13983i.m21494m("Text ", obj, " was not found. Does your adaper item toString match?"));
    }

    /* access modifiers changed from: private */
    /* renamed from: setSmall$lambda-1  reason: not valid java name */
    public static final void m34897setSmall$lambda1(CollageSelectDropdown collageSelectDropdown, View view) {
        C19383o.m32797g(collageSelectDropdown, "this$0");
        collageSelectDropdown.materialInput.showDropDown();
    }

    public final String getSelection() {
        return this.materialInput.getText().toString();
    }

    public final void setCollageAdapter(CollageSelectAdapter collageSelectAdapter) {
        C19383o.m32797g(collageSelectAdapter, "adapter");
        this.materialInput.setAdapter(collageSelectAdapter);
        this.materialInput.setOnItemClickListener(new C9063n(collageSelectAdapter, this));
    }

    public final <T extends ListAdapter & Filterable> void setCustomAdapter(T t) {
        C19383o.m32797g(t, "adapter");
        this.materialInput.setAdapter(t);
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
        } else {
            TextInputLayout textInputLayout3 = this.materialLayout;
            Context context3 = getContext();
            C19383o.m32796f(context3, ResponseConstants.CONTEXT);
            textInputLayout3.setBoxStrokeColor(C13350a.m21013d(context3, R.attr.clg_color_select_outline));
            TextInputLayout textInputLayout4 = this.materialLayout;
            Context context4 = getContext();
            C19383o.m32796f(context4, ResponseConstants.CONTEXT);
            textInputLayout4.setBoxBackgroundColor(C13350a.m21013d(context4, R.attr.clg_color_text_input_disabled_bg));
        }
        this.materialLayout.setEnabled(z);
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
        if (!(str == null || C19457k.m33020X0(str))) {
            this.error.setText(str);
            TextView textView = this.error;
            Context context = textView.getContext();
            C19383o.m32796f(context, "error.context");
            textView.setContentDescription(C13350a.m21016g(context, R.attr.clg_error_content_description, str));
            this.error.setVisibility(0);
            setErrorBackgroundEnabled(true);
            return;
        }
        this.error.setText(str);
        this.error.setContentDescription((CharSequence) null);
        this.error.setVisibility(8);
        setEnabled(isEnabled());
    }

    public final void setHint(String str) {
        EditText editText = this.materialLayout.getEditText();
        if (editText != null) {
            editText.setHint(str);
        }
    }

    public final void setLabelText(String str) {
        if (str == null) {
            Log.e("Collage", "Selects should have a label set for accessibility.");
        }
        this.label.setText(str);
    }

    public final void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener2) {
        C19383o.m32797g(onItemClickListener2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.materialInput.setOnItemClickListener(new C9062m(this, onItemClickListener2));
    }

    public final void setRequired(boolean z) {
        if (z) {
            this.requiredStar.setVisibility(0);
        } else {
            this.requiredStar.setVisibility(8);
        }
    }

    public final void setSelection(SpannableString spannableString) {
        C19383o.m32797g(spannableString, "text");
        setSelectionGeneric(spannableString);
    }

    public final void setSmall(boolean z) {
        if (z) {
            this.materialInput.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.clg_text_size_small));
            this.materialLayout.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.clg_space_36);
            this.labelContainer.setOnClickListener(new C9050a(this, 1));
            return;
        }
        this.materialInput.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.clg_text_size_default));
        this.materialLayout.getLayoutParams().height = -2;
        this.labelContainer.setOnClickListener((View.OnClickListener) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageSelectDropdown(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.clg_select_dropdown, this, true);
        View findViewById = findViewById(R.id.clg_select_label_container);
        C19383o.m32796f(findViewById, "findViewById(R.id.clg_select_label_container)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        this.labelContainer = constraintLayout;
        View findViewById2 = constraintLayout.findViewById(R.id.clg_select_label);
        C19383o.m32796f(findViewById2, "labelContainer.findViewById(R.id.clg_select_label)");
        this.label = (TextView) findViewById2;
        View findViewById3 = constraintLayout.findViewById(R.id.clg_select_required_star);
        C19383o.m32796f(findViewById3, "labelContainer.findViewB…clg_select_required_star)");
        this.requiredStar = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.clg_select_error);
        C19383o.m32796f(findViewById4, "findViewById(R.id.clg_select_error)");
        this.error = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.clg_select_layout);
        C19383o.m32796f(findViewById5, "findViewById(R.id.clg_select_layout)");
        TextInputLayout textInputLayout = (TextInputLayout) findViewById5;
        this.materialLayout = textInputLayout;
        View findViewById6 = findViewById(R.id.clg_select_input);
        C19383o.m32796f(findViewById6, "findViewById(R.id.clg_select_input)");
        this.materialInput = (AutoCompleteTextView) findViewById6;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28652s, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…lageSelectDropdown, 0, 0)");
            String string = obtainStyledAttributes.getString(5);
            String string2 = obtainStyledAttributes.getString(4);
            boolean z = obtainStyledAttributes.getBoolean(0, true);
            String string3 = obtainStyledAttributes.getString(1);
            boolean z2 = obtainStyledAttributes.getBoolean(3, false);
            boolean z3 = obtainStyledAttributes.getBoolean(2, false);
            setEnabled(z);
            setLabelText(string);
            setErrorText(string2);
            setHint(string3);
            setSmall(z2);
            setRequired(z3);
            textInputLayout.setEndIconOnClickListener((View.OnClickListener) null);
            obtainStyledAttributes.recycle();
        }
    }

    public final void setSelection(String str) {
        C19383o.m32797g(str, "text");
        setSelectionGeneric(str);
    }

    public final void setSelection(int i) {
        ListAdapter adapter = this.materialInput.getAdapter();
        this.materialInput.setText(adapter.getItem(i).toString(), false);
        if (adapter instanceof CollageSelectAdapter) {
            ((CollageSelectAdapter) adapter).setSelectedPosition(i);
        }
    }
}
