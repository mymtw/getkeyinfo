package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.resource.bitmap.C6097r;
import java.io.IOException;
import p150j4.C7114e;
import p150j4.C7115f;

/* renamed from: com.bumptech.glide.load.resource.bitmap.u */
public final class C6103u implements C7115f<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    public final C6088l f13126a;

    public C6103u(C6088l lVar) {
        this.f13126a = lVar;
    }

    /* renamed from: a */
    public final boolean mo17023a(Object obj, C7114e eVar) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        String str = Build.MANUFACTURER;
        if (!((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912)) {
            return false;
        }
        this.f13126a.getClass();
        return true;
    }

    /* renamed from: b */
    public final C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
        C6088l lVar = this.f13126a;
        return lVar.mo17036a(new C6097r.C6100c((ParcelFileDescriptor) obj, lVar.f13097d, lVar.f13096c), i, i2, eVar, C6088l.f13091k);
    }
}
