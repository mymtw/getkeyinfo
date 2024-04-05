package kotlin.jvm.internal;

import android.support.p013v4.media.C0072d;
import kotlin.reflect.C19399b;
import kotlin.reflect.C19410j;

public abstract class PropertyReference extends CallableReference implements C19410j {
    public PropertyReference() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && C19383o.m32792b(getBoundReceiver(), propertyReference.getBoundReceiver());
        } else if (obj instanceof C19410j) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public abstract /* synthetic */ C19410j.C19411a getGetter();

    public int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        C19399b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder h = C0072d.m201h("property ");
        h.append(getName());
        h.append(" (Kotlin reflection is not available)");
        return h.toString();
    }

    public PropertyReference(Object obj) {
        super(obj);
    }

    public C19410j getReflected() {
        return (C19410j) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }
}
