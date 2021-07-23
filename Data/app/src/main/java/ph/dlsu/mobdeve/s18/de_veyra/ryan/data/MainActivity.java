package ph.dlsu.mobdeve.s18.de_veyra.ryan.data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import ph.dlsu.mobdeve.s18.de_veyra.ryan.data.model.user;

public class MainActivity extends AppCompatActivity {

    private ArrayList<user> userList;
    private ActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_data);
    }
}