package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;
import p753kq.C19857l;

public final class CollageTypeAhead extends CollageTextInput {
    public static final int $stable = 8;
    private AdapterView.OnItemClickListener onItemClickListener;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTypeAhead(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTypeAhead(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageTypeAhead(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: setCollageTypeAheadAdapter$lambda-2  reason: not valid java name */
    public static final void m34902setCollageTypeAheadAdapter$lambda2(CollageTypeAheadAdapter collageTypeAheadAdapter, CollageTypeAhead collageTypeAhead, AdapterView adapterView, View view, int i, long j) {
        C19383o.m32797g(collageTypeAheadAdapter, "$adapter");
        C19383o.m32797g(collageTypeAhead, "this$0");
        collageTypeAheadAdapter.onItemClick(adapterView, view, i, j);
        AdapterView.OnItemClickListener onItemClickListener2 = collageTypeAhead.onItemClickListener;
        if (onItemClickListener2 != null) {
            onItemClickListener2.onItemClick(adapterView, view, i, j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setOnItemClickListener$lambda-3  reason: not valid java name */
    public static final void m34903setOnItemClickListener$lambda3(CollageTypeAhead collageTypeAhead, AdapterView.OnItemClickListener onItemClickListener2, AdapterView adapterView, View view, int i, long j) {
        C19383o.m32797g(collageTypeAhead, "this$0");
        C19383o.m32797g(onItemClickListener2, "$listener");
        if (collageTypeAhead.getMaterialInput().getAdapter() instanceof CollageTypeAheadAdapter) {
            ListAdapter adapter = collageTypeAhead.getMaterialInput().getAdapter();
            C19383o.m32795e(adapter, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageTypeAheadAdapter");
            ((CollageTypeAheadAdapter) adapter).onItemClick(adapterView, view, i, j);
        }
        onItemClickListener2.onItemClick(adapterView, view, i, j);
    }

    private final void setSelectionGeneric(Object obj) {
        ListAdapter adapter = getMaterialInput().getAdapter();
        int count = adapter.getCount();
        int i = 0;
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            } else if (C19383o.m32792b(obj, adapter.getItem(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            setSelection(i);
            return;
        }
        throw new IllegalStateException(C13983i.m21494m("Text ", obj, " was not found"));
    }

    /* access modifiers changed from: private */
    /* renamed from: setSmall$lambda-1  reason: not valid java name */
    public static final void m34904setSmall$lambda1(CollageTypeAhead collageTypeAhead, View view) {
        C19383o.m32797g(collageTypeAhead, "this$0");
        collageTypeAhead.getMaterialInput().showDropDown();
    }

    public static /* synthetic */ void setValidator$default(CollageTypeAhead collageTypeAhead, boolean z, C19857l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        collageTypeAhead.setValidator(z, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: setValidator$lambda-4  reason: not valid java name */
    public static final void m34905setValidator$lambda4(CollageTypeAhead collageTypeAhead, View view, boolean z) {
        C19383o.m32797g(collageTypeAhead, "this$0");
        if (!z) {
            collageTypeAhead.performValidation();
        }
    }

    public int getLayoutRes() {
        return R.layout.clg_typeahead;
    }

    public final boolean performValidation() {
        AutoCompleteTextView materialInput = getMaterialInput();
        if (materialInput.getValidator() == null) {
            return true;
        }
        Editable text = materialInput.getText();
        C19383o.m32796f(text, "text");
        if (materialInput.getValidator().isValid(text)) {
            return true;
        }
        materialInput.setText(materialInput.getValidator().fixText(text));
        return false;
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        C19383o.m32797g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getButton().setOnClickListener(onClickListener);
    }

    public final void setCollageTypeAheadAdapter(CollageTypeAheadAdapter collageTypeAheadAdapter) {
        C19383o.m32797g(collageTypeAheadAdapter, "adapter");
        getMaterialInput().setAdapter(collageTypeAheadAdapter);
        getMaterialInput().setOnItemClickListener(new C9074t(collageTypeAheadAdapter, this));
    }

    public final <T extends ListAdapter & Filterable> void setCustomAdapter(T t) {
        C19383o.m32797g(t, "adapter");
        getMaterialInput().setAdapter(t);
    }

    public final void setHint(String str) {
        EditText editText = getMaterialLayout().getEditText();
        if (editText != null) {
            editText.setHint(str);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        getMaterialInput().setOnClickListener(onClickListener);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        getMaterialInput().setOnFocusChangeListener(onFocusChangeListener);
    }

    public final void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener2) {
        C19383o.m32797g(onItemClickListener2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getMaterialInput().setOnItemClickListener(new C9073s(this, onItemClickListener2));
    }

    public final void setSelection(SpannableString spannableString) {
        C19383o.m32797g(spannableString, "text");
        setSelectionGeneric(spannableString);
    }

    public void setSmall(boolean z) {
        if (z) {
            getMaterialInput().setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.clg_text_size_small));
            getMaterialLayout().getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.clg_space_36);
            getLabel().setOnClickListener(new C9054e(this, 1));
            return;
        }
        getMaterialInput().setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.clg_text_size_default));
        getMaterialLayout().getLayoutParams().height = -2;
        getLabel().setOnClickListener((View.OnClickListener) null);
    }

    public final void setThreshold(int i) {
        getMaterialInput().setThreshold(i);
    }

    public final void setValidator(boolean z, C19857l<? super CharSequence, Pair<Boolean, String>> lVar) {
        C19383o.m32797g(lVar, "validator");
        getMaterialInput().setValidator(new CollageTypeAhead$setValidator$1(lVar, this));
        if (z) {
            setOnFocusChangeListener(new C9075u(this, 0));
        }
    }

    public final void showDropdown() {
        getMaterialInput().showDropDown();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageTypeAhead(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getStyleAttrs(), 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…tes(it, styleAttrs, 0, 0)");
            String string = obtainStyledAttributes.getString(2);
            boolean z = obtainStyledAttributes.getBoolean(6, false);
            setHint(string);
            setSmall(z);
            getMaterialLayout().setEndIconOnClickListener((View.OnClickListener) null);
            getMaterialInput().addTextChangedListener(new CollageTypeAhead$1$1(this));
            obtainStyledAttributes.recycle();
        }
    }

    public AutoCompleteTextView getMaterialInput() {
        EditText materialInput = super.getMaterialInput();
        C19383o.m32795e(materialInput, "null cannot be cast to non-null type android.widget.AutoCompleteTextView");
        return (AutoCompleteTextView) materialInput;
    }

    public final void setSelection(String str) {
        C19383o.m32797g(str, "text");
        setSelectionGeneric(str);
    }

    public void setSelection(int i) {
        ListAdapter adapter = getMaterialInput().getAdapter();
        String obj = adapter.getItem(i).toString();
        getMaterialInput().setText(obj, false);
        if (adapter instanceof CollageTypeAheadAdapter) {
            ((CollageTypeAheadAdapter) adapter).onTextChanged(obj);
        }
    }
}
