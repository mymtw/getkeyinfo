package androidx.room;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.etsy.android.p327ui.cart.C9311i;
import com.google.firebase.platforminfo.C16685e;
import com.paypal.pyplcheckout.interfaces.Progression;
import com.paypal.pyplcheckout.interfaces.SDKInterceptFinishListener;
import com.paypal.pyplcheckout.interfaces.SDKInterceptor;
import com.paypal.pyplcheckout.interfaces.Status;
import kotlin.jvm.internal.C19383o;
import p112g2.C6831a;
import p146j.C7096a;
import p287xp.C8335c;

/* renamed from: androidx.room.f */
public final /* synthetic */ class C3229f implements C7096a, C16685e.C16686a, SDKInterceptor, C8335c {
    public Object apply(Object obj) {
        return ((C6831a) obj).getPath();
    }

    public Object apply(Object obj, Object obj2) {
        C9311i iVar = (C9311i) obj2;
        C19383o.m32797g((Long) obj, "<anonymous parameter 0>");
        C19383o.m32797g(iVar, "apiResult");
        return iVar;
    }

    /* renamed from: c */
    public String mo3367c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    public void intercept(Progression progression, SDKInterceptFinishListener sDKInterceptFinishListener) {
        sDKInterceptFinishListener.onSDKInterceptComplete(Status.SUCCESS);
    }
}
