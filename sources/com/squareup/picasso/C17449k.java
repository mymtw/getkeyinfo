package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.picasso.C17462u;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import p185n1.C7369a;
import p756lr.C19905q;
import p756lr.C19906r;

/* renamed from: com.squareup.picasso.k */
public final class C17449k extends C17441g {
    public C17449k(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final boolean mo68565b(C17459s sVar) {
        return ResponseConstants.FILE.equals(sVar.f38149c.getScheme());
    }

    /* renamed from: e */
    public final C17462u.C17463a mo68566e(C17459s sVar, int i) throws IOException {
        C19905q f = C19906r.m34002f(mo68598g(sVar));
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        C7369a aVar = new C7369a(sVar.f38149c.getPath());
        C7369a.C7372c e = aVar.mo19667e("Orientation");
        int i2 = 1;
        if (e != null) {
            try {
                i2 = e.mo19711f(aVar.f16467g);
            } catch (NumberFormatException unused) {
            }
        }
        return new C17462u.C17463a((Bitmap) null, f, loadedFrom, i2);
    }
}
