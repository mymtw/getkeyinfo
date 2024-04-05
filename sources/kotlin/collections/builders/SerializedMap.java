package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;
import p003a2.C0015b;

final class SerializedMap implements Externalizable {
    public static final C19303a Companion = new C19303a();
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    /* renamed from: kotlin.collections.builders.SerializedMap$a */
    public static final class C19303a {
    }

    public SerializedMap(Map<?, ?> map2) {
        C19383o.m32797g(map2, "map");
        this.map = map2;
    }

    private final Object readResolve() {
        return this.map;
    }

    public void readExternal(ObjectInput objectInput) {
        C19383o.m32797g(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                MapBuilder mapBuilder = new MapBuilder(readInt);
                for (int i = 0; i < readInt; i++) {
                    mapBuilder.put(objectInput.readObject(), objectInput.readObject());
                }
                this.map = mapBuilder.build();
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
        throw new InvalidObjectException(C0015b.m88g("Unsupported flags value: ", readByte));
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C19383o.m32797g(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        for (Map.Entry next : this.map.entrySet()) {
            objectOutput.writeObject(next.getKey());
            objectOutput.writeObject(next.getValue());
        }
    }

    public SerializedMap() {
        this(C19294b0.m32559p0());
    }
}
