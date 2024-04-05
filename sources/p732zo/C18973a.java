package p732zo;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.model.BasePreferences;
import kotlin.jvm.internal.C19383o;

/* renamed from: zo.a */
public final class C18973a extends BasePreferences {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18973a(Context context) {
        super(context, "com.paypal.android.authcore.refreshToken");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }
}
