package com.etsy.android.uikit.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

public class MachineTranslationOneClickView extends MachineTranslationButton {
    public TextView mTranslatedContent;

    public MachineTranslationOneClickView(Context context) {
        super(context);
    }

    public void configureForStateAndMessage(MachineTranslationViewState machineTranslationViewState, String str) {
        if (!machineTranslationViewState.isTranslated() || !C8885d0.m17323g(str)) {
            setUntranslatedState();
        } else {
            setTranslatedStateWithString(str);
        }
        super.configureForState(machineTranslationViewState);
    }

    @Deprecated
    public void hideAllElements() {
        this.mTranslateButton.setVisibility(8);
        this.mTranslationLoadingSpinner.setVisibility(8);
        this.mTranslationErrorMessage.setVisibility(8);
        this.mTranslatedContent.setVisibility(8);
    }

    public void onFinishInflate() {
        this.mTranslatedContent = (TextView) findViewById(R.id.translated_content);
        super.onFinishInflate();
    }

    public void setListingTranslationState(boolean z, String str, C8923u uVar) {
        int i;
        int i2;
        if (z) {
            i = R.string.machine_translation_disclaimer;
            i2 = R.string.machine_translation_listing_untranslate;
        } else {
            i = R.string.machine_translation_explainer;
            i2 = R.string.machine_translation_listing_translate;
        }
        this.mTranslationDisclaimer.setText(i);
        TextView textView = this.mTranslateButton;
        Resources resources = getResources();
        uVar.getClass();
        C19383o.m32797g(str, "languageCode");
        String displayName = new Locale(C8923u.m17363b(str)).getDisplayName();
        C19383o.m32796f(displayName, "Locale(updatedLanguageCode).displayName");
        textView.setText(resources.getString(i2, new Object[]{displayName}));
        this.mTranslatedContent.setVisibility(8);
    }

    public void setTranslatedState() {
        super.setTranslatedState();
        this.mTranslateButton.setEnabled(false);
        this.mTranslateButton.setText(R.string.machine_translation_one_click_translated);
    }

    public void setTranslatedStateWithString(String str) {
        setTranslatedState();
        this.mTranslatedContent.setVisibility(0);
        this.mTranslatedContent.setText(Html.fromHtml(str));
    }

    public void setUntranslatedState() {
        super.setUntranslatedState();
        this.mTranslatedContent.setText("");
        this.mTranslatedContent.setVisibility(8);
        this.mTranslateButton.setEnabled(true);
    }

    @Deprecated
    public void showButtonElements() {
        this.mTranslateButton.setVisibility(0);
    }

    public MachineTranslationOneClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MachineTranslationOneClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MachineTranslationOneClickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
