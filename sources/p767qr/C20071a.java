package p767qr;

import com.google.gson.C16708i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C19928a0;
import p675sn.C18541a;
import retrofit2.C20099f;
import retrofit2.C20146w;

/* renamed from: qr.a */
public final class C20071a extends C20099f.C20100a {

    /* renamed from: a */
    public final C16708i f44451a;

    public C20071a(C16708i iVar) {
        this.f44451a = iVar;
    }

    /* renamed from: a */
    public final C20099f mo74337a(Type type, Annotation[] annotationArr) {
        return new C20072b(this.f44451a, this.f44451a.mo59460g(C18541a.get(type)));
    }

    /* renamed from: b */
    public final C20099f<C19928a0, ?> mo74338b(Type type, Annotation[] annotationArr, C20146w wVar) {
        return new C20073c(this.f44451a, this.f44451a.mo59460g(C18541a.get(type)));
    }
}
