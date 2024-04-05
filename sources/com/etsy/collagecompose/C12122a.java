package com.etsy.collagecompose;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.etsy.collagecompose.a */
public abstract class C12122a {

    /* renamed from: com.etsy.collagecompose.a$a */
    public static final class C12123a extends C12122a {

        /* renamed from: a */
        public final String f27062a;

        /* renamed from: b */
        public final C19846a<C19394m> f27063b;

        public C12123a(String str, C19846a<C19394m> aVar) {
            C19383o.m32797g(str, "text");
            C19383o.m32797g(aVar, "onClick");
            this.f27062a = str;
            this.f27063b = aVar;
        }

        /* renamed from: a */
        public final C19846a<C19394m> mo39054a() {
            return this.f27063b;
        }

        /* renamed from: b */
        public final String mo39055b() {
            return this.f27062a;
        }
    }

    /* renamed from: com.etsy.collagecompose.a$b */
    public static final class C12124b extends C12122a {

        /* renamed from: a */
        public final C19846a<C19394m> f27064a;

        public C12124b(C19846a<C19394m> aVar) {
            C19383o.m32797g(aVar, "onClick");
            this.f27064a = aVar;
        }

        /* renamed from: a */
        public final C19846a<C19394m> mo39056a() {
            return this.f27064a;
        }
    }

    /* renamed from: com.etsy.collagecompose.a$c */
    public static final class C12125c extends C12122a {

        /* renamed from: a */
        public final String f27065a;

        /* renamed from: b */
        public final C19846a<C19394m> f27066b;

        public C12125c(String str, C19846a<C19394m> aVar) {
            C19383o.m32797g(str, "text");
            C19383o.m32797g(aVar, "onClick");
            this.f27065a = str;
            this.f27066b = aVar;
        }

        /* renamed from: a */
        public final C19846a<C19394m> mo39057a() {
            return this.f27066b;
        }

        /* renamed from: b */
        public final String mo39058b() {
            return this.f27065a;
        }
    }
}
