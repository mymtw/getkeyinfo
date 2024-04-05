package com.squareup.picasso;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import com.squareup.picasso.C17462u;
import com.squareup.picasso.Picasso;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import p756lr.C19888c0;

/* renamed from: com.squareup.picasso.v */
public final class C17464v extends C17462u {

    /* renamed from: a */
    public final Context f38181a;

    public C17464v(Context context) {
        this.f38181a = context;
    }

    /* renamed from: b */
    public final boolean mo68565b(C17459s sVar) {
        if (sVar.f38150d != 0) {
            return true;
        }
        return "android.resource".equals(sVar.f38149c.getScheme());
    }

    /* renamed from: e */
    public final C17462u.C17463a mo68566e(C17459s sVar, int i) throws IOException {
        Resources resources;
        Uri uri;
        Uri uri2;
        Context context = this.f38181a;
        StringBuilder sb = C17427a0.f38069a;
        if (sVar.f38150d != 0 || (uri2 = sVar.f38149c) == null) {
            resources = context.getResources();
        } else {
            String authority = uri2.getAuthority();
            if (authority != null) {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    StringBuilder h = C0072d.m201h("Unable to obtain resources for package: ");
                    h.append(sVar.f38149c);
                    throw new FileNotFoundException(h.toString());
                }
            } else {
                StringBuilder h2 = C0072d.m201h("No package provided: ");
                h2.append(sVar.f38149c);
                throw new FileNotFoundException(h2.toString());
            }
        }
        int i2 = sVar.f38150d;
        boolean z = true;
        if (i2 == 0 && (uri = sVar.f38149c) != null) {
            String authority2 = uri.getAuthority();
            if (authority2 != null) {
                List<String> pathSegments = sVar.f38149c.getPathSegments();
                if (pathSegments == null || pathSegments.isEmpty()) {
                    StringBuilder h3 = C0072d.m201h("No path segments: ");
                    h3.append(sVar.f38149c);
                    throw new FileNotFoundException(h3.toString());
                } else if (pathSegments.size() == 1) {
                    try {
                        i2 = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused2) {
                        StringBuilder h4 = C0072d.m201h("Last path segment is not a resource ID: ");
                        h4.append(sVar.f38149c);
                        throw new FileNotFoundException(h4.toString());
                    }
                } else if (pathSegments.size() == 2) {
                    i2 = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                } else {
                    StringBuilder h5 = C0072d.m201h("More than two path segments: ");
                    h5.append(sVar.f38149c);
                    throw new FileNotFoundException(h5.toString());
                }
            } else {
                StringBuilder h6 = C0072d.m201h("No package provided: ");
                h6.append(sVar.f38149c);
                throw new FileNotFoundException(h6.toString());
            }
        }
        BitmapFactory.Options c = C17462u.m29321c(sVar);
        if (c == null || !c.inJustDecodeBounds) {
            z = false;
        }
        if (z) {
            BitmapFactory.decodeResource(resources, i2, c);
            C17462u.m29320a(sVar.f38152f, sVar.f38153g, c.outWidth, c.outHeight, c, sVar);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, c);
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        if (decodeResource != null) {
            return new C17462u.C17463a(decodeResource, (C19888c0) null, loadedFrom, 0);
        }
        throw new NullPointerException("bitmap == null");
    }
}
