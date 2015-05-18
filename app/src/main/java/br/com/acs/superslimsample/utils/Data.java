package br.com.acs.superslimsample.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.acs.superslimsample.R;
import br.com.acs.superslimsample.model.AdapterBaseRow;
import br.com.acs.superslimsample.model.AdapterRowHeader;
import br.com.acs.superslimsample.model.AdapterRowPicture;
import br.com.acs.superslimsample.model.Picture;
import br.com.acs.superslimsample.model.User;

public class Data {

    int sectionManager = -1;
    int headerCount = 0;
    int sectionFirstPosition = 0;
    int id = -1;

    public  List<AdapterBaseRow> getData(){

        List<AdapterBaseRow> adapterBaseRows = new ArrayList<>();

        //Update indexes
        updateHeaderIndex(0);

        //Header
        adapterBaseRows.add(new AdapterRowHeader(new User("Anderson Silva"), sectionManager, sectionFirstPosition, id));

        //items
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picturea_1), sectionManager, sectionFirstPosition, id, 0));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), sectionManager, sectionFirstPosition, id, 0));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_4), sectionManager, sectionFirstPosition, id, 0));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_5), sectionManager, sectionFirstPosition, id, 0));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_2), sectionManager, sectionFirstPosition, id, 0));

        //Update indexes
        updateHeaderIndex(5); //to identify a header

        //Header
        adapterBaseRows.add(new AdapterRowHeader(new User("Josh"), sectionManager, sectionFirstPosition, id));

        //items
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), sectionManager, sectionFirstPosition, id, 5));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_5), sectionManager, sectionFirstPosition, id, 5));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_4), sectionManager, sectionFirstPosition, id, 5));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), sectionManager, sectionFirstPosition, id, 5));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_2), sectionManager, sectionFirstPosition, id, 5));

        resetHeaderIndex();

        return adapterBaseRows;
    }

    private void updateHeaderIndex(int i) {
        //UPDATE HEADER
        sectionFirstPosition = i + headerCount;
        headerCount  += 1;
        sectionManager = (sectionManager + 1) % 2;
        id++;
    }

    private void resetHeaderIndex(){
        sectionManager = -1;
        headerCount = 0;
        sectionFirstPosition = 0;
    }
}
