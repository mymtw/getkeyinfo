package p325cg;

import android.os.Bundle;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import p365hg.C12869i0;
import p365hg.C12882n;
import p401mg.C13080a;
import p484xf.C13882a;

/* renamed from: cg.d */
public final class C8589d {

    /* renamed from: a */
    public static final String f18693a = RemoteServiceWrapper.class.getSimpleName();

    /* renamed from: b */
    public static final C8589d f18694b = new C8589d();

    /* renamed from: a */
    public static final Bundle m16986a(RemoteServiceWrapper.EventType eventType, String str, List<AppEvent> list) {
        Class<C8589d> cls = C8589d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(eventType, "eventType");
            C19383o.m32797g(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", str);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
                JSONArray b = f18694b.mo21097b(str, list);
                if (b.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b.toString());
            }
            return bundle;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final JSONArray mo21097b(String str, List list) {
        JSONArray jSONArray;
        ArrayList q1;
        boolean z;
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            jSONArray = new JSONArray();
            q1 = C19327t.m32661q1(list);
            C13882a.m21407b(q1);
            z = false;
            if (!C13080a.m20762b(this)) {
                C12882n f = FetchedAppSettingsManager.m20107f(str, false);
                if (f != null) {
                    z = f.f28397a;
                }
            }
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
        Iterator it = q1.iterator();
        while (it.hasNext()) {
            AppEvent appEvent = (AppEvent) it.next();
            if (!appEvent.isChecksumValid()) {
                String str2 = f18693a;
                C12869i0.m20551G(str2, "Event with invalid checksum: " + appEvent);
            } else if ((!appEvent.isImplicit()) || (appEvent.isImplicit() && z)) {
                jSONArray.put(appEvent.getJsonObject());
            }
        }
        return jSONArray;
    }
}
