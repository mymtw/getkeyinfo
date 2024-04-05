package p376je;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import p363he.C12819c;
import p363he.C12824f;

/* renamed from: je.a */
public final class C12977a implements C12819c {

    /* renamed from: b */
    public final String f28580b;

    /* renamed from: c */
    public final Bundle f28581c;

    /* renamed from: d */
    public final DialogInterface.OnDismissListener f28582d;

    /* renamed from: e */
    public final boolean f28583e;

    public C12977a(String str, Bundle bundle, boolean z, DialogInterface.OnDismissListener onDismissListener) {
        this.f28580b = str;
        this.f28581c = bundle;
        this.f28582d = onDismissListener;
        this.f28583e = z;
    }

    /* renamed from: c */
    public final String mo45595c() {
        return "";
    }

    /* renamed from: d */
    public final String mo45596d() {
        return "signIn";
    }

    /* renamed from: e */
    public final void mo45597e() {
    }

    /* renamed from: f */
    public final DialogInterface.OnDismissListener mo45598f() {
        return this.f28582d;
    }

    /* renamed from: g */
    public final EtsyDialogFragment mo45599g() {
        return C12819c.C12820a.m20462a(this);
    }

    public final C12824f getNavigationParams() {
        return C12819c.C12820a.m20463b(this);
    }

    public final String getTitle() {
        return this.f28580b;
    }

    /* renamed from: h */
    public final Fragment mo45602h() {
        Bundle bundle = new Bundle();
        ThirdPartySignInFragment thirdPartySignInFragment = new ThirdPartySignInFragment();
        Bundle bundle2 = this.f28581c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        thirdPartySignInFragment.setArguments(bundle);
        return thirdPartySignInFragment;
    }

    /* renamed from: i */
    public final void mo45603i() {
    }

    /* renamed from: j */
    public final boolean mo45604j() {
        return this.f28583e;
    }
}
