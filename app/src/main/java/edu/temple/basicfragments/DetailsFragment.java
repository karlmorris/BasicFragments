package edu.temple.basicfragments;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsFragment extends Fragment {

    public static final String dataKey = "bundle_data_key";

    public static DetailsFragment newInstance() {
        return new DetailsFragment();
    }

    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_details, container, false);

        TextView headerTextView = (TextView) v.findViewById(R.id.detailsHeadingTextView);

        if (getArguments() != null && getArguments().getString(dataKey) != null) {

            String planetName = getArguments().getString(dataKey);

            headerTextView.setText(planetName.toUpperCase());

            ImageView planetDisplay = (ImageView) v.findViewById(R.id.planetDisplay);

            final String[] planets = getResources().getStringArray(R.array.planets);

            int imageToDisplay = 0;

            if (planetName.equals(planets[0]))
                imageToDisplay = R.drawable.mercury;
            else if (planetName.equals(planets[1]))
                imageToDisplay = R.drawable.venus;
            else if (planetName.equals(planets[2]))
                imageToDisplay = R.drawable.earth;
            else if (planetName.equals(planets[3]))
                imageToDisplay = R.drawable.mars;
            else if (planetName.equals(planets[4]))
                imageToDisplay = R.drawable.jupiter;
            else if (planetName.equals(planets[5]))
                imageToDisplay = R.drawable.saturn;
            else if (planetName.equals(planets[6]))
                imageToDisplay = R.drawable.uranus;
            else if (planetName.equals(planets[7]))
                imageToDisplay = R.drawable.neptune;

            planetDisplay.setImageResource(imageToDisplay);
        }
        return v;
    }

}
