package com.usebutton.merchant;

/* renamed from: com.usebutton.merchant.f0 */
public abstract class C17484f0<T> implements Runnable {

    /* renamed from: b */
    public final C17485a<T> f38244b;

    /* renamed from: com.usebutton.merchant.f0$a */
    public interface C17485a<T> {
        /* renamed from: a */
        void mo68657a(Exception exc);

        /* renamed from: b */
        void mo68658b(T t);
    }

    public C17484f0(C17485a<T> aVar) {
        this.f38244b = aVar;
    }

    /* renamed from: a */
    public abstract T mo68646a() throws Exception;

    public final void run() {
        try {
            Object a = mo68646a();
            C17485a<T> aVar = this.f38244b;
            if (aVar != null) {
                aVar.mo68658b(a);
            }
        } catch (Exception e) {
            C17485a<T> aVar2 = this.f38244b;
            if (aVar2 != null) {
                aVar2.mo68657a(e);
            }
        }
    }
}
