package sportplace.su.sportplace_crm.ServerWorker;

import android.content.Intent;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

import javax.security.auth.callback.Callback;

import sportplace.su.sportplace_crm.MainActivity;

/**
 * Created by Admin on 08.08.2015.
 */
public class ServerWorker {
    public static void LogIn (String email, String password, LogInCallback complete){
        ParseUser.logInInBackground(email, password, complete);
    }
}
