package com.paypal.pyplcheckout.common.instrumentation.amplitude.dao;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.google.gson.JsonParseException;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeSession;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;

public final class SharedPrefAmplitudeDao implements AmplitudeDao {
    private final String TAG = "SharedPrefAmplitudeDao";
    /* access modifiers changed from: private */
    public final C16708i gson;
    private AmplitudeSession internalAmplitudeSession;
    /* access modifiers changed from: private */
    public List<AmplitudeEvent> internalEvents;
    /* access modifiers changed from: private */
    public final SharedPreferences sharedPreferences;

    public SharedPrefAmplitudeDao(Context context, C16708i iVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(iVar, "gson");
        this.gson = iVar;
        this.sharedPreferences = context.getSharedPreferences(SharedPrefAmplitudeDao.class.getName(), 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.List<com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent> getStoredEvents() throws com.google.gson.JsonParseException {
        /*
            r3 = this;
            android.content.SharedPreferences r0 = r3.sharedPreferences
            java.lang.String r1 = "PENDING_EVENTS"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x001e
        L_0x000c:
            com.google.gson.i r1 = r3.gson
            com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.SharedPrefAmplitudeDao$getStoredEvents$1$1 r2 = new com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.SharedPrefAmplitudeDao$getStoredEvents$1$1
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            java.lang.Object r0 = r1.mo59459f(r0, r2)
            r2 = r0
            java.util.List r2 = (java.util.List) r2
        L_0x001e:
            if (r2 != 0) goto L_0x0022
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE
        L_0x0022:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.SharedPrefAmplitudeDao.getStoredEvents():java.util.List");
    }

    public void cacheAmplitudeSession(AmplitudeSession amplitudeSession) throws JsonParseException {
        this.sharedPreferences.edit().putString(SharedPrefAmplitudeDaoKt.AMPLITUDE_SESSION, this.gson.mo59463j(amplitudeSession)).apply();
        this.internalAmplitudeSession = amplitudeSession;
    }

    public synchronized Object cachePendingEvents(List<AmplitudeEvent> list, C19340c<? super C19394m> cVar) throws Exception {
        Object h = C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new SharedPrefAmplitudeDao$cachePendingEvents$2(this, list, (C19340c<? super SharedPrefAmplitudeDao$cachePendingEvents$2>) null));
        if (h == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return h;
        }
        return C19394m.f43287a;
    }

    public synchronized Object clearPendingEvents(C19340c<? super C19394m> cVar) {
        Object h = C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new SharedPrefAmplitudeDao$clearPendingEvents$2(this, (C19340c<? super SharedPrefAmplitudeDao$clearPendingEvents$2>) null));
        if (h == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return h;
        }
        return C19394m.f43287a;
    }

    public AmplitudeSession getAmplitudeSession() {
        try {
            AmplitudeSession amplitudeSession = this.internalAmplitudeSession;
            if (amplitudeSession == null) {
                amplitudeSession = (AmplitudeSession) this.gson.mo59458e(AmplitudeSession.class, this.sharedPreferences.getString(SharedPrefAmplitudeDaoKt.AMPLITUDE_SESSION, (String) null));
            }
            return amplitudeSession;
        } catch (Exception unused) {
            return null;
        }
    }

    public synchronized List<AmplitudeEvent> getPendingEvents() {
        List<AmplitudeEvent> list;
        list = this.internalEvents;
        if (list == null) {
            try {
                list = getStoredEvents();
            } catch (Exception e) {
                String str = this.TAG;
                C19383o.m32796f(str, "TAG");
                String simpleName = e.getClass().getSimpleName();
                String message = e.getMessage();
                PLog.e$default(str, "Error parsing AmplitudeEvents " + simpleName + " : " + message, (Throwable) null, 0, 12, (Object) null);
                list = EmptyList.INSTANCE;
            }
        }
        return list;
    }
}
