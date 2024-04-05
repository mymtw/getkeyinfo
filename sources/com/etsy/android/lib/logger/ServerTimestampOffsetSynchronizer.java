package com.etsy.android.lib.logger;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.loggers.Epoch;
import com.etsy.android.lib.util.C8890e0;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p425q9.C13250b;
import p425q9.C13251c;
import p425q9.C13265p;
import p456ua.C13461f;

public final class ServerTimestampOffsetSynchronizer {

    /* renamed from: a */
    public final C13251c f19043a;

    /* renamed from: b */
    public final C13265p f19044b;

    /* renamed from: c */
    public final C8890e0 f19045c;

    /* renamed from: d */
    public final C13461f f19046d;

    public ServerTimestampOffsetSynchronizer(C13251c cVar, C13265p pVar, C8890e0 e0Var, C13461f fVar) {
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(e0Var, "systemTimeProducer");
        this.f19043a = cVar;
        this.f19044b = pVar;
        this.f19045c = e0Var;
        this.f19046d = fVar;
    }

    /* renamed from: a */
    public final void mo21325a() {
        C8071s<Epoch> a = this.f19043a.f29106a.mo45776a();
        C13250b bVar = new C13250b(0);
        a.getClass();
        SubscribersKt.m32500e(C0391c.m1056b(this.f19046d, C0326j.m860e(this.f19046d, new C19208j(a, bVar))), ServerTimestampOffsetSynchronizer$sync$1.INSTANCE, new ServerTimestampOffsetSynchronizer$sync$2(this));
    }
}
