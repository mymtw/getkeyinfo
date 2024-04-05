package com.usebutton.merchant;

import com.usebutton.merchant.C17496l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.usebutton.merchant.k */
public final class C17494k {

    /* renamed from: d */
    public static final String f38258d = C17496l.class.getSimpleName();

    /* renamed from: a */
    public ArrayList<C17496l.C17497a> f38259a = new ArrayList<>();

    /* renamed from: b */
    public final Executor f38260b;

    /* renamed from: c */
    public final AtomicBoolean f38261c = new AtomicBoolean();

    /* renamed from: com.usebutton.merchant.k$a */
    public class C17495a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C17496l.C17497a f38262b;

        public C17495a(C17496l.C17497a aVar, String str) {
            this.f38262b = aVar;
        }

        public final void run() {
            this.f38262b.mo68666a();
        }
    }

    public C17494k(Executor executor) {
        this.f38260b = executor;
    }

    /* renamed from: a */
    public final void mo68664a(C17499n nVar, String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.equals(nVar.mo68677b())) {
                Iterator<C17496l.C17497a> it = this.f38259a.iterator();
                while (it.hasNext()) {
                    C17496l.C17497a next = it.next();
                    if (next != null) {
                        this.f38260b.execute(new C17495a(next, str));
                    }
                }
            }
            nVar.mo68676a(str);
        }
    }
}
