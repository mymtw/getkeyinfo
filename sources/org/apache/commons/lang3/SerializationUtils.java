package org.apache.commons.lang3;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class SerializationUtils {

    public static class ClassLoaderAwareObjectInputStream extends ObjectInputStream {
        private ClassLoader classLoader;

        public ClassLoaderAwareObjectInputStream(InputStream inputStream, ClassLoader classLoader2) throws IOException {
            super(inputStream);
            this.classLoader = classLoader2;
        }

        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            String name = objectStreamClass.getName();
            try {
                return Class.forName(name, false, this.classLoader);
            } catch (ClassNotFoundException unused) {
                return Class.forName(name, false, Thread.currentThread().getContextClassLoader());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c A[SYNTHETIC, Splitter:B:29:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.io.Serializable> T clone(T r4) {
        /*
            java.lang.String r0 = "IOException on closing cloned object data InputStream."
            r1 = 0
            if (r4 != 0) goto L_0x0006
            return r1
        L_0x0006:
            byte[] r2 = serialize(r4)
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r2)
            org.apache.commons.lang3.SerializationUtils$ClassLoaderAwareObjectInputStream r2 = new org.apache.commons.lang3.SerializationUtils$ClassLoaderAwareObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0041, IOException -> 0x0038 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ ClassNotFoundException -> 0x0041, IOException -> 0x0038 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0041, IOException -> 0x0038 }
            r2.<init>(r3, r4)     // Catch:{ ClassNotFoundException -> 0x0041, IOException -> 0x0038 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ ClassNotFoundException -> 0x0033, IOException -> 0x0030, all -> 0x002d }
            java.io.Serializable r4 = (java.io.Serializable) r4     // Catch:{ ClassNotFoundException -> 0x0033, IOException -> 0x0030, all -> 0x002d }
            r2.close()     // Catch:{ IOException -> 0x0026 }
            return r4
        L_0x0026:
            r4 = move-exception
            org.apache.commons.lang3.SerializationException r1 = new org.apache.commons.lang3.SerializationException
            r1.<init>(r0, r4)
            throw r1
        L_0x002d:
            r4 = move-exception
            r1 = r2
            goto L_0x004a
        L_0x0030:
            r4 = move-exception
            r1 = r2
            goto L_0x0039
        L_0x0033:
            r4 = move-exception
            r1 = r2
            goto L_0x0042
        L_0x0036:
            r4 = move-exception
            goto L_0x004a
        L_0x0038:
            r4 = move-exception
        L_0x0039:
            org.apache.commons.lang3.SerializationException r2 = new org.apache.commons.lang3.SerializationException     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "IOException while reading cloned object data"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0036 }
            throw r2     // Catch:{ all -> 0x0036 }
        L_0x0041:
            r4 = move-exception
        L_0x0042:
            org.apache.commons.lang3.SerializationException r2 = new org.apache.commons.lang3.SerializationException     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "ClassNotFoundException while reading cloned object data"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0036 }
            throw r2     // Catch:{ all -> 0x0036 }
        L_0x004a:
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            r4 = move-exception
            org.apache.commons.lang3.SerializationException r1 = new org.apache.commons.lang3.SerializationException
            r1.<init>(r0, r4)
            throw r1
        L_0x0057:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.SerializationUtils.clone(java.io.Serializable):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x002b A[SYNTHETIC, Splitter:B:25:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object deserialize(java.io.InputStream r2) {
        /*
            if (r2 == 0) goto L_0x002f
            r0 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0022, IOException -> 0x001b }
            r1.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0022, IOException -> 0x001b }
            java.lang.Object r2 = r1.readObject()     // Catch:{ ClassNotFoundException -> 0x0016, IOException -> 0x0013, all -> 0x0010 }
            r1.close()     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            return r2
        L_0x0010:
            r2 = move-exception
            r0 = r1
            goto L_0x0029
        L_0x0013:
            r2 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x0016:
            r2 = move-exception
            r0 = r1
            goto L_0x0023
        L_0x0019:
            r2 = move-exception
            goto L_0x0029
        L_0x001b:
            r2 = move-exception
        L_0x001c:
            org.apache.commons.lang3.SerializationException r1 = new org.apache.commons.lang3.SerializationException     // Catch:{ all -> 0x0019 }
            r1.<init>((java.lang.Throwable) r2)     // Catch:{ all -> 0x0019 }
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0022:
            r2 = move-exception
        L_0x0023:
            org.apache.commons.lang3.SerializationException r1 = new org.apache.commons.lang3.SerializationException     // Catch:{ all -> 0x0019 }
            r1.<init>((java.lang.Throwable) r2)     // Catch:{ all -> 0x0019 }
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            throw r2
        L_0x002f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The InputStream must not be null"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.SerializationUtils.deserialize(java.io.InputStream):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0020 A[SYNTHETIC, Splitter:B:19:0x0020] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void serialize(java.io.Serializable r2, java.io.OutputStream r3) {
        /*
            if (r3 == 0) goto L_0x0024
            r0 = 0
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0017 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0017 }
            r1.writeObject(r2)     // Catch:{ IOException -> 0x0012, all -> 0x000f }
            r1.close()     // Catch:{ IOException -> 0x000e }
        L_0x000e:
            return
        L_0x000f:
            r2 = move-exception
            r0 = r1
            goto L_0x001e
        L_0x0012:
            r2 = move-exception
            r0 = r1
            goto L_0x0018
        L_0x0015:
            r2 = move-exception
            goto L_0x001e
        L_0x0017:
            r2 = move-exception
        L_0x0018:
            org.apache.commons.lang3.SerializationException r3 = new org.apache.commons.lang3.SerializationException     // Catch:{ all -> 0x0015 }
            r3.<init>((java.lang.Throwable) r2)     // Catch:{ all -> 0x0015 }
            throw r3     // Catch:{ all -> 0x0015 }
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            throw r2
        L_0x0024:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The OutputStream must not be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.SerializationUtils.serialize(java.io.Serializable, java.io.OutputStream):void");
    }

    public static byte[] serialize(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
        serialize(serializable, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Object deserialize(byte[] bArr) {
        if (bArr != null) {
            return deserialize((InputStream) new ByteArrayInputStream(bArr));
        }
        throw new IllegalArgumentException("The byte[] must not be null");
    }
}
