package androidx.room;

import android.database.Cursor;
import android.os.Bundle;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8701o;
import com.etsy.android.lib.logger.ViewAnalyticsParameters;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.platforminfo.C16681a;
import com.google.firebase.platforminfo.C16682b;
import com.google.firebase.platforminfo.C16683c;
import java.util.Set;
import p112g2.C6831a;
import p146j.C7096a;
import p513bj.C14052d;
import p594jh.C17909f;
import p649pm.C18400e;
import p649pm.C18415r;

/* renamed from: androidx.room.a */
public final /* synthetic */ class C3217a implements C7096a, C8701o.C8702a, C6599q.C6600a, C14052d, C17909f, C18400e {

    /* renamed from: b */
    public final /* synthetic */ int f7486b;

    public /* synthetic */ C3217a(int i) {
        this.f7486b = i;
    }

    /* renamed from: a */
    public Object mo11995a(Bundle bundle, String str) {
        ViewAnalyticsParameters.C8668a aVar = ViewAnalyticsParameters.f19047a;
        Object obj = bundle.get(str);
        if (obj instanceof EtsyId) {
            return ((EtsyId) obj).getId();
        }
        if (obj instanceof Long) {
            return String.valueOf((Long) obj);
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        C8694h.f19097a.mo21313g(String.format("Got an unexpected value for id: %s", new Object[]{obj.toString()}));
        return null;
    }

    public void accept(Object obj) {
        ((C14216b.C14217a) obj).mo47329a();
    }

    public Object apply(Object obj) {
        switch (this.f7486b) {
            case 0:
                return Boolean.valueOf(((C6831a) obj).mo18969u0());
            default:
                C6493a aVar = C6599q.f14568g;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
        }
    }

    /* renamed from: f */
    public Object mo56f(C18415r rVar) {
        switch (this.f7486b) {
            case 0:
                return TransportRegistrar.lambda$getComponents$0(rVar);
            default:
                Set<C16683c> c = rVar.mo11180c(C16683c.class);
                C16682b bVar = C16682b.f36887b;
                if (bVar == null) {
                    synchronized (C16682b.class) {
                        bVar = C16682b.f36887b;
                        if (bVar == null) {
                            bVar = new C16682b();
                            C16682b.f36887b = bVar;
                        }
                    }
                }
                return new C16681a(c, bVar);
        }
    }
}
