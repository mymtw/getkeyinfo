package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C3185q;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.r */
public final class C3195r implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C3185q.C3193f f7428b;

    /* renamed from: c */
    public final /* synthetic */ C3185q f7429c;

    public C3195r(C3185q qVar, C3185q.C3193f fVar, int i) {
        this.f7429c = qVar;
        this.f7428b = fVar;
    }

    public final void run() {
        RecyclerView recyclerView = this.f7429c.f7395r;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            C3185q.C3193f fVar = this.f7428b;
            if (!fVar.f7423k && fVar.f7417e.getAbsoluteAdapterPosition() != -1) {
                RecyclerView.C3094l itemAnimator = this.f7429c.f7395r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.mo11635l()) {
                    C3185q qVar = this.f7429c;
                    int size = qVar.f7393p.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (!((C3185q.C3193f) qVar.f7393p.get(i)).f7424l) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        this.f7429c.f7390m.mo11934f(this.f7428b.f7417e);
                        return;
                    }
                }
                this.f7429c.f7395r.post(this);
            }
        }
    }
}
