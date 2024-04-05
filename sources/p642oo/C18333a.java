package p642oo;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;
import com.paypal.android.platform.authsdk.authcommon.utils.WebViewUtils;

/* renamed from: oo.a */
public final /* synthetic */ class C18333a implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ SslErrorHandler f40254b;

    public /* synthetic */ C18333a(SslErrorHandler sslErrorHandler) {
        this.f40254b = sslErrorHandler;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WebViewUtils.Companion.m35122showDialogOnSslError$lambda0(this.f40254b, dialogInterface, i);
    }
}
