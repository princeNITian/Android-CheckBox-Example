package example.com.prince.usamp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox coffee,pizza,burger;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){
    // Getting instance of CheckBox and Button from activity_main.xml file.
        coffee = findViewById(R.id.checkBox2);
        pizza = findViewById(R.id.checkBox);
        burger = findViewById(R.id.checkBox3);
        buttonOrder = findViewById(R.id.button);

    // Applying the Listener on button Click
        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalAmount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items: ");
                if(pizza.isChecked()) {
                    totalAmount += 500;
                    result.append("\nPizza 500 Rs.");
                }
                    if (coffee.isChecked()) {
                        totalAmount += 100;
                        result.append("\nCoffee 100 Rs.");
                    }
                    if (burger.isChecked()) {
                        totalAmount += 250;
                        result.append("\nBurger 250 Rs.");
                    }

                    result.append("\nTotal amount: "+totalAmount+" Rs.");
                //Displaying the message on Toast
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
                }
        });

    }
}
