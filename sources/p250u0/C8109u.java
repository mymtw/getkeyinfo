package p250u0;

import android.app.Person;
import android.app.Person$Builder;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;

/* renamed from: u0.u */
public final class C8109u {

    /* renamed from: a */
    public CharSequence f17701a;

    /* renamed from: b */
    public String f17702b;

    /* renamed from: c */
    public String f17703c;

    /* renamed from: d */
    public boolean f17704d;

    /* renamed from: e */
    public boolean f17705e;

    /* renamed from: u0.u$a */
    public static class C8110a {

        /* renamed from: a */
        public CharSequence f17706a;

        /* renamed from: b */
        public String f17707b;

        /* renamed from: c */
        public String f17708c;

        /* renamed from: d */
        public boolean f17709d;

        /* renamed from: e */
        public boolean f17710e;
    }

    public C8109u(C8110a aVar) {
        this.f17701a = aVar.f17706a;
        this.f17702b = aVar.f17707b;
        this.f17703c = aVar.f17708c;
        this.f17704d = aVar.f17709d;
        this.f17705e = aVar.f17710e;
    }

    /* renamed from: a */
    public final Person mo20703a() {
        return new Person$Builder().setName(this.f17701a).setIcon((Icon) null).setUri(this.f17702b).setKey(this.f17703c).setBot(this.f17704d).setImportant(this.f17705e).build();
    }

    /* renamed from: b */
    public final Bundle mo20704b() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f17701a);
        bundle.putBundle(ResponseConstants.ICON, (Bundle) null);
        bundle.putString(Constants.APPBOY_PUSH_DEEP_LINK_KEY, this.f17702b);
        bundle.putString("key", this.f17703c);
        bundle.putBoolean("isBot", this.f17704d);
        bundle.putBoolean("isImportant", this.f17705e);
        return bundle;
    }
}
