package p552dn;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import androidx.compose.p015ui.platform.C1858o;
import com.google.android.datatransport.C6518e;
import com.google.firebase.installations.C16563d;
import com.google.firebase.perf.config.C16594a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.C16626b;
import com.google.firebase.perf.util.C16630e;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C19543e0;
import p568fn.C17781a;
import p575gm.C17793c;
import p616ln.C18208f;
import p632nn.C18281g;
import p722ym.C18895a;

/* renamed from: dn.b */
public final class C17697b {

    /* renamed from: g */
    public static final C17781a f38492g = C17781a.m29823d();

    /* renamed from: a */
    public final ConcurrentHashMap f38493a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C16594a f38494b;

    /* renamed from: c */
    public Boolean f38495c;

    /* renamed from: d */
    public final C18895a<C18281g> f38496d;

    /* renamed from: e */
    public final C16563d f38497e;

    /* renamed from: f */
    public final C18895a<C6518e> f38498f;

    public C17697b(C17793c cVar, C18895a<C18281g> aVar, C16563d dVar, C18895a<C6518e> aVar2, RemoteConfigManager remoteConfigManager, C16594a aVar3, SessionManager sessionManager) {
        C16626b bVar;
        Bundle bundle = null;
        this.f38495c = null;
        this.f38496d = aVar;
        this.f38497e = dVar;
        this.f38498f = aVar2;
        if (cVar == null) {
            this.f38495c = Boolean.FALSE;
            this.f38494b = aVar3;
            new C16626b(new Bundle());
            return;
        }
        C18208f fVar = C18208f.f39882t;
        fVar.f39886e = cVar;
        cVar.mo69021a();
        fVar.f39898q = cVar.f38674c.f38690g;
        fVar.f39888g = dVar;
        fVar.f39889h = aVar2;
        fVar.f39891j.execute(new C1858o(fVar, 6));
        cVar.mo69021a();
        Context context = cVar.f38672a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            StringBuilder h = C0072d.m201h("No perf enable meta data found ");
            h.append(e.getMessage());
            Log.d("isEnabled", h.toString());
        }
        if (bundle == null) {
            bVar = new C16626b();
        }
        remoteConfigManager.setFirebaseRemoteConfigProvider(aVar);
        this.f38494b = aVar3;
        aVar3.f36830b = bVar;
        C16594a.f36827d.f38630b = C16630e.m27495a(context);
        aVar3.f36831c.mo59260b(context);
        sessionManager.setApplicationContext(context);
        Boolean g = aVar3.mo59253g();
        this.f38495c = g;
        C17781a aVar4 = f38492g;
        if (aVar4.f38630b) {
            if (g != null ? g.booleanValue() : C17793c.m29919b().mo69025f()) {
                cVar.mo69021a();
                String format = String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[]{String.format("%s/trends?utm_source=%s&utm_medium=%s", new Object[]{C19543e0.m33303U(cVar.f38674c.f38690g, context.getPackageName()), "perf-android-sdk", "android-ide"})});
                if (aVar4.f38630b) {
                    aVar4.f38629a.getClass();
                    Log.i("FirebasePerformance", format);
                }
            }
        }
    }

    /* renamed from: a */
    public static C17697b m29701a() {
        C17793c b = C17793c.m29919b();
        b.mo69021a();
        return (C17697b) b.f38675d.get(C17697b.class);
    }
}
