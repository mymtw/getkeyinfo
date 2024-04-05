package p253u3;

/* renamed from: u3.k */
public final class C8146k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C8139f f17865b;

    /* renamed from: c */
    public final /* synthetic */ boolean f17866c = false;

    /* renamed from: d */
    public final /* synthetic */ String f17867d;

    /* renamed from: e */
    public final /* synthetic */ C8139f f17868e;

    public C8146k(C8139f fVar, C8139f fVar2, String str) {
        this.f17868e = fVar;
        this.f17865b = fVar2;
        this.f17867d = str;
    }

    public final void run() {
        if (!C8156t.m16412c(this.f17865b.f17822d)) {
            if (this.f17866c) {
                this.f17868e.getClass();
            }
            C8139f fVar = this.f17865b;
            String str = this.f17867d;
            fVar.f17824f = str;
            this.f17868e.f17821c.mo20785u("user_id", str);
            if (this.f17866c) {
                this.f17868e.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                C8139f fVar2 = this.f17868e;
                fVar2.f17832n = currentTimeMillis;
                fVar2.f17837s = currentTimeMillis;
                fVar2.f17821c.mo20784t("previous_session_id", Long.valueOf(currentTimeMillis));
                this.f17868e.mo20752i(currentTimeMillis);
                this.f17868e.getClass();
            }
        }
    }
}
