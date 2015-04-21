package edu.washington.xyju.lifecounter;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {

    @Override
    public void onConfigurationChanged(Configuration config) {
        try{
            super.onConfigurationChanged(config);
            if(this.getResources().getConfiguration().orientation ==
                    Configuration.ORIENTATION_LANDSCAPE){
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            } else if(this.getResources().getConfiguration().orientation ==
                    Configuration.ORIENTATION_PORTRAIT) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }
        } catch(Exception ex) {

        }
    }

    class Player {
        Button plus;
        Button minus;
        Button plusFive;
        Button minusFive;
    }

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text;
    Button add;
    LinearLayout layout3;
    LinearLayout layout4;
    LinearLayout layout5;
    LinearLayout layout6;
    LinearLayout layout7;
    LinearLayout layout8;
    View.OnClickListener btnListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            int number = 3;
            @Override
            public void onClick(View v) {
                switch(number) {
                    case 3:
                        text3.setVisibility(View.VISIBLE);
                        layout3.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        text4.setVisibility(View.VISIBLE);
                        layout4.setVisibility(View.VISIBLE);
                        break;
                    case 5:
                        text5.setVisibility(View.VISIBLE);
                        layout5.setVisibility(View.VISIBLE);
                        break;
                    case 6:
                        text6.setVisibility(View.VISIBLE);
                        layout6.setVisibility(View.VISIBLE);
                        break;
                    case 7:
                        text7.setVisibility(View.VISIBLE);
                        layout7.setVisibility(View.VISIBLE);
                        break;
                    case 8:
                        text8.setVisibility(View.VISIBLE);
                        layout8.setVisibility(View.VISIBLE);
                        break;
                }
                number++;
            }
        });

        btnListener = new View.OnClickListener() {
            int count1 = 20;
            int count2 = 20;
            int count3 = 20;
            int count4 = 20;
            int count5 = 20;
            int count6 = 20;
            int count7 = 20;
            int count8 = 20;
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.plus1:
                        count1 += 1;
                        break;
                    case R.id.plus2:
                        count2 += 1;
                        break;
                    case R.id.plus3:
                        count3 += 1;
                        break;
                    case R.id.plus4:
                        count4 += 1;
                        break;
                    case R.id.plus5:
                        count5 += 1;
                        break;
                    case R.id.plus6:
                        count6 += 1;
                        break;
                    case R.id.plus7:
                        count7 += 1;
                        break;
                    case R.id.plus8:
                        count8 += 1;
                        break;
                    case R.id.minus1:
                        count1 -= 1;
                        break;
                    case R.id.minus2:
                        count2 -= 1;
                        break;
                    case R.id.minus3:
                        count3 -= 1;
                        break;
                    case R.id.minus4:
                        count4 -= 1;
                        break;
                    case R.id.minus5:
                        count5 -= 1;
                        break;
                    case R.id.minus6:
                        count6 -= 1;
                        break;
                    case R.id.minus7:
                        count7 -= 1;
                        break;
                    case R.id.minus8:
                        count8 -= 1;
                        break;
                    case R.id.plusFive1:
                        count1 += 5;
                        break;
                    case R.id.plusFive2:
                        count2 += 5;
                        break;
                    case R.id.plusFive3:
                        count3 += 5;
                        break;
                    case R.id.plusFive4:
                        count4 += 5;
                        break;
                    case R.id.plusFive5:
                        count5 += 5;
                        break;
                    case R.id.plusFive6:
                        count6 += 5;
                        break;
                    case R.id.plusFive7:
                        count7 += 5;
                        break;
                    case R.id.plusFive8:
                        count8 += 5;
                        break;
                    case R.id.minusFive1:
                        count1 -= 5;
                        break;
                    case R.id.minusFive2:
                        count2 -= 5;
                        break;
                    case R.id.minusFive3:
                        count3 -= 5;
                        break;
                    case R.id.minusFive4:
                        count4 -= 5;
                        break;
                    case R.id.minusFive5:
                        count5 -= 5;
                        break;
                    case R.id.minusFive6:
                        count6 -= 5;
                        break;
                    case R.id.minusFive7:
                        count7 -= 5;
                        break;
                    case R.id.minusFive8:
                        count8 -= 5;
                        break;

                }
                text1.setText("Player 1 : " + count1);
                text2.setText("Player 2 : " + count2);
                text3.setText("Player 3 : " + count3);
                text4.setText("Player 4 : " + count4);
                text5.setText("Player 5 : " + count5);
                text6.setText("Player 6 : " + count6);
                text7.setText("Player 7 : " + count7);
                text8.setText("Player 8 : " + count8);

                if(count1 <= 0){
                    text1.setText("Player 1 loses!");
                    text1.setTextColor(Color.RED);
                    text.setText("Player 1 loses!");
                }
                if(count2 <= 0){
                    text2.setText("Player 2 loses!");
                    text2.setTextColor(Color.RED);
                    text.setText("Player 2 loses!");
                }
                if(count3 <= 0){
                    text3.setText("Player 3 loses!");
                    text3.setTextColor(Color.RED);
                    text.setText("Player 3 loses!");
                }
                if(count4 <= 0){
                    text4.setText("Player 4 loses!");
                    text4.setTextColor(Color.RED);
                    text.setText("Player 4 loses!");
                }
                if(count5 <= 0){
                    text5.setText("Player 5 loses!");
                    text5.setTextColor(Color.RED);
                    text.setText("Player 5 loses!");
                }
                if(count6 <= 0){
                    text6.setText("Player 6 loses!");
                    text6.setTextColor(Color.RED);
                    text.setText("Player 6 loses!");
                }
                if(count7 <= 0){
                    text7.setText("Player 7 loses!");
                    text7.setTextColor(Color.RED);
                    text.setText("Player 7 loses!");
                }
                if(count8 <= 0){
                    text8.setText("Player 8 loses!");
                    text8.setTextColor(Color.RED);
                    text.setText("Player 8 loses!");
                }
            }
        };

        text1 = (TextView)findViewById(R.id.Player1);
        text2 = (TextView)findViewById(R.id.Player2);
        text3 = (TextView)findViewById(R.id.Player3);
        text4 = (TextView)findViewById(R.id.Player4);
        text5 = (TextView)findViewById(R.id.Player5);
        text6 = (TextView)findViewById(R.id.Player6);
        text7 = (TextView)findViewById(R.id.Player7);
        text8 = (TextView)findViewById(R.id.Player8);
        text = (TextView)findViewById(R.id.lose);

        layout3 = (LinearLayout)findViewById(R.id.layout3);
        layout4 = (LinearLayout)findViewById(R.id.layout4);
        layout5 = (LinearLayout)findViewById(R.id.layout5);
        layout6 = (LinearLayout)findViewById(R.id.layout6);
        layout7 = (LinearLayout)findViewById(R.id.layout7);
        layout8 = (LinearLayout)findViewById(R.id.layout8);

        Player player1 = new Player();
        player1.plus = (Button)findViewById(R.id.plus1);
        player1.minus = (Button)findViewById(R.id.minus1);
        player1.plusFive = (Button)findViewById(R.id.plusFive1);
        player1.minusFive = (Button)findViewById(R.id.minusFive1);
        player1.plus.setOnClickListener(btnListener);
        player1.minus.setOnClickListener(btnListener);
        player1.plusFive.setOnClickListener(btnListener);
        player1.minusFive.setOnClickListener(btnListener);

        Player player2 = new Player();
        player2.plus = (Button)findViewById(R.id.plus2);
        player2.minus = (Button)findViewById(R.id.minus2);
        player2.plusFive = (Button)findViewById(R.id.plusFive2);
        player2.minusFive = (Button)findViewById(R.id.minusFive2);
        player2.plus.setOnClickListener(btnListener);
        player2.minus.setOnClickListener(btnListener);
        player2.plusFive.setOnClickListener(btnListener);
        player2.minusFive.setOnClickListener(btnListener);

        Player player3 = new Player();
        player3.plus = (Button)findViewById(R.id.plus3);
        player3.minus = (Button)findViewById(R.id.minus3);
        player3.plusFive = (Button)findViewById(R.id.plusFive3);
        player3.minusFive = (Button)findViewById(R.id.minusFive3);
        player3.plus.setOnClickListener(btnListener);
        player3.minus.setOnClickListener(btnListener);
        player3.plusFive.setOnClickListener(btnListener);
        player3.minusFive.setOnClickListener(btnListener);

        Player player4 = new Player();
        player4.plus = (Button)findViewById(R.id.plus4);
        player4.minus = (Button)findViewById(R.id.minus4);
        player4.plusFive = (Button)findViewById(R.id.plusFive4);
        player4.minusFive = (Button)findViewById(R.id.minusFive4);
        player4.plus.setOnClickListener(btnListener);
        player4.minus.setOnClickListener(btnListener);
        player4.plusFive.setOnClickListener(btnListener);
        player4.minusFive.setOnClickListener(btnListener);

        Player player5 = new Player();
        player5.plus = (Button)findViewById(R.id.plus5);
        player5.minus = (Button)findViewById(R.id.minus5);
        player5.plusFive = (Button)findViewById(R.id.plusFive5);
        player5.minusFive = (Button)findViewById(R.id.minusFive5);
        player5.plus.setOnClickListener(btnListener);
        player5.minus.setOnClickListener(btnListener);
        player5.plusFive.setOnClickListener(btnListener);
        player5.minusFive.setOnClickListener(btnListener);

        Player player6 = new Player();
        player6.plus = (Button)findViewById(R.id.plus6);
        player6.minus = (Button)findViewById(R.id.minus6);
        player6.plusFive = (Button)findViewById(R.id.plusFive6);
        player6.minusFive = (Button)findViewById(R.id.minusFive6);
        player6.plus.setOnClickListener(btnListener);
        player6.minus.setOnClickListener(btnListener);
        player6.plusFive.setOnClickListener(btnListener);
        player6.minusFive.setOnClickListener(btnListener);

        Player player7 = new Player();
        player7.plus = (Button)findViewById(R.id.plus7);
        player7.minus = (Button)findViewById(R.id.minus7);
        player7.plusFive = (Button)findViewById(R.id.plusFive7);
        player7.minusFive = (Button)findViewById(R.id.minusFive7);
        player7.plus.setOnClickListener(btnListener);
        player7.minus.setOnClickListener(btnListener);
        player7.plusFive.setOnClickListener(btnListener);
        player7.minusFive.setOnClickListener(btnListener);

        Player player8 = new Player();
        player8.plus = (Button)findViewById(R.id.plus8);
        player8.minus = (Button)findViewById(R.id.minus8);
        player8.plusFive = (Button)findViewById(R.id.plusFive8);
        player8.minusFive = (Button)findViewById(R.id.minusFive8);
        player8.plus.setOnClickListener(btnListener);
        player8.minus.setOnClickListener(btnListener);
        player8.plusFive.setOnClickListener(btnListener);
        player8.minusFive.setOnClickListener(btnListener);

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
