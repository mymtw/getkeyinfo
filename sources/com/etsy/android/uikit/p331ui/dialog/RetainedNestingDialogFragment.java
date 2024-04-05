package com.etsy.android.uikit.p331ui.dialog;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* renamed from: com.etsy.android.uikit.ui.dialog.RetainedNestingDialogFragment */
public class RetainedNestingDialogFragment extends DialogFragment {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
