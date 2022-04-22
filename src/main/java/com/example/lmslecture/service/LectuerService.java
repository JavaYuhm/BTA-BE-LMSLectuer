package com.example.lmslecture.service;

import com.example.lmslecture.entity.Lecture;
import com.example.lmslecture.entity.LectureContents;

import java.util.List;

interface LectuerService {

    public List<Lecture> lectureList(Long lectureId);

    public boolean registerLecture(Lecture Lecture) throws Exception;

    public boolean uploadLectureContents(Long lectureId, LectureContents contents);

    public boolean updateTestContents(Long lectureId, LectureContents contents);

    public boolean createLecture(Long teacherId, Long lectureId, Lecture lecture);



}
