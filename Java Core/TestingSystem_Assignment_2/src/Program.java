import java.time.LocalDate;
import java.util.Iterator;

public class Program {
	public static void main(String[] args) {
		// tạo các phòng ban
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Bán hàng";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Nhân sự";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Kế toán";

		// tạo các vị trí

		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Nhân viên";

		Position position2 = new Position();
		position2.id = 2;
		position2.name = "	Trưởng phòng";

		Position position3 = new Position();
		position3.id = 3;
		position3.name = "Thư kí";

		// tạo các nhân viên

		Account account1 = new Account();
		account1.id = 1;
		account1.email = "ductrinh1410@gmail.com";
		account1.username = "duc trinh";
		account1.fullname = "Trịnh Công Đức";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "huonghoang@gmail.com";
		account2.username = "hoanghuong";
		account2.fullname = "Hoàng Thu Hường";
		account2.department = department1;
		account2.position = position2;
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "haianhdang@gmail.com";
		account3.username = "dang.haianh";
		account3.fullname = "Đặng Hải Anh";
		account3.department = department2;
		account3.position = position1;
		account3.createDate = LocalDate.now();

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "cuong.dinhvan@gmail.com";
		account4.username = "cuong.dinhvan";
		account4.fullname = "Đinh Văn Cường";
		account4.department = department3;
		account4.position = position3;
		account4.createDate = LocalDate.now();

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "thuy0971848623@gmail.com";
		account5.username = "thanhthuy";
		account5.fullname = "Trịnh Thanh Thủy";
		account5.department = department2;
		account5.position = position2;
		account5.createDate = LocalDate.now();

		Account account6 = new Account();
		account6.id = 6;
		account6.email = "thutrangtran@gmail.com";
		account6.username = "thutrang";
		account6.fullname = "Trần Thu Trang";
		account6.department = null;
		account6.position = position2;
		account6.createDate = LocalDate.now();

		Account account7 = new Account();
		account7.id = 7;
		account7.email = "tueanh@gmail.com";
		account7.username = "tueanh";
		account7.fullname = "Trịnh Tuệ Anh";
		account7.department = null;
		account7.position = position3;
		account7.createDate = LocalDate.now();

		Account account8 = new Account();
		account8.id = 8;
		account8.email = "phuongtran@gmail.com";
		account8.username = "tranphuong";
		account8.fullname = "Trần Thị Phương";
		account8.department = department2;
		account8.position = position3;
		account8.createDate = LocalDate.now();

		// Tạo các group

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Nhóm đá bóng";
		group1.creator = account3;
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Nhóm chơi gofl";
		group2.creator = account2;
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Nhóm chơi cờ";
		group3.creator = account1;
		group3.createDate = LocalDate.now();

		Group[] groupsOfAccount1 = { group1, group3 };
		account1.groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { group1, group2 };
		account2.groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { group2 };
		account3.groups = groupsOfAccount3;

		Account[] accountsOfGroup1 = { account1, account4, account6, account2 };
		group1.accounts = accountsOfGroup1;

		Account[] accountsOfGroup2 = { account2, account5, account3 };
		group2.accounts = accountsOfGroup2;

		Account[] accountsOfGroup3 = { account7, account8, account1 };
		group3.accounts = accountsOfGroup3;

		// Tạo các TypeQuestion

		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = TypeName.ESSAY;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 1;
		typeQuestion2.name = TypeName.MULTIPLE_CHOICE;

		// Tạo các CategoryQuestion

		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = "NET";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = "SQL";

		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.id = 4;
		categoryQuestion4.name = "Postman";

		CategoryQuestion categoryQuestion5 = new CategoryQuestion();
		categoryQuestion5.id = 5;
		categoryQuestion5.name = "Ruby";

		// tạo các Question

		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Vì sao java lại được sử dụng nhiều";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.craetor = account1;
		question1.createDate = LocalDate.now();

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "NET là gì?";
		question2.category = categoryQuestion2;
		question2.type = typeQuestion1;
		question2.craetor = account3;
		question2.createDate = LocalDate.now();

		Question question3 = new Question();
		question3.id = 2;
		question3.content = "Vì sao SQL lại được học trước java";
		question3.category = categoryQuestion3;
		question3.type = typeQuestion1;
		question3.craetor = account1;
		question3.createDate = LocalDate.now();

		Question question4 = new Question();
		question4.id = 1;
		question4.content = "Postman là gì ? ";
		question4.category = categoryQuestion4;
		question4.type = typeQuestion1;
		question4.craetor = account1;
		question4.createDate = LocalDate.now();

		Question question5 = new Question();
		question5.id = 1;
		question5.content = "Ruby là gì ? ";
		question5.category = categoryQuestion1;
		question5.type = typeQuestion1;
		question5.craetor = account3;
		question5.createDate = LocalDate.now();

		// tạo các Answer

		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "java vừa có thể lập trình wed và lập trình mobile";
		answer1.question = question1;
		answer1.isCorect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "Net đồng nghĩa người dùng chỉ cần trả đúng phần tiền ấy mà không phải tính thêm 10% VAT hay phí dịch vụ.";
		answer2.question = question2;
		answer2.isCorect = true;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "vì phần SQL dễ hơn phần java";
		answer3.question = question3;
		answer3.isCorect = true;

		Answer answer4 = new Answer();
		answer4.id = 4;
		answer4.content = "Postman là một công cụ cho phép chúng ta thao tác với API, phổ biến nhất là REST.";
		answer4.question = question4;
		answer4.isCorect = true;

		Answer answer5 = new Answer();
		answer5.id = 5;
		answer5.content = "Ruby là một ngôn ngữ lập trình hướng đối tượng, có khả năng phản ứng";
		answer5.question = question5;
		answer5.isCorect = true;

		// tạo các Exam

		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "A01";
		exam1.title = "Đề thi môn java";
		exam1.category = categoryQuestion1;
		exam1.duration = "60 phút";
		exam1.creator = account1;
		exam1.createDate = LocalDate.now();

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "A02";
		exam2.title = "Đề thi môn NET";
		exam2.category = categoryQuestion2;
		exam2.duration = "45 phút";
		exam2.creator = account3;
		exam2.createDate = LocalDate.now();

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "A03";
		exam3.title = "Đề thi môn SQL";
		exam3.category = categoryQuestion3;
		exam3.duration = "90 phút";
		exam3.creator = account1;
		exam3.createDate = LocalDate.now();

		Exam exam4 = new Exam();
		exam4.id = 4;
		exam4.code = "A04";
		exam4.title = "Đề thi môn Postman";
		exam4.category = categoryQuestion4;
		exam4.duration = "120 phút";
		exam4.creator = account1;
		exam4.createDate = LocalDate.now();

		Exam exam5 = new Exam();
		exam5.id = 5;
		exam5.code = "A05";
		exam5.title = "Đề thi môn Ruby";
		exam5.category = categoryQuestion5;
		exam5.duration = "60 phút";
		exam5.creator = account3;
		exam5.createDate = LocalDate.now();

		Question[] questionsOfExams1 = { question1, question2 };
		exam1.questions = questionsOfExams1;

		Question[] questionsOfExams2 = { question3, question4 };
		exam2.questions = questionsOfExams2;

		Question[] questionsOfExams3 = { question1, question5 };
		exam3.questions = questionsOfExams3;

		Question[] questionsOfExams4 = { question4, question5 };
		exam4.questions = questionsOfExams4;

		Question[] questionsOfExams5 = { question1, question3, question2 };
		exam5.questions = questionsOfExams5;

		Exam[] examsOfQuestions1 = { exam1, exam3, exam5 };
		question1.exams = examsOfQuestions1;

		Exam[] examsOfQuestions2 = { exam1, exam5 };
		question2.exams = examsOfQuestions2;

		Exam[] examsOfQuestions3 = { exam1, exam5 };
		question3.exams = examsOfQuestions3;

		Exam[] examsOfQuestions4 = { exam2, exam4 };
		question4.exams = examsOfQuestions4;

		Exam[] examsOfQuestions5 = { exam3, exam4 };
		question5.exams = examsOfQuestions5;

		// Question 3: Trong file Program.java, hãy in ít nhất 1 giá trị của mỗi đối
		// tượng ra
		// 1 in thông tin phòng ban
		System.out.println(department1.id);
		System.out.println(department1.name);

		// 2 thông tin vị trí
		System.out.println(position1.id);
		System.out.println(position1.name);

		// 3 thông tin nhân viên
		System.out.println(account1.id);
		System.out.println(account1.email);
		System.out.println(account1.username);
		System.out.println(account1.fullname);
		System.out.println(account1.department.name);
		System.out.println(account1.position.name);
		System.out.println(account1.createDate);

		// 4 thông tin nhóm
		System.out.println(group1.id);
		System.out.println(group1.name);
		System.out.println(group1.accounts);
		System.out.println(group1.createDate);

		// 5 thông tin loại câu hỏi
		System.out.println(typeQuestion1.id);
		System.out.println(typeQuestion1.name);

		// 6 thông tin chủ đề câu hỏi
		System.out.println(categoryQuestion1.id);
		System.out.println(categoryQuestion1.name);

		// 7 thông tin câu hỏi
		System.out.println(question1.id);
		System.out.println(question1.content);
		System.out.println(question1.category);
		System.out.println(question1.type);
		System.out.println(question1.craetor);
		System.out.println(question1.createDate);

		// 8 thông tin câu trả lời
		System.out.println(answer1.id);
		System.out.println(answer1.content);
		System.out.println(answer1.question);
		System.out.println(answer1.isCorect);

		// 9 thông tin đề thi
		System.out.println(exam1.id);
		System.out.println(exam1.code);
		System.out.println(exam1.title);
		System.out.println(exam1.category);
		System.out.println(exam1.duration);
		System.out.println(exam1.creator);
		System.out.println(exam1.createDate);

		// Question 1:
		// Kiểm tra account thứ 2

		if (account2.department == null) {
			System.out.println("nhân viên này chưa thuộc phòng ban nào");

		} else {
			System.out.println("phòng ban của nhân viên này" + account2.department.name);

		}
	}
}