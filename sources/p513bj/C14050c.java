package p513bj;

/* renamed from: bj.c */
public final class C14050c {

    /* renamed from: a */
    public boolean f30926a;

    /* renamed from: a */
    public final synchronized boolean mo46870a() {
        if (this.f30926a) {
            return false;
        }
        this.f30926a = true;
        notifyAll();
        return true;
    }
}
