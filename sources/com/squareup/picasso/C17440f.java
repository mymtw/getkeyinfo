package com.squareup.picasso;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.etsy.android.lib.models.ResponseConstants;

/* renamed from: com.squareup.picasso.f */
public final class C17440f extends C17462u {

    /* renamed from: b */
    public static final UriMatcher f38103b;

    /* renamed from: a */
    public final Context f38104a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f38103b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public C17440f(Context context) {
        this.f38104a = context;
    }

    /* renamed from: b */
    public final boolean mo68565b(C17459s sVar) {
        Uri uri = sVar.f38149c;
        return ResponseConstants.CONTENT.equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f38103b.match(sVar.f38149c) != -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.picasso.C17462u.C17463a mo68566e(com.squareup.picasso.C17459s r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            android.content.Context r6 = r4.f38104a
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.f38149c
            android.content.UriMatcher r0 = f38103b
            int r0 = r0.match(r5)
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x002d
            r3 = 2
            if (r0 == r3) goto L_0x0028
            r3 = 3
            if (r0 == r3) goto L_0x0035
            r1 = 4
            if (r0 != r1) goto L_0x001c
            goto L_0x0028
        L_0x001c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid uri: "
            java.lang.String r5 = android.support.p013v4.media.C0073e.m206f(r0, r5)
            r6.<init>(r5)
            throw r6
        L_0x0028:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L_0x0039
        L_0x002d:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L_0x0035
            r5 = r2
            goto L_0x0039
        L_0x0035:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r1)
        L_0x0039:
            if (r5 != 0) goto L_0x003c
            return r2
        L_0x003c:
            com.squareup.picasso.u$a r6 = new com.squareup.picasso.u$a
            lr.q r5 = p756lr.C19906r.m34002f(r5)
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C17440f.mo68566e(com.squareup.picasso.s, int):com.squareup.picasso.u$a");
    }
}
