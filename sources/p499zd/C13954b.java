package p499zd;

import android.content.DialogInterface;
import com.etsy.android.lib.network.oauth2.SignInError;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;

/* renamed from: zd.b */
public final /* synthetic */ class C13954b implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ThirdPartySignInFragment f30672b;

    /* renamed from: c */
    public final /* synthetic */ SignInError.C8742a f30673c;

    public /* synthetic */ C13954b(ThirdPartySignInFragment thirdPartySignInFragment, SignInError.C8742a aVar) {
        this.f30672b = thirdPartySignInFragment;
        this.f30673c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ThirdPartySignInFragment.m35024showAtoDialog$lambda15(this.f30672b, this.f30673c, dialogInterface, i);
    }
}
