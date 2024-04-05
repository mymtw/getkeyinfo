package com.google.android.datatransport.runtime;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.C6494b;
import com.google.android.datatransport.C6495c;
import com.google.android.datatransport.runtime.C6554o;

final class AutoValue_SendRequest extends C6554o {
    private final C6493a encoding;
    private final C6494b<?> event;
    private final C6495c<?, byte[]> transformer;
    private final C6556p transportContext;
    private final String transportName;

    public static final class Builder extends C6554o.C6555a {
        private C6493a encoding;
        private C6494b<?> event;
        private C6495c<?, byte[]> transformer;
        private C6556p transportContext;
        private String transportName;

        public C6554o build() {
            String str = this.transportContext == null ? " transportContext" : "";
            if (this.transportName == null) {
                str = C0326j.m864i(str, " transportName");
            }
            if (this.event == null) {
                str = C0326j.m864i(str, " event");
            }
            if (this.transformer == null) {
                str = C0326j.m864i(str, " transformer");
            }
            if (this.encoding == null) {
                str = C0326j.m864i(str, " encoding");
            }
            if (str.isEmpty()) {
                return new AutoValue_SendRequest(this.transportContext, this.transportName, this.event, this.transformer, this.encoding);
            }
            throw new IllegalStateException(C0326j.m864i("Missing required properties:", str));
        }

        public C6554o.C6555a setEncoding(C6493a aVar) {
            if (aVar != null) {
                this.encoding = aVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        public C6554o.C6555a setEvent(C6494b<?> bVar) {
            if (bVar != null) {
                this.event = bVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        public C6554o.C6555a setTransformer(C6495c<?, byte[]> cVar) {
            if (cVar != null) {
                this.transformer = cVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public C6554o.C6555a setTransportContext(C6556p pVar) {
            if (pVar != null) {
                this.transportContext = pVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public C6554o.C6555a setTransportName(String str) {
            if (str != null) {
                this.transportName = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6554o)) {
            return false;
        }
        C6554o oVar = (C6554o) obj;
        return this.transportContext.equals(oVar.getTransportContext()) && this.transportName.equals(oVar.getTransportName()) && this.event.equals(oVar.getEvent()) && this.transformer.equals(oVar.getTransformer()) && this.encoding.equals(oVar.getEncoding());
    }

    public C6493a getEncoding() {
        return this.encoding;
    }

    public C6494b<?> getEvent() {
        return this.event;
    }

    public C6495c<?, byte[]> getTransformer() {
        return this.transformer;
    }

    public C6556p getTransportContext() {
        return this.transportContext;
    }

    public String getTransportName() {
        return this.transportName;
    }

    public int hashCode() {
        return ((((((((this.transportContext.hashCode() ^ 1000003) * 1000003) ^ this.transportName.hashCode()) * 1000003) ^ this.event.hashCode()) * 1000003) ^ this.transformer.hashCode()) * 1000003) ^ this.encoding.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SendRequest{transportContext=");
        h.append(this.transportContext);
        h.append(", transportName=");
        h.append(this.transportName);
        h.append(", event=");
        h.append(this.event);
        h.append(", transformer=");
        h.append(this.transformer);
        h.append(", encoding=");
        h.append(this.encoding);
        h.append("}");
        return h.toString();
    }

    private AutoValue_SendRequest(C6556p pVar, String str, C6494b<?> bVar, C6495c<?, byte[]> cVar, C6493a aVar) {
        this.transportContext = pVar;
        this.transportName = str;
        this.event = bVar;
        this.transformer = cVar;
        this.encoding = aVar;
    }
}
