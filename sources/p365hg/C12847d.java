package p365hg;

import android.net.Uri;
import android.os.Bundle;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: hg.d */
public class C12847d {

    /* renamed from: a */
    public Uri f28339a;

    /* renamed from: hg.d$a */
    public static final class C12848a {
        /* renamed from: a */
        public static Uri m20500a(Bundle bundle, String str) {
            String a = C12865g0.m20540a();
            return C12869i0.m20563b(a, bundle, C13418j.m21109e() + "/" + "dialog/" + str);
        }
    }

    public C12847d(String str, Bundle bundle) {
        this.f28339a = C12848a.m20500a(bundle == null ? new Bundle() : bundle, str);
    }

    /* renamed from: a */
    public static Uri m20499a(Bundle bundle, String str) {
        Class<C12847d> cls = C12847d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return C12848a.m20500a(bundle, str);
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }
}
