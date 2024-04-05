package p642oo;

import android.content.DialogInterface;
import com.paypal.android.platform.authsdk.authcommon.utils.WebViewUtils;

/* renamed from: oo.b */
public final /* synthetic */ class C18334b implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ WebViewUtils.DialogOnSslErrorHandler f40255b;

    public /* synthetic */ C18334b(WebViewUtils.DialogOnSslErrorHandler dialogOnSslErrorHandler) {
        this.f40255b = dialogOnSslErrorHandler;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WebViewUtils.Companion.m35123showDialogOnSslError$lambda1(this.f40255b, dialogInterface, i);
    }
}
