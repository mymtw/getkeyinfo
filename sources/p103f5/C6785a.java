package p103f5;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import kotlin.jvm.internal.C19382n;

/* renamed from: f5.a */
public final class C6785a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f14928b = 5;

    /* renamed from: c */
    public final /* synthetic */ C6787b f14929c;

    /* renamed from: f5.a$a */
    public class C6786a extends CountDownTimer {
        public C6786a(long j, long j2) {
            super(j, j2);
        }

        public final void onFinish() {
            CountDownTimer countDownTimer = C6787b.f14932j;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            C6787b bVar = C6785a.this.f14929c;
            bVar.getClass();
            if (C19382n.f43256f != null) {
                Intent intent = new Intent("finish_activity");
                C19382n.f43257g = true;
                C19382n.f43256f.sendBroadcast(intent);
            }
            bVar.mo18925c(CardinalActionCode.TIMEOUT, new C6789d(0), (Context) null);
        }

        public final void onTick(long j) {
        }
    }

    public C6785a(C6787b bVar) {
        this.f14929c = bVar;
    }

    public final void run() {
        long j = (long) (this.f14928b * 60000);
        C6786a aVar = new C6786a(j, j);
        C6787b.f14932j = aVar;
        aVar.start();
    }
}
