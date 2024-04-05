package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.support.p013v4.media.C0072d;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.core.internal.view.SupportMenu;
import com.squareup.picasso.C17425a;
import com.squareup.picasso.C17443i;
import com.squareup.picasso.C17452n;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public final class Picasso {

    /* renamed from: m */
    public static final C17419a f38038m = new C17419a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: n */
    public static volatile Picasso f38039n = null;

    /* renamed from: a */
    public final C17423d f38040a;

    /* renamed from: b */
    public final List<C17462u> f38041b;

    /* renamed from: c */
    public final Context f38042c;

    /* renamed from: d */
    public final C17443i f38043d;

    /* renamed from: e */
    public final C17438d f38044e;

    /* renamed from: f */
    public final C17465w f38045f;

    /* renamed from: g */
    public final WeakHashMap f38046g;

    /* renamed from: h */
    public final WeakHashMap f38047h;

    /* renamed from: i */
    public final ReferenceQueue<Object> f38048i;

    /* renamed from: j */
    public final Bitmap.Config f38049j = null;

    /* renamed from: k */
    public boolean f38050k;

    /* renamed from: l */
    public volatile boolean f38051l;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);
        
        public final int debugColor;

        private LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: com.squareup.picasso.Picasso$a */
    public static class C17419a extends Handler {
        public C17419a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Bitmap bitmap;
            int i = message.what;
            if (i == 3) {
                C17425a aVar = (C17425a) message.obj;
                if (aVar.f38056a.f38051l) {
                    C17427a0.m29282e("Main", "canceled", aVar.f38057b.mo68630b(), "target got garbage collected");
                }
                aVar.f38056a.mo68569a(aVar.mo68586d());
            } else if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C17431c cVar = (C17431c) list.get(i2);
                    Picasso picasso = cVar.f38080c;
                    picasso.getClass();
                    C17425a aVar2 = cVar.f38089l;
                    ArrayList arrayList = cVar.f38090m;
                    boolean z = arrayList != null && !arrayList.isEmpty();
                    if (aVar2 != null || z) {
                        Uri uri = cVar.f38085h.f38149c;
                        Exception exc = cVar.f38094q;
                        Bitmap bitmap2 = cVar.f38091n;
                        LoadedFrom loadedFrom = cVar.f38093p;
                        if (aVar2 != null) {
                            picasso.mo68570b(bitmap2, loadedFrom, aVar2, exc);
                        }
                        if (z) {
                            int size2 = arrayList.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                picasso.mo68570b(bitmap2, loadedFrom, (C17425a) arrayList.get(i3), exc);
                            }
                        }
                        picasso.getClass();
                    }
                }
            } else if (i == 13) {
                List list2 = (List) message.obj;
                int size3 = list2.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    C17425a aVar3 = (C17425a) list2.get(i4);
                    Picasso picasso2 = aVar3.f38056a;
                    picasso2.getClass();
                    if (MemoryPolicy.shouldReadFromMemoryCache(aVar3.f38060e)) {
                        C17452n.C17453a aVar4 = (C17452n.C17453a) ((C17452n) picasso2.f38044e).f38126a.get(aVar3.f38064i);
                        bitmap = aVar4 != null ? aVar4.f38127a : null;
                        if (bitmap != null) {
                            picasso2.f38045f.f38183b.sendEmptyMessage(0);
                        } else {
                            picasso2.f38045f.f38183b.sendEmptyMessage(1);
                        }
                    } else {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        LoadedFrom loadedFrom2 = LoadedFrom.MEMORY;
                        picasso2.mo68570b(bitmap, loadedFrom2, aVar3, (Exception) null);
                        if (picasso2.f38051l) {
                            C17427a0.m29282e("Main", "completed", aVar3.f38057b.mo68630b(), "from " + loadedFrom2);
                        }
                    } else {
                        picasso2.mo68571c(aVar3);
                        if (picasso2.f38051l) {
                            C17427a0.m29281d("Main", "resumed", aVar3.f38057b.mo68630b());
                        }
                    }
                }
            } else {
                StringBuilder h = C0072d.m201h("Unknown handler message received: ");
                h.append(message.what);
                throw new AssertionError(h.toString());
            }
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$b */
    public static class C17420b extends Thread {

        /* renamed from: b */
        public final ReferenceQueue<Object> f38052b;

        /* renamed from: c */
        public final Handler f38053c;

        /* renamed from: com.squareup.picasso.Picasso$b$a */
        public class C17421a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Exception f38054b;

            public C17421a(Exception exc) {
                this.f38054b = exc;
            }

            public final void run() {
                throw new RuntimeException(this.f38054b);
            }
        }

        public C17420b(ReferenceQueue referenceQueue, C17419a aVar) {
            this.f38052b = referenceQueue;
            this.f38053c = aVar;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C17425a.C17426a aVar = (C17425a.C17426a) this.f38052b.remove(1000);
                    Message obtainMessage = this.f38053c.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f38068a;
                        this.f38053c.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f38053c.post(new C17421a(e));
                    return;
                }
            }
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$c */
    public interface C17422c {
        /* renamed from: a */
        void mo68576a();
    }

    /* renamed from: com.squareup.picasso.Picasso$d */
    public interface C17423d {

        /* renamed from: a */
        public static final C17424a f38055a = new C17424a();

        /* renamed from: com.squareup.picasso.Picasso$d$a */
        public static class C17424a implements C17423d {
        }
    }

    public Picasso(Context context, C17443i iVar, C17438d dVar, C17423d dVar2, C17465w wVar) {
        this.f38042c = context;
        this.f38043d = iVar;
        this.f38044e = dVar;
        this.f38040a = dVar2;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new C17464v(context));
        arrayList.add(new C17440f(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new C17441g(context));
        arrayList.add(new C17430b(context));
        arrayList.add(new C17449k(context));
        arrayList.add(new NetworkRequestHandler(iVar.f38111c, wVar));
        this.f38041b = Collections.unmodifiableList(arrayList);
        this.f38045f = wVar;
        this.f38046g = new WeakHashMap();
        this.f38047h = new WeakHashMap();
        this.f38050k = false;
        this.f38051l = false;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f38048i = referenceQueue;
        new C17420b(referenceQueue, f38038m).start();
    }

    /* renamed from: d */
    public static Picasso m29268d() {
        if (f38039n == null) {
            synchronized (Picasso.class) {
                if (f38039n == null) {
                    Context context = PicassoProvider.context;
                    if (context != null) {
                        Context applicationContext = context.getApplicationContext();
                        C17455p pVar = new C17455p(applicationContext);
                        C17452n nVar = new C17452n(applicationContext);
                        C17457r rVar = new C17457r();
                        C17423d.C17424a aVar = C17423d.f38055a;
                        C17465w wVar = new C17465w(nVar);
                        f38039n = new Picasso(applicationContext, new C17443i(applicationContext, rVar, f38038m, pVar, nVar, wVar), nVar, aVar, wVar);
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return f38039n;
    }

    /* renamed from: a */
    public final void mo68569a(Object obj) {
        StringBuilder sb = C17427a0.f38069a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            C17425a aVar = (C17425a) this.f38046g.remove(obj);
            if (aVar != null) {
                aVar.mo68583a();
                C17443i.C17444a aVar2 = this.f38043d.f38116h;
                aVar2.sendMessage(aVar2.obtainMessage(2, aVar));
            }
            if (obj instanceof ImageView) {
                C17442h hVar = (C17442h) this.f38047h.remove((ImageView) obj);
                if (hVar != null) {
                    hVar.f38106b.getClass();
                    hVar.f38108d = null;
                    ImageView imageView = hVar.f38107c.get();
                    if (imageView != null) {
                        hVar.f38107c.clear();
                        imageView.removeOnAttachStateChangeListener(hVar);
                        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(hVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Method call should happen from the main thread.");
    }

    /* renamed from: b */
    public final void mo68570b(Bitmap bitmap, LoadedFrom loadedFrom, C17425a aVar, Exception exc) {
        if (!aVar.f38067l) {
            if (!aVar.f38066k) {
                this.f38046g.remove(aVar.mo68586d());
            }
            if (bitmap == null) {
                aVar.mo68585c(exc);
                if (this.f38051l) {
                    C17427a0.m29282e("Main", "errored", aVar.f38057b.mo68630b(), exc.getMessage());
                }
            } else if (loadedFrom != null) {
                aVar.mo68584b(bitmap, loadedFrom);
                if (this.f38051l) {
                    String b = aVar.f38057b.mo68630b();
                    C17427a0.m29282e("Main", "completed", b, "from " + loadedFrom);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* renamed from: c */
    public final void mo68571c(C17425a aVar) {
        Object d = aVar.mo68586d();
        if (!(d == null || this.f38046g.get(d) == aVar)) {
            mo68569a(d);
            this.f38046g.put(d, aVar);
        }
        C17443i.C17444a aVar2 = this.f38043d.f38116h;
        aVar2.sendMessage(aVar2.obtainMessage(1, aVar));
    }

    /* renamed from: e */
    public final C17461t mo68572e(String str) {
        if (str == null) {
            return new C17461t(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return new C17461t(this, Uri.parse(str), 0);
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }
}
