package p223r5;

/* renamed from: r5.x */
public class C7777x extends C7770q {

    /* renamed from: b */
    public C7778y f17206b;

    public C7777x(boolean z, C7778y yVar) {
        super(z);
        this.f17206b = yVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7777x)) {
            return false;
        }
        C7777x xVar = (C7777x) obj;
        C7778y yVar = this.f17206b;
        return yVar == null ? xVar.f17206b == null : yVar.equals(xVar.f17206b);
    }

    public int hashCode() {
        boolean z = !this.f17201a;
        C7778y yVar = this.f17206b;
        return yVar != null ? z ^ yVar.hashCode() ? 1 : 0 : z ? 1 : 0;
    }
}
