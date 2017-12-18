package dhruvam.olaapplication.Activity;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;


import dhruvam.olaapplication.R;

public class StartActivity extends AppCompatActivity {
    private static final String TAG = StartActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.songs_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        /*MyApiEndpointInterface apiService =
                RetrofitInstance.getClient().create(MyApiEndpointInterface.class);

        Call<SongListResponse> call = apiService.getSongList();

        call.enqueue(new Callback<SongListResponse>() {
            @Override
            public void onResponse(@NonNull Call<SongListResponse> call, @NonNull Response<SongListResponse> response) {
                List<Example> movies = response.body().getResults();
                Log.d(TAG, "Number of movies received: " + movies.size());
            }

            @Override
            public void onFailure(Call<SongListResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }


        });*/

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(StartActivity.this, "Hello World", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
