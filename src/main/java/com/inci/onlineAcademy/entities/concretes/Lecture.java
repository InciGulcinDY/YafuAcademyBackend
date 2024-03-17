package com.inci.onlineAcademy.entities.concretes;

import com.inci.onlineAcademy.entities.abstracts.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "lectures")
@AllArgsConstructor
@NoArgsConstructor
public class Lecture extends BaseEntity {

    @Column(name = "lecture_code")
    private String lectureCode;

    @Column(name = "lecture")
    private String lecture;

    @ManyToMany
    @JoinTable(
            name = "lectures_instructors",
            joinColumns = @JoinColumn(name = "lecture_id"),
            inverseJoinColumns = @JoinColumn(name = "instructor_id")
    )
    private Set<Instructor> instructors = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "category_id")
    private LectureCategory category;

    @Column(name = "homework_count_in_term")
    private short homeworkCountInTerm;

    @Column(name = "weight_of_homework")
    private short weightOfHomework;

    @Column(name = "oral_examination_count_in_term")
    private short oralExaminationCountInTerm;

    @Column(name = "weight_of_oral_examination")
    private short weightOfOralExamination;

    @Column(name = "quiz_count_in_term")
    private short quizCountInTerm;

    @Column(name = "weight_of_quiz")
    private short weightOfQuiz;

    @Column(name = "written_examination_count_in_term")
    private short writtenExaminationCountInTerm;

    @Column(name = "weight_of_written_examination")
    private short weightOfWrittenExamination;

}
