package com.paypal.pyplcheckout.utils;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.paypal.pyplcheckout.C17165R;
import p114g4.C6867g;

@IgnoreGeneratedTestReport
public class DialogMaker extends DialogFragment {
    private static final String TAG = "DialogMaker";
    private RadioButton changeOrderRb;
    private int description;
    private EditText feedbackEt;
    private int negativeButtonLabel;
    private NegativeClickListener negativeClickListener;
    private int positiveButtonLabel;
    private PositiveClickListener positiveClickListener;
    private RadioButton preferNotToSayRb;
    private LinearLayout radioButtonContainer;
    private View root;
    private boolean showFeedbackRadioButtons;
    private boolean showSpinner;
    private RadioButton somethingNotRightRb;
    private int title;

    public static class Builder {
        /* access modifiers changed from: private */
        public int description;
        /* access modifiers changed from: private */
        public int negativeButtonLabel;
        /* access modifiers changed from: private */
        public NegativeClickListener negativeClickListener;
        /* access modifiers changed from: private */
        public int positiveButtonLabel = C17165R.string.paypal_checkout_ok;
        /* access modifiers changed from: private */
        public PositiveClickListener positiveClickListener;
        /* access modifiers changed from: private */
        public boolean showFeedbackRadioButtons;
        /* access modifiers changed from: private */
        public boolean showSpinner;
        /* access modifiers changed from: private */
        public int title;

        public DialogMaker build() {
            return new DialogMaker(this, 0);
        }

        public Builder setDescription(int i) {
            this.description = i;
            return this;
        }

        public Builder setFeedbackRadioButtons(boolean z) {
            this.showFeedbackRadioButtons = z;
            return this;
        }

        public Builder setNegativeButton(int i, NegativeClickListener negativeClickListener2) {
            this.negativeButtonLabel = i;
            this.negativeClickListener = negativeClickListener2;
            return this;
        }

        public Builder setPositiveButton(int i, PositiveClickListener positiveClickListener2) {
            this.positiveButtonLabel = i;
            this.positiveClickListener = positiveClickListener2;
            return this;
        }

        public Builder setTitle(int i) {
            this.title = i;
            return this;
        }

        public Builder showSpinner(boolean z) {
            this.showSpinner = z;
            return this;
        }
    }

    public interface NegativeClickListener {
        void onNegativeClick(DialogMaker dialogMaker);
    }

    public interface PositiveClickListener {
        void onPositiveClick(DialogMaker dialogMaker);
    }

    static {
        Class<DialogMaker> cls = DialogMaker.class;
    }

    @SuppressLint({"ValidFragment"})
    public DialogMaker() {
    }

