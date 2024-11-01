package br.com.etecia.funkopop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Funkopops> lstFunkopops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lstFunkopops = new ArrayList<>();
        lstFunkopops.add(new Funkopops("Gon",R.drawable.gon)  );
        lstFunkopops.add(new Funkopops("Meruem",R.drawable.meruem)  );
        lstFunkopops.add(new Funkopops("Huguinho",R.drawable.huguinho)  );
        lstFunkopops.add(new Funkopops("Mercury",R.drawable.mercury)  );
        lstFunkopops.add(new Funkopops("Pica-Pau",R.drawable.picapau)  );
        lstFunkopops.add(new Funkopops("Lufy",R.drawable.lufy)  );
        lstFunkopops.add(new Funkopops("Capitão América",R.drawable.capitao)  );
        lstFunkopops.add(new Funkopops("Lason",R.drawable.jason)  );
        lstFunkopops.add(new Funkopops("MewTwo",R.drawable.mewtwo)  );
        lstFunkopops.add(new Funkopops("Micheal Myers",R.drawable.michealmyers)  );
        lstFunkopops.add(new Funkopops("Ekko",R.drawable.ekko)  );
        lstFunkopops.add(new Funkopops("MCcree",R.drawable.mccree)  );
        lstFunkopops.add(new Funkopops("Zoro",R.drawable.zoro)  );
        lstFunkopops.add(new Funkopops("Goku",R.drawable.goku)  );
        lstFunkopops.add(new Funkopops("Gojo",R.drawable.gojo)  );
        lstFunkopops.add(new Funkopops("Homem Aranha",R.drawable.homemaranha)  );
        lstFunkopops.add(new Funkopops("Geralt de Rivia",R.drawable.geraltderivia)  );
        lstFunkopops.add(new Funkopops("Velho Joseph",R.drawable.joseshvelho)  );
        lstFunkopops.add(new Funkopops("Spike",R.drawable.spike)  );
        lstFunkopops.add(new Funkopops("Killua",R.drawable.killua)  );





        recyclerView = findViewById(R.id.idRecFunkopop);
        Adaptador adaptador = new Adaptador(getApplicationContext(), lstFunkopops);

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        recyclerView.hasFixedSize();
        recyclerView.setAdapter(adaptador);

    }
}