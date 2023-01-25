package org.grade;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        // (학점수*교과목 평점)의 합계
        double multipliedCreditAndGrade = courses.multiplyCreditAndGrade();
        //수강신청 총학점 수
        int totalCredit = courses.totalCredit();

        return multipliedCreditAndGrade/totalCredit;
    }
}
