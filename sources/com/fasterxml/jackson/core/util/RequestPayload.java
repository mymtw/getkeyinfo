package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

public class RequestPayload implements Serializable {
    private static final long serialVersionUID = 1;
    public String _charset;
    public byte[] _payloadAsBytes;
    public CharSequence _payloadAsText;

    public RequestPayload(byte[] bArr, String str) {
        if (bArr != null) {
            this._payloadAsBytes = bArr;
            this._charset = (str == null || str.isEmpty()) ? "UTF-8" : str;
            return;
        }
        throw new IllegalArgumentException();
    }

    public Object getRawPayload() {
        byte[] bArr = this._payloadAsBytes;
        return bArr != null ? bArr : this._payloadAsText;
    }

    public String toString() {
        byte[] bArr = this._payloadAsBytes;
        if (bArr == null) {
            return this._payloadAsText.toString();
        }
        try {
            return new String(bArr, this._charset);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public RequestPayload(CharSequence charSequence) {
        if (charSequence != null) {
            this._payloadAsText = charSequence;
            return;
        }
        throw new IllegalArgumentException();
    }
}
