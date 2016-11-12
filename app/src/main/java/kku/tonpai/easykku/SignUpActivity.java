package kku.tonpai.easykku;

import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpActivity extends AppCompatActivity {


    //Explicit
    private EditText nameEditText, phoneEditText, userEditText,passwordEditText;
    private ImageView imageView;
    private Button button;
    private String nameString, phoneString,userString,passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //bindWidget
        nameEditText = (EditText) findViewById(R.id.editText5);
        phoneEditText = (EditText)findViewById(R.id.editText4);
        userEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText =(EditText)findViewById(R.id.editText2);
        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button3);

        //SignUp Controller
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get Value from EditText
                nameString = nameEditText.getText().toString().trim();
                phoneString = phoneEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                //Check Space
                if(nameString.equals("") || phoneString.equals("")||userString.equals("")
                        ||passwordString.equals("")){
                    //have space
                    Log.d("12novV1", "Have Space");
                    MyAlert myAlert = new MyAlert(SignUpActivity.this,R.drawable.doremon48,
                            "มีช่องว่าง","กรุณากรอกให้ครบทุกช่องค่ะ");
                    myAlert.myDialog();
                }

            }//onClick
        });
    }//Main Method



}//Main Class
