package p432qg;

import android.util.Base64;
import android.util.Log;
import com.facebook.login.LoginStatusClient;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C19446a;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19543e0;
import org.json.JSONObject;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: qg.a */
public final class C13330a {

    /* renamed from: qg.a$a */
    public static final class C13331a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ URL f29253b;

        /* renamed from: c */
        public final /* synthetic */ Ref$ObjectRef f29254c;

        /* renamed from: d */
        public final /* synthetic */ String f29255d;

        /* renamed from: e */
        public final /* synthetic */ ReentrantLock f29256e;

        /* renamed from: f */
        public final /* synthetic */ Condition f29257f;

        public C13331a(URL url, Ref$ObjectRef ref$ObjectRef, String str, ReentrantLock reentrantLock, Condition condition) {
            this.f29253b = url;
            this.f29254c = ref$ObjectRef;
            this.f29255d = str;
            this.f29256e = reentrantLock;
            this.f29257f = condition;
        }

        public final void run() {
            HttpURLConnection httpURLConnection;
            ReentrantLock reentrantLock;
            ReentrantLock reentrantLock2;
            if (!C13080a.m20762b(this)) {
                try {
                    URLConnection openConnection = this.f29253b.openConnection();
                    if (openConnection != null) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            C19383o.m32796f(inputStream, "connection.inputStream");
                            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C19446a.f43373b);
                            String f0 = C19543e0.m33313f0(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                            httpURLConnection.getInputStream().close();
                            this.f29254c.element = new JSONObject(f0).optString(this.f29255d);
                            httpURLConnection.disconnect();
                            reentrantLock = this.f29256e;
                            reentrantLock.lock();
                            this.f29257f.signal();
                            C19394m mVar = C19394m.f43287a;
                        } catch (Exception e) {
                            String name = C13330a.class.getName();
                            String message = e.getMessage();
                            if (message == null) {
                                message = "Error getting public key";
                            }
                            Log.d(name, message);
                            httpURLConnection.disconnect();
                            reentrantLock = this.f29256e;
                            reentrantLock.lock();
                            this.f29257f.signal();
                            C19394m mVar2 = C19394m.f43287a;
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                        reentrantLock.unlock();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                } catch (Throwable th2) {
                    C13080a.m20761a(this, th2);
                }
            }
        }
    }

    /* renamed from: a */
    public static final PublicKey m20944a(String str) {
        byte[] decode = Base64.decode(C19457k.m33023a1(C19457k.m33023a1(C19457k.m33023a1(str, "\n", "", false), "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), 0);
        C19383o.m32796f(decode, "Base64.decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance(BaseSecureKeyWrapper.RSA_ALGORITHM).generatePublic(new X509EncodedKeySpec(decode));
        C19383o.m32796f(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static final String m20945b(String str) {
        C19383o.m32797g(str, "kid");
        URL url = new URL("https", "www." + C13418j.f29400t, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        C13418j.m21108d().execute(new C13331a(url, ref$ObjectRef, str, reentrantLock, newCondition));
        reentrantLock.lock();
        try {
            newCondition.await(LoginStatusClient.DEFAULT_TOAST_DURATION_MS, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) ref$ObjectRef.element;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public static final boolean m20946c(PublicKey publicKey, String str, String str2) {
        C19383o.m32797g(str, "data");
        C19383o.m32797g(str2, "signature");
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(publicKey);
            byte[] bytes = str.getBytes(C19446a.f43373b);
            C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            C19383o.m32796f(decode, "Base64.decode(signature, Base64.URL_SAFE)");
            return instance.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
