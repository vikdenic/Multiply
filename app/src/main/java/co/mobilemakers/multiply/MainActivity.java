package co.mobilemakers.multiply;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    TextView myTextView;
    EditText myTextField1;
    EditText myTextField2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = (TextView) findViewById(R.id.myTextView);
        myTextField1 = (EditText) findViewById(R.id.editText1);
        myTextField2 = (EditText) findViewById(R.id.editText2);
    }

    public void calculateProduct(View view) {
        Log.i("listening", "button");
        Log.i("editText1", myTextField1.getText().toString());
        Log.i("editText2", myTextField2.getText().toString());
        int number1 = Integer.parseInt(myTextField1.getText().toString());
        int number2 = Integer.parseInt(myTextField1.getText().toString());
        int result = number1 * number2;
        myTextView.setText(String.valueOf(result));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
