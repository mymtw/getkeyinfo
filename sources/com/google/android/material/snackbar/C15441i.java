package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.i */
public final class C15441i {

    /* renamed from: e */
    public static C15441i f34679e;

    /* renamed from: a */
    public final Object f34680a = new Object();

    /* renamed from: b */
    public final Handler f34681b = new Handler(Looper.getMainLooper(), new C15442a());

    /* renamed from: c */
    public C15444c f34682c;

    /* renamed from: d */
    public C15444c f34683d;

    /* renamed from: com.google.android.material.snackbar.i$a */
    public class C15442a implements Handler.Callback {
        public C15442a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C15441i iVar = C15441i.this;
            C15444c cVar = (C15444c) message.obj;
            synchronized (iVar.f34680a) {
                if (iVar.f34682c == cVar || iVar.f34683d == cVar) {
                    iVar.mo54778a(cVar, 2);
                }
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.i$b */
    public interface C15443b {
        /* renamed from: a */
        void mo54759a();

        /* renamed from: b */
        void mo54760b(int i);
    }

    /* renamed from: com.google.android.material.snackbar.i$c */
    public static class C15444c {

        /* renamed from: a */
        public final WeakReference<C15443b> f34685a;

        /* renamed from: b */
        public int f34686b;

        /* renamed from: c */
        public boolean f34687c;

        public C15444c(int i, BaseTransientBottomBar.C15429c cVar) {
            this.f34685a = new WeakReference<>(cVar);
            this.f34686b = i;
        }
    }

    /* renamed from: b */
    public static C15441i m25034b() {
        if (f34679e == null) {
            f34679e = new C15441i();
        }
        return f34679e;
    }

    /* renamed from: a */
    public final boolean mo54778a(C15444c cVar, int i) {
        C15443b bVar = cVar.f34685a.get();
        if (bVar == null) {
            return false;
        }
        this.f34681b.removeCallbacksAndMessages(cVar);
        bVar.mo54760b(i);
        return true;
    }

    /* renamed from: c */
    public final boolean mo54779c(BaseTransientBottomBar.C15429c cVar) {
        C15444c cVar2 = this.f34682c;
        if (cVar2 != null) {
            if (cVar != null && cVar2.f34685a.get() == cVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo54780d(C15444c cVar) {
        int i = cVar.f34686b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
            }
            this.f34681b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f34681b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }
}
