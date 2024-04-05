package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.emoji2.text.C2665e;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002a1.C0013g;
import p136i2.C6983a;
import p136i2.C6984b;

public class EmojiCompatInitializer implements C6984b<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    public static class C2654a extends C2665e.C2668c {
        public C2654a(Context context) {
            super(new C2655b(context));
            this.f6018b = 1;
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    public static class C2655b implements C2665e.C2672g {

        /* renamed from: a */
        public final Context f5998a;

        public C2655b(Context context) {
            this.f5998a = context.getApplicationContext();
        }

        /* renamed from: a */
        public final void mo10026a(C2665e.C2673h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C2658a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new C2675f(this, 0, hVar, threadPoolExecutor));
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    public static class C2656c implements Runnable {
        public final void run() {
            try {
                int i = C0013g.f24a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (C2665e.f6004k != null) {
                    C2665e.m6414a().mo10065c();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i2 = C0013g.f24a;
                Trace.endSection();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final List<Class<? extends C6984b<?>>> mo10023a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: b */
    public final Boolean create(Context context) {
        Object obj;
        C2654a aVar = new C2654a(context);
        if (C2665e.f6004k == null) {
            synchronized (C2665e.f6003j) {
                if (C2665e.f6004k == null) {
                    C2665e.f6004k = new C2665e(aVar);
                }
            }
        }
        C6983a c = C6983a.m13524c(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        c.getClass();
        synchronized (C6983a.f15471e) {
            try {
                obj = c.f15472a.get(cls);
                if (obj == null) {
                    obj = c.mo19153b(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        final Lifecycle lifecycle = ((C2887s) obj).getLifecycle();
        lifecycle.mo10733a(new C2857f() {
            public final void onResume(C2887s sVar) {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? C2659b.m6408a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new C2656c(), 500);
                lifecycle.mo10735c(this);
            }
        });
        return Boolean.TRUE;
    }
}
