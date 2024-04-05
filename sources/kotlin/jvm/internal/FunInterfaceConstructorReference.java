package kotlin.jvm.internal;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import kotlin.reflect.C19402e;

public class FunInterfaceConstructorReference extends FunctionReference {
    private final Class funInterface;

    public FunInterfaceConstructorReference(Class cls) {
        super(1);
        this.funInterface = cls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunInterfaceConstructorReference)) {
            return false;
        }
        return this.funInterface.equals(((FunInterfaceConstructorReference) obj).funInterface);
    }

    public int hashCode() {
        return this.funInterface.hashCode();
    }

    public String toString() {
        return C0326j.m862g(this.funInterface, C0072d.m201h("fun interface "));
    }

    public C19402e getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
