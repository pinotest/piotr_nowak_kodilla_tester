package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> pupils = new ArrayList<>(); //listę liczb uczniów w poszczególnych klasach.

    public School(int... pupils) {
        for (int pupil : pupils)
            this.pupils.add(pupil);
    }

    public int getOverallPupilsNumber(){
        int sum = 0;
        for(int pupil: pupils){
            sum += pupil;
        }
        return sum;
    }

}
