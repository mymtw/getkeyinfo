package com.etsy.android.lib.logger;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.bugsnag.android.C5718a1;
import com.bugsnag.android.C5777k;
import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5771f;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.lib.config.bucketing.C8612a;
import com.etsy.android.lib.config.bucketing.C8615c;
import com.etsy.android.lib.config.bucketing.C8616d;
import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.lib.config.bucketing.NativeConfig;
import com.etsy.android.lib.config.bucketing.NativeConfigBucketingMap;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8677e;
import com.etsy.android.lib.toolbar.C8860a;
import com.etsy.android.lib.util.C8883c0;
import com.etsy.android.lib.util.CrashUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.C19285c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import p307aa.C8495b;
import p307aa.C8496c;
import p409o9.C13125f;
import p425q9.C13258i;
import p425q9.C13265p;
import p425q9.C13274x;
import p628nj.C18263b;

/* renamed from: com.etsy.android.lib.logger.b */
public class C8672b {

    /* renamed from: d */
    public static final ExecutorService f19058d = Executors.newSingleThreadExecutor(new C13274x());

    /* renamed from: a */
    public final String f19059a = C8883c0.m17315a();

    /* renamed from: b */
    public final String f19060b;

    /* renamed from: c */
    public NativeConfigBucketingMap f19061c;

    /* renamed from: com.etsy.android.lib.logger.b$a */
    public static class C8673a implements Runnable {

        /* renamed from: b */
        public AnalyticsLog f19062b;

        public C8673a(AnalyticsLog analyticsLog) {
            this.f19062b = analyticsLog;
        }

        public final void run() {
            String str;
            AnalyticsLog analyticsLog = this.f19062b;
            analyticsLog.getClass();
            try {
                str = C13258i.f29122d.f29123a.writeValueAsString(analyticsLog.f19038d);
            } catch (JsonProcessingException e) {
                C8694h.f19097a.mo21309d("Analytics log toJSON", e);
                str = "";
            }
            try {
                SQLiteDatabase writableDatabase = AnalyticsLogDatabaseHelper.getInstance().getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(AnalyticsLogDatabaseHelper.LOG, str);
                C8694h.f19097a.mo21310e(String.format("saveLog = %s", new Object[]{str}));
                writableDatabase.insert(AnalyticsLogDatabaseHelper.TABLE, (String) null, contentValues);
            } catch (SQLException | NullPointerException e2) {
                C8694h.f19097a.mo21309d("Error saving analytics log to database", e2);
            }
        }
    }

    public C8672b(String str) {
        this.f19060b = str;
        this.f19061c = new NativeConfigBucketingMap(this);
    }

    /* renamed from: c */
    public static void m17069c(AnalyticsLog analyticsLog) {
        f19058d.submit(new C8673a(analyticsLog));
    }

