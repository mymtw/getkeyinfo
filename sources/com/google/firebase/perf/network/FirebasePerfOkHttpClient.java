package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.C19928a0;
import okhttp3.C19944e;
import okhttp3.C19946f;
import okhttp3.C19997p;
import okhttp3.C20002r;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okhttp3.C20018z;
import p576gn.C17801b;
import p592in.C17875g;
import p592in.C17876h;
import p616ln.C18208f;

public class FirebasePerfOkHttpClient {
    public FirebasePerfOkHttpClient() {
        throw null;
    }

    /* renamed from: a */
    public static void m27485a(C20018z zVar, C17801b bVar, long j, long j2) throws IOException {
        C20011u uVar = zVar.f44362c;
        if (uVar != null) {
            bVar.mo69042j(uVar.f44342b.mo72972h().toString());
            bVar.mo69035c(uVar.f44343c);
            C20016y yVar = uVar.f44345e;
            if (yVar != null) {
                long a = yVar.mo72943a();
                if (a != -1) {
                    bVar.mo69037e(a);
                }
            }
            C19928a0 a0Var = zVar.f44368i;
            if (a0Var != null) {
                long d = a0Var.mo70456d();
                if (d != -1) {
                    bVar.mo69040h(d);
                }
                C20002r e = a0Var.mo70457e();
                if (e != null) {
                    bVar.mo69039g(e.f44261a);
                }
            }
            bVar.mo69036d(zVar.f44365f);
            bVar.mo69038f(j);
            bVar.mo69041i(j2);
            bVar.mo69034a();
        }
    }

    @Keep
    public static void enqueue(C19944e eVar, C19946f fVar) {
        Timer timer = new Timer();
        C19946f fVar2 = fVar;
        eVar.mo72857S(new C17875g(fVar2, C18208f.f39882t, timer, timer.getMicros()));
    }

    @Keep
    public static C20018z execute(C19944e eVar) throws IOException {
        C17801b bVar = new C17801b(C18208f.f39882t);
        Timer timer = new Timer();
        long micros = timer.getMicros();
        try {
            C20018z e = eVar.mo72859e();
            m27485a(e, bVar, micros, timer.getDurationMicros());
            return e;
        } catch (IOException e2) {
            C20011u g = eVar.mo72860g();
            if (g != null) {
                C19997p pVar = g.f44342b;
                if (pVar != null) {
                    bVar.mo69042j(pVar.mo72972h().toString());
                }
                String str = g.f44343c;
                if (str != null) {
                    bVar.mo69035c(str);
                }
            }
            bVar.mo69038f(micros);
            bVar.mo69041i(timer.getDurationMicros());
            C17876h.m30013c(bVar);
            throw e2;
        }
    }
}
