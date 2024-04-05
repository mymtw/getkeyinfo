package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;

public final class SerializedCollection implements Externalizable {
    public static final C19302a Companion = new C19302a();
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    private Collection<?> collection;
    private final int tag;

    /* renamed from: kotlin.collections.builders.SerializedCollection$a */
    public static final class C19302a {
    }

    public SerializedCollection() {
        this(EmptyList.INSTANCE, 0);
    }

    private final Object readResolve() {
        return this.collection;
    }

    public void readExternal(ObjectInput objectInput) {
        Collection<?> collection2;
        C19383o.m32797g(objectInput, "input");
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    ListBuilder listBuilder = new ListBuilder(readInt);
                    while (i < readInt) {
                        listBuilder.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = listBuilder.build();
                } else if (b == 1) {
                    SetBuilder setBuilder = new SetBuilder(readInt);
                    while (i < readInt) {
                        setBuilder.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = setBuilder.build();
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b + ClassUtils.PACKAGE_SEPARATOR_CHAR);
                }
                this.collection = collection2;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + ClassUtils.PACKAGE_SEPARATOR_CHAR);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C19383o.m32797g(objectOutput, "output");
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        for (Object writeObject : this.collection) {
            objectOutput.writeObject(writeObject);
        }
    }

    public SerializedCollection(Collection<?> collection2, int i) {
        C19383o.m32797g(collection2, com.etsy.android.lib.models.apiv3.Collection.TYPE_COLLECTION);
        this.collection = collection2;
        this.tag = i;
    }
}
