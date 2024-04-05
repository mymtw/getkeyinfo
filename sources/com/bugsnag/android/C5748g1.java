package com.bugsnag.android;

import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import p001a0.C0005b;

/* renamed from: com.bugsnag.android.g1 */
public final class C5748g1 extends C5754h1 {

    /* renamed from: i */
    public final C5923v1 f12257i;

    /* renamed from: j */
    public final Writer f12258j;

    /* renamed from: com.bugsnag.android.g1$a */
    public interface C5749a {
        void toStream(C5748g1 g1Var) throws IOException;
    }

    public C5748g1(BufferedWriter bufferedWriter) {
        super(bufferedWriter);
        this.f12283g = false;
        this.f12258j = bufferedWriter;
        this.f12257i = new C5923v1();
    }

    /* renamed from: B */
    public final void mo16514B(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f12282f != null) {
            throw new IllegalStateException();
        } else if (this.f12280d != 0) {
            this.f12282f = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: G */
    public final void mo16515G(File file) throws IOException {
        BufferedReader bufferedReader;
        Throwable th;
        if (file != null && file.length() > 0) {
            flush();
            mo16519a();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                try {
                    Writer writer = this.f12258j;
                    char[] cArr = new char[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];
                    while (true) {
                        int read = bufferedReader.read(cArr);
                        if (-1 != read) {
                            writer.write(cArr, 0, read);
                        } else {
                            C0005b.m25S(bufferedReader);
                            this.f12258j.flush();
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C0005b.m25S(bufferedReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                C0005b.m25S(bufferedReader);
                throw th;
            }
        }
    }

    /* renamed from: M */
    public final void mo16516M(Object obj, boolean z) throws IOException {
        if (obj instanceof C5749a) {
            ((C5749a) obj).toStream(this);
        } else {
            this.f12257i.mo16692a(obj, this, z);
        }
    }

    public C5748g1(C5748g1 g1Var, C5923v1 v1Var) {
        super(g1Var.f12258j);
        this.f12283g = g1Var.f12283g;
        this.f12258j = g1Var.f12258j;
        this.f12257i = v1Var;
    }
}
