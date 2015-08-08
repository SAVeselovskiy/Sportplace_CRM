package sportplace.su.sportplace_crm;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Admin on 06.08.2015.
 */
public class SportplaceApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (!BuildConfig.DEBUG) {
            Fabric.with(this, new Crashlytics());
        }

        // Initialize Crash Reporting.
//    ParseCrashReporting.enable(this);


        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        // Add your initialization code here
        Parse.initialize(this, "OSOAgC3VltYk1w7hslj83PUguPq5kC7wSEFqAaaC", "A0ex2zIEFbv27vxsyupe71frkrEvxXeX7xAkmHWL");



//        ParseUser.enableAutomaticUser();
//        ParseACL defaultACL = new ParseACL();
//        // Optionally enable public read access.
//        // defaultACL.setPublicReadAccess(true);
//        ParseACL.setDefaultACL(defaultACL, true);
    }
}
