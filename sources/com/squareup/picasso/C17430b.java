package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.picasso.C17462u;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import p756lr.C19906r;

/* renamed from: com.squareup.picasso.b */
public final class C17430b extends C17462u {

    /* renamed from: a */
    public final Context f38072a;

    /* renamed from: b */
    public final Object f38073b = new Object();

    /* renamed from: c */
    public AssetManager f38074c;

    public C17430b(Context context) {
        this.f38072a = context;
    }

    /* renamed from: b */
    public final boolean mo68565b(C17459s sVar) {
        Uri uri = sVar.f38149c;
        return ResponseConstants.FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* renamed from: e */
    public final C17462u.C17463a mo68566e(C17459s sVar, int i) throws IOException {
        if (this.f38074c == null) {
            synchronized (this.f38073b) {
                if (this.f38074c == null) {
                    this.f38074c = this.f38072a.getAssets();
                }
            }
        }
        return new C17462u.C17463a(C19906r.m34002f(this.f38074c.open(sVar.f38149c.toString().substring(22))), Picasso.LoadedFrom.DISK);
    }
}
