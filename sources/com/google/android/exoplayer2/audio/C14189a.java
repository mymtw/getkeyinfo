package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.profileinstaller.C3067i;
import com.google.android.exoplayer2.Format;
import p594jh.C17921i1;
import p619mh.C18223d;
import p619mh.C18224e;

/* renamed from: com.google.android.exoplayer2.audio.a */
public interface C14189a {

    /* renamed from: com.google.android.exoplayer2.audio.a$a */
    public static final class C14190a {

        /* renamed from: a */
        public final Handler f31402a;

        /* renamed from: b */
        public final C14189a f31403b;

        public C14190a(Handler handler, C17921i1.C17923b bVar) {
            this.f31402a = handler;
            this.f31403b = bVar;
        }

        /* renamed from: a */
        public final void mo47249a(C18223d dVar) {
            synchronized (dVar) {
            }
            Handler handler = this.f31402a;
            if (handler != null) {
                handler.post(new C3067i(3, this, dVar));
            }
        }
    }

    /* renamed from: b */
    void mo47239b(String str) {
    }

    /* renamed from: d */
    void mo47240d(C18223d dVar) {
    }

    /* renamed from: e */
    void mo47241e(Exception exc) {
    }

    /* renamed from: f */
    void mo47242f(long j) {
    }

    /* renamed from: g */
    void mo47243g(Format format, C18224e eVar) {
    }

    /* renamed from: k */
    void mo47244k(long j, long j2, String str) {
    }

    /* renamed from: o */
    void mo47245o(long j, long j2, int i) {
    }

    void onSkipSilenceEnabledChanged(boolean z) {
    }

    /* renamed from: u */
    void mo47247u(C18223d dVar) {
    }

    /* renamed from: x */
    void mo47248x(Exception exc) {
    }
}