    /* renamed from: a */
    public final C8615c mo21331a(NativeConfig nativeConfig) {
        long j;
        long j2;
        C8615c cVar;
        boolean z;
        NativeConfigBucketingMap nativeConfigBucketingMap = this.f19061c;
        nativeConfigBucketingMap.getClass();
        C19383o.m32797g(nativeConfig, "nativeConfig");
        LinkedHashMap linkedHashMap = C13125f.f28856a;
        String str = (String) C13125f.C13126a.m20790a().get(nativeConfig.f18917a);
        boolean z2 = false;
        if (str != null) {
            C8615c cVar2 = new C8615c(nativeConfig, Boolean.parseBoolean(str), (NativeConfig.C8609b.C8610a) null, false);
            C19285c<Map<NativeConfig, C8615c>> cVar3 = NativeConfigBucketingMap.f18920d;
            NativeConfigBucketingMap.C8611a.m17001a().put(nativeConfig, cVar2);
            NativeConfigBucketingMap.m17000a();
            return cVar2;
        }
        C8623e b = nativeConfigBucketingMap.f18921a.mo21332b();
        EtsyConfigKey etsyConfigKey = C8592b.f18737I;
        StringBuilder h = C0072d.m201h("DisableNativeFlag.");
        h.append(nativeConfig.f18917a);
        if (!b.mo21133c(etsyConfigKey, h.toString()).mo45840h()) {
            C8615c cVar4 = new C8615c(nativeConfig, false, (NativeConfig.C8609b.C8610a) null, false);
            C19285c<Map<NativeConfig, C8615c>> cVar5 = NativeConfigBucketingMap.f18920d;
            NativeConfigBucketingMap.C8611a.m17001a().put(nativeConfig, cVar4);
            NativeConfigBucketingMap.m17000a();
            return cVar4;
        }
        if (C0326j.m869n(BuildTarget.Companion)) {
            C8617e nativeConfigs = EtsyApplication.get().getNativeConfigs();
            C19383o.m32796f(nativeConfigs, "get().nativeConfigs");
            C8612a aVar = nativeConfigBucketingMap.f18923c;
            C13265p pVar = C18263b.f40057V;
            if (pVar != null) {
                aVar.getClass();
                LinkedHashMap linkedHashMap2 = nativeConfigs.f18940a;
                if (linkedHashMap2.containsKey(nativeConfig)) {
                    boolean z3 = NativeConfig.BucketType.User == nativeConfig.f18918b && (pVar.mo45958c() == null || !pVar.mo45958c().hasId());
                    if (nativeConfig instanceof NativeConfig.C8609b) {
                        if (!z3) {
                            Object obj = linkedHashMap2.get(nativeConfig);
                            C19383o.m32794d(obj);
                            if (((Boolean) obj).booleanValue()) {
                                NativeConfig.C8609b bVar = (NativeConfig.C8609b) nativeConfig;
                                throw null;
                            }
                        }
                        NativeConfig.C8609b bVar2 = (NativeConfig.C8609b) nativeConfig;
                        throw null;
                    }
                    if (!z3) {
                        Object obj2 = linkedHashMap2.get(nativeConfig);
                        C19383o.m32794d(obj2);
                        if (((Boolean) obj2).booleanValue()) {
                            z = true;
                            cVar = new C8615c(nativeConfig, z, (NativeConfig.C8609b.C8610a) null, !z3);
                        }
                    }
                    z = false;
                    cVar = new C8615c(nativeConfig, z, (NativeConfig.C8609b.C8610a) null, !z3);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    C19285c<Map<NativeConfig, C8615c>> cVar6 = NativeConfigBucketingMap.f18920d;
                    NativeConfigBucketingMap.C8611a.m17001a().put(nativeConfig, cVar);
                    NativeConfigBucketingMap.m17000a();
                    return cVar;
                }
            } else {
                C19383o.m32805o("session");
                throw null;
            }
        }
        C19285c<Map<NativeConfig, C8615c>> cVar7 = NativeConfigBucketingMap.f18920d;
        C8615c cVar8 = (C8615c) NativeConfigBucketingMap.C8611a.m17001a().get(nativeConfig);
        if (cVar8 == null) {
            C8612a aVar2 = nativeConfigBucketingMap.f18923c;
            aVar2.getClass();
            if (nativeConfig instanceof NativeConfig.C8608a) {
                NativeConfig.C8608a aVar3 = (NativeConfig.C8608a) nativeConfig;
                int i = C8612a.C8613a.f18925a[aVar3.f18918b.ordinal()];
                if (i == 1) {
                    j2 = aVar2.mo21121a(aVar3.f18917a);
                } else if (i == 2) {
                    j2 = aVar2.mo21122b(aVar3.f18917a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (j2 >= 0) {
                    if (j2 < ((long) aVar3.f18919c)) {
                        z2 = true;
                    }
                    cVar8 = new C8615c(aVar3, z2, 12);
                } else {
                    cVar8 = new C8615c(aVar3, false, 4);
                }
            } else if (nativeConfig instanceof NativeConfig.C8609b) {
                NativeConfig.C8609b bVar3 = (NativeConfig.C8609b) nativeConfig;
                int i2 = C8612a.C8613a.f18925a[bVar3.f18918b.ordinal()];
                if (i2 == 1) {
                    j = aVar2.mo21121a(bVar3.f18917a);
                } else if (i2 == 2) {
                    j = aVar2.mo21122b(bVar3.f18917a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (j >= 0) {
                    throw null;
                }
                throw null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        C8616d dVar = nativeConfigBucketingMap.f18922b;
        dVar.getClass();
        if (dVar.f18931b + 1800000 < System.currentTimeMillis()) {
            dVar.f18932c.clear();
            dVar.f18931b = System.currentTimeMillis();
        }
        if (!dVar.f18932c.contains(nativeConfig)) {
            if (cVar8.f18928c) {
                dVar.f18930a.mo21334e(cVar8);
            }
            dVar.f18932c.add(nativeConfig);
        }
        NativeConfigBucketingMap.C8611a.m17001a().put(nativeConfig, cVar8);
        NativeConfigBucketingMap.m17000a();
        return cVar8;
    }

    /* renamed from: b */
    public C8623e mo21332b() {
        List<String> list = C8591a.f18700r;
        return C18263b.f40056T.f18706f;
    }

    /* renamed from: d */
    public void mo21333d(String str, Map<? extends AnalyticsProperty, Object> map) {
        C8860a.m17263b(str);
        m17069c(new C8671a(str, map, this));
    }

    /* renamed from: e */
    public final void mo21334e(C8677e.C8678a aVar) {
        int i;
        boolean z;
        m17069c(new C8677e(aVar, this));
        CrashUtil a = CrashUtil.m17307a();
        String c = aVar.mo21125c();
        String e = aVar.mo21126e();
        a.getClass();
        List<String> list = C8591a.f18700r;
        if (C18263b.f40056T.f18706f.mo21132b(C8592b.f18835u1)) {
            Iterator it = CrashUtil.f19616h.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((EtsyConfigKey) it.next()).f18695a.equals(c)) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                CrashUtil.f19615g.offer(new Pair(c.replace("mobile_dynamic_config.android.", ""), e));
                for (CrashUtil.CrashProvider crashProvider : CrashUtil.CrashProvider.values()) {
                    if (a.mo30461f(crashProvider)) {
                        while (true) {
                            Pair poll = CrashUtil.f19615g.poll();
                            if (poll == null) {
                                break;
                            }
                            C8496c delegate = crashProvider.getDelegate();
                            String str = (String) poll.getFirst();
                            String str2 = (String) poll.getSecond();
                            ((C8495b) delegate).getClass();
                            C19383o.m32797g(str, "key");
                            C19383o.m32797g(str2, "variant");
                            C5718a1 a1Var = C5777k.m11576b().f12624c;
                            a1Var.getClass();
                            a1Var.f12147b.f12158c.put(str, str2);
                            if (!a1Var.getObservers$bugsnag_android_core_release().isEmpty()) {
                                C5780k2.C5782b bVar = new C5780k2.C5782b(str, str2);
                                for (C5771f onStateChange : a1Var.getObservers$bugsnag_android_core_release()) {
                                    onStateChange.onStateChange(bVar);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
