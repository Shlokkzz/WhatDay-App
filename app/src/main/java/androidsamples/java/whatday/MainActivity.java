package androidsamples.java.whatday;

import static androidsamples.java.whatday.DateModel.getMessage;
import static androidsamples.java.whatday.DateModel.initialize;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  private static final String TAG = "MainActivity";
  // views
  private EditText editDate;
  private EditText editMonth;
  private EditText editYear;
  private Button btn_check;
  private TextView txt_output;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // views
    editDate = findViewById(R.id.editDate);
    editMonth = findViewById(R.id.editMonth);
    editYear = findViewById(R.id.editYear);
    btn_check = findViewById(R.id.btn_check);
    txt_output = findViewById(R.id.txt_display);

    // btn listener
    btn_check.setOnClickListener(v->{
      String year=editYear.getText().toString();
      String month=editMonth.getText().toString();
      String date=editDate.getText().toString();
      // init
      initialize(year,month,date);
      // display output
      txt_output.setText(getMessage());
    });

  }
}