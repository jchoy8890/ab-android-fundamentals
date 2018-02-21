package com.androidbootcamp.androidtemplate.data;

import com.androidbootcamp.androidtemplate.model.MovieEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emedinaa on 2/20/18.
 */

public class Movies {

    public static  List<MovieEntity> getMovies(){

        List<MovieEntity> movieList= new ArrayList<>();
        movieList.add(new MovieEntity("Batman",false));
        movieList.add(new MovieEntity("Tiburón",false));
        movieList.add(new MovieEntity("Harry Potter",true));
        movieList.add(new MovieEntity("LA REINA DE KATWE",false));
        movieList.add(new MovieEntity("ROBERT EL MUNECO POSEIDO",true));
        movieList.add(new MovieEntity("UNA PAREJA DISPAREJA",false));
        movieList.add(new MovieEntity("ROBERT EL MUNECO POSEIDO",true));
        movieList.add(new MovieEntity("ENEMIGO EN LA RED",true));
        movieList.add(new MovieEntity("ROBERT EL MUNECO POSEIDO",true));
        movieList.add(new MovieEntity("LA REINA DE KATWE",true));

        return movieList;
    }
}
