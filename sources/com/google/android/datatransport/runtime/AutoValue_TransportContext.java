package com.google.android.datatransport.runtime;

import androidx.appcompat.widget.C0326j;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.C6556p;
import java.util.Arrays;

final class AutoValue_TransportContext extends C6556p {
    private final String backendName;
    private final byte[] extras;
    private final Priority priority;

    public static final class Builder extends C6556p.C6557a {
        private String backendName;
        private byte[] extras;
        private Priority priority;

        public C6556p build() {
            String str = this.backendName == null ? " backendName" : "";
            if (this.priority == null) {
                str = C0326j.m864i(str, " priority");
            }
            if (str.isEmpty()) {
                return new AutoValue_TransportContext(this.backendName, this.extras, this.priority);
            }
            throw new IllegalStateException(C0326j.m864i("Missing required properties:", str));
        }

        public C6556p.C6557a setBackendName(String str) {
            if (str != null) {
                this.backendName = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public C6556p.C6557a setExtras(byte[] bArr) {
            this.extras = bArr;
            return this;
        }

        public C6556p.C6557a setPriority(Priority priority2) {
            if (priority2 != null) {
                this.priority = priority2;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6556p)) {
            return false;
        }
        C6556p pVar = (C6556p) obj;
        if (this.backendName.equals(pVar.getBackendName())) {
            if (Arrays.equals(this.extras, pVar instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) pVar).extras : pVar.getExtras()) && this.priority.equals(pVar.getPriority())) {
                return true;
            }
        }
        return false;
    }

    public String getBackendName() {
        return this.backendName;
    }

    public byte[] getExtras() {
        return this.extras;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return ((((this.backendName.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.extras)) * 1000003) ^ this.priority.hashCode();
    }

    private AutoValue_TransportContext(String str, byte[] bArr, Priority priority2) {
        this.backendName = str;
        this.extras = bArr;
        this.priority = priority2;
    }
}
