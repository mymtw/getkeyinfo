package p003a2;

import android.database.Cursor;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.push.CartRefreshDelegate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p124h2.C6920a;

/* renamed from: a2.e */
public final class C0018e {

    /* renamed from: a */
    public final String f30a;

    /* renamed from: b */
    public final Map<String, C0019a> f31b;

    /* renamed from: c */
    public final Set<C0020b> f32c;

    /* renamed from: d */
    public final Set<C0022d> f33d;

    /* renamed from: a2.e$a */
    public static final class C0019a {

        /* renamed from: a */
        public final String f34a;

        /* renamed from: b */
        public final String f35b;

        /* renamed from: c */
        public final int f36c;

        /* renamed from: d */
        public final boolean f37d;

        /* renamed from: e */
        public final int f38e;

        /* renamed from: f */
        public final String f39f;

        /* renamed from: g */
        public final int f40g;

        public C0019a(int i, String str, String str2, String str3, boolean z, int i2) {
            this.f34a = str;
            this.f35b = str2;
            this.f37d = z;
            this.f38e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f36c = i3;
            this.f39f = str3;
            this.f40g = i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0057 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m102a(java.lang.String r6, java.lang.String r7) {
            /*
                r0 = 0
                if (r7 != 0) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r6.equals(r7)
                r2 = 1
                if (r1 == 0) goto L_0x000c
                return r2
            L_0x000c:
                int r1 = r6.length()
                if (r1 != 0) goto L_0x0013
                goto L_0x0042
            L_0x0013:
                r1 = r0
                r3 = r1
            L_0x0015:
                int r4 = r6.length()
                if (r1 >= r4) goto L_0x003e
                char r4 = r6.charAt(r1)
                r5 = 40
                if (r1 != 0) goto L_0x0026
                if (r4 == r5) goto L_0x0026
                goto L_0x0042
            L_0x0026:
                if (r4 != r5) goto L_0x002b
                int r3 = r3 + 1
                goto L_0x003b
            L_0x002b:
                r5 = 41
                if (r4 != r5) goto L_0x003b
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x003b
                int r4 = r6.length()
                int r4 = r4 - r2
                if (r1 == r4) goto L_0x003b
                goto L_0x0042
            L_0x003b:
                int r1 = r1 + 1
                goto L_0x0015
            L_0x003e:
                if (r3 != 0) goto L_0x0042
                r1 = r2
                goto L_0x0043
            L_0x0042:
                r1 = r0
            L_0x0043:
                if (r1 == 0) goto L_0x0057
                int r0 = r6.length()
                int r0 = r0 - r2
                java.lang.String r6 = r6.substring(r2, r0)
                java.lang.String r6 = r6.trim()
                boolean r6 = r6.equals(r7)
                return r6
            L_0x0057:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p003a2.C0018e.C0019a.m102a(java.lang.String, java.lang.String):boolean");
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0019a)) {
                return false;
            }
            C0019a aVar = (C0019a) obj;
            if (this.f38e != aVar.f38e || !this.f34a.equals(aVar.f34a) || this.f37d != aVar.f37d) {
                return false;
            }
            if (this.f40g == 1 && aVar.f40g == 2 && (str3 = this.f39f) != null && !m102a(str3, aVar.f39f)) {
                return false;
            }
            if (this.f40g == 2 && aVar.f40g == 1 && (str2 = aVar.f39f) != null && !m102a(str2, this.f39f)) {
                return false;
            }
            int i = this.f40g;
            if (i == 0 || i != aVar.f40g || ((str = this.f39f) == null ? aVar.f39f == null : m102a(str, aVar.f39f))) {
                return this.f36c == aVar.f36c;
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.f34a.hashCode() * 31) + this.f36c) * 31) + (this.f37d ? 1231 : 1237)) * 31) + this.f38e;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Column{name='");
            h.append(this.f34a);
            h.append('\'');
            h.append(", type='");
            h.append(this.f35b);
            h.append('\'');
            h.append(", affinity='");
            h.append(this.f36c);
            h.append('\'');
            h.append(", notNull=");
            h.append(this.f37d);
            h.append(", primaryKeyPosition=");
            h.append(this.f38e);
            h.append(", defaultValue='");
            h.append(this.f39f);
            h.append('\'');
            h.append('}');
            return h.toString();
        }
    }

    /* renamed from: a2.e$b */
    public static final class C0020b {

        /* renamed from: a */
        public final String f41a;

        /* renamed from: b */
        public final String f42b;

        /* renamed from: c */
        public final String f43c;

        /* renamed from: d */
        public final List<String> f44d;

        /* renamed from: e */
        public final List<String> f45e;

        public C0020b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f41a = str;
            this.f42b = str2;
            this.f43c = str3;
            this.f44d = Collections.unmodifiableList(list);
            this.f45e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0020b)) {
                return false;
            }
            C0020b bVar = (C0020b) obj;
            if (this.f41a.equals(bVar.f41a) && this.f42b.equals(bVar.f42b) && this.f43c.equals(bVar.f43c) && this.f44d.equals(bVar.f44d)) {
                return this.f45e.equals(bVar.f45e);
            }
            return false;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f43c, C0023f.m105e(this.f42b, this.f41a.hashCode() * 31, 31), 31);
            return this.f45e.hashCode() + ((this.f44d.hashCode() + e) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ForeignKey{referenceTable='");
            h.append(this.f41a);
            h.append('\'');
            h.append(", onDelete='");
            h.append(this.f42b);
            h.append('\'');
            h.append(", onUpdate='");
            h.append(this.f43c);
            h.append('\'');
            h.append(", columnNames=");
            h.append(this.f44d);
            h.append(", referenceColumnNames=");
            return C0070b.m186i(h, this.f45e, '}');
        }
    }

