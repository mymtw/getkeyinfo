package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.exoplayer2.drm.C14224f;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.common.base.C15781b;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0015b;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17912g;
import p635oh.C18292b;
import p635oh.C18293c;
import p635oh.C18294d;

/* renamed from: com.google.android.exoplayer2.drm.g */
public final class C14229g implements C14224f {

    /* renamed from: d */
    public static final C0015b f31576d = new C0015b();

    /* renamed from: a */
    public final UUID f31577a;

    /* renamed from: b */
    public final MediaDrm f31578b;

    /* renamed from: c */
    public int f31579c;

    public C14229g(UUID uuid) throws UnsupportedSchemeException {
        UUID uuid2;
        uuid.getClass();
        C14075p.m21692d(!C17912g.f38898b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f31577a = uuid;
        MediaDrm mediaDrm = new MediaDrm((C14049b0.f30913a >= 27 || !C17912g.f38899c.equals(uuid)) ? uuid : uuid2);
        this.f31578b = mediaDrm;
        this.f31579c = 1;
        if (C17912g.f38900d.equals(uuid) && "ASUS_Z00AD".equals(C14049b0.f30916d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    /* renamed from: a */
    public final Class<C18293c> mo47335a() {
        return C18293c.class;
    }

    /* renamed from: b */
    public final Map<String, String> mo47336b(byte[] bArr) {
        return this.f31578b.queryKeyStatus(bArr);
    }

    /* renamed from: c */
    public final C18292b mo47337c(byte[] bArr) throws MediaCryptoException {
        int i = C14049b0.f30913a;
        boolean z = i < 21 && C17912g.f38900d.equals(this.f31577a) && "L3".equals(this.f31578b.getPropertyString("securityLevel"));
        UUID uuid = this.f31577a;
        if (i < 27 && C17912g.f38899c.equals(uuid)) {
            uuid = C17912g.f38898b;
        }
        return new C18293c(uuid, bArr, z);
    }

    /* renamed from: d */
    public final C14224f.C14228d mo47338d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f31578b.getProvisionRequest();
        return new C14224f.C14228d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* renamed from: e */
    public final byte[] mo47339e() throws MediaDrmException {
        return this.f31578b.openSession();
    }

    /* renamed from: f */
    public final void mo47340f(byte[] bArr, byte[] bArr2) {
        this.f31578b.restoreKeys(bArr, bArr2);
    }

    /* renamed from: g */
    public final void mo47341g(byte[] bArr) throws DeniedByServerException {
        this.f31578b.provideProvisionResponse(bArr);
    }

    /* renamed from: h */
    public final void mo47342h(DefaultDrmSessionManager.C14208b bVar) {
        this.f31578b.setOnEventListener(new C18294d(this, bVar));
    }

    /* renamed from: i */
    public final void mo47343i(byte[] bArr) {
        this.f31578b.closeSession(bArr);
    }

    /* renamed from: j */
    public final byte[] mo47344j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C17912g.f38899c.equals(this.f31577a) && C14049b0.f30913a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, C15781b.f35562c));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', JsonPointer.SEPARATOR));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', JsonPointer.SEPARATOR));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = C14049b0.m21652y(sb.toString());
            } catch (JSONException e) {
                String str = new String(bArr2, C15781b.f35562c);
                C14075p.m21698j("ClearKeyUtil", str.length() != 0 ? "Failed to adjust response data: ".concat(str) : new String("Failed to adjust response data: "), e);
            }
        }
        return this.f31578b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0199, code lost:
        if ("AFTT".equals(r5) == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019f, code lost:
        if (r1 != null) goto L_0x01a3;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.drm.C14224f.C14225a mo47345k(byte[] r17, java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r18, int r19, java.util.HashMap<java.lang.String, java.lang.String> r20) throws android.media.NotProvisionedException {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 23
            r3 = 0
            if (r1 == 0) goto L_0x01c8
            java.util.UUID r3 = r0.f31577a
            java.util.UUID r4 = p594jh.C17912g.f38900d
            boolean r3 = r4.equals(r3)
            r4 = -1
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L_0x001e
            java.lang.Object r1 = r1.get(r5)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r1
            goto L_0x00c0
        L_0x001e:
            int r3 = p513bj.C14049b0.f30913a
            r7 = 28
            if (r3 < r7) goto L_0x008e
            int r3 = r18.size()
            if (r3 <= r6) goto L_0x008e
            java.lang.Object r3 = r1.get(r5)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r3
            r7 = r5
            r8 = r7
        L_0x0032:
            int r9 = r18.size()
            if (r7 >= r9) goto L_0x0069
            java.lang.Object r9 = r1.get(r7)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r9 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r9
            byte[] r10 = r9.data
            r10.getClass()
            java.lang.String r11 = r9.mimeType
            java.lang.String r12 = r3.mimeType
            boolean r11 = p513bj.C14049b0.m21628a(r11, r12)
            if (r11 == 0) goto L_0x0067
            java.lang.String r9 = r9.licenseServerUrl
            java.lang.String r11 = r3.licenseServerUrl
            boolean r9 = p513bj.C14049b0.m21628a(r9, r11)
            if (r9 == 0) goto L_0x0067
            wh.i$a r9 = p701wh.C18687i.m31542b(r10)
            if (r9 == 0) goto L_0x005f
            r9 = r6
            goto L_0x0060
        L_0x005f:
            r9 = r5
        L_0x0060:
            if (r9 == 0) goto L_0x0067
            int r9 = r10.length
            int r8 = r8 + r9
            int r7 = r7 + 1
            goto L_0x0032
        L_0x0067:
            r7 = r5
            goto L_0x006a
        L_0x0069:
            r7 = r6
        L_0x006a:
            if (r7 == 0) goto L_0x008e
            byte[] r7 = new byte[r8]
            r8 = r5
            r9 = r8
        L_0x0070:
            int r10 = r18.size()
            if (r8 >= r10) goto L_0x0089
            java.lang.Object r10 = r1.get(r8)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r10 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r10
            byte[] r10 = r10.data
            r10.getClass()
            int r11 = r10.length
            java.lang.System.arraycopy(r10, r5, r7, r9, r11)
            int r9 = r9 + r11
            int r8 = r8 + 1
            goto L_0x0070
        L_0x0089:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = r3.copyWithData(r7)
            goto L_0x00c0
        L_0x008e:
            r3 = r5
        L_0x008f:
            int r7 = r18.size()
            if (r3 >= r7) goto L_0x00ba
            java.lang.Object r7 = r1.get(r3)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r7
            byte[] r8 = r7.data
            r8.getClass()
            wh.i$a r8 = p701wh.C18687i.m31542b(r8)
            if (r8 != 0) goto L_0x00a8
            r8 = r4
            goto L_0x00aa
        L_0x00a8:
            int r8 = r8.f41391b
        L_0x00aa:
            int r9 = p513bj.C14049b0.f30913a
            if (r9 >= r2) goto L_0x00b1
            if (r8 != 0) goto L_0x00b1
            goto L_0x00b5
        L_0x00b1:
            if (r9 < r2) goto L_0x00b7
            if (r8 != r6) goto L_0x00b7
        L_0x00b5:
            r3 = r7
            goto L_0x00c1
        L_0x00b7:
            int r3 = r3 + 1
            goto L_0x008f
        L_0x00ba:
            java.lang.Object r1 = r1.get(r5)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r1
        L_0x00c0:
            r3 = r1
        L_0x00c1:
            java.util.UUID r1 = r0.f31577a
            byte[] r7 = r3.data
            r7.getClass()
            java.util.UUID r8 = p594jh.C17912g.f38901e
            boolean r9 = r8.equals(r1)
            r10 = 26
            if (r9 == 0) goto L_0x015d
            byte[] r9 = p701wh.C18687i.m31543c(r1, r7)
            if (r9 != 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r7 = r9
        L_0x00da:
            bj.r r9 = new bj.r
            r9.<init>((byte[]) r7)
            int r11 = r9.mo46914e()
            short r12 = r9.mo46915f()
            short r13 = r9.mo46915f()
            java.lang.String r14 = "FrameworkMediaDrm"
            if (r12 != r6) goto L_0x0154
            if (r13 == r6) goto L_0x00f2
            goto L_0x0154
        L_0x00f2:
            short r6 = r9.mo46915f()
            java.nio.charset.Charset r15 = com.google.common.base.C15781b.f35563d
            java.lang.String r6 = r9.mo46923n(r6, r15)
            java.lang.String r9 = "<LA_URL>"
            boolean r9 = r6.contains(r9)
            if (r9 == 0) goto L_0x0105
            goto L_0x0159
        L_0x0105:
            java.lang.String r7 = "</DATA>"
            int r7 = r6.indexOf(r7)
            if (r7 != r4) goto L_0x0112
            java.lang.String r4 = "Could not find the </DATA> tag. Skipping LA_URL workaround."
            android.util.Log.w(r14, r4)
        L_0x0112:
            java.lang.String r4 = r6.substring(r5, r7)
            java.lang.String r5 = r6.substring(r7)
            int r6 = androidx.compose.animation.C0391c.m1055a(r4, r10)
            int r6 = androidx.compose.animation.C0391c.m1055a(r5, r6)
            java.lang.String r7 = "<LA_URL>https://x</LA_URL>"
            java.lang.String r4 = p504ai.C13983i.m21492k(r6, r4, r7, r5)
            int r11 = r11 + 52
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            r5.order(r6)
            r5.putInt(r11)
            short r6 = (short) r12
            r5.putShort(r6)
            short r6 = (short) r13
            r5.putShort(r6)
            int r6 = r4.length()
            int r6 = r6 * 2
            short r6 = (short) r6
            r5.putShort(r6)
            byte[] r4 = r4.getBytes(r15)
            r5.put(r4)
            byte[] r7 = r5.array()
            goto L_0x0159
        L_0x0154:
            java.lang.String r4 = "Unexpected record count or type. Skipping LA_URL workaround."
            android.util.Log.i(r14, r4)
        L_0x0159:
            byte[] r7 = p701wh.C18687i.m31541a(r8, r7)
        L_0x015d:
            int r4 = p513bj.C14049b0.f30913a
            if (r4 >= r2) goto L_0x0169
            java.util.UUID r5 = p594jh.C17912g.f38900d
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x019b
        L_0x0169:
            boolean r5 = r8.equals(r1)
            if (r5 == 0) goto L_0x01a2
            java.lang.String r5 = p513bj.C14049b0.f30915c
            java.lang.String r6 = "Amazon"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x01a2
            java.lang.String r5 = p513bj.C14049b0.f30916d
            java.lang.String r6 = "AFTB"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x019b
            java.lang.String r6 = "AFTS"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x019b
            java.lang.String r6 = "AFTM"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x019b
            java.lang.String r6 = "AFTT"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x01a2
        L_0x019b:
            byte[] r1 = p701wh.C18687i.m31543c(r1, r7)
            if (r1 == 0) goto L_0x01a2
            goto L_0x01a3
        L_0x01a2:
            r1 = r7
        L_0x01a3:
            java.util.UUID r5 = r0.f31577a
            java.lang.String r6 = r3.mimeType
            if (r4 >= r10) goto L_0x01c4
            java.util.UUID r4 = p594jh.C17912g.f38899c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x01c4
            java.lang.String r4 = "video/mp4"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x01c1
            java.lang.String r4 = "audio/mp4"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x01c4
        L_0x01c1:
            java.lang.String r4 = "cenc"
            goto L_0x01c5
        L_0x01c4:
            r4 = r6
        L_0x01c5:
            r7 = r1
            r8 = r4
            goto L_0x01ca
        L_0x01c8:
            r7 = r3
            r8 = r7
        L_0x01ca:
            android.media.MediaDrm r5 = r0.f31578b
            r6 = r17
            r9 = r19
            r10 = r20
            android.media.MediaDrm$KeyRequest r1 = r5.getKeyRequest(r6, r7, r8, r9, r10)
            java.util.UUID r4 = r0.f31577a
            byte[] r5 = r1.getData()
            java.util.UUID r6 = p594jh.C17912g.f38899c
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0206
            int r4 = p513bj.C14049b0.f30913a
            r6 = 27
            if (r4 < r6) goto L_0x01eb
            goto L_0x0206
        L_0x01eb:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.common.base.C15781b.f35562c
            r4.<init>(r5, r6)
            r5 = 43
            r6 = 45
            java.lang.String r4 = r4.replace(r5, r6)
            r5 = 47
            r6 = 95
            java.lang.String r4 = r4.replace(r5, r6)
            byte[] r5 = p513bj.C14049b0.m21652y(r4)
        L_0x0206:
            java.lang.String r4 = r1.getDefaultUrl()
            java.lang.String r6 = "https://x"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x0214
            java.lang.String r4 = ""
        L_0x0214:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x0226
            if (r3 == 0) goto L_0x0226
            java.lang.String r6 = r3.licenseServerUrl
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0226
            java.lang.String r4 = r3.licenseServerUrl
        L_0x0226:
            int r3 = p513bj.C14049b0.f30913a
            if (r3 < r2) goto L_0x022d
            r1.getRequestType()
        L_0x022d:
            com.google.android.exoplayer2.drm.f$a r1 = new com.google.android.exoplayer2.drm.f$a
            r1.<init>(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.C14229g.mo47345k(byte[], java.util.List, int, java.util.HashMap):com.google.android.exoplayer2.drm.f$a");
    }

    public final synchronized void release() {
        int i = this.f31579c - 1;
        this.f31579c = i;
        if (i == 0) {
            this.f31578b.release();
        }
    }
}
