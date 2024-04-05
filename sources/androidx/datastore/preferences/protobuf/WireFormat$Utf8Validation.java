package androidx.datastore.preferences.protobuf;

import java.io.IOException;

enum WireFormat$Utf8Validation {
    LOOSE {
        public Object readString(C2592i iVar) throws IOException {
            return iVar.mo9718v();
        }
    },
    STRICT {
        public Object readString(C2592i iVar) throws IOException {
            return iVar.mo9719w();
        }
    },
    LAZY {
        public Object readString(C2592i iVar) throws IOException {
            return iVar.mo9706j();
        }
    };

    public abstract Object readString(C2592i iVar) throws IOException;
}
