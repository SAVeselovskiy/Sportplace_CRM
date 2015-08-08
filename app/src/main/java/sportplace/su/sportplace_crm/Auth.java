package sportplace.su.sportplace_crm;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

import sportplace.su.sportplace_crm.ServerWorker.ServerWorker;
import sportplace.su.sportplace_crm.SupportingFiles.ProgressDialogFragment;

/**
 * Created by Admin on 06.08.2015.
 */
public class Auth extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Button authButton = (Button)findViewById(R.id.auth_button);
        final EditText email = (EditText)findViewById(R.id.editText2);
        final EditText password = (EditText)findViewById(R.id.password_auth);
        authButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialogFragment.showProgressDialog(getFragmentManager(),"Авторизация...",false);
                ServerWorker.LogIn(email.getText().toString(), password.getText().toString(), new LogInCallback() {
                    public void done(ParseUser user, ParseException e) {
                        ProgressDialogFragment.closeProgressDialogSuccessfully(getFragmentManager());
                        if (user != null) {
                            // Hooray! The user is logged in.
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        } else {
                            // Signup failed. Look at the ParseException to see what happened.
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    e.getMessage(), Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }
                });
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
