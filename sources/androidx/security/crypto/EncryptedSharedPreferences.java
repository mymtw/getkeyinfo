package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import android.util.ArraySet;
import android.util.Pair;
import androidx.appcompat.widget.C0326j;
import com.google.crypto.tink.KeyTemplate;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p508am.C14030a;
import p551dm.C17663p;
import p551dm.C17675t;
import p567fm.C17756f;
import p705wl.C18726a;
import p705wl.C18729c;
import p705wl.C18734f;
import p705wl.C18745o;
import p713xl.C18788a;
import p729zl.C18963a;
import p729zl.C18966b;
import p729zl.C18967c;

public final class EncryptedSharedPreferences implements SharedPreferences {
    private static final String KEY_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final String NULL_VALUE = "__NULL__";
    private static final String VALUE_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    public final String mFileName;
    public final C18729c mKeyDeterministicAead;
    public final List<SharedPreferences.OnSharedPreferenceChangeListener> mListeners = new ArrayList();
    public final String mMasterKeyAlias;
    public final SharedPreferences mSharedPreferences;
    public final C18726a mValueAead;

    public enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        private EncryptedType(int i) {
            this.mId = i;
        }

        public static EncryptedType fromId(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum PrefKeyEncryptionScheme {
        AES256_SIV(KeyTemplate.m26517a("type.googleapis.com/google.crypto.tink.AesSivKey", ((C17675t) r2.mo58538l()).mo58605c(), r1));
        
        private final KeyTemplate mDeterministicAeadKeyTemplate;

        private PrefKeyEncryptionScheme(KeyTemplate keyTemplate) {
            this.mDeterministicAeadKeyTemplate = keyTemplate;
        }

        public KeyTemplate getKeyTemplate() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    public enum PrefValueEncryptionScheme {
        AES256_GCM(KeyTemplate.m26517a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C17663p) r2.mo58538l()).mo58605c(), r1));
        
        private final KeyTemplate mAeadKeyTemplate;

        private PrefValueEncryptionScheme(KeyTemplate keyTemplate) {
            this.mAeadKeyTemplate = keyTemplate;
        }

