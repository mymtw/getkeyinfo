package com.etsy.android.uikit.image.glide;

import android.widget.ImageView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import okhttp3.C19944e;
import okhttp3.C19946f;
import okhttp3.C20009t;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19971e;
import p036c5.C4414c;
import p150j4.C7114e;
import p735br.C18980c;

/* renamed from: com.etsy.android.uikit.image.glide.c */
public final class C11853c implements C5968d<InputStream> {

    /* renamed from: b */
    public final int f26354b;

    /* renamed from: c */
    public final int f26355c;

    /* renamed from: d */
    public final C7114e f26356d;

    /* renamed from: e */
    public final C20009t f26357e;

    /* renamed from: f */
    public final String f26358f;

    /* renamed from: g */
    public final WeakReference<ImageView> f26359g;

    /* renamed from: h */
    public final C11852b f26360h;

    /* renamed from: i */
    public C19971e f26361i;

    /* renamed from: j */
    public InputStream f26362j;

    /* renamed from: k */
    public boolean f26363k;

    /* renamed from: com.etsy.android.uikit.image.glide.c$a */
    public static final class C11854a implements C19946f {

        /* renamed from: a */
        public final /* synthetic */ C5968d.C5969a<? super InputStream> f26364a;

        /* renamed from: b */
        public final /* synthetic */ C11853c f26365b;

        public C11854a(C5968d.C5969a<? super InputStream> aVar, C11853c cVar) {
            this.f26364a = aVar;
            this.f26365b = cVar;
        }

        public final void onFailure(C19944e eVar, IOException iOException) {
            C19383o.m32797g(eVar, "call");
            this.f26364a.mo16862c(iOException);
        }

        public final void onResponse(C19944e eVar, C20018z zVar) {
            C19383o.m32797g(eVar, "call");
            C11853c cVar = this.f26365b;
            C5968d.C5969a<? super InputStream> aVar = this.f26364a;
            cVar.getClass();
            C19383o.m32797g(aVar, "callback");
            if (cVar.f26363k) {
                aVar.mo16862c(new ProgressiveJpegCanceledException());
                return;
            }
            try {
                if (zVar.mo73006d()) {
                    C19928a0 a0Var = zVar.f44368i;
                    InputStream inputStream = null;
                    if (a0Var != null) {
                        inputStream = a0Var.mo70458f().mo72774z0();
                    }
                    String b = C20018z.m34284b(zVar, "content-length");
                    long parseLong = b != null ? Long.parseLong(b) : 0;
                    cVar.f26362j = inputStream;
                    if (inputStream != null) {
                        cVar.f26360h.mo38333b(new C4414c(inputStream, parseLong), cVar.f26354b, cVar.f26355c, cVar.f26356d, cVar.f26359g);
                        aVar.mo16863f(new ByteArrayInputStream(cVar.f26360h.mo38332a().array()));
                    } else {
                        aVar.mo16862c(new ProgressiveJpegNullStreamException());
                    }
                } else {
                    aVar.mo16862c(new ProgressiveJpegUnsuccessfulResponseException());
                }
            } catch (Exception e) {
                aVar.mo16862c(e);
            } catch (Throwable th) {
                try {
                    C18980c.m32099c(zVar);
                } catch (Exception e2) {
                    LogCatKt.m17045a().mo21314h(e2);
                }
                throw th;
            }
            try {
                C18980c.m32099c(zVar);
            } catch (Exception e3) {
                LogCatKt.m17045a().mo21314h(e3);
            }
        }
    }

    public C11853c(int i, int i2, C7114e eVar, C20009t tVar, String str, WeakReference weakReference, C11863j jVar) {
        C19383o.m32797g(eVar, ResponseConstants.OPTIONS);
        C19383o.m32797g(tVar, "client");
        C19383o.m32797g(weakReference, "imageViewRef");
        this.f26354b = i;
        this.f26355c = i2;
        this.f26356d = eVar;
        this.f26357e = tVar;
        this.f26358f = str;
        this.f26359g = weakReference;
        this.f26360h = jVar;
    }

    /* renamed from: a */
    public final Class<InputStream> mo16848a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final void mo16851b() {
        C19971e eVar = this.f26361i;
        if (eVar != null) {
            eVar.cancel();
        }
        InputStream inputStream = this.f26362j;
        if (inputStream != null) {
            C18980c.m32099c(inputStream);
        }
    }

    public final void cancel() {
        this.f26363k = true;
        C19971e eVar = this.f26361i;
        if (eVar != null) {
            eVar.cancel();
        }
        InputStream inputStream = this.f26362j;
        if (inputStream != null) {
            C18980c.m32099c(inputStream);
        }
    }

    /* renamed from: d */
    public final DataSource mo16854d() {
        return DataSource.REMOTE;
    }

    /* renamed from: e */
    public final void mo16855e(Priority priority, C5968d.C5969a<? super InputStream> aVar) {
        C19383o.m32797g(priority, "priority");
        C19383o.m32797g(aVar, "callback");
        if (this.f26363k) {
            aVar.mo16862c(new ProgressiveJpegCanceledException());
        } else if (this.f26359g.get() == null) {
            aVar.mo16862c(new ProgressiveJpegCanceledException());
        } else {
            C20011u.C20012a aVar2 = new C20011u.C20012a();
            aVar2.mo73003f(this.f26358f);
            aVar2.mo73001d("GET", (C20016y) null);
            try {
                C19944e a = this.f26357e.mo20743a(aVar2.mo72999b());
                this.f26361i = (C19971e) a;
                ((C19971e) a).mo72857S(new C11854a(aVar, this));
            } catch (Exception e) {
                aVar.mo16862c(e);
            }
        }
    }
}
