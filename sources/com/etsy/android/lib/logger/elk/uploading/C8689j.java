package com.etsy.android.lib.logger.elk.uploading;

import com.etsy.android.lib.config.C8618c;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.C19383o;
import p366ia.C12920a;

/* renamed from: com.etsy.android.lib.logger.elk.uploading.j */
public final class C8689j {

    /* renamed from: a */
    public final C8687h f19087a;

    /* renamed from: b */
    public final C12920a f19088b;

    /* renamed from: c */
    public final C8618c f19089c;

    /* renamed from: d */
    public Timer f19090d;

    /* renamed from: com.etsy.android.lib.logger.elk.uploading.j$a */
    public static final class C8690a extends TimerTask {

        /* renamed from: b */
        public final C8687h f19091b;

        public C8690a(C8687h hVar) {
            C19383o.m32797g(hVar, "elkUploader");
            this.f19091b = hVar;
        }

        public final void run() {
            this.f19091b.mo21344a();
        }
    }

    public C8689j(C8687h hVar, C12920a aVar, C8618c cVar) {
        C19383o.m32797g(hVar, "elkLogUploader");
        C19383o.m32797g(aVar, "loggingEligibility");
        C19383o.m32797g(cVar, "configMap");
        this.f19087a = hVar;
        this.f19088b = aVar;
        this.f19089c = cVar;
    }
}
