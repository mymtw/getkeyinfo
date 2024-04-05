package p099f1;

import android.view.inputmethod.InputContentInfo;

/* renamed from: f1.e */
public final class C6772e {

    /* renamed from: a */
    public final C6774b f14906a;

    /* renamed from: f1.e$a */
    public static final class C6773a implements C6774b {

        /* renamed from: a */
        public final InputContentInfo f14907a;

        public C6773a(Object obj) {
            this.f14907a = (InputContentInfo) obj;
        }

        /* renamed from: a */
        public final Object mo18913a() {
            return this.f14907a;
        }

        /* renamed from: b */
        public final void mo18914b() {
            this.f14907a.requestPermission();
        }
    }

    /* renamed from: f1.e$b */
    public interface C6774b {
    }

    public C6772e(C6773a aVar) {
        this.f14906a = aVar;
    }
}
