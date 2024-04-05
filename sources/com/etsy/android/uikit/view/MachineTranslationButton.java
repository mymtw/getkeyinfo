package com.etsy.android.uikit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.uikit.util.MachineTranslationViewState;

public class MachineTranslationButton extends ConstraintLayout {
    private String mDisclaimerText;
    public TextView mTranslateButton;
    public TextView mTranslationDisclaimer;
    public TextView mTranslationErrorMessage;
    public View mTranslationLoadingSpinner;

    public MachineTranslationButton(Context context) {
        super(context);
        initFromAttrs(context, (AttributeSet) null);
    }

    public void configureForState(MachineTranslationViewState machineTranslationViewState) {
        if (!machineTranslationViewState.isTranslated() || !machineTranslationViewState.getShouldShowTranslation()) {
            setUntranslatedState();
        } else {
            setTranslatedState();
        }
        if (machineTranslationViewState.isTranslating()) {
            showSpinner();
        } else {
            hideSpinner();
        }
        if (machineTranslationViewState.isTranslationFailed()) {
            showErrorMessage();
        } else {
            hideErrorMessage();
        }
    }

    public void hideErrorMessage() {
        this.mTranslationErrorMessage.setVisibility(8);
    }

    public void hideSpinner() {
        this.mTranslationLoadingSpinner.setVisibility(8);
    }

    public void initFromAttrs(Context context, AttributeSet attributeSet) {
        View.inflate(context, R.layout.machine_translation_one_click, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1993m.f4496k, 0, 0);
        try {
            this.mDisclaimerText = obtainStyledAttributes.getString(1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void onFinishInflate() {
        this.mTranslateButton = (TextView) findViewById(R.id.translate_button);
        TextView textView = (TextView) findViewById(R.id.translation_disclaimer);
        this.mTranslationDisclaimer = textView;
        String str = this.mDisclaimerText;
        if (str != null) {
            textView.setText(str);
        }
        this.mTranslationLoadingSpinner = findViewById(R.id.loading_translation_spinner);
        this.mTranslationErrorMessage = (TextView) findViewById(R.id.machine_translation_error);
        super.onFinishInflate();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mTranslateButton.setOnClickListener(onClickListener);
    }

    public void setTranslatedState() {
        this.mTranslateButton.setText(getResources().getString(R.string.untranslate));
        if (C8885d0.m17323g(this.mDisclaimerText)) {
            this.mTranslationDisclaimer.setVisibility(0);
        }
    }

    public void setUntranslatedState() {
        this.mTranslateButton.setText(R.string.translate);
        this.mTranslationDisclaimer.setVisibility(8);
    }

    public void showDisclaimer() {
        this.mTranslationDisclaimer.setVisibility(0);
    }

    public void showErrorMessage() {
        this.mTranslationErrorMessage.setVisibility(0);
    }

    public void showSpinner() {
        this.mTranslationLoadingSpinner.setVisibility(0);
    }

    public MachineTranslationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initFromAttrs(context, attributeSet);
    }

    public MachineTranslationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initFromAttrs(context, attributeSet);
    }

    public MachineTranslationButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initFromAttrs(context, attributeSet);
    }
}
