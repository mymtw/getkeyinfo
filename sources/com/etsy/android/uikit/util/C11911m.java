package com.etsy.android.uikit.util;

import android.support.p013v4.media.C0072d;
import android.view.View;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.ViewClickAnalyticsLog;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.datatypes.TrackedEtsyId;
import com.etsy.android.lib.models.datatypes.TrackedObject;
import com.etsy.android.lib.util.C8906j;
import com.etsy.android.lib.util.CrashUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p628nj.C18263b;

/* renamed from: com.etsy.android.uikit.util.m */
public abstract class C11911m {
    private ArrayList<C8698l> mEventTrackedObjects;
    private ArrayList<C8698l> mTrackedObjects;

    public C11911m() {
    }

    private void addTrackedObjects(C8698l... lVarArr) {
        ArrayList<C8698l> arrayList = this.mTrackedObjects;
        if (arrayList == null) {
            this.mTrackedObjects = new ArrayList<>(lVarArr.length);
        } else {
            arrayList.ensureCapacity(arrayList.size() + lVarArr.length);
        }
        for (C8698l lVar : lVarArr) {
            if (lVar != null) {
                this.mTrackedObjects.add(lVar);
            }
        }
    }

    private void onPostTrack() {
        ArrayList<C8698l> arrayList = this.mEventTrackedObjects;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void addEventTrackedObjects(C8698l... lVarArr) {
        ArrayList<C8698l> arrayList = this.mEventTrackedObjects;
        if (arrayList == null) {
            this.mEventTrackedObjects = new ArrayList<>(lVarArr.length);
        } else {
            arrayList.ensureCapacity(arrayList.size() + lVarArr.length);
        }
        for (C8698l lVar : lVarArr) {
            if (lVar != null) {
                this.mEventTrackedObjects.add(lVar);
            }
        }
    }

    public final HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        ArrayList<C8698l> arrayList = this.mTrackedObjects;
        HashMap<AnalyticsProperty, Object> hashMap = null;
        if (arrayList == null && this.mEventTrackedObjects == null) {
            return null;
        }
        if (arrayList != null) {
            hashMap = new HashMap<>(this.mTrackedObjects.size());
            Iterator<C8698l> it = this.mTrackedObjects.iterator();
            while (it.hasNext()) {
                C8698l next = it.next();
                C19383o.m32797g(next, "item");
                hashMap.putAll(C19388s.m32882r0(next));
            }
        }
        if (this.mEventTrackedObjects != null) {
            if (hashMap == null) {
                hashMap = new HashMap<>(this.mEventTrackedObjects.size());
            }
            Iterator<C8698l> it2 = this.mEventTrackedObjects.iterator();
            while (it2.hasNext()) {
                C8698l next2 = it2.next();
                C19383o.m32797g(next2, "item");
                hashMap.putAll(C19388s.m32882r0(next2));
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return r3.getClass().getSimpleName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return r3.getResources().getResourceName(r3.getId());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getViewName(android.view.View r3) {
        /*
            r2 = this;
            com.etsy.android.lib.logger.h r0 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.String r1 = "getViewName"
            r0.mo21310e(r1)
            android.content.res.Resources r0 = r3.getResources()     // Catch:{ NotFoundException -> 0x0014 }
            int r1 = r3.getId()     // Catch:{ NotFoundException -> 0x0014 }
            java.lang.String r3 = r0.getResourceEntryName(r1)     // Catch:{ NotFoundException -> 0x0014 }
            goto L_0x0029
        L_0x0014:
            android.content.res.Resources r0 = r3.getResources()     // Catch:{ NotFoundException -> 0x0021 }
            int r1 = r3.getId()     // Catch:{ NotFoundException -> 0x0021 }
            java.lang.String r3 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x0021 }
            goto L_0x0029
        L_0x0021:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.util.C11911m.getViewName(android.view.View):java.lang.String");
    }

    public void onPreTrack() {
    }

    public final void trackAction(View view, ViewClickAnalyticsLog.ViewAction viewAction) {
        C8703p b;
        C8694h hVar = C8694h.f19097a;
        StringBuilder h = C0072d.m201h("trackAction: ");
        h.append(viewAction.name());
        hVar.mo21310e(h.toString());
        List<String> list = C8591a.f18700r;
        C8623e eVar = C18263b.f40056T.f18706f;
        if (eVar != null && eVar.mo21132b(C8592b.f18729E) && (b = C11895a.m19621b(view)) != null) {
            String viewName = getViewName(view);
            onPreTrack();
            hVar.mo21310e("Tracking click on " + viewName + ", in class: " + view.getClass().getSimpleName() + " in: " + b.f19060b);
            HashMap<AnalyticsProperty, Object> trackingParameters = getTrackingParameters();
            b.mo21364l(viewName, viewAction, trackingParameters);
            HashMap hashMap = new HashMap();
            hashMap.put("tracker", b.f19060b);
            hashMap.put(ResponseConstants.ACTION, viewAction.name());
            if (trackingParameters != null) {
                for (Map.Entry<AnalyticsProperty, Object> lambda$trackAction$0 : trackingParameters.entrySet()) {
                    C19394m unused = hashMap.put(((AnalyticsProperty) lambda$trackAction$0.getKey()).toString(), lambda$trackAction$0.getValue().toString());
                }
            }
            C19383o.m32797g(viewName, "crumb");
            CrashUtil.m17307a().mo30460e(new C8906j.C8911e(viewName, hashMap));
            onPostTrack();
        }
    }

    public C11911m(AnalyticsProperty analyticsProperty, Object obj) {
        this(new TrackedObject(analyticsProperty, obj));
    }

    public C11911m(AnalyticsProperty analyticsProperty, EtsyId etsyId) {
        this(new TrackedEtsyId(analyticsProperty, etsyId));
    }

    public C11911m(C8698l... lVarArr) {
        addTrackedObjects(lVarArr);
    }
}