    /* renamed from: a2.e$c */
    public static class C0021c implements Comparable<C0021c> {

        /* renamed from: b */
        public final int f46b;

        /* renamed from: c */
        public final int f47c;

        /* renamed from: d */
        public final String f48d;

        /* renamed from: e */
        public final String f49e;

        public C0021c(String str, int i, int i2, String str2) {
            this.f46b = i;
            this.f47c = i2;
            this.f48d = str;
            this.f49e = str2;
        }

        public final int compareTo(Object obj) {
            C0021c cVar = (C0021c) obj;
            int i = this.f46b - cVar.f46b;
            return i == 0 ? this.f47c - cVar.f47c : i;
        }
    }

    /* renamed from: a2.e$d */
    public static final class C0022d {

        /* renamed from: a */
        public final String f50a;

        /* renamed from: b */
        public final boolean f51b;

        /* renamed from: c */
        public final List<String> f52c;

        /* renamed from: d */
        public final List<String> f53d;

        public C0022d() {
            throw null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
            if (r1 == 0) goto L_0x0011;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0022d(java.lang.String r1, boolean r2, java.util.List r3, java.util.ArrayList r4) {
            /*
                r0 = this;
                r0.<init>()
                r0.f50a = r1
                r0.f51b = r2
                r0.f52c = r3
                if (r4 == 0) goto L_0x0011
                int r1 = r4.size()
                if (r1 != 0) goto L_0x001f
            L_0x0011:
                int r1 = r3.size()
                androidx.room.Index$Order r2 = androidx.room.Index$Order.ASC
                java.lang.String r2 = r2.name()
                java.util.List r4 = java.util.Collections.nCopies(r1, r2)
            L_0x001f:
                r0.f53d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p003a2.C0018e.C0022d.<init>(java.lang.String, boolean, java.util.List, java.util.ArrayList):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0022d)) {
                return false;
            }
            C0022d dVar = (C0022d) obj;
            if (this.f51b == dVar.f51b && this.f52c.equals(dVar.f52c) && this.f53d.equals(dVar.f53d)) {
                return this.f50a.startsWith("index_") ? dVar.f50a.startsWith("index_") : this.f50a.equals(dVar.f50a);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f50a.startsWith("index_") ? -1184239155 : this.f50a.hashCode();
            return this.f53d.hashCode() + ((this.f52c.hashCode() + (((hashCode * 31) + (this.f51b ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Index{name='");
            h.append(this.f50a);
            h.append('\'');
            h.append(", unique=");
            h.append(this.f51b);
            h.append(", columns=");
            h.append(this.f52c);
            h.append(", orders=");
            return C0070b.m186i(h, this.f53d, '}');
        }
    }

    public C0018e(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        this.f30a = str;
        this.f31b = Collections.unmodifiableMap(hashMap);
        this.f32c = Collections.unmodifiableSet(hashSet);
        this.f33d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C0018e m99a(C6920a aVar, String str) {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        C6920a aVar2 = aVar;
        String str2 = str;
        Cursor a = aVar2.mo19063a("PRAGMA table_info(`" + str2 + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (a.getColumnCount() > 0) {
                int columnIndex = a.getColumnIndex("name");
                int columnIndex2 = a.getColumnIndex("type");
                int columnIndex3 = a.getColumnIndex("notnull");
                int columnIndex4 = a.getColumnIndex("pk");
                int columnIndex5 = a.getColumnIndex("dflt_value");
                while (a.moveToNext()) {
                    String string = a.getString(columnIndex);
                    C0019a aVar3 = r14;
                    C0019a aVar4 = new C0019a(a.getInt(columnIndex4), string, a.getString(columnIndex2), a.getString(columnIndex5), a.getInt(columnIndex3) != 0, 2);
                    hashMap.put(string, aVar4);
                }
            }
            a.close();
            HashSet hashSet = new HashSet();
            Cursor a2 = aVar2.mo19063a("PRAGMA foreign_key_list(`" + str2 + "`)");
            try {
                int columnIndex6 = a2.getColumnIndex("id");
                int columnIndex7 = a2.getColumnIndex("seq");
                int columnIndex8 = a2.getColumnIndex("table");
                int columnIndex9 = a2.getColumnIndex("on_delete");
                int columnIndex10 = a2.getColumnIndex("on_update");
                ArrayList b = m100b(a2);
                int count = a2.getCount();
                int i4 = 0;
                while (i4 < count) {
                    a2.moveToPosition(i4);
                    if (a2.getInt(columnIndex7) != 0) {
                        i3 = columnIndex6;
                        i2 = columnIndex7;
                        arrayList = b;
                        i = count;
                    } else {
                        int i5 = a2.getInt(columnIndex6);
                        i3 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i2 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b;
                            C0021c cVar = (C0021c) it.next();
                            int i6 = count;
                            if (cVar.f46b == i5) {
                                arrayList2.add(cVar.f48d);
                                arrayList3.add(cVar.f49e);
                            }
                            b = arrayList4;
                            count = i6;
                        }
                        arrayList = b;
                        i = count;
                        hashSet.add(new C0020b(a2.getString(columnIndex8), a2.getString(columnIndex9), a2.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i4++;
                    columnIndex6 = i3;
                    columnIndex7 = i2;
                    b = arrayList;
                    count = i;
                }
                a2.close();
                Cursor a3 = aVar2.mo19063a("PRAGMA index_list(`" + str2 + "`)");
                try {
                    int columnIndex11 = a3.getColumnIndex("name");
                    int columnIndex12 = a3.getColumnIndex(CartRefreshDelegate.ARG_ORIGIN);
                    int columnIndex13 = a3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1) {
                        if (columnIndex13 != -1) {
                            HashSet hashSet3 = new HashSet();
                            while (a3.moveToNext()) {
                                if ("c".equals(a3.getString(columnIndex12))) {
                                    C0022d c = m101c(aVar2, a3.getString(columnIndex11), a3.getInt(columnIndex13) == 1);
                                    if (c != null) {
                                        hashSet3.add(c);
                                    }
                                }
                            }
                            a3.close();
                            hashSet2 = hashSet3;
                            return new C0018e(str2, hashMap, hashSet, hashSet2);
                        }
                    }
                    return new C0018e(str2, hashMap, hashSet, hashSet2);
                } finally {
                    a3.close();
                }
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        } catch (Throwable th2) {
            a.close();
            throw th2;
        }
    }

    /* renamed from: b */
    public static ArrayList m100b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(ResponseConstants.FROM);
        int columnIndex4 = cursor.getColumnIndex(ResponseConstants.f19136TO);
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0021c(cursor.getString(columnIndex3), cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static C0022d m101c(C6920a aVar, String str, boolean z) {
        Cursor a = aVar.mo19063a("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = a.getColumnIndex("seqno");
            int columnIndex2 = a.getColumnIndex(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY);
            int columnIndex3 = a.getColumnIndex("name");
            int columnIndex4 = a.getColumnIndex("desc");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                if (columnIndex4 != -1) {
                    TreeMap treeMap = new TreeMap();
                    TreeMap treeMap2 = new TreeMap();
                    while (a.moveToNext()) {
                        if (a.getInt(columnIndex2) >= 0) {
                            int i = a.getInt(columnIndex);
                            String string = a.getString(columnIndex3);
                            String str2 = a.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                            treeMap.put(Integer.valueOf(i), string);
                            treeMap2.put(Integer.valueOf(i), str2);
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    ArrayList arrayList2 = new ArrayList(treeMap2.size());
                    arrayList2.addAll(treeMap2.values());
                    C0022d dVar = new C0022d(str, z, arrayList, arrayList2);
                    a.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            a.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<C0022d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0018e)) {
            return false;
        }
        C0018e eVar = (C0018e) obj;
        String str = this.f30a;
        if (str == null ? eVar.f30a != null : !str.equals(eVar.f30a)) {
            return false;
        }
        Map<String, C0019a> map = this.f31b;
        if (map == null ? eVar.f31b != null : !map.equals(eVar.f31b)) {
            return false;
        }
        Set<C0020b> set2 = this.f32c;
        if (set2 == null ? eVar.f32c != null : !set2.equals(eVar.f32c)) {
            return false;
        }
        Set<C0022d> set3 = this.f33d;
        if (set3 == null || (set = eVar.f33d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public final int hashCode() {
        String str = this.f30a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C0019a> map = this.f31b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C0020b> set = this.f32c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TableInfo{name='");
        h.append(this.f30a);
        h.append('\'');
        h.append(", columns=");
        h.append(this.f31b);
        h.append(", foreignKeys=");
        h.append(this.f32c);
        h.append(", indices=");
        h.append(this.f33d);
        h.append('}');
        return h.toString();
    }
}