    public /* synthetic */ DialogMaker(Builder builder, int i) {
        this(builder);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        NegativeClickListener negativeClickListener2 = this.negativeClickListener;
        if (negativeClickListener2 != null) {
            negativeClickListener2.onNegativeClick(this);
        } else {
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(TextView textView, ProgressBar progressBar, View view) {
        if (this.positiveClickListener != null) {
            if (this.showSpinner) {
                textView.setVisibility(4);
                progressBar.setVisibility(0);
            }
            this.positiveClickListener.onPositiveClick(this);
            return;
        }
        dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setRadioButtonClickListener$2(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, int i, View view) {
        radioButton.setChecked(false);
        radioButton2.setChecked(false);
        radioButton3.setChecked(true);
        this.feedbackEt.setVisibility(i);
    }

    private void setRadioButtonClickListener(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, int i) {
        radioButton.setOnClickListener(new C17282b(this, radioButton2, radioButton3, radioButton, i));
    }

    private void setRadioButtons(boolean z) {
        if (z) {
            this.radioButtonContainer.setVisibility(0);
            this.changeOrderRb.setText(C17165R.string.paypal_checkout_leaving_paypal_change_order);
            this.somethingNotRightRb.setText(C17165R.string.paypal_checkout_leaving_paypal_something_not_right);
            this.preferNotToSayRb.setText(C17165R.string.paypal_checkout_leaving_paypal_prefer_not_say);
            return;
        }
        this.radioButtonContainer.setVisibility(8);
    }

    private void updateTextView(TextView textView, int i) {
        if (i == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(i);
        textView.setVisibility(0);
    }

    public String getFeedbackMessage() {
        if (this.preferNotToSayRb.isChecked()) {
            return "I prefer not to say";
        }
        if (this.changeOrderRb.isChecked()) {
            return "I want to change my order";
        }
        String str = "";
        if (!this.somethingNotRightRb.isChecked()) {
            return str;
        }
        if (this.feedbackEt.getText() != null) {
            StringBuilder h = C0072d.m201h(" ");
            h.append(this.feedbackEt.getText().toString());
            str = h.toString();
        }
        return C0326j.m864i("Something's not right", str);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setCancelable(false);
        View inflate = layoutInflater.inflate(C17165R.C17169layout.dialog_maker_layout, viewGroup);
        TextView textView = (TextView) inflate.findViewById(C17165R.C17167id.dialog_positive_tv);
        TextView textView2 = (TextView) inflate.findViewById(C17165R.C17167id.dialog_negative_tv);
        this.radioButtonContainer = (LinearLayout) inflate.findViewById(C17165R.C17167id.feedback_container);
        this.changeOrderRb = (RadioButton) inflate.findViewById(C17165R.C17167id.change_order);
        this.somethingNotRightRb = (RadioButton) inflate.findViewById(C17165R.C17167id.something_not_right);
        this.preferNotToSayRb = (RadioButton) inflate.findViewById(C17165R.C17167id.prefer_not_say);
        this.feedbackEt = (EditText) inflate.findViewById(C17165R.C17167id.add_feedback_et);
        this.root = inflate;
        setRadioButtons(this.showFeedbackRadioButtons);
        updateTextView((TextView) inflate.findViewById(C17165R.C17167id.dialog_title_tv), this.title);
        updateTextView((TextView) inflate.findViewById(C17165R.C17167id.dialog_description_tv), this.description);
        updateTextView(textView, this.positiveButtonLabel);
        updateTextView(textView2, this.negativeButtonLabel);
        textView2.setOnClickListener(new C6867g(this, 5));
        textView.setOnClickListener(new C17283c(this, textView, (ProgressBar) inflate.findViewById(C17165R.C17167id.dialog_pb)));
        this.preferNotToSayRb.setChecked(true);
        setRadioButtonClickListener(this.changeOrderRb, this.preferNotToSayRb, this.somethingNotRightRb, 8);
        setRadioButtonClickListener(this.somethingNotRightRb, this.preferNotToSayRb, this.changeOrderRb, 0);
        setRadioButtonClickListener(this.preferNotToSayRb, this.changeOrderRb, this.somethingNotRightRb, 8);
        if (!(getDialog() == null || getDialog().getWindow() == null)) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getDialog().getWindow().requestFeature(1);
        }
        return inflate;
    }

    public void onResume() {
        ProgressBar progressBar;
        super.onResume();
        View view = this.root;
        if (view != null && (progressBar = (ProgressBar) view.findViewById(C17165R.C17167id.dialog_pb)) != null && progressBar.getVisibility() == 0) {
            progressBar.setVisibility(4);
            TextView textView = (TextView) this.root.findViewById(C17165R.C17167id.dialog_positive_tv);
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.4f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }

    public void show(FragmentActivity fragmentActivity) {
        show(fragmentActivity.getSupportFragmentManager(), TAG);
    }

    @SuppressLint({"ValidFragment"})
    private DialogMaker(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.positiveButtonLabel = builder.positiveButtonLabel;
        this.positiveClickListener = builder.positiveClickListener;
        this.negativeButtonLabel = builder.negativeButtonLabel;
        this.negativeClickListener = builder.negativeClickListener;
        this.showSpinner = builder.showSpinner;
        this.showFeedbackRadioButtons = builder.showFeedbackRadioButtons;
    }
}
