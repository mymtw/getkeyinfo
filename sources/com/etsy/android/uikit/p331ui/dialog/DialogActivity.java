package com.etsy.android.uikit.p331ui.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import com.etsy.android.uikit.p331ui.core.TransparentActivity;

/* renamed from: com.etsy.android.uikit.ui.dialog.DialogActivity */
public abstract class DialogActivity extends TransparentActivity {

    /* renamed from: com.etsy.android.uikit.ui.dialog.DialogActivity$a */
    public class C11894a implements DialogInterface.OnDismissListener {
        public C11894a() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            DialogActivity.this.goBackDelayed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        onShowDialog(new C11894a());
    }

    public abstract void onShowDialog(DialogInterface.OnDismissListener onDismissListener);
}
