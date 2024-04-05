package p594jh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.room.C3252r;
import java.util.Iterator;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17921i1;
import p627nh.C18260a;
import p627nh.C18261b;

/* renamed from: jh.j1 */
public final class C17927j1 {

    /* renamed from: a */
    public final Context f39018a;

    /* renamed from: b */
    public final Handler f39019b;

    /* renamed from: c */
    public final C17928a f39020c;

    /* renamed from: d */
    public final AudioManager f39021d;

    /* renamed from: e */
    public C17929b f39022e;

    /* renamed from: f */
    public int f39023f = 3;

    /* renamed from: g */
    public int f39024g;

    /* renamed from: h */
    public boolean f39025h;

    /* renamed from: jh.j1$a */
    public interface C17928a {
    }

    /* renamed from: jh.j1$b */
    public final class C17929b extends BroadcastReceiver {

        /* renamed from: b */
        public static final /* synthetic */ int f39026b = 0;

        public C17929b() {
        }

        public final void onReceive(Context context, Intent intent) {
            C17927j1 j1Var = C17927j1.this;
            j1Var.f39019b.post(new C3252r(j1Var, 2));
        }
    }

    public C17927j1(Context context, Handler handler, C17921i1.C17923b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f39018a = applicationContext;
        this.f39019b = handler;
        this.f39020c = bVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        C14075p.m21696h(audioManager);
        this.f39021d = audioManager;
        this.f39024g = m30237a(audioManager, 3);
        int i = this.f39023f;
        this.f39025h = C14049b0.f30913a >= 23 ? audioManager.isStreamMute(i) : m30237a(audioManager, i) == 0;
        C17929b bVar2 = new C17929b();
        try {
            applicationContext.registerReceiver(bVar2, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f39022e = bVar2;
        } catch (RuntimeException e) {
            C14075p.m21700l("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: a */
    public static int m30237a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            C14075p.m21700l("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: b */
    public final void mo69416b(int i) {
        if (this.f39023f != i) {
            this.f39023f = i;
            mo69417c();
            C17921i1.C17923b bVar = (C17921i1.C17923b) this.f39020c;
            C18260a Q = C17921i1.m30164Q(C17921i1.this.f38968o);
            if (!Q.equals(C17921i1.this.f38954J)) {
                C17921i1 i1Var = C17921i1.this;
                i1Var.f38954J = Q;
                Iterator<C18261b> it = i1Var.f38964k.iterator();
                while (it.hasNext()) {
                    it.next().onDeviceInfoChanged(Q);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo69417c() {
        int a = m30237a(this.f39021d, this.f39023f);
        AudioManager audioManager = this.f39021d;
        int i = this.f39023f;
        boolean isStreamMute = C14049b0.f30913a >= 23 ? audioManager.isStreamMute(i) : m30237a(audioManager, i) == 0;
        if (this.f39024g != a || this.f39025h != isStreamMute) {
            this.f39024g = a;
            this.f39025h = isStreamMute;
            Iterator<C18261b> it = C17921i1.this.f38964k.iterator();
            while (it.hasNext()) {
                it.next().onDeviceVolumeChanged(a, isStreamMute);
            }
        }
    }
}
