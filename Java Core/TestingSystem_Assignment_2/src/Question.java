import java.time.LocalDate;

public class Question {
     byte   id;
     String content;
     CategoryQuestion category;
     TypeQuestion type;
     Account craetor;
     LocalDate createDate;
     Exam[] exams;
}
