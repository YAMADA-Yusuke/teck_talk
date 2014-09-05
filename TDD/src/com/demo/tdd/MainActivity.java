
package com.demo.tdd;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.demo.exception.IllegalVariableException;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * 引数で渡した時間帯の挨拶を返すメソッド.
     *
     * @param hourStr 時間(0 - 23)
     * @return hourStr < 0 : ""<br>
     *         hourStr = 0 - 4 : こんばんは<br>
     *         hourStr = 5 - 11 : おはようございます<br>
     *         hourStr = 12 - 18 : こんにちは<br>
     *         hourStr = 19 - 23 : こんばんは<br>
     *         hourStr > 23 : ""
     * @throws IllegalVariableException
     */
    public String getGreets1(String hour) throws IllegalVariableException {
        return null;
    }

    /**
     * 引数で渡した時間帯の挨拶を返すメソッド.
     *
     * @param hourStr 時間(0 - 23)
     * @return hourStr < 0 : ""<br>
     *         hourStr = 0 - 4 : こんばんは<br>
     *         hourStr = 5 - 11 : おはようございます<br>
     *         hourStr = 12 - 18 : こんにちは<br>
     *         hourStr = 19 - 23 : こんばんは<br>
     *         hourStr > 23 : ""
     * @throws IllegalVariableException
     */
    public String getGreets(String hourStr) throws IllegalVariableException {
        // 引数で渡された時間をString型からint型に変換
        int hour = Integer.parseInt(hourStr);

        // 時間に合わせて挨拶の文字列を返す
        String greetMsg = "";
        if (hour < 0 || 23 < hour) {
            ;
        } else if (hour < 5) {
            greetMsg = "こんばんは";
        } else if (hour < 12) {
            greetMsg = "おはようございます";
        } else if (hour < 19) {
            greetMsg = "こんにちは";
        } else if (hour < 24) {
            greetMsg = "こんばんは";
        }
        return greetMsg;
    }

    /**
     * 引数で渡した時間帯の挨拶を返すメソッド.
     *
     * @param hourStr 時間(0 - 23)
     * @return hourStr < 0 : ""<br>
     *         hourStr = 0 - 4 : こんばんは<br>
     *         hourStr = 5 - 11 : おはようございます<br>
     *         hourStr = 12 - 18 : こんにちは<br>
     *         hourStr = 19 - 23 : こんばんは<br>
     *         hourStr > 23 : ""
     * @throws IllegalVariableException
     */
    public String getGreets3(String hourStr) throws IllegalVariableException {
        // nullチェック
        if (hourStr == null) {
            throw new IllegalVariableException();
        }

        // 引数で渡された時間をString型からint型に変換
        int hour = -1;
        try {
            hour = Integer.parseInt(hourStr);
        } catch (ClassCastException e) {
            throw new IllegalVariableException();
        }

        // 時間に合わせて挨拶の文字列を返す
        String greetMsg = "";
        if (hour < 0 || 23 < hour) {
            ;
        } else if (hour < 5) {
            greetMsg = "こんばんは";
        } else if (hour < 12) {
            greetMsg = "おはようございます";
        } else if (hour < 19) {
            greetMsg = "こんにちは";
        } else if (hour < 24) {
            greetMsg = "こんばんは";
        }
        return greetMsg;
    }
}
