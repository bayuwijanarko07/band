package com.dicoding.band;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBand;

    private ArrayList<Band> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBand = findViewById(R.id.rv_band);
        rvBand.setHasFixedSize(true);

        list.addAll(BandData.getListData());
        showRecyclerList();
    }


    private void showRecyclerList() {
        rvBand.setLayoutManager(new LinearLayoutManager(this));
        ListBandAdapter listBandAdapter = new ListBandAdapter(list);
        rvBand.setAdapter(listBandAdapter);

        listBandAdapter.setOnItemClickCallback(new ListBandAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Band data) {
                showSelectedBand(data);
            }
        });
    }

    private void showSelectedBand(Band band) {
        Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);

        moveIntent.putExtra(DetailActivity.EXTRA_NAME, band.getName());
        moveIntent.putExtra(DetailActivity.EXTRA_PHO, band.getPhoto());
        moveIntent.putExtra(DetailActivity.EXTRA_DETAIL, band.getDetail());
        startActivity(moveIntent);

        Toast.makeText(this, "Kamu memilih " + band.getName(), Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menu1) {
            Toast.makeText(this, "Tambah Data",
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this,AboutActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
