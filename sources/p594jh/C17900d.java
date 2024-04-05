package p594jh;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p513bj.C14049b0;
import p594jh.C17921i1;
import p611lh.C18167d;

/* renamed from: jh.d */
public final class C17900d {

    /* renamed from: a */
    public final AudioManager f38877a;

    /* renamed from: b */
    public final C17901a f38878b;

    /* renamed from: c */
    public C17902b f38879c;

    /* renamed from: d */
    public C18167d f38880d;

    /* renamed from: e */
    public int f38881e;

    /* renamed from: f */
    public int f38882f;

    /* renamed from: g */
    public float f38883g = 1.0f;

    /* renamed from: h */
    public AudioFocusRequest f38884h;

    /* renamed from: jh.d$a */
    public class C17901a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        public final Handler f38885a;

        public C17901a(Handler handler) {
            this.f38885a = handler;
        }

        public final void onAudioFocusChange(int i) {
            this.f38885a.post(new C17897c(this, i));
        }
    }

    /* renamed from: jh.d$b */
    public interface C17902b {
    }

    public C17900d(Context context, Handler handler, C17921i1.C17923b bVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f38877a = audioManager;
        this.f38879c = bVar;
        this.f38878b = new C17901a(handler);
        this.f38881e = 0;
    }

    /* renamed from: a */
    public final void mo69364a() {
        if (this.f38881e != 0) {
            if (C14049b0.f30913a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f38884h;
                if (audioFocusRequest != null) {
                    this.f38877a.abandonAudioFocusRequest(audioFocusRequest);
                }
            } else {
                this.f38877a.abandonAudioFocus(this.f38878b);
            }
            mo69367d(0);
        }
    }

    /* renamed from: b */
    public final void mo69365b(int i) {
        C17902b bVar = this.f38879c;
        if (bVar != null) {
            C17921i1.C17923b bVar2 = (C17921i1.C17923b) bVar;
            boolean x = C17921i1.this.mo69348x();
            C17921i1 i1Var = C17921i1.this;
            int i2 = 1;
            if (x && i != 1) {
                i2 = 2;
            }
            i1Var.mo69405X(i, i2, x);
        }
    }

    /* renamed from: c */
    public final void mo69366c() {
        if (!C14049b0.m21628a(this.f38880d, (Object) null)) {
            this.f38880d = null;
            this.f38882f = 0;
        }
    }

    /* renamed from: d */
    public final void mo69367d(int i) {
        if (this.f38881e != i) {
            this.f38881e = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f38883g != f) {
                this.f38883g = f;
                C17902b bVar = this.f38879c;
                if (bVar != null) {
                    C17921i1 i1Var = C17921i1.this;
                    i1Var.mo69401T(1, 2, Float.valueOf(i1Var.f38949E * i1Var.f38967n.f38883g));
                }
            }
        }
    }

    /* renamed from: e */
    public final int mo69368e(int i, boolean z) {
        int i2;
        int i3 = 1;
        if (i == 1 || this.f38882f != 1) {
            mo69364a();
            return z ? 1 : -1;
        } else if (!z) {
            return -1;
        } else {
            if (this.f38881e != 1) {
                if (C14049b0.f30913a >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f38884h;
                    if (audioFocusRequest == null) {
                        AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f38882f) : new AudioFocusRequest.Builder(this.f38884h);
                        C18167d dVar = this.f38880d;
                        boolean z2 = dVar != null && dVar.f39739a == 1;
                        dVar.getClass();
                        this.f38884h = builder.setAudioAttributes(dVar.mo69707a()).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(this.f38878b).build();
                    }
                    i2 = this.f38877a.requestAudioFocus(this.f38884h);
                } else {
                    AudioManager audioManager = this.f38877a;
                    C17901a aVar = this.f38878b;
                    C18167d dVar2 = this.f38880d;
                    dVar2.getClass();
                    i2 = audioManager.requestAudioFocus(aVar, C14049b0.m21649v(dVar2.f39741c), this.f38882f);
                }
                if (i2 == 1) {
                    mo69367d(1);
                } else {
                    mo69367d(0);
                    i3 = -1;
                }
            }
            return i3;
        }
    }
}
