package moe.akagi.calculatordemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

/**
 * Created by myz on 2015/8/3.
 */
public class GridLayoutClass extends Activity {
    GridLayout gridLayout;
    String[] chars = new String[] {
            "7", "8", "9", "÷",
            "4", "5", "6", "×",
            "1", "2", "3", "-",
            ".", "0", "=", "+"
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        gridLayout = (GridLayout) findViewById(R.id.root);
        for (int i = 0; i < chars.length; i++) {
            Button bn = new Button(this);
            bn.setText(chars[i]);
            bn.setTextSize(40);
            GridLayout.Spec rowSpec = GridLayout.spec(i / 4 + 2);
            GridLayout.Spec columnSpec = GridLayout.spec(i % 4);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, columnSpec);
            params.setGravity(Gravity.FILL);
            gridLayout.addView(bn, params);
        }
    }
}
