package com.aveshcher.worker;

import com.aveshcher.data.model.Lecture;
import com.aveshcher.data.dao.LecturesDao;
import org.springframework.beans.factory.annotation.Autowired;

public class LecturesWorker {
    @Autowired
    LecturesDao lecturesDao;
    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }
}