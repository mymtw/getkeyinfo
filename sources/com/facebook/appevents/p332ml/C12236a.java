package com.facebook.appevents.p332ml;

import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.p332ml.ModelManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p318bg.C8553b;

/* renamed from: com.facebook.appevents.ml.a */
public final class C12236a implements FileDownloadTask.C12231a {

    /* renamed from: a */
    public final /* synthetic */ List f27322a;

    /* renamed from: com.facebook.appevents.ml.a$a */
    public static final class C12237a implements FileDownloadTask.C12231a {

        /* renamed from: a */
        public final /* synthetic */ ModelManager.C12232a f27323a;

        /* renamed from: b */
        public final /* synthetic */ C8553b f27324b;

        public C12237a(ModelManager.C12232a aVar, C8553b bVar) {
            this.f27323a = aVar;
            this.f27324b = bVar;
        }

        /* renamed from: a */
        public final void mo39346a(File file) {
            C19383o.m32797g(file, ResponseConstants.FILE);
            ModelManager.C12232a aVar = this.f27323a;
            aVar.f27313b = this.f27324b;
            aVar.f27312a = file;
            Runnable runnable = aVar.f27314c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C12236a(ArrayList arrayList) {
        this.f27322a = arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0113 A[EDGE_INSN: B:67:0x0113->B:50:0x0113 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39346a(java.io.File r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "file"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            bg.b$a r1 = p318bg.C8553b.f18624n
            r1.getClass()
            bg.g r1 = p318bg.C8559g.f18641a
            java.lang.Class<bg.g> r1 = p318bg.C8559g.class
            boolean r2 = p401mg.C13080a.m20762b(r1)
            if (r2 == 0) goto L_0x0018
            goto L_0x00be
        L_0x0018:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            int r0 = r2.available()     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r3.<init>(r2)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r3.readFully(r2)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r3.close()     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r3 = 4
            if (r0 >= r3) goto L_0x0033
            goto L_0x00be
        L_0x0033:
            r4 = 0
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r2, r4, r3)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r5.order(r6)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            int r5 = r5.getInt()     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            int r6 = r5 + 4
            if (r0 >= r6) goto L_0x0047
            goto L_0x00be
        L_0x0047:
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            java.nio.charset.Charset r8 = kotlin.text.C19446a.f43373b     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r7.<init>(r2, r3, r5, r8)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r3.<init>(r7)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            org.json.JSONArray r5 = r3.names()     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            int r7 = r5.length()     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r9 = r4
        L_0x005e:
            if (r9 >= r7) goto L_0x0069
            java.lang.String r10 = r5.getString(r9)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r8[r9] = r10     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            int r9 = r9 + 1
            goto L_0x005e
        L_0x0069:
            r5 = 1
            if (r7 <= r5) goto L_0x006f
            java.util.Arrays.sort(r8)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
        L_0x006f:
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r9.<init>()     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r10 = r4
        L_0x0075:
            if (r10 >= r7) goto L_0x00bf
            r11 = r8[r10]     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            if (r11 != 0) goto L_0x007c
            goto L_0x00b6
        L_0x007c:
            org.json.JSONArray r12 = r3.getJSONArray(r11)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            int r13 = r12.length()     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            int[] r14 = new int[r13]     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r15 = r4
        L_0x0087:
            if (r15 >= r13) goto L_0x0094
            int r16 = r12.getInt(r15)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r14[r15] = r16     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            int r5 = r5 * r16
            int r15 = r15 + 1
            goto L_0x0087
        L_0x0094:
            int r12 = r5 * 4
            int r13 = r6 + r12
            if (r13 <= r0) goto L_0x009b
            goto L_0x00be
        L_0x009b:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r2, r6, r12)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r6.order(r12)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            bg.a r12 = new bg.a     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r12.<init>(r14)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            java.nio.FloatBuffer r6 = r6.asFloatBuffer()     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            float[] r14 = r12.f18621b     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r6.get(r14, r4, r5)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r9.put(r11, r12)     // Catch:{ Exception -> 0x00be, all -> 0x00ba }
            r6 = r13
        L_0x00b6:
            int r10 = r10 + 1
            r5 = 1
            goto L_0x0075
        L_0x00ba:
            r0 = move-exception
            p401mg.C13080a.m20761a(r1, r0)
        L_0x00be:
            r9 = 0
        L_0x00bf:
            if (r9 == 0) goto L_0x0112
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r0 = p318bg.C8553b.f18623m
            java.lang.Class<bg.b> r2 = p318bg.C8553b.class
            boolean r0 = p401mg.C13080a.m20762b(r2)
            if (r0 == 0) goto L_0x00d1
            goto L_0x00d9
        L_0x00d1:
            java.util.HashMap r0 = p318bg.C8553b.f18623m     // Catch:{ all -> 0x00d4 }
            goto L_0x00da
        L_0x00d4:
            r0 = move-exception
            r3 = r0
            p401mg.C13080a.m20761a(r2, r3)
        L_0x00d9:
            r0 = 0
        L_0x00da:
            java.util.Set r2 = r9.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00e2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0113
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r3.getKey()
            boolean r5 = r0.containsKey(r5)
            if (r5 == 0) goto L_0x010a
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0112
        L_0x010a:
            java.lang.Object r3 = r3.getValue()
            r1.put(r4, r3)
            goto L_0x00e2
        L_0x0112:
            r1 = 0
        L_0x0113:
            if (r1 == 0) goto L_0x011b
            bg.b r0 = new bg.b     // Catch:{ Exception -> 0x011b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x011b }
            goto L_0x011c
        L_0x011b:
            r0 = 0
        L_0x011c:
            r1 = r17
            if (r0 == 0) goto L_0x0159
            java.util.List r2 = r1.f27322a
            java.util.Iterator r2 = r2.iterator()
        L_0x0126:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0159
            java.lang.Object r3 = r2.next()
            com.facebook.appevents.ml.ModelManager$a r3 = (com.facebook.appevents.p332ml.ModelManager.C12232a) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.f27315d
            r4.append(r5)
            java.lang.String r5 = "_"
            r4.append(r5)
            int r5 = r3.f27318g
            java.lang.String r6 = "_rule"
            java.lang.String r4 = android.support.p013v4.media.C0071c.m191c(r4, r5, r6)
            com.facebook.appevents.ml.ModelManager$a$a r5 = com.facebook.appevents.p332ml.ModelManager.C12232a.f27311i
            java.lang.String r6 = r3.f27317f
            com.facebook.appevents.ml.a$a r7 = new com.facebook.appevents.ml.a$a
            r7.<init>(r3, r0)
            r5.getClass()
            com.facebook.appevents.p332ml.ModelManager.C12232a.C12233a.m20081b(r6, r4, r7)
            goto L_0x0126
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.p332ml.C12236a.mo39346a(java.io.File):void");
    }
}
