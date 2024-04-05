package p505aj;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p513bj.C14049b0;
import p513bj.C14075p;

/* renamed from: aj.m */
public final class C14006m implements C13999g {

    /* renamed from: a */
    public final Context f30813a;

    /* renamed from: b */
    public final ArrayList f30814b = new ArrayList();

    /* renamed from: c */
    public final C13999g f30815c;

    /* renamed from: d */
    public FileDataSource f30816d;

    /* renamed from: e */
    public AssetDataSource f30817e;

    /* renamed from: f */
    public ContentDataSource f30818f;

    /* renamed from: g */
    public C13999g f30819g;

    /* renamed from: h */
    public UdpDataSource f30820h;

    /* renamed from: i */
    public C13998f f30821i;

    /* renamed from: j */
    public RawResourceDataSource f30822j;

    /* renamed from: k */
    public C13999g f30823k;

    public C14006m(Context context, C13999g gVar) {
        this.f30813a = context.getApplicationContext();
        gVar.getClass();
        this.f30815c = gVar;
    }

    /* renamed from: l */
    public static void m21555l(C13999g gVar, C14014t tVar) {
        if (gVar != null) {
            gVar.mo46806e(tVar);
        }
    }

    /* renamed from: b */
    public final long mo46812b(C14002i iVar) throws IOException {
        boolean z = true;
        C14075p.m21694f(this.f30823k == null);
        String scheme = iVar.f30774a.getScheme();
        Uri uri = iVar.f30774a;
        int i = C14049b0.f30913a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !ResponseConstants.FILE.equals(scheme2)) {
            z = false;
        }
        if (z) {
            String path = iVar.f30774a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f30816d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f30816d = fileDataSource;
                    mo46832k(fileDataSource);
                }
                this.f30823k = this.f30816d;
            } else {
                if (this.f30817e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(this.f30813a);
                    this.f30817e = assetDataSource;
                    mo46832k(assetDataSource);
                }
                this.f30823k = this.f30817e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f30817e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(this.f30813a);
                this.f30817e = assetDataSource2;
                mo46832k(assetDataSource2);
            }
            this.f30823k = this.f30817e;
        } else if (ResponseConstants.CONTENT.equals(scheme)) {
            if (this.f30818f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(this.f30813a);
                this.f30818f = contentDataSource;
                mo46832k(contentDataSource);
            }
            this.f30823k = this.f30818f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f30819g == null) {
                try {
                    C13999g gVar = (C13999g) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f30819g = gVar;
                    mo46832k(gVar);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f30819g == null) {
                    this.f30819g = this.f30815c;
                }
            }
            this.f30823k = this.f30819g;
        } else if ("udp".equals(scheme)) {
            if (this.f30820h == null) {
                UdpDataSource udpDataSource = new UdpDataSource();
                this.f30820h = udpDataSource;
                mo46832k(udpDataSource);
            }
            this.f30823k = this.f30820h;
        } else if ("data".equals(scheme)) {
            if (this.f30821i == null) {
                C13998f fVar = new C13998f();
                this.f30821i = fVar;
                mo46832k(fVar);
            }
            this.f30823k = this.f30821i;
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            if (this.f30822j == null) {
                RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f30813a);
                this.f30822j = rawResourceDataSource;
                mo46832k(rawResourceDataSource);
            }
            this.f30823k = this.f30822j;
        } else {
            this.f30823k = this.f30815c;
        }
        return this.f30823k.mo46812b(iVar);
    }

    public final void close() throws IOException {
        C13999g gVar = this.f30823k;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f30823k = null;
            }
        }
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo46815d() {
        C13999g gVar = this.f30823k;
        return gVar == null ? Collections.emptyMap() : gVar.mo46815d();
    }

    /* renamed from: e */
    public final void mo46806e(C14014t tVar) {
        tVar.getClass();
        this.f30815c.mo46806e(tVar);
        this.f30814b.add(tVar);
        m21555l(this.f30816d, tVar);
        m21555l(this.f30817e, tVar);
        m21555l(this.f30818f, tVar);
        m21555l(this.f30819g, tVar);
        m21555l(this.f30820h, tVar);
        m21555l(this.f30821i, tVar);
        m21555l(this.f30822j, tVar);
    }

    public final Uri getUri() {
        C13999g gVar = this.f30823k;
        if (gVar == null) {
            return null;
        }
        return gVar.getUri();
    }

    /* renamed from: k */
    public final void mo46832k(C13999g gVar) {
        for (int i = 0; i < this.f30814b.size(); i++) {
            gVar.mo46806e((C14014t) this.f30814b.get(i));
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C13999g gVar = this.f30823k;
        gVar.getClass();
        return gVar.read(bArr, i, i2);
    }
}
