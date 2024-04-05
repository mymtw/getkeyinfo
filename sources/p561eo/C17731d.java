package p561eo;

import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.play.core.assetpacks.C15673x2;
import com.linkedin.android.litr.exception.MediaTransformationException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p561eo.C17727a;
import p569fo.C17783a;
import p600jo.C18042c;
import p600jo.C18043d;
import p625mo.C18256c;
import p625mo.C18257d;
import p633no.C18286d;

/* renamed from: eo.d */
public final class C17731d implements Runnable {

    /* renamed from: k */
    public static final String f38549k = C17731d.class.getSimpleName();

    /* renamed from: b */
    public ArrayList f38550b;

    /* renamed from: c */
    public float f38551c = 0.0f;

    /* renamed from: d */
    public int f38552d;

    /* renamed from: e */
    public C18257d f38553e = new C18257d();

    /* renamed from: f */
    public C18286d f38554f = new C18286d();

    /* renamed from: g */
    public C15673x2 f38555g = new C15673x2();

    /* renamed from: h */
    public final List<C17730c> f38556h;

    /* renamed from: i */
    public final String f38557i;

    /* renamed from: j */
    public final C17727a f38558j;

    public C17731d(String str, ArrayList arrayList, int i, C17727a aVar) {
        this.f38557i = str;
        this.f38556h = arrayList;
        this.f38552d = i;
        this.f38558j = aVar;
    }

    /* renamed from: a */
    public final void mo68985a() {
        mo68987c(false);
        C17727a aVar = this.f38558j;
        String str = this.f38557i;
        List list = (List) this.f38555g.f35408b;
        aVar.f38532a.remove(str);
        C17727a.C17728a aVar2 = aVar.f38535d;
        if (aVar2 == null) {
            aVar.f38533b.mo21093d(str, list);
            return;
        }
        Message obtain = Message.obtain(aVar2, 4);
        obtain.obj = list;
        aVar.f38534c.putString("jobId", str);
        obtain.setData(aVar.f38534c);
        obtain.sendToTarget();
    }

    /* renamed from: b */
    public final void mo68986b(Exception exc) {
        mo68987c(false);
        C17727a aVar = this.f38558j;
        String str = this.f38557i;
        List list = (List) this.f38555g.f35408b;
        aVar.f38532a.remove(str);
        C17727a.C17728a aVar2 = aVar.f38535d;
        if (aVar2 == null) {
            aVar.f38533b.mo21090a(str, exc, list);
            return;
        }
        Message obtain = Message.obtain(aVar2, 2);
        obtain.obj = list;
        aVar.f38534c.putString("jobId", str);
        aVar.f38534c.putSerializable("throwable", exc);
        obtain.setData(aVar.f38534c);
        obtain.sendToTarget();
    }