        public KeyTemplate getKeyTemplate() {
            return this.mAeadKeyTemplate;
        }
    }

    /* renamed from: androidx.security.crypto.EncryptedSharedPreferences$a */
    public static /* synthetic */ class C3270a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7593a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7593a = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7593a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7593a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7593a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7593a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f7593a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.security.crypto.EncryptedSharedPreferences.C3270a.<clinit>():void");
        }
    }

    /* renamed from: androidx.security.crypto.EncryptedSharedPreferences$b */
    public static final class C3271b implements SharedPreferences.Editor {

        /* renamed from: a */
        public final EncryptedSharedPreferences f7594a;

        /* renamed from: b */
        public final SharedPreferences.Editor f7595b;

        /* renamed from: c */
        public final CopyOnWriteArrayList f7596c;

        /* renamed from: d */
        public AtomicBoolean f7597d = new AtomicBoolean(false);

        public C3271b(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.f7594a = encryptedSharedPreferences;
            this.f7595b = editor;
            this.f7596c = new CopyOnWriteArrayList();
        }

        /* renamed from: a */
        public final void mo12084a() {
            if (this.f7597d.getAndSet(false)) {
                for (String next : this.f7594a.getAll().keySet()) {
                    if (!this.f7596c.contains(next) && !this.f7594a.isReservedKey(next)) {
                        this.f7595b.remove(this.f7594a.encryptKey(next));
                    }
                }
            }
        }

        public final void apply() {
            mo12084a();
            this.f7595b.apply();
            mo12086b();
            this.f7596c.clear();
        }

        /* renamed from: b */
        public final void mo12086b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener next : this.f7594a.mListeners) {
                Iterator it = this.f7596c.iterator();
                while (it.hasNext()) {
                    next.onSharedPreferenceChanged(this.f7594a, (String) it.next());
                }
            }
        }

        /* renamed from: c */
        public final void mo12087c(String str, byte[] bArr) {
            if (!this.f7594a.isReservedKey(str)) {
                this.f7596c.add(str);
                if (str == null) {
                    str = EncryptedSharedPreferences.NULL_VALUE;
                }
                try {
                    Pair<String, String> encryptKeyValuePair = this.f7594a.encryptKeyValuePair(str, bArr);
                    this.f7595b.putString((String) encryptKeyValuePair.first, (String) encryptKeyValuePair.second);
                } catch (GeneralSecurityException e) {
                    StringBuilder h = C0072d.m201h("Could not encrypt data: ");
                    h.append(e.getMessage());
                    throw new SecurityException(h.toString(), e);
                }
            } else {
                throw new SecurityException(C0326j.m864i(str, " is a reserved key for the encryption keyset."));
            }
        }

        public final SharedPreferences.Editor clear() {
            this.f7597d.set(true);
            return this;
        }

        public final boolean commit() {
            mo12084a();
            try {
                return this.f7595b.commit();
            } finally {
                mo12086b();
                this.f7596c.clear();
            }
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EncryptedType.BOOLEAN.getId());
            allocate.put(z ? (byte) 1 : 0);
            mo12087c(str, allocate.array());
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.FLOAT.getId());
            allocate.putFloat(f);
            mo12087c(str, allocate.array());
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.INT.getId());
            allocate.putInt(i);
            mo12087c(str, allocate.array());
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EncryptedType.LONG.getId());
            allocate.putLong(j);
            mo12087c(str, allocate.array());
            return this;
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = EncryptedSharedPreferences.NULL_VALUE;
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EncryptedType.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            mo12087c(str, allocate.array());
            return this;
        }

        /* JADX WARNING: Failed to insert additional move for type inference */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.SharedPreferences.Editor putStringSet(java.lang.String r5, java.util.Set<java.lang.String> r6) {
            /*
                r4 = this;
                if (r6 != 0) goto L_0x000c
                android.util.ArraySet r6 = new android.util.ArraySet
                r6.<init>()
                java.lang.String r0 = "__NULL__"
                r6.add(r0)
            L_0x000c:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.size()
                r0.<init>(r1)
                int r1 = r6.size()
                int r1 = r1 * 4
                java.util.Iterator r6 = r6.iterator()
            L_0x001f:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x0037
                java.lang.Object r2 = r6.next()
                java.lang.String r2 = (java.lang.String) r2
                java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r2 = r2.getBytes(r3)
                r0.add(r2)
                int r2 = r2.length
                int r1 = r1 + r2
                goto L_0x001f
            L_0x0037:
                int r1 = r1 + 4
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET
                int r1 = r1.getId()
                r6.putInt(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x004a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x005e
                java.lang.Object r1 = r0.next()
                byte[] r1 = (byte[]) r1
                int r2 = r1.length
                r6.putInt(r2)
                r6.put(r1)
                goto L_0x004a
            L_0x005e:
                byte[] r6 = r6.array()
                r4.mo12087c(r5, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.security.crypto.EncryptedSharedPreferences.C3271b.putStringSet(java.lang.String, java.util.Set):android.content.SharedPreferences$Editor");
        }

        public final SharedPreferences.Editor remove(String str) {
            if (!this.f7594a.isReservedKey(str)) {
                this.f7595b.remove(this.f7594a.encryptKey(str));
                this.f7596c.remove(str);
                return this;
            }
            throw new SecurityException(C0326j.m864i(str, " is a reserved key for the encryption keyset."));
        }
    }

    public EncryptedSharedPreferences(String str, String str2, SharedPreferences sharedPreferences, C18726a aVar, C18729c cVar) {
        this.mFileName = str;
        this.mSharedPreferences = sharedPreferences;
        this.mMasterKeyAlias = str2;
        this.mValueAead = aVar;
        this.mKeyDeterministicAead = cVar;
    }

    public static SharedPreferences create(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        C14030a aVar;
        C18734f a;
        C14030a aVar2;
        C18734f a2;
        int i = C18966b.f42287a;
        C18745o.m31615e(new C18963a(), true);
        C18745o.m31616f(new C18967c());
        C18788a.m31707a();
        C14030a.C14031a aVar3 = new C14030a.C14031a();
        aVar3.f30885e = prefKeyEncryptionScheme.getKeyTemplate();
        aVar3.mo46852c(context, KEY_KEYSET_ALIAS, str);
        String str3 = "android-keystore://" + str2;
        if (str3.startsWith("android-keystore://")) {
            aVar3.f30883c = str3;
            synchronized (aVar3) {
                if (aVar3.f30883c != null) {
                    aVar3.f30884d = aVar3.mo46851b();
                }
                aVar3.f30886f = aVar3.mo46850a();
                aVar = new C14030a(aVar3);
            }
            synchronized (aVar) {
                a = aVar.f30880b.mo70225a();
            }
            C14030a.C14031a aVar4 = new C14030a.C14031a();
            aVar4.f30885e = prefValueEncryptionScheme.getKeyTemplate();
            aVar4.mo46852c(context, VALUE_KEYSET_ALIAS, str);
            String str4 = "android-keystore://" + str2;
            if (str4.startsWith("android-keystore://")) {
                aVar4.f30883c = str4;
                synchronized (aVar4) {
                    if (aVar4.f30883c != null) {
                        aVar4.f30884d = aVar4.mo46851b();
                    }
                    aVar4.f30886f = aVar4.mo46850a();
                    aVar2 = new C14030a(aVar4);
                }
                synchronized (aVar2) {
                    a2 = aVar2.f30880b.mo70225a();
                }
                return new EncryptedSharedPreferences(str, str2, context.getSharedPreferences(str, 0), (C18726a) a2.mo70223a(C18726a.class), (C18729c) a.mo70223a(C18729c.class));
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    private Object getDecryptedObject(String str) {
        if (!isReservedKey(str)) {
            if (str == null) {
                str = NULL_VALUE;
            }
            try {
                String encryptKey = encryptKey(str);
                String string = this.mSharedPreferences.getString(encryptKey, (String) null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.mValueAead.mo46854b(C17756f.m29778a(string), encryptKey.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                switch (C3270a.f7593a[EncryptedType.fromId(wrap.getInt()).ordinal()]) {
                    case 1:
                        int i = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i);
                        String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                        if (charBuffer.equals(NULL_VALUE)) {
                            return null;
                        }
                        return charBuffer;
                    case 2:
                        return Integer.valueOf(wrap.getInt());
                    case 3:
                        return Long.valueOf(wrap.getLong());
                    case 4:
                        return Float.valueOf(wrap.getFloat());
                    case 5:
                        if (wrap.get() != 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 6:
                        ArraySet arraySet = new ArraySet();
                        while (wrap.hasRemaining()) {
                            int i2 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i2);
                            wrap.position(wrap.position() + i2);
                            arraySet.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (arraySet.size() != 1 || !NULL_VALUE.equals(arraySet.valueAt(0))) {
                            return arraySet;
                        }
                        return null;
                    default:
                        return null;
                }
            } catch (GeneralSecurityException e) {
                StringBuilder h = C0072d.m201h("Could not decrypt value. ");
                h.append(e.getMessage());
                throw new SecurityException(h.toString(), e);
            }
        } else {
            throw new SecurityException(C0326j.m864i(str, " is a reserved key for the encryption keyset."));
        }
    }

    public boolean contains(String str) {
        if (!isReservedKey(str)) {
            return this.mSharedPreferences.contains(encryptKey(str));
        }
        throw new SecurityException(C0326j.m864i(str, " is a reserved key for the encryption keyset."));
    }

    public String decryptKey(String str) {
        try {
            String str2 = new String(this.mKeyDeterministicAead.mo69001b(C17756f.m29778a(str), this.mFileName.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals(NULL_VALUE)) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            StringBuilder h = C0072d.m201h("Could not decrypt key. ");
            h.append(e.getMessage());
            throw new SecurityException(h.toString(), e);
        }
    }

    public SharedPreferences.Editor edit() {
        return new C3271b(this, this.mSharedPreferences.edit());
    }

    public String encryptKey(String str) {
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            return new String(C17756f.m29779b(this.mKeyDeterministicAead.mo69000a(str.getBytes(StandardCharsets.UTF_8), this.mFileName.getBytes())), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        } catch (GeneralSecurityException e2) {
            StringBuilder h = C0072d.m201h("Could not encrypt key. ");
            h.append(e2.getMessage());
            throw new SecurityException(h.toString(), e2);
        }
    }

    public Pair<String, String> encryptKeyValuePair(String str, byte[] bArr) throws GeneralSecurityException {
        String encryptKey = encryptKey(str);
        try {
            return new Pair<>(encryptKey, new String(C17756f.m29779b(this.mValueAead.mo46853a(bArr, encryptKey.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.mSharedPreferences.getAll().entrySet()) {
            if (!isReservedKey((String) next.getKey())) {
                String decryptKey = decryptKey((String) next.getKey());
                hashMap.put(decryptKey, getDecryptedObject(decryptKey));
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Boolean)) ? z : ((Boolean) decryptedObject).booleanValue();
    }

    public float getFloat(String str, float f) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Float)) ? f : ((Float) decryptedObject).floatValue();
    }

    public int getInt(String str, int i) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Integer)) ? i : ((Integer) decryptedObject).intValue();
    }

    public long getLong(String str, long j) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Long)) ? j : ((Long) decryptedObject).longValue();
    }

    public String getString(String str, String str2) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof String)) ? str2 : (String) decryptedObject;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Object decryptedObject = getDecryptedObject(str);
        Set<String> arraySet = decryptedObject instanceof Set ? (Set) decryptedObject : new ArraySet<>();
        return arraySet.size() > 0 ? arraySet : set;
    }

    public boolean isReservedKey(String str) {
        return KEY_KEYSET_ALIAS.equals(str) || VALUE_KEYSET_ALIAS.equals(str);
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.add(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.remove(onSharedPreferenceChangeListener);
    }
}
