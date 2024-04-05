package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.android.play.core.appupdate.C15567i;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import p081d6.C6663b;
import p081d6.C6665d;
import p081d6.C6668g;
import p244t5.C7976f0;
import p244t5.C7983h0;
import p244t5.C7984h1;
import p244t5.C7996l1;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p295y7.C8397a;
import p295y7.C8399c;
import p304z6.C8456a;
import p304z6.C8457b;

public class PKIXCertPath extends CertPath {

    /* renamed from: a */
    public static final List f13399a;

    /* renamed from: b */
    private final C8457b f13400b;

    /* renamed from: c */
    private List f13401c;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        f13399a = Collections.unmodifiableList(arrayList);
    }

    public PKIXCertPath(InputStream inputStream, String str) {
        super("X.509");
        C8456a aVar = new C8456a();
        this.f13400b = aVar;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7")) {
                    if (!str.equalsIgnoreCase("PEM")) {
                        throw new CertificateException("unsupported encoding: " + str);
                    }
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.f13401c = new ArrayList();
                CertificateFactory instance = CertificateFactory.getInstance("X.509", aVar.f18481a);
                while (true) {
                    Certificate generateCertificate = instance.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.f13401c.add(generateCertificate);
                }
            } else {
                C8018s1 h = new C7996l1(inputStream).mo20554h();
                if (h instanceof C8021t1) {
                    Enumeration w = ((C8021t1) h).mo20524w();
                    this.f13401c = new ArrayList();
                    CertificateFactory instance2 = CertificateFactory.getInstance("X.509", aVar.f18481a);
                    while (w.hasMoreElements()) {
                        this.f13401c.add(0, instance2.generateCertificate(new ByteArrayInputStream(((C7984h1) w.nextElement()).mo12996i().mo20561a("DER"))));
                    }
                } else {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
            }
            this.f13401c = m12355a(this.f13401c);
        } catch (IOException e) {
            StringBuilder h2 = C0072d.m201h("IOException throw while decoding CertPath:\n");
            h2.append(e.toString());
            throw new CertificateException(h2.toString());
        } catch (NoSuchProviderException e2) {
            StringBuilder h3 = C0072d.m201h("BouncyCastle provider not found while trying to get a CertificateFactory:\n");
            h3.append(e2.toString());
            throw new CertificateException(h3.toString());
        }
    }

    public PKIXCertPath(List list) {
        super("X.509");
        this.f13400b = new C8456a();
        this.f13401c = m12355a(new ArrayList(list));
    }

    /* renamed from: a */
    public static List m12355a(List list) {
        boolean z;
        boolean z2;
        if (list.size() < 2) {
            return list;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        int i = 1;
        while (true) {
            if (i != list.size()) {
                if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                    z = false;
                    break;
                }
                issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            int i3 = 0;
            while (true) {
                if (i3 == list.size()) {
                    z2 = false;
                    break;
                } else if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z2) {
                arrayList.add(x509Certificate);
                list.remove(i2);
            }
        }
        if (arrayList.size() > 1) {
            return arrayList2;
        }
        for (int i4 = 0; i4 != arrayList.size(); i4++) {
            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
            int i5 = 0;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                    arrayList.add(x509Certificate2);
                    list.remove(i5);
                    break;
                }
                i5++;
            }
        }
        return list.size() > 0 ? arrayList2 : arrayList;
    }

    /* renamed from: b */
    public static C8018s1 m12356b(X509Certificate x509Certificate) {
        try {
            return new C7996l1(x509Certificate.getEncoded()).mo20554h();
        } catch (Exception e) {
            StringBuilder h = C0072d.m201h("Exception while encoding certificate: ");
            h.append(e.toString());
            throw new CertificateEncodingException(h.toString());
        }
    }

    /* renamed from: c */
    public static byte[] m12357c(C8005o1 o1Var) {
        try {
            return o1Var.mo12996i().mo20561a("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: " + e);
        }
    }

    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.f13401c));
    }

    public byte[] getEncoded() {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    public byte[] getEncoded(String str) {
        if (str.equalsIgnoreCase("PkiPath")) {
            C15567i iVar = new C15567i(2);
            List list = this.f13401c;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                iVar.mo55343b(m12356b((X509Certificate) listIterator.previous()));
            }
            return m12357c(new C7976f0(iVar));
        }
        int i = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            C6663b bVar = new C6663b(C6665d.f14701r0, (C6668g) null);
            C15567i iVar2 = new C15567i(2);
            while (i != this.f13401c.size()) {
                iVar2.mo55343b(m12356b((X509Certificate) this.f13401c.get(i)));
                i++;
            }
            return m12357c(new C6663b(C6665d.f14702s0, new C6668g(new C7999m1(1), new C7983h0(), bVar, new C7983h0(iVar2), new C7983h0())));
        } else if (str.equalsIgnoreCase("PEM")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C8399c cVar = new C8399c(new OutputStreamWriter(byteArrayOutputStream));
            while (i != this.f13401c.size()) {
                try {
                    cVar.mo20977a(new C8397a(((X509Certificate) this.f13401c.get(i)).getEncoded()));
                    i++;
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            cVar.close();
            return byteArrayOutputStream.toByteArray();
        } else {
            throw new CertificateEncodingException(C0326j.m864i("unsupported encoding: ", str));
        }
    }

    public Iterator getEncodings() {
        return f13399a.iterator();
    }
}
