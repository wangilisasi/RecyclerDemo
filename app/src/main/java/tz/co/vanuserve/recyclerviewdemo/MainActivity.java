package tz.co.vanuserve.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create players models
        PlayerModel mayele=new PlayerModel(R.drawable.mayele,"Fiston Mayele");
        PlayerModel fei_toto=new PlayerModel(R.drawable.fei_toto,"Fei Toto");
        PlayerModel djuma=new PlayerModel(R.drawable.djuma,"Djuma Shabani");
        PlayerModel moloko=new PlayerModel(R.drawable.moloko,"Jesus Moloko");
        PlayerModel makambo =new PlayerModel(R.drawable.makambo,"H Makambo");

        // Create an arraylist of Player Models
        List<PlayerModel> players=new ArrayList<>();
        players.add(mayele);
        players.add(djuma);
        players.add(moloko);
        players.add(makambo);
        players.add(fei_toto);

        //Create recyclerview and adapter

        RecyclerView playersRecycler=findViewById(R.id.players_recycler);
        playersRecycler.setLayoutManager(new LinearLayoutManager(this));
        PlayersAdapter playersAdapter=new PlayersAdapter(players);
        playersRecycler.setAdapter(playersAdapter);

    }
}