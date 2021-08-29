import java.time.LocalDate;

public class Exam {
	byte id;
	String code;
	String title;
	CategoryQuestion category;
	Question question;
	String duration;
	Account creator;
	LocalDate createDate;
	Question[] questions;
}
