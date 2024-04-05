package p743fr;

import android.support.p013v4.media.C0072d;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
import p737cr.C18982a;
import p743fr.C19027d;
import p747hr.C19084h;

/* renamed from: fr.f */
public final class C19036f extends C18982a {

    /* renamed from: e */
    public final /* synthetic */ C19049p f42472e;

    /* renamed from: f */
    public final /* synthetic */ C19027d.C19032d f42473f;

    /* renamed from: g */
    public final /* synthetic */ List f42474g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19036f(String str, C19049p pVar, C19027d.C19032d dVar, List list) {
        super(str, true);
        this.f42472e = pVar;
        this.f42473f = dVar;
        this.f42474g = list;
    }

    /* renamed from: a */
    public final long mo70418a() {
        try {
            C19027d.this.f42426c.mo70495b(this.f42472e);
            return -1;
        } catch (IOException e) {
            C19084h.f42595c.getClass();
            C19084h hVar = C19084h.f42593a;
            StringBuilder h = C0072d.m201h("Http2Connection.Listener failure for ");
            h.append(C19027d.this.f42428e);
            String sb = h.toString();
            hVar.getClass();
            C19084h.m32344i(4, sb, e);
            try {
                this.f42472e.mo70513c(ErrorCode.PROTOCOL_ERROR, e);
                return -1;
            } catch (IOException unused) {
                return -1;
            }
        }
    }
}
