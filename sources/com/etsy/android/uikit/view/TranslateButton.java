package com.etsy.android.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;
import p628nj.C18263b;

public final class TranslateButton extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final Button button;
    private final TextView disclaimerTextView;
    private final TextView errorTextView;
    private final LoadingIndicatorView loadingIndicatorView;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TranslateButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TranslateButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslateButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        View inflate = View.inflate(context, R.layout.button_translate, this);
        View findViewById = inflate.findViewById(R.id.translate_button);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.translate_button)");
        this.button = (Button) findViewById;
        View findViewById2 = inflate.findViewById(R.id.translate_disclaimer);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.translate_disclaimer)");
        this.disclaimerTextView = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.translate_error);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.translate_error)");
        this.errorTextView = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.translate_loading_spinner);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.translate_loading_spinner)");
        this.loadingIndicatorView = (LoadingIndicatorView) findViewById4;
    }

    private final void hideErrorMessage() {
        ViewExtensions.m12860d(this.errorTextView);
    }

    private final void hideLoadingIndicator() {
        ViewExtensions.m12860d(this.loadingIndicatorView);
    }

    private final void setTranslatedState() {
        this.button.setText(getResources().getString(R.string.see_original));
        if (C18263b.m30839d0(this.disclaimerTextView.getText())) {
            ViewExtensions.m12859c(this.disclaimerTextView, 500);
        }
    }

    private final void setUntranslatedState() {
        ViewExtensions.m12860d(this.disclaimerTextView);
        this.button.setText(getResources().getString(R.string.translate));
    }

    private final void showErrorMessage() {
        ViewExtensions.m12869m(this.errorTextView);
    }

    private final void showLoadingIndicator() {
        ViewExtensions.m12869m(this.loadingIndicatorView);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void configureForState(MachineTranslationViewState machineTranslationViewState) {
        C19383o.m32797g(machineTranslationViewState, "translationState");
        if (!machineTranslationViewState.isTranslated() || !machineTranslationViewState.getShouldShowTranslation()) {
            setUntranslatedState();
        } else {
            setTranslatedState();
        }
        if (machineTranslationViewState.isTranslating()) {
            showLoadingIndicator();
        } else {
            hideLoadingIndicator();
        }
        if (machineTranslationViewState.isTranslationFailed()) {
            showErrorMessage();
        } else {
            hideErrorMessage();
        }
    }

    public final void setDisclaimerText(String str) {
        C19383o.m32797g(str, "disclaimerText");
        this.disclaimerTextView.setText(str);
    }

    public final void setOnTranslateClickListener(View.OnClickListener onClickListener) {
        this.button.setOnClickListener(onClickListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TranslateButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
