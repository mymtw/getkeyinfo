package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.paypal.android.platform.authsdk.C17049R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpOnKeyListener */
public final class OtpOnKeyListener implements View.OnKeyListener {
    private final EditText currentView;
    private final EditText previousView;

    public OtpOnKeyListener(EditText editText, EditText editText2) {
        C19383o.m32797g(editText, "currentView");
        this.currentView = editText;
        this.previousView = editText2;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getAction() == 0) && i == 67 && this.currentView.getId() != C17049R.C17051id.otp_entry_1) {
            Editable text = this.currentView.getText();
            C19383o.m32796f(text, "currentView.text");
            if (text.length() == 0) {
                EditText editText = this.previousView;
                if (editText != null) {
                    editText.setText((CharSequence) null);
                }
                EditText editText2 = this.previousView;
                if (editText2 != null) {
                    editText2.requestFocus();
                }
                return true;
            }
        }
        return false;
    }
}
