package com.fasterxml.jackson.databind.node;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

class NodeSerialization implements Serializable, Externalizable {
    private static final long serialVersionUID = 1;
    public byte[] json;

    public NodeSerialization() {
    }

    public static NodeSerialization from(Object obj) {
        try {
            return new NodeSerialization(C12565a.f27725a.writeValueAsBytes(obj));
        } catch (IOException e) {
            StringBuilder h = C0072d.m201h("Failed to JDK serialize `");
            h.append(obj.getClass().getSimpleName());
            h.append("` value: ");
            h.append(e.getMessage());
            throw new IllegalArgumentException(h.toString(), e);
        }
    }

    public void readExternal(ObjectInput objectInput) throws IOException {
        int readInt = objectInput.readInt();
        byte[] bArr = new byte[readInt];
        this.json = bArr;
        objectInput.readFully(bArr, 0, readInt);
    }

    public Object readResolve() {
        try {
            return (JsonNode) C12565a.f27728d.readValue(this.json);
        } catch (IOException e) {
            StringBuilder h = C0072d.m201h("Failed to JDK deserialize `JsonNode` value: ");
            h.append(e.getMessage());
            throw new IllegalArgumentException(h.toString(), e);
        }
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }

    public NodeSerialization(byte[] bArr) {
        this.json = bArr;
    }
}
