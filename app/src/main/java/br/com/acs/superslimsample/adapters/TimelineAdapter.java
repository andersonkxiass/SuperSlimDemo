package br.com.acs.superslimsample.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tonicartos.superslim.GridSLM;
import com.tonicartos.superslim.LayoutManager;
import com.tonicartos.superslim.LinearSLM;

import java.util.ArrayList;
import java.util.List;

import br.com.acs.superslimsample.R;
import br.com.acs.superslimsample.model.AdapterBaseRow;
import br.com.acs.superslimsample.model.AdapterRowHeader;
import br.com.acs.superslimsample.model.AdapterRowPicture;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.Optional;

public class TimelineAdapter extends RecyclerView.Adapter<TimelineAdapter.TimelineViewHolder> {

    public class TimelineViewHolder extends RecyclerView.ViewHolder{

        @InjectView(R.id.txt_header)
        @Optional
        TextView header;

        @InjectView(R.id.image)
        @Optional
        ImageView image;

        public TimelineViewHolder(View itemView) {
            super(itemView);

            ButterKnife.inject(this, itemView);
        }
    }

    List<AdapterBaseRow> adapterBaseRows = new ArrayList<>();

    private static final int VIEW_TYPE_HEADER = 0x01;
    private static final int VIEW_TYPE_CONTENT = 0x00;

    private static final int LINEAR = 0;
    private int sectionManager = 0;
    private Context mContext;

    public TimelineAdapter(List<AdapterBaseRow> adapterBaseRows ){
        this.adapterBaseRows = adapterBaseRows;
    }

    public void setSectionManager(int sectionManager){
        this.sectionManager = sectionManager;
    }

    @Override
    public TimelineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View mRoot;

        mContext = parent.getContext();

        if (viewType == VIEW_TYPE_HEADER) {
            mRoot = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_insta_header, parent, false);
        } else {
            mRoot = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_insta_item, parent, false);
        }

        return new TimelineViewHolder(mRoot);
    }

    @Override
    public int getItemViewType(int position) {
        return adapterBaseRows.get(position) instanceof AdapterRowHeader ? VIEW_TYPE_HEADER : VIEW_TYPE_CONTENT;
    }

    @Override
    public void onBindViewHolder(TimelineViewHolder holder, int position) {

        AdapterBaseRow wrapper = adapterBaseRows.get(position);

        final View itemView = holder.itemView;

        LayoutManager.LayoutParams params;

        float imageHeight;

        if(sectionManager == LINEAR){

            imageHeight = mContext.getResources().getDimension(R.dimen.list_item_height);

            params = (LayoutManager.LayoutParams) itemView.getLayoutParams();
            params.setSlm(LinearSLM.ID);

        }else {

            imageHeight = mContext.getResources().getDimension(R.dimen.grid_item_height);

            params = GridSLM.LayoutParams.from(itemView.getLayoutParams());
            params.setSlm(GridSLM.ID);

            ((GridSLM.LayoutParams)params ).setNumColumns(3);
            ((GridSLM.LayoutParams)params ).setColumnWidth(R.dimen.column_width);
        }

        if(wrapper instanceof AdapterRowHeader){

            AdapterRowHeader adapterRowHeader = (AdapterRowHeader) wrapper;

            holder.header.setText("" + adapterRowHeader.getUser().getName());

        } else {

            AdapterRowPicture adapterRowPicture = (AdapterRowPicture) wrapper;

            holder.image.getLayoutParams().height = (int)imageHeight;

            holder.image.setImageResource(adapterRowPicture.getImage().getPictureResource());
        }

        params.setFirstPosition(wrapper.sectionFirstPosition);
        itemView.setLayoutParams(params);
    }

    @Override
    public int getItemCount() {
        return adapterBaseRows.size();
    }
}