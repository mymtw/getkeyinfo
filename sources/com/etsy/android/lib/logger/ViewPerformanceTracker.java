package com.etsy.android.lib.logger;

import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.lib.logger.perf.C8708e;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.logger.perf.TimedMetric;
import com.etsy.android.lib.models.editable.EditableListing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

public final class ViewPerformanceTracker implements C8709f {

    /* renamed from: a */
    public final C8708e f19052a;

    /* renamed from: b */
    public final C8694h f19053b;

    /* renamed from: c */
    public final ConcurrentHashMap<TimedMetric, List<C8707d>> f19054c;

    public ViewPerformanceTracker(C8708e eVar, C8694h hVar) {
        C19383o.m32797g(eVar, "performanceTimerFactory");
        C19383o.m32797g(hVar, "logCat");
        this.f19052a = eVar;
        this.f19053b = hVar;
        ConcurrentHashMap<TimedMetric, List<C8707d>> concurrentHashMap = new ConcurrentHashMap<>();
        this.f19054c = concurrentHashMap;
        TimedMetric timedMetric = TimedMetric.TIME_TO_FIRST_CONTENT;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        C19383o.m32796f(synchronizedList, "synchronizedList(mutableListOf())");
        concurrentHashMap.put(timedMetric, synchronizedList);
        TimedMetric timedMetric2 = TimedMetric.BLOCKING_NETWORK;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        C19383o.m32796f(synchronizedList2, "synchronizedList(mutableListOf())");
        concurrentHashMap.put(timedMetric2, synchronizedList2);
        TimedMetric timedMetric3 = TimedMetric.NONBLOCKING_NETWORK;
        List synchronizedList3 = Collections.synchronizedList(new ArrayList());
        C19383o.m32796f(synchronizedList3, "synchronizedList(mutableListOf())");
        concurrentHashMap.put(timedMetric3, synchronizedList3);
    }

    /* renamed from: a */
    public final C8707d mo21328a(TimedMetric timedMetric) {
        C19383o.m32797g(timedMetric, "timedMetric");
        C8707d dVar = new C8707d(this.f19052a.f19130a);
        boolean z = false;
        if (this.f19054c.containsKey(timedMetric)) {
            List list = this.f19054c.get(timedMetric);
            if (list != null) {
                list.add(dVar);
            }
        } else {
            ConcurrentHashMap<TimedMetric, List<C8707d>> concurrentHashMap = this.f19054c;
            List synchronizedList = Collections.synchronizedList(C17782b.m29866f0(dVar));
            C19383o.m32796f(synchronizedList, "synchronizedList(mutableListOf(timer))");
            concurrentHashMap.put(timedMetric, synchronizedList);
        }
        if (dVar.f19128b != -1) {
            z = true;
        }
        if (!z) {
            dVar.f19127a.getClass();
            dVar.f19128b = System.currentTimeMillis();
        }
        return dVar;
    }

    /* renamed from: b */
    public final void mo21329b(AnalyticsLog analyticsLog) {
        AnalyticsLog analyticsLog2 = analyticsLog;
        C19383o.m32797g(analyticsLog2, "analyticsLog");
        for (Map.Entry next : this.f19054c.entrySet()) {
            TimedMetric timedMetric = (TimedMetric) next.getKey();
            List<C8707d> list = (List) next.getValue();
            if (!timedMetric.isTimerGrouped()) {
                if (list.isEmpty()) {
                    analyticsLog2.mo21281a(timedMetric.getAnalyticsLogAttribute(), 0);
                } else {
                    AnalyticsProperty analyticsLogAttribute = timedMetric.getAnalyticsLogAttribute();
                    long j = ((C8707d) list.get(0)).f19129c;
                    analyticsLog2.mo21281a(analyticsLogAttribute, (j > -1 ? 1 : (j == -1 ? 0 : -1)) != 0 ? String.valueOf(j) : EditableListing.LISTING_ID_DEVICE_DRAFT);
                }
            } else if (list.isEmpty()) {
                analyticsLog2.mo21281a(timedMetric.getCountAttribute(), 0);
                analyticsLog2.mo21281a(timedMetric.getDurationAttribute(), 0L);
                analyticsLog2.mo21281a(timedMetric.getAnalyticsLogAttribute(), "");
            } else {
                AnalyticsProperty countAttribute = timedMetric.getCountAttribute();
                Integer num = 0;
                for (C8707d dVar : list) {
                    int intValue = num.intValue();
                    if (dVar.f19129c != -1) {
                        intValue++;
                    }
                    num = Integer.valueOf(intValue);
                }
                analyticsLog2.mo21281a(countAttribute, num);
                AnalyticsProperty durationAttribute = timedMetric.getDurationAttribute();
                Long l = 0L;
                for (C8707d dVar2 : list) {
                    long longValue = l.longValue();
                    long j2 = dVar2.f19129c;
                    if (j2 != -1) {
                        longValue += j2;
                    }
                    l = Long.valueOf(longValue);
                }
                analyticsLog2.mo21281a(durationAttribute, l);
                analyticsLog2.mo21281a(timedMetric.getAnalyticsLogAttribute(), C19327t.m32644Z0(C19327t.m32657m1(list, 20), ",", (String) null, (String) null, ViewPerformanceTracker$drainTimers$3.INSTANCE, 30));
            }
        }
        this.f19054c.clear();
    }
}
