package p561eo;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Looper;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p010a9.C0048b;
import p324cf.C8584a;
import p600jo.C18042c;
import p610kp.C18161c;
import p617lo.C18213d;

/* renamed from: eo.b */
public final class C17729b {

    /* renamed from: a */
    public final Context f38537a;

    /* renamed from: b */
    public final ExecutorService f38538b;

    /* renamed from: c */
    public final Looper f38539c;

    /* renamed from: d */
    public final HashMap f38540d = new HashMap(10);

    public C17729b(Context context) {
        Looper mainLooper = Looper.getMainLooper();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f38537a = context.getApplicationContext();
        this.f38539c = mainLooper;
        this.f38538b = newSingleThreadExecutor;
    }

    /* renamed from: a */
    public static MediaFormat m29729a(MediaFormat mediaFormat, String str) {
        if (str == null) {
            return null;
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
        createAudioFormat.setInteger("bitrate", mediaFormat.containsKey("bitrate") ? mediaFormat.getInteger("bitrate") : 256000);
        if (!mediaFormat.containsKey("durationUs")) {
            return createAudioFormat;
        }
        createAudioFormat.setLong("durationUs", mediaFormat.getLong("durationUs"));
        return createAudioFormat;
    }

    /* renamed from: b */
    public final void mo68984b(String str, ArrayList arrayList, C8584a aVar, int i) {
        int i2;
        C18213d dVar;
        MediaFormat mediaFormat;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        C18042c cVar;
        String str2 = str;
        if (!this.f38540d.containsKey(str2)) {
            int size = arrayList.size();
            int i7 = 0;
            ArrayList arrayList2 = arrayList;
            while (i7 < size) {
                C17730c cVar2 = (C17730c) arrayList2.get(i7);
                if (cVar2.f38546f != null || (dVar = cVar2.f38543c) == null || !dVar.mo69739b()) {
                    ArrayList arrayList3 = arrayList;
                    i2 = size;
                } else {
                    C18042c cVar3 = cVar2.f38541a;
                    int i8 = cVar2.f38547g;
                    MediaFormat h = cVar3.mo69606h(i8);
                    MediaFormat mediaFormat2 = null;
                    String string = h.containsKey("mime") ? h.getString("mime") : null;
                    if (string == null) {
                        i4 = size;
                        i5 = i7;
                    } else if (string.startsWith("video")) {
                        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(string, h.getInteger(ResponseConstants.WIDTH), h.getInteger(ResponseConstants.HEIGHT));
                        int i9 = C18161c.f39709r1;
                        MediaFormat h2 = cVar3.mo69606h(i8);
                        if (h2.containsKey("bitrate")) {
                            i6 = h2.getInteger("bitrate");
                            i2 = size;
                            i3 = i7;
                        } else {
                            int i10 = size;
                            float f2 = ((float) h2.getLong("durationUs")) / 1000000.0f;
                            if (f2 == 0.0f) {
                                i6 = 0;
                                i3 = i7;
                                i2 = i10;
                            } else {
                                i3 = i7;
                                float a = (float) cVar3.mo69598a();
                                int e = cVar3.mo69602e();
                                float f3 = 0.0f;
                                i2 = i10;
                                int i11 = 0;
                                while (i11 < e) {
                                    int i12 = e;
                                    MediaFormat h3 = cVar3.mo69606h(i11);
                                    if (!h3.containsKey("mime")) {
                                        f = f2;
                                        cVar = cVar3;
                                    } else if (!h3.containsKey("bitrate") || !h3.containsKey("durationUs")) {
                                        f = f2;
                                        cVar = cVar3;
                                        if (h3.getString("mime").startsWith("video")) {
                                            f3 = ((((float) h3.getLong("durationUs")) / 1000000.0f) * ((float) (h3.getInteger(ResponseConstants.HEIGHT) * h3.getInteger(ResponseConstants.WIDTH)))) + f3;
                                        }
                                    } else {
                                        cVar = cVar3;
                                        f = f2;
                                        a -= ((((float) h3.getLong("durationUs")) / 1000000.0f) * ((float) h3.getInteger("bitrate"))) / 8.0f;
                                    }
                                    i11++;
                                    e = i12;
                                    cVar3 = cVar;
                                    f2 = f;
                                }
                                float f4 = f2;
                                float integer = ((float) (h2.getInteger(ResponseConstants.HEIGHT) * h2.getInteger(ResponseConstants.WIDTH))) * f4;
                                if (f3 > 0.0f) {
                                    a = (a * integer) / f3;
                                }
                                i6 = (int) ((a * 8.0f) / f4);
                            }
                        }
                        createVideoFormat.setInteger("bitrate", i6);
                        int i13 = 5;
                        if (h.containsKey("i-frame-interval")) {
                            i13 = h.getInteger("i-frame-interval");
                        }
                        createVideoFormat.setInteger("i-frame-interval", i13);
                        mediaFormat = createVideoFormat;
                        ArrayList arrayList4 = arrayList;
                        i7 = i3;
                        arrayList4.set(i7, new C17730c(cVar2.f38541a, cVar2.f38542b, cVar2.f38543c, cVar2.f38544d, cVar2.f38545e, mediaFormat, cVar2.f38547g, cVar2.f38548h));
                        arrayList2 = arrayList4;
                    } else {
                        i4 = size;
                        i5 = i7;
                        if (string.startsWith("audio")) {
                            mediaFormat2 = MediaFormat.createAudioFormat(string, h.getInteger("sample-rate"), h.getInteger("channel-count"));
                            mediaFormat2.setInteger("bitrate", h.getInteger("bitrate"));
                        }
                    }
                    mediaFormat = mediaFormat2;
                    ArrayList arrayList42 = arrayList;
                    i7 = i3;
                    arrayList42.set(i7, new C17730c(cVar2.f38541a, cVar2.f38542b, cVar2.f38543c, cVar2.f38544d, cVar2.f38545e, mediaFormat, cVar2.f38547g, cVar2.f38548h));
                    arrayList2 = arrayList42;
                }
                i7++;
                String str3 = str;
                size = i2;
            }
            String str4 = str;
            this.f38540d.put(str4, this.f38538b.submit(new C17731d(str4, arrayList2, i, new C17727a(this.f38540d, aVar, this.f38539c))));
            return;
        }
        throw new IllegalArgumentException(C0048b.m163a("Request with id ", str2, " already exists"));
    }
}
