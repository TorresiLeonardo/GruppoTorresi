package itts.volta.quintocinf.gruppotrrcprbrd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Toast toast = Toast.makeText(getApplicationContext(),"Torresi",Toast. LENGTH_SHORT);
        toast.show();
        
    }

}
