package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PathMeasure;
import android.support.p013v4.media.C0072d;
import com.airbnb.lottie.parser.moshi.C4863a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p149j3.C7105f;
import p196o3.C7541t;
import p206p3.C7659e;
import p756lr.C19906r;
import p756lr.C19913x;

/* renamed from: com.airbnb.lottie.d */
public final class C4829d {

    /* renamed from: a */
    public static final HashMap f10856a = new HashMap();

    /* renamed from: com.airbnb.lottie.d$a */
    public class C4830a implements C4838i<C4828c> {

        /* renamed from: a */
        public final /* synthetic */ String f10857a;

        public C4830a(String str) {
            this.f10857a = str;
        }

        public final void onResult(Object obj) {
            C4828c cVar = (C4828c) obj;
            C4829d.f10856a.remove(this.f10857a);
        }
    }

    /* renamed from: com.airbnb.lottie.d$b */
    public class C4831b implements C4838i<Throwable> {

        /* renamed from: a */
        public final /* synthetic */ String f10858a;

        public C4831b(String str) {
            this.f10858a = str;
        }

        public final void onResult(Object obj) {
            Throwable th = (Throwable) obj;
            C4829d.f10856a.remove(this.f10858a);
        }
    }

    /* renamed from: com.airbnb.lottie.d$c */
    public class C4832c implements Callable<C4841l<C4828c>> {

        /* renamed from: b */
        public final /* synthetic */ WeakReference f10859b;

        /* renamed from: c */
        public final /* synthetic */ Context f10860c;

        /* renamed from: d */
        public final /* synthetic */ int f10861d;

        public C4832c(WeakReference weakReference, Context context, int i) {
            this.f10859b = weakReference;
            this.f10860c = context;
            this.f10861d = i;
        }

        public final Object call() throws Exception {
            Context context = (Context) this.f10859b.get();
            if (context == null) {
                context = this.f10860c;
            }
            int i = this.f10861d;
            try {
                return C4829d.m10419b(context.getResources().openRawResource(i), C4829d.m10423f(context, i));
            } catch (Resources.NotFoundException e) {
                return new C4841l((Throwable) e);
            }
        }
    }

    /* renamed from: com.airbnb.lottie.d$d */
    public class C4833d implements Callable<C4841l<C4828c>> {

        /* renamed from: b */
        public final /* synthetic */ C4828c f10862b;

        public C4833d(C4828c cVar) {
            this.f10862b = cVar;
        }

        public final Object call() throws Exception {
            return new C4841l(this.f10862b);
        }
    }

    /* renamed from: a */
    public static C4849n<C4828c> m10418a(String str, Callable<C4841l<C4828c>> callable) {
        C4828c cVar = str == null ? null : C7105f.f15805b.f15806a.get(str);
        if (cVar != null) {
            return new C4849n<>(new C4833d(cVar));
        }
        if (str != null) {
            HashMap hashMap = f10856a;
            if (hashMap.containsKey(str)) {
                return (C4849n) hashMap.get(str);
            }
        }
        C4849n<C4828c> nVar = new C4849n<>(callable);
        nVar.mo14619a(new C4830a(str));
        C4831b bVar = new C4831b(str);
        synchronized (nVar) {
            if (!(nVar.f11019d == null || nVar.f11019d.f10903b == null)) {
                bVar.onResult(nVar.f11019d.f10903b);
            }
            nVar.f11017b.add(bVar);
        }
        f10856a.put(str, nVar);
        return nVar;
    }

    /* renamed from: b */
    public static C4841l<C4828c> m10419b(InputStream inputStream, String str) {
        try {
            C19913x b = C19906r.m33998b(C19906r.m34002f(inputStream));
            String[] strArr = JsonReader.f11024f;
            return m10420c(new C4863a(b), str, true);
        } finally {
            C7659e.m14701b(inputStream);
        }
    }

    /* renamed from: c */
    public static C4841l m10420c(C4863a aVar, String str, boolean z) {
        try {
            C4828c a = C7541t.m14523a(aVar);
            if (str != null) {
                C7105f.f15805b.f15806a.put(str, a);
            }
            C4841l lVar = new C4841l(a);
            if (z) {
                C7659e.m14701b(aVar);
            }
            return lVar;
        } catch (Exception e) {
            C4841l lVar2 = new C4841l((Throwable) e);
            if (z) {
                C7659e.m14701b(aVar);
            }
            return lVar2;
        } catch (Throwable th) {
            if (z) {
                C7659e.m14701b(aVar);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public static C4849n<C4828c> m10421d(Context context, int i) {
        return m10418a(m10423f(context, i), new C4832c(new WeakReference(context), context.getApplicationContext(), i));
    }

    /* renamed from: e */
    public static C4841l<C4828c> m10422e(ZipInputStream zipInputStream, String str) {
        C4837h hVar;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C4828c cVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    C19913x b = C19906r.m33998b(C19906r.m34002f(zipInputStream));
                    String[] strArr = JsonReader.f11024f;
                    cVar = (C4828c) m10420c(new C4863a(b), (String) null, false).f10902a;
                } else {
                    if (!name.contains(".png")) {
                        if (!name.contains(".webp")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (cVar == null) {
                return new C4841l<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<C4837h> it = cVar.f10844d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hVar = null;
                        break;
                    }
                    hVar = it.next();
                    if (hVar.f10871c.equals(str2)) {
                        break;
                    }
                }
                if (hVar != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    int i = hVar.f10869a;
                    int i2 = hVar.f10870b;
                    PathMeasure pathMeasure = C7659e.f16963a;
                    if (!(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    hVar.f10872d = bitmap;
                }
            }
            for (Map.Entry next : cVar.f10844d.entrySet()) {
                if (((C4837h) next.getValue()).f10872d == null) {
                    StringBuilder h = C0072d.m201h("There is no image for ");
                    h.append(((C4837h) next.getValue()).f10871c);
                    return new C4841l<>((Throwable) new IllegalStateException(h.toString()));
                }
            }
            if (str != null) {
                C7105f.f15805b.f15806a.put(str, cVar);
            }
            return new C4841l<>(cVar);
        } catch (IOException e) {
            return new C4841l<>((Throwable) e);
        }
    }

    /* renamed from: f */
    public static String m10423f(Context context, int i) {
        StringBuilder h = C0072d.m201h("rawRes");
        h.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        h.append(i);
        return h.toString();
    }
}
