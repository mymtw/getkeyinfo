package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import android.os.Parcel;
import androidx.compose.p015ui.graphics.vector.C1556d;
import com.google.android.play.core.assetpacks.C15655t0;
import com.google.android.play.core.assetpacks.C15669w2;
import com.google.android.play.core.internal.C15686c0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.paypal.openid.ClientAuthentication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p150j4.C7108a;
import p174m0.C7292j;
import p174m0.C7293k;
import p517bn.C14109d0;
import p605kk.C18121e;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c */
public final class C1313c implements C15686c0, C18121e, C7108a, ClientAuthentication {

    /* renamed from: b */
    public Object f2868b;

    public /* synthetic */ C1313c(Object obj) {
        this.f2868b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[SYNTHETIC, Splitter:B:22:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050 A[SYNTHETIC, Splitter:B:29:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5754a(java.lang.Object r5, java.io.File r6, p150j4.C7114e r7) {
        /*
            r4 = this;
            java.io.InputStream r5 = (java.io.InputStream) r5
            java.lang.String r7 = "StreamEncoder"
            java.lang.Object r0 = r4.f2868b
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = (com.bumptech.glide.load.engine.bitmap_recycle.C5996b) r0
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r0 = r0.mo16914c(r2, r1)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0033 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0033 }
        L_0x0019:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            r2 = -1
            if (r6 == r2) goto L_0x0024
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            goto L_0x0019
        L_0x0024:
            r3.close()     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            r1 = 1
            r3.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0045
        L_0x002c:
            r5 = move-exception
            goto L_0x004e
        L_0x002e:
            r5 = move-exception
            r2 = r3
            goto L_0x0034
        L_0x0031:
            r5 = move-exception
            goto L_0x004d
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x0040
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x0031 }
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            java.lang.Object r5 = r4.f2868b
            com.bumptech.glide.load.engine.bitmap_recycle.b r5 = (com.bumptech.glide.load.engine.bitmap_recycle.C5996b) r5
            r5.put(r0)
            return r1
        L_0x004d:
            r3 = r2
        L_0x004e:
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            java.lang.Object r6 = r4.f2868b
            com.bumptech.glide.load.engine.bitmap_recycle.b r6 = (com.bumptech.glide.load.engine.bitmap_recycle.C5996b) r6
            r6.put(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1313c.mo5754a(java.lang.Object, java.io.File, j4.e):boolean");
    }

    /* renamed from: c */
    public void mo5755c(C1556d dVar) {
        ((List) this.f2868b).add(dVar);
    }

    /* renamed from: d */
    public void mo5756d(byte b) {
        ((Parcel) this.f2868b).writeByte(b);
    }

    /* renamed from: e */
    public void mo5757e(float f) {
        ((Parcel) this.f2868b).writeFloat(f);
    }

    /* renamed from: f */
    public void mo5758f(long j) {
        long b = C7292j.m13998b(j);
        byte b2 = 0;
        if (!C7293k.m14001a(b, 0)) {
            if (C7293k.m14001a(b, 4294967296L)) {
                b2 = 1;
            } else if (C7293k.m14001a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        mo5756d(b2);
        if (!C7293k.m14001a(C7292j.m13998b(j), 0)) {
            mo5757e(C7292j.m13999c(j));
        }
    }

    /* renamed from: g */
    public Map mo1132g(String str) {
        return null;
    }

    /* renamed from: h */
    public void mo5759h(float f, float f2) {
        mo5755c(new C1556d.C1561e(f, f2));
    }

    /* renamed from: i */
    public void mo5760i(float f, float f2) {
        mo5755c(new C1556d.C1569m(f, f2));
    }

    /* renamed from: l */
    public Map mo1136l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("client_id", str);
        hashMap.put("client_secret", (String) this.f2868b);
        return hashMap;
    }

    public void onSuccess(Object obj) {
        ((FirebaseMessaging) this.f2868b).m35115lambda$new$1$comgooglefirebasemessagingFirebaseMessaging((C14109d0) obj);
    }

    public /* bridge */ /* synthetic */ Object zza() {
        return new C15655t0(((C15669w2) ((C15686c0) this.f2868b)).mo55501a());
    }

    public /* synthetic */ C1313c() {
        this.f2868b = new HashMap();
    }

    public /* synthetic */ C1313c(int i) {
        if (i != 2) {
            this.f2868b = new ArrayList();
            return;
        }
        Parcel obtain = Parcel.obtain();
        C19383o.m32796f(obtain, "obtain()");
        this.f2868b = obtain;
    }
}
