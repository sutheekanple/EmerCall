package masterple.snru.sc.th.emercall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import masterple.snru.sc.th.emercall.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//    Add Fragment
            if (savedInstanceState == null) {

                getSupportFragmentManager().beginTransaction()
                        .add(R.id.contentMainFeagment, new MainFragment()).commit();


        }


}  //Main Method

}// Main Class
