package p365hg;

import android.net.Uri;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import p453tf.C13418j;

/* renamed from: hg.u */
public final class C12910u {

    /* renamed from: a */
    public final Uri f28471a;

    /* renamed from: b */
    public final C12911a f28472b;

    /* renamed from: c */
    public final boolean f28473c;

    /* renamed from: d */
    public final Object f28474d;

    /* renamed from: hg.u$a */
    public interface C12911a {
    }

    /* renamed from: hg.u$b */
    public static final class C12912b {
        /* renamed from: a */
        public static Uri m20623a(String str, int i, int i2, String str2) {
            C12879l0.m20602f(str, "userId");
            int max = Math.max(i, 0);
            int max2 = Math.max(i2, 0);
            if ((max == 0 && max2 == 0) ? false : true) {
                Uri.Builder buildUpon = Uri.parse(C12865g0.m20541b()).buildUpon();
                String format = String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{C13418j.m21109e(), str}, 2));
                C19383o.m32796f(format, "java.lang.String.format(locale, format, *args)");
                Uri.Builder path = buildUpon.path(format);
                if (max2 != 0) {
                    path.appendQueryParameter(ResponseConstants.HEIGHT, String.valueOf(max2));
                }
                if (max != 0) {
                    path.appendQueryParameter(ResponseConstants.WIDTH, String.valueOf(max));
                }
                path.appendQueryParameter("migration_overrides", "{october_2012:true}");
                if (!C12869i0.m20546B(str2)) {
                    path.appendQueryParameter(AccessToken.ACCESS_TOKEN_KEY, str2);
                } else {
                    C12879l0.m20603g();
                    if (C12869i0.m20546B(C13418j.f29386f) || C12869i0.m20546B(C13418j.m21107c())) {
                        Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C13418j.m21107c());
                        sb.append("|");
                        C12879l0.m20603g();
                        sb.append(C13418j.f29386f);
                        path.appendQueryParameter(AccessToken.ACCESS_TOKEN_KEY, sb.toString());
                    }
                }
                Uri build = path.build();
                C19383o.m32796f(build, "builder.build()");
                return build;
            }
            throw new IllegalArgumentException("Either width or height must be greater than 0".toString());
        }
    }

    public C12910u(Uri uri, C12911a aVar, boolean z, Object obj) {
        this.f28471a = uri;
        this.f28472b = aVar;
        this.f28473c = z;
        this.f28474d = obj;
    }
}
