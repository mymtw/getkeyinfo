package com.etsy.android.lib.logger.elk.uploading;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.requests.apiv3.GzippedRequestBodyKt;
import com.squareup.moshi.C17407s;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import okhttp3.C19928a0;
import okhttp3.C20002r;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;
import p756lr.C19893f;
import p756lr.C19912w;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.lib.logger.elk.uploading.e */
public final class C8684e {

    /* renamed from: a */
    public final C8688i f19083a;

    public C8684e(C8688i iVar) {
        C19383o.m32797g(iVar, "endpoint");
        this.f19083a = iVar;
    }

    /* renamed from: a */
    public final C19208j mo21340a(C8685f fVar) {
        byte[] bytes = C19327t.m32644Z0(fVar.f19084a, ", ", "[", "]", ElkLogUploadRepository$upload$joined$1.INSTANCE, 24).getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        C19893f fVar2 = new C19893f();
        C19893f fVar3 = new C19893f();
        fVar3.write(bytes);
        C17407s sVar = new C17407s(fVar2);
        sVar.mo68522b();
        sVar.mo68529h("json_logs");
        if (!sVar.f38017i) {
            C19912w c0 = sVar.mo68523c0();
            try {
                fVar3.mo72737g0(c0);
                c0.close();
                sVar.mo68526f();
                sVar.close();
                byte[] d0 = fVar2.mo72732d0();
                C20002r.f44260f.getClass();
                C8071s<C20145v<C19928a0>> a = this.f19083a.mo21345a(GzippedRequestBodyKt.toGzippedRequestBody(d0, C20002r.C20003a.m34244b("application/json")), "gzip");
                C8683d dVar = new C8683d(0);
                a.getClass();
                return new C19208j(a, dVar);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            StringBuilder h = C0072d.m201h("BufferedSource cannot be used as a map key in JSON at path ");
            h.append(sVar.getPath());
            throw new IllegalStateException(h.toString());
        }
        throw th;
    }
}
