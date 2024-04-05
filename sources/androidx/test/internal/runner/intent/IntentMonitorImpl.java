package androidx.test.internal.runner.intent;

import android.content.Intent;
import android.util.Log;
import androidx.test.runner.intent.IntentCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class IntentMonitorImpl {

    /* renamed from: a */
    public List<WeakReference<IntentCallback>> f7682a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    public final void mo12357a(Intent intent) {
        Iterator<WeakReference<IntentCallback>> it = this.f7682a.iterator();
        while (it.hasNext()) {
            IntentCallback intentCallback = (IntentCallback) it.next().get();
            if (intentCallback == null) {
                it.remove();
            } else {
                try {
                    new Intent(intent);
                    intentCallback.mo12412a();
                } catch (RuntimeException e) {
                    Log.e("IntentMonitorImpl", String.format("Callback threw exception! (callback: %s intent: %s)", new Object[]{intentCallback, intent}), e);
                }
            }
        }
    }
}
