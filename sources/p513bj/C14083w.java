package p513bj;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: bj.w */
public final class C14083w implements C14057h {

    /* renamed from: b */
    public static final ArrayList f31010b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f31011a;

    /* renamed from: bj.w$a */
    public static final class C14084a {

        /* renamed from: a */
        public Message f31012a;

        /* renamed from: a */
        public final void mo46951a() {
            Message message = this.f31012a;
            message.getClass();
            message.sendToTarget();
            this.f31012a = null;
            ArrayList arrayList = C14083w.f31010b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public C14083w(Handler handler) {
        this.f31011a = handler;
    }

    /* renamed from: b */
    public static C14084a m21762b() {
        C14084a aVar;
        ArrayList arrayList = f31010b;
        synchronized (arrayList) {
            aVar = arrayList.isEmpty() ? new C14084a() : (C14084a) arrayList.remove(arrayList.size() - 1);
        }
        return aVar;
    }

    /* renamed from: a */
    public final C14084a mo46949a(int i, Object obj) {
        C14084a b = m21762b();
        b.f31012a = this.f31011a.obtainMessage(i, obj);
        return b;
    }

    /* renamed from: c */
    public final boolean mo46950c(int i) {
        return this.f31011a.sendEmptyMessage(i);
    }
}