    /* renamed from: c */
    public final void mo68987c(boolean z) {
        if (this.f38550b != null) {
            for (int i = 0; i < this.f38550b.size(); i++) {
                ((C18256c) this.f38550b.get(i)).mo69800f();
                ((C17783a) ((List) this.f38555g.f35408b).get(i)).getClass();
            }
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C17730c next : this.f38556h) {
            hashSet.add(next.f38541a);
            hashSet2.add(next.f38545e);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C18042c) it.next()).release();
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            C18043d dVar = (C18043d) it2.next();
            dVar.release();
            if (!z) {
                dVar.mo69610a();
                if (!TextUtils.isEmpty("")) {
                    new File("").delete();
                }
            }
        }
        if (z) {
            C17727a aVar = this.f38558j;
            String str = this.f38557i;
            List list = (List) this.f38555g.f35408b;
            aVar.f38532a.remove(str);
            C17727a.C17728a aVar2 = aVar.f38535d;
            if (aVar2 == null) {
                aVar.f38533b.mo21092c(str, list);
                return;
            }
            Message obtain = Message.obtain(aVar2, 1);
            obtain.obj = list;
            aVar.f38534c.putString("jobId", str);
            obtain.setData(aVar.f38534c);
            obtain.sendToTarget();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: lo.b} */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r20v2, types: [mo.a] */
    /* JADX WARNING: type inference failed for: r20v3, types: [mo.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02bf, code lost:
        if (r6 >= ((1.0f / ((float) r2)) + r0.f38551c)) goto L_0x02c1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02f6 A[LOOP:6: B:94:0x0256->B:121:0x02f6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f1 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68988d() throws com.linkedin.android.litr.exception.MediaTransformationException {
        /*
            r29 = this;
            r0 = r29
            java.util.List<eo.c> r1 = r0.f38556h
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()
            eo.c r2 = (p561eo.C17730c) r2
            com.google.android.play.core.assetpacks.x2 r3 = r0.f38555g
            jo.c r4 = r2.f38541a
            int r2 = r2.f38547g
            r4.mo69606h(r2)
            r3.getClass()
            fo.a r2 = new fo.a
            r2.<init>()
            java.lang.Object r3 = r3.f35408b
            java.util.List r3 = (java.util.List) r3
            r3.add(r2)
            goto L_0x0008
        L_0x002d:
            java.util.List<eo.c> r1 = r0.f38556h
            int r2 = p610kp.C18161c.f39709r1
            java.lang.String r2 = "c"
            java.util.Iterator r3 = r1.iterator()
            r4 = 0
            r6 = r4
        L_0x003a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x004f
            java.lang.Object r8 = r3.next()
            eo.c r8 = (p561eo.C17730c) r8
            long r8 = p610kp.C18161c.m30670o(r8)
            long r6 = java.lang.Math.max(r8, r6)
            goto L_0x003a
        L_0x004f:
            java.util.Iterator r1 = r1.iterator()
            r8 = 0
        L_0x0054:
            boolean r9 = r1.hasNext()
            java.lang.String r10 = "audio"
            java.lang.String r11 = "mime"
            r12 = 0
            if (r9 == 0) goto L_0x00c3
            java.lang.Object r9 = r1.next()
            eo.c r9 = (p561eo.C17730c) r9
            jo.c r14 = r9.f38541a
            int r15 = r9.f38547g
            android.media.MediaFormat r14 = r14.mo69606h(r15)
            java.lang.String r15 = "bitrate"
            boolean r16 = r14.containsKey(r15)
            if (r16 == 0) goto L_0x007a
            int r16 = r14.getInteger(r15)
            goto L_0x007c
        L_0x007a:
            r16 = -1
        L_0x007c:
            long r17 = p610kp.C18161c.m30670o(r9)
            int r19 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r19 >= 0) goto L_0x008b
            java.lang.String r3 = "Track duration is not available, using maximum duration"
            android.util.Log.d(r2, r3)
            r4 = r6
            goto L_0x008d
        L_0x008b:
            r4 = r17
        L_0x008d:
            boolean r3 = r14.containsKey(r11)
            if (r3 == 0) goto L_0x0097
            java.lang.String r12 = r14.getString(r11)
        L_0x0097:
            if (r12 == 0) goto L_0x00ad
            android.media.MediaFormat r3 = r9.f38546f
            if (r3 == 0) goto L_0x00a2
            int r16 = r3.getInteger(r15)
            goto L_0x00ad
        L_0x00a2:
            boolean r3 = r12.startsWith(r10)
            if (r3 == 0) goto L_0x00ad
            if (r16 >= 0) goto L_0x00ad
            r16 = 320000(0x4e200, float:4.48416E-40)
        L_0x00ad:
            if (r16 >= 0) goto L_0x00b6
            java.lang.String r3 = "Bitrate is not available, cannot use that track to estimate size"
            android.util.Log.d(r2, r3)
            r13 = 0
            goto L_0x00b8
        L_0x00b6:
            r13 = r16
        L_0x00b8:
            float r3 = (float) r13
            float r4 = (float) r4
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r4 = r4 / r5
            float r4 = r4 * r3
            float r8 = r8 + r4
            r4 = 0
            goto L_0x0054
        L_0x00c3:
            r1 = 1090519040(0x41000000, float:8.0)
            float r8 = r8 / r1
            long r1 = (long) r8
            float r3 = (float) r1
            r4 = 1066192077(0x3f8ccccd, float:1.1)
            float r3 = r3 * r4
            long r3 = (long) r3
            no.d r5 = r0.f38554f
            r5.getClass()
            r5 = -1
            android.os.StatFs r7 = new android.os.StatFs     // Catch:{ Exception -> 0x00e6 }
            java.io.File r8 = android.os.Environment.getDataDirectory()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r8 = r8.getAbsolutePath()     // Catch:{ Exception -> 0x00e6 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00e6 }
            long r7 = r7.getAvailableBytes()     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00ee
        L_0x00e6:
            java.lang.String r7 = "d"
            java.lang.String r8 = "Could not get Available Disk Space"
            android.util.Log.e(r7, r8)
            r7 = r5
        L_0x00ee:
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00fd
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x00f7
            goto L_0x00fd
        L_0x00f7:
            com.linkedin.android.litr.exception.InsufficientDiskSpaceException r3 = new com.linkedin.android.litr.exception.InsufficientDiskSpaceException
            r3.<init>(r1, r7)
            throw r3
        L_0x00fd:
            java.util.List<eo.c> r1 = r0.f38556h
            int r1 = r1.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r0.f38550b = r2
            r2 = 1
            if (r1 < r2) goto L_0x02fd
            r3 = 0
        L_0x010e:
            if (r3 >= r1) goto L_0x01f6
            java.util.List<eo.c> r4 = r0.f38556h
            java.lang.Object r4 = r4.get(r3)
            eo.c r4 = (p561eo.C17730c) r4
            mo.d r5 = r0.f38553e
            int r6 = r4.f38547g
            int r7 = r4.f38548h
            jo.c r8 = r4.f38541a
            go.a r9 = r4.f38542b
            lo.d r14 = r4.f38543c
            go.b r15 = r4.f38544d
            jo.d r2 = r4.f38545e
            android.media.MediaFormat r4 = r4.f38546f
            r5.getClass()
            if (r4 != 0) goto L_0x0136
            mo.b r4 = new mo.b
            r4.<init>(r8, r6, r2, r7)
            goto L_0x01bf
        L_0x0136:
            java.lang.String r5 = r4.getString(r11)
            if (r5 == 0) goto L_0x01ee
            java.lang.String r13 = "video"
            boolean r18 = r5.startsWith(r13)
            if (r18 != 0) goto L_0x014a
            boolean r18 = r5.startsWith(r10)
            if (r18 == 0) goto L_0x014e
        L_0x014a:
            if (r9 == 0) goto L_0x01e6
            if (r15 == 0) goto L_0x01de
        L_0x014e:
            boolean r13 = r5.startsWith(r13)
            if (r13 == 0) goto L_0x0177
            if (r14 == 0) goto L_0x016f
            mo.e r5 = new mo.e
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r4
            r24 = r9
            r25 = r15
            r26 = r8
            r27 = r2
            r28 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x016d:
            r4 = r5
            goto L_0x01bf
        L_0x016f:
            com.linkedin.android.litr.exception.TrackTranscoderException r1 = new com.linkedin.android.litr.exception.TrackTranscoderException
            com.linkedin.android.litr.exception.TrackTranscoderException$Error r2 = com.linkedin.android.litr.exception.TrackTranscoderException.Error.RENDERER_NOT_PROVIDED
            r1.<init>(r2, r4, r12, r12)
            throw r1
        L_0x0177:
            boolean r13 = r5.startsWith(r10)
            if (r13 == 0) goto L_0x019f
            if (r14 != 0) goto L_0x0187
            lo.b r5 = new lo.b
            r5.<init>(r15, r12)
            r28 = r5
            goto L_0x0189
        L_0x0187:
            r28 = r14
        L_0x0189:
            mo.a r5 = new mo.a
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r4
            r24 = r9
            r25 = r15
            r26 = r8
            r27 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x016d
        L_0x019f:
            java.lang.String r4 = "d"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "Unsupported track mime type: "
            r9.append(r13)
            r9.append(r5)
            java.lang.String r5 = ", will use passthrough transcoder"
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            android.util.Log.i(r4, r5)
            mo.b r4 = new mo.b
            r4.<init>(r8, r6, r2, r7)
        L_0x01bf:
            java.util.ArrayList r2 = r0.f38550b
            r2.add(r4)
            com.google.android.play.core.assetpacks.x2 r2 = r0.f38555g
            r4.mo69801b()
            r4.mo69802c()
            java.lang.Object r2 = r2.f35408b
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r3)
            fo.a r2 = (p569fo.C17783a) r2
            r2.getClass()
            int r3 = r3 + 1
            r2 = 1
            goto L_0x010e
        L_0x01de:
            com.linkedin.android.litr.exception.TrackTranscoderException r1 = new com.linkedin.android.litr.exception.TrackTranscoderException
            com.linkedin.android.litr.exception.TrackTranscoderException$Error r2 = com.linkedin.android.litr.exception.TrackTranscoderException.Error.ENCODER_NOT_PROVIDED
            r1.<init>(r2, r4, r12, r12)
            throw r1
        L_0x01e6:
            com.linkedin.android.litr.exception.TrackTranscoderException r1 = new com.linkedin.android.litr.exception.TrackTranscoderException
            com.linkedin.android.litr.exception.TrackTranscoderException$Error r2 = com.linkedin.android.litr.exception.TrackTranscoderException.Error.DECODER_NOT_PROVIDED
            r1.<init>(r2, r4, r12, r12)
            throw r1
        L_0x01ee:
            com.linkedin.android.litr.exception.TrackTranscoderException r1 = new com.linkedin.android.litr.exception.TrackTranscoderException
            com.linkedin.android.litr.exception.TrackTranscoderException$Error r2 = com.linkedin.android.litr.exception.TrackTranscoderException.Error.SOURCE_TRACK_MIME_TYPE_NOT_FOUND
            r1.<init>(r2, r4, r12, r12)
            throw r1
        L_0x01f6:
            java.util.ArrayList r1 = r0.f38550b
            java.util.Iterator r1 = r1.iterator()
        L_0x01fc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x020c
            java.lang.Object r2 = r1.next()
            mo.c r2 = (p625mo.C18256c) r2
            r2.mo69799e()
            goto L_0x01fc
        L_0x020c:
            java.util.List<eo.c> r1 = r0.f38556h
            java.util.Iterator r1 = r1.iterator()
        L_0x0212:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x022d
            java.lang.Object r2 = r1.next()
            eo.c r2 = (p561eo.C17730c) r2
            jo.c r2 = r2.f38541a
            nj.b r3 = r2.getSelection()
            r3.getClass()
            r3 = 0
            r2.mo69603f(r3)
            goto L_0x0212
        L_0x022d:
            eo.a r1 = r0.f38558j
            java.lang.String r2 = r0.f38557i
            eo.a$a r3 = r1.f38535d
            java.lang.String r4 = "jobId"
            if (r3 != 0) goto L_0x023f
            eo.e r1 = r1.f38533b
            r1.mo21094e(r2)
            r1 = 0
            r5 = 0
            goto L_0x0254
        L_0x023f:
            r5 = 0
            android.os.Message r3 = android.os.Message.obtain(r3, r5)
            r3.obj = r12
            android.os.Bundle r6 = r1.f38534c
            r6.putString(r4, r2)
            android.os.Bundle r1 = r1.f38534c
            r3.setData(r1)
            r3.sendToTarget()
            r1 = 0
        L_0x0254:
            r0.f38551c = r1
        L_0x0256:
            r2 = r5
            r3 = 1
        L_0x0258:
            java.util.ArrayList r6 = r0.f38550b
            int r6 = r6.size()
            r7 = 3
            if (r2 >= r6) goto L_0x028b
            java.util.ArrayList r6 = r0.f38550b
            java.lang.Object r6 = r6.get(r2)
            mo.c r6 = (p625mo.C18256c) r6
            java.lang.System.currentTimeMillis()
            int r6 = r6.mo69798d()
            if (r6 != r7) goto L_0x0274
            r6 = 1
            goto L_0x0275
        L_0x0274:
            r6 = r5
        L_0x0275:
            r3 = r3 & r6
            com.google.android.play.core.assetpacks.x2 r6 = r0.f38555g
            java.lang.System.currentTimeMillis()
            java.lang.Object r6 = r6.f35408b
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r6.get(r2)
            fo.a r6 = (p569fo.C17783a) r6
            r6.getClass()
            int r2 = r2 + 1
            goto L_0x0258
        L_0x028b:
            java.util.ArrayList r2 = r0.f38550b
            java.util.Iterator r2 = r2.iterator()
            r6 = r1
        L_0x0292:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x02a2
            java.lang.Object r8 = r2.next()
            mo.c r8 = (p625mo.C18256c) r8
            float r8 = r8.f40027l
            float r6 = r6 + r8
            goto L_0x0292
        L_0x02a2:
            java.util.ArrayList r2 = r0.f38550b
            int r2 = r2.size()
            float r2 = (float) r2
            float r6 = r6 / r2
            int r2 = r0.f38552d
            if (r2 != 0) goto L_0x02b4
            float r8 = r0.f38551c
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x02c1
        L_0x02b4:
            if (r2 == 0) goto L_0x02eb
            float r8 = r0.f38551c
            r9 = 1065353216(0x3f800000, float:1.0)
            float r2 = (float) r2
            float r9 = r9 / r2
            float r9 = r9 + r8
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x02eb
        L_0x02c1:
            eo.a r2 = r0.f38558j
            java.lang.String r8 = r0.f38557i
            eo.a$a r9 = r2.f38535d
            if (r9 != 0) goto L_0x02cf
            eo.e r2 = r2.f38533b
            r2.mo21091b(r8, r6)
            goto L_0x02e9
        L_0x02cf:
            android.os.Message r7 = android.os.Message.obtain(r9, r7)
            r7.obj = r12
            android.os.Bundle r9 = r2.f38534c
            r9.putString(r4, r8)
            android.os.Bundle r8 = r2.f38534c
            java.lang.String r9 = "progress"
            r8.putFloat(r9, r6)
            android.os.Bundle r2 = r2.f38534c
            r7.setData(r2)
            r7.sendToTarget()
        L_0x02e9:
            r0.f38551c = r6
        L_0x02eb:
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 == 0) goto L_0x02f6
            r29.mo68985a()
            r13 = r5
            goto L_0x02f9
        L_0x02f6:
            if (r3 == 0) goto L_0x0256
            r13 = r3
        L_0x02f9:
            r0.mo68987c(r13)
            return
        L_0x02fd:
            com.linkedin.android.litr.exception.TrackTranscoderException r1 = new com.linkedin.android.litr.exception.TrackTranscoderException
            com.linkedin.android.litr.exception.TrackTranscoderException$Error r2 = com.linkedin.android.litr.exception.TrackTranscoderException.Error.NO_TRACKS_FOUND
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p561eo.C17731d.mo68988d():void");
    }

    public final void run() {
        try {
            mo68988d();
        } catch (RuntimeException e) {
            Log.e(f38549k, "Transformation job error", e);
            if (e.getCause() instanceof InterruptedException) {
                mo68985a();
            } else {
                mo68986b(e);
            }
        } catch (MediaTransformationException e2) {
            Log.e(f38549k, "Transformation job error", e2);
            e2.setJobId(this.f38557i);
            mo68986b(e2);
        }
    }
}
