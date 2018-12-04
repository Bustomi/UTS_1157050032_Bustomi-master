package apps.bustomi.uts.matchfootbalapps.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import apps.bustomi.uts.matchfootbalapps.R;
import apps.bustomi.uts.matchfootbalapps.adapter.MatchAdapter;
import apps.bustomi.uts.matchfootbalapps.model.MatchModel;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MatchActivity extends AppCompatActivity {

    @BindView(R.id.rv_pertandingan)
    RecyclerView mRecyclerView;
    MatchAdapter mAdapter;
    ArrayList<MatchModel> listMatch = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        ButterKnife.bind(this);

        Toolbar toolbar = findViewById(R.id.toolbar); //Inisialisasi dan Implementasi id Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("List Pertandingan");

        listMatch.add(new MatchModel("Persib", "Persija", "0", "3", "Pertandingan ini Dilaksanakan di stadion Bandung lautan API", R.drawable.persib, R.drawable.persija, "https://www.liputan6.com/tag/persib-vs-persija"));
        listMatch.add(new MatchModel("Persija", "Persib", "4", "3", "Pertandingan ini Dilaksanakan di Stadion Bandung lautan API", R.drawable.persija, R.drawable.persib, "https://bola.kompas.com/read/2018/10/28/17365138/hasil-arema-fc-vs-psms-singo-edan-pesta-gol-mitra-kukar-atasi-psis"));
        listMatch.add(new MatchModel("Persib", "Persija", "0", "1", "Pertandingan ini Dilaksanakan di stadion Sijalak Harupat", R.drawable.persib, R.drawable.persija, "http://www.pikiran-rakyat.com/persib/2018/11/02/dijadwal-ulang-persib-bandung-vs-psms-medan-maju-dua-hari-432590"));
        listMatch.add(new MatchModel("Persija", "Persib", "2", "1", "Pertandingan ini Dilaksanakan di stadion Glora Bungkarno", R.drawable.persija, R.drawable.persib, "https://www.liputan6.com/tag/persija-vs-sriwijaya-fc"));
        listMatch.add(new MatchModel("Persib", "Persija", "3", "3", "Pertandingan ini Dilaksanakan di stadion Glora Bungkarno", R.drawable.persib, R.drawable.persija, "https://www.bola.com/indonesia/read/3596062/arema-fc-bantai-sriwijaya-fc/page-1"));

        mRecyclerView = findViewById(R.id.rv_pertandingan);
        mAdapter = new MatchAdapter(MatchActivity.this, listMatch);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

