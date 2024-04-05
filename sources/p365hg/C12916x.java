package p365hg;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.login.CustomTabLoginMethodHandler;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: hg.x */
public final class C12916x extends C12847d {
    public C12916x(String str, Bundle bundle) {
        super(str, bundle);
        Uri uri;
        bundle = bundle == null ? new Bundle() : bundle;
        if (C19383o.m32792b(str, CustomTabLoginMethodHandler.OAUTH_DIALOG)) {
            uri = C12869i0.m20563b(C12865g0.m20542c(), bundle, "oauth/authorize");
        } else {
            String c = C12865g0.m20542c();
            uri = C12869i0.m20563b(c, bundle, C13418j.m21109e() + "/" + "dialog/" + str);
        }
        if (!C13080a.m20762b(this)) {
            try {
                this.f28339a = uri;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
