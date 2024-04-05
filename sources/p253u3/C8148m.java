package p253u3;

import java.util.HashSet;
import java.util.UUID;

/* renamed from: u3.m */
public final class C8148m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C8139f f17872b;

    /* renamed from: c */
    public final /* synthetic */ C8139f f17873c;

    public C8148m(C8139f fVar, C8139f fVar2) {
        this.f17873c = fVar;
        this.f17872b = fVar2;
    }

    public final void run() {
        if (!C8156t.m16412c(this.f17872b.f17822d)) {
            StringBuilder sb = new StringBuilder();
            int i = C8152q.f17883d;
            sb.append(UUID.randomUUID().toString());
            sb.append("R");
            String sb2 = sb.toString();
            C8139f fVar = this.f17873c;
            fVar.getClass();
            HashSet b = C8139f.m16366b();
            if (fVar.mo20746a("setDeviceId()") && !C8156t.m16412c(sb2) && !b.contains(sb2)) {
                fVar.mo20753j(new C8147l(fVar, fVar, sb2));
            }
        }
    }
}
