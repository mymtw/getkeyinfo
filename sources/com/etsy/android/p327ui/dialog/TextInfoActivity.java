package com.etsy.android.p327ui.dialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.etsy.android.uikit.p331ui.dialog.DialogActivity;
import kotlin.jvm.internal.C19383o;
import p356ge.C12788a;
import p376je.C12978b;

/* renamed from: com.etsy.android.ui.dialog.TextInfoActivity */
public class TextInfoActivity extends DialogActivity {
    private String mContent;
    private String mTitle;

    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        this.mTitle = intent.getStringExtra("title");
        this.mContent = intent.getStringExtra("text");
        super.onCreate(bundle);
    }

    public void onShowDialog(DialogInterface.OnDismissListener onDismissListener) {
        String str = this.mTitle;
        C19383o.m32797g(str, "dialogTitle");
        String str2 = this.mContent;
        C19383o.m32797g(str2, "dialogContent");
        C12788a.m20424c(this, new C12978b(str, str2, onDismissListener));
    }
}
