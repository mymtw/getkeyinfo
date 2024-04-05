package com.squareup.picasso;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.picasso.C17462u;
import com.squareup.picasso.Picasso;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p756lr.C19906r;

/* renamed from: com.squareup.picasso.g */
public class C17441g extends C17462u {

    /* renamed from: a */
    public final Context f38105a;

    public C17441g(Context context) {
        this.f38105a = context;
    }

    /* renamed from: b */
    public boolean mo68565b(C17459s sVar) {
        return ResponseConstants.CONTENT.equals(sVar.f38149c.getScheme());
    }

    /* renamed from: e */
    public C17462u.C17463a mo68566e(C17459s sVar, int i) throws IOException {
        return new C17462u.C17463a(C19906r.m34002f(mo68598g(sVar)), Picasso.LoadedFrom.DISK);
    }

    /* renamed from: g */
    public final InputStream mo68598g(C17459s sVar) throws FileNotFoundException {
        return this.f38105a.getContentResolver().openInputStream(sVar.f38149c);
    }
}
