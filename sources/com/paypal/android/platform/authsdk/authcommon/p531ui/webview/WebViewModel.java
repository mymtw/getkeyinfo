package com.paypal.android.platform.authsdk.authcommon.p531ui.webview;

import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.p531ui.header.HeaderViewModel;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.ResultError;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.WebViewModel */
public class WebViewModel extends HeaderViewModel {
    private final C2895z<Result> resultEvent = new C2895z<>();

    public final C2895z<Result> getResultEvent() {
        return this.resultEvent;
    }

    public void onBackpress() {
        this.resultEvent.postValue(new Result.Failure(new ResultError.Cancelled(WebViewModelKt.getUSER_CANCELLED(), false)));
    }

    public void onClose() {
        this.resultEvent.postValue(new Result.Failure(new ResultError.Cancelled(WebViewModelKt.getUSER_CANCELLED(), true)));
    }
}
