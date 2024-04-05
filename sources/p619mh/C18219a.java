package p619mh;

/* renamed from: mh.a */
public abstract class C18219a {

    /* renamed from: b */
    public int f39937b;

    /* renamed from: g */
    public final void mo69760g(int i) {
        this.f39937b = i | this.f39937b;
    }

    /* renamed from: h */
    public final boolean mo69761h(int i) {
        return (this.f39937b & i) == i;
    }

    /* renamed from: i */
    public final boolean mo69762i() {
        return mo69761h(Integer.MIN_VALUE);
    }
}
