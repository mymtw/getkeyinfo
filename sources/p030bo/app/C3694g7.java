package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.search.C8971c;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.C16688a;
import com.google.firebase.remoteconfig.internal.C16690b;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p248tp.C8049b;
import p248tp.C8051d;
import p605kk.C18116a;
import p605kk.C18121e;
import p605kk.C18123g;

/* renamed from: bo.app.g7 */
public final /* synthetic */ class C3694g7 implements C18121e, C8051d, C18116a {

    /* renamed from: b */
    public final /* synthetic */ Object f8450b;

    /* renamed from: c */
    public final /* synthetic */ Object f8451c;

    public /* synthetic */ C3694g7(Object obj, Object obj2) {
        this.f8450b = obj;
        this.f8451c = obj2;
    }

    /* renamed from: d */
    public final void mo10586d(C8049b bVar) {
        C8971c cVar = (C8971c) this.f8450b;
        String str = (String) this.f8451c;
        C19383o.m32797g(cVar, "this$0");
        C19383o.m32797g(str, "$result");
        SharedPreferences.Editor edit = cVar.f19792d.edit();
        edit.putString("AutoSuggest", str);
        edit.apply();
        bVar.onComplete();
    }

    public final void onSuccess(Object obj) {
        C3977n1.m9206b((Context) this.f8450b, (List) this.f8451c, (Void) obj);
    }

    public final Object then(C18123g gVar) {
        C16688a aVar = (C16688a) this.f8450b;
        Date date = (Date) this.f8451c;
        int[] iArr = C16688a.f36900k;
        aVar.getClass();
        if (gVar.mo69668o()) {
            C16690b bVar = aVar.f36908h;
            synchronized (bVar.f36916b) {
                bVar.f36915a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception j = gVar.mo69663j();
            if (j != null) {
                if (j instanceof FirebaseRemoteConfigFetchThrottledException) {
                    C16690b bVar2 = aVar.f36908h;
                    synchronized (bVar2.f36916b) {
                        bVar2.f36915a.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    C16690b bVar3 = aVar.f36908h;
                    synchronized (bVar3.f36916b) {
                        bVar3.f36915a.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return gVar;
    }
}
