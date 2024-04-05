package androidx.activity;

import android.annotation.SuppressLint;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f137a;

    /* renamed from: b */
    public final ArrayDeque<C0112f> f138b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements C2885q, C0101a {

        /* renamed from: b */
        public final Lifecycle f139b;

        /* renamed from: c */
        public final C0112f f140c;

        /* renamed from: d */
        public C0096a f141d;

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, C0112f fVar) {
            this.f139b = lifecycle;
            this.f140c = fVar;
            lifecycle.mo10733a(this);
        }

        public final void cancel() {
            this.f139b.mo10735c(this);
            this.f140c.f164b.remove(this);
            C0096a aVar = this.f141d;
            if (aVar != null) {
                aVar.cancel();
                this.f141d = null;
            }
        }

        public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                C0112f fVar = this.f140c;
                onBackPressedDispatcher.f138b.add(fVar);
                C0096a aVar = new C0096a(fVar);
                fVar.f164b.add(aVar);
                this.f141d = aVar;
            } else if (event == Lifecycle.Event.ON_STOP) {
                C0096a aVar2 = this.f141d;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0096a implements C0101a {

        /* renamed from: b */
        public final C0112f f143b;

        public C0096a(C0112f fVar) {
            this.f143b = fVar;
        }

        public final void cancel() {
            OnBackPressedDispatcher.this.f138b.remove(this.f143b);
            this.f143b.f164b.remove(this);
        }
    }

    public OnBackPressedDispatcher(ComponentActivity.C0093a aVar) {
        this.f137a = aVar;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public final void mo1104a(C2887s sVar, C0112f fVar) {
        Lifecycle lifecycle = sVar.getLifecycle();
        if (lifecycle.mo10734b() != Lifecycle.State.DESTROYED) {
            fVar.f164b.add(new LifecycleOnBackPressedCancellable(lifecycle, fVar));
        }
    }

    /* renamed from: b */
    public final void mo1105b() {
        Iterator<C0112f> descendingIterator = this.f138b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0112f next = descendingIterator.next();
            if (next.f163a) {
                next.mo1121a();
                return;
            }
        }
        Runnable runnable = this.f137a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
