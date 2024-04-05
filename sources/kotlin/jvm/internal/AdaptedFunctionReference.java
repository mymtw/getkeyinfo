package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.reflect.C19401d;
import p003a2.C0023f;

public class AdaptedFunctionReference implements C19381m, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private final String signature;

    public AdaptedFunctionReference(int i, Class cls, String str, String str2, int i2) {
        this(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.isTopLevel == adaptedFunctionReference.isTopLevel && this.arity == adaptedFunctionReference.arity && this.flags == adaptedFunctionReference.flags && C19383o.m32792b(this.receiver, adaptedFunctionReference.receiver) && C19383o.m32792b(this.owner, adaptedFunctionReference.owner) && this.name.equals(adaptedFunctionReference.name) && this.signature.equals(adaptedFunctionReference.signature);
    }

    public int getArity() {
        return this.arity;
    }

    public C19401d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return C19386q.m32807a(cls);
        }
        C19386q.f43269a.getClass();
        return new C19385p(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        if (cls != null) {
            i = cls.hashCode();
        }
        return ((((C0023f.m105e(this.signature, C0023f.m105e(this.name, (hashCode + i) * 31, 31), 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        C19386q.f43269a.getClass();
        return C19387r.m32808a(this);
    }

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
