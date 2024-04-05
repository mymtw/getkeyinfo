package p623mm;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import java.util.List;

/* renamed from: mm.c */
public final class C18249c {

    /* renamed from: a */
    public final Uri f40007a;

    public C18249c(Uri uri) {
        this.f40007a = uri;
    }

    /* renamed from: a */
    public final Uri mo69793a() {
        List<String> pathSegments = this.f40007a.getPathSegments();
        if (pathSegments.size() <= 0) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(pathSegments.get(0));
        if (pathSegments.size() > 1) {
            builder.authority(pathSegments.get(1));
            for (int i = 2; i < pathSegments.size(); i++) {
                builder.appendPath(pathSegments.get(i));
            }
        }
        builder.encodedQuery(this.f40007a.getEncodedQuery());
        builder.encodedFragment(this.f40007a.getEncodedFragment());
        return builder.build();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18249c) {
            return this.f40007a.equals(((C18249c) obj).f40007a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f40007a);
    }

    public final String toString() {
        return this.f40007a.toString();
    }
}
