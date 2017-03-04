package com.aveshcher.data.dao;

import com.aveshcher.data.model.Lecture;

public interface LecturesDao {

    Lecture addLecture(Lecture lecture);

    Lecture getLecture(int id);

    void saveLecture(Lecture lecture);

}