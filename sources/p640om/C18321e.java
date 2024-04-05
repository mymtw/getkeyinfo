package p640om;

import android.content.Context;
import com.google.firebase.appindexing.FirebaseAppIndexingInvalidArgumentException;
import com.google.firebase.appindexing.internal.zzc;
import p605kk.C18123g;
import p605kk.C18126j;
import p623mm.C18246a;
import p623mm.C18251e;

/* renamed from: om.e */
public final class C18321e extends C18251e {

    /* renamed from: b */
    public final C18319c f40218b;

    public C18321e(Context context) {
        this.f40218b = new C18319c(context);
    }

    /* renamed from: a */
    public final C18123g<Void> mo69797a(C18246a aVar) {
        zzc[] zzcArr = new zzc[1];
        if (!(aVar instanceof zzc)) {
            return C18126j.m30616d(new FirebaseAppIndexingInvalidArgumentException("Custom Action objects are not allowed. Please use the 'Actions' or 'ActionBuilder' class for creating Action objects."));
        }
        zzc zzc = (zzc) aVar;
        zzcArr[0] = zzc;
        zzc.zza().zza(2);
        return this.f40218b.doWrite(new C18318b(zzcArr));
    }
}
