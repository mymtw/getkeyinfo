package com.google.protobuf;

import java.io.IOException;

enum WireFormat$Utf8Validation {
    LOOSE {
        public Object readString(C16900i iVar) throws IOException {
            return iVar.mo59935e();
        }
    },
    STRICT {
        public Object readString(C16900i iVar) throws IOException {
            return iVar.mo59936f();
        }
    },
    LAZY {
        public Object readString(C16900i iVar) throws IOException {
            return iVar.mo59934d();
        }
    };

    public abstract Object readString(C16900i iVar) throws IOException;
}
