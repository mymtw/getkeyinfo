package com.bugsnag.android;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.bugsnag.android.internal.C5763c;
import com.bugsnag.android.internal.dag.C5766a;
import com.bugsnag.android.internal.dag.C5767b;
import com.bugsnag.android.internal.dag.C5768c;
import com.bugsnag.android.internal.dag.DependencyModule;
import java.io.File;
import kotlin.C19285c;

/* renamed from: com.bugsnag.android.b0 */
public final class C5721b0 extends DependencyModule {

    /* renamed from: b */
    public final Context f12149b;

    /* renamed from: c */
    public final C5763c f12150c;

    /* renamed from: d */
    public final C5816o1 f12151d;

    /* renamed from: e */
    public final C5757i0 f12152e;

    /* renamed from: f */
    public final File f12153f = Environment.getDataDirectory();

    /* renamed from: g */
    public final C19285c f12154g;

    /* renamed from: h */
    public final C19285c f12155h;

    /* renamed from: i */
    public final C19285c f12156i;

    public C5721b0(C5767b bVar, C5766a aVar, C5768c cVar, C5910s2 s2Var, C5746g gVar, C5938z zVar, String str, C5825q1 q1Var) {
        this.f12149b = bVar.f12340b;
        C5763c cVar2 = aVar.f12339b;
        this.f12150c = cVar2;
        this.f12151d = cVar2.f12329s;
        int i = Build.VERSION.SDK_INT;
        this.f12152e = new C5757i0(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(i), Build.DISPLAY, Build.FINGERPRINT, Build.TAGS, Build.BRAND, Build.SUPPORTED_ABIS);
        this.f12154g = mo16552a(new DataCollectionModule$appDataCollector$2(this, s2Var, cVar, q1Var));
        this.f12155h = mo16552a(new DataCollectionModule$rootDetector$2(this));
        this.f12156i = mo16552a(new DataCollectionModule$deviceDataCollector$2(this, zVar, str, gVar));
    }
}
