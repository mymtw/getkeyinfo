package p508am;

import android.content.Context;
import android.util.Log;
import com.appboy.Constants;
import com.google.crypto.tink.KeyTemplate;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import p705wl.C18726a;
import p705wl.C18735g;

/* renamed from: am.a */
public final class C14030a {

    /* renamed from: c */
    public static final /* synthetic */ int f30878c = 0;

    /* renamed from: a */
    public final C18726a f30879a;

    /* renamed from: b */
    public C18735g f30880b;

    /* renamed from: am.a$a */
    public static final class C14031a {

        /* renamed from: a */
        public C14035d f30881a = null;

        /* renamed from: b */
        public C14036e f30882b = null;

        /* renamed from: c */
        public String f30883c = null;

        /* renamed from: d */
        public C14032b f30884d = null;

        /* renamed from: e */
        public KeyTemplate f30885e = null;

        /* renamed from: f */
        public C18735g f30886f;

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p705wl.C18735g mo46850a() throws java.security.GeneralSecurityException, java.io.IOException {
            /*
                r7 = this;
                am.b r0 = r7.f30884d     // Catch:{ FileNotFoundException -> 0x0027 }
                if (r0 == 0) goto L_0x0035
                am.d r1 = r7.f30881a     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                wl.f r0 = p705wl.C18734f.m31591b(r1, r0)     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                wl.g r1 = new wl.g     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                com.google.crypto.tink.proto.a r0 = r0.f41506a     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                r0.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r2 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                java.lang.Object r2 = r0.mo58428m(r2)     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$a r2 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.C16431a) r2     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                r2.mo58540o()     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                MessageType r3 = r2.f36539c     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.C16431a.m26646p(r3, r0)     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                com.google.crypto.tink.proto.a$b r2 = (com.google.crypto.tink.proto.C16415a.C16417b) r2     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                r1.<init>(r2)     // Catch:{ InvalidProtocolBufferException -> 0x002b, GeneralSecurityException -> 0x0029 }
                goto L_0x0060
            L_0x0027:
                r0 = move-exception
                goto L_0x0069
            L_0x0029:
                r0 = move-exception
                goto L_0x002c
            L_0x002b:
                r0 = move-exception
            L_0x002c:
                int r1 = p508am.C14030a.f30878c     // Catch:{ FileNotFoundException -> 0x0027 }
                java.lang.String r1 = "a"
                java.lang.String r2 = "cannot decrypt keyset: "
                android.util.Log.w(r1, r2, r0)     // Catch:{ FileNotFoundException -> 0x0027 }
            L_0x0035:
                am.d r0 = r7.f30881a     // Catch:{ FileNotFoundException -> 0x0027 }
                byte[] r0 = r0.mo46860a()     // Catch:{ FileNotFoundException -> 0x0027 }
                com.google.crypto.tink.shaded.protobuf.n r1 = com.google.crypto.tink.shaded.protobuf.C16511n.m27170a()     // Catch:{ FileNotFoundException -> 0x0027 }
                com.google.crypto.tink.proto.a r0 = com.google.crypto.tink.proto.C16415a.m26536B(r0, r1)     // Catch:{ FileNotFoundException -> 0x0027 }
                int r1 = r0.mo58432x()     // Catch:{ FileNotFoundException -> 0x0027 }
                if (r1 <= 0) goto L_0x0061
                wl.g r1 = new wl.g     // Catch:{ FileNotFoundException -> 0x0027 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r2 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ FileNotFoundException -> 0x0027 }
                java.lang.Object r2 = r0.mo58428m(r2)     // Catch:{ FileNotFoundException -> 0x0027 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$a r2 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.C16431a) r2     // Catch:{ FileNotFoundException -> 0x0027 }
                r2.mo58540o()     // Catch:{ FileNotFoundException -> 0x0027 }
                MessageType r3 = r2.f36539c     // Catch:{ FileNotFoundException -> 0x0027 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.C16431a.m26646p(r3, r0)     // Catch:{ FileNotFoundException -> 0x0027 }
                com.google.crypto.tink.proto.a$b r2 = (com.google.crypto.tink.proto.C16415a.C16417b) r2     // Catch:{ FileNotFoundException -> 0x0027 }
                r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0027 }
            L_0x0060:
                return r1
            L_0x0061:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ FileNotFoundException -> 0x0027 }
                java.lang.String r1 = "empty keyset"
                r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0027 }
                throw r0     // Catch:{ FileNotFoundException -> 0x0027 }
            L_0x0069:
                int r1 = p508am.C14030a.f30878c
                java.lang.String r1 = "a"
                java.lang.String r2 = "keyset not found, will generate a new one"
                android.util.Log.w(r1, r2, r0)
                com.google.crypto.tink.KeyTemplate r0 = r7.f30885e
                if (r0 == 0) goto L_0x01c2
                wl.g r0 = new wl.g
                com.google.crypto.tink.proto.a$b r1 = com.google.crypto.tink.proto.C16415a.m26535A()
                r0.<init>(r1)
                com.google.crypto.tink.KeyTemplate r2 = r7.f30885e
                monitor-enter(r0)
                dm.a0 r2 = r2.f36505a     // Catch:{ all -> 0x01bf }
                monitor-enter(r0)     // Catch:{ all -> 0x01bf }
                com.google.crypto.tink.proto.a$c r2 = r0.mo70227c(r2)     // Catch:{ all -> 0x01bc }
                r1.mo58540o()     // Catch:{ all -> 0x01bc }
                MessageType r1 = r1.f36539c     // Catch:{ all -> 0x01bc }
                com.google.crypto.tink.proto.a r1 = (com.google.crypto.tink.proto.C16415a) r1     // Catch:{ all -> 0x01bc }
                com.google.crypto.tink.proto.C16415a.m26539v(r1, r2)     // Catch:{ all -> 0x01bc }
                monitor-exit(r0)     // Catch:{ all -> 0x01bf }
                monitor-exit(r0)
                wl.f r1 = r0.mo70225a()
                com.google.crypto.tink.proto.a r1 = r1.f41506a
                dm.c0 r1 = p705wl.C18748q.m31621a(r1)
                r2 = 0
                dm.c0$c r1 = r1.mo68919w()
                int r1 = r1.mo68920y()
                monitor-enter(r0)
                r3 = r2
            L_0x00aa:
                com.google.crypto.tink.proto.a$b r4 = r0.f41507a     // Catch:{ all -> 0x01b9 }
                MessageType r4 = r4.f36539c     // Catch:{ all -> 0x01b9 }
                com.google.crypto.tink.proto.a r4 = (com.google.crypto.tink.proto.C16415a) r4     // Catch:{ all -> 0x01b9 }
                int r4 = r4.mo58432x()     // Catch:{ all -> 0x01b9 }
                if (r3 >= r4) goto L_0x01a2
                com.google.crypto.tink.proto.a$b r4 = r0.f41507a     // Catch:{ all -> 0x01b9 }
                MessageType r4 = r4.f36539c     // Catch:{ all -> 0x01b9 }
                com.google.crypto.tink.proto.a r4 = (com.google.crypto.tink.proto.C16415a) r4     // Catch:{ all -> 0x01b9 }
                com.google.crypto.tink.proto.a$c r4 = r4.mo58431w(r3)     // Catch:{ all -> 0x01b9 }
                int r5 = r4.mo58439z()     // Catch:{ all -> 0x01b9 }
                if (r5 != r1) goto L_0x019e
                com.google.crypto.tink.proto.KeyStatusType r3 = r4.mo58436B()     // Catch:{ all -> 0x01b9 }
                com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch:{ all -> 0x01b9 }
                boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x01b9 }
                if (r3 == 0) goto L_0x0187
                com.google.crypto.tink.proto.a$b r3 = r0.f41507a     // Catch:{ all -> 0x01b9 }
                r3.mo58540o()     // Catch:{ all -> 0x01b9 }
                MessageType r3 = r3.f36539c     // Catch:{ all -> 0x01b9 }
                com.google.crypto.tink.proto.a r3 = (com.google.crypto.tink.proto.C16415a) r3     // Catch:{ all -> 0x01b9 }
                com.google.crypto.tink.proto.C16415a.m26538u(r3, r1)     // Catch:{ all -> 0x01b9 }
                monitor-exit(r0)
                am.b r1 = r7.f30884d
                if (r1 == 0) goto L_0x0160
                wl.f r1 = r0.mo70225a()
                am.e r3 = r7.f30882b
                am.b r4 = r7.f30884d
                com.google.crypto.tink.proto.a r1 = r1.f41506a
                byte[] r5 = r1.mo58605c()
                byte[] r6 = new byte[r2]
                byte[] r5 = r4.mo46853a(r5, r6)
                byte[] r2 = new byte[r2]     // Catch:{ InvalidProtocolBufferException -> 0x0158 }
                byte[] r2 = r4.mo46854b(r5, r2)     // Catch:{ InvalidProtocolBufferException -> 0x0158 }
                com.google.crypto.tink.shaded.protobuf.n r4 = com.google.crypto.tink.shaded.protobuf.C16511n.m27170a()     // Catch:{ InvalidProtocolBufferException -> 0x0158 }
                com.google.crypto.tink.proto.a r2 = com.google.crypto.tink.proto.C16415a.m26536B(r2, r4)     // Catch:{ InvalidProtocolBufferException -> 0x0158 }
                boolean r2 = r2.equals(r1)     // Catch:{ InvalidProtocolBufferException -> 0x0158 }
                if (r2 == 0) goto L_0x0150
                dm.w$b r2 = p551dm.C17684w.m29675x()
                com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom((byte[]) r5)
                r2.mo58540o()
                MessageType r5 = r2.f36539c
                dm.w r5 = (p551dm.C17684w) r5
                p551dm.C17684w.m29673u(r5, r4)
                dm.c0 r1 = p705wl.C18748q.m31621a(r1)
                r2.mo58540o()
                MessageType r4 = r2.f36539c
                dm.w r4 = (p551dm.C17684w) r4
                p551dm.C17684w.m29674v(r4, r1)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r2.mo58538l()
                dm.w r1 = (p551dm.C17684w) r1
                android.content.SharedPreferences$Editor r2 = r3.f30893a
                java.lang.String r3 = r3.f30894b
                byte[] r1 = r1.mo58605c()
                java.lang.String r1 = androidx.compose.foundation.layout.C0761x.m1693T(r1)
                android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)
                boolean r1 = r1.commit()
                if (r1 == 0) goto L_0x0148
                goto L_0x017e
            L_0x0148:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Failed to write to SharedPreferences"
                r0.<init>(r1)
                throw r0
            L_0x0150:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ InvalidProtocolBufferException -> 0x0158 }
                java.lang.String r1 = "cannot encrypt keyset"
                r0.<init>(r1)     // Catch:{ InvalidProtocolBufferException -> 0x0158 }
                throw r0     // Catch:{ InvalidProtocolBufferException -> 0x0158 }
            L_0x0158:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "invalid keyset, corrupted key material"
                r0.<init>(r1)
                throw r0
            L_0x0160:
                wl.f r1 = r0.mo70225a()
                am.e r2 = r7.f30882b
                com.google.crypto.tink.proto.a r1 = r1.f41506a
                android.content.SharedPreferences$Editor r3 = r2.f30893a
                java.lang.String r2 = r2.f30894b
                byte[] r1 = r1.mo58605c()
                java.lang.String r1 = androidx.compose.foundation.layout.C0761x.m1693T(r1)
                android.content.SharedPreferences$Editor r1 = r3.putString(r2, r1)
                boolean r1 = r1.commit()
                if (r1 == 0) goto L_0x017f
            L_0x017e:
                return r0
            L_0x017f:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Failed to write to SharedPreferences"
                r0.<init>(r1)
                throw r0
            L_0x0187:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x01b9 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
                r3.<init>()     // Catch:{ all -> 0x01b9 }
                java.lang.String r4 = "cannot set key as primary because it's not enabled: "
                r3.append(r4)     // Catch:{ all -> 0x01b9 }
                r3.append(r1)     // Catch:{ all -> 0x01b9 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x01b9 }
                r2.<init>(r1)     // Catch:{ all -> 0x01b9 }
                throw r2     // Catch:{ all -> 0x01b9 }
            L_0x019e:
                int r3 = r3 + 1
                goto L_0x00aa
            L_0x01a2:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x01b9 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
                r3.<init>()     // Catch:{ all -> 0x01b9 }
                java.lang.String r4 = "key not found: "
                r3.append(r4)     // Catch:{ all -> 0x01b9 }
                r3.append(r1)     // Catch:{ all -> 0x01b9 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x01b9 }
                r2.<init>(r1)     // Catch:{ all -> 0x01b9 }
                throw r2     // Catch:{ all -> 0x01b9 }
            L_0x01b9:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x01bc:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01bf }
                throw r1     // Catch:{ all -> 0x01bf }
            L_0x01bf:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x01c2:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "cannot read or generate keyset"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p508am.C14030a.C14031a.mo46850a():wl.g");
        }

        /* renamed from: b */
        public final C14032b mo46851b() throws GeneralSecurityException {
            int i = C14030a.f30878c;
            C14033c cVar = new C14033c();
            boolean d = cVar.mo46859d(this.f30883c);
            if (!d) {
                try {
                    C14033c.m21607c(this.f30883c);
                } catch (GeneralSecurityException | ProviderException e) {
                    int i2 = C14030a.f30878c;
                    Log.w(Constants.APPBOY_PUSH_CONTENT_KEY, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            }
            try {
                return cVar.mo46858b(this.f30883c);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (!d) {
                    int i3 = C14030a.f30878c;
                    Log.w(Constants.APPBOY_PUSH_CONTENT_KEY, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f30883c}), e2);
            }
        }

        /* renamed from: c */
        public final void mo46852c(Context context, String str, String str2) throws IOException {
            if (context != null) {
                this.f30881a = new C14035d(context, str, str2);
                this.f30882b = new C14036e(context, str, str2);
                return;
            }
            throw new IllegalArgumentException("need an Android context");
        }
    }

    public C14030a(C14031a aVar) throws GeneralSecurityException, IOException {
        C14036e eVar = aVar.f30882b;
        this.f30879a = aVar.f30884d;
        this.f30880b = aVar.f30886f;
    }
}
