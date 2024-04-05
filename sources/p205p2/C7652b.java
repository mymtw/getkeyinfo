package p205p2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: p2.b */
public final class C7652b extends ObjectInputStream {
    public C7652b(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
    }

    public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        Class<?> cls = Class.forName(objectStreamClass.getName(), false, C7652b.class.getClassLoader());
        return cls != null ? cls : super.resolveClass(objectStreamClass);
    }
}
