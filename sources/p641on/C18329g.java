package p641on;

import com.google.firebase.installations.C16566g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.C16688a;
import java.util.Date;
import p306z8.C8477d;
import p605kk.C18116a;
import p605kk.C18123g;
import p605kk.C18126j;

/* renamed from: on.g */
public final /* synthetic */ class C18329g implements C18116a {

    /* renamed from: b */
    public final /* synthetic */ C16688a f40239b;

    /* renamed from: c */
    public final /* synthetic */ C18123g f40240c;

    /* renamed from: d */
    public final /* synthetic */ C18123g f40241d;

    /* renamed from: e */
    public final /* synthetic */ Date f40242e;

    public /* synthetic */ C18329g(C16688a aVar, C18123g gVar, C18123g gVar2, Date date) {
        this.f40239b = aVar;
        this.f40240c = gVar;
        this.f40241d = gVar2;
        this.f40242e = date;
    }

    public final Object then(C18123g gVar) {
        C16688a aVar = this.f40239b;
        C18123g gVar2 = this.f40240c;
        C18123g gVar3 = this.f40241d;
        Date date = this.f40242e;
        aVar.getClass();
        if (!gVar2.mo69668o()) {
            return C18126j.m30616d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", gVar2.mo69663j()));
        }
        if (!gVar3.mo69668o()) {
            return C18126j.m30616d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", gVar3.mo69663j()));
        }
        try {
            C16688a.C16689a a = aVar.mo59443a((String) gVar2.mo69664k(), ((C16566g) gVar3.mo69664k()).getToken(), date);
            if (a.f36910a != 0) {
                return C18126j.m30617e(a);
            }
            C18325d dVar = aVar.f36906f;
            C18327e eVar = a.f36911b;
            return C18126j.m30615c(dVar.f40227a, new C18323b(dVar, eVar)).mo69669p(dVar.f40227a, new C18324c(dVar, eVar)).mo69669p(aVar.f36903c, new C8477d(a));
        } catch (FirebaseRemoteConfigException e) {
            return C18126j.m30616d(e);
        }
    }
}
