package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.paypal.android.platform.authsdk.C17049R;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpTextWatcher */
public final class OtpTextWatcher implements TextWatcher {
    private boolean _ignore;
    private final EditText currentView;
    private final EditText nextView;
    private final List<EditText> otpEditTexts;

    public OtpTextWatcher(EditText editText, EditText editText2, List<? extends EditText> list) {
        C19383o.m32797g(editText, "currentView");
        C19383o.m32797g(list, "otpEditTexts");
        this.currentView = editText;
        this.nextView = editText2;
        this.otpEditTexts = list;
    }

    public void afterTextChanged(Editable editable) {
        EditText editText;
        C19383o.m32797g(editable, "editable");
        if (!this._ignore) {
            this._ignore = true;
            String obj = editable.toString();
            if (obj.length() != 1) {
                int length = obj.length();
                if (2 <= length && length < 6) {
                    this.currentView.setText(String.valueOf(obj.charAt(0)));
                    if (this.currentView.getId() != C17049R.C17051id.otp_entry_6) {
                        EditText editText2 = this.nextView;
                        if (editText2 != null) {
                            editText2.setText(String.valueOf(obj.charAt(1)));
                        }
                        EditText editText3 = this.nextView;
                        if (editText3 != null) {
                            editText3.requestFocus();
                        }
                    }
                } else if (obj.length() > 5) {
                    for (int i = 0; i < 6; i++) {
                        this.otpEditTexts.get(i).setText(String.valueOf(obj.charAt(i)));
                    }
                }
            } else if (!(this.currentView.getId() == C17049R.C17051id.otp_entry_6 || (editText = this.nextView) == null)) {
                editText.requestFocus();
            }
            this._ignore = false;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
