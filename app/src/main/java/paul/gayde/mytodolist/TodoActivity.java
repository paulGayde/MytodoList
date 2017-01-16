package paul.gayde.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by gaydep on 16/01/2017.
 */
public class TodoActivity extends Activity implements View.OnClickListener {
    private Button btnValider;
    private Button btnVider;
    private TextView textViewTodoList;
    private EditText editTextTodoList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        btnValider = (Button) findViewById(R.id.btnValider);
        btnValider.setOnClickListener(this);

        btnVider = (Button) findViewById(R.id.btnViderList);
        btnVider.setOnClickListener(this);

        textViewTodoList=(TextView)findViewById(R.id.textViewTodoList);

        editTextTodoList=(EditText) findViewById(R.id.editTextTodoList);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.btnValider){
            String MyActivity = String.valueOf(editTextTodoList.getText());
            String MyActivities = String.valueOf(textViewTodoList.getText());

            textViewTodoList.setText(MyActivities+"\n"+ MyActivity);

        }

        if(v.getId()== R.id.btnViderList){
            textViewTodoList.setText("");
        }
    }
}
