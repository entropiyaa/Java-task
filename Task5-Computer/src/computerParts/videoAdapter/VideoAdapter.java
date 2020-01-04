package computerParts.videoAdapter;

import computerParts.api.ASpareParts;
import computerParts.api.IStandard;

import java.util.ArrayList;

public class VideoAdapter extends ASpareParts {

    public VideoAdapter(ArrayList<IStandard> standard) {
        super(standard);
    }

    @Override
    public boolean checkStandard(ArrayList<IStandard> standard) {
        return false;
    }
}
