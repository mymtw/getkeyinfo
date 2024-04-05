package p455u9;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import p248tp.C8072t;
import p248tp.C8074v;

/* renamed from: u9.e */
public final /* synthetic */ class C13451e implements C8074v {

    /* renamed from: b */
    public final /* synthetic */ Context f29472b;

    /* renamed from: c */
    public final /* synthetic */ Uri f29473c;

    /* renamed from: d */
    public final /* synthetic */ boolean f29474d = true;

    public /* synthetic */ C13451e(Context context, Uri uri) {
        this.f29472b = context;
        this.f29473c = uri;
    }

    /* renamed from: f */
    public final void mo11996f(C8072t tVar) {
        Bitmap d = C13452f.m21227d(this.f29472b, this.f29473c, this.f29474d);
        if (d == null) {
            tVar.tryOnError(new Throwable("Got null bitmap"));
        } else {
            tVar.onSuccess(d);
        }
    }
}
