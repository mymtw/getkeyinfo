package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C15712x;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.play.core.assetpacks.e0 */
public final class C15595e0 extends C15712x {

    /* renamed from: b */
    public final TreeMap f35120b = new TreeMap();

    public C15595e0(File file, File file2) throws IOException {
        ArrayList a = C15625l2.m25435a(file, file2);
        if (!a.isEmpty()) {
            Iterator it = a.iterator();
            long j = 0;
            while (it.hasNext()) {
                File file3 = (File) it.next();
                this.f35120b.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new zzck(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    /* renamed from: a */
    public final long mo55394a() {
        Map.Entry lastEntry = this.f35120b.lastEntry();
        return ((File) lastEntry.getValue()).length() + ((Long) lastEntry.getKey()).longValue();
    }

    /* renamed from: b */
    public final InputStream mo55395b(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new zzck(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo55394a()) {
            Long l = (Long) this.f35120b.floorKey(Long.valueOf(j));
            Long l2 = (Long) this.f35120b.floorKey(Long.valueOf(j3));
            if (l.equals(l2)) {
                return new C15591d0(mo55397d(l, j), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(mo55397d(l, j));
            Collection values = this.f35120b.subMap(l, false, l2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C15644q1(Collections.enumeration(values)));
            }
            arrayList.add(new C15591d0(new FileInputStream((File) this.f35120b.get(l2)), j2 - (l2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new zzck(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo55394a()), Long.valueOf(j3)}));
    }

    public final void close() {
    }

    /* renamed from: d */
    public final FileInputStream mo55397d(Long l, long j) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f35120b.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new zzck(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }
}
