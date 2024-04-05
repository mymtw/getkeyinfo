package p592in;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p576gn.C17801b;

/* renamed from: in.d */
public final class C17872d extends HttpsURLConnection {

    /* renamed from: a */
    public final C17873e f38805a;

    /* renamed from: b */
    public final HttpsURLConnection f38806b;

    public C17872d(HttpsURLConnection httpsURLConnection, Timer timer, C17801b bVar) {
        super(httpsURLConnection.getURL());
        this.f38806b = httpsURLConnection;
        this.f38805a = new C17873e(httpsURLConnection, timer, bVar);
    }

    public final void addRequestProperty(String str, String str2) {
        this.f38805a.f38808a.addRequestProperty(str, str2);
    }

    public final void connect() throws IOException {
        this.f38805a.mo69228a();
    }

    public final void disconnect() {
        C17873e eVar = this.f38805a;
        eVar.f38809b.mo69041i(eVar.f38812e.getDurationMicros());
        eVar.f38809b.mo69034a();
        eVar.f38808a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f38805a.equals(obj);
    }

    public final boolean getAllowUserInteraction() {
        return this.f38805a.f38808a.getAllowUserInteraction();
    }

    public final String getCipherSuite() {
        return this.f38806b.getCipherSuite();
    }

    public final int getConnectTimeout() {
        return this.f38805a.f38808a.getConnectTimeout();
    }

    public final Object getContent() throws IOException {
        return this.f38805a.mo69229b();
    }

    public final String getContentEncoding() {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getContentEncoding();
    }

    public final int getContentLength() {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getContentLength();
    }

    public final long getContentLengthLong() {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getContentLengthLong();
    }

    public final String getContentType() {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getContentType();
    }

    public final long getDate() {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getDate();
    }

    public final boolean getDefaultUseCaches() {
        return this.f38805a.f38808a.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.f38805a.f38808a.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.f38805a.f38808a.getDoOutput();
    }

    public final InputStream getErrorStream() {
        return this.f38805a.mo69231d();
    }

    public final long getExpiration() {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getExpiration();
    }

    public final String getHeaderField(int i) {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getHeaderField(i);
    }

    public final long getHeaderFieldDate(String str, long j) {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getHeaderFieldDate(str, j);
    }

    public final int getHeaderFieldInt(String str, int i) {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getHeaderFieldInt(str, i);
    }

    public final String getHeaderFieldKey(int i) {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getHeaderFieldKey(i);
    }

    public final long getHeaderFieldLong(String str, long j) {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getHeaderFieldLong(str, j);
    }

    public final Map<String, List<String>> getHeaderFields() {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getHeaderFields();
    }

    public final HostnameVerifier getHostnameVerifier() {
        return this.f38806b.getHostnameVerifier();
    }

    public final long getIfModifiedSince() {
        return this.f38805a.f38808a.getIfModifiedSince();
    }

    public final InputStream getInputStream() throws IOException {
        return this.f38805a.mo69232e();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.f38805a.f38808a.getInstanceFollowRedirects();
    }

    public final long getLastModified() {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getLastModified();
    }

    public final Certificate[] getLocalCertificates() {
        return this.f38806b.getLocalCertificates();
    }

    public final Principal getLocalPrincipal() {
        return this.f38806b.getLocalPrincipal();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.f38805a.mo69234f();
    }

    public final Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.f38806b.getPeerPrincipal();
    }

    public final Permission getPermission() throws IOException {
        C17873e eVar = this.f38805a;
        eVar.getClass();
        try {
            return eVar.f38808a.getPermission();
        } catch (IOException e) {
            eVar.f38809b.mo69041i(eVar.f38812e.getDurationMicros());
            C17876h.m30013c(eVar.f38809b);
            throw e;
        }
    }

    public final int getReadTimeout() {
        return this.f38805a.f38808a.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.f38805a.f38808a.getRequestMethod();
    }

    public final Map<String, List<String>> getRequestProperties() {
        return this.f38805a.f38808a.getRequestProperties();
    }

    public final String getRequestProperty(String str) {
        return this.f38805a.f38808a.getRequestProperty(str);
    }

    public final int getResponseCode() throws IOException {
        return this.f38805a.mo69235g();
    }

    public final String getResponseMessage() throws IOException {
        return this.f38805a.mo69236h();
    }

    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f38806b.getSSLSocketFactory();
    }

    public final Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.f38806b.getServerCertificates();
    }

    public final URL getURL() {
        return this.f38805a.f38808a.getURL();
    }

    public final boolean getUseCaches() {
        return this.f38805a.f38808a.getUseCaches();
    }

    public final int hashCode() {
        return this.f38805a.hashCode();
    }

    public final void setAllowUserInteraction(boolean z) {
        this.f38805a.f38808a.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.f38805a.f38808a.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i) {
        this.f38805a.f38808a.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.f38805a.f38808a.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.f38805a.f38808a.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.f38805a.f38808a.setDoOutput(z);
    }

    public final void setFixedLengthStreamingMode(int i) {
        this.f38805a.f38808a.setFixedLengthStreamingMode(i);
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f38806b.setHostnameVerifier(hostnameVerifier);
    }

    public final void setIfModifiedSince(long j) {
        this.f38805a.f38808a.setIfModifiedSince(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.f38805a.f38808a.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i) {
        this.f38805a.f38808a.setReadTimeout(i);
    }

    public final void setRequestMethod(String str) throws ProtocolException {
        this.f38805a.f38808a.setRequestMethod(str);
    }

    public final void setRequestProperty(String str, String str2) {
        C17873e eVar = this.f38805a;
        eVar.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            eVar.f38809b.f38702g = str2;
        }
        eVar.f38808a.setRequestProperty(str, str2);
    }

    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f38806b.setSSLSocketFactory(sSLSocketFactory);
    }

    public final void setUseCaches(boolean z) {
        this.f38805a.f38808a.setUseCaches(z);
    }

    public final String toString() {
        return this.f38805a.toString();
    }

    public final boolean usingProxy() {
        return this.f38805a.f38808a.usingProxy();
    }

    public final Object getContent(Class[] clsArr) throws IOException {
        return this.f38805a.mo69230c(clsArr);
    }

    public final String getHeaderField(String str) {
        C17873e eVar = this.f38805a;
        eVar.mo69238i();
        return eVar.f38808a.getHeaderField(str);
    }

    public final void setFixedLengthStreamingMode(long j) {
        this.f38805a.f38808a.setFixedLengthStreamingMode(j);
    }
}
