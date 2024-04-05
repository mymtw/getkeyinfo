package kotlin.jvm.internal;

import android.support.p013v4.media.C0072d;
import kotlin.reflect.C19399b;
import kotlin.reflect.C19402e;

public class FunctionReference extends CallableReference implements C19381m, C19402e {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    public C19399b computeReflected() {
        C19386q.f43269a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && C19383o.m32792b(getBoundReceiver(), functionReference.getBoundReceiver()) && C19383o.m32792b(getOwner(), functionReference.getOwner());
        } else if (obj instanceof C19402e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C19399b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder h = C0072d.m201h("function ");
        h.append(getName());
        h.append(" (Kotlin reflection is not available)");
        return h.toString();
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    public C19402e getReflected() {
        return (C19402e) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
