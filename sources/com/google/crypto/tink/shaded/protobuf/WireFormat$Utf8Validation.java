package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

enum WireFormat$Utf8Validation {
    LOOSE {
        public Object readString(C16497i iVar) throws IOException {
            return iVar.mo58779v();
        }
    },
    STRICT {
        public Object readString(C16497i iVar) throws IOException {
            return iVar.mo58780w();
        }
    },
    LAZY {
        public Object readString(C16497i iVar) throws IOException {
            return iVar.mo58767j();
        }
    };

    public abstract Object readString(C16497i iVar) throws IOException;
}
