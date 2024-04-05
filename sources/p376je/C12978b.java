package p376je;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.etsy.android.uikit.p331ui.dialog.text.TextInfoDialog;
import p363he.C12819c;
import p363he.C12824f;

/* renamed from: je.b */
public final class C12978b implements C12819c {

    /* renamed from: b */
    public final String f28584b;

    /* renamed from: c */
    public final String f28585c;

    /* renamed from: d */
    public final DialogInterface.OnDismissListener f28586d;

    public C12978b(String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        this.f28584b = str;
        this.f28585c = str2;
        this.f28586d = onDismissListener;
    }

    /* renamed from: c */
    public final String mo45595c() {
        return EtsyDialogFragment.OPT_X_BUTTON;
    }

    /* renamed from: d */
    public final String mo45596d() {
        return null;
    }

    /* renamed from: e */
    public final void mo45597e() {
    }

    /* renamed from: f */
    public final DialogInterface.OnDismissListener mo45598f() {
        return this.f28586d;
    }

    /* renamed from: g */
    public final EtsyDialogFragment mo45599g() {
        return C12819c.C12820a.m20462a(this);
    }

    public final C12824f getNavigationParams() {
        return C12819c.C12820a.m20463b(this);
    }

    public final String getTitle() {
        return this.f28584b;
    }

    /* renamed from: h */
    public final Fragment mo45602h() {
        TextInfoDialog textInfoDialog = new TextInfoDialog();
        Bundle bundle = new Bundle();
        bundle.putString("text", this.f28585c);
        textInfoDialog.setArguments(bundle);
        return textInfoDialog;
    }

    /* renamed from: i */
    public final void mo45603i() {
    }

    /* renamed from: j */
    public final boolean mo45604j() {
        return false;
    }
}
