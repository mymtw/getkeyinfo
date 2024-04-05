package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.C17462u;
import com.squareup.picasso.C17465w;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import okhttp3.C19928a0;
import okhttp3.C19941d;
import okhttp3.C20011u;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19971e;
import p003a2.C0015b;

public final class NetworkRequestHandler extends C17462u {

    /* renamed from: a */
    public final C17448j f38036a;

    /* renamed from: b */
    public final C17465w f38037b;

    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    public static final class ResponseException extends IOException {
        public final int code;
        public final int networkPolicy;

        public ResponseException(int i, int i2) {
            super(C0015b.m88g("HTTP ", i));
            this.code = i;
            this.networkPolicy = i2;
        }
    }

    public NetworkRequestHandler(C17448j jVar, C17465w wVar) {
        this.f38036a = jVar;
        this.f38037b = wVar;
    }

    /* renamed from: b */
    public final boolean mo68565b(C17459s sVar) {
        String scheme = sVar.f38149c.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* renamed from: d */
    public final int mo68567d() {
        return 2;
    }

    /* renamed from: e */
    public final C17462u.C17463a mo68566e(C17459s sVar, int i) throws IOException {
        C19941d dVar;
        boolean z = true;
        if (i == 0) {
            dVar = null;
        } else if (NetworkPolicy.isOfflineOnly(i)) {
            dVar = C19941d.f43998n;
        } else {
            C19941d.C19942a aVar = new C19941d.C19942a();
            if (!NetworkPolicy.shouldReadFromDiskCache(i)) {
                aVar.f44013a = true;
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i)) {
                aVar.f44014b = true;
            }
            dVar = aVar.mo72856a();
        }
        C20011u.C20012a aVar2 = new C20011u.C20012a();
        aVar2.mo73003f(sVar.f38149c.toString());
        if (dVar != null) {
            String dVar2 = dVar.toString();
            if (dVar2.length() != 0) {
                z = false;
            }
            if (z) {
                aVar2.f44349c.mo72963f("Cache-Control");
            } else {
                aVar2.mo73000c("Cache-Control", dVar2);
            }
        }
        C20018z e = ((C19971e) ((C17455p) this.f38036a).f38136a.mo20743a(aVar2.mo72999b())).mo72859e();
        C19928a0 a0Var = e.f44368i;
        if (e.mo73006d()) {
            Picasso.LoadedFrom loadedFrom = e.f44370k == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
            if (loadedFrom == Picasso.LoadedFrom.DISK && a0Var.mo70456d() == 0) {
                a0Var.close();
                throw new ContentLengthException("Received response with 0 content-length header.");
            }
            if (loadedFrom == Picasso.LoadedFrom.NETWORK && a0Var.mo70456d() > 0) {
                C17465w wVar = this.f38037b;
                long d = a0Var.mo70456d();
                C17465w.C17466a aVar3 = wVar.f38183b;
                aVar3.sendMessage(aVar3.obtainMessage(4, Long.valueOf(d)));
            }
            return new C17462u.C17463a(a0Var.mo70458f(), loadedFrom);
        }
        a0Var.close();
        throw new ResponseException(e.f44365f, 0);
    }

    /* renamed from: f */
    public final boolean mo68568f(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
