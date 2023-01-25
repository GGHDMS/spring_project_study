package org.grade;

import java.util.List;

/**
 * 일급 컬렉션 사용
 */
public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndGrade() {
        //multipliedCreditAndGrade += course.getCredit() * course.getGradeToNumber(); //수성시 사용하는 모든곳에서 계산
        return courses.stream().mapToDouble(Course::multiplyCreditAndGrade).sum();
    }

    public int totalCredit() {
        return courses.stream().mapToInt(Course::getCredit).sum();
    }
}

