package org.apache.commons.lang3.builder;

final class IDKey {

    /* renamed from: id */
    private final int f44395id;
    private final Object value;

    public IDKey(Object obj) {
        this.f44395id = System.identityHashCode(obj);
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IDKey)) {
            return false;
        }
        IDKey iDKey = (IDKey) obj;
        return this.f44395id == iDKey.f44395id && this.value == iDKey.value;
    }

    public int hashCode() {
        return this.f44395id;
    }
}
