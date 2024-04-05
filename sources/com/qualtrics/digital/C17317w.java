package com.qualtrics.digital;

import android.util.Log;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p739dr.C19006f;

/* renamed from: com.qualtrics.digital.w */
public final class C17317w implements C20000q {

    /* renamed from: b */
    public String f37844b;

    public C17317w(String str) {
        this.f37844b = str;
    }

    /* renamed from: a */
    public static C20018z m29065a(C20011u uVar, C19006f fVar) throws IOException {
        C20018z a = fVar.mo70453a(uVar);
        if (!a.mo73006d() || a.f44368i == null) {
            throw new IOException(String.format(Locale.US, "Invalid response received from requested url: %s. ResponseBody: %s, ResponseCode:%d", new Object[]{uVar.f44342b, a.f44368i, Integer.valueOf(a.f44365f)}));
        }
        Log.i("Qualtrics", String.format("Received response for %s with %n%s", new Object[]{a.f44362c.f44342b, a.f44367h}));
        return a;
    }

    /* renamed from: b */
    public static void m29066b(Throwable th) {
        StringBuilder sb = new StringBuilder(th.getMessage());
        sb.append("\\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        Log.e("Qualtrics", sb.toString());
    }

    public final C20018z intercept(C20000q.C20001a aVar) throws IOException {
        try {
            C20011u uVar = ((C19006f) aVar).f42351f;
            uVar.getClass();
            C20011u.C20012a aVar2 = new C20011u.C20012a(uVar);
            aVar2.mo72998a("Referer", this.f37844b);
            return m29065a(aVar2.mo72999b(), (C19006f) aVar);
        } catch (Throwable th) {
            m29066b(th);
            throw th;
        }
    }
}
