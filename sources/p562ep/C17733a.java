package p562ep;

import com.paypal.checkout.error.ErrorInfo;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.checkout.error.OnError;
import com.paypal.pyplcheckout.model.DebugConfigManager;

/* renamed from: ep.a */
public final /* synthetic */ class C17733a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ OnError f38559b;

    /* renamed from: c */
    public final /* synthetic */ Exception f38560c;

    /* renamed from: d */
    public final /* synthetic */ ErrorReason f38561d;

    /* renamed from: e */
    public final /* synthetic */ DebugConfigManager f38562e;

    public /* synthetic */ C17733a(OnError onError, Exception exc, ErrorReason errorReason, DebugConfigManager debugConfigManager) {
        this.f38559b = onError;
        this.f38560c = exc;
        this.f38561d = errorReason;
        this.f38562e = debugConfigManager;
    }

    public final void run() {
        this.f38559b.onError(ErrorInfo.createErrorInfo(this.f38560c, this.f38561d, this.f38562e));
    }
}
