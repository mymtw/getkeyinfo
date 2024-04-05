package p188n4;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.util.HashMap;
import p036c5.C4422i;
import p036c5.C4426l;
import p168l4.C7257i;
import p188n4.C7450d;

/* renamed from: n4.b */
public final class C7448b {

    /* renamed from: a */
    public final C7257i f16641a;

    /* renamed from: b */
    public final C5998d f16642b;

    /* renamed from: c */
    public C7445a f16643c;

    public C7448b(C7257i iVar, C5998d dVar, DecodeFormat decodeFormat) {
        this.f16641a = iVar;
        this.f16642b = dVar;
    }

    /* renamed from: a */
    public final void mo19820a(C7450d.C7451a... aVarArr) {
        long j;
        long j2;
        C7445a aVar = this.f16643c;
        if (aVar != null) {
            aVar.f16640i = true;
        }
        int length = aVarArr.length;
        C7450d[] dVarArr = new C7450d[length];
        if (aVarArr.length <= 0) {
            C4422i iVar = (C4422i) this.f16641a;
            synchronized (iVar) {
                j = iVar.f9702c;
            }
            C4422i iVar2 = (C4422i) this.f16641a;
            synchronized (iVar2) {
                j2 = iVar2.f9703d;
            }
            long f = this.f16642b.mo16925f() + (j - j2);
            for (int i = 0; i < length; i++) {
                dVarArr[i].getClass();
            }
            float f2 = (float) 0;
            float f3 = ((float) f) / f2;
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < length; i2++) {
                C7450d dVar = dVarArr[i2];
                dVar.getClass();
                hashMap.put(dVar, Integer.valueOf(Math.round(f2 * f3) / (C4426l.m10130d((Bitmap.Config) null) * 0)));
            }
            C7445a aVar2 = new C7445a(this.f16642b, this.f16641a, new C7449c(hashMap));
            this.f16643c = aVar2;
            C4426l.m10132f().post(aVar2);
            return;
        }
        C7450d.C7451a aVar3 = aVarArr[0];
        throw null;
    }
}
