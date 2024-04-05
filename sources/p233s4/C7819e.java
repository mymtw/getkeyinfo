package p233s4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p013v4.media.C0073e;
import com.bumptech.glide.load.engine.C6051s;
import java.io.IOException;
import java.util.List;
import p150j4.C7114e;
import p150j4.C7115f;

/* renamed from: s4.e */
public final class C7819e implements C7115f<Uri, Drawable> {

    /* renamed from: a */
    public final Context f17280a;

    public C7819e(Context context) {
        this.f17280a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final boolean mo17023a(Object obj, C7114e eVar) throws IOException {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
        return mo20347c((Uri) obj);
    }

    /* renamed from: c */
    public final C6051s mo20347c(Uri uri) {
        Context context;
        int i;
        String authority = uri.getAuthority();
        if (authority.equals(this.f17280a.getPackageName())) {
            context = this.f17280a;
        } else {
            try {
                context = this.f17280a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (authority.contains(this.f17280a.getPackageName())) {
                    context = this.f17280a;
                } else {
                    throw new IllegalArgumentException(C0073e.m206f("Failed to obtain context or unrecognized Uri format for: ", uri), e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            i = context.getResources().getIdentifier(str2, str, authority2);
            if (i == 0) {
                i = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (i == 0) {
                throw new IllegalArgumentException(C0073e.m206f("Failed to find resource id for: ", uri));
            }
        } else if (pathSegments.size() == 1) {
            try {
                i = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(C0073e.m206f("Unrecognized Uri format: ", uri), e2);
            }
        } else {
            throw new IllegalArgumentException(C0073e.m206f("Unrecognized Uri format: ", uri));
        }
        Drawable a = C7816b.m15070a(this.f17280a, context, i, (Resources.Theme) null);
        if (a != null) {
            return new C7818d(a);
        }
        return null;
    }
}
