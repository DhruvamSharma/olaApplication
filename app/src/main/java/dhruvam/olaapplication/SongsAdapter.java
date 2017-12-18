package dhruvam.olaapplication;

/**
 * Created by Ritvik on 16-12-2017.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import dhruvam.olaapplication.model.Example;







    public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.MovieViewHolder> {

        private ArrayList<Example> dataList;

        public SongsAdapter(ArrayList<Example> dataList) {
            this.dataList = dataList;
        }


        @Override
        public MoviesAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(MoviesAdapter.MovieViewHolder holder, int position) {

        }

        @Override
        public void onBindViewHolder(EmployeeViewHolder holder, int position) {
            holder.txtEmpName.setText(dataList.get(position).getName());
            holder.txtEmpEmail.setText(dataList.get(position).getEmail());
            holder.txtEmpPhone.setText(dataList.get(position).getPhone());
        }

        @Override
        public int getItemCount() {
            return dataList.size();
        }

        class EmployeeViewHolder extends RecyclerView.ViewHolder {

            TextView txtEmpName, txtEmpEmail, txtEmpPhone;

            EmployeeViewHolder(View itemView) {
                super(itemView);
                txtEmpName = (TextView) itemView.findViewById(R.id.txt_employee_name);
                txtEmpEmail = (TextView) itemView.findViewById(R.id.txt_employee_email);
                txtEmpPhone = (TextView) itemView.findViewById(R.id.txt_employee_phone);
            }
        }

    }
