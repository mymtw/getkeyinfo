package p641on;

import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.C16688a;
import com.google.firebase.remoteconfig.internal.C16690b;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import p030bo.app.C3694g7;
import p605kk.C18116a;
import p605kk.C18117a0;
import p605kk.C18123g;
import p605kk.C18126j;

/* renamed from: on.f */
public final /* synthetic */ class C18328f implements C18116a {

    /* renamed from: b */
    public final /* synthetic */ C16688a f40237b;

    /* renamed from: c */
    public final /* synthetic */ long f40238c;

    public /* synthetic */ C18328f(C16688a aVar, long j) {
        this.f40237b = aVar;
        this.f40238c = j;
    }

    public final Object then(C18123g gVar) {
        C18123g<TContinuationResult> gVar2;
        boolean z;
        C16688a aVar = this.f40237b;
        long j = this.f40238c;
        aVar.getClass();
        Date date = new Date(aVar.f36904d.currentTimeMillis());
        Date date2 = null;
        if (gVar.mo69668o()) {
            C16690b bVar = aVar.f36908h;
            bVar.getClass();
            Date date3 = new Date(bVar.f36915a.getLong("last_fetch_time_in_millis", -1));
            if (date3.equals(C16690b.f36913d)) {
                z = false;
            } else {
                z = date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date3.getTime()));
            }
            if (z) {
                return C18126j.m30617e(new C16688a.C16689a(2, (C18327e) null, (String) null));
            }
        }
        Date date4 = aVar.f36908h.mo59445a().f36919b;
        if (date.before(date4)) {
            date2 = date4;
        }
        if (date2 != null) {
            gVar2 = C18126j.m30616d(new FirebaseRemoteConfigFetchThrottledException(String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()))}), date2.getTime()));
        } else {
            C18117a0 id = aVar.f36901a.getId();
            C18117a0 token = aVar.f36901a.getToken();
            gVar2 = C18126j.m30618f(id, token).mo69662i(aVar.f36903c, new C18329g(aVar, id, token, date));
        }
        return gVar2.mo69662i(aVar.f36903c, new C3694g7(aVar, date));
    }
}
